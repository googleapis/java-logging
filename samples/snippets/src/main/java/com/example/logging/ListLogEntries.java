/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.logging;

// [START logging_list_log_entries]
import com.google.api.gax.paging.Page;
import com.google.cloud.logging.LogEntry;
import com.google.cloud.logging.Logging;
import com.google.cloud.logging.Logging.EntryListOption;
import com.google.cloud.logging.LoggingOptions;

public class ListLogEntries {

  public static void main(String[] args) throws Exception {
    // TODO(developer): Replace the variable value with valid log name before running the sample
    // or provide it as an argument.
    String logName = args.length > 0 ? args[0] : "test-log";

    LoggingOptions options = LoggingOptions.getDefaultInstance();
    Logging logging = options.getService();

    String logFilter = "logName=projects/" + options.getProjectId() + "/logs/" + logName;

    // List all log entries
    Page<LogEntry> entries = logging.listLogEntries(EntryListOption.filter(logFilter));
    while (entries != null) {
      for (LogEntry logEntry : entries.iterateAll()) {
        System.out.println(logEntry);
      }
      entries = entries.getNextPage();
    }
  }
}
// [END logging_list_log_entries]
