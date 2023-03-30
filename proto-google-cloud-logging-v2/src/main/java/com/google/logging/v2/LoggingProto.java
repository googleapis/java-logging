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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public final class LoggingProto {
  private LoggingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_DeleteLogRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_DeleteLogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListLogEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListLogEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListLogsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListLogsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_TailLogEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_TailLogEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_TailLogEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_TailLogEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_TailLogEntriesResponse_SuppressionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_TailLogEntriesResponse_SuppressionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/logging/v2/logging.proto\022\021googl"
          + "e.logging.v2\032\034google/api/annotations.pro"
          + "to\032\027google/api/client.proto\032\037google/api/"
          + "field_behavior.proto\032#google/api/monitor"
          + "ed_resource.proto\032\031google/api/resource.p"
          + "roto\032!google/logging/v2/log_entry.proto\032"
          + "\036google/protobuf/duration.proto\032\033google/"
          + "protobuf/empty.proto\032\027google/rpc/status."
          + "proto\"H\n\020DeleteLogRequest\0224\n\010log_name\030\001 "
          + "\001(\tB\"\340A\002\372A\034\n\032logging.googleapis.com/Log\""
          + "\346\002\n\026WriteLogEntriesRequest\0224\n\010log_name\030\001"
          + " \001(\tB\"\340A\001\372A\034\n\032logging.googleapis.com/Log"
          + "\0224\n\010resource\030\002 \001(\0132\035.google.api.Monitore"
          + "dResourceB\003\340A\001\022J\n\006labels\030\003 \003(\01325.google."
          + "logging.v2.WriteLogEntriesRequest.Labels"
          + "EntryB\003\340A\001\0221\n\007entries\030\004 \003(\0132\033.google.log"
          + "ging.v2.LogEntryB\003\340A\002\022\034\n\017partial_success"
          + "\030\005 \001(\010B\003\340A\001\022\024\n\007dry_run\030\006 \001(\010B\003\340A\001\032-\n\013Lab"
          + "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "\"\031\n\027WriteLogEntriesResponse\"\310\001\n\034WriteLog"
          + "EntriesPartialErrors\022]\n\020log_entry_errors"
          + "\030\001 \003(\0132C.google.logging.v2.WriteLogEntri"
          + "esPartialErrors.LogEntryErrorsEntry\032I\n\023L"
          + "ogEntryErrorsEntry\022\013\n\003key\030\001 \001(\005\022!\n\005value"
          + "\030\002 \001(\0132\022.google.rpc.Status:\0028\001\"\260\001\n\025ListL"
          + "ogEntriesRequest\022:\n\016resource_names\030\010 \003(\t"
          + "B\"\340A\002\372A\034\022\032logging.googleapis.com/Log\022\023\n\006"
          + "filter\030\002 \001(\tB\003\340A\001\022\025\n\010order_by\030\003 \001(\tB\003\340A\001"
          + "\022\026\n\tpage_size\030\004 \001(\005B\003\340A\001\022\027\n\npage_token\030\005"
          + " \001(\tB\003\340A\001\"_\n\026ListLogEntriesResponse\022,\n\007e"
          + "ntries\030\001 \003(\0132\033.google.logging.v2.LogEntr"
          + "y\022\027\n\017next_page_token\030\002 \001(\t\"Z\n\'ListMonito"
          + "redResourceDescriptorsRequest\022\026\n\tpage_si"
          + "ze\030\001 \001(\005B\003\340A\001\022\027\n\npage_token\030\002 \001(\tB\003\340A\001\"\212"
          + "\001\n(ListMonitoredResourceDescriptorsRespo"
          + "nse\022E\n\024resource_descriptors\030\001 \003(\0132\'.goog"
          + "le.api.MonitoredResourceDescriptor\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"\262\001\n\017ListLogsRequest\022"
          + "2\n\006parent\030\001 \001(\tB\"\340A\002\372A\034\022\032logging.googlea"
          + "pis.com/Log\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\np"
          + "age_token\030\003 \001(\tB\003\340A\001\022:\n\016resource_names\030\010"
          + " \003(\tB\"\340A\001\372A\034\022\032logging.googleapis.com/Log"
          + "\">\n\020ListLogsResponse\022\021\n\tlog_names\030\003 \003(\t\022"
          + "\027\n\017next_page_token\030\002 \001(\t\"\200\001\n\025TailLogEntr"
          + "iesRequest\022\033\n\016resource_names\030\001 \003(\tB\003\340A\002\022"
          + "\023\n\006filter\030\002 \001(\tB\003\340A\001\0225\n\rbuffer_window\030\003 "
          + "\001(\0132\031.google.protobuf.DurationB\003\340A\001\"\337\002\n\026"
          + "TailLogEntriesResponse\022,\n\007entries\030\001 \003(\0132"
          + "\033.google.logging.v2.LogEntry\022S\n\020suppress"
          + "ion_info\030\002 \003(\01329.google.logging.v2.TailL"
          + "ogEntriesResponse.SuppressionInfo\032\301\001\n\017Su"
          + "ppressionInfo\022P\n\006reason\030\001 \001(\0162@.google.l"
          + "ogging.v2.TailLogEntriesResponse.Suppres"
          + "sionInfo.Reason\022\030\n\020suppressed_count\030\002 \001("
          + "\005\"B\n\006Reason\022\026\n\022REASON_UNSPECIFIED\020\000\022\016\n\nR"
          + "ATE_LIMIT\020\001\022\020\n\014NOT_CONSUMED\020\0022\346\013\n\020Loggin"
          + "gServiceV2\022\223\002\n\tDeleteLog\022#.google.loggin"
          + "g.v2.DeleteLogRequest\032\026.google.protobuf."
          + "Empty\"\310\001\202\323\344\223\002\266\001* /v2/{log_name=projects/"
          + "*/logs/*}Z\033*\031/v2/{log_name=*/*/logs/*}Z\'"
          + "*%/v2/{log_name=organizations/*/logs/*}Z"
          + "!*\037/v2/{log_name=folders/*/logs/*}Z)*\'/v"
          + "2/{log_name=billingAccounts/*/logs/*}\332A\010"
          + "log_name\022\251\001\n\017WriteLogEntries\022).google.lo"
          + "gging.v2.WriteLogEntriesRequest\032*.google"
          + ".logging.v2.WriteLogEntriesResponse\"?\202\323\344"
          + "\223\002\026\"\021/v2/entries:write:\001*\332A log_name,res"
          + "ource,labels,entries\022\243\001\n\016ListLogEntries\022"
          + "(.google.logging.v2.ListLogEntriesReques"
          + "t\032).google.logging.v2.ListLogEntriesResp"
          + "onse\"<\202\323\344\223\002\025\"\020/v2/entries:list:\001*\332A\036reso"
          + "urce_names,filter,order_by\022\305\001\n ListMonit"
          + "oredResourceDescriptors\022:.google.logging"
          + ".v2.ListMonitoredResourceDescriptorsRequ"
          + "est\032;.google.logging.v2.ListMonitoredRes"
          + "ourceDescriptorsResponse\"(\202\323\344\223\002\"\022 /v2/mo"
          + "nitoredResourceDescriptors\022\210\002\n\010ListLogs\022"
          + "\".google.logging.v2.ListLogsRequest\032#.go"
          + "ogle.logging.v2.ListLogsResponse\"\262\001\202\323\344\223\002"
          + "\242\001\022\025/v2/{parent=*/*}/logsZ\036\022\034/v2/{parent"
          + "=projects/*}/logsZ#\022!/v2/{parent=organiz"
          + "ations/*}/logsZ\035\022\033/v2/{parent=folders/*}"
          + "/logsZ%\022#/v2/{parent=billingAccounts/*}/"
          + "logs\332A\006parent\022\206\001\n\016TailLogEntries\022(.googl"
          + "e.logging.v2.TailLogEntriesRequest\032).goo"
          + "gle.logging.v2.TailLogEntriesResponse\"\033\202"
          + "\323\344\223\002\025\"\020/v2/entries:tail:\001*(\0010\001\032\215\002\312A\026logg"
          + "ing.googleapis.com\322A\360\001https://www.google"
          + "apis.com/auth/cloud-platform,https://www"
          + ".googleapis.com/auth/cloud-platform.read"
          + "-only,https://www.googleapis.com/auth/lo"
          + "gging.admin,https://www.googleapis.com/a"
          + "uth/logging.read,https://www.googleapis."
          + "com/auth/logging.writeB\262\001\n\025com.google.lo"
          + "gging.v2B\014LoggingProtoP\001Z5cloud.google.c"
          + "om/go/logging/apiv2/loggingpb;loggingpb\370"
          + "\001\001\252\002\027Google.Cloud.Logging.V2\312\002\027Google\\Cl"
          + "oud\\Logging\\V2\352\002\032Google::Cloud::Logging:"
          + ":V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.logging.v2.LogEntryProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_logging_v2_DeleteLogRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v2_DeleteLogRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_DeleteLogRequest_descriptor,
            new java.lang.String[] {
              "LogName",
            });
    internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v2_WriteLogEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor,
            new java.lang.String[] {
              "LogName", "Resource", "Labels", "Entries", "PartialSuccess", "DryRun",
            });
    internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor =
        internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v2_WriteLogEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor,
            new java.lang.String[] {
              "LogEntryErrors",
            });
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor =
        internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_logging_v2_ListLogEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_logging_v2_ListLogEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListLogEntriesRequest_descriptor,
            new java.lang.String[] {
              "ResourceNames", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_logging_v2_ListLogEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_logging_v2_ListLogEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListLogEntriesResponse_descriptor,
            new java.lang.String[] {
              "Entries", "NextPageToken",
            });
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "PageSize", "PageToken",
            });
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "ResourceDescriptors", "NextPageToken",
            });
    internal_static_google_logging_v2_ListLogsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_logging_v2_ListLogsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListLogsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "ResourceNames",
            });
    internal_static_google_logging_v2_ListLogsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_logging_v2_ListLogsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListLogsResponse_descriptor,
            new java.lang.String[] {
              "LogNames", "NextPageToken",
            });
    internal_static_google_logging_v2_TailLogEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_logging_v2_TailLogEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_TailLogEntriesRequest_descriptor,
            new java.lang.String[] {
              "ResourceNames", "Filter", "BufferWindow",
            });
    internal_static_google_logging_v2_TailLogEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_logging_v2_TailLogEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_TailLogEntriesResponse_descriptor,
            new java.lang.String[] {
              "Entries", "SuppressionInfo",
            });
    internal_static_google_logging_v2_TailLogEntriesResponse_SuppressionInfo_descriptor =
        internal_static_google_logging_v2_TailLogEntriesResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_TailLogEntriesResponse_SuppressionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_TailLogEntriesResponse_SuppressionInfo_descriptor,
            new java.lang.String[] {
              "Reason", "SuppressedCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.logging.v2.LogEntryProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
