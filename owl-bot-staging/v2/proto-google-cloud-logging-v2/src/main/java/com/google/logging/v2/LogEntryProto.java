// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/log_entry.proto

package com.google.logging.v2;

public final class LogEntryProto {
  private LogEntryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogEntry_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogEntry_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogEntryOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogEntryOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogEntrySourceLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogEntrySourceLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!google/logging/v2/log_entry.proto\022\021goo" +
      "gle.logging.v2\032\037google/api/field_behavio" +
      "r.proto\032#google/api/monitored_resource.p" +
      "roto\032\031google/api/resource.proto\032&google/" +
      "logging/type/http_request.proto\032&google/" +
      "logging/type/log_severity.proto\032\031google/" +
      "protobuf/any.proto\032\034google/protobuf/stru" +
      "ct.proto\032\037google/protobuf/timestamp.prot" +
      "o\032\027google/rpc/status.proto\032\034google/api/a" +
      "nnotations.proto\"\322\007\n\010LogEntry\022\025\n\010log_nam" +
      "e\030\014 \001(\tB\003\340A\002\0224\n\010resource\030\010 \001(\0132\035.google." +
      "api.MonitoredResourceB\003\340A\002\022-\n\rproto_payl" +
      "oad\030\002 \001(\0132\024.google.protobuf.AnyH\000\022\026\n\014tex" +
      "t_payload\030\003 \001(\tH\000\022/\n\014json_payload\030\006 \001(\0132" +
      "\027.google.protobuf.StructH\000\0222\n\ttimestamp\030" +
      "\t \001(\0132\032.google.protobuf.TimestampB\003\340A\001\022:" +
      "\n\021receive_timestamp\030\030 \001(\0132\032.google.proto" +
      "buf.TimestampB\003\340A\003\0227\n\010severity\030\n \001(\0162 .g" +
      "oogle.logging.type.LogSeverityB\003\340A\001\022\026\n\ti" +
      "nsert_id\030\004 \001(\tB\003\340A\001\022;\n\014http_request\030\007 \001(" +
      "\0132 .google.logging.type.HttpRequestB\003\340A\001" +
      "\022<\n\006labels\030\013 \003(\0132\'.google.logging.v2.Log" +
      "Entry.LabelsEntryB\003\340A\001\022<\n\toperation\030\017 \001(" +
      "\0132$.google.logging.v2.LogEntryOperationB" +
      "\003\340A\001\022\022\n\005trace\030\026 \001(\tB\003\340A\001\022\024\n\007span_id\030\033 \001(" +
      "\tB\003\340A\001\022\032\n\rtrace_sampled\030\036 \001(\010B\003\340A\001\022G\n\017so" +
      "urce_location\030\027 \001(\0132).google.logging.v2." +
      "LogEntrySourceLocationB\003\340A\001\032-\n\013LabelsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\275\001\352A\271" +
      "\001\n\032logging.googleapis.com/Log\022\035projects/" +
      "{project}/logs/{log}\022\'organizations/{org" +
      "anization}/logs/{log}\022\033folders/{folder}/" +
      "logs/{log}\022,billingAccounts/{billing_acc" +
      "ount}/logs/{log}\032\010log_nameB\t\n\007payload\"b\n" +
      "\021LogEntryOperation\022\017\n\002id\030\001 \001(\tB\003\340A\001\022\025\n\010p" +
      "roducer\030\002 \001(\tB\003\340A\001\022\022\n\005first\030\003 \001(\010B\003\340A\001\022\021" +
      "\n\004last\030\004 \001(\010B\003\340A\001\"U\n\026LogEntrySourceLocat" +
      "ion\022\021\n\004file\030\001 \001(\tB\003\340A\001\022\021\n\004line\030\002 \001(\003B\003\340A" +
      "\001\022\025\n\010function\030\003 \001(\tB\003\340A\001B\266\001\n\025com.google." +
      "logging.v2B\rLogEntryProtoP\001Z8google.gola" +
      "ng.org/genproto/googleapis/logging/v2;lo" +
      "gging\370\001\001\252\002\027Google.Cloud.Logging.V2\312\002\027Goo" +
      "gle\\Cloud\\Logging\\V2\352\002\032Google::Cloud::Lo" +
      "gging::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.MonitoredResourceProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.logging.type.HttpRequestProto.getDescriptor(),
          com.google.logging.type.LogSeverityProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_logging_v2_LogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v2_LogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogEntry_descriptor,
        new java.lang.String[] { "LogName", "Resource", "ProtoPayload", "TextPayload", "JsonPayload", "Timestamp", "ReceiveTimestamp", "Severity", "InsertId", "HttpRequest", "Labels", "Operation", "Trace", "SpanId", "TraceSampled", "SourceLocation", "Payload", });
    internal_static_google_logging_v2_LogEntry_LabelsEntry_descriptor =
      internal_static_google_logging_v2_LogEntry_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_LogEntry_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogEntry_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_logging_v2_LogEntryOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v2_LogEntryOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogEntryOperation_descriptor,
        new java.lang.String[] { "Id", "Producer", "First", "Last", });
    internal_static_google_logging_v2_LogEntrySourceLocation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v2_LogEntrySourceLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogEntrySourceLocation_descriptor,
        new java.lang.String[] { "File", "Line", "Function", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.logging.type.HttpRequestProto.getDescriptor();
    com.google.logging.type.LogSeverityProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
