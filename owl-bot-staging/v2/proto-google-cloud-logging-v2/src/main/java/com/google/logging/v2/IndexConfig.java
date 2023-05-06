// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

/**
 * <pre>
 * Configuration for an indexed field.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.IndexConfig}
 */
public final class IndexConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.IndexConfig)
    IndexConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IndexConfig.newBuilder() to construct.
  private IndexConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IndexConfig() {
    fieldPath_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IndexConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_IndexConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_IndexConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.IndexConfig.class, com.google.logging.v2.IndexConfig.Builder.class);
  }

  public static final int FIELD_PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldPath_ = "";
  /**
   * <pre>
   * Required. The LogEntry field path to index.
   * Note that some paths are automatically indexed, and other paths are not
   * eligible for indexing. See [indexing documentation](
   * https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields)
   * for details.
   * For example: `jsonPayload.request.status`
   * </pre>
   *
   * <code>string field_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The fieldPath.
   */
  @java.lang.Override
  public java.lang.String getFieldPath() {
    java.lang.Object ref = fieldPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The LogEntry field path to index.
   * Note that some paths are automatically indexed, and other paths are not
   * eligible for indexing. See [indexing documentation](
   * https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields)
   * for details.
   * For example: `jsonPayload.request.status`
   * </pre>
   *
   * <code>string field_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for fieldPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldPathBytes() {
    java.lang.Object ref = fieldPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   * <pre>
   * Required. The type of data in this index.
   * </pre>
   *
   * <code>.google.logging.v2.IndexType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Required. The type of data in this index.
   * </pre>
   *
   * <code>.google.logging.v2.IndexType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  @java.lang.Override public com.google.logging.v2.IndexType getType() {
    com.google.logging.v2.IndexType result = com.google.logging.v2.IndexType.forNumber(type_);
    return result == null ? com.google.logging.v2.IndexType.UNRECOGNIZED : result;
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Output only. The timestamp when the index was last modified.
   * This is used to return the timestamp, and will be ignored if supplied
   * during update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Output only. The timestamp when the index was last modified.
   * This is used to return the timestamp, and will be ignored if supplied
   * during update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Output only. The timestamp when the index was last modified.
   * This is used to return the timestamp, and will be ignored if supplied
   * during update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldPath_);
    }
    if (type_ != com.google.logging.v2.IndexType.INDEX_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (createTime_ != null) {
      output.writeMessage(3, getCreateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldPath_);
    }
    if (type_ != com.google.logging.v2.IndexType.INDEX_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCreateTime());
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
    if (!(obj instanceof com.google.logging.v2.IndexConfig)) {
      return super.equals(obj);
    }
    com.google.logging.v2.IndexConfig other = (com.google.logging.v2.IndexConfig) obj;

    if (!getFieldPath()
        .equals(other.getFieldPath())) return false;
    if (type_ != other.type_) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
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
    hash = (37 * hash) + FIELD_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFieldPath().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.IndexConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.IndexConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.IndexConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.IndexConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.logging.v2.IndexConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Configuration for an indexed field.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.IndexConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.IndexConfig)
      com.google.logging.v2.IndexConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_IndexConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_IndexConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.IndexConfig.class, com.google.logging.v2.IndexConfig.Builder.class);
    }

    // Construct using com.google.logging.v2.IndexConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fieldPath_ = "";
      type_ = 0;
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_IndexConfig_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.IndexConfig getDefaultInstanceForType() {
      return com.google.logging.v2.IndexConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.IndexConfig build() {
      com.google.logging.v2.IndexConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.IndexConfig buildPartial() {
      com.google.logging.v2.IndexConfig result = new com.google.logging.v2.IndexConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.logging.v2.IndexConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldPath_ = fieldPath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.createTime_ = createTimeBuilder_ == null
            ? createTime_
            : createTimeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.IndexConfig) {
        return mergeFrom((com.google.logging.v2.IndexConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.IndexConfig other) {
      if (other == com.google.logging.v2.IndexConfig.getDefaultInstance()) return this;
      if (!other.getFieldPath().isEmpty()) {
        fieldPath_ = other.fieldPath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
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
            case 10: {
              fieldPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
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

    private java.lang.Object fieldPath_ = "";
    /**
     * <pre>
     * Required. The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not
     * eligible for indexing. See [indexing documentation](
     * https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields)
     * for details.
     * For example: `jsonPayload.request.status`
     * </pre>
     *
     * <code>string field_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The fieldPath.
     */
    public java.lang.String getFieldPath() {
      java.lang.Object ref = fieldPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not
     * eligible for indexing. See [indexing documentation](
     * https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields)
     * for details.
     * For example: `jsonPayload.request.status`
     * </pre>
     *
     * <code>string field_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for fieldPath.
     */
    public com.google.protobuf.ByteString
        getFieldPathBytes() {
      java.lang.Object ref = fieldPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not
     * eligible for indexing. See [indexing documentation](
     * https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields)
     * for details.
     * For example: `jsonPayload.request.status`
     * </pre>
     *
     * <code>string field_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The fieldPath to set.
     * @return This builder for chaining.
     */
    public Builder setFieldPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not
     * eligible for indexing. See [indexing documentation](
     * https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields)
     * for details.
     * For example: `jsonPayload.request.status`
     * </pre>
     *
     * <code>string field_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldPath() {
      fieldPath_ = getDefaultInstance().getFieldPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not
     * eligible for indexing. See [indexing documentation](
     * https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields)
     * for details.
     * For example: `jsonPayload.request.status`
     * </pre>
     *
     * <code>string field_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for fieldPath to set.
     * @return This builder for chaining.
     */
    public Builder setFieldPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Required. The type of data in this index.
     * </pre>
     *
     * <code>.google.logging.v2.IndexType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Required. The type of data in this index.
     * </pre>
     *
     * <code>.google.logging.v2.IndexType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The type of data in this index.
     * </pre>
     *
     * <code>.google.logging.v2.IndexType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.logging.v2.IndexType getType() {
      com.google.logging.v2.IndexType result = com.google.logging.v2.IndexType.forNumber(type_);
      return result == null ? com.google.logging.v2.IndexType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The type of data in this index.
     * </pre>
     *
     * <code>.google.logging.v2.IndexType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.logging.v2.IndexType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The type of data in this index.
     * </pre>
     *
     * <code>.google.logging.v2.IndexType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
      } else {
        createTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          createTime_ != null &&
          createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreateTimeBuilder().mergeFrom(value);
        } else {
          createTime_ = value;
        }
      } else {
        createTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Output only. The timestamp when the index was last modified.
     * This is used to return the timestamp, and will be ignored if supplied
     * during update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.logging.v2.IndexConfig)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.IndexConfig)
  private static final com.google.logging.v2.IndexConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.IndexConfig();
  }

  public static com.google.logging.v2.IndexConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IndexConfig>
      PARSER = new com.google.protobuf.AbstractParser<IndexConfig>() {
    @java.lang.Override
    public IndexConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<IndexConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IndexConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.IndexConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

