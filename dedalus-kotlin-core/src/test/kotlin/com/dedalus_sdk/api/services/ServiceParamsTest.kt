// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services

import com.dedalus_sdk.api.client.DedalusClient
import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.models.Credential
import com.dedalus_sdk.api.models.FunctionDefinition
import com.dedalus_sdk.api.models.JsonObjectInput
import com.dedalus_sdk.api.models.ResponseFormatText
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionAudioParam
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionDeveloperMessageParam
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionFunctions
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionToolParam
import com.dedalus_sdk.api.models.chat.completions.CompletionCreateParams
import com.dedalus_sdk.api.models.chat.completions.DeferredCallResponse
import com.dedalus_sdk.api.models.chat.completions.PredictionContent
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: DedalusClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DedalusOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val completionService = client.chat().completions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        completionService.create(
            CompletionCreateParams.builder()
                .chatCompletionCreateParams(
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
