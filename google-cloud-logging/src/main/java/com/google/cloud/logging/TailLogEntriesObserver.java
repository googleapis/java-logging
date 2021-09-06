/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.logging;

import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.StreamController;
import java.io.Closeable;
import java.util.List;

public abstract class TailLogEntriesObserver
    implements ResponseObserver<List<LogEntry>>, Closeable {
  private StreamController controller;
  private boolean finished;

  @Override
  public final void onStart(StreamController controller) {
    this.controller = controller;
  }

  @Override
  public final void onComplete() {
    finished = true;
  }

  /*
  @Override
  public void onResponse(List<LogEntry> response) {
  }
  @Override
  public void onError(Throwable t) {
  }
  */

  protected void setError(Throwable t) {
    finished = true;
    onError(t);
  }

  public void cancel() {
    if (controller != null && !finished) {
      controller.cancel();
      finished = true;
    }
  }

  public boolean isFinished() {
    return finished;
  }
}
