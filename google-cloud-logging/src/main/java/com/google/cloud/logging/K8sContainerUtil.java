package com.google.cloud.logging;

import static com.google.common.base.Preconditions.checkNotNull;

/** Simple utility for Kubernetes */
class K8sContainerUtil {

  private K8sContainerUtil() {
  }

  /**
   * Tries to determine the container name from the provided host name using the pattern of
   * {@code <container name>-<deployment>-<random string (5 char)>} which is the default for
   * kubernetes containers. If this is not the pattern of the host name, then this method simply
   * returns the host name.
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
