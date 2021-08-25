package com.google.cloud.logging;

import org.junit.Test;

import static com.google.cloud.logging.K8sContainerUtil.getContainerNameFromHostName;
import static com.google.common.truth.Truth.assertThat;

public class K8sContainerUtilTest {

  @Test
  public void testGetContainerNameProperlyFormatted() {
    assertThat(getContainerNameFromHostName("test-one-68449bf55d-44pdr"))
        .isEqualTo("test-one");
    assertThat(getContainerNameFromHostName("test-again-d667d8f5-rlxz5"))
        .isEqualTo("test-again");
    assertThat(getContainerNameFromHostName("test-again-again-again-d667d8f5-rlxz5"))
        .isEqualTo("test-again-again-again");
    assertThat(getContainerNameFromHostName("test-test--44pdr"))
        .isEqualTo("test-test");
  }

  @Test
  public void testGetContainerNameWrongFormat() {
    assertThat(getContainerNameFromHostName("test-one-68449bf55d-68449bf55d"))
        .isEqualTo("test-one-68449bf55d-68449bf55d");
    assertThat(getContainerNameFromHostName("test-again-d667d8f5-rz5"))
        .isEqualTo("test-again-d667d8f5-rz5");
    assertThat(getContainerNameFromHostName("test-host"))
        .isEqualTo("test-host");
    assertThat(getContainerNameFromHostName("test-host-something"))
        .isEqualTo("test-host-something");
  }
}
