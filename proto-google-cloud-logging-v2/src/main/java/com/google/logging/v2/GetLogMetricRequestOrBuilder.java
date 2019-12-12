/*
 * Copyright 2019 Google LLC
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

package com.google.logging.v2;

public interface GetLogMetricRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.GetLogMetricRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the desired metric:
   *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   *
   * @return The metricName.
   */
  java.lang.String getMetricName();
  /**
   *
   *
   * <pre>
   * The resource name of the desired metric:
   *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   *
   * @return The bytes for metricName.
   */
  com.google.protobuf.ByteString getMetricNameBytes();
}
