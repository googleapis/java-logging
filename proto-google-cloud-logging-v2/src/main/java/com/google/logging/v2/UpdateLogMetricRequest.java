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

// Protobuf Java Version: 3.25.8
package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * The parameters to UpdateLogMetric.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.UpdateLogMetricRequest}
 */
public final class UpdateLogMetricRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.UpdateLogMetricRequest)
    UpdateLogMetricRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateLogMetricRequest.newBuilder() to construct.
  private UpdateLogMetricRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateLogMetricRequest() {
    metricName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateLogMetricRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingMetricsProto
        .internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingMetricsProto
        .internal_static_google_logging_v2_UpdateLogMetricRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.UpdateLogMetricRequest.class,
            com.google.logging.v2.UpdateLogMetricRequest.Builder.class);
  }

  private int bitField0_;
  public static final int METRIC_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object metricName_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the metric to update:
   *
   *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   *
   * The updated metric must be provided in the request and it's
   * `name` field must be the same as `[METRIC_ID]` If the metric
   * does not exist in `[PROJECT_ID]`, then a new metric is created.
   * </pre>
   *
   * <code>
   * string metric_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The metricName.
   */
  @java.lang.Override
  public java.lang.String getMetricName() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metricName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The resource name of the metric to update:
   *
   *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   *
   * The updated metric must be provided in the request and it's
   * `name` field must be the same as `[METRIC_ID]` If the metric
   * does not exist in `[PROJECT_ID]`, then a new metric is created.
   * </pre>
   *
   * <code>
   * string metric_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for metricName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetricNameBytes() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      metricName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRIC_FIELD_NUMBER = 2;
  private com.google.logging.v2.LogMetric metric_;

  /**
   *
   *
   * <pre>
   * Required. The updated metric.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the metric field is set.
   */
  @java.lang.Override
  public boolean hasMetric() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The updated metric.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The metric.
   */
  @java.lang.Override
  public com.google.logging.v2.LogMetric getMetric() {
    return metric_ == null ? com.google.logging.v2.LogMetric.getDefaultInstance() : metric_;
  }

  /**
   *
   *
   * <pre>
   * Required. The updated metric.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.logging.v2.LogMetricOrBuilder getMetricOrBuilder() {
    return metric_ == null ? com.google.logging.v2.LogMetric.getDefaultInstance() : metric_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metricName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getMetric());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metricName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetric());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.UpdateLogMetricRequest)) {
      return super.equals(obj);
    }
    com.google.logging.v2.UpdateLogMetricRequest other =
        (com.google.logging.v2.UpdateLogMetricRequest) obj;

    if (!getMetricName().equals(other.getMetricName())) return false;
    if (hasMetric() != other.hasMetric()) return false;
    if (hasMetric()) {
      if (!getMetric().equals(other.getMetric())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + METRIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMetricName().hashCode();
    if (hasMetric()) {
      hash = (37 * hash) + METRIC_FIELD_NUMBER;
      hash = (53 * hash) + getMetric().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.logging.v2.UpdateLogMetricRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * The parameters to UpdateLogMetric.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.UpdateLogMetricRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.UpdateLogMetricRequest)
      com.google.logging.v2.UpdateLogMetricRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingMetricsProto
          .internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingMetricsProto
          .internal_static_google_logging_v2_UpdateLogMetricRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.UpdateLogMetricRequest.class,
              com.google.logging.v2.UpdateLogMetricRequest.Builder.class);
    }

    // Construct using com.google.logging.v2.UpdateLogMetricRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMetricFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      metricName_ = "";
      metric_ = null;
      if (metricBuilder_ != null) {
        metricBuilder_.dispose();
        metricBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingMetricsProto
          .internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.UpdateLogMetricRequest getDefaultInstanceForType() {
      return com.google.logging.v2.UpdateLogMetricRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.UpdateLogMetricRequest build() {
      com.google.logging.v2.UpdateLogMetricRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.UpdateLogMetricRequest buildPartial() {
      com.google.logging.v2.UpdateLogMetricRequest result =
          new com.google.logging.v2.UpdateLogMetricRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.logging.v2.UpdateLogMetricRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricName_ = metricName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metric_ = metricBuilder_ == null ? metric_ : metricBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.UpdateLogMetricRequest) {
        return mergeFrom((com.google.logging.v2.UpdateLogMetricRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.UpdateLogMetricRequest other) {
      if (other == com.google.logging.v2.UpdateLogMetricRequest.getDefaultInstance()) return this;
      if (!other.getMetricName().isEmpty()) {
        metricName_ = other.metricName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMetric()) {
        mergeMetric(other.getMetric());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                metricName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getMetricFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object metricName_ = "";

    /**
     *
     *
     * <pre>
     * Required. The resource name of the metric to update:
     *
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     *
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>
     * string metric_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The metricName.
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metricName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the metric to update:
     *
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     *
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>
     * string metric_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for metricName.
     */
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the metric to update:
     *
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     *
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>
     * string metric_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The metricName to set.
     * @return This builder for chaining.
     */
    public Builder setMetricName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      metricName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the metric to update:
     *
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     *
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>
     * string metric_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetricName() {
      metricName_ = getDefaultInstance().getMetricName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the metric to update:
     *
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     *
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>
     * string metric_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for metricName to set.
     * @return This builder for chaining.
     */
    public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      metricName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.logging.v2.LogMetric metric_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.logging.v2.LogMetric,
            com.google.logging.v2.LogMetric.Builder,
            com.google.logging.v2.LogMetricOrBuilder>
        metricBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the metric field is set.
     */
    public boolean hasMetric() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The metric.
     */
    public com.google.logging.v2.LogMetric getMetric() {
      if (metricBuilder_ == null) {
        return metric_ == null ? com.google.logging.v2.LogMetric.getDefaultInstance() : metric_;
      } else {
        return metricBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetric(com.google.logging.v2.LogMetric value) {
      if (metricBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metric_ = value;
      } else {
        metricBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetric(com.google.logging.v2.LogMetric.Builder builderForValue) {
      if (metricBuilder_ == null) {
        metric_ = builderForValue.build();
      } else {
        metricBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMetric(com.google.logging.v2.LogMetric value) {
      if (metricBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && metric_ != null
            && metric_ != com.google.logging.v2.LogMetric.getDefaultInstance()) {
          getMetricBuilder().mergeFrom(value);
        } else {
          metric_ = value;
        }
      } else {
        metricBuilder_.mergeFrom(value);
      }
      if (metric_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMetric() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metric_ = null;
      if (metricBuilder_ != null) {
        metricBuilder_.dispose();
        metricBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.logging.v2.LogMetric.Builder getMetricBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetricFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.logging.v2.LogMetricOrBuilder getMetricOrBuilder() {
      if (metricBuilder_ != null) {
        return metricBuilder_.getMessageOrBuilder();
      } else {
        return metric_ == null ? com.google.logging.v2.LogMetric.getDefaultInstance() : metric_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.logging.v2.LogMetric,
            com.google.logging.v2.LogMetric.Builder,
            com.google.logging.v2.LogMetricOrBuilder>
        getMetricFieldBuilder() {
      if (metricBuilder_ == null) {
        metricBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.logging.v2.LogMetric,
                com.google.logging.v2.LogMetric.Builder,
                com.google.logging.v2.LogMetricOrBuilder>(
                getMetric(), getParentForChildren(), isClean());
        metric_ = null;
      }
      return metricBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.UpdateLogMetricRequest)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.UpdateLogMetricRequest)
  private static final com.google.logging.v2.UpdateLogMetricRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.UpdateLogMetricRequest();
  }

  public static com.google.logging.v2.UpdateLogMetricRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateLogMetricRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateLogMetricRequest>() {
        @java.lang.Override
        public UpdateLogMetricRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateLogMetricRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateLogMetricRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.UpdateLogMetricRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
