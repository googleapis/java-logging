/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.logging;


import static com.google.logging.v2.LoggingServiceV2Grpc.SERVICE_NAME;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import io.opentelemetry.api.OpenTelemetry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.threeten.bp.Duration;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.*;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.testing.exporter.InMemorySpanExporter;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SpanProcessor;
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.samplers.Sampler;


@RunWith(JUnit4.class)
public class ContextTest {

  private static final HttpRequest.RequestMethod REQUEST_METHOD = HttpRequest.RequestMethod.GET;
  private static final String REQUEST_URL = "https://test.domain?arg=val";
  private static final String CLIENT_IP = "123.123.123.123";
  private static final String SERVER_IP = "123.321.321.321";
  private static final String REQUEST_REFERER = "Referer: https://referer.test.domain";
  // DO NOT use dash in trace and span id because W3C traceparent format uses dash as a delimieter
  private static final String TEST_TRACE_ID = "test_trace_id";
  private static final String TEST_SPAN_ID = "test_span_id";
  private static final boolean TEST_TRACE_SAMPLED = true;

  private static final HttpRequest REQUEST =
      HttpRequest.newBuilder()
          .setRequestMethod(REQUEST_METHOD)
          .setRequestUrl(REQUEST_URL)
          .setRequestSize(101L)
          .setStatus(200)
          .setResponseSize(202L)
          .setUserAgent("Test User Agent")
          .setRemoteIp(CLIENT_IP)
          .setServerIp(SERVER_IP)
          .setReferer(REQUEST_REFERER)
          .setCacheLookup(true)
          .setCacheHit(false)
          .setCacheValidatedWithOriginServer(true)
          .setCacheFillBytes(303L)
          .setLatency(Duration.ofSeconds(123, 456))
          .build();
  private static final HttpRequest PARTIAL_REQUEST =
      HttpRequest.newBuilder()
          .setRequestMethod(REQUEST_METHOD)
          .setRequestUrl(REQUEST_URL)
          .setRemoteIp(CLIENT_IP)
          .setServerIp(SERVER_IP)
          .setReferer(REQUEST_REFERER)
          .build();
  private static final Context TEST_CONTEXT =
      Context.newBuilder()
          .setRequest(PARTIAL_REQUEST)
          .setTraceId(TEST_TRACE_ID)
          .setSpanId(TEST_SPAN_ID)
          .setTraceSampled(TEST_TRACE_SAMPLED)
          .build();

  @Test
  public void testCompareContexts() {
    Context context1 =
        Context.newBuilder()
            .setRequest(REQUEST)
            .setTraceId(TEST_TRACE_ID)
            .setSpanId(TEST_SPAN_ID)
            .build();
    Context context2 =
        Context.newBuilder()
            .setRequestUrl(REQUEST_URL)
            .setRequestMethod(REQUEST_METHOD)
            .setReferer(REQUEST_REFERER)
            .setRemoteIp(CLIENT_IP)
            .setServerIp(SERVER_IP)
            .setTraceId(TEST_TRACE_ID)
            .setSpanId(TEST_SPAN_ID)
            .setTraceSampled(TEST_TRACE_SAMPLED)
            .build();

    assertNotEquals(TEST_CONTEXT, context1);
    assertFalse(TEST_CONTEXT.hashCode() == context1.hashCode());
    assertEquals(context2, TEST_CONTEXT);
    assertEquals(context2.hashCode(), TEST_CONTEXT.hashCode());
  }

  @Test
  public void testContextBuilder() {
    Context emptyContext = Context.newBuilder().build();
    Context anotherContext = TEST_CONTEXT.toBuilder().build();

    assertEquals(PARTIAL_REQUEST, TEST_CONTEXT.getHttpRequest());
    assertEquals(TEST_TRACE_ID, TEST_CONTEXT.getTraceId());
    assertEquals(TEST_SPAN_ID, TEST_CONTEXT.getSpanId());
    assertEquals(TEST_TRACE_SAMPLED, TEST_CONTEXT.getTraceSampled());
    assertNull(emptyContext.getHttpRequest());
    assertNull(emptyContext.getTraceId());
    assertNull(emptyContext.getSpanId());
    assertFalse(emptyContext.getTraceSampled());
    assertEquals(TEST_CONTEXT, anotherContext);
  }

  @Test
  public void testParsingCloudTraceContext() {
    final String X_CLOUD_TRACE_NO_TRACE = "/SPAN_ID;o=TRACE_TRUE";
    final String X_CLOUD_TRACE_ONLY = TEST_TRACE_ID;
    final String X_CLOUD_TRACE_WITH_SPAN = TEST_TRACE_ID + "/" + TEST_SPAN_ID;
    final String X_CLOUD_TRACE_FULL = TEST_TRACE_ID + "/" + TEST_SPAN_ID + ";o=" + TEST_TRACE_SAMPLED;

    Context.Builder builder = Context.newBuilder();

    builder.loadCloudTraceContext(null);
    assertTraceSpanAndSampled(builder.build(), null, null, false);
    builder.loadCloudTraceContext("");
    assertTraceSpanAndSampled(builder.build(), null, null, false);
    builder.loadCloudTraceContext(X_CLOUD_TRACE_NO_TRACE);
    assertTraceSpanAndSampled(builder.build(), null, null, false);
    builder.loadCloudTraceContext(X_CLOUD_TRACE_ONLY);
    assertTraceSpanAndSampled(builder.build(), TEST_TRACE_ID, null, false);
    builder.loadCloudTraceContext(X_CLOUD_TRACE_WITH_SPAN);
    assertTraceSpanAndSampled(builder.build(), TEST_TRACE_ID, TEST_SPAN_ID, false);
    builder.loadCloudTraceContext(X_CLOUD_TRACE_FULL);
    assertTraceSpanAndSampled(builder.build(), TEST_TRACE_ID, TEST_SPAN_ID, TEST_TRACE_SAMPLED);
  }

  @Test
  public void testParsingW3CTraceParent() {
    final String W3C_TEST_TRACE_ID = "12345678901234567890123456789012";
    final String W3C_TEST_SPAN_ID = "1234567890123456";
    final String W3C_TEST_TRACE_SAMPLED = "0f";
    final String W3C_TRACE_CONTEXT = "00-" + W3C_TEST_TRACE_ID + "-" + W3C_TEST_SPAN_ID + "-" + W3C_TEST_TRACE_SAMPLED;

    Context.Builder builder = Context.newBuilder();

    builder.loadW3CTraceParentContext(null);
    assertTraceSpanAndSampled(builder.build(), null, null, false);
    builder.loadW3CTraceParentContext(W3C_TRACE_CONTEXT);
    assertTraceSpanAndSampled(builder.build(), W3C_TEST_TRACE_ID, W3C_TEST_SPAN_ID, true);
  }


  @Test
  public void testParsingOtelContext() {
     InMemorySpanExporter testExporter = InMemorySpanExporter.create();
    //    OpenTelemetrySdk myOpenTelemetrySdk = OpenTelemetrySdk.builder().build();

/*        OpenTelemetrySdk.builder()
                .setTracerProvider(
                        SdkTracerProvider.builder()
                                .addSpanProcessor(BatchSpanProcessor.builder(traceExporter).build())
                                .build())
                .buildAndRegisterGlobal();*/


    // Create  with an in-memory span exporter.
    //  GlobalOpenTelemetry.resetForTest();
     /*   Resource resource =
                Resource.getDefault().merge(Resource.builder().put(SERVICE_NAME, "Sparky").build());


        OpenTelemetry sdk = OpenTelemetrySdk.builder()
                .setTracerProvider(
                        SdkTracerProvider.builder()
                                .setResource(resource)
                                .addSpanProcessor(inMemorySpanProcessor)
                                .setSampler(Sampler.alwaysOn())
                                .build())
                .buildAndRegisterGlobal();
*/


    ///////////////

    SpanProcessor inMemorySpanProcessor = SimpleSpanProcessor.create(testExporter);
    OpenTelemetrySdk openTelemetrySdk =
            OpenTelemetrySdk.builder()
                    .setTracerProvider(
                            SdkTracerProvider.builder()
                                    .addSpanProcessor(inMemorySpanProcessor)
                                    .build())
                    .build();

    // OpenTelemetry has a maximum of 128 Attributes by default for Spans, Links, and Events.
    Tracer tracer = openTelemetrySdk.getTracer("ContextTest");
    Span multiAttrSpan = tracer.spanBuilder("Example Span Attributes").startSpan();
    multiAttrSpan.setAttribute("Attribute 1", "first attribute value");
    multiAttrSpan.setAttribute("Attribute 2", "second attribute value");
    multiAttrSpan.end();
    Context.Builder builder = Context.newBuilder();
    SpanContext currentOtelContext = multiAttrSpan.getSpanContext();
    builder.loadOpenTelemetryContext();
    assertTraceSpanAndSampled(builder.build(), currentOtelContext.getTraceId(), currentOtelContext.getSpanId(), currentOtelContext.isSampled());
  }

  private void assertTraceAndSpan1(Context context, String expectedTraceId, String expectedSpanId) {
    assertEquals(expectedTraceId, context.getTraceId());
    assertEquals(expectedSpanId, context.getSpanId());
  }

  private void assertTraceSpanAndSampled(Context context, String expectedTraceId, String expectedSpanId, boolean expectedTraceSampled) {
    assertEquals(expectedTraceId, context.getTraceId());
    assertEquals(expectedSpanId, context.getSpanId());
    assertEquals(expectedTraceSampled, context.getTraceSampled());
  }
}
