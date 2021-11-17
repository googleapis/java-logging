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

public class RequestContextScope {
  private static final ThreadLocal<Integer> contextDepth = new ThreadLocal<>();

  public void enterScope(Context context) {
    Integer depth = contextDepth.get();
    if (depth == null || depth == 0) {
      contextDepth.set(1);
      ContextHandler.setCurrentContext(context);
    } else {
      contextDepth.set(depth + 1);
    }
  }

  public void exitScope() {
    Integer depth = contextDepth.get();
    if (depth != null) {
      if (depth > 1) {
        contextDepth.set(depth - 1);
      } else {
        ContextHandler.removeCurrentContext();
        contextDepth.remove();
      }
    }
  }
}
