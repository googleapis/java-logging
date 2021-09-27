# Google Cloud Logging Client for Java

Java idiomatic client for [Cloud Logging][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]


## Quickstart

If you are using Maven with [BOM][libraries-bom], add this to your pom.xml file

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>libraries-bom</artifactId>
      <version>23.0.0</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>

<dependencies>
  <dependency>
    <groupId>com.google.cloud</groupId>
    <artifactId>google-cloud-logging</artifactId>
  </dependency>

</dependencies>

```

If you are using Maven without BOM, add this to your dependencies:


```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-logging</artifactId>
  <version>3.1.2</version>
</dependency>

```

If you are using Gradle 5.x or later, add this to your dependencies

```Groovy
implementation platform('com.google.cloud:libraries-bom:23.0.0')

implementation 'com.google.cloud:google-cloud-logging'
```
If you are using Gradle without BOM, add this to your dependencies

```Groovy
implementation 'com.google.cloud:google-cloud-logging:3.1.2'
```

If you are using SBT, add this to your dependencies

```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-logging" % "3.1.2"
```

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Authorization

The client application making API calls must be granted [authorization scopes][auth-scopes] required for the desired Cloud Logging APIs, and the authenticated principal must have the [IAM role(s)][predefined-iam-roles] required to access GCP resources using the Cloud Logging API calls.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Cloud Logging [API enabled][enable-api].

[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-cloud-logging` library.  See the [Quickstart](#quickstart) section
to add `google-cloud-logging` as a dependency in your code.

## About Cloud Logging


[Cloud Logging][product-docs] allows you to store, search, analyze, monitor, and alert on log data and events from Google Cloud and Amazon Web Services. Using the BindPlane service, you can also collect this data from over 150 common application components, on-premises systems, and hybrid cloud systems. BindPlane is included with your Google Cloud project at no additional cost.

See the [Cloud Logging client library docs][javadocs] to learn how to
use this Cloud Logging Client Library.


#### Creating an authorized service object

To make requests to Cloud Logging, you must create a service object with valid credentials.
You can then make API calls by calling methods on the Logging service object. 
You can obtain credentials by using [Application Default Credentials](https://developers.google.com/identity/protocols/application-default-credentials).
Or you can use a [Service Account](https://cloud.google.com/iam/docs/service-accounts) which is a recommended way to obtain credentials.
The credentials can be automatically inferred from your [environment](https://cloud.google.com/docs/authentication/getting-started#setting_the_environment_variable).
Then you only need the following code to create your service object:

```java
import com.google.cloud.logging.Logging;
import com.google.cloud.logging.LoggingOptions;

LoggingOptions options = LoggingOptions.getDefaultInstance();
try(Logging logging = options.getService()) {
  // use logging here
}
```

For other options, see the [Authentication](https://github.com/googleapis/google-cloud-java#authentication) page.
The service object should be granted permissions to make API calls.
Each API call describes the permissions under Authorized Scopes section.
See [Logging API](https://cloud.google.com/logging/docs/reference/v2/rest) to find the required list of permissions or consult with [Access control guide](https://cloud.google.com/logging/docs/access-control) for predefined IAM roles that can be granted to the Logging service object.

#### Creating a metric
With Logging you can create logs-based metrics. Logs-based metrics allow to keep track of the number
of log messages associated to specific events. Add the following imports at the top of your file:

```java
import com.google.cloud.logging.Metric;
import com.google.cloud.logging.MetricInfo;
```

Then, to create the metric, use the following code:

```java
MetricInfo metricInfo = MetricInfo.newBuilder("test-metric", "severity >= ERROR")
    .setDescription("Log entries with severity higher or equal to ERROR")
    .build();
logging.create(metricInfo);
```

#### Writing log entries

With Logging you can also write custom log entries. Add the following imports at the top of your
file:

```java
import com.google.cloud.MonitoredResource;
import com.google.cloud.logging.LogEntry;
import com.google.cloud.logging.Logging;
import com.google.cloud.logging.Payload.StringPayload;

import java.util.Collections;
```

Then, to write the log entries, use the following code:

```java
LogEntry firstEntry = LogEntry.newBuilder(StringPayload.of("message"))
    .setLogName("test-log")
    .setResource(MonitoredResource.newBuilder("global")
        .addLabel("project_id", options.getProjectId())
        .build())
    .build();
logging.write(Collections.singleton(firstEntry));
```

The library supports writing log entries synchronously and asynchronously.
In the synchronous mode each call to `write()` method results in a consequent call to Logging API to write a log entry.
In the asynchronous mode the call(s) to Logging API takes place asynchronously and few calls to `write()` method may be batched together to compose a single call to Logging API.
The default mode of writing is asynchronous.
It can be configured in the `java.util.logging` handler [configuration file](https://cloud.google.com/logging/docs/setup/java#javautillogging_configuration):

```
com.google.cloud.logging.LoggingHandler.synchronicity=SYNC
```

or in the code after initiating an instance of `Logging` by calling:

```java
logging.setWriteSynchronicity(Synchronicity.SYNC);
```

NOTE:
> Writing log entries asynchronously in some Google Cloud managed environments (e.g. Cloud Functions)
> may lead to unexpected results such as absense of expected log entries or abnormal program execution.
> To avoid these unexpected results, it is recommended to use synchronous mode.

#### Listing log entries

With Logging you can also list log entries that have been previously written. Add the following
imports at the top of your file:

```java
import com.google.cloud.Page;
import com.google.cloud.logging.LogEntry;
import com.google.cloud.logging.Logging.EntryListOption;
```

Then, to list the log entries, use the following code:

``` java
Page<LogEntry> entries = logging.listLogEntries(
    EntryListOption.filter("logName=projects/" + options.getProjectId() + "/logs/test-log"));
Iterator<LogEntry> entryIterator = entries.iterateAll().iterator();
while (entryIterator.hasNext()) {
  System.out.println(entryIterator.next());
}
```

#### Add a Cloud Logging handler to a logger

You can also register a `LoggingHandler` to a `java.util.logging.Logger` that publishes log entries
to Cloud Logging. Given the following logger:

```java
private final static Logger LOGGER = Logger.getLogger(MyClass.class.getName());
```

You can register a `LoggingHandler` with the code:

```java
LoggingHandler.addHandler(LOGGER, new LoggingHandler());
```

After that, logs generated using `LOGGER` will be also directed to Cloud Logging.

Notice that you can also register a `LoggingHandler` via the `logging.properties` configuration
file. Adding, for instance, the following line:

```
com.google.cloud.examples.logging.snippets.AddLoggingHandler.handlers=com.google.cloud.logging.LoggingHandler
```

#### Complete source code

In
[CreateAndListMetrics.java](https://github.com/googleapis/google-cloud-java/tree/master/google-cloud-examples/src/main/java/com/google/cloud/examples/logging/snippets/CreateAndListMetrics.java),
[WriteAndListLogEntries.java](https://github.com/googleapis/google-cloud-java/tree/master/google-cloud-examples/src/main/java/com/google/cloud/examples/logging/snippets/WriteAndListLogEntries.java)
and
[AddLoggingHandler.java](https://github.com/googleapis/google-cloud-java/tree/master/google-cloud-examples/src/main/java/com/google/cloud/examples/logging/snippets/AddLoggingHandler.java)
we put together all the code shown above into three programs. The programs assume that you are
running on Compute Engine or from your own desktop.



## Samples

Samples are in the [`samples/`](https://github.com/googleapis/java-logging/tree/master/samples) directory.

| Sample                      | Source Code                       | Try it |
| --------------------------- | --------------------------------- | ------ |
| Get Sink Metadata | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/GetSinkMetadata.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/GetSinkMetadata.java) |
| List Log Entries | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/ListLogEntries.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/ListLogEntries.java) |
| List Logs | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/ListLogs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/ListLogs.java) |
| Log Entry Write Http Request | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/LogEntryWriteHttpRequest.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/LogEntryWriteHttpRequest.java) |
| Quickstart Sample | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/QuickstartSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/QuickstartSample.java) |
| Tail Log Entries | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/TailLogEntries.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/TailLogEntries.java) |
| Write Log Entry | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/WriteLogEntry.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/WriteLogEntry.java) |
| Quickstart | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/jul/Quickstart.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/jul/Quickstart.java) |
| Example Enhancer | [source code](https://github.com/googleapis/java-logging/blob/master/samples/snippets/src/main/java/com/example/logging/jul/enhancers/ExampleEnhancer.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-logging&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/logging/jul/enhancers/ExampleEnhancer.java) |



## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

Cloud Logging uses gRPC for the transport layer.

## Supported Java Versions

Java 7 or above is required for using this client.

Google's Java client libraries,
[Google Cloud Client Libraries][cloudlibs]
and
[Google Cloud API Libraries][apilibs],
follow the
[Oracle Java SE support roadmap][oracle]
(see the Oracle Java SE Product Releases section).

### For new development

In general, new feature development occurs with support for the lowest Java
LTS version covered by  Oracle's Premier Support (which typically lasts 5 years
from initial General Availability). If the minimum required JVM for a given
library is changed, it is accompanied by a [semver][semver] major release.

Java 11 and (in September 2021) Java 17 are the best choices for new
development.

### Keeping production systems current

Google tests its client libraries with all current LTS versions covered by
Oracle's Extended Support (which typically lasts 8 years from initial
General Availability).

#### Legacy support

Google's client libraries support legacy versions of Java runtimes with long
term stable libraries that don't receive feature updates on a best efforts basis
as it may not be possible to backport all patches.

Google provides updates on a best efforts basis to apps that continue to use
Java 7, though apps might need to upgrade to current versions of the library
that supports their JVM.

#### Where to find specific information

The latest versions and the supported Java versions are identified on
the individual GitHub repository `github.com/GoogleAPIs/java-SERVICENAME`
and on [google-cloud-java][g-c-j].

## Versioning


This library follows [Semantic Versioning](http://semver.org/).



## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.


## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 7 | [![Kokoro CI][kokoro-badge-image-1]][kokoro-badge-link-1]
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

Java is a registered trademark of Oracle and/or its affiliates.

[product-docs]: https://cloud.google.com/logging/docs
[javadocs]: https://googleapis.dev/java/google-cloud-logging/latest/
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-logging/java11.html
[stability-image]: https://img.shields.io/badge/stability-ga-green
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-logging.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.cloud%20AND%20a:google-cloud-logging&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[auth-scopes]: https://developers.google.com/identity/protocols/oauth2/scopes
[predefined-iam-roles]: https://cloud.google.com/iam/docs/understanding-roles#predefined_roles
[iam-policy]: https://cloud.google.com/iam/docs/overview#cloud-iam-policy
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/master/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-logging/blob/master/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-logging/blob/master/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-logging/blob/master/LICENSE

[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=logging.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png

[semver]: https://semver.org/
[cloudlibs]: https://cloud.google.com/apis/docs/client-libraries-explained
[apilibs]: https://cloud.google.com/apis/docs/client-libraries-explained#google_api_client_libraries
[oracle]: https://www.oracle.com/java/technologies/java-se-support-roadmap.html
[g-c-j]: http://github.com/googleapis/google-cloud-java
