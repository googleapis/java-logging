/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Stackdriver Logging API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>===================== ConfigServiceV2Client =====================
 *
 * <p>Service Description: Service for configuring sinks used to route log entries.
 *
 * <p>Sample for ConfigServiceV2Client:
 *
 * <pre>
 * <code>
 * try (ConfigServiceV2Client configServiceV2Client = ConfigServiceV2Client.create()) {
 *   LogSinkName sinkName = LogSinkName.ofProjectSinkName("[PROJECT]", "[SINK]");
 *   LogSink response = configServiceV2Client.getSink(sinkName);
 * }
 * </code>
 * </pre>
 *
 * ====================== LoggingServiceV2Client ======================
 *
 * <p>Service Description: Service for ingesting and querying logs.
 *
 * <p>Sample for LoggingServiceV2Client:
 *
 * <pre>
 * <code>
 * try (LoggingServiceV2Client loggingServiceV2Client = LoggingServiceV2Client.create()) {
 *   LogName logName = LogName.ofProjectLogName("[PROJECT]", "[LOG]");
 *   MonitoredResource resource = MonitoredResource.newBuilder().build();
 *   Map&lt;String, String&gt; labels = new HashMap&lt;&gt;();
 *   List&lt;LogEntry&gt; entries = new ArrayList&lt;&gt;();
 *   WriteLogEntriesResponse response = loggingServiceV2Client.writeLogEntries(logName, resource, labels, entries);
 * }
 * </code>
 * </pre>
 *
 * ====================== MetricsServiceV2Client ======================
 *
 * <p>Service Description: Service for configuring logs-based metrics.
 *
 * <p>Sample for MetricsServiceV2Client:
 *
 * <pre>
 * <code>
 * try (MetricsServiceV2Client metricsServiceV2Client = MetricsServiceV2Client.create()) {
 *   LogMetricName metricName = LogMetricName.of("[PROJECT]", "[METRIC]");
 *   LogMetric response = metricsServiceV2Client.getLogMetric(metricName);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.logging.v2;

import javax.annotation.Generated;
