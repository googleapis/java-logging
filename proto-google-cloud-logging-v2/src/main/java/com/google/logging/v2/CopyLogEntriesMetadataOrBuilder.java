/*
 * Copyright 2024 Google LLC
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

// Protobuf Java Version: 3.25.3
package com.google.logging.v2;

public interface CopyLogEntriesMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.CopyLogEntriesMetadata)
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
   * Identifies whether the user has requested cancellation of the operation.
   * </pre>
   *
   * <code>bool cancellation_requested = 4;</code>
   *
   * @return The cancellationRequested.
   */
  boolean getCancellationRequested();

  /**
   *
   *
   * <pre>
   * CopyLogEntries RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CopyLogEntriesRequest request = 5;</code>
   *
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   *
   *
   * <pre>
   * CopyLogEntries RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CopyLogEntriesRequest request = 5;</code>
   *
   * @return The request.
   */
  com.google.logging.v2.CopyLogEntriesRequest getRequest();
  /**
   *
   *
   * <pre>
   * CopyLogEntries RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CopyLogEntriesRequest request = 5;</code>
   */
  com.google.logging.v2.CopyLogEntriesRequestOrBuilder getRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * Estimated progress of the operation (0 - 100%).
   * </pre>
   *
   * <code>int32 progress = 6;</code>
   *
   * @return The progress.
   */
  int getProgress();

  /**
   *
   *
   * <pre>
   * The IAM identity of a service account that must be granted access to the
   * destination.
   *
   * If the service account is not granted permission to the destination within
   * an hour, the operation will be cancelled.
   *
   * For example: `"serviceAccount:foo&#64;bar.com"`
   * </pre>
   *
   * <code>string writer_identity = 7;</code>
   *
   * @return The writerIdentity.
   */
  java.lang.String getWriterIdentity();
  /**
   *
   *
   * <pre>
   * The IAM identity of a service account that must be granted access to the
   * destination.
   *
   * If the service account is not granted permission to the destination within
   * an hour, the operation will be cancelled.
   *
   * For example: `"serviceAccount:foo&#64;bar.com"`
   * </pre>
   *
   * <code>string writer_identity = 7;</code>
   *
   * @return The bytes for writerIdentity.
   */
  com.google.protobuf.ByteString getWriterIdentityBytes();
}
