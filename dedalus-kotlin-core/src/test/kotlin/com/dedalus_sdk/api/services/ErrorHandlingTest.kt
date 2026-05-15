// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services

import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.http.Headers
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.errors.BadRequestException
import com.dedalus_sdk.api.errors.DedalusException
import com.dedalus_sdk.api.errors.InternalServerException
import com.dedalus_sdk.api.errors.NotFoundException
import com.dedalus_sdk.api.errors.PermissionDeniedException
import com.dedalus_sdk.api.errors.RateLimitException
import com.dedalus_sdk.api.errors.UnauthorizedException
import com.dedalus_sdk.api.errors.UnexpectedStatusCodeException
import com.dedalus_sdk.api.errors.UnprocessableEntityException
import com.dedalus_sdk.api.models.Credential
import com.dedalus_sdk.api.models.FunctionDefinition
import com.dedalus_sdk.api.models.JsonObjectInput
import com.dedalus_sdk.api.models.ResponseFormatText
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionAudioParam
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionDeveloperMessageParam
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionFunctions
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionToolParam
import com.dedalus_sdk.api.models.chat.completions.DeferredCallResponse
import com.dedalus_sdk.api.models.chat.completions.PredictionContent
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: DedalusClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DedalusOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun completionsCreate400() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate400WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate401() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate401WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate403() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate403WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate404() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate404WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate422() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate422WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate429() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate429WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate500() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate500WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate999() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate999WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreateInvalidJsonBody() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<DedalusException> {
                completionService.create(
                    ChatCompletionCreateParams.builder()
                        .model("openai/gpt-5")
                        .agentAttributes(
                            ChatCompletionCreateParams.AgentAttributes.builder()
                                .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                                .putAdditionalProperty("complexity", JsonValue.from(0.8))
                                .build()
                        )
                        .audio(
                            ChatCompletionAudioParam.builder()
                                .format(ChatCompletionAudioParam.Format.WAV)
                                .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                                .build()
                        )
                        .automaticToolExecution(true)
                        .cachedContent("cached_content")
                        .correlationId("correlation_id")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .deferred(true)
                        .addDeferredCall(
                            DeferredCallResponse.builder()
                                .id("id")
                                .name("name")
                                .arguments(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addBlockedBy("string")
                                .addDependency("string")
                                .venue("venue")
                                .build()
                        )
                        .frequencyPenalty(-2.0)
                        .functionCall("function_call")
                        .addFunction(
                            ChatCompletionFunctions.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionFunctions.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addGuardrail(
                            ChatCompletionCreateParams.Guardrail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffConfig(
                            ChatCompletionCreateParams.HandoffConfig.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .handoffMode(true)
                        .inferenceGeo("inference_geo")
                        .logitBias(
                            ChatCompletionCreateParams.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(1L)
                        .maxTurns(5L)
                        .mcpServers("dedalus-labs/example-server")
                        .addMessage(
                            ChatCompletionDeveloperMessageParam.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .modelAttributes(
                            ChatCompletionCreateParams.ModelAttributes.builder()
                                .putAdditionalProperty(
                                    "gpt-5",
                                    JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                                )
                                .build()
                        )
                        .n(1L)
                        .outputConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parallelToolCalls(true)
                        .prediction(PredictionContent.builder().content("string").build())
                        .presencePenalty(-2.0)
                        .promptCacheKey("prompt_cache_key")
                        .promptCacheRetention("prompt_cache_retention")
                        .promptMode(ChatCompletionCreateParams.PromptMode.REASONING)
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(ResponseFormatText.builder().build())
                        .safePrompt(true)
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            ChatCompletionCreateParams.SafetySetting.builder()
                                .category(
                                    ChatCompletionCreateParams.SafetySetting.Category
                                        .HARM_CATEGORY_UNSPECIFIED
                                )
                                .threshold(
                                    ChatCompletionCreateParams.SafetySetting.Threshold
                                        .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                                )
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .speed(ChatCompletionCreateParams.Speed.STANDARD)
                        .stopOfStrings(listOf("string"))
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .enabledThinking(1024L)
                        .toolChoice("string")
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTool(
                            ChatCompletionToolParam.builder()
                                .function(FunctionDefinition.builder().name("name").build())
                                .type(ChatCompletionToolParam.Type.FUNCTION)
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .verbosity("verbosity")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
