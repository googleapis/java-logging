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

public interface GetCmekSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.GetCmekSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource for which to retrieve CMEK settings.
   *     "projects/[PROJECT_ID]/cmekSettings"
   *     "organizations/[ORGANIZATION_ID]/cmekSettings"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings"
   *     "folders/[FOLDER_ID]/cmekSettings"
   * For example:
   *   `"organizations/12345/cmekSettings"`
   * Note: CMEK for the Log Router can be configured for Google Cloud projects,
   * folders, organizations and billing accounts. Once configured for an
   * organization, it applies to all projects and folders in the Google Cloud
   * organization.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource for which to retrieve CMEK settings.
   *     "projects/[PROJECT_ID]/cmekSettings"
   *     "organizations/[ORGANIZATION_ID]/cmekSettings"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings"
   *     "folders/[FOLDER_ID]/cmekSettings"
   * For example:
   *   `"organizations/12345/cmekSettings"`
   * Note: CMEK for the Log Router can be configured for Google Cloud projects,
   * folders, organizations and billing accounts. Once configured for an
   * organization, it applies to all projects and folders in the Google Cloud
   * organization.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
