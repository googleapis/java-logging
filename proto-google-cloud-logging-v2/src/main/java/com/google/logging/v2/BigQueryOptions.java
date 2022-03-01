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

/**
 *
 *
 * <pre>
 * Options that change functionality of a sink exporting data to BigQuery.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.BigQueryOptions}
 */
public final class BigQueryOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.BigQueryOptions)
    BigQueryOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryOptions.newBuilder() to construct.
  private BigQueryOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryOptions() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BigQueryOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BigQueryOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              usePartitionedTables_ = input.readBool();
              break;
            }
          case 24:
            {
              usesTimestampColumnPartitioning_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_BigQueryOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_BigQueryOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.BigQueryOptions.class,
            com.google.logging.v2.BigQueryOptions.Builder.class);
  }

  public static final int USE_PARTITIONED_TABLES_FIELD_NUMBER = 1;
  private boolean usePartitionedTables_;
  /**
   *
   *
   * <pre>
   * Optional. Whether to use [BigQuery's partition
   * tables](https://cloud.google.com/bigquery/docs/partitioned-tables). By
   * default, Cloud Logging creates dated tables based on the log entries'
   * timestamps, e.g. syslog_20170523. With partitioned tables the date suffix
   * is no longer present and [special query
   * syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
   * has to be used instead. In both cases, tables are sharded based on UTC
   * timezone.
   * </pre>
   *
   * <code>bool use_partitioned_tables = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The usePartitionedTables.
   */
  @java.lang.Override
  public boolean getUsePartitionedTables() {
    return usePartitionedTables_;
  }

  public static final int USES_TIMESTAMP_COLUMN_PARTITIONING_FIELD_NUMBER = 3;
  private boolean usesTimestampColumnPartitioning_;
  /**
   *
   *
   * <pre>
   * Output only. True if new timestamp column based partitioning is in use, false if legacy
   * ingestion-time partitioning is in use.
   * All new sinks will have this field set true and will use timestamp column
   * based partitioning. If use_partitioned_tables is false, this value has no
   * meaning and will be false. Legacy sinks using partitioned tables will have
   * this field set to false.
   * </pre>
   *
   * <code>bool uses_timestamp_column_partitioning = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The usesTimestampColumnPartitioning.
   */
  @java.lang.Override
  public boolean getUsesTimestampColumnPartitioning() {
    return usesTimestampColumnPartitioning_;
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
    if (usePartitionedTables_ != false) {
      output.writeBool(1, usePartitionedTables_);
    }
    if (usesTimestampColumnPartitioning_ != false) {
      output.writeBool(3, usesTimestampColumnPartitioning_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (usePartitionedTables_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, usePartitionedTables_);
    }
    if (usesTimestampColumnPartitioning_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              3, usesTimestampColumnPartitioning_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.BigQueryOptions)) {
      return super.equals(obj);
    }
    com.google.logging.v2.BigQueryOptions other = (com.google.logging.v2.BigQueryOptions) obj;

    if (getUsePartitionedTables() != other.getUsePartitionedTables()) return false;
    if (getUsesTimestampColumnPartitioning() != other.getUsesTimestampColumnPartitioning())
      return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USE_PARTITIONED_TABLES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUsePartitionedTables());
    hash = (37 * hash) + USES_TIMESTAMP_COLUMN_PARTITIONING_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getUsesTimestampColumnPartitioning());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.BigQueryOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.BigQueryOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.BigQueryOptions parseFrom(
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

  public static Builder newBuilder(com.google.logging.v2.BigQueryOptions prototype) {
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
   * Options that change functionality of a sink exporting data to BigQuery.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.BigQueryOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.BigQueryOptions)
      com.google.logging.v2.BigQueryOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_BigQueryOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_BigQueryOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.BigQueryOptions.class,
              com.google.logging.v2.BigQueryOptions.Builder.class);
    }

    // Construct using com.google.logging.v2.BigQueryOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      usePartitionedTables_ = false;

      usesTimestampColumnPartitioning_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_BigQueryOptions_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.BigQueryOptions getDefaultInstanceForType() {
      return com.google.logging.v2.BigQueryOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.BigQueryOptions build() {
      com.google.logging.v2.BigQueryOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.BigQueryOptions buildPartial() {
      com.google.logging.v2.BigQueryOptions result =
          new com.google.logging.v2.BigQueryOptions(this);
      result.usePartitionedTables_ = usePartitionedTables_;
      result.usesTimestampColumnPartitioning_ = usesTimestampColumnPartitioning_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.logging.v2.BigQueryOptions) {
        return mergeFrom((com.google.logging.v2.BigQueryOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.BigQueryOptions other) {
      if (other == com.google.logging.v2.BigQueryOptions.getDefaultInstance()) return this;
      if (other.getUsePartitionedTables() != false) {
        setUsePartitionedTables(other.getUsePartitionedTables());
      }
      if (other.getUsesTimestampColumnPartitioning() != false) {
        setUsesTimestampColumnPartitioning(other.getUsesTimestampColumnPartitioning());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.logging.v2.BigQueryOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.BigQueryOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean usePartitionedTables_;
    /**
     *
     *
     * <pre>
     * Optional. Whether to use [BigQuery's partition
     * tables](https://cloud.google.com/bigquery/docs/partitioned-tables). By
     * default, Cloud Logging creates dated tables based on the log entries'
     * timestamps, e.g. syslog_20170523. With partitioned tables the date suffix
     * is no longer present and [special query
     * syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
     * has to be used instead. In both cases, tables are sharded based on UTC
     * timezone.
     * </pre>
     *
     * <code>bool use_partitioned_tables = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The usePartitionedTables.
     */
    @java.lang.Override
    public boolean getUsePartitionedTables() {
      return usePartitionedTables_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Whether to use [BigQuery's partition
     * tables](https://cloud.google.com/bigquery/docs/partitioned-tables). By
     * default, Cloud Logging creates dated tables based on the log entries'
     * timestamps, e.g. syslog_20170523. With partitioned tables the date suffix
     * is no longer present and [special query
     * syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
     * has to be used instead. In both cases, tables are sharded based on UTC
     * timezone.
     * </pre>
     *
     * <code>bool use_partitioned_tables = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The usePartitionedTables to set.
     * @return This builder for chaining.
     */
    public Builder setUsePartitionedTables(boolean value) {

      usePartitionedTables_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Whether to use [BigQuery's partition
     * tables](https://cloud.google.com/bigquery/docs/partitioned-tables). By
     * default, Cloud Logging creates dated tables based on the log entries'
     * timestamps, e.g. syslog_20170523. With partitioned tables the date suffix
     * is no longer present and [special query
     * syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
     * has to be used instead. In both cases, tables are sharded based on UTC
     * timezone.
     * </pre>
     *
     * <code>bool use_partitioned_tables = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUsePartitionedTables() {

      usePartitionedTables_ = false;
      onChanged();
      return this;
    }

    private boolean usesTimestampColumnPartitioning_;
    /**
     *
     *
     * <pre>
     * Output only. True if new timestamp column based partitioning is in use, false if legacy
     * ingestion-time partitioning is in use.
     * All new sinks will have this field set true and will use timestamp column
     * based partitioning. If use_partitioned_tables is false, this value has no
     * meaning and will be false. Legacy sinks using partitioned tables will have
     * this field set to false.
     * </pre>
     *
     * <code>
     * bool uses_timestamp_column_partitioning = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The usesTimestampColumnPartitioning.
     */
    @java.lang.Override
    public boolean getUsesTimestampColumnPartitioning() {
      return usesTimestampColumnPartitioning_;
    }
    /**
     *
     *
     * <pre>
     * Output only. True if new timestamp column based partitioning is in use, false if legacy
     * ingestion-time partitioning is in use.
     * All new sinks will have this field set true and will use timestamp column
     * based partitioning. If use_partitioned_tables is false, this value has no
     * meaning and will be false. Legacy sinks using partitioned tables will have
     * this field set to false.
     * </pre>
     *
     * <code>
     * bool uses_timestamp_column_partitioning = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The usesTimestampColumnPartitioning to set.
     * @return This builder for chaining.
     */
    public Builder setUsesTimestampColumnPartitioning(boolean value) {

      usesTimestampColumnPartitioning_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. True if new timestamp column based partitioning is in use, false if legacy
     * ingestion-time partitioning is in use.
     * All new sinks will have this field set true and will use timestamp column
     * based partitioning. If use_partitioned_tables is false, this value has no
     * meaning and will be false. Legacy sinks using partitioned tables will have
     * this field set to false.
     * </pre>
     *
     * <code>
     * bool uses_timestamp_column_partitioning = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUsesTimestampColumnPartitioning() {

      usesTimestampColumnPartitioning_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.logging.v2.BigQueryOptions)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.BigQueryOptions)
  private static final com.google.logging.v2.BigQueryOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.BigQueryOptions();
  }

  public static com.google.logging.v2.BigQueryOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryOptions> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryOptions>() {
        @java.lang.Override
        public BigQueryOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BigQueryOptions(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BigQueryOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.BigQueryOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
