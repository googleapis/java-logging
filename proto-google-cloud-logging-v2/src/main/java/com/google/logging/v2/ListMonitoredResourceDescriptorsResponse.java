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
// source: google/logging/v2/logging.proto

// Protobuf Java Version: 3.25.5
package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * Result returned from ListMonitoredResourceDescriptors.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.ListMonitoredResourceDescriptorsResponse}
 */
public final class ListMonitoredResourceDescriptorsResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.ListMonitoredResourceDescriptorsResponse)
    ListMonitoredResourceDescriptorsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListMonitoredResourceDescriptorsResponse.newBuilder() to construct.
  private ListMonitoredResourceDescriptorsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListMonitoredResourceDescriptorsResponse() {
    resourceDescriptors_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListMonitoredResourceDescriptorsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingProto
        .internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingProto
        .internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.ListMonitoredResourceDescriptorsResponse.class,
            com.google.logging.v2.ListMonitoredResourceDescriptorsResponse.Builder.class);
  }

  public static final int RESOURCE_DESCRIPTORS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.api.MonitoredResourceDescriptor> resourceDescriptors_;
  /**
   *
   *
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.MonitoredResourceDescriptor> getResourceDescriptorsList() {
    return resourceDescriptors_;
  }
  /**
   *
   *
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.MonitoredResourceDescriptorOrBuilder>
      getResourceDescriptorsOrBuilderList() {
    return resourceDescriptors_;
  }
  /**
   *
   *
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  @java.lang.Override
  public int getResourceDescriptorsCount() {
    return resourceDescriptors_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  @java.lang.Override
  public com.google.api.MonitoredResourceDescriptor getResourceDescriptors(int index) {
    return resourceDescriptors_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  @java.lang.Override
  public com.google.api.MonitoredResourceDescriptorOrBuilder getResourceDescriptorsOrBuilder(
      int index) {
    return resourceDescriptors_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < resourceDescriptors_.size(); i++) {
      output.writeMessage(1, resourceDescriptors_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < resourceDescriptors_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, resourceDescriptors_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.logging.v2.ListMonitoredResourceDescriptorsResponse)) {
      return super.equals(obj);
    }
    com.google.logging.v2.ListMonitoredResourceDescriptorsResponse other =
        (com.google.logging.v2.ListMonitoredResourceDescriptorsResponse) obj;

    if (!getResourceDescriptorsList().equals(other.getResourceDescriptorsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getResourceDescriptorsCount() > 0) {
      hash = (37 * hash) + RESOURCE_DESCRIPTORS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceDescriptorsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.logging.v2.ListMonitoredResourceDescriptorsResponse prototype) {
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
   * Result returned from ListMonitoredResourceDescriptors.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.ListMonitoredResourceDescriptorsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.ListMonitoredResourceDescriptorsResponse)
      com.google.logging.v2.ListMonitoredResourceDescriptorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingProto
          .internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingProto
          .internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.ListMonitoredResourceDescriptorsResponse.class,
              com.google.logging.v2.ListMonitoredResourceDescriptorsResponse.Builder.class);
    }

    // Construct using com.google.logging.v2.ListMonitoredResourceDescriptorsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (resourceDescriptorsBuilder_ == null) {
        resourceDescriptors_ = java.util.Collections.emptyList();
      } else {
        resourceDescriptors_ = null;
        resourceDescriptorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingProto
          .internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.ListMonitoredResourceDescriptorsResponse
        getDefaultInstanceForType() {
      return com.google.logging.v2.ListMonitoredResourceDescriptorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.ListMonitoredResourceDescriptorsResponse build() {
      com.google.logging.v2.ListMonitoredResourceDescriptorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.ListMonitoredResourceDescriptorsResponse buildPartial() {
      com.google.logging.v2.ListMonitoredResourceDescriptorsResponse result =
          new com.google.logging.v2.ListMonitoredResourceDescriptorsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.logging.v2.ListMonitoredResourceDescriptorsResponse result) {
      if (resourceDescriptorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          resourceDescriptors_ = java.util.Collections.unmodifiableList(resourceDescriptors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resourceDescriptors_ = resourceDescriptors_;
      } else {
        result.resourceDescriptors_ = resourceDescriptorsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.logging.v2.ListMonitoredResourceDescriptorsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.logging.v2.ListMonitoredResourceDescriptorsResponse) {
        return mergeFrom((com.google.logging.v2.ListMonitoredResourceDescriptorsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.ListMonitoredResourceDescriptorsResponse other) {
      if (other
          == com.google.logging.v2.ListMonitoredResourceDescriptorsResponse.getDefaultInstance())
        return this;
      if (resourceDescriptorsBuilder_ == null) {
        if (!other.resourceDescriptors_.isEmpty()) {
          if (resourceDescriptors_.isEmpty()) {
            resourceDescriptors_ = other.resourceDescriptors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResourceDescriptorsIsMutable();
            resourceDescriptors_.addAll(other.resourceDescriptors_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceDescriptors_.isEmpty()) {
          if (resourceDescriptorsBuilder_.isEmpty()) {
            resourceDescriptorsBuilder_.dispose();
            resourceDescriptorsBuilder_ = null;
            resourceDescriptors_ = other.resourceDescriptors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resourceDescriptorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getResourceDescriptorsFieldBuilder()
                    : null;
          } else {
            resourceDescriptorsBuilder_.addAllMessages(other.resourceDescriptors_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                com.google.api.MonitoredResourceDescriptor m =
                    input.readMessage(
                        com.google.api.MonitoredResourceDescriptor.parser(), extensionRegistry);
                if (resourceDescriptorsBuilder_ == null) {
                  ensureResourceDescriptorsIsMutable();
                  resourceDescriptors_.add(m);
                } else {
                  resourceDescriptorsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.api.MonitoredResourceDescriptor> resourceDescriptors_ =
        java.util.Collections.emptyList();

    private void ensureResourceDescriptorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourceDescriptors_ =
            new java.util.ArrayList<com.google.api.MonitoredResourceDescriptor>(
                resourceDescriptors_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.MonitoredResourceDescriptor,
            com.google.api.MonitoredResourceDescriptor.Builder,
            com.google.api.MonitoredResourceDescriptorOrBuilder>
        resourceDescriptorsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public java.util.List<com.google.api.MonitoredResourceDescriptor> getResourceDescriptorsList() {
      if (resourceDescriptorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceDescriptors_);
      } else {
        return resourceDescriptorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public int getResourceDescriptorsCount() {
      if (resourceDescriptorsBuilder_ == null) {
        return resourceDescriptors_.size();
      } else {
        return resourceDescriptorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptor getResourceDescriptors(int index) {
      if (resourceDescriptorsBuilder_ == null) {
        return resourceDescriptors_.get(index);
      } else {
        return resourceDescriptorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder setResourceDescriptors(
        int index, com.google.api.MonitoredResourceDescriptor value) {
      if (resourceDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.set(index, value);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder setResourceDescriptors(
        int index, com.google.api.MonitoredResourceDescriptor.Builder builderForValue) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceDescriptorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addResourceDescriptors(com.google.api.MonitoredResourceDescriptor value) {
      if (resourceDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.add(value);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addResourceDescriptors(
        int index, com.google.api.MonitoredResourceDescriptor value) {
      if (resourceDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.add(index, value);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addResourceDescriptors(
        com.google.api.MonitoredResourceDescriptor.Builder builderForValue) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.add(builderForValue.build());
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addResourceDescriptors(
        int index, com.google.api.MonitoredResourceDescriptor.Builder builderForValue) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addAllResourceDescriptors(
        java.lang.Iterable<? extends com.google.api.MonitoredResourceDescriptor> values) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceDescriptors_);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder clearResourceDescriptors() {
      if (resourceDescriptorsBuilder_ == null) {
        resourceDescriptors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder removeResourceDescriptors(int index) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.remove(index);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptor.Builder getResourceDescriptorsBuilder(
        int index) {
      return getResourceDescriptorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptorOrBuilder getResourceDescriptorsOrBuilder(
        int index) {
      if (resourceDescriptorsBuilder_ == null) {
        return resourceDescriptors_.get(index);
      } else {
        return resourceDescriptorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public java.util.List<? extends com.google.api.MonitoredResourceDescriptorOrBuilder>
        getResourceDescriptorsOrBuilderList() {
      if (resourceDescriptorsBuilder_ != null) {
        return resourceDescriptorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceDescriptors_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptor.Builder addResourceDescriptorsBuilder() {
      return getResourceDescriptorsFieldBuilder()
          .addBuilder(com.google.api.MonitoredResourceDescriptor.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptor.Builder addResourceDescriptorsBuilder(
        int index) {
      return getResourceDescriptorsFieldBuilder()
          .addBuilder(index, com.google.api.MonitoredResourceDescriptor.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of resource descriptors.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public java.util.List<com.google.api.MonitoredResourceDescriptor.Builder>
        getResourceDescriptorsBuilderList() {
      return getResourceDescriptorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.MonitoredResourceDescriptor,
            com.google.api.MonitoredResourceDescriptor.Builder,
            com.google.api.MonitoredResourceDescriptorOrBuilder>
        getResourceDescriptorsFieldBuilder() {
      if (resourceDescriptorsBuilder_ == null) {
        resourceDescriptorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.MonitoredResourceDescriptor,
                com.google.api.MonitoredResourceDescriptor.Builder,
                com.google.api.MonitoredResourceDescriptorOrBuilder>(
                resourceDescriptors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        resourceDescriptors_ = null;
      }
      return resourceDescriptorsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.logging.v2.ListMonitoredResourceDescriptorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.ListMonitoredResourceDescriptorsResponse)
  private static final com.google.logging.v2.ListMonitoredResourceDescriptorsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.ListMonitoredResourceDescriptorsResponse();
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMonitoredResourceDescriptorsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListMonitoredResourceDescriptorsResponse>() {
        @java.lang.Override
        public ListMonitoredResourceDescriptorsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListMonitoredResourceDescriptorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMonitoredResourceDescriptorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.ListMonitoredResourceDescriptorsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
