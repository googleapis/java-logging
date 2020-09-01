/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.logging.it;

import com.google.cloud.MonitoredResource;
import com.google.cloud.logging.BaseSystemTest;
import com.google.cloud.logging.HttpRequest;
import com.google.cloud.logging.LogEntry;
import com.google.cloud.logging.Logging;
import com.google.cloud.logging.LoggingOptions;
import com.google.cloud.logging.Operation;
import com.google.cloud.logging.Payload;
import com.google.cloud.logging.Severity;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.logging.v2.LogName;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Iterator;

import static com.google.cloud.logging.testing.RemoteLoggingHelper.formatForTest;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ITLoggingTest extends BaseSystemTest {

  private final static String LOG_ID = formatForTest("test-write-log-entries-log");
  private final static Payload.StringPayload FIRST_PAYLOAD = Payload.StringPayload.of("stringPayload");
  private final static Payload.JsonPayload SECOND_PAYLOAD =
      Payload.JsonPayload.of(ImmutableMap.<String, Object>of("jsonKey", "jsonValue"));

  @BeforeClass
  public static void insertLogs() {
    LogEntry firstEntry =
        LogEntry.newBuilder(FIRST_PAYLOAD)
            .addLabel("key1", "value1")
            .setLogName(LOG_ID)
            .setHttpRequest(HttpRequest.newBuilder().setStatus(500).build())
            .setResource(MonitoredResource.newBuilder("global").build())
            .build();

    LogEntry secondEntry =
        LogEntry.newBuilder(SECOND_PAYLOAD)
            .addLabel("key2", "value2")
            .setLogName(LOG_ID)
            .setOperation(Operation.of("operationId", "operationProducer"))
            .setResource(MonitoredResource.newBuilder("cloudsql_database").build())
            .build();
    logging.write(ImmutableList.of(firstEntry));
    logging.write(ImmutableList.of(secondEntry));
    logging.flush();
  }

  @AfterClass
  public static void cleanUpLogs() throws InterruptedException {
    int deleteAttempts = 0;
    int allowedDeleteAttempts = 5;
    boolean deleted = false;
    while (!deleted && deleteAttempts < allowedDeleteAttempts) {
      Thread.sleep(5000);
      deleted = logging.deleteLog(LOG_ID);
      deleteAttempts++;
    }
    assertTrue(deleted);
  }

  @Test(timeout = 600_000) // Note: it can take ~10 minutes for logs to propagate!
  public void testListEntries() throws InterruptedException {
    LoggingOptions loggingOptions = logging.getOptions();
    LogName logName = LogName.ofProjectLogName(loggingOptions.getProjectId(), LOG_ID);

    // Find the log name and wait until we have at least 2 entries
    Iterator<LogEntry> iterator = waitForLogs(logName, 2);
    assertThat(iterator.hasNext()).isTrue();

    LogEntry entry = iterator.next();
    assertEquals(FIRST_PAYLOAD, entry.getPayload());
    assertEquals(LOG_ID, entry.getLogName());
    assertEquals(ImmutableMap.of("key1", "value1"), entry.getLabels());
    assertEquals("global", entry.getResource().getType());
    assertEquals(HttpRequest.newBuilder().setStatus(500).build(), entry.getHttpRequest());
    assertEquals(Severity.DEFAULT, entry.getSeverity());
    assertNull(entry.getOperation());
    assertNotNull(entry.getInsertId());
    assertNotNull(entry.getTimestamp());
    assertTrue(iterator.hasNext());

    entry = iterator.next();
    assertEquals(SECOND_PAYLOAD, entry.getPayload());
    assertEquals(LOG_ID, entry.getLogName());
    assertEquals(ImmutableMap.of("key2", "value2"), entry.getLabels());
    assertEquals("cloudsql_database", entry.getResource().getType());
    assertEquals(Operation.of("operationId", "operationProducer"), entry.getOperation());
    assertEquals(Severity.DEFAULT, entry.getSeverity());
    assertNull(entry.getHttpRequest());
    assertNotNull(entry.getInsertId());
    assertNotNull(entry.getTimestamp());
  }

  @Test(timeout = 600_000) // Note: it can take ~10 minutes for logs to propagate!
  public void testSortedOrder() throws InterruptedException {
    LoggingOptions loggingOptions = logging.getOptions();
    LogName logName = LogName.ofProjectLogName(loggingOptions.getProjectId(), LOG_ID);

    String filter = createEqualityFilter("logName", logName) + " AND " + createTimestampFilter(1);
    Logging.EntryListOption[] options =
        new Logging.EntryListOption[] {
            Logging.EntryListOption.filter(filter),
            Logging.EntryListOption.sortOrder(Logging.SortingField.TIMESTAMP, Logging.SortingOrder.DESCENDING)
        };
    Iterator<LogEntry> iterator = waitForLogs(options, 2);

    Long lastTimestamp = iterator.next().getTimestamp();
    while (iterator.hasNext()) {
      assertTrue(iterator.next().getTimestamp() <= lastTimestamp);
    }
  }

  @Test
  public void testDeleteNonExistingLog() {
    String logId = formatForTest("test-delete-non-existing-log");
    assertFalse(logging.deleteLog(logId));
  }
}
