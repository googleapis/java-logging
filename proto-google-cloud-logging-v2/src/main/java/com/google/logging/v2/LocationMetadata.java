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

// Protobuf Java Version: 3.25.5
package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * Cloud Logging specific location metadata.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.LocationMetadata}
 */
public final class LocationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.LocationMetadata)
    LocationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LocationMetadata.newBuilder() to construct.
  private LocationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LocationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_LocationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_LocationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.LocationMetadata.class,
            com.google.logging.v2.LocationMetadata.Builder.class);
  }

  public static final int LOG_ANALYTICS_ENABLED_FIELD_NUMBER = 1;
  private boolean logAnalyticsEnabled_ = false;
  /**
   *
   *
   * <pre>
   * Indicates whether or not Log Analytics features are supported in the given
   * location.
   * </pre>
   *
   * <code>bool log_analytics_enabled = 1;</code>
   *
   * @return The logAnalyticsEnabled.
   */
  @java.lang.Override
  public boolean getLogAnalyticsEnabled() {
    return logAnalyticsEnabled_;
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
    if (logAnalyticsEnabled_ != false) {
      output.writeBool(1, logAnalyticsEnabled_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logAnalyticsEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, logAnalyticsEnabled_);
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
    if (!(obj instanceof com.google.logging.v2.LocationMetadata)) {
      return super.equals(obj);
    }
    com.google.logging.v2.LocationMetadata other = (com.google.logging.v2.LocationMetadata) obj;

    if (getLogAnalyticsEnabled() != other.getLogAnalyticsEnabled()) return false;
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
    hash = (37 * hash) + LOG_ANALYTICS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getLogAnalyticsEnabled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.LocationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LocationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.logging.v2.LocationMetadata prototype) {
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
   * Cloud Logging specific location metadata.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.LocationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.LocationMetadata)
      com.google.logging.v2.LocationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_LocationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_LocationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.LocationMetadata.class,
              com.google.logging.v2.LocationMetadata.Builder.class);
    }

    // Construct using com.google.logging.v2.LocationMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      logAnalyticsEnabled_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_LocationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.LocationMetadata getDefaultInstanceForType() {
      return com.google.logging.v2.LocationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.LocationMetadata build() {
      com.google.logging.v2.LocationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.LocationMetadata buildPartial() {
      com.google.logging.v2.LocationMetadata result =
          new com.google.logging.v2.LocationMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.logging.v2.LocationMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.logAnalyticsEnabled_ = logAnalyticsEnabled_;
      }
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
      if (other instanceof com.google.logging.v2.LocationMetadata) {
        return mergeFrom((com.google.logging.v2.LocationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.LocationMetadata other) {
      if (other == com.google.logging.v2.LocationMetadata.getDefaultInstance()) return this;
      if (other.getLogAnalyticsEnabled() != false) {
        setLogAnalyticsEnabled(other.getLogAnalyticsEnabled());
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
            case 8:
              {
                logAnalyticsEnabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private boolean logAnalyticsEnabled_;
    /**
     *
     *
     * <pre>
     * Indicates whether or not Log Analytics features are supported in the given
     * location.
     * </pre>
     *
     * <code>bool log_analytics_enabled = 1;</code>
     *
     * @return The logAnalyticsEnabled.
     */
    @java.lang.Override
    public boolean getLogAnalyticsEnabled() {
      return logAnalyticsEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether or not Log Analytics features are supported in the given
     * location.
     * </pre>
     *
     * <code>bool log_analytics_enabled = 1;</code>
     *
     * @param value The logAnalyticsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setLogAnalyticsEnabled(boolean value) {

      logAnalyticsEnabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether or not Log Analytics features are supported in the given
     * location.
     * </pre>
     *
     * <code>bool log_analytics_enabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLogAnalyticsEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      logAnalyticsEnabled_ = false;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.logging.v2.LocationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.LocationMetadata)
  private static final com.google.logging.v2.LocationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.LocationMetadata();
  }

  public static com.google.logging.v2.LocationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<LocationMetadata>() {
        @java.lang.Override
        public LocationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.LocationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
