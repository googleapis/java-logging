/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.logging;

import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.cloud.logging.Logging.TailEntryOption;
import java.util.List;


public class TailLogEntriesTest {

    private static final String PROJECT = "utest-project";

    private LoggingOptions options;
    private LoggingRpcFactory rpcFactoryMock;
    private LoggingRpc loggingRpcMock;
    private Logging logging;
  
    @Before
    public void setUp() {
      rpcFactoryMock = EasyMock.createStrictMock(LoggingRpcFactory.class);
      loggingRpcMock = EasyMock.createStrictMock(LoggingRpc.class);
      EasyMock.expect(rpcFactoryMock.create(EasyMock.anyObject(LoggingOptions.class)))
          .andReturn(loggingRpcMock);
      options =
          LoggingOptions.newBuilder()
              .setProjectId(PROJECT)
              .setServiceRpcFactory(rpcFactoryMock)
              .setRetrySettings(ServiceOptions.getNoRetrySettings())
              .build();
      }
  
    @After
    public void tearDown() {
      EasyMock.verify(rpcFactoryMock, loggingRpcMock);
    }
  
    private static TailLogEntriesObserver createObserver() {
        TailLogEntriesObserver observer = new TailLogEntriesObserver() {
            public List<LogEntry> receivedEntries = new List<>();
            public Throwable lastError;

            @Override
            public void onResponse(List<LogEntry> response) {
                receivedEntries.addAll(response);
            }
            @Override
            public void onError(Throwable t) {
                lastError = t;
            }
        };
    }

    private static StreamController createStreamController() {
        return new StreamController() {
            @Override
            public void cancel() {
                // no-op
            }
  
            @Override
            public void disableAutoInboundFlowControl() {
              // no-op
            }
  
            @Override
            public void request(int count) {
              // no-op
            }
          };
    }

    @Test
    public void testTailLogEntriesObserverIsStopped() {
        TailLogEntriesObserver observer = createObserver();
        observer.onStart(createStreamController());

        observer.onComplete();
        assertTrue(observer.isFinished());

        observer = createObserver();
        observer.close();
        assertTrue(observer.isFinished());

        observer = createObserver();
        observer.setError(new Exception("test error"));
        assertTrue(observer.isFinished());
    }
  }
