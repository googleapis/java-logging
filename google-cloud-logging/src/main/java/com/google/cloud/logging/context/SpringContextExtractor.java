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

import com.google.cloud.logging.HttpRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SpringContextExtractor implements ContextExtractor {

  SpringContext context = null;
  static ClassLoader classLoader = null;

  @Override
  public CurrentContext getContext() {
    if (context == null) {
      context = SpringContext.build(classLoader);
    }
    return context;
  }

  /** This method intended for unit testing. Do not use it. */
  protected static void setClassLoader(ClassLoader classLoader) {
    SpringContextExtractor.classLoader = classLoader;
  }

  public static class SpringContext implements CurrentContext {
    RequestContextHolder contextHolder;

    private SpringContext() {
    }

    protected static SpringContext build(ClassLoader classLoader) {
      SpringContext context = new SpringContext();

      if (classLoader == null) {
        classLoader = ClassLoader.getSystemClassLoader();
      }
      try {
        Class<?> clz = classLoader.loadClass("org.springframework.web.context.request.RequestContextHolder");
        Method method = clz.getMethod("getRequestAttributes");
        context.contextHolder = new RequestContextHolder(method);
      } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
        return null;
      }
      return context;
    }

    @Override
    public HttpRequest get() {
      throw new NullPointerException();
    }
  }

  @SuppressWarnings("unchecked")
  private static <T> T invokeMethod(Method method, Object instance, Object... args) {
    try {
      return (T) method.invoke(instance, args);
    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
      return null;
    }
  }

  static class RequestContextHolder {
    Method methodGetRequestAttrs;

    public RequestContextHolder(Method method) {
      methodGetRequestAttrs = method;
    }

    public ServletRequestAttributes getRequestAttributes() {
      Object attrs = invokeMethod(methodGetRequestAttrs, null);
      return new ServletRequestAttributesBuilder().setInstance(attrs).build();
    }
  }

  static class ServletRequestAttributesBuilder {
    static boolean initialized = false;
    private Object instance = null;

    public ServletRequestAttributesBuilder setInstance(Object instance) {
      this.instance = instance;
      return this;
    }

    public ServletRequestAttributes build() {
      if (instance == null) {
        return null;
      }
      if (!initialized) {
        try {
          ServletRequestAttributes.methodGetRequest = instance.getClass().getMethod("getRequest");
        } catch (NoSuchMethodException | SecurityException ex) {
          return null;
        }
        initialized = true;
      }
      return new ServletRequestAttributes(instance);
    }
  }

  static class ServletRequestAttributes {
    protected static Method methodGetRequest;
    private Object instance;

    public ServletRequestAttributes(Object instance) {
      this.instance = instance;
    }

    public HttpServletRequest getRequest() {
      Object request = invokeMethod(methodGetRequest, instance);
      return new HttpServletRequestBuilder().setInstance(request).build();
    }
  }

  static class HttpServletRequestBuilder {
    static boolean initialized = false;
    private Object instance = null;

    public HttpServletRequestBuilder setInstance(Object instance) {
      this.instance = instance;
      return this;
    }

    public HttpServletRequest build() {
      if (instance == null) {
        return null;
      }
      if (!initialized) {
        Class<?> clz = instance.getClass();
        try {
          HttpServletRequest.methodGetHeader = clz.getMethod("getHeader", String.class);
          HttpServletRequest.methodGetContentLengthLong = clz.getMethod("getContentLengthLong");
          HttpServletRequest.methodGetLocalAddr = clz.getMethod("getLocalAddr");
          HttpServletRequest.methodGetMethod = clz.getMethod("getMethod");
          HttpServletRequest.methodGetProtocol = clz.getMethod("getProtocol");
          HttpServletRequest.methodGetRemoteAddr = clz.getMethod("getRemoteAddr");
          HttpServletRequest.methodGetRequestURI = clz.getMethod("getRequestURI");
          HttpServletRequest.methodGetQueryString = clz.getMethod("getQueryString");
        } catch (NoSuchMethodException | SecurityException ex) {
          return null;
        }
        initialized = true;
      }
      return new HttpServletRequest(instance);
    }
  }

  static class HttpServletRequest {
    protected static Method methodGetHeader;
    protected static Method methodGetContentLengthLong;
    protected static Method methodGetLocalAddr;
    protected static Method methodGetMethod;
    protected static Method methodGetProtocol;
    protected static Method methodGetRemoteAddr;
    protected static Method methodGetRequestURI;
    protected static Method methodGetQueryString;
    private Object instance;

    public HttpServletRequest(Object instance) {
      this.instance = instance;
    }

    public String getHeader(String name) {
      return invokeMethod(methodGetHeader, instance, name);
    }

    public Long getContentLengthLong() {
      return invokeMethod(methodGetContentLengthLong, instance);
    }

    public String getLocalAddr() {
      return invokeMethod(methodGetLocalAddr, instance);
    }

    public String getMethod() {
      return invokeMethod(methodGetMethod, instance);
    }

    public String getProtocol() {
      return invokeMethod(methodGetProtocol, instance);
    }

    public String getRemoteAddr() {
      return invokeMethod(methodGetRemoteAddr, instance);
    }

    public String getRequestURI() {
      return invokeMethod(methodGetRequestURI, instance);
    }

    public String getQueryString() {
      return invokeMethod(methodGetQueryString, instance);
    }
  }
}
