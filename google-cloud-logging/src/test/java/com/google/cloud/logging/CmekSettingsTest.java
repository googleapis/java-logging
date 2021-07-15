/*
 * Copyright 2020 Google LLC
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

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CmekSettingsTest {

  private static final String PROJECT = "project";
  private static final String ORGANIZATIONS = "organization";
  private static final String CMEK_SETTINGS_NAME =
      "organizations/" + ORGANIZATIONS + "/cmekSettings/test";
  private static final String KMS_KEY_NAME =
      "projects/" + PROJECT + "/locations/my-region/keyRings/key-ring-name/cryptoKeys/key-name";
  private static final String SERVICE_ACCOUNT = "service-account";
  private static final CmekSettings CMEK_SETTINGS =
      CmekSettings.newBuilder()
          .setName(CMEK_SETTINGS_NAME)
          .setKmsKeyName(KMS_KEY_NAME)
          .setServiceAccountId(SERVICE_ACCOUNT)
          .build();
  private static final String NEW_CMEK_SETTINGS_NAME =
      "organizations/" + ORGANIZATIONS + "/cmekSettings/test";
  private static final String NEW_KMS_KEY_NAME =
      "projects/" + PROJECT + "/locations/my-region/keyRings/key-ring-name/cryptoKeys/key-name";
  private static final String NEW_SERVICE_ACCOUNT = "service-account";

  @Test
  public void testToBuilder() {
    compareCmekSettings(CMEK_SETTINGS, CMEK_SETTINGS.toBuilder().build());
    CmekSettings cmekSettings =
        CMEK_SETTINGS
            .toBuilder()
            .setName(NEW_CMEK_SETTINGS_NAME)
            .setKmsKeyName(NEW_KMS_KEY_NAME)
            .setServiceAccountId(NEW_SERVICE_ACCOUNT)
            .build();
    assertEquals(NEW_CMEK_SETTINGS_NAME, cmekSettings.getName());
    assertEquals(NEW_KMS_KEY_NAME, cmekSettings.getKmsKeyName());
    assertEquals(NEW_SERVICE_ACCOUNT, cmekSettings.getServiceAccountId());
    cmekSettings =
        cmekSettings
            .toBuilder()
            .setName(CMEK_SETTINGS_NAME)
            .setKmsKeyName(KMS_KEY_NAME)
            .setServiceAccountId(SERVICE_ACCOUNT)
            .build();
    compareCmekSettings(CMEK_SETTINGS, cmekSettings);
  }

  @Test
  public void testBuilder() {
    assertEquals(CMEK_SETTINGS_NAME, CMEK_SETTINGS.getName());
    assertEquals(KMS_KEY_NAME, CMEK_SETTINGS.getKmsKeyName());
    assertEquals(SERVICE_ACCOUNT, CMEK_SETTINGS.getServiceAccountId());
  }

  @Test
  public void testToAndFromPb() {
    compareCmekSettings(CMEK_SETTINGS, CmekSettings.fromPb(CMEK_SETTINGS.toPb()));
  }

  private void compareCmekSettings(CmekSettings expected, CmekSettings actual) {
    assertEquals(expected, actual);
    assertEquals(expected.toString(), actual.toString());
    assertEquals(expected.getName(), actual.getName());
    assertEquals(expected.getKmsKeyName(), actual.getKmsKeyName());
    assertEquals(expected.getServiceAccountId(), actual.getServiceAccountId());
  }
}
