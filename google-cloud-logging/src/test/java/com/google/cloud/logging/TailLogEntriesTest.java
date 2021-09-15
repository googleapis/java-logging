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

import static com.google.cloud.logging.Logging.TailOption;
import static com.google.common.truth.Truth.assertThat;

import com.google.logging.v2.TailLogEntriesRequest;
import com.google.protobuf.Duration;

import org.junit.Test;

public class TailLogEntriesTest {
  private static final String WINDOW = "20s";
  private static final Duration WINDOW_DURATION = Duration.newBuilder().setSeconds(20).build();
  private static final String FILTER = "severity<INFO";
  private static final String PROJECT_ID = "test-project-id";
  private static final String DEFAULT_PROJECT_ID = "test-default-project-id";
  private static final String BILLING_ACCOUNT_ID = "test-billing-acc-number";
  private static final String FOLDER_ID = "test-folder-id";
  private static final String ORG_ID = "test-org-id";

  @Test
  public void testTailOptions() {
    TailLogEntriesRequest request = LoggingImpl.tailLogEntriesRequest(LoggingImpl.optionMap(TailOption.filter(FILTER),
        TailOption.bufferWindow(WINDOW), TailOption.project(PROJECT_ID), TailOption.billingAccount(BILLING_ACCOUNT_ID),
        TailOption.folder(FOLDER_ID), TailOption.organization(ORG_ID)), DEFAULT_PROJECT_ID);

    assertThat(request.getFilter()).isEqualTo(FILTER);
    assertThat(request.getBufferWindow()).isEqualTo(WINDOW_DURATION);
    assertThat(request.getResourceNamesList()).containsExactly("projects/" + PROJECT_ID, "organizations/" + ORG_ID,
        "billingAccounts/" + BILLING_ACCOUNT_ID, "folders/" + FOLDER_ID);
  }

  @Test
  public void testEmptyTailOptions() {
    TailLogEntriesRequest request = LoggingImpl.tailLogEntriesRequest(LoggingImpl.optionMap(), DEFAULT_PROJECT_ID);
    assertThat(request.getFilter()).isEqualTo("");
    assertThat(request.getBufferWindow()).isEqualTo(Duration.newBuilder().build());
    assertThat(request.getResourceNamesList()).containsExactly("projects/" + DEFAULT_PROJECT_ID);
  }
}
