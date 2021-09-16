/*
 * Copyright 2021 Google LLC
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

import static com.google.cloud.logging.testing.RemoteLoggingHelper.formatForTest;
import static org.junit.Assert.assertTrue;

import com.google.cloud.logging.Logging.TailOption;
import com.google.cloud.MonitoredResource;
import com.google.cloud.logging.*;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.Test;

public class ITTailLogsTest extends BaseSystemTest {

    private static final String LOG_ID = formatForTest("test-tail-log-entries-log");
    private static final MonitoredResource GLOBAL_RESOURCE = MonitoredResource.newBuilder("global").build();
    private static Logging auxLogging;

    // @BeforeClass
    // public static void configureWriteLogs() {
    // }

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

    @Test(timeout = 120_000) // Note: the test should not take longer than 2 min
    public void testTailLogEntries() throws InterruptedException {
        LogEntry[] logEntriesSet = {
                LogEntry.newBuilder(Payload.StringPayload.of("stringPayload1")).addLabel("key1", "value1")
                        .setLogName(LOG_ID).setHttpRequest(HttpRequest.newBuilder().setStatus(200).build())
                        .setResource(GLOBAL_RESOURCE).build(),
                LogEntry.newBuilder(Payload.JsonPayload.of(ImmutableMap.<String, Object>of("message", "jsonPayload1")))
                        .addLabel("key2", "value2").setLogName(LOG_ID)
                        .setHttpRequest(HttpRequest.newBuilder().setStatus(200).build()).setResource(GLOBAL_RESOURCE)
                        .build(),
                LogEntry.newBuilder(Payload.StringPayload.of("stringPayload2")).addLabel("key1", "value3")
                        .setLogName(LOG_ID).setHttpRequest(HttpRequest.newBuilder().setStatus(500).build())
                        .setResource(GLOBAL_RESOURCE).build(),
                LogEntry.newBuilder(Payload.JsonPayload.of(ImmutableMap.<String, Object>of("message", "jsonPayload2")))
                        .addLabel("key1", "value4").setLogName(LOG_ID)
                        .setHttpRequest(HttpRequest.newBuilder().setStatus(500).build()).setResource(GLOBAL_RESOURCE)
                        .build(), };

        String filter = "logName=projects/\\\"" + logging.getOptions().getProjectId() + "/logs/" + LOG_ID + "\\\"";
        LogEntryServerStream stream = logging.tailLogEntries(TailOption.filter(filter));

        logging.write(ImmutableList.copyOf(logEntriesSet));

        final ArrayList<LogEntry> receivedEntries = new ArrayList<>();
        for (LogEntry log : stream) {
            System.out.println("received entry");
            receivedEntries.add(log);
            if (receivedEntries.size() >= 4) {
                break;
            }
        }
        stream.cancel();
        assertTrue(receivedEntries.containsAll(ImmutableList.copyOf(logEntriesSet)));
    }
}