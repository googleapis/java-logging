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

/** Class provides a per-thread storage of the {@see Context} instances. */
public class ContextHandler {
  private static final ThreadLocal<Context> _context = new ThreadLocal<>();

  public static Context getCurrentContext() {
    return _context.get();
  }

  public static void setCurrentContext(Context context) {
    _context.set(context);
  }

  public static void removeCurrentContext() {
    _context.remove();
  }
}
