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

package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * Result returned from `ListSinks`.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.ListSinksResponse}
 */
public final class ListSinksResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.ListSinksResponse)
    ListSinksResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSinksResponse.newBuilder() to construct.
  private ListSinksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSinksResponse() {
    sinks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSinksResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_ListSinksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_ListSinksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.ListSinksResponse.class,
            com.google.logging.v2.ListSinksResponse.Builder.class);
  }

  public static final int SINKS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.logging.v2.LogSink> sinks_;
  /**
   *
   *
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.logging.v2.LogSink> getSinksList() {
    return sinks_;
  }
  /**
   *
   *
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.logging.v2.LogSinkOrBuilder> getSinksOrBuilderList() {
    return sinks_;
  }
  /**
   *
   *
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  @java.lang.Override
  public int getSinksCount() {
    return sinks_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  @java.lang.Override
  public com.google.logging.v2.LogSink getSinks(int index) {
    return sinks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  @java.lang.Override
  public com.google.logging.v2.LogSinkOrBuilder getSinksOrBuilder(int index) {
    return sinks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call the same
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
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call the same
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
    for (int i = 0; i < sinks_.size(); i++) {
      output.writeMessage(1, sinks_.get(i));
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
    for (int i = 0; i < sinks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, sinks_.get(i));
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
    if (!(obj instanceof com.google.logging.v2.ListSinksResponse)) {
      return super.equals(obj);
    }
    com.google.logging.v2.ListSinksResponse other = (com.google.logging.v2.ListSinksResponse) obj;

    if (!getSinksList().equals(other.getSinksList())) return false;
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
    if (getSinksCount() > 0) {
      hash = (37 * hash) + SINKS_FIELD_NUMBER;
      hash = (53 * hash) + getSinksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.ListSinksResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListSinksResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListSinksResponse parseFrom(
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

  public static Builder newBuilder(com.google.logging.v2.ListSinksResponse prototype) {
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
   * Result returned from `ListSinks`.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.ListSinksResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.ListSinksResponse)
      com.google.logging.v2.ListSinksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_ListSinksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_ListSinksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.ListSinksResponse.class,
              com.google.logging.v2.ListSinksResponse.Builder.class);
    }

    // Construct using com.google.logging.v2.ListSinksResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (sinksBuilder_ == null) {
        sinks_ = java.util.Collections.emptyList();
      } else {
        sinks_ = null;
        sinksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_ListSinksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.ListSinksResponse getDefaultInstanceForType() {
      return com.google.logging.v2.ListSinksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.ListSinksResponse build() {
      com.google.logging.v2.ListSinksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.ListSinksResponse buildPartial() {
      com.google.logging.v2.ListSinksResponse result =
          new com.google.logging.v2.ListSinksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.logging.v2.ListSinksResponse result) {
      if (sinksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sinks_ = java.util.Collections.unmodifiableList(sinks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sinks_ = sinks_;
      } else {
        result.sinks_ = sinksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.logging.v2.ListSinksResponse result) {
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
      if (other instanceof com.google.logging.v2.ListSinksResponse) {
        return mergeFrom((com.google.logging.v2.ListSinksResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.ListSinksResponse other) {
      if (other == com.google.logging.v2.ListSinksResponse.getDefaultInstance()) return this;
      if (sinksBuilder_ == null) {
        if (!other.sinks_.isEmpty()) {
          if (sinks_.isEmpty()) {
            sinks_ = other.sinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSinksIsMutable();
            sinks_.addAll(other.sinks_);
          }
          onChanged();
        }
      } else {
        if (!other.sinks_.isEmpty()) {
          if (sinksBuilder_.isEmpty()) {
            sinksBuilder_.dispose();
            sinksBuilder_ = null;
            sinks_ = other.sinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sinksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSinksFieldBuilder()
                    : null;
          } else {
            sinksBuilder_.addAllMessages(other.sinks_);
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
                com.google.logging.v2.LogSink m =
                    input.readMessage(com.google.logging.v2.LogSink.parser(), extensionRegistry);
                if (sinksBuilder_ == null) {
                  ensureSinksIsMutable();
                  sinks_.add(m);
                } else {
                  sinksBuilder_.addMessage(m);
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

    private java.util.List<com.google.logging.v2.LogSink> sinks_ =
        java.util.Collections.emptyList();

    private void ensureSinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sinks_ = new java.util.ArrayList<com.google.logging.v2.LogSink>(sinks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.logging.v2.LogSink,
            com.google.logging.v2.LogSink.Builder,
            com.google.logging.v2.LogSinkOrBuilder>
        sinksBuilder_;

    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public java.util.List<com.google.logging.v2.LogSink> getSinksList() {
      if (sinksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sinks_);
      } else {
        return sinksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public int getSinksCount() {
      if (sinksBuilder_ == null) {
        return sinks_.size();
      } else {
        return sinksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public com.google.logging.v2.LogSink getSinks(int index) {
      if (sinksBuilder_ == null) {
        return sinks_.get(index);
      } else {
        return sinksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder setSinks(int index, com.google.logging.v2.LogSink value) {
      if (sinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSinksIsMutable();
        sinks_.set(index, value);
        onChanged();
      } else {
        sinksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder setSinks(int index, com.google.logging.v2.LogSink.Builder builderForValue) {
      if (sinksBuilder_ == null) {
        ensureSinksIsMutable();
        sinks_.set(index, builderForValue.build());
        onChanged();
      } else {
        sinksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder addSinks(com.google.logging.v2.LogSink value) {
      if (sinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSinksIsMutable();
        sinks_.add(value);
        onChanged();
      } else {
        sinksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder addSinks(int index, com.google.logging.v2.LogSink value) {
      if (sinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSinksIsMutable();
        sinks_.add(index, value);
        onChanged();
      } else {
        sinksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder addSinks(com.google.logging.v2.LogSink.Builder builderForValue) {
      if (sinksBuilder_ == null) {
        ensureSinksIsMutable();
        sinks_.add(builderForValue.build());
        onChanged();
      } else {
        sinksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder addSinks(int index, com.google.logging.v2.LogSink.Builder builderForValue) {
      if (sinksBuilder_ == null) {
        ensureSinksIsMutable();
        sinks_.add(index, builderForValue.build());
        onChanged();
      } else {
        sinksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder addAllSinks(java.lang.Iterable<? extends com.google.logging.v2.LogSink> values) {
      if (sinksBuilder_ == null) {
        ensureSinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, sinks_);
        onChanged();
      } else {
        sinksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder clearSinks() {
      if (sinksBuilder_ == null) {
        sinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sinksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public Builder removeSinks(int index) {
      if (sinksBuilder_ == null) {
        ensureSinksIsMutable();
        sinks_.remove(index);
        onChanged();
      } else {
        sinksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public com.google.logging.v2.LogSink.Builder getSinksBuilder(int index) {
      return getSinksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public com.google.logging.v2.LogSinkOrBuilder getSinksOrBuilder(int index) {
      if (sinksBuilder_ == null) {
        return sinks_.get(index);
      } else {
        return sinksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public java.util.List<? extends com.google.logging.v2.LogSinkOrBuilder>
        getSinksOrBuilderList() {
      if (sinksBuilder_ != null) {
        return sinksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sinks_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public com.google.logging.v2.LogSink.Builder addSinksBuilder() {
      return getSinksFieldBuilder().addBuilder(com.google.logging.v2.LogSink.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public com.google.logging.v2.LogSink.Builder addSinksBuilder(int index) {
      return getSinksFieldBuilder()
          .addBuilder(index, com.google.logging.v2.LogSink.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of sinks.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
     */
    public java.util.List<com.google.logging.v2.LogSink.Builder> getSinksBuilderList() {
      return getSinksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.logging.v2.LogSink,
            com.google.logging.v2.LogSink.Builder,
            com.google.logging.v2.LogSinkOrBuilder>
        getSinksFieldBuilder() {
      if (sinksBuilder_ == null) {
        sinksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.logging.v2.LogSink,
                com.google.logging.v2.LogSink.Builder,
                com.google.logging.v2.LogSinkOrBuilder>(
                sinks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        sinks_ = null;
      }
      return sinksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
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
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
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
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
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
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
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
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
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

    // @@protoc_insertion_point(builder_scope:google.logging.v2.ListSinksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.ListSinksResponse)
  private static final com.google.logging.v2.ListSinksResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.ListSinksResponse();
  }

  public static com.google.logging.v2.ListSinksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSinksResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSinksResponse>() {
        @java.lang.Override
        public ListSinksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSinksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSinksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.ListSinksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
