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
package com.google.cloud.logging.v2;

import static com.google.cloud.logging.v2.MetricsClient.ListLogMetricsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.logging.v2.CreateLogMetricRequest;
import com.google.logging.v2.DeleteLogMetricRequest;
import com.google.logging.v2.GetLogMetricRequest;
import com.google.logging.v2.ListLogMetricsRequest;
import com.google.logging.v2.ListLogMetricsResponse;
import com.google.logging.v2.LogMetric;
import com.google.logging.v2.MetricName;
import com.google.logging.v2.MetricNames;
import com.google.logging.v2.ParentName;
import com.google.logging.v2.ParentNames;
import com.google.logging.v2.ProjectMetricName;
import com.google.logging.v2.ProjectName;
import com.google.logging.v2.UpdateLogMetricRequest;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class MetricsClientTest {
  private static MockLoggingServiceV2 mockLoggingServiceV2;
  private static MockConfigServiceV2 mockConfigServiceV2;
  private static MockMetricsServiceV2 mockMetricsServiceV2;
  private static MockServiceHelper serviceHelper;
  private MetricsClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockLoggingServiceV2 = new MockLoggingServiceV2();
    mockConfigServiceV2 = new MockConfigServiceV2();
    mockMetricsServiceV2 = new MockMetricsServiceV2();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(
                mockLoggingServiceV2, mockConfigServiceV2, mockMetricsServiceV2));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    MetricsSettings settings =
        MetricsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = MetricsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void listLogMetricsTest() {
    String nextPageToken = "";
    LogMetric metricsElement = LogMetric.newBuilder().build();
    List<LogMetric> metrics = Arrays.asList(metricsElement);
    ListLogMetricsResponse expectedResponse =
        ListLogMetricsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllMetrics(metrics)
            .build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    ParentName parent = ProjectName.of("[PROJECT]");

    ListLogMetricsPagedResponse pagedListResponse = client.listLogMetrics(parent);

    List<LogMetric> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getMetricsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListLogMetricsRequest actualRequest = (ListLogMetricsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ParentNames.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listLogMetricsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockMetricsServiceV2.addException(exception);

    try {
      ParentName parent = ProjectName.of("[PROJECT]");

      client.listLogMetrics(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getLogMetricTest() {
    MetricName name = ProjectMetricName.of("[PROJECT]", "[METRIC]");
    String description = "description-1724546052";
    String filter = "filter-1274492040";
    String valueExtractor = "valueExtractor2047672534";
    LogMetric expectedResponse =
        LogMetric.newBuilder()
            .setName(name.toString())
            .setDescription(description)
            .setFilter(filter)
            .setValueExtractor(valueExtractor)
            .build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    MetricName metricName = ProjectMetricName.of("[PROJECT]", "[METRIC]");

    LogMetric actualResponse = client.getLogMetric(metricName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLogMetricRequest actualRequest = (GetLogMetricRequest) actualRequests.get(0);

    Assert.assertEquals(metricName, MetricNames.parse(actualRequest.getMetricName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getLogMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockMetricsServiceV2.addException(exception);

    try {
      MetricName metricName = ProjectMetricName.of("[PROJECT]", "[METRIC]");

      client.getLogMetric(metricName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createLogMetricTest() {
    MetricName name = ProjectMetricName.of("[PROJECT]", "[METRIC]");
    String description = "description-1724546052";
    String filter = "filter-1274492040";
    String valueExtractor = "valueExtractor2047672534";
    LogMetric expectedResponse =
        LogMetric.newBuilder()
            .setName(name.toString())
            .setDescription(description)
            .setFilter(filter)
            .setValueExtractor(valueExtractor)
            .build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    ParentName parent = ProjectName.of("[PROJECT]");
    LogMetric metric = LogMetric.newBuilder().build();

    LogMetric actualResponse = client.createLogMetric(parent, metric);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateLogMetricRequest actualRequest = (CreateLogMetricRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ParentNames.parse(actualRequest.getParent()));
    Assert.assertEquals(metric, actualRequest.getMetric());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createLogMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockMetricsServiceV2.addException(exception);

    try {
      ParentName parent = ProjectName.of("[PROJECT]");
      LogMetric metric = LogMetric.newBuilder().build();

      client.createLogMetric(parent, metric);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateLogMetricTest() {
    MetricName name = ProjectMetricName.of("[PROJECT]", "[METRIC]");
    String description = "description-1724546052";
    String filter = "filter-1274492040";
    String valueExtractor = "valueExtractor2047672534";
    LogMetric expectedResponse =
        LogMetric.newBuilder()
            .setName(name.toString())
            .setDescription(description)
            .setFilter(filter)
            .setValueExtractor(valueExtractor)
            .build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    MetricName metricName = ProjectMetricName.of("[PROJECT]", "[METRIC]");
    LogMetric metric = LogMetric.newBuilder().build();

    LogMetric actualResponse = client.updateLogMetric(metricName, metric);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateLogMetricRequest actualRequest = (UpdateLogMetricRequest) actualRequests.get(0);

    Assert.assertEquals(metricName, MetricNames.parse(actualRequest.getMetricName()));
    Assert.assertEquals(metric, actualRequest.getMetric());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateLogMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockMetricsServiceV2.addException(exception);

    try {
      MetricName metricName = ProjectMetricName.of("[PROJECT]", "[METRIC]");
      LogMetric metric = LogMetric.newBuilder().build();

      client.updateLogMetric(metricName, metric);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteLogMetricTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    MetricName metricName = ProjectMetricName.of("[PROJECT]", "[METRIC]");

    client.deleteLogMetric(metricName);

    List<AbstractMessage> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteLogMetricRequest actualRequest = (DeleteLogMetricRequest) actualRequests.get(0);

    Assert.assertEquals(metricName, MetricNames.parse(actualRequest.getMetricName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteLogMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockMetricsServiceV2.addException(exception);

    try {
      MetricName metricName = ProjectMetricName.of("[PROJECT]", "[METRIC]");

      client.deleteLogMetric(metricName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
