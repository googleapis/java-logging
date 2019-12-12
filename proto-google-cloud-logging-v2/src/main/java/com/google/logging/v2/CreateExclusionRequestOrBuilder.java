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
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface CreateExclusionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.CreateExclusionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource in which to create the exclusion:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource in which to create the exclusion:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The new exclusion, whose `name` parameter is an exclusion name
   * that is not already used in the parent resource.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
   *
   * @return Whether the exclusion field is set.
   */
  boolean hasExclusion();
  /**
   *
   *
   * <pre>
   * Required. The new exclusion, whose `name` parameter is an exclusion name
   * that is not already used in the parent resource.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
   *
   * @return The exclusion.
   */
  com.google.logging.v2.LogExclusion getExclusion();
  /**
   *
   *
   * <pre>
   * Required. The new exclusion, whose `name` parameter is an exclusion name
   * that is not already used in the parent resource.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2;</code>
   */
  com.google.logging.v2.LogExclusionOrBuilder getExclusionOrBuilder();
}
