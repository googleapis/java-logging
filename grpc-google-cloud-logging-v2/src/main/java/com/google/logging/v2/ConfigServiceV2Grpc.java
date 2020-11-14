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
package com.google.logging.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Service for configuring sinks used to route log entries.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/logging/v2/logging_config.proto")
public final class ConfigServiceV2Grpc {

  private ConfigServiceV2Grpc() {}

  public static final String SERVICE_NAME = "google.logging.v2.ConfigServiceV2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.ListBucketsRequest, com.google.logging.v2.ListBucketsResponse>
      getListBucketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBuckets",
      requestType = com.google.logging.v2.ListBucketsRequest.class,
      responseType = com.google.logging.v2.ListBucketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.ListBucketsRequest, com.google.logging.v2.ListBucketsResponse>
      getListBucketsMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.ListBucketsRequest, com.google.logging.v2.ListBucketsResponse>
        getListBucketsMethod;
    if ((getListBucketsMethod = ConfigServiceV2Grpc.getListBucketsMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getListBucketsMethod = ConfigServiceV2Grpc.getListBucketsMethod) == null) {
          ConfigServiceV2Grpc.getListBucketsMethod =
              getListBucketsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.ListBucketsRequest,
                          com.google.logging.v2.ListBucketsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBuckets"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.ListBucketsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.ListBucketsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("ListBuckets"))
                      .build();
        }
      }
    }
    return getListBucketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.GetBucketRequest, com.google.logging.v2.LogBucket>
      getGetBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBucket",
      requestType = com.google.logging.v2.GetBucketRequest.class,
      responseType = com.google.logging.v2.LogBucket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.GetBucketRequest, com.google.logging.v2.LogBucket>
      getGetBucketMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.GetBucketRequest, com.google.logging.v2.LogBucket>
        getGetBucketMethod;
    if ((getGetBucketMethod = ConfigServiceV2Grpc.getGetBucketMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getGetBucketMethod = ConfigServiceV2Grpc.getGetBucketMethod) == null) {
          ConfigServiceV2Grpc.getGetBucketMethod =
              getGetBucketMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.GetBucketRequest, com.google.logging.v2.LogBucket>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBucket"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.GetBucketRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogBucket.getDefaultInstance()))
                      .setSchemaDescriptor(new ConfigServiceV2MethodDescriptorSupplier("GetBucket"))
                      .build();
        }
      }
    }
    return getGetBucketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.CreateBucketRequest, com.google.logging.v2.LogBucket>
      getCreateBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBucket",
      requestType = com.google.logging.v2.CreateBucketRequest.class,
      responseType = com.google.logging.v2.LogBucket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.CreateBucketRequest, com.google.logging.v2.LogBucket>
      getCreateBucketMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.CreateBucketRequest, com.google.logging.v2.LogBucket>
        getCreateBucketMethod;
    if ((getCreateBucketMethod = ConfigServiceV2Grpc.getCreateBucketMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getCreateBucketMethod = ConfigServiceV2Grpc.getCreateBucketMethod) == null) {
          ConfigServiceV2Grpc.getCreateBucketMethod =
              getCreateBucketMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.CreateBucketRequest, com.google.logging.v2.LogBucket>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBucket"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.CreateBucketRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogBucket.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("CreateBucket"))
                      .build();
        }
      }
    }
    return getCreateBucketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateBucketRequest, com.google.logging.v2.LogBucket>
      getUpdateBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBucket",
      requestType = com.google.logging.v2.UpdateBucketRequest.class,
      responseType = com.google.logging.v2.LogBucket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateBucketRequest, com.google.logging.v2.LogBucket>
      getUpdateBucketMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.UpdateBucketRequest, com.google.logging.v2.LogBucket>
        getUpdateBucketMethod;
    if ((getUpdateBucketMethod = ConfigServiceV2Grpc.getUpdateBucketMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getUpdateBucketMethod = ConfigServiceV2Grpc.getUpdateBucketMethod) == null) {
          ConfigServiceV2Grpc.getUpdateBucketMethod =
              getUpdateBucketMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.UpdateBucketRequest, com.google.logging.v2.LogBucket>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBucket"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.UpdateBucketRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogBucket.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("UpdateBucket"))
                      .build();
        }
      }
    }
    return getUpdateBucketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.DeleteBucketRequest, com.google.protobuf.Empty>
      getDeleteBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBucket",
      requestType = com.google.logging.v2.DeleteBucketRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.DeleteBucketRequest, com.google.protobuf.Empty>
      getDeleteBucketMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.DeleteBucketRequest, com.google.protobuf.Empty>
        getDeleteBucketMethod;
    if ((getDeleteBucketMethod = ConfigServiceV2Grpc.getDeleteBucketMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getDeleteBucketMethod = ConfigServiceV2Grpc.getDeleteBucketMethod) == null) {
          ConfigServiceV2Grpc.getDeleteBucketMethod =
              getDeleteBucketMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.DeleteBucketRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBucket"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.DeleteBucketRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("DeleteBucket"))
                      .build();
        }
      }
    }
    return getDeleteBucketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.UndeleteBucketRequest, com.google.protobuf.Empty>
      getUndeleteBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UndeleteBucket",
      requestType = com.google.logging.v2.UndeleteBucketRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.UndeleteBucketRequest, com.google.protobuf.Empty>
      getUndeleteBucketMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.UndeleteBucketRequest, com.google.protobuf.Empty>
        getUndeleteBucketMethod;
    if ((getUndeleteBucketMethod = ConfigServiceV2Grpc.getUndeleteBucketMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getUndeleteBucketMethod = ConfigServiceV2Grpc.getUndeleteBucketMethod) == null) {
          ConfigServiceV2Grpc.getUndeleteBucketMethod =
              getUndeleteBucketMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.UndeleteBucketRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UndeleteBucket"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.UndeleteBucketRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("UndeleteBucket"))
                      .build();
        }
      }
    }
    return getUndeleteBucketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.ListViewsRequest, com.google.logging.v2.ListViewsResponse>
      getListViewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListViews",
      requestType = com.google.logging.v2.ListViewsRequest.class,
      responseType = com.google.logging.v2.ListViewsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.ListViewsRequest, com.google.logging.v2.ListViewsResponse>
      getListViewsMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.ListViewsRequest, com.google.logging.v2.ListViewsResponse>
        getListViewsMethod;
    if ((getListViewsMethod = ConfigServiceV2Grpc.getListViewsMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getListViewsMethod = ConfigServiceV2Grpc.getListViewsMethod) == null) {
          ConfigServiceV2Grpc.getListViewsMethod =
              getListViewsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.ListViewsRequest,
                          com.google.logging.v2.ListViewsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListViews"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.ListViewsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.ListViewsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new ConfigServiceV2MethodDescriptorSupplier("ListViews"))
                      .build();
        }
      }
    }
    return getListViewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.GetViewRequest, com.google.logging.v2.LogView>
      getGetViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetView",
      requestType = com.google.logging.v2.GetViewRequest.class,
      responseType = com.google.logging.v2.LogView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.GetViewRequest, com.google.logging.v2.LogView>
      getGetViewMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.GetViewRequest, com.google.logging.v2.LogView>
        getGetViewMethod;
    if ((getGetViewMethod = ConfigServiceV2Grpc.getGetViewMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getGetViewMethod = ConfigServiceV2Grpc.getGetViewMethod) == null) {
          ConfigServiceV2Grpc.getGetViewMethod =
              getGetViewMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.GetViewRequest, com.google.logging.v2.LogView>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetView"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.GetViewRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogView.getDefaultInstance()))
                      .setSchemaDescriptor(new ConfigServiceV2MethodDescriptorSupplier("GetView"))
                      .build();
        }
      }
    }
    return getGetViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.CreateViewRequest, com.google.logging.v2.LogView>
      getCreateViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateView",
      requestType = com.google.logging.v2.CreateViewRequest.class,
      responseType = com.google.logging.v2.LogView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.CreateViewRequest, com.google.logging.v2.LogView>
      getCreateViewMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.CreateViewRequest, com.google.logging.v2.LogView>
        getCreateViewMethod;
    if ((getCreateViewMethod = ConfigServiceV2Grpc.getCreateViewMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getCreateViewMethod = ConfigServiceV2Grpc.getCreateViewMethod) == null) {
          ConfigServiceV2Grpc.getCreateViewMethod =
              getCreateViewMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.CreateViewRequest, com.google.logging.v2.LogView>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateView"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.CreateViewRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogView.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("CreateView"))
                      .build();
        }
      }
    }
    return getCreateViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateViewRequest, com.google.logging.v2.LogView>
      getUpdateViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateView",
      requestType = com.google.logging.v2.UpdateViewRequest.class,
      responseType = com.google.logging.v2.LogView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateViewRequest, com.google.logging.v2.LogView>
      getUpdateViewMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.UpdateViewRequest, com.google.logging.v2.LogView>
        getUpdateViewMethod;
    if ((getUpdateViewMethod = ConfigServiceV2Grpc.getUpdateViewMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getUpdateViewMethod = ConfigServiceV2Grpc.getUpdateViewMethod) == null) {
          ConfigServiceV2Grpc.getUpdateViewMethod =
              getUpdateViewMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.UpdateViewRequest, com.google.logging.v2.LogView>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateView"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.UpdateViewRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogView.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("UpdateView"))
                      .build();
        }
      }
    }
    return getUpdateViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.DeleteViewRequest, com.google.protobuf.Empty>
      getDeleteViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteView",
      requestType = com.google.logging.v2.DeleteViewRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.DeleteViewRequest, com.google.protobuf.Empty>
      getDeleteViewMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.DeleteViewRequest, com.google.protobuf.Empty>
        getDeleteViewMethod;
    if ((getDeleteViewMethod = ConfigServiceV2Grpc.getDeleteViewMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getDeleteViewMethod = ConfigServiceV2Grpc.getDeleteViewMethod) == null) {
          ConfigServiceV2Grpc.getDeleteViewMethod =
              getDeleteViewMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.DeleteViewRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteView"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.DeleteViewRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("DeleteView"))
                      .build();
        }
      }
    }
    return getDeleteViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.ListSinksRequest, com.google.logging.v2.ListSinksResponse>
      getListSinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSinks",
      requestType = com.google.logging.v2.ListSinksRequest.class,
      responseType = com.google.logging.v2.ListSinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.ListSinksRequest, com.google.logging.v2.ListSinksResponse>
      getListSinksMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.ListSinksRequest, com.google.logging.v2.ListSinksResponse>
        getListSinksMethod;
    if ((getListSinksMethod = ConfigServiceV2Grpc.getListSinksMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getListSinksMethod = ConfigServiceV2Grpc.getListSinksMethod) == null) {
          ConfigServiceV2Grpc.getListSinksMethod =
              getListSinksMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.ListSinksRequest,
                          com.google.logging.v2.ListSinksResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSinks"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.ListSinksRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.ListSinksResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new ConfigServiceV2MethodDescriptorSupplier("ListSinks"))
                      .build();
        }
      }
    }
    return getListSinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.GetSinkRequest, com.google.logging.v2.LogSink>
      getGetSinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSink",
      requestType = com.google.logging.v2.GetSinkRequest.class,
      responseType = com.google.logging.v2.LogSink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.GetSinkRequest, com.google.logging.v2.LogSink>
      getGetSinkMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.GetSinkRequest, com.google.logging.v2.LogSink>
        getGetSinkMethod;
    if ((getGetSinkMethod = ConfigServiceV2Grpc.getGetSinkMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getGetSinkMethod = ConfigServiceV2Grpc.getGetSinkMethod) == null) {
          ConfigServiceV2Grpc.getGetSinkMethod =
              getGetSinkMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.GetSinkRequest, com.google.logging.v2.LogSink>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSink"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.GetSinkRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogSink.getDefaultInstance()))
                      .setSchemaDescriptor(new ConfigServiceV2MethodDescriptorSupplier("GetSink"))
                      .build();
        }
      }
    }
    return getGetSinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.CreateSinkRequest, com.google.logging.v2.LogSink>
      getCreateSinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSink",
      requestType = com.google.logging.v2.CreateSinkRequest.class,
      responseType = com.google.logging.v2.LogSink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.CreateSinkRequest, com.google.logging.v2.LogSink>
      getCreateSinkMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.CreateSinkRequest, com.google.logging.v2.LogSink>
        getCreateSinkMethod;
    if ((getCreateSinkMethod = ConfigServiceV2Grpc.getCreateSinkMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getCreateSinkMethod = ConfigServiceV2Grpc.getCreateSinkMethod) == null) {
          ConfigServiceV2Grpc.getCreateSinkMethod =
              getCreateSinkMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.CreateSinkRequest, com.google.logging.v2.LogSink>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSink"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.CreateSinkRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogSink.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("CreateSink"))
                      .build();
        }
      }
    }
    return getCreateSinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateSinkRequest, com.google.logging.v2.LogSink>
      getUpdateSinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSink",
      requestType = com.google.logging.v2.UpdateSinkRequest.class,
      responseType = com.google.logging.v2.LogSink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateSinkRequest, com.google.logging.v2.LogSink>
      getUpdateSinkMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.UpdateSinkRequest, com.google.logging.v2.LogSink>
        getUpdateSinkMethod;
    if ((getUpdateSinkMethod = ConfigServiceV2Grpc.getUpdateSinkMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getUpdateSinkMethod = ConfigServiceV2Grpc.getUpdateSinkMethod) == null) {
          ConfigServiceV2Grpc.getUpdateSinkMethod =
              getUpdateSinkMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.UpdateSinkRequest, com.google.logging.v2.LogSink>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSink"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.UpdateSinkRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogSink.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("UpdateSink"))
                      .build();
        }
      }
    }
    return getUpdateSinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.DeleteSinkRequest, com.google.protobuf.Empty>
      getDeleteSinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSink",
      requestType = com.google.logging.v2.DeleteSinkRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.DeleteSinkRequest, com.google.protobuf.Empty>
      getDeleteSinkMethod() {
    io.grpc.MethodDescriptor<com.google.logging.v2.DeleteSinkRequest, com.google.protobuf.Empty>
        getDeleteSinkMethod;
    if ((getDeleteSinkMethod = ConfigServiceV2Grpc.getDeleteSinkMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getDeleteSinkMethod = ConfigServiceV2Grpc.getDeleteSinkMethod) == null) {
          ConfigServiceV2Grpc.getDeleteSinkMethod =
              getDeleteSinkMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.DeleteSinkRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSink"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.DeleteSinkRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("DeleteSink"))
                      .build();
        }
      }
    }
    return getDeleteSinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.ListExclusionsRequest, com.google.logging.v2.ListExclusionsResponse>
      getListExclusionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExclusions",
      requestType = com.google.logging.v2.ListExclusionsRequest.class,
      responseType = com.google.logging.v2.ListExclusionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.ListExclusionsRequest, com.google.logging.v2.ListExclusionsResponse>
      getListExclusionsMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.ListExclusionsRequest,
            com.google.logging.v2.ListExclusionsResponse>
        getListExclusionsMethod;
    if ((getListExclusionsMethod = ConfigServiceV2Grpc.getListExclusionsMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getListExclusionsMethod = ConfigServiceV2Grpc.getListExclusionsMethod) == null) {
          ConfigServiceV2Grpc.getListExclusionsMethod =
              getListExclusionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.ListExclusionsRequest,
                          com.google.logging.v2.ListExclusionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExclusions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.ListExclusionsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.ListExclusionsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("ListExclusions"))
                      .build();
        }
      }
    }
    return getListExclusionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.GetExclusionRequest, com.google.logging.v2.LogExclusion>
      getGetExclusionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExclusion",
      requestType = com.google.logging.v2.GetExclusionRequest.class,
      responseType = com.google.logging.v2.LogExclusion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.GetExclusionRequest, com.google.logging.v2.LogExclusion>
      getGetExclusionMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.GetExclusionRequest, com.google.logging.v2.LogExclusion>
        getGetExclusionMethod;
    if ((getGetExclusionMethod = ConfigServiceV2Grpc.getGetExclusionMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getGetExclusionMethod = ConfigServiceV2Grpc.getGetExclusionMethod) == null) {
          ConfigServiceV2Grpc.getGetExclusionMethod =
              getGetExclusionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.GetExclusionRequest,
                          com.google.logging.v2.LogExclusion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExclusion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.GetExclusionRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogExclusion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("GetExclusion"))
                      .build();
        }
      }
    }
    return getGetExclusionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.CreateExclusionRequest, com.google.logging.v2.LogExclusion>
      getCreateExclusionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExclusion",
      requestType = com.google.logging.v2.CreateExclusionRequest.class,
      responseType = com.google.logging.v2.LogExclusion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.CreateExclusionRequest, com.google.logging.v2.LogExclusion>
      getCreateExclusionMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.CreateExclusionRequest, com.google.logging.v2.LogExclusion>
        getCreateExclusionMethod;
    if ((getCreateExclusionMethod = ConfigServiceV2Grpc.getCreateExclusionMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getCreateExclusionMethod = ConfigServiceV2Grpc.getCreateExclusionMethod) == null) {
          ConfigServiceV2Grpc.getCreateExclusionMethod =
              getCreateExclusionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.CreateExclusionRequest,
                          com.google.logging.v2.LogExclusion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExclusion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.CreateExclusionRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogExclusion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("CreateExclusion"))
                      .build();
        }
      }
    }
    return getCreateExclusionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateExclusionRequest, com.google.logging.v2.LogExclusion>
      getUpdateExclusionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExclusion",
      requestType = com.google.logging.v2.UpdateExclusionRequest.class,
      responseType = com.google.logging.v2.LogExclusion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateExclusionRequest, com.google.logging.v2.LogExclusion>
      getUpdateExclusionMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.UpdateExclusionRequest, com.google.logging.v2.LogExclusion>
        getUpdateExclusionMethod;
    if ((getUpdateExclusionMethod = ConfigServiceV2Grpc.getUpdateExclusionMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getUpdateExclusionMethod = ConfigServiceV2Grpc.getUpdateExclusionMethod) == null) {
          ConfigServiceV2Grpc.getUpdateExclusionMethod =
              getUpdateExclusionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.UpdateExclusionRequest,
                          com.google.logging.v2.LogExclusion>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExclusion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.UpdateExclusionRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.LogExclusion.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("UpdateExclusion"))
                      .build();
        }
      }
    }
    return getUpdateExclusionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.DeleteExclusionRequest, com.google.protobuf.Empty>
      getDeleteExclusionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExclusion",
      requestType = com.google.logging.v2.DeleteExclusionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.DeleteExclusionRequest, com.google.protobuf.Empty>
      getDeleteExclusionMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.DeleteExclusionRequest, com.google.protobuf.Empty>
        getDeleteExclusionMethod;
    if ((getDeleteExclusionMethod = ConfigServiceV2Grpc.getDeleteExclusionMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getDeleteExclusionMethod = ConfigServiceV2Grpc.getDeleteExclusionMethod) == null) {
          ConfigServiceV2Grpc.getDeleteExclusionMethod =
              getDeleteExclusionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.DeleteExclusionRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExclusion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.DeleteExclusionRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("DeleteExclusion"))
                      .build();
        }
      }
    }
    return getDeleteExclusionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.GetCmekSettingsRequest, com.google.logging.v2.CmekSettings>
      getGetCmekSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCmekSettings",
      requestType = com.google.logging.v2.GetCmekSettingsRequest.class,
      responseType = com.google.logging.v2.CmekSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.GetCmekSettingsRequest, com.google.logging.v2.CmekSettings>
      getGetCmekSettingsMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.GetCmekSettingsRequest, com.google.logging.v2.CmekSettings>
        getGetCmekSettingsMethod;
    if ((getGetCmekSettingsMethod = ConfigServiceV2Grpc.getGetCmekSettingsMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getGetCmekSettingsMethod = ConfigServiceV2Grpc.getGetCmekSettingsMethod) == null) {
          ConfigServiceV2Grpc.getGetCmekSettingsMethod =
              getGetCmekSettingsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.GetCmekSettingsRequest,
                          com.google.logging.v2.CmekSettings>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCmekSettings"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.GetCmekSettingsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.CmekSettings.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("GetCmekSettings"))
                      .build();
        }
      }
    }
    return getGetCmekSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateCmekSettingsRequest, com.google.logging.v2.CmekSettings>
      getUpdateCmekSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCmekSettings",
      requestType = com.google.logging.v2.UpdateCmekSettingsRequest.class,
      responseType = com.google.logging.v2.CmekSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.logging.v2.UpdateCmekSettingsRequest, com.google.logging.v2.CmekSettings>
      getUpdateCmekSettingsMethod() {
    io.grpc.MethodDescriptor<
            com.google.logging.v2.UpdateCmekSettingsRequest, com.google.logging.v2.CmekSettings>
        getUpdateCmekSettingsMethod;
    if ((getUpdateCmekSettingsMethod = ConfigServiceV2Grpc.getUpdateCmekSettingsMethod) == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        if ((getUpdateCmekSettingsMethod = ConfigServiceV2Grpc.getUpdateCmekSettingsMethod)
            == null) {
          ConfigServiceV2Grpc.getUpdateCmekSettingsMethod =
              getUpdateCmekSettingsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.logging.v2.UpdateCmekSettingsRequest,
                          com.google.logging.v2.CmekSettings>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCmekSettings"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.UpdateCmekSettingsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.logging.v2.CmekSettings.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConfigServiceV2MethodDescriptorSupplier("UpdateCmekSettings"))
                      .build();
        }
      }
    }
    return getUpdateCmekSettingsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static ConfigServiceV2Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigServiceV2Stub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConfigServiceV2Stub>() {
          @java.lang.Override
          public ConfigServiceV2Stub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConfigServiceV2Stub(channel, callOptions);
          }
        };
    return ConfigServiceV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigServiceV2BlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigServiceV2BlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConfigServiceV2BlockingStub>() {
          @java.lang.Override
          public ConfigServiceV2BlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConfigServiceV2BlockingStub(channel, callOptions);
          }
        };
    return ConfigServiceV2BlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static ConfigServiceV2FutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigServiceV2FutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConfigServiceV2FutureStub>() {
          @java.lang.Override
          public ConfigServiceV2FutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConfigServiceV2FutureStub(channel, callOptions);
          }
        };
    return ConfigServiceV2FutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service for configuring sinks used to route log entries.
   * </pre>
   */
  public abstract static class ConfigServiceV2ImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Lists buckets.
     * </pre>
     */
    public void listBuckets(
        com.google.logging.v2.ListBucketsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListBucketsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListBucketsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a bucket.
     * </pre>
     */
    public void getBucket(
        com.google.logging.v2.GetBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBucketMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a bucket that can be used to store log entries. Once a bucket has
     * been created, the region cannot be changed.
     * </pre>
     */
    public void createBucket(
        com.google.logging.v2.CreateBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBucketMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a bucket. This method replaces the following fields in the
     * existing bucket with values from the new bucket: `retention_period`
     * If the retention period is decreased and the bucket is locked,
     * FAILED_PRECONDITION will be returned.
     * If the bucket has a LifecycleState of DELETE_REQUESTED, FAILED_PRECONDITION
     * will be returned.
     * A buckets region may not be modified after it is created.
     * </pre>
     */
    public void updateBucket(
        com.google.logging.v2.UpdateBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBucketMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a bucket.
     * Moves the bucket to the DELETE_REQUESTED state. After 7 days, the
     * bucket will be purged and all logs in the bucket will be permanently
     * deleted.
     * </pre>
     */
    public void deleteBucket(
        com.google.logging.v2.DeleteBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBucketMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Undeletes a bucket. A bucket that has been deleted may be undeleted within
     * the grace period of 7 days.
     * </pre>
     */
    public void undeleteBucket(
        com.google.logging.v2.UndeleteBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUndeleteBucketMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists views on a bucket.
     * </pre>
     */
    public void listViews(
        com.google.logging.v2.ListViewsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListViewsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListViewsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a view.
     * </pre>
     */
    public void getView(
        com.google.logging.v2.GetViewRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetViewMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a view over logs in a bucket. A bucket may contain a maximum of
     * 50 views.
     * </pre>
     */
    public void createView(
        com.google.logging.v2.CreateViewRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogView> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateViewMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a view. This method replaces the following fields in the existing
     * view with values from the new view: `filter`.
     * </pre>
     */
    public void updateView(
        com.google.logging.v2.UpdateViewRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogView> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateViewMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a view from a bucket.
     * </pre>
     */
    public void deleteView(
        com.google.logging.v2.DeleteViewRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteViewMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists sinks.
     * </pre>
     */
    public void listSinks(
        com.google.logging.v2.ListSinksRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListSinksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSinksMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a sink.
     * </pre>
     */
    public void getSink(
        com.google.logging.v2.GetSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSinkMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a sink that exports specified log entries to a destination. The
     * export of newly-ingested log entries begins immediately, unless the sink's
     * `writer_identity` is not permitted to write to the destination. A sink can
     * export log entries only from the resource owning the sink.
     * </pre>
     */
    public void createSink(
        com.google.logging.v2.CreateSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSinkMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a sink. This method replaces the following fields in the existing
     * sink with values from the new sink: `destination`, and `filter`.
     * The updated sink might also have a new `writer_identity`; see the
     * `unique_writer_identity` field.
     * </pre>
     */
    public void updateSink(
        com.google.logging.v2.UpdateSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSinkMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a sink. If the sink has a unique `writer_identity`, then that
     * service account is also deleted.
     * </pre>
     */
    public void deleteSink(
        com.google.logging.v2.DeleteSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSinkMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all the exclusions in a parent resource.
     * </pre>
     */
    public void listExclusions(
        com.google.logging.v2.ListExclusionsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListExclusionsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListExclusionsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the description of an exclusion.
     * </pre>
     */
    public void getExclusion(
        com.google.logging.v2.GetExclusionRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExclusionMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new exclusion in a specified parent resource.
     * Only log entries belonging to that resource can be excluded.
     * You can have up to 10 exclusions in a resource.
     * </pre>
     */
    public void createExclusion(
        com.google.logging.v2.CreateExclusionRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateExclusionMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Changes one or more properties of an existing exclusion.
     * </pre>
     */
    public void updateExclusion(
        com.google.logging.v2.UpdateExclusionRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateExclusionMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an exclusion.
     * </pre>
     */
    public void deleteExclusion(
        com.google.logging.v2.DeleteExclusionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteExclusionMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the Logs Router CMEK settings for the given resource.
     * Note: CMEK for the Logs Router can currently only be configured for GCP
     * organizations. Once configured, it applies to all projects and folders in
     * the GCP organization.
     * See [Enabling CMEK for Logs
     * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
     * for more information.
     * </pre>
     */
    public void getCmekSettings(
        com.google.logging.v2.GetCmekSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.CmekSettings> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCmekSettingsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the Logs Router CMEK settings for the given resource.
     * Note: CMEK for the Logs Router can currently only be configured for GCP
     * organizations. Once configured, it applies to all projects and folders in
     * the GCP organization.
     * [UpdateCmekSettings][google.logging.v2.ConfigServiceV2.UpdateCmekSettings]
     * will fail if 1) `kms_key_name` is invalid, or 2) the associated service
     * account does not have the required
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` role assigned for the key, or
     * 3) access to the key is disabled.
     * See [Enabling CMEK for Logs
     * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
     * for more information.
     * </pre>
     */
    public void updateCmekSettings(
        com.google.logging.v2.UpdateCmekSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.CmekSettings> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCmekSettingsMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListBucketsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.ListBucketsRequest,
                      com.google.logging.v2.ListBucketsResponse>(this, METHODID_LIST_BUCKETS)))
          .addMethod(
              getGetBucketMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.GetBucketRequest, com.google.logging.v2.LogBucket>(
                      this, METHODID_GET_BUCKET)))
          .addMethod(
              getCreateBucketMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.CreateBucketRequest, com.google.logging.v2.LogBucket>(
                      this, METHODID_CREATE_BUCKET)))
          .addMethod(
              getUpdateBucketMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.UpdateBucketRequest, com.google.logging.v2.LogBucket>(
                      this, METHODID_UPDATE_BUCKET)))
          .addMethod(
              getDeleteBucketMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.DeleteBucketRequest, com.google.protobuf.Empty>(
                      this, METHODID_DELETE_BUCKET)))
          .addMethod(
              getUndeleteBucketMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.UndeleteBucketRequest, com.google.protobuf.Empty>(
                      this, METHODID_UNDELETE_BUCKET)))
          .addMethod(
              getListViewsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.ListViewsRequest,
                      com.google.logging.v2.ListViewsResponse>(this, METHODID_LIST_VIEWS)))
          .addMethod(
              getGetViewMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.GetViewRequest, com.google.logging.v2.LogView>(
                      this, METHODID_GET_VIEW)))
          .addMethod(
              getCreateViewMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.CreateViewRequest, com.google.logging.v2.LogView>(
                      this, METHODID_CREATE_VIEW)))
          .addMethod(
              getUpdateViewMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.UpdateViewRequest, com.google.logging.v2.LogView>(
                      this, METHODID_UPDATE_VIEW)))
          .addMethod(
              getDeleteViewMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.DeleteViewRequest, com.google.protobuf.Empty>(
                      this, METHODID_DELETE_VIEW)))
          .addMethod(
              getListSinksMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.ListSinksRequest,
                      com.google.logging.v2.ListSinksResponse>(this, METHODID_LIST_SINKS)))
          .addMethod(
              getGetSinkMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.GetSinkRequest, com.google.logging.v2.LogSink>(
                      this, METHODID_GET_SINK)))
          .addMethod(
              getCreateSinkMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.CreateSinkRequest, com.google.logging.v2.LogSink>(
                      this, METHODID_CREATE_SINK)))
          .addMethod(
              getUpdateSinkMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.UpdateSinkRequest, com.google.logging.v2.LogSink>(
                      this, METHODID_UPDATE_SINK)))
          .addMethod(
              getDeleteSinkMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.DeleteSinkRequest, com.google.protobuf.Empty>(
                      this, METHODID_DELETE_SINK)))
          .addMethod(
              getListExclusionsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.ListExclusionsRequest,
                      com.google.logging.v2.ListExclusionsResponse>(
                      this, METHODID_LIST_EXCLUSIONS)))
          .addMethod(
              getGetExclusionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.GetExclusionRequest,
                      com.google.logging.v2.LogExclusion>(this, METHODID_GET_EXCLUSION)))
          .addMethod(
              getCreateExclusionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.CreateExclusionRequest,
                      com.google.logging.v2.LogExclusion>(this, METHODID_CREATE_EXCLUSION)))
          .addMethod(
              getUpdateExclusionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.UpdateExclusionRequest,
                      com.google.logging.v2.LogExclusion>(this, METHODID_UPDATE_EXCLUSION)))
          .addMethod(
              getDeleteExclusionMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.DeleteExclusionRequest, com.google.protobuf.Empty>(
                      this, METHODID_DELETE_EXCLUSION)))
          .addMethod(
              getGetCmekSettingsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.GetCmekSettingsRequest,
                      com.google.logging.v2.CmekSettings>(this, METHODID_GET_CMEK_SETTINGS)))
          .addMethod(
              getUpdateCmekSettingsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.logging.v2.UpdateCmekSettingsRequest,
                      com.google.logging.v2.CmekSettings>(this, METHODID_UPDATE_CMEK_SETTINGS)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Service for configuring sinks used to route log entries.
   * </pre>
   */
  public static final class ConfigServiceV2Stub
      extends io.grpc.stub.AbstractAsyncStub<ConfigServiceV2Stub> {
    private ConfigServiceV2Stub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceV2Stub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigServiceV2Stub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists buckets.
     * </pre>
     */
    public void listBuckets(
        com.google.logging.v2.ListBucketsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListBucketsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBucketsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a bucket.
     * </pre>
     */
    public void getBucket(
        com.google.logging.v2.GetBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBucketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a bucket that can be used to store log entries. Once a bucket has
     * been created, the region cannot be changed.
     * </pre>
     */
    public void createBucket(
        com.google.logging.v2.CreateBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBucketMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a bucket. This method replaces the following fields in the
     * existing bucket with values from the new bucket: `retention_period`
     * If the retention period is decreased and the bucket is locked,
     * FAILED_PRECONDITION will be returned.
     * If the bucket has a LifecycleState of DELETE_REQUESTED, FAILED_PRECONDITION
     * will be returned.
     * A buckets region may not be modified after it is created.
     * </pre>
     */
    public void updateBucket(
        com.google.logging.v2.UpdateBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBucketMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a bucket.
     * Moves the bucket to the DELETE_REQUESTED state. After 7 days, the
     * bucket will be purged and all logs in the bucket will be permanently
     * deleted.
     * </pre>
     */
    public void deleteBucket(
        com.google.logging.v2.DeleteBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBucketMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Undeletes a bucket. A bucket that has been deleted may be undeleted within
     * the grace period of 7 days.
     * </pre>
     */
    public void undeleteBucket(
        com.google.logging.v2.UndeleteBucketRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUndeleteBucketMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists views on a bucket.
     * </pre>
     */
    public void listViews(
        com.google.logging.v2.ListViewsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListViewsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListViewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a view.
     * </pre>
     */
    public void getView(
        com.google.logging.v2.GetViewRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a view over logs in a bucket. A bucket may contain a maximum of
     * 50 views.
     * </pre>
     */
    public void createView(
        com.google.logging.v2.CreateViewRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a view. This method replaces the following fields in the existing
     * view with values from the new view: `filter`.
     * </pre>
     */
    public void updateView(
        com.google.logging.v2.UpdateViewRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a view from a bucket.
     * </pre>
     */
    public void deleteView(
        com.google.logging.v2.DeleteViewRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists sinks.
     * </pre>
     */
    public void listSinks(
        com.google.logging.v2.ListSinksRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListSinksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a sink.
     * </pre>
     */
    public void getSink(
        com.google.logging.v2.GetSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a sink that exports specified log entries to a destination. The
     * export of newly-ingested log entries begins immediately, unless the sink's
     * `writer_identity` is not permitted to write to the destination. A sink can
     * export log entries only from the resource owning the sink.
     * </pre>
     */
    public void createSink(
        com.google.logging.v2.CreateSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a sink. This method replaces the following fields in the existing
     * sink with values from the new sink: `destination`, and `filter`.
     * The updated sink might also have a new `writer_identity`; see the
     * `unique_writer_identity` field.
     * </pre>
     */
    public void updateSink(
        com.google.logging.v2.UpdateSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a sink. If the sink has a unique `writer_identity`, then that
     * service account is also deleted.
     * </pre>
     */
    public void deleteSink(
        com.google.logging.v2.DeleteSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all the exclusions in a parent resource.
     * </pre>
     */
    public void listExclusions(
        com.google.logging.v2.ListExclusionsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListExclusionsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListExclusionsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the description of an exclusion.
     * </pre>
     */
    public void getExclusion(
        com.google.logging.v2.GetExclusionRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExclusionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new exclusion in a specified parent resource.
     * Only log entries belonging to that resource can be excluded.
     * You can have up to 10 exclusions in a resource.
     * </pre>
     */
    public void createExclusion(
        com.google.logging.v2.CreateExclusionRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateExclusionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Changes one or more properties of an existing exclusion.
     * </pre>
     */
    public void updateExclusion(
        com.google.logging.v2.UpdateExclusionRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateExclusionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an exclusion.
     * </pre>
     */
    public void deleteExclusion(
        com.google.logging.v2.DeleteExclusionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteExclusionMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the Logs Router CMEK settings for the given resource.
     * Note: CMEK for the Logs Router can currently only be configured for GCP
     * organizations. Once configured, it applies to all projects and folders in
     * the GCP organization.
     * See [Enabling CMEK for Logs
     * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
     * for more information.
     * </pre>
     */
    public void getCmekSettings(
        com.google.logging.v2.GetCmekSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.CmekSettings> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCmekSettingsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the Logs Router CMEK settings for the given resource.
     * Note: CMEK for the Logs Router can currently only be configured for GCP
     * organizations. Once configured, it applies to all projects and folders in
     * the GCP organization.
     * [UpdateCmekSettings][google.logging.v2.ConfigServiceV2.UpdateCmekSettings]
     * will fail if 1) `kms_key_name` is invalid, or 2) the associated service
     * account does not have the required
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` role assigned for the key, or
     * 3) access to the key is disabled.
     * See [Enabling CMEK for Logs
     * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
     * for more information.
     * </pre>
     */
    public void updateCmekSettings(
        com.google.logging.v2.UpdateCmekSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.CmekSettings> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCmekSettingsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Service for configuring sinks used to route log entries.
   * </pre>
   */
  public static final class ConfigServiceV2BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConfigServiceV2BlockingStub> {
    private ConfigServiceV2BlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceV2BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigServiceV2BlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists buckets.
     * </pre>
     */
    public com.google.logging.v2.ListBucketsResponse listBuckets(
        com.google.logging.v2.ListBucketsRequest request) {
      return blockingUnaryCall(getChannel(), getListBucketsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a bucket.
     * </pre>
     */
    public com.google.logging.v2.LogBucket getBucket(
        com.google.logging.v2.GetBucketRequest request) {
      return blockingUnaryCall(getChannel(), getGetBucketMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a bucket that can be used to store log entries. Once a bucket has
     * been created, the region cannot be changed.
     * </pre>
     */
    public com.google.logging.v2.LogBucket createBucket(
        com.google.logging.v2.CreateBucketRequest request) {
      return blockingUnaryCall(getChannel(), getCreateBucketMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a bucket. This method replaces the following fields in the
     * existing bucket with values from the new bucket: `retention_period`
     * If the retention period is decreased and the bucket is locked,
     * FAILED_PRECONDITION will be returned.
     * If the bucket has a LifecycleState of DELETE_REQUESTED, FAILED_PRECONDITION
     * will be returned.
     * A buckets region may not be modified after it is created.
     * </pre>
     */
    public com.google.logging.v2.LogBucket updateBucket(
        com.google.logging.v2.UpdateBucketRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateBucketMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a bucket.
     * Moves the bucket to the DELETE_REQUESTED state. After 7 days, the
     * bucket will be purged and all logs in the bucket will be permanently
     * deleted.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBucket(
        com.google.logging.v2.DeleteBucketRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteBucketMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Undeletes a bucket. A bucket that has been deleted may be undeleted within
     * the grace period of 7 days.
     * </pre>
     */
    public com.google.protobuf.Empty undeleteBucket(
        com.google.logging.v2.UndeleteBucketRequest request) {
      return blockingUnaryCall(getChannel(), getUndeleteBucketMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists views on a bucket.
     * </pre>
     */
    public com.google.logging.v2.ListViewsResponse listViews(
        com.google.logging.v2.ListViewsRequest request) {
      return blockingUnaryCall(getChannel(), getListViewsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a view.
     * </pre>
     */
    public com.google.logging.v2.LogView getView(com.google.logging.v2.GetViewRequest request) {
      return blockingUnaryCall(getChannel(), getGetViewMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a view over logs in a bucket. A bucket may contain a maximum of
     * 50 views.
     * </pre>
     */
    public com.google.logging.v2.LogView createView(
        com.google.logging.v2.CreateViewRequest request) {
      return blockingUnaryCall(getChannel(), getCreateViewMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a view. This method replaces the following fields in the existing
     * view with values from the new view: `filter`.
     * </pre>
     */
    public com.google.logging.v2.LogView updateView(
        com.google.logging.v2.UpdateViewRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateViewMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a view from a bucket.
     * </pre>
     */
    public com.google.protobuf.Empty deleteView(com.google.logging.v2.DeleteViewRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteViewMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists sinks.
     * </pre>
     */
    public com.google.logging.v2.ListSinksResponse listSinks(
        com.google.logging.v2.ListSinksRequest request) {
      return blockingUnaryCall(getChannel(), getListSinksMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a sink.
     * </pre>
     */
    public com.google.logging.v2.LogSink getSink(com.google.logging.v2.GetSinkRequest request) {
      return blockingUnaryCall(getChannel(), getGetSinkMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a sink that exports specified log entries to a destination. The
     * export of newly-ingested log entries begins immediately, unless the sink's
     * `writer_identity` is not permitted to write to the destination. A sink can
     * export log entries only from the resource owning the sink.
     * </pre>
     */
    public com.google.logging.v2.LogSink createSink(
        com.google.logging.v2.CreateSinkRequest request) {
      return blockingUnaryCall(getChannel(), getCreateSinkMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a sink. This method replaces the following fields in the existing
     * sink with values from the new sink: `destination`, and `filter`.
     * The updated sink might also have a new `writer_identity`; see the
     * `unique_writer_identity` field.
     * </pre>
     */
    public com.google.logging.v2.LogSink updateSink(
        com.google.logging.v2.UpdateSinkRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateSinkMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a sink. If the sink has a unique `writer_identity`, then that
     * service account is also deleted.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSink(com.google.logging.v2.DeleteSinkRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteSinkMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all the exclusions in a parent resource.
     * </pre>
     */
    public com.google.logging.v2.ListExclusionsResponse listExclusions(
        com.google.logging.v2.ListExclusionsRequest request) {
      return blockingUnaryCall(getChannel(), getListExclusionsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the description of an exclusion.
     * </pre>
     */
    public com.google.logging.v2.LogExclusion getExclusion(
        com.google.logging.v2.GetExclusionRequest request) {
      return blockingUnaryCall(getChannel(), getGetExclusionMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new exclusion in a specified parent resource.
     * Only log entries belonging to that resource can be excluded.
     * You can have up to 10 exclusions in a resource.
     * </pre>
     */
    public com.google.logging.v2.LogExclusion createExclusion(
        com.google.logging.v2.CreateExclusionRequest request) {
      return blockingUnaryCall(getChannel(), getCreateExclusionMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Changes one or more properties of an existing exclusion.
     * </pre>
     */
    public com.google.logging.v2.LogExclusion updateExclusion(
        com.google.logging.v2.UpdateExclusionRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateExclusionMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an exclusion.
     * </pre>
     */
    public com.google.protobuf.Empty deleteExclusion(
        com.google.logging.v2.DeleteExclusionRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteExclusionMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the Logs Router CMEK settings for the given resource.
     * Note: CMEK for the Logs Router can currently only be configured for GCP
     * organizations. Once configured, it applies to all projects and folders in
     * the GCP organization.
     * See [Enabling CMEK for Logs
     * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
     * for more information.
     * </pre>
     */
    public com.google.logging.v2.CmekSettings getCmekSettings(
        com.google.logging.v2.GetCmekSettingsRequest request) {
      return blockingUnaryCall(getChannel(), getGetCmekSettingsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the Logs Router CMEK settings for the given resource.
     * Note: CMEK for the Logs Router can currently only be configured for GCP
     * organizations. Once configured, it applies to all projects and folders in
     * the GCP organization.
     * [UpdateCmekSettings][google.logging.v2.ConfigServiceV2.UpdateCmekSettings]
     * will fail if 1) `kms_key_name` is invalid, or 2) the associated service
     * account does not have the required
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` role assigned for the key, or
     * 3) access to the key is disabled.
     * See [Enabling CMEK for Logs
     * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
     * for more information.
     * </pre>
     */
    public com.google.logging.v2.CmekSettings updateCmekSettings(
        com.google.logging.v2.UpdateCmekSettingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCmekSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Service for configuring sinks used to route log entries.
   * </pre>
   */
  public static final class ConfigServiceV2FutureStub
      extends io.grpc.stub.AbstractFutureStub<ConfigServiceV2FutureStub> {
    private ConfigServiceV2FutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceV2FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigServiceV2FutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists buckets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.logging.v2.ListBucketsResponse>
        listBuckets(com.google.logging.v2.ListBucketsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListBucketsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogBucket>
        getBucket(com.google.logging.v2.GetBucketRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetBucketMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a bucket that can be used to store log entries. Once a bucket has
     * been created, the region cannot be changed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogBucket>
        createBucket(com.google.logging.v2.CreateBucketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBucketMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a bucket. This method replaces the following fields in the
     * existing bucket with values from the new bucket: `retention_period`
     * If the retention period is decreased and the bucket is locked,
     * FAILED_PRECONDITION will be returned.
     * If the bucket has a LifecycleState of DELETE_REQUESTED, FAILED_PRECONDITION
     * will be returned.
     * A buckets region may not be modified after it is created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogBucket>
        updateBucket(com.google.logging.v2.UpdateBucketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBucketMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a bucket.
     * Moves the bucket to the DELETE_REQUESTED state. After 7 days, the
     * bucket will be purged and all logs in the bucket will be permanently
     * deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteBucket(com.google.logging.v2.DeleteBucketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBucketMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Undeletes a bucket. A bucket that has been deleted may be undeleted within
     * the grace period of 7 days.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        undeleteBucket(com.google.logging.v2.UndeleteBucketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUndeleteBucketMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists views on a bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.logging.v2.ListViewsResponse>
        listViews(com.google.logging.v2.ListViewsRequest request) {
      return futureUnaryCall(getChannel().newCall(getListViewsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a view.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogView>
        getView(com.google.logging.v2.GetViewRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetViewMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a view over logs in a bucket. A bucket may contain a maximum of
     * 50 views.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogView>
        createView(com.google.logging.v2.CreateViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateViewMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a view. This method replaces the following fields in the existing
     * view with values from the new view: `filter`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogView>
        updateView(com.google.logging.v2.UpdateViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateViewMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a view from a bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteView(
        com.google.logging.v2.DeleteViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteViewMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists sinks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.logging.v2.ListSinksResponse>
        listSinks(com.google.logging.v2.ListSinksRequest request) {
      return futureUnaryCall(getChannel().newCall(getListSinksMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a sink.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogSink>
        getSink(com.google.logging.v2.GetSinkRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetSinkMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a sink that exports specified log entries to a destination. The
     * export of newly-ingested log entries begins immediately, unless the sink's
     * `writer_identity` is not permitted to write to the destination. A sink can
     * export log entries only from the resource owning the sink.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogSink>
        createSink(com.google.logging.v2.CreateSinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSinkMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a sink. This method replaces the following fields in the existing
     * sink with values from the new sink: `destination`, and `filter`.
     * The updated sink might also have a new `writer_identity`; see the
     * `unique_writer_identity` field.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogSink>
        updateSink(com.google.logging.v2.UpdateSinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSinkMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a sink. If the sink has a unique `writer_identity`, then that
     * service account is also deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSink(
        com.google.logging.v2.DeleteSinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSinkMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all the exclusions in a parent resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.logging.v2.ListExclusionsResponse>
        listExclusions(com.google.logging.v2.ListExclusionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListExclusionsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the description of an exclusion.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogExclusion>
        getExclusion(com.google.logging.v2.GetExclusionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExclusionMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new exclusion in a specified parent resource.
     * Only log entries belonging to that resource can be excluded.
     * You can have up to 10 exclusions in a resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogExclusion>
        createExclusion(com.google.logging.v2.CreateExclusionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateExclusionMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Changes one or more properties of an existing exclusion.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogExclusion>
        updateExclusion(com.google.logging.v2.UpdateExclusionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateExclusionMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an exclusion.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteExclusion(com.google.logging.v2.DeleteExclusionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteExclusionMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the Logs Router CMEK settings for the given resource.
     * Note: CMEK for the Logs Router can currently only be configured for GCP
     * organizations. Once configured, it applies to all projects and folders in
     * the GCP organization.
     * See [Enabling CMEK for Logs
     * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
     * for more information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.CmekSettings>
        getCmekSettings(com.google.logging.v2.GetCmekSettingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCmekSettingsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the Logs Router CMEK settings for the given resource.
     * Note: CMEK for the Logs Router can currently only be configured for GCP
     * organizations. Once configured, it applies to all projects and folders in
     * the GCP organization.
     * [UpdateCmekSettings][google.logging.v2.ConfigServiceV2.UpdateCmekSettings]
     * will fail if 1) `kms_key_name` is invalid, or 2) the associated service
     * account does not have the required
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` role assigned for the key, or
     * 3) access to the key is disabled.
     * See [Enabling CMEK for Logs
     * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
     * for more information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.CmekSettings>
        updateCmekSettings(com.google.logging.v2.UpdateCmekSettingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCmekSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_BUCKETS = 0;
  private static final int METHODID_GET_BUCKET = 1;
  private static final int METHODID_CREATE_BUCKET = 2;
  private static final int METHODID_UPDATE_BUCKET = 3;
  private static final int METHODID_DELETE_BUCKET = 4;
  private static final int METHODID_UNDELETE_BUCKET = 5;
  private static final int METHODID_LIST_VIEWS = 6;
  private static final int METHODID_GET_VIEW = 7;
  private static final int METHODID_CREATE_VIEW = 8;
  private static final int METHODID_UPDATE_VIEW = 9;
  private static final int METHODID_DELETE_VIEW = 10;
  private static final int METHODID_LIST_SINKS = 11;
  private static final int METHODID_GET_SINK = 12;
  private static final int METHODID_CREATE_SINK = 13;
  private static final int METHODID_UPDATE_SINK = 14;
  private static final int METHODID_DELETE_SINK = 15;
  private static final int METHODID_LIST_EXCLUSIONS = 16;
  private static final int METHODID_GET_EXCLUSION = 17;
  private static final int METHODID_CREATE_EXCLUSION = 18;
  private static final int METHODID_UPDATE_EXCLUSION = 19;
  private static final int METHODID_DELETE_EXCLUSION = 20;
  private static final int METHODID_GET_CMEK_SETTINGS = 21;
  private static final int METHODID_UPDATE_CMEK_SETTINGS = 22;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigServiceV2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigServiceV2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_BUCKETS:
          serviceImpl.listBuckets(
              (com.google.logging.v2.ListBucketsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.ListBucketsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_BUCKET:
          serviceImpl.getBucket(
              (com.google.logging.v2.GetBucketRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket>) responseObserver);
          break;
        case METHODID_CREATE_BUCKET:
          serviceImpl.createBucket(
              (com.google.logging.v2.CreateBucketRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket>) responseObserver);
          break;
        case METHODID_UPDATE_BUCKET:
          serviceImpl.updateBucket(
              (com.google.logging.v2.UpdateBucketRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogBucket>) responseObserver);
          break;
        case METHODID_DELETE_BUCKET:
          serviceImpl.deleteBucket(
              (com.google.logging.v2.DeleteBucketRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNDELETE_BUCKET:
          serviceImpl.undeleteBucket(
              (com.google.logging.v2.UndeleteBucketRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_VIEWS:
          serviceImpl.listViews(
              (com.google.logging.v2.ListViewsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.ListViewsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_VIEW:
          serviceImpl.getView(
              (com.google.logging.v2.GetViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogView>) responseObserver);
          break;
        case METHODID_CREATE_VIEW:
          serviceImpl.createView(
              (com.google.logging.v2.CreateViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogView>) responseObserver);
          break;
        case METHODID_UPDATE_VIEW:
          serviceImpl.updateView(
              (com.google.logging.v2.UpdateViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogView>) responseObserver);
          break;
        case METHODID_DELETE_VIEW:
          serviceImpl.deleteView(
              (com.google.logging.v2.DeleteViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SINKS:
          serviceImpl.listSinks(
              (com.google.logging.v2.ListSinksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.ListSinksResponse>)
                  responseObserver);
          break;
        case METHODID_GET_SINK:
          serviceImpl.getSink(
              (com.google.logging.v2.GetSinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink>) responseObserver);
          break;
        case METHODID_CREATE_SINK:
          serviceImpl.createSink(
              (com.google.logging.v2.CreateSinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink>) responseObserver);
          break;
        case METHODID_UPDATE_SINK:
          serviceImpl.updateSink(
              (com.google.logging.v2.UpdateSinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink>) responseObserver);
          break;
        case METHODID_DELETE_SINK:
          serviceImpl.deleteSink(
              (com.google.logging.v2.DeleteSinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_EXCLUSIONS:
          serviceImpl.listExclusions(
              (com.google.logging.v2.ListExclusionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.ListExclusionsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_EXCLUSION:
          serviceImpl.getExclusion(
              (com.google.logging.v2.GetExclusionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion>) responseObserver);
          break;
        case METHODID_CREATE_EXCLUSION:
          serviceImpl.createExclusion(
              (com.google.logging.v2.CreateExclusionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion>) responseObserver);
          break;
        case METHODID_UPDATE_EXCLUSION:
          serviceImpl.updateExclusion(
              (com.google.logging.v2.UpdateExclusionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogExclusion>) responseObserver);
          break;
        case METHODID_DELETE_EXCLUSION:
          serviceImpl.deleteExclusion(
              (com.google.logging.v2.DeleteExclusionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_CMEK_SETTINGS:
          serviceImpl.getCmekSettings(
              (com.google.logging.v2.GetCmekSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.CmekSettings>) responseObserver);
          break;
        case METHODID_UPDATE_CMEK_SETTINGS:
          serviceImpl.updateCmekSettings(
              (com.google.logging.v2.UpdateCmekSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.CmekSettings>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class ConfigServiceV2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigServiceV2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.logging.v2.LoggingConfigProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConfigServiceV2");
    }
  }

  private static final class ConfigServiceV2FileDescriptorSupplier
      extends ConfigServiceV2BaseDescriptorSupplier {
    ConfigServiceV2FileDescriptorSupplier() {}
  }

  private static final class ConfigServiceV2MethodDescriptorSupplier
      extends ConfigServiceV2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigServiceV2MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new ConfigServiceV2FileDescriptorSupplier())
                      .addMethod(getListBucketsMethod())
                      .addMethod(getGetBucketMethod())
                      .addMethod(getCreateBucketMethod())
                      .addMethod(getUpdateBucketMethod())
                      .addMethod(getDeleteBucketMethod())
                      .addMethod(getUndeleteBucketMethod())
                      .addMethod(getListViewsMethod())
                      .addMethod(getGetViewMethod())
                      .addMethod(getCreateViewMethod())
                      .addMethod(getUpdateViewMethod())
                      .addMethod(getDeleteViewMethod())
                      .addMethod(getListSinksMethod())
                      .addMethod(getGetSinkMethod())
                      .addMethod(getCreateSinkMethod())
                      .addMethod(getUpdateSinkMethod())
                      .addMethod(getDeleteSinkMethod())
                      .addMethod(getListExclusionsMethod())
                      .addMethod(getGetExclusionMethod())
                      .addMethod(getCreateExclusionMethod())
                      .addMethod(getUpdateExclusionMethod())
                      .addMethod(getDeleteExclusionMethod())
                      .addMethod(getGetCmekSettingsMethod())
                      .addMethod(getUpdateCmekSettingsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
