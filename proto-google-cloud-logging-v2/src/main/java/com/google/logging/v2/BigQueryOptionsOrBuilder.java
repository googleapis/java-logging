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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface BigQueryOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.BigQueryOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Whether to use [BigQuery's partition
   * tables](https://cloud.google.com/bigquery/docs/partitioned-tables). By
   * default, Cloud Logging creates dated tables based on the log entries'
   * timestamps, e.g. syslog_20170523. With partitioned tables the date suffix
   * is no longer present and [special query
   * syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
   * has to be used instead. In both cases, tables are sharded based on UTC
   * timezone.
   * </pre>
   *
   * <code>bool use_partitioned_tables = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The usePartitionedTables.
   */
  boolean getUsePartitionedTables();

  /**
   *
   *
   * <pre>
   * Output only. True if new timestamp column based partitioning is in use, false if legacy
   * ingestion-time partitioning is in use.
   * All new sinks will have this field set true and will use timestamp column
   * based partitioning. If use_partitioned_tables is false, this value has no
   * meaning and will be false. Legacy sinks using partitioned tables will have
   * this field set to false.
   * </pre>
   *
   * <code>bool uses_timestamp_column_partitioning = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The usesTimestampColumnPartitioning.
   */
  boolean getUsesTimestampColumnPartitioning();
}
