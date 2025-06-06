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

public interface BucketMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.BucketMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The create time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * The create time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * The create time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The end time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * The end time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * The end time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * State of an operation.
   * </pre>
   *
   * <code>.google.logging.v2.OperationState state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * State of an operation.
   * </pre>
   *
   * <code>.google.logging.v2.OperationState state = 3;</code>
   *
   * @return The state.
   */
  com.google.logging.v2.OperationState getState();

  /**
   *
   *
   * <pre>
   * LongRunningCreateBucket RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CreateBucketRequest create_bucket_request = 4;</code>
   *
   * @return Whether the createBucketRequest field is set.
   */
  boolean hasCreateBucketRequest();

  /**
   *
   *
   * <pre>
   * LongRunningCreateBucket RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CreateBucketRequest create_bucket_request = 4;</code>
   *
   * @return The createBucketRequest.
   */
  com.google.logging.v2.CreateBucketRequest getCreateBucketRequest();

  /**
   *
   *
   * <pre>
   * LongRunningCreateBucket RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CreateBucketRequest create_bucket_request = 4;</code>
   */
  com.google.logging.v2.CreateBucketRequestOrBuilder getCreateBucketRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * LongRunningUpdateBucket RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.UpdateBucketRequest update_bucket_request = 5;</code>
   *
   * @return Whether the updateBucketRequest field is set.
   */
  boolean hasUpdateBucketRequest();

  /**
   *
   *
   * <pre>
   * LongRunningUpdateBucket RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.UpdateBucketRequest update_bucket_request = 5;</code>
   *
   * @return The updateBucketRequest.
   */
  com.google.logging.v2.UpdateBucketRequest getUpdateBucketRequest();

  /**
   *
   *
   * <pre>
   * LongRunningUpdateBucket RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.UpdateBucketRequest update_bucket_request = 5;</code>
   */
  com.google.logging.v2.UpdateBucketRequestOrBuilder getUpdateBucketRequestOrBuilder();

  com.google.logging.v2.BucketMetadata.RequestCase getRequestCase();
}
