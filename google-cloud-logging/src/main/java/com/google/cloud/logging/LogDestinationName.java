/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.logging;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import com.google.logging.v2.LogName;
import java.util.Map;

/**
 * Class for specifying resource name of the log to which this log entry belongs (see 'logName'
 * parameter in https://cloud.google.com/logging/docs/reference/v2/rest/v2/LogEntry)
 */
public final class LogDestinationName extends Option {

  enum DestinationType implements Option.OptionType {
    PROJECT,
    FOLDER,
    ORGANIZATION,
    BILLINGACCOUNT;

    @SuppressWarnings("unchecked")
    <T> T get(Map<Option.OptionType, ?> options) {
      return (T) options.get(this);
    }
  }

  private LogDestinationName(Option.OptionType option, Object value) {
    super(option, value);
    checkArgument(!checkNotNull(value).toString().trim().isEmpty());
  }

  /**
   * Returns an option which sets and validates project ID resource name for log entries.
   *
   * @param id corresponds to PROJECT_ID token in 'logName' field described in
   *     https://cloud.google.com/logging/docs/reference/v2/rest/v2/LogEntry
   */
  public static LogDestinationName project(String id) {
    return new LogDestinationName(DestinationType.PROJECT, id);
  }

  /**
   * Returns an option which sets and validates project ID resource name for log entries.
   *
   * @param id corresponds to FOLDER_ID token in 'logName' field described in
   *     https://cloud.google.com/logging/docs/reference/v2/rest/v2/LogEntry
   */
  public static LogDestinationName folder(String id) {
    return new LogDestinationName(DestinationType.FOLDER, id);
  }

  /**
   * Returns an option which sets and validates project ID resource name for log entries.
   *
   * @param id corresponds to ORGANIZATION_ID token in 'logName' field described in
   *     https://cloud.google.com/logging/docs/reference/v2/rest/v2/LogEntry
   */
  public static LogDestinationName organization(String id) {
    return new LogDestinationName(DestinationType.ORGANIZATION, id);
  }

  /**
   * Returns an option which sets and validates project ID resource name for log entries.
   *
   * @param id corresponds to BILLING_ACCOUNT_ID token in 'logName' field described in
   *     https://cloud.google.com/logging/docs/reference/v2/rest/v2/LogEntry
   */
  public static LogDestinationName billingAccount(String id) {
    return new LogDestinationName(DestinationType.BILLINGACCOUNT, id);
  }

  /** Creates a {@code LogEntry} object from given log ID and the destination resource. */
  public static LogName toLogName(String logId, LogDestinationName destination) {
    if (logId == null || destination == null) {
      return null;
    }

    if (DestinationType.PROJECT == destination.getOptionType()) {
      return LogName.ofProjectLogName(destination.getValue().toString(), logId);
    } else if (DestinationType.FOLDER == destination.getOptionType()) {
      return LogName.ofFolderLogName(destination.getValue().toString(), logId);
    } else if (DestinationType.ORGANIZATION == destination.getOptionType()) {
      return LogName.ofOrganizationLogName(destination.getValue().toString(), logId);
    } else if (DestinationType.BILLINGACCOUNT == destination.getOptionType()) {
      return LogName.ofBillingAccountLogName(destination.getValue().toString(), logId);
    }

    return null;
  }

  /** Creates a {@code LogDestinationName} object given from given {@code LogName}. */
  public static LogDestinationName fromLogName(LogName logName) {
    if (logName == null) {
      return null;
    }

    if (logName.getProject() != null) {
      return project(logName.getProject());
    } else if (logName.getBillingAccount() != null) {
      return billingAccount(logName.getBillingAccount());
    } else if (logName.getFolder() != null) {
      return folder(logName.getFolder());
    } else if (logName.getOrganization() != null) {
      return organization(logName.getOrganization());
    }

    return null;
  }
}
