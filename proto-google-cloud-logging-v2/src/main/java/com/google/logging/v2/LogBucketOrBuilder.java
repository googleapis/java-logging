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
// source: google/logging/v2/logging_config.proto

// Protobuf Java Version: 3.25.8
package com.google.logging.v2;

public interface LogBucketOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogBucket)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the bucket.
   *
   * For example:
   *
   *   `projects/my-project/locations/global/buckets/my-bucket`
   *
   * For a list of supported locations, see [Supported
   * Regions](https://cloud.google.com/logging/docs/region-support)
   *
   * For the location of `global` it is unspecified where log entries are
   * actually stored.
   *
   * After a bucket has been created, the location cannot be changed.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the bucket.
   *
   * For example:
   *
   *   `projects/my-project/locations/global/buckets/my-bucket`
   *
   * For a list of supported locations, see [Supported
   * Regions](https://cloud.google.com/logging/docs/region-support)
   *
   * For the location of `global` it is unspecified where log entries are
   * actually stored.
   *
   * After a bucket has been created, the location cannot be changed.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Describes this bucket.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Describes this bucket.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the bucket. This is not set for any
   * of the default buckets.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the bucket. This is not set for any
   * of the default buckets.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the bucket. This is not set for any
   * of the default buckets.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the bucket.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the bucket.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the bucket.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Logs will be retained by default for this amount of time, after which they
   * will automatically be deleted. The minimum retention period is 1 day. If
   * this value is set to zero at bucket creation time, the default time of 30
   * days will be used.
   * </pre>
   *
   * <code>int32 retention_days = 11;</code>
   *
   * @return The retentionDays.
   */
  int getRetentionDays();

  /**
   *
   *
   * <pre>
   * Whether the bucket is locked.
   *
   * The retention period on a locked bucket cannot be changed. Locked buckets
   * may only be deleted if they are empty.
   * </pre>
   *
   * <code>bool locked = 9;</code>
   *
   * @return The locked.
   */
  boolean getLocked();

  /**
   *
   *
   * <pre>
   * Output only. The bucket lifecycle state.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LifecycleState lifecycle_state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for lifecycleState.
   */
  int getLifecycleStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The bucket lifecycle state.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LifecycleState lifecycle_state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lifecycleState.
   */
  com.google.logging.v2.LifecycleState getLifecycleState();

  /**
   *
   *
   * <pre>
   * Whether log analytics is enabled for this bucket.
   *
   * Once enabled, log analytics features cannot be disabled.
   * </pre>
   *
   * <code>bool analytics_enabled = 14;</code>
   *
   * @return The analyticsEnabled.
   */
  boolean getAnalyticsEnabled();

  /**
   *
   *
   * <pre>
   * Log entry field paths that are denied access in this bucket.
   *
   * The following fields and their children are eligible: `textPayload`,
   * `jsonPayload`, `protoPayload`, `httpRequest`, `labels`, `sourceLocation`.
   *
   * Restricting a repeated field will restrict all values. Adding a parent will
   * block all child fields. (e.g. `foo.bar` will block `foo.bar.baz`)
   * </pre>
   *
   * <code>repeated string restricted_fields = 15;</code>
   *
   * @return A list containing the restrictedFields.
   */
  java.util.List<java.lang.String> getRestrictedFieldsList();

  /**
   *
   *
   * <pre>
   * Log entry field paths that are denied access in this bucket.
   *
   * The following fields and their children are eligible: `textPayload`,
   * `jsonPayload`, `protoPayload`, `httpRequest`, `labels`, `sourceLocation`.
   *
   * Restricting a repeated field will restrict all values. Adding a parent will
   * block all child fields. (e.g. `foo.bar` will block `foo.bar.baz`)
   * </pre>
   *
   * <code>repeated string restricted_fields = 15;</code>
   *
   * @return The count of restrictedFields.
   */
  int getRestrictedFieldsCount();

  /**
   *
   *
   * <pre>
   * Log entry field paths that are denied access in this bucket.
   *
   * The following fields and their children are eligible: `textPayload`,
   * `jsonPayload`, `protoPayload`, `httpRequest`, `labels`, `sourceLocation`.
   *
   * Restricting a repeated field will restrict all values. Adding a parent will
   * block all child fields. (e.g. `foo.bar` will block `foo.bar.baz`)
   * </pre>
   *
   * <code>repeated string restricted_fields = 15;</code>
   *
   * @param index The index of the element to return.
   * @return The restrictedFields at the given index.
   */
  java.lang.String getRestrictedFields(int index);

  /**
   *
   *
   * <pre>
   * Log entry field paths that are denied access in this bucket.
   *
   * The following fields and their children are eligible: `textPayload`,
   * `jsonPayload`, `protoPayload`, `httpRequest`, `labels`, `sourceLocation`.
   *
   * Restricting a repeated field will restrict all values. Adding a parent will
   * block all child fields. (e.g. `foo.bar` will block `foo.bar.baz`)
   * </pre>
   *
   * <code>repeated string restricted_fields = 15;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the restrictedFields at the given index.
   */
  com.google.protobuf.ByteString getRestrictedFieldsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of indexed fields and related configuration data.
   * </pre>
   *
   * <code>repeated .google.logging.v2.IndexConfig index_configs = 17;</code>
   */
  java.util.List<com.google.logging.v2.IndexConfig> getIndexConfigsList();

  /**
   *
   *
   * <pre>
   * A list of indexed fields and related configuration data.
   * </pre>
   *
   * <code>repeated .google.logging.v2.IndexConfig index_configs = 17;</code>
   */
  com.google.logging.v2.IndexConfig getIndexConfigs(int index);

  /**
   *
   *
   * <pre>
   * A list of indexed fields and related configuration data.
   * </pre>
   *
   * <code>repeated .google.logging.v2.IndexConfig index_configs = 17;</code>
   */
  int getIndexConfigsCount();

  /**
   *
   *
   * <pre>
   * A list of indexed fields and related configuration data.
   * </pre>
   *
   * <code>repeated .google.logging.v2.IndexConfig index_configs = 17;</code>
   */
  java.util.List<? extends com.google.logging.v2.IndexConfigOrBuilder>
      getIndexConfigsOrBuilderList();

  /**
   *
   *
   * <pre>
   * A list of indexed fields and related configuration data.
   * </pre>
   *
   * <code>repeated .google.logging.v2.IndexConfig index_configs = 17;</code>
   */
  com.google.logging.v2.IndexConfigOrBuilder getIndexConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The CMEK settings of the log bucket. If present, new log entries written to
   * this log bucket are encrypted using the CMEK key provided in this
   * configuration. If a log bucket has CMEK settings, the CMEK settings cannot
   * be disabled later by updating the log bucket. Changing the KMS key is
   * allowed.
   * </pre>
   *
   * <code>.google.logging.v2.CmekSettings cmek_settings = 19;</code>
   *
   * @return Whether the cmekSettings field is set.
   */
  boolean hasCmekSettings();

  /**
   *
   *
   * <pre>
   * The CMEK settings of the log bucket. If present, new log entries written to
   * this log bucket are encrypted using the CMEK key provided in this
   * configuration. If a log bucket has CMEK settings, the CMEK settings cannot
   * be disabled later by updating the log bucket. Changing the KMS key is
   * allowed.
   * </pre>
   *
   * <code>.google.logging.v2.CmekSettings cmek_settings = 19;</code>
   *
   * @return The cmekSettings.
   */
  com.google.logging.v2.CmekSettings getCmekSettings();

  /**
   *
   *
   * <pre>
   * The CMEK settings of the log bucket. If present, new log entries written to
   * this log bucket are encrypted using the CMEK key provided in this
   * configuration. If a log bucket has CMEK settings, the CMEK settings cannot
   * be disabled later by updating the log bucket. Changing the KMS key is
   * allowed.
   * </pre>
   *
   * <code>.google.logging.v2.CmekSettings cmek_settings = 19;</code>
   */
  com.google.logging.v2.CmekSettingsOrBuilder getCmekSettingsOrBuilder();
}
