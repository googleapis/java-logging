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
// source: google/logging/v2/log_entry.proto

package com.google.logging.v2;

public interface LogEntrySourceLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogEntrySourceLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Source file name. Depending on the runtime environment, this
   * might be a simple name or a fully-qualified name.
   * </pre>
   *
   * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The file.
   */
  java.lang.String getFile();
  /**
   *
   *
   * <pre>
   * Optional. Source file name. Depending on the runtime environment, this
   * might be a simple name or a fully-qualified name.
   * </pre>
   *
   * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for file.
   */
  com.google.protobuf.ByteString getFileBytes();

  /**
   *
   *
   * <pre>
   * Optional. Line within the source file. 1-based; 0 indicates no line number
   * available.
   * </pre>
   *
   * <code>int64 line = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The line.
   */
  long getLine();

  /**
   *
   *
   * <pre>
   * Optional. Human-readable name of the function or method being invoked, with
   * optional context such as the class or package name. This information may be
   * used in contexts such as the logs viewer, where a file and line number are
   * less meaningful. The format can vary by language. For example:
   * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
   * (Python).
   * </pre>
   *
   * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The function.
   */
  java.lang.String getFunction();
  /**
   *
   *
   * <pre>
   * Optional. Human-readable name of the function or method being invoked, with
   * optional context such as the class or package name. This information may be
   * used in contexts such as the logs viewer, where a file and line number are
   * less meaningful. The format can vary by language. For example:
   * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
   * (Python).
   * </pre>
   *
   * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for function.
   */
  com.google.protobuf.ByteString getFunctionBytes();
}
