/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.logging;

import static com.google.common.base.Preconditions.checkNotNull;

/** Simple utility for Kubernetes */
class K8sContainerUtil {

  private K8sContainerUtil() {}

  /**
   * Tries to determine the container name from the provided host name using the pattern of {@code
   * <container name>-<deployment>-<random string (5 char)>} which is the default for kubernetes
   * containers. If this is not the pattern of the host name, then this method simply returns the
   * host name.
   */
  public static String getContainerNameFromHostName(String hostName) {
    checkNotNull(hostName);
    int lastDashIndex = hostName.length() - 6;
    if (hostName.charAt(lastDashIndex) == '-') {
      int secondToLastIndex = hostName.lastIndexOf("-", lastDashIndex - 1);
      if (secondToLastIndex > 0) {
        return hostName.substring(0, secondToLastIndex);
      }
    }
    return hostName;
  }
}
