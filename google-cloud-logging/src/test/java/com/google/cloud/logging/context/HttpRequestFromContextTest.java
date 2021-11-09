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

package com.google.cloud.logging.context;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.google.cloud.logging.HttpRequest;
import com.google.cloud.logging.HttpRequest.RequestMethod;
import org.junit.Test;

public class HttpRequestFromContextTest {

  @Test
  public void testBuildFromContextWithoutContext() {

    ContextFactory.setTestContext(null);
    assertNull(HttpRequest.fromCurrentContext());
  }

  @Test
  public void testBuildFromContextWithoutRequest() {
    CurrentContext mockedContext = createMock(CurrentContext.class);
    expect(mockedContext.get()).andReturn(null);
    replay(mockedContext);
    ContextFactory.setTestContext(mockedContext);

    assertNull(HttpRequest.fromCurrentContext());
    verify(mockedContext);
  }

  @Test
  public void testBuildFromContextWithExistingContextAndRequest() {
    final HttpRequest HTTP_REQUEST = HttpRequest.newBuilder().setRequestMethod(RequestMethod.GET)
        .setRequestUrl("https://www.example.com").setRequestSize(12345L).setStatus(200).setResponseSize(54321L)
        .setUserAgent("Mozilla/4.0 (compatible;)").setRemoteIp("192.168.1.1").setServerIp("192.168.1.2")
        .setReferer("Referer: https://www.example.com").setCacheLookup(true).setCacheHit(true)
        .setCacheValidatedWithOriginServer(false).setCacheFillBytes(1L).build();
    CurrentContext mockedContext = createMock(CurrentContext.class);
    expect(mockedContext.get()).andReturn(HTTP_REQUEST);
    replay(mockedContext);
    ContextFactory.setTestContext(mockedContext);

    assertEquals(HttpRequest.fromCurrentContext(), HTTP_REQUEST);
    verify(mockedContext);
  }
}
