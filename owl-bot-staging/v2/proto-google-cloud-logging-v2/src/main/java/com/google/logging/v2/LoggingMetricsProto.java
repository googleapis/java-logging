// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_metrics.proto

package com.google.logging.v2;

public final class LoggingMetricsProto {
  private LoggingMetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListLogMetricsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListLogMetricsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_GetLogMetricRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_GetLogMetricRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_CreateLogMetricRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_CreateLogMetricRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_UpdateLogMetricRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_DeleteLogMetricRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/logging/v2/logging_metrics.prot" +
      "o\022\021google.logging.v2\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\035goo" +
      "gle/api/distribution.proto\032\037google/api/f" +
      "ield_behavior.proto\032\027google/api/metric.p" +
      "roto\032\031google/api/resource.proto\032\033google/" +
      "protobuf/empty.proto\032\037google/protobuf/ti" +
      "mestamp.proto\"\310\005\n\tLogMetric\022\022\n\004name\030\001 \001(" +
      "\tB\004\342A\001\002\022\031\n\013description\030\002 \001(\tB\004\342A\001\001\022\024\n\006fi" +
      "lter\030\003 \001(\tB\004\342A\001\002\022\031\n\013bucket_name\030\r \001(\tB\004\342" +
      "A\001\001\022\026\n\010disabled\030\014 \001(\010B\004\342A\001\001\022=\n\021metric_de" +
      "scriptor\030\005 \001(\0132\034.google.api.MetricDescri" +
      "ptorB\004\342A\001\001\022\035\n\017value_extractor\030\006 \001(\tB\004\342A\001" +
      "\001\022Q\n\020label_extractors\030\007 \003(\01321.google.log" +
      "ging.v2.LogMetric.LabelExtractorsEntryB\004" +
      "\342A\001\001\022D\n\016bucket_options\030\010 \001(\0132&.google.ap" +
      "i.Distribution.BucketOptionsB\004\342A\001\001\0225\n\013cr" +
      "eate_time\030\t \001(\0132\032.google.protobuf.Timest" +
      "ampB\004\342A\001\003\0225\n\013update_time\030\n \001(\0132\032.google." +
      "protobuf.TimestampB\004\342A\001\003\022<\n\007version\030\004 \001(" +
      "\0162\'.google.logging.v2.LogMetric.ApiVersi" +
      "onB\002\030\001\0326\n\024LabelExtractorsEntry\022\013\n\003key\030\001 " +
      "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\034\n\nApiVersion\022\006\n\002" +
      "V2\020\000\022\006\n\002V1\020\001:J\352AG\n logging.googleapis.co" +
      "m/LogMetric\022#projects/{project}/metrics/" +
      "{metric}\"\220\001\n\025ListLogMetricsRequest\022D\n\006pa" +
      "rent\030\001 \001(\tB4\342A\001\002\372A-\n+cloudresourcemanage" +
      "r.googleapis.com/Project\022\030\n\npage_token\030\002" +
      " \001(\tB\004\342A\001\001\022\027\n\tpage_size\030\003 \001(\005B\004\342A\001\001\"`\n\026L" +
      "istLogMetricsResponse\022-\n\007metrics\030\001 \003(\0132\034" +
      ".google.logging.v2.LogMetric\022\027\n\017next_pag" +
      "e_token\030\002 \001(\t\"U\n\023GetLogMetricRequest\022>\n\013" +
      "metric_name\030\001 \001(\tB)\342A\001\002\372A\"\n logging.goog" +
      "leapis.com/LogMetric\"\207\001\n\026CreateLogMetric" +
      "Request\0229\n\006parent\030\001 \001(\tB)\342A\001\002\372A\"\022 loggin" +
      "g.googleapis.com/LogMetric\0222\n\006metric\030\002 \001" +
      "(\0132\034.google.logging.v2.LogMetricB\004\342A\001\002\"\214" +
      "\001\n\026UpdateLogMetricRequest\022>\n\013metric_name" +
      "\030\001 \001(\tB)\342A\001\002\372A\"\n logging.googleapis.com/" +
      "LogMetric\0222\n\006metric\030\002 \001(\0132\034.google.loggi" +
      "ng.v2.LogMetricB\004\342A\001\002\"X\n\026DeleteLogMetric" +
      "Request\022>\n\013metric_name\030\001 \001(\tB)\342A\001\002\372A\"\n l" +
      "ogging.googleapis.com/LogMetric2\256\010\n\020Metr" +
      "icsServiceV2\022\227\001\n\016ListLogMetrics\022(.google" +
      ".logging.v2.ListLogMetricsRequest\032).goog" +
      "le.logging.v2.ListLogMetricsResponse\"0\332A" +
      "\006parent\202\323\344\223\002!\022\037/v2/{parent=projects/*}/m" +
      "etrics\022\222\001\n\014GetLogMetric\022&.google.logging" +
      ".v2.GetLogMetricRequest\032\034.google.logging" +
      ".v2.LogMetric\"<\332A\013metric_name\202\323\344\223\002(\022&/v2" +
      "/{metric_name=projects/*/metrics/*}\022\233\001\n\017" +
      "CreateLogMetric\022).google.logging.v2.Crea" +
      "teLogMetricRequest\032\034.google.logging.v2.L" +
      "ogMetric\"?\332A\rparent,metric\202\323\344\223\002)\"\037/v2/{p" +
      "arent=projects/*}/metrics:\006metric\022\247\001\n\017Up" +
      "dateLogMetric\022).google.logging.v2.Update" +
      "LogMetricRequest\032\034.google.logging.v2.Log" +
      "Metric\"K\332A\022metric_name,metric\202\323\344\223\0020\032&/v2" +
      "/{metric_name=projects/*/metrics/*}:\006met" +
      "ric\022\222\001\n\017DeleteLogMetric\022).google.logging" +
      ".v2.DeleteLogMetricRequest\032\026.google.prot" +
      "obuf.Empty\"<\332A\013metric_name\202\323\344\223\002(*&/v2/{m" +
      "etric_name=projects/*/metrics/*}\032\215\002\312A\026lo" +
      "gging.googleapis.com\322A\360\001https://www.goog" +
      "leapis.com/auth/cloud-platform,https://w" +
      "ww.googleapis.com/auth/cloud-platform.re" +
      "ad-only,https://www.googleapis.com/auth/" +
      "logging.admin,https://www.googleapis.com" +
      "/auth/logging.read,https://www.googleapi" +
      "s.com/auth/logging.writeB\271\001\n\025com.google." +
      "logging.v2B\023LoggingMetricsProtoP\001Z5cloud" +
      ".google.com/go/logging/apiv2/loggingpb;l" +
      "oggingpb\370\001\001\252\002\027Google.Cloud.Logging.V2\312\002\027" +
      "Google\\Cloud\\Logging\\V2\352\002\032Google::Cloud:" +
      ":Logging::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.DistributionProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.MetricProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_logging_v2_LogMetric_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v2_LogMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogMetric_descriptor,
        new java.lang.String[] { "Name", "Description", "Filter", "BucketName", "Disabled", "MetricDescriptor", "ValueExtractor", "LabelExtractors", "BucketOptions", "CreateTime", "UpdateTime", "Version", });
    internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_descriptor =
      internal_static_google_logging_v2_LogMetric_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_logging_v2_ListLogMetricsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v2_ListLogMetricsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListLogMetricsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageToken", "PageSize", });
    internal_static_google_logging_v2_ListLogMetricsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v2_ListLogMetricsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListLogMetricsResponse_descriptor,
        new java.lang.String[] { "Metrics", "NextPageToken", });
    internal_static_google_logging_v2_GetLogMetricRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_logging_v2_GetLogMetricRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_GetLogMetricRequest_descriptor,
        new java.lang.String[] { "MetricName", });
    internal_static_google_logging_v2_CreateLogMetricRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_logging_v2_CreateLogMetricRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_CreateLogMetricRequest_descriptor,
        new java.lang.String[] { "Parent", "Metric", });
    internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_logging_v2_UpdateLogMetricRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor,
        new java.lang.String[] { "MetricName", "Metric", });
    internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_logging_v2_DeleteLogMetricRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor,
        new java.lang.String[] { "MetricName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.DistributionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
