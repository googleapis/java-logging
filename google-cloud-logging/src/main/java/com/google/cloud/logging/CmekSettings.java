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

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import java.util.Objects;

/**
 * Describes the customer-managed encryption key (CMEK) settings associated with a project, folder,
 * organization, billing account, or flexible resource.
 *
 * <p>Note: CMEK for the Logs Router currently can be configured only for GCP organizations. Once
 * configured, it applies to all projects and folders in the GCP organization.
 *
 * @see <a href="https://cloud.google.com/logging/docs/routing/managed-encryption">Enabling CMEK for
 *     Logs Router</a> for more information.
 */
public class CmekSettings {

  static final Function<com.google.logging.v2.CmekSettings, CmekSettings> FROM_PB_FUNCTION =
      new Function<com.google.logging.v2.CmekSettings, CmekSettings>() {
        @Override
        public CmekSettings apply(com.google.logging.v2.CmekSettings cmekSettingsPb) {
          return cmekSettingsPb != null ? CmekSettings.fromPb(cmekSettingsPb) : null;
        }
      };

  static final Function<CmekSettings, com.google.logging.v2.CmekSettings> TO_PB_FUNCTION =
      new Function<CmekSettings, com.google.logging.v2.CmekSettings>() {
        @Override
        public com.google.logging.v2.CmekSettings apply(CmekSettings cmekSettings) {
          return cmekSettings != null ? cmekSettings.toPb() : null;
        }
      };

  private String name;
  private String kmsKeyName;
  private String serviceAccountId;

  /** A builder for {@code CmekSettings} objects. */
  public static class Builder {
    private String name;
    private String kmsKeyName;
    private String serviceAccountId;

    Builder() {}

    Builder(CmekSettings settings) {
      this.name = settings.name;
      this.kmsKeyName = settings.kmsKeyName;
      this.serviceAccountId = settings.serviceAccountId;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setKmsKeyName(String kmsKeyName) {
      this.kmsKeyName = kmsKeyName;
      return this;
    }

    public Builder setServiceAccountId(String serviceAccountId) {
      this.serviceAccountId = serviceAccountId;
      return this;
    }

    /** Creates a {@code CmekSettings} object. */
    public CmekSettings build() {
      return new CmekSettings(this);
    }
  }

  CmekSettings(Builder builder) {
    this.name = builder.name;
    this.kmsKeyName = builder.kmsKeyName;
    this.serviceAccountId = builder.serviceAccountId;
  }

  /** Returns the name of the CMEK settings. */
  public String getName() {
    return name;
  }

  /** Returns the KMS key name. */
  public String getKmsKeyName() {
    return kmsKeyName;
  }

  /** Returns the service account. */
  public String getServiceAccountId() {
    return serviceAccountId;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("name", name)
        .add("kmsKeyName", kmsKeyName)
        .add("serviceAccountId", serviceAccountId)
        .toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CmekSettings settings = (CmekSettings) o;
    return Objects.equals(name, settings.name)
        && Objects.equals(kmsKeyName, settings.kmsKeyName)
        && Objects.equals(serviceAccountId, settings.serviceAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, kmsKeyName, serviceAccountId);
  }

  /** Returns a builder for the {@link CmekSettings} object. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Returns a builder for the {@link CmekSettings} object. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  com.google.logging.v2.CmekSettings toPb() {
    return com.google.logging.v2.CmekSettings.newBuilder()
        .setName(name)
        .setKmsKeyName(kmsKeyName)
        .setServiceAccountId(serviceAccountId)
        .build();
  }

  static CmekSettings fromPb(com.google.logging.v2.CmekSettings settingsPb) {
    CmekSettings.Builder builder = newBuilder();
    builder.setName(settingsPb.getName());
    builder.setKmsKeyName(settingsPb.getKmsKeyName());
    builder.setServiceAccountId(settingsPb.getServiceAccountId());
    return builder.build();
  }
}
