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

import com.google.api.core.BetaApi;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.pathtemplate.ValidationException;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class LogName implements ResourceName {

  @Deprecated
  protected LogName() {}

  private static final PathTemplate PROJECT_LOG_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/logs/{log}");
  private static final PathTemplate ORGANIZATION_LOG_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("organizations/{organization}/logs/{log}");
  private static final PathTemplate FOLDER_LOG_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("folders/{folder}/logs/{log}");
  private static final PathTemplate BILLING_ACCOUNT_LOG_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("billingAccounts/{billing_account}/logs/{log}");

  private volatile Map<String, String> fieldValuesMap;
  private PathTemplate pathTemplate;
  private String fixedValue;

  private String project;
  private String log;
  private String organization;
  private String folder;
  private String billingAccount;

  public String getProject() {
    return project;
  }

  public String getLog() {
    return log;
  }

  public String getOrganization() {
    return organization;
  }

  public String getFolder() {
    return folder;
  }

  public String getBillingAccount() {
    return billingAccount;
  }

  private LogName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    log = Preconditions.checkNotNull(builder.getLog());
    pathTemplate = PROJECT_LOG_PATH_TEMPLATE;
  }

  private LogName(OrganizationLogBuilder builder) {
    organization = Preconditions.checkNotNull(builder.getOrganization());
    log = Preconditions.checkNotNull(builder.getLog());
    pathTemplate = ORGANIZATION_LOG_PATH_TEMPLATE;
  }

  private LogName(FolderLogBuilder builder) {
    folder = Preconditions.checkNotNull(builder.getFolder());
    log = Preconditions.checkNotNull(builder.getLog());
    pathTemplate = FOLDER_LOG_PATH_TEMPLATE;
  }

  private LogName(BillingAccountLogBuilder builder) {
    billingAccount = Preconditions.checkNotNull(builder.getBillingAccount());
    log = Preconditions.checkNotNull(builder.getLog());
    pathTemplate = BILLING_ACCOUNT_LOG_PATH_TEMPLATE;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static Builder newProjectLogBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static OrganizationLogBuilder newOrganizationLogBuilder() {
    return new OrganizationLogBuilder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static FolderLogBuilder newFolderLogBuilder() {
    return new FolderLogBuilder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static BillingAccountLogBuilder newBillingAccountLogBuilder() {
    return new BillingAccountLogBuilder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LogName of(String project, String log) {
    return newProjectLogBuilder().setProject(project).setLog(log).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static LogName ofProjectLogName(String project, String log) {
    return newProjectLogBuilder().setProject(project).setLog(log).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static LogName ofOrganizationLogName(String organization, String log) {
    return newOrganizationLogBuilder().setOrganization(organization).setLog(log).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static LogName ofFolderLogName(String folder, String log) {
    return newFolderLogBuilder().setFolder(folder).setLog(log).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static LogName ofBillingAccountLogName(String billingAccount, String log) {
    return newBillingAccountLogBuilder().setBillingAccount(billingAccount).setLog(log).build();
  }

  public static String format(String project, String log) {
    return newBuilder().setProject(project).setLog(log).build().toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectLogName(String project, String log) {
    return newBuilder().setProject(project).setLog(log).build().toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatOrganizationLogName(String organization, String log) {
    return newOrganizationLogBuilder().setOrganization(organization).setLog(log).build().toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatFolderLogName(String folder, String log) {
    return newFolderLogBuilder().setFolder(folder).setLog(log).build().toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatBillingAccountLogName(String billingAccount, String log) {
    return newBillingAccountLogBuilder()
        .setBillingAccount(billingAccount)
        .setLog(log)
        .build()
        .toString();
  }

  public static LogName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    if (PROJECT_LOG_PATH_TEMPLATE.matches(formattedString)) {
      Map<String, String> matchMap = PROJECT_LOG_PATH_TEMPLATE.match(formattedString);
      return ofProjectLogName(matchMap.get("project"), matchMap.get("log"));
    } else if (ORGANIZATION_LOG_PATH_TEMPLATE.matches(formattedString)) {
      Map<String, String> matchMap = ORGANIZATION_LOG_PATH_TEMPLATE.match(formattedString);
      return ofOrganizationLogName(matchMap.get("organization"), matchMap.get("log"));
    } else if (FOLDER_LOG_PATH_TEMPLATE.matches(formattedString)) {
      Map<String, String> matchMap = FOLDER_LOG_PATH_TEMPLATE.match(formattedString);
      return ofFolderLogName(matchMap.get("folder"), matchMap.get("log"));
    } else if (BILLING_ACCOUNT_LOG_PATH_TEMPLATE.matches(formattedString)) {
      Map<String, String> matchMap = BILLING_ACCOUNT_LOG_PATH_TEMPLATE.match(formattedString);
      return ofBillingAccountLogName(matchMap.get("billing_account"), matchMap.get("log"));
    }
    throw new ValidationException("JobName.parse: formattedString not in valid format");
  }

  @BetaApi("The method will be renamed to parseList after subclasses of this class are removed.")
  public static List<LogName> parse(List<String> formattedStrings) {
    List<LogName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  @BetaApi("The method will be renamed to toStringList after subclasses of this class are removed.")
  public static List<String> toStrings(List<LogName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LogName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOG_PATH_TEMPLATE.matches(formattedString)
        || ORGANIZATION_LOG_PATH_TEMPLATE.matches(formattedString)
        || FOLDER_LOG_PATH_TEMPLATE.matches(formattedString)
        || BILLING_ACCOUNT_LOG_PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (log != null) {
            fieldMapBuilder.put("log", log);
          }
          if (organization != null) {
            fieldMapBuilder.put("organization", organization);
          }
          if (folder != null) {
            fieldMapBuilder.put("folder", folder);
          }
          if (billingAccount != null) {
            fieldMapBuilder.put("billing_account", billingAccount);
          }
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
    return fixedValue != null ? fixedValue : pathTemplate.instantiate(getFieldValuesMap());
  }

  /** Builder for projects/{project}/logs/{log}. */
  public static class Builder {

    private String project;
    private String log;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLog() {
      return log;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLog(String log) {
      this.log = log;
      return this;
    }

    private Builder(LogName logName) {
      Preconditions.checkArgument(
          logName.pathTemplate == PROJECT_LOG_PATH_TEMPLATE,
          "toBuilder is only supported when LogName has the pattern of "
              + "projects/{project}/logs/{log}.");
      project = logName.project;
      log = logName.log;
    }

    public LogName build() {
      return new LogName(this);
    }
  }

  /** Builder for organizations/{organization}/logs/{log}. */
  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static class OrganizationLogBuilder {

    private String organization;
    private String log;

    private OrganizationLogBuilder() {}

    public String getOrganization() {
      return organization;
    }

    public String getLog() {
      return log;
    }

    public OrganizationLogBuilder setOrganization(String organization) {
      this.organization = organization;
      return this;
    }

    public OrganizationLogBuilder setLog(String log) {
      this.log = log;
      return this;
    }

    public LogName build() {
      return new LogName(this);
    }
  }

  /** Builder for folders/{folder}/logs/{log}. */
  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static class FolderLogBuilder {

    private String folder;
    private String log;

    private FolderLogBuilder() {}

    public String getFolder() {
      return folder;
    }

    public String getLog() {
      return log;
    }

    public FolderLogBuilder setFolder(String folder) {
      this.folder = folder;
      return this;
    }

    public FolderLogBuilder setLog(String log) {
      this.log = log;
      return this;
    }

    public LogName build() {
      return new LogName(this);
    }
  }

  /** Builder for billingAccounts/{billing_account}/logs/{log}. */
  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static class BillingAccountLogBuilder {

    private String billingAccount;
    private String log;

    private BillingAccountLogBuilder() {}

    public String getBillingAccount() {
      return billingAccount;
    }

    public String getLog() {
      return log;
    }

    public BillingAccountLogBuilder setBillingAccount(String billingAccount) {
      this.billingAccount = billingAccount;
      return this;
    }

    public BillingAccountLogBuilder setLog(String log) {
      this.log = log;
      return this;
    }

    public LogName build() {
      return new LogName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      LogName that = (LogName) o;
      return (Objects.equals(this.project, that.project))
          && (Objects.equals(this.log, that.log))
          && (Objects.equals(this.organization, that.organization))
          && (Objects.equals(this.folder, that.folder))
          && (Objects.equals(this.billingAccount, that.billingAccount));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(fixedValue);
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(log);
    h *= 1000003;
    h ^= Objects.hashCode(organization);
    h *= 1000003;
    h ^= Objects.hashCode(folder);
    h *= 1000003;
    h ^= Objects.hashCode(billingAccount);
    return h;
  }
}
