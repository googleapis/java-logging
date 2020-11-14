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

public interface CreateViewRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.CreateViewRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The bucket in which to create the view
   *     "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
   * Example:
   * `"projects/my-logging-project/locations/my-location/buckets/my-bucket"`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The bucket in which to create the view
   *     "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
   * Example:
   * `"projects/my-logging-project/locations/my-location/buckets/my-bucket"`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The id to use for this view.
   * </pre>
   *
   * <code>string view_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The viewId.
   */
  java.lang.String getViewId();
  /**
   *
   *
   * <pre>
   * Required. The id to use for this view.
   * </pre>
   *
   * <code>string view_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for viewId.
   */
  com.google.protobuf.ByteString getViewIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The new view.
   * </pre>
   *
   * <code>.google.logging.v2.LogView view = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the view field is set.
   */
  boolean hasView();
  /**
   *
   *
   * <pre>
   * Required. The new view.
   * </pre>
   *
   * <code>.google.logging.v2.LogView view = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The view.
   */
  com.google.logging.v2.LogView getView();
  /**
   *
   *
   * <pre>
   * Required. The new view.
   * </pre>
   *
   * <code>.google.logging.v2.LogView view = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.logging.v2.LogViewOrBuilder getViewOrBuilder();
}
