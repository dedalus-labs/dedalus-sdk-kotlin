# Dedalus Kotlin API Library

[![Maven Central](https://img.shields.io/maven-central/v/com.dedalus_sdk.api/dedalus-kotlin)](https://central.sonatype.com/artifact/com.dedalus_sdk.api/dedalus-kotlin/0.0.1)
[![javadoc](https://javadoc.io/badge2/com.dedalus_sdk.api/dedalus-kotlin/0.0.1/javadoc.svg)](https://javadoc.io/doc/com.dedalus_sdk.api/dedalus-kotlin/0.0.1)

The Dedalus Kotlin SDK provides convenient access to the [Dedalus REST API](https://docs.dedaluslabs.ai) from applications written in Kotlin.

It is generated with [Stainless](https://www.stainless.com/).

## MCP Server

Use the Dedalus MCP Server to enable AI assistants to interact with this API, allowing them to explore endpoints, make test requests, and use documentation to help integrate this SDK into your application.

[![Add to Cursor](https://cursor.com/deeplink/mcp-install-dark.svg)](https://cursor.com/en-US/install-mcp?name=dedalus-labs-mcp&config=eyJuYW1lIjoiZGVkYWx1cy1sYWJzLW1jcCIsInRyYW5zcG9ydCI6Imh0dHAiLCJ1cmwiOiJodHRwczovL2RlZGFsdXMtc2RrLnN0bG1jcC5jb20iLCJoZWFkZXJzIjp7IngtZGVkYWx1cy1hcGkta2V5IjoiTXkgQVBJIEtleSIsIngtYXBpLWtleSI6Ik15IFggQVBJIEtleSJ9fQ)
[![Install in VS Code](https://img.shields.io/badge/_-Add_to_VS_Code-blue?style=for-the-badge&logo=data:image/svg%2bxml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIGZpbGw9Im5vbmUiIHZpZXdCb3g9IjAgMCA0MCA0MCI+PHBhdGggZmlsbD0iI0VFRSIgZmlsbC1ydWxlPSJldmVub2RkIiBkPSJNMzAuMjM1IDM5Ljg4NGEyLjQ5MSAyLjQ5MSAwIDAgMS0xLjc4MS0uNzNMMTIuNyAyNC43OGwtMy40NiAyLjYyNC0zLjQwNiAyLjU4MmExLjY2NSAxLjY2NSAwIDAgMS0xLjA4Mi4zMzggMS42NjQgMS42NjQgMCAwIDEtMS4wNDYtLjQzMWwtMi4yLTJhMS42NjYgMS42NjYgMCAwIDEgMC0yLjQ2M0w3LjQ1OCAyMCA0LjY3IDE3LjQ1MyAxLjUwNyAxNC41N2ExLjY2NSAxLjY2NSAwIDAgMSAwLTIuNDYzbDIuMi0yYTEuNjY1IDEuNjY1IDAgMCAxIDIuMTMtLjA5N2w2Ljg2MyA1LjIwOUwyOC40NTIuODQ0YTIuNDg4IDIuNDg4IDAgMCAxIDEuODQxLS43MjljLjM1MS4wMDkuNjk5LjA5MSAxLjAxOS4yNDVsOC4yMzYgMy45NjFhMi41IDIuNSAwIDAgMSAxLjQxNSAyLjI1M3YuMDk5LS4wNDVWMzMuMzd2LS4wNDUuMDk1YTIuNTAxIDIuNTAxIDAgMCAxLTEuNDE2IDIuMjU3bC04LjIzNSAzLjk2MWEyLjQ5MiAyLjQ5MiAwIDAgMS0xLjA3Ny4yNDZabS43MTYtMjguOTQ3LTExLjk0OCA5LjA2MiAxMS45NTIgOS4wNjUtLjAwNC0xOC4xMjdaIi8+PC9zdmc+)](https://vscode.stainless.com/mcp/%7B%22name%22%3A%22dedalus-labs-mcp%22%2C%22type%22%3A%22http%22%2C%22url%22%3A%22https%3A%2F%2Fdedalus-sdk.stlmcp.com%22%2C%22headers%22%3A%7B%22x-dedalus-api-key%22%3A%22My%20API%20Key%22%2C%22x-api-key%22%3A%22My%20X%20API%20Key%22%7D%7D)

> Note: You may need to set environment variables in your MCP client.

The REST API documentation can be found on [docs.dedaluslabs.ai](https://docs.dedaluslabs.ai). KDocs are available on [javadoc.io](https://javadoc.io/doc/com.dedalus_sdk.api/dedalus-kotlin/0.0.1).

## Installation

### Gradle

```kotlin
implementation("com.dedalus_sdk.api:dedalus-kotlin:0.0.1")
```

### Maven

```xml
<dependency>
  <groupId>com.dedalus_sdk.api</groupId>
  <artifactId>dedalus-kotlin</artifactId>
  <version>0.0.1</version>
</dependency>
```

## Requirements

This library requires Java 8 or later.

## Usage

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams

// Configures using the `dedalus.apiKey`, `dedalus.xApiKey`, `dedalus.asUrl`, `dedalus.orgId`, `dedalus.provider`, `dedalus.providerKey`, `dedalus.providerModel` and `dedalus.baseUrl` system properties
// Or configures using the `DEDALUS_API_KEY`, `DEDALUS_X_API_KEY`, `DEDALUS_AS_URL`, `DEDALUS_ORG_ID`, `DEDALUS_PROVIDER`, `DEDALUS_PROVIDER_KEY`, `DEDALUS_PROVIDER_MODEL` and `DEDALUS_BASE_URL` environment variables
val client: DedalusClient = DedalusOkHttpClient.fromEnv()

val params: ChatCompletionCreateParams = ChatCompletionCreateParams.builder()
    .model("openai/gpt-5")
    .build()
val chatCompletion: ChatCompletion = client.chat().completions().create(params)
```

## Client configuration

Configure the client using system properties or environment variables:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient

// Configures using the `dedalus.apiKey`, `dedalus.xApiKey`, `dedalus.asUrl`, `dedalus.orgId`, `dedalus.provider`, `dedalus.providerKey`, `dedalus.providerModel` and `dedalus.baseUrl` system properties
// Or configures using the `DEDALUS_API_KEY`, `DEDALUS_X_API_KEY`, `DEDALUS_AS_URL`, `DEDALUS_ORG_ID`, `DEDALUS_PROVIDER`, `DEDALUS_PROVIDER_KEY`, `DEDALUS_PROVIDER_MODEL` and `DEDALUS_BASE_URL` environment variables
val client: DedalusClient = DedalusOkHttpClient.fromEnv()
```

Or manually:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient

val client: DedalusClient = DedalusOkHttpClient.builder()
    .apiKey("My API Key")
    .build()
```

Or using a combination of the two approaches:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient

val client: DedalusClient = DedalusOkHttpClient.builder()
    // Configures using the `dedalus.apiKey`, `dedalus.xApiKey`, `dedalus.asUrl`, `dedalus.orgId`, `dedalus.provider`, `dedalus.providerKey`, `dedalus.providerModel` and `dedalus.baseUrl` system properties
    // Or configures using the `DEDALUS_API_KEY`, `DEDALUS_X_API_KEY`, `DEDALUS_AS_URL`, `DEDALUS_ORG_ID`, `DEDALUS_PROVIDER`, `DEDALUS_PROVIDER_KEY`, `DEDALUS_PROVIDER_MODEL` and `DEDALUS_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build()
```

See this table for the available options:

| Setter          | System property         | Environment variable     | Required | Default value                  |
| --------------- | ----------------------- | ------------------------ | -------- | ------------------------------ |
| `apiKey`        | `dedalus.apiKey`        | `DEDALUS_API_KEY`        | false    | -                              |
| `xApiKey`       | `dedalus.xApiKey`       | `DEDALUS_X_API_KEY`      | false    | -                              |
| `asBaseUrl`     | `dedalus.asUrl`         | `DEDALUS_AS_URL`         | false    | `"https://as.dedaluslabs.ai"`  |
| `dedalusOrgId`  | `dedalus.orgId`         | `DEDALUS_ORG_ID`         | false    | -                              |
| `provider`      | `dedalus.provider`      | `DEDALUS_PROVIDER`       | false    | -                              |
| `providerKey`   | `dedalus.providerKey`   | `DEDALUS_PROVIDER_KEY`   | false    | -                              |
| `providerModel` | `dedalus.providerModel` | `DEDALUS_PROVIDER_MODEL` | false    | -                              |
| `baseUrl`       | `dedalus.baseUrl`       | `DEDALUS_BASE_URL`       | true     | `"https://api.dedaluslabs.ai"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient

val clientWithOptions: DedalusClient = client.withOptions {
    it.baseUrl("https://example.com")
    it.maxRetries(42)
}
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Dedalus API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Kotlin class.

For example, `client.chat().completions().create(...)` should be called with an instance of `CompletionCreateParams`, and it will return an instance of `ChatCompletion`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams

// Configures using the `dedalus.apiKey`, `dedalus.xApiKey`, `dedalus.asUrl`, `dedalus.orgId`, `dedalus.provider`, `dedalus.providerKey`, `dedalus.providerModel` and `dedalus.baseUrl` system properties
// Or configures using the `DEDALUS_API_KEY`, `DEDALUS_X_API_KEY`, `DEDALUS_AS_URL`, `DEDALUS_ORG_ID`, `DEDALUS_PROVIDER`, `DEDALUS_PROVIDER_KEY`, `DEDALUS_PROVIDER_MODEL` and `DEDALUS_BASE_URL` environment variables
val client: DedalusClient = DedalusOkHttpClient.fromEnv()

val params: ChatCompletionCreateParams = ChatCompletionCreateParams.builder()
    .model("openai/gpt-5")
    .build()
val chatCompletion: ChatCompletion = client.async().chat().completions().create(params)
```

Or create an asynchronous client from the beginning:

```kotlin
import com.dedalus_sdk.api.client.DedalusClientAsync
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClientAsync
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams

// Configures using the `dedalus.apiKey`, `dedalus.xApiKey`, `dedalus.asUrl`, `dedalus.orgId`, `dedalus.provider`, `dedalus.providerKey`, `dedalus.providerModel` and `dedalus.baseUrl` system properties
// Or configures using the `DEDALUS_API_KEY`, `DEDALUS_X_API_KEY`, `DEDALUS_AS_URL`, `DEDALUS_ORG_ID`, `DEDALUS_PROVIDER`, `DEDALUS_PROVIDER_KEY`, `DEDALUS_PROVIDER_MODEL` and `DEDALUS_BASE_URL` environment variables
val client: DedalusClientAsync = DedalusOkHttpClientAsync.fromEnv()

val params: ChatCompletionCreateParams = ChatCompletionCreateParams.builder()
    .model("openai/gpt-5")
    .build()
val chatCompletion: ChatCompletion = client.chat().completions().create(params)
```

The asynchronous client supports the same options as the synchronous one, except most methods are [suspending](https://kotlinlang.org/docs/coroutines-guide.html).

## Streaming

The SDK defines methods that return response "chunk" streams, where each chunk can be individually processed as soon as it arrives instead of waiting on the full response. Streaming methods generally correspond to [SSE](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events) or [JSONL](https://jsonlines.org) responses.

Some of these methods may have streaming and non-streaming variants, but a streaming method will always have a `Streaming` suffix in its name, even if it doesn't have a non-streaming variant.

These streaming methods return [`StreamResponse`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/core/http/StreamResponse.kt) for synchronous clients:

```kotlin
client.chat().completions().createStreaming(params).use { response ->
    response.asSequence().forEach { println(it) }
    println("No more chunks!")
}
```

## File uploads

The SDK defines methods that accept files.

To upload a file, pass a [`Path`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html):

```kotlin
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateParams
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateResponse
import java.nio.file.Paths

val params: TranscriptionCreateParams = TranscriptionCreateParams.builder()
    .model("model")
    .file(Paths.get("/path/to/file"))
    .build()
val transcription: TranscriptionCreateResponse = client.audio().transcriptions().create(params)
```

Or an arbitrary [`InputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html):

```kotlin
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateParams
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateResponse
import java.net.URL

val params: TranscriptionCreateParams = TranscriptionCreateParams.builder()
    .model("model")
    .file(URL("https://example.com//path/to/file").openStream())
    .build()
val transcription: TranscriptionCreateResponse = client.audio().transcriptions().create(params)
```

Or a `ByteArray`:

```kotlin
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateParams
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateResponse

val params: TranscriptionCreateParams = TranscriptionCreateParams.builder()
    .model("model")
    .file("content".toByteArray())
    .build()
val transcription: TranscriptionCreateResponse = client.audio().transcriptions().create(params)
```

Note that when passing a non-`Path` its filename is unknown so it will not be included in the request. To manually set a filename, pass a [`MultipartField`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/core/Values.kt):

```kotlin
import com.dedalus_sdk.api.core.MultipartField
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateParams
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateResponse
import java.io.InputStream
import java.net.URL

val params: TranscriptionCreateParams = TranscriptionCreateParams.builder()
    .model("model")
    .file(MultipartField.builder<InputStream>()
        .value(URL("https://example.com//path/to/file").openStream())
        .filename("/path/to/file")
        .build())
    .build()
val transcription: TranscriptionCreateResponse = client.audio().transcriptions().create(params)
```

## Binary responses

The SDK defines methods that return binary responses, which are used for API responses that shouldn't necessarily be parsed, like non-JSON data.

These methods return [`HttpResponse`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/core/http/HttpResponse.kt):

```kotlin
import com.dedalus_sdk.api.core.http.HttpResponse
import com.dedalus_sdk.api.models.audio.speech.SpeechCreateParams

val params: SpeechCreateParams = SpeechCreateParams.builder()
    .input("input")
    .model(SpeechCreateParams.Model.TTS_1)
    .voice(SpeechCreateParams.Voice.UnionMember1.ALLOY)
    .build()
val speech: HttpResponse = client.audio().speech().create(params)
```

To save the response content to a file, use the [`Files.copy(...)`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#copy-java.io.InputStream-java.nio.file.Path-java.nio.file.CopyOption...-) method:

```kotlin
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

client.audio().speech().create(params).use {
    Files.copy(
        it.body(),
        Paths.get(path),
        StandardCopyOption.REPLACE_EXISTING
    )
}
```

Or transfer the response content to any [`OutputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html):

```kotlin
import java.nio.file.Files
import java.nio.file.Paths

client.audio().speech().create(params).use {
    it.body().transferTo(Files.newOutputStream(Paths.get(path)))
}
```

## Raw responses

The SDK defines methods that deserialize responses into instances of Kotlin classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```kotlin
import com.dedalus_sdk.api.core.http.Headers
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams

val params: ChatCompletionCreateParams = ChatCompletionCreateParams.builder()
    .model("openai/gpt-5")
    .build()
val chatCompletion: HttpResponseFor<ChatCompletion> = client.chat().completions().withRawResponse().create(params)

val statusCode: Int = chatCompletion.statusCode()
val headers: Headers = chatCompletion.headers()
```

You can still deserialize the response into an instance of a Kotlin class if needed:

```kotlin
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion

val parsedChatCompletion: ChatCompletion = chatCompletion.parse()
```

## Error handling

The SDK throws custom unchecked exception types:

- [`DedalusServiceException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/DedalusServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                          |
  | ------ | ---------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/UnexpectedStatusCodeException.kt) |

  [`SseException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/SseException.kt) is thrown for errors encountered during [SSE streaming](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events) after a successful initial HTTP response.

- [`DedalusIoException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/DedalusIoException.kt): I/O networking errors.

- [`DedalusRetryableException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/DedalusRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`DedalusInvalidDataException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/DedalusInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`DedalusException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/DedalusException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

Enable logging by setting the `DEDALUS_LOG` environment variable to `info`:

```sh
export DEDALUS_LOG=info
```

Or to `debug` for more verbose logging:

```sh
export DEDALUS_LOG=debug
```

Or configure the client manually using the `logLevel` method:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.core.LogLevel

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    .logLevel(LogLevel.INFO)
    .build()
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `dedalus-kotlin-core` is published with a [configuration file](dedalus-kotlin-core/src/main/resources/META-INF/proguard/dedalus-kotlin-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`DedalusOkHttpClient`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/DedalusOkHttpClient.kt) or [`DedalusOkHttpClientAsync`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/DedalusOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

Also note that there are bugs in older Jackson versions that can affect the SDK. We don't work around all Jackson bugs ([example](https://github.com/FasterXML/jackson-databind/issues/3240)) and expect users to upgrade Jackson for those instead.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```kotlin
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion

val chatCompletion: ChatCompletion = client.chat().completions().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import java.time.Duration

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(
      Proxy.Type.HTTP, InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build()
```

If the proxy responds with `407 Proxy Authentication Required`, supply credentials by also configuring `proxyAuthenticator`:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.core.http.ProxyAuthenticator

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    .proxy(...)
    // Or a custom implementation of `ProxyAuthenticator`.
    .proxyAuthenticator(ProxyAuthenticator.basic("username", "password"))
    .build()
```

### Connection pooling

To customize the underlying OkHttp connection pool, configure the client using the `maxIdleConnections` and `keepAliveDuration` methods:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import java.time.Duration

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    // If `maxIdleConnections` is set, then `keepAliveDuration` must be set, and vice versa.
    .maxIdleConnections(10)
    .keepAliveDuration(Duration.ofMinutes(2))
    .build()
```

If both options are unset, OkHttp's default connection pool settings are used.

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build()
```

### Environments

The SDK sends requests to the production by default. To send requests to a different environment, configure the client like so:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    .development()
    .build()
```

### Custom HTTP client

The SDK consists of three artifacts:

- `dedalus-kotlin-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`DedalusClient`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClient.kt), [`DedalusClientAsync`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientAsync.kt), [`DedalusClientImpl`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientImpl.kt), and [`DedalusClientAsyncImpl`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientAsyncImpl.kt), all of which can work with any HTTP client
- `dedalus-kotlin-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`DedalusOkHttpClient`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/DedalusOkHttpClient.kt) and [`DedalusOkHttpClientAsync`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/DedalusOkHttpClientAsync.kt), which provide a way to construct [`DedalusClientImpl`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientImpl.kt) and [`DedalusClientAsyncImpl`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientAsyncImpl.kt), respectively, using OkHttp
- `dedalus-kotlin`
  - Depends on and exposes the APIs of both `dedalus-kotlin-core` and `dedalus-kotlin-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`dedalus-kotlin` dependency](#installation) with `dedalus-kotlin-core`
2. Copy `dedalus-kotlin-client-okhttp`'s [`OkHttpClient`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`DedalusClientImpl`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientImpl.kt) or [`DedalusClientAsyncImpl`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientAsyncImpl.kt), similarly to [`DedalusOkHttpClient`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/DedalusOkHttpClient.kt) or [`DedalusOkHttpClientAsync`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/DedalusOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`dedalus-kotlin` dependency](#installation) with `dedalus-kotlin-core`
2. Write a class that implements the [`HttpClient`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/core/http/HttpClient.kt) interface
3. Construct [`DedalusClientImpl`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientImpl.kt) or [`DedalusClientAsyncImpl`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/client/DedalusClientAsyncImpl.kt), similarly to [`DedalusOkHttpClient`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/DedalusOkHttpClient.kt) or [`DedalusOkHttpClientAsync`](dedalus-kotlin-client-okhttp/src/main/kotlin/com/dedalus_sdk/api/client/okhttp/DedalusOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```kotlin
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.models.chat.completions.CompletionCreateParams

val params: CompletionCreateParams = CompletionCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/core/Values.kt) object to its setter:

```kotlin
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams
import com.dedalus_sdk.api.models.chat.completions.CompletionCreateParams

val params: CompletionCreateParams = CompletionCreateParams.builder()
    .chatCompletionCreateParams(ChatCompletionCreateParams.builder()
        .model("openai/gpt-5")
        .build())
    .build()
```

The most straightforward way to create a [`JsonValue`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/core/Values.kt) is using its `from(...)` method:

```kotlin
import com.dedalus_sdk.api.core.JsonValue

// Create primitive JSON values
val nullValue: JsonValue = JsonValue.from(null)
val booleanValue: JsonValue = JsonValue.from(true)
val numberValue: JsonValue = JsonValue.from(42)
val stringValue: JsonValue = JsonValue.from("Hello World!")

// Create a JSON array value equivalent to `["Hello", "World"]`
val arrayValue: JsonValue = JsonValue.from(listOf(
  "Hello", "World"
))

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
val objectValue: JsonValue = JsonValue.from(mapOf(
  "a" to 1, "b" to 2
))

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
val complexValue: JsonValue = JsonValue.from(mapOf(
  "a" to listOf(
    1, 2
  ), "b" to listOf(
    3, 4
  )
))
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/core/Values.kt):

```kotlin
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams
import com.dedalus_sdk.api.models.chat.completions.CompletionCreateParams

val params: CompletionCreateParams = CompletionCreateParams.builder()
    .chatCompletionCreateParams(ChatCompletionCreateParams.builder()
        .model("openai/gpt-5")
        .build())
    .model(JsonMissing.of())
    .build()
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```kotlin
import com.dedalus_sdk.api.core.JsonBoolean
import com.dedalus_sdk.api.core.JsonNull
import com.dedalus_sdk.api.core.JsonNumber
import com.dedalus_sdk.api.core.JsonValue

val additionalProperties: Map<String, JsonValue> = client.chat().completions().create(params)._additionalProperties()
val secretPropertyValue: JsonValue = additionalProperties.get("secretProperty")

val result = when (secretPropertyValue) {
    is JsonNull -> "It's null!"
    is JsonBoolean -> "It's a boolean!"
    is JsonNumber -> "It's a number!"
    // Other types include `JsonMissing`, `JsonString`, `JsonArray`, and `JsonObject`
    else -> "It's something else!"
}
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```kotlin
import com.dedalus_sdk.api.core.JsonField

val field: JsonField<Any> = client.chat().completions().create(params)._field()

if (field.isMissing()) {
  // The property is absent from the JSON response
} else if (field.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  val jsonString: String? = field.asString();

  // Try to deserialize into a custom type
  val myObject: MyClass = field.asUnknown()!!.convert(MyClass::class.java)
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`DedalusInvalidDataException`](dedalus-kotlin-core/src/main/kotlin/com/dedalus_sdk/api/errors/DedalusInvalidDataException.kt) only if you directly access the property.

Validating the response is _not_ forwards compatible with new types from the API for existing fields.

If you would still prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```kotlin
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion

val chatCompletion: ChatCompletion = client.chat().completions().create(params).validate()
```

Or configure the method call to validate the response using the `responseValidation` method:

```kotlin
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion

val chatCompletion: ChatCompletion = client.chat().completions().create(
  params, RequestOptions.builder().responseValidation(true).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient

val client: DedalusClient = DedalusOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build()
```

## FAQ

### Why don't you use plain `enum` classes?

Kotlin `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/stainless-sdks/dedalus-sdk-kotlin/issues) with questions, bugs, or suggestions.
