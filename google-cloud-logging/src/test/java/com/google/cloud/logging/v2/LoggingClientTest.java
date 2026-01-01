/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.logging.v2;

import static com.google.cloud.logging.v2.LoggingClient.ListLogEntriesPagedResponse;
import static com.google.cloud.logging.v2.LoggingClient.ListLogsPagedResponse;
import static com.google.cloud.logging.v2.LoggingClient.ListMonitoredResourceDescriptorsPagedResponse;

import com.google.api.MonitoredResource;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.grpc.testing.MockStreamObserver;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiStreamObserver;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.logging.v2.BillingAccountName;
import com.google.logging.v2.DeleteLogRequest;
import com.google.logging.v2.FolderName;
import com.google.logging.v2.ListLogEntriesRequest;
import com.google.logging.v2.ListLogEntriesResponse;
import com.google.logging.v2.ListLogsRequest;
import com.google.logging.v2.ListLogsResponse;
import com.google.logging.v2.ListMonitoredResourceDescriptorsRequest;
import com.google.logging.v2.ListMonitoredResourceDescriptorsResponse;
import com.google.logging.v2.LogEntry;
import com.google.logging.v2.LogName;
import com.google.logging.v2.OrganizationName;
import com.google.logging.v2.ProjectName;
import com.google.logging.v2.TailLogEntriesRequest;
import com.google.logging.v2.TailLogEntriesResponse;
import com.google.logging.v2.WriteLogEntriesRequest;
import com.google.logging.v2.WriteLogEntriesResponse;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Duration;
import com.google.protobuf.Empty;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Generated("by gapic-generator-java")
class LoggingClientTest {
  private static MockLoggingServiceV2 mockLoggingServiceV2;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private LoggingClient client;

  @BeforeAll
  public static void startStaticServer() {
    mockLoggingServiceV2 = new MockLoggingServiceV2();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockLoggingServiceV2));
    mockServiceHelper.start();
  }

  @AfterAll
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @BeforeEach
  void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    LoggingSettings settings =
        LoggingSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LoggingClient.create(settings);
  }

  @AfterEach
  void tearDown() throws Exception {
    client.close();
  }

  @Test
  void deleteLogTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    LogName logName = LogName.ofProjectLogName("[PROJECT]", "[LOG]");

    client.deleteLog(logName);

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    DeleteLogRequest actualRequest = ((DeleteLogRequest) actualRequests.get(0));

    Assertions.assertEquals(logName.toString(), actualRequest.getLogName());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void deleteLogExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      LogName logName = LogName.ofProjectLogName("[PROJECT]", "[LOG]");
      client.deleteLog(logName);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void deleteLogTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    String logName = "logName341528559";

    client.deleteLog(logName);

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    DeleteLogRequest actualRequest = ((DeleteLogRequest) actualRequests.get(0));

    Assertions.assertEquals(logName, actualRequest.getLogName());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void deleteLogExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      String logName = "logName341528559";
      client.deleteLog(logName);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void writeLogEntriesTest() throws Exception {
    WriteLogEntriesResponse expectedResponse = WriteLogEntriesResponse.newBuilder().build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    LogName logName = LogName.ofProjectLogName("[PROJECT]", "[LOG]");
    MonitoredResource resource = MonitoredResource.newBuilder().build();
    Map<String, String> labels = new HashMap<>();
    List<LogEntry> entries = new ArrayList<>();

    WriteLogEntriesResponse actualResponse =
        client.writeLogEntries(logName, resource, labels, entries);
    Assertions.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    WriteLogEntriesRequest actualRequest = ((WriteLogEntriesRequest) actualRequests.get(0));

    Assertions.assertEquals(logName.toString(), actualRequest.getLogName());
    Assertions.assertEquals(resource, actualRequest.getResource());
    Assertions.assertEquals(labels, actualRequest.getLabelsMap());
    Assertions.assertEquals(entries, actualRequest.getEntriesList());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void writeLogEntriesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      LogName logName = LogName.ofProjectLogName("[PROJECT]", "[LOG]");
      MonitoredResource resource = MonitoredResource.newBuilder().build();
      Map<String, String> labels = new HashMap<>();
      List<LogEntry> entries = new ArrayList<>();
      client.writeLogEntries(logName, resource, labels, entries);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void writeLogEntriesTest2() throws Exception {
    WriteLogEntriesResponse expectedResponse = WriteLogEntriesResponse.newBuilder().build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    String logName = "logName341528559";
    MonitoredResource resource = MonitoredResource.newBuilder().build();
    Map<String, String> labels = new HashMap<>();
    List<LogEntry> entries = new ArrayList<>();

    WriteLogEntriesResponse actualResponse =
        client.writeLogEntries(logName, resource, labels, entries);
    Assertions.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    WriteLogEntriesRequest actualRequest = ((WriteLogEntriesRequest) actualRequests.get(0));

    Assertions.assertEquals(logName, actualRequest.getLogName());
    Assertions.assertEquals(resource, actualRequest.getResource());
    Assertions.assertEquals(labels, actualRequest.getLabelsMap());
    Assertions.assertEquals(entries, actualRequest.getEntriesList());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void writeLogEntriesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      String logName = "logName341528559";
      MonitoredResource resource = MonitoredResource.newBuilder().build();
      Map<String, String> labels = new HashMap<>();
      List<LogEntry> entries = new ArrayList<>();
      client.writeLogEntries(logName, resource, labels, entries);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void listLogEntriesTest() throws Exception {
    LogEntry responsesElement = LogEntry.newBuilder().build();
    ListLogEntriesResponse expectedResponse =
        ListLogEntriesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEntries(Arrays.asList(responsesElement))
            .build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    List<String> resourceNames = new ArrayList<>();
    String filter = "filter-1274492040";
    String orderBy = "orderBy-1207110587";

    ListLogEntriesPagedResponse pagedListResponse =
        client.listLogEntries(resourceNames, filter, orderBy);

    List<LogEntry> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assertions.assertEquals(1, resources.size());
    Assertions.assertEquals(expectedResponse.getEntriesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    ListLogEntriesRequest actualRequest = ((ListLogEntriesRequest) actualRequests.get(0));

    Assertions.assertEquals(resourceNames, actualRequest.getResourceNamesList());
    Assertions.assertEquals(filter, actualRequest.getFilter());
    Assertions.assertEquals(orderBy, actualRequest.getOrderBy());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void listLogEntriesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      List<String> resourceNames = new ArrayList<>();
      String filter = "filter-1274492040";
      String orderBy = "orderBy-1207110587";
      client.listLogEntries(resourceNames, filter, orderBy);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void listMonitoredResourceDescriptorsTest() throws Exception {
    MonitoredResourceDescriptor responsesElement = MonitoredResourceDescriptor.newBuilder().build();
    ListMonitoredResourceDescriptorsResponse expectedResponse =
        ListMonitoredResourceDescriptorsResponse.newBuilder()
            .setNextPageToken("")
            .addAllResourceDescriptors(Arrays.asList(responsesElement))
            .build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder()
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListMonitoredResourceDescriptorsPagedResponse pagedListResponse =
        client.listMonitoredResourceDescriptors(request);

    List<MonitoredResourceDescriptor> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assertions.assertEquals(1, resources.size());
    Assertions.assertEquals(expectedResponse.getResourceDescriptorsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    ListMonitoredResourceDescriptorsRequest actualRequest =
        ((ListMonitoredResourceDescriptorsRequest) actualRequests.get(0));

    Assertions.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assertions.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void listMonitoredResourceDescriptorsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      ListMonitoredResourceDescriptorsRequest request =
          ListMonitoredResourceDescriptorsRequest.newBuilder()
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.listMonitoredResourceDescriptors(request);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void listLogsTest() throws Exception {
    String responsesElement = "responsesElement-318365110";
    ListLogsResponse expectedResponse =
        ListLogsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLogNames(Arrays.asList(responsesElement))
            .build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    BillingAccountName parent = BillingAccountName.of("[BILLING_ACCOUNT]");

    ListLogsPagedResponse pagedListResponse = client.listLogs(parent);

    List<String> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assertions.assertEquals(1, resources.size());
    Assertions.assertEquals(expectedResponse.getLogNamesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    ListLogsRequest actualRequest = ((ListLogsRequest) actualRequests.get(0));

    Assertions.assertEquals(parent.toString(), actualRequest.getParent());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void listLogsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      BillingAccountName parent = BillingAccountName.of("[BILLING_ACCOUNT]");
      client.listLogs(parent);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void listLogsTest2() throws Exception {
    String responsesElement = "responsesElement-318365110";
    ListLogsResponse expectedResponse =
        ListLogsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLogNames(Arrays.asList(responsesElement))
            .build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    FolderName parent = FolderName.of("[FOLDER]");

    ListLogsPagedResponse pagedListResponse = client.listLogs(parent);

    List<String> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assertions.assertEquals(1, resources.size());
    Assertions.assertEquals(expectedResponse.getLogNamesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    ListLogsRequest actualRequest = ((ListLogsRequest) actualRequests.get(0));

    Assertions.assertEquals(parent.toString(), actualRequest.getParent());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void listLogsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      FolderName parent = FolderName.of("[FOLDER]");
      client.listLogs(parent);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void listLogsTest3() throws Exception {
    String responsesElement = "responsesElement-318365110";
    ListLogsResponse expectedResponse =
        ListLogsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLogNames(Arrays.asList(responsesElement))
            .build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    OrganizationName parent = OrganizationName.of("[ORGANIZATION]");

    ListLogsPagedResponse pagedListResponse = client.listLogs(parent);

    List<String> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assertions.assertEquals(1, resources.size());
    Assertions.assertEquals(expectedResponse.getLogNamesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    ListLogsRequest actualRequest = ((ListLogsRequest) actualRequests.get(0));

    Assertions.assertEquals(parent.toString(), actualRequest.getParent());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void listLogsExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
      client.listLogs(parent);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void listLogsTest4() throws Exception {
    String responsesElement = "responsesElement-318365110";
    ListLogsResponse expectedResponse =
        ListLogsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLogNames(Arrays.asList(responsesElement))
            .build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");

    ListLogsPagedResponse pagedListResponse = client.listLogs(parent);

    List<String> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assertions.assertEquals(1, resources.size());
    Assertions.assertEquals(expectedResponse.getLogNamesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    ListLogsRequest actualRequest = ((ListLogsRequest) actualRequests.get(0));

    Assertions.assertEquals(parent.toString(), actualRequest.getParent());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void listLogsExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      client.listLogs(parent);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void listLogsTest5() throws Exception {
    String responsesElement = "responsesElement-318365110";
    ListLogsResponse expectedResponse =
        ListLogsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLogNames(Arrays.asList(responsesElement))
            .build();
    mockLoggingServiceV2.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListLogsPagedResponse pagedListResponse = client.listLogs(parent);

    List<String> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assertions.assertEquals(1, resources.size());
    Assertions.assertEquals(expectedResponse.getLogNamesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLoggingServiceV2.getRequests();
    Assertions.assertEquals(1, actualRequests.size());
    ListLogsRequest actualRequest = ((ListLogsRequest) actualRequests.get(0));

    Assertions.assertEquals(parent, actualRequest.getParent());
    Assertions.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  void listLogsExceptionTest5() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listLogs(parent);
      Assertions.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  void tailLogEntriesTest() throws Exception {
    TailLogEntriesResponse expectedResponse =
        TailLogEntriesResponse.newBuilder()
            .addAllEntries(new ArrayList<LogEntry>())
            .addAllSuppressionInfo(new ArrayList<TailLogEntriesResponse.SuppressionInfo>())
            .build();
    mockLoggingServiceV2.addResponse(expectedResponse);
    TailLogEntriesRequest request =
        TailLogEntriesRequest.newBuilder()
            .addAllResourceNames(new ArrayList<String>())
            .setFilter("filter-1274492040")
            .setBufferWindow(Duration.newBuilder().build())
            .build();

    MockStreamObserver<TailLogEntriesResponse> responseObserver = new MockStreamObserver<>();

    BidiStreamingCallable<TailLogEntriesRequest, TailLogEntriesResponse> callable =
        client.tailLogEntriesCallable();
    ApiStreamObserver<TailLogEntriesRequest> requestObserver =
        callable.bidiStreamingCall(responseObserver);

    requestObserver.onNext(request);
    requestObserver.onCompleted();

    List<TailLogEntriesResponse> actualResponses = responseObserver.future().get();
    Assertions.assertEquals(1, actualResponses.size());
    Assertions.assertEquals(expectedResponse, actualResponses.get(0));
  }

  @Test
  void tailLogEntriesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLoggingServiceV2.addException(exception);
    TailLogEntriesRequest request =
        TailLogEntriesRequest.newBuilder()
            .addAllResourceNames(new ArrayList<String>())
            .setFilter("filter-1274492040")
            .setBufferWindow(Duration.newBuilder().build())
            .build();

    MockStreamObserver<TailLogEntriesResponse> responseObserver = new MockStreamObserver<>();

    BidiStreamingCallable<TailLogEntriesRequest, TailLogEntriesResponse> callable =
        client.tailLogEntriesCallable();
    ApiStreamObserver<TailLogEntriesRequest> requestObserver =
        callable.bidiStreamingCall(responseObserver);

    requestObserver.onNext(request);

    try {
      List<TailLogEntriesResponse> actualResponses = responseObserver.future().get();
      Assertions.fail("No exception thrown");
    } catch (ExecutionException e) {
      Assertions.assertTrue(e.getCause() instanceof InvalidArgumentException);
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assertions.assertEquals(
          StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
