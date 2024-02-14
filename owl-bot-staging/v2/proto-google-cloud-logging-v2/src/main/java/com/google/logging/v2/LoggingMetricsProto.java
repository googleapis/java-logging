// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_metrics.proto

// Protobuf Java Version: 3.25.2
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
      "mestamp.proto\"\275\005\n\tLogMetric\022\021\n\004name\030\001 \001(" +
      "\tB\003\340A\002\022\030\n\013description\030\002 \001(\tB\003\340A\001\022\023\n\006filt" +
      "er\030\003 \001(\tB\003\340A\002\022\030\n\013bucket_name\030\r \001(\tB\003\340A\001\022" +
      "\025\n\010disabled\030\014 \001(\010B\003\340A\001\022<\n\021metric_descrip" +
      "tor\030\005 \001(\0132\034.google.api.MetricDescriptorB" +
      "\003\340A\001\022\034\n\017value_extractor\030\006 \001(\tB\003\340A\001\022P\n\020la" +
      "bel_extractors\030\007 \003(\01321.google.logging.v2" +
      ".LogMetric.LabelExtractorsEntryB\003\340A\001\022C\n\016" +
      "bucket_options\030\010 \001(\0132&.google.api.Distri" +
      "bution.BucketOptionsB\003\340A\001\0224\n\013create_time" +
      "\030\t \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "4\n\013update_time\030\n \001(\0132\032.google.protobuf.T" +
      "imestampB\003\340A\003\022<\n\007version\030\004 \001(\0162\'.google." +
      "logging.v2.LogMetric.ApiVersionB\002\030\001\0326\n\024L" +
      "abelExtractorsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"\034\n\nApiVersion\022\006\n\002V2\020\000\022\006\n\002V1\020" +
      "\001:J\352AG\n logging.googleapis.com/LogMetric" +
      "\022#projects/{project}/metrics/{metric}\"\215\001" +
      "\n\025ListLogMetricsRequest\022C\n\006parent\030\001 \001(\tB" +
      "3\340A\002\372A-\n+cloudresourcemanager.googleapis" +
      ".com/Project\022\027\n\npage_token\030\002 \001(\tB\003\340A\001\022\026\n" +
      "\tpage_size\030\003 \001(\005B\003\340A\001\"`\n\026ListLogMetricsR" +
      "esponse\022-\n\007metrics\030\001 \003(\0132\034.google.loggin" +
      "g.v2.LogMetric\022\027\n\017next_page_token\030\002 \001(\t\"" +
      "T\n\023GetLogMetricRequest\022=\n\013metric_name\030\001 " +
      "\001(\tB(\340A\002\372A\"\n logging.googleapis.com/LogM" +
      "etric\"\205\001\n\026CreateLogMetricRequest\0228\n\006pare" +
      "nt\030\001 \001(\tB(\340A\002\372A\"\022 logging.googleapis.com" +
      "/LogMetric\0221\n\006metric\030\002 \001(\0132\034.google.logg" +
      "ing.v2.LogMetricB\003\340A\002\"\212\001\n\026UpdateLogMetri" +
      "cRequest\022=\n\013metric_name\030\001 \001(\tB(\340A\002\372A\"\n l" +
      "ogging.googleapis.com/LogMetric\0221\n\006metri" +
      "c\030\002 \001(\0132\034.google.logging.v2.LogMetricB\003\340" +
      "A\002\"W\n\026DeleteLogMetricRequest\022=\n\013metric_n" +
      "ame\030\001 \001(\tB(\340A\002\372A\"\n logging.googleapis.co" +
      "m/LogMetric2\256\010\n\020MetricsServiceV2\022\227\001\n\016Lis" +
      "tLogMetrics\022(.google.logging.v2.ListLogM" +
      "etricsRequest\032).google.logging.v2.ListLo" +
      "gMetricsResponse\"0\332A\006parent\202\323\344\223\002!\022\037/v2/{" +
      "parent=projects/*}/metrics\022\222\001\n\014GetLogMet" +
      "ric\022&.google.logging.v2.GetLogMetricRequ" +
      "est\032\034.google.logging.v2.LogMetric\"<\332A\013me" +
      "tric_name\202\323\344\223\002(\022&/v2/{metric_name=projec" +
      "ts/*/metrics/*}\022\233\001\n\017CreateLogMetric\022).go" +
      "ogle.logging.v2.CreateLogMetricRequest\032\034" +
      ".google.logging.v2.LogMetric\"?\332A\rparent," +
      "metric\202\323\344\223\002)\"\037/v2/{parent=projects/*}/me" +
      "trics:\006metric\022\247\001\n\017UpdateLogMetric\022).goog" +
      "le.logging.v2.UpdateLogMetricRequest\032\034.g" +
      "oogle.logging.v2.LogMetric\"K\332A\022metric_na" +
      "me,metric\202\323\344\223\0020\032&/v2/{metric_name=projec" +
      "ts/*/metrics/*}:\006metric\022\222\001\n\017DeleteLogMet" +
      "ric\022).google.logging.v2.DeleteLogMetricR" +
      "equest\032\026.google.protobuf.Empty\"<\332A\013metri" +
      "c_name\202\323\344\223\002(*&/v2/{metric_name=projects/" +
      "*/metrics/*}\032\215\002\312A\026logging.googleapis.com" +
      "\322A\360\001https://www.googleapis.com/auth/clou" +
      "d-platform,https://www.googleapis.com/au" +
      "th/cloud-platform.read-only,https://www." +
      "googleapis.com/auth/logging.admin,https:" +
      "//www.googleapis.com/auth/logging.read,h" +
      "ttps://www.googleapis.com/auth/logging.w" +
      "riteB\271\001\n\025com.google.logging.v2B\023LoggingM" +
      "etricsProtoP\001Z5cloud.google.com/go/loggi" +
      "ng/apiv2/loggingpb;loggingpb\370\001\001\252\002\027Google" +
      ".Cloud.Logging.V2\312\002\027Google\\Cloud\\Logging" +
      "\\V2\352\002\032Google::Cloud::Logging::V2b\006proto3"
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
