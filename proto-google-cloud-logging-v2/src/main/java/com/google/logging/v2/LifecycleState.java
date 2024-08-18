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

// Protobuf Java Version: 3.25.4
package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * LogBucket lifecycle states.
 * </pre>
 *
 * Protobuf enum {@code google.logging.v2.LifecycleState}
 */
public enum LifecycleState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified state. This is only used/useful for distinguishing unset
   * values.
   * </pre>
   *
   * <code>LIFECYCLE_STATE_UNSPECIFIED = 0;</code>
   */
  LIFECYCLE_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The normal and active state.
   * </pre>
   *
   * <code>ACTIVE = 1;</code>
   */
  ACTIVE(1),
  /**
   *
   *
   * <pre>
   * The resource has been marked for deletion by the user. For some resources
   * (e.g. buckets), this can be reversed by an un-delete operation.
   * </pre>
   *
   * <code>DELETE_REQUESTED = 2;</code>
   */
  DELETE_REQUESTED(2),
  /**
   *
   *
   * <pre>
   * The resource has been marked for an update by the user. It will remain in
   * this state until the update is complete.
   * </pre>
   *
   * <code>UPDATING = 3;</code>
   */
  UPDATING(3),
  /**
   *
   *
   * <pre>
   * The resource has been marked for creation by the user. It will remain in
   * this state until the creation is complete.
   * </pre>
   *
   * <code>CREATING = 4;</code>
   */
  CREATING(4),
  /**
   *
   *
   * <pre>
   * The resource is in an INTERNAL error state.
   * </pre>
   *
   * <code>FAILED = 5;</code>
   */
  FAILED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified state. This is only used/useful for distinguishing unset
   * values.
   * </pre>
   *
   * <code>LIFECYCLE_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int LIFECYCLE_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The normal and active state.
   * </pre>
   *
   * <code>ACTIVE = 1;</code>
   */
  public static final int ACTIVE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The resource has been marked for deletion by the user. For some resources
   * (e.g. buckets), this can be reversed by an un-delete operation.
   * </pre>
   *
   * <code>DELETE_REQUESTED = 2;</code>
   */
  public static final int DELETE_REQUESTED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The resource has been marked for an update by the user. It will remain in
   * this state until the update is complete.
   * </pre>
   *
   * <code>UPDATING = 3;</code>
   */
  public static final int UPDATING_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The resource has been marked for creation by the user. It will remain in
   * this state until the creation is complete.
   * </pre>
   *
   * <code>CREATING = 4;</code>
   */
  public static final int CREATING_VALUE = 4;
  /**
   *
   *
   * <pre>
   * The resource is in an INTERNAL error state.
   * </pre>
   *
   * <code>FAILED = 5;</code>
   */
  public static final int FAILED_VALUE = 5;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LifecycleState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LifecycleState forNumber(int value) {
    switch (value) {
      case 0:
        return LIFECYCLE_STATE_UNSPECIFIED;
      case 1:
        return ACTIVE;
      case 2:
        return DELETE_REQUESTED;
      case 3:
        return UPDATING;
      case 4:
        return CREATING;
      case 5:
        return FAILED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LifecycleState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<LifecycleState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<LifecycleState>() {
        public LifecycleState findValueByNumber(int number) {
          return LifecycleState.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final LifecycleState[] VALUES = values();

  public static LifecycleState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LifecycleState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.logging.v2.LifecycleState)
}
