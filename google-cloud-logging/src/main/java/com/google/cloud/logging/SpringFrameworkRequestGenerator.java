/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.logging;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class SpringFrameworkRequestGenerator
    implements HttpCurrentContext.HttpRequestGenerator {
  private static final String HEADERS_METHOD = "getHeaders";
  private static final String HEADER_METHOD = "getHeader";
  private static final String CONTENT_LENGTH_METHOD = "getContentLengthLong";
  private static final String LOCAL_IP_METHOD = "getLocalAddr";
  private static final String REQUEST_METHOD = "getMethod";
  private static final String PROTOCOL_METHOD = "getProtocol";
  private static final String REMOTE_IP_METHOD = "getRemoteAddr";
  private static final String REQUEST_URI_METHOD = "getRequestURI";
  private static final String QUERY_STRING_METHOD = "getQueryString";

  private static Method getRequestAttributes, getRequest;
  private static Map<String, Method> httpRequestMethod = new HashMap<>();

  private SpringFrameworkRequestGenerator() {}

  @Override
  public HttpRequest getRequest() {
    Object servletRequestAttributes, httpServletRequest;

    servletRequestAttributes = invoke(getRequestAttributes);
    httpServletRequest = invoke(getRequest, servletRequestAttributes);
    if (httpServletRequest == null) {
      return null;
    }

    HttpRequest request =
        HttpRequest.newBuilder()
            .setRemoteIp(invoke(httpRequestMethod.get(REMOTE_IP_METHOD), httpServletRequest))
            .setServerIp(invoke(httpRequestMethod.get(LOCAL_IP_METHOD), httpServletRequest))
            .setUserAgent(
                invoke(httpRequestMethod.get(HEADER_METHOD), httpServletRequest, "User-Agent"))
            // TBD: calculate the size to include header size
            // .setRequestSize(invoke(httpRequestMethod.get(CONTENT_SIZE_METHOD),
            // httpServletRequest))
            .setRequestUrl(
                invoke(httpRequestMethod.get(REQUEST_URI_METHOD), httpServletRequest)
                    + "?"
                    + invoke(httpRequestMethod.get(QUERY_STRING_METHOD), httpServletRequest))
            .setRequestMethod(invoke(httpRequestMethod.get(REQUEST_METHOD), httpServletRequest))
            .setProtocol(invoke(httpRequestMethod.get(PROTOCOL_METHOD), httpServletRequest))
            .setReferer(invoke(httpRequestMethod.get(HEADER_METHOD), httpServletRequest, "Referer"))
            .build();

    return request;
  }

  protected static SpringFrameworkRequestGenerator build() {
    Class<?> clazzRequestContextHolder =
        getClass("org.springframework.web.context.request.RequestContextHolder");
    Class<?> clazzServletRequestAttributes =
        getClass("org.springframework.web.context.request.ServletRequestAttributes");
    Class<?> clazzHttpServletRequest = getClass("javax.servlet.http.HttpServletRequest");

    if (clazzRequestContextHolder == null
        || clazzServletRequestAttributes == null
        || clazzHttpServletRequest == null) {
      return null;
    }

    getRequestAttributes = getClassMethod(clazzRequestContextHolder, "getRequestAttributes");
    getRequest = getClassMethod(clazzServletRequestAttributes, "getRequest");
    if (getRequestAttributes == null || getRequest == null) {
      return null;
    }

    String httpRequestMethods[] = {
      HEADERS_METHOD,
      PROTOCOL_METHOD,
      REQUEST_METHOD,
      REQUEST_URI_METHOD,
      QUERY_STRING_METHOD,
      CONTENT_LENGTH_METHOD,
      REMOTE_IP_METHOD,
      LOCAL_IP_METHOD
    };
    for (String methodName : httpRequestMethods) {
      Method method = getClassMethod(clazzHttpServletRequest, methodName);
      if (method == null) {
        return null;
      }
      httpRequestMethod.put(methodName, method);
    }
    // separately get a method *with* parameter
    Method method = getClassMethod(clazzHttpServletRequest, HEADER_METHOD, String.class);
    if (method == null) {
      return null;
    }
    httpRequestMethod.put(HEADER_METHOD, method);

    return new SpringFrameworkRequestGenerator();
  }

  private static Class<?> getClass(String className) {
    try {
      return ClassLoader.getSystemClassLoader().loadClass(className);
    } catch (ClassNotFoundException ex) {
      return null;
    }
  }

  private static Method getClassMethod(Class<?> clazz, String methodName, Class<?>... params) {
    try {
      return clazz.getMethod(methodName, params);
    } catch (NoSuchMethodException | SecurityException ex) {
      return null;
    }
  }

  private static <T> T invoke(Method method) {
    return invoke(method, null);
  }

  @SuppressWarnings("unchecked")
  private static <T> T invoke(Method method, Object instance, Object... arguments) {
    if (method == null) {
      return null;
    }
    try {
      return (T) method.invoke(instance, arguments);
    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
      return null;
    }
  }
}
