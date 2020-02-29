/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.logging.v2;

import com.google.api.pathtemplate.PathTemplate;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class OrganizationSinkName extends SinkName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("organizations/{organization}/sinks/{sink}");

  private volatile Map<String, String> fieldValuesMap;

  private final String organization;
  private final String sink;

  public String getOrganization() {
    return organization;
  }

  public String getSink() {
    return sink;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private OrganizationSinkName(Builder builder) {
    organization = Preconditions.checkNotNull(builder.getOrganization());
    sink = Preconditions.checkNotNull(builder.getSink());
  }

  public static OrganizationSinkName of(String organization, String sink) {
    return newBuilder().setOrganization(organization).setSink(sink).build();
  }

  public static String format(String organization, String sink) {
    return newBuilder().setOrganization(organization).setSink(sink).build().toString();
  }

  public static OrganizationSinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "OrganizationSinkName.parse: formattedString not in valid format");
    return of(matchMap.get("organization"), matchMap.get("sink"));
  }

  public static List<OrganizationSinkName> parseList(List<String> formattedStrings) {
    List<OrganizationSinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<OrganizationSinkName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (OrganizationSinkName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("organization", organization);
          fieldMapBuilder.put("sink", sink);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("organization", organization, "sink", sink);
  }

  /** Builder for OrganizationSinkName. */
  public static class Builder {

    private String organization;
    private String sink;

    public String getOrganization() {
      return organization;
    }

    public String getSink() {
      return sink;
    }

    public Builder setOrganization(String organization) {
      this.organization = organization;
      return this;
    }

    public Builder setSink(String sink) {
      this.sink = sink;
      return this;
    }

    private Builder() {}

    private Builder(OrganizationSinkName organizationSinkName) {
      organization = organizationSinkName.organization;
      sink = organizationSinkName.sink;
    }

    public OrganizationSinkName build() {
      return new OrganizationSinkName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OrganizationSinkName) {
      OrganizationSinkName that = (OrganizationSinkName) o;
      return (this.organization.equals(that.organization)) && (this.sink.equals(that.sink));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= organization.hashCode();
    h *= 1000003;
    h ^= sink.hashCode();
    return h;
  }
}
