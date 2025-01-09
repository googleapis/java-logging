/*
 * Copyright 2025 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_metrics.proto

// Protobuf Java Version: 3.25.5
package com.google.logging.v2;

public interface ListLogMetricsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListLogMetricsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  java.util.List<com.google.logging.v2.LogMetric> getMetricsList();
  /**
   *
   *
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  com.google.logging.v2.LogMetric getMetrics(int index);
  /**
   *
   *
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  java.util.List<? extends com.google.logging.v2.LogMetricOrBuilder> getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  com.google.logging.v2.LogMetricOrBuilder getMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
