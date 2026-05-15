// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.models.Credential
import com.dedalus_sdk.api.models.FunctionDefinition
import com.dedalus_sdk.api.models.JsonObjectInput
import com.dedalus_sdk.api.models.ResponseFormatText
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionCreateParamsTest {

    @Test
    fun create() {
        val chatCompletionCreateParams =
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

        assertThat(chatCompletionCreateParams.model())
            .isEqualTo(ChatCompletionCreateParams.Model.ofModelId("openai/gpt-5"))
        assertThat(chatCompletionCreateParams.agentAttributes())
            .isEqualTo(
                ChatCompletionCreateParams.AgentAttributes.builder()
                    .putAdditionalProperty("accuracy", JsonValue.from(0.9))
                    .putAdditionalProperty("complexity", JsonValue.from(0.8))
                    .build()
            )
        assertThat(chatCompletionCreateParams.audio())
            .isEqualTo(
                ChatCompletionAudioParam.builder()
                    .format(ChatCompletionAudioParam.Format.WAV)
                    .voice(ChatCompletionAudioParam.Voice.UnionMember1.ALLOY)
                    .build()
            )
        assertThat(chatCompletionCreateParams.automaticToolExecution()).isEqualTo(true)
        assertThat(chatCompletionCreateParams.cachedContent()).isEqualTo("cached_content")
        assertThat(chatCompletionCreateParams.correlationId()).isEqualTo("correlation_id")
        assertThat(chatCompletionCreateParams.credentials())
            .isEqualTo(
                ChatCompletionCreateParams.Credentials.ofCredential(
                    Credential.builder()
                        .connectionName("external-service")
                        .values(
                            Credential.Values.builder()
                                .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(chatCompletionCreateParams.deferred()).isEqualTo(true)
        assertThat(chatCompletionCreateParams.deferredCalls())
            .containsExactly(
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
        assertThat(chatCompletionCreateParams.frequencyPenalty()).isEqualTo(-2.0)
        assertThat(chatCompletionCreateParams.functionCall()).isEqualTo("function_call")
        assertThat(chatCompletionCreateParams.functions())
            .containsExactly(
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
        assertThat(chatCompletionCreateParams.generationConfig())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(chatCompletionCreateParams.guardrails())
            .containsExactly(
                ChatCompletionCreateParams.Guardrail.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(chatCompletionCreateParams.handoffConfig())
            .isEqualTo(
                ChatCompletionCreateParams.HandoffConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(chatCompletionCreateParams.handoffMode()).isEqualTo(true)
        assertThat(chatCompletionCreateParams.inferenceGeo()).isEqualTo("inference_geo")
        assertThat(chatCompletionCreateParams.logitBias())
            .isEqualTo(
                ChatCompletionCreateParams.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(chatCompletionCreateParams.logprobs()).isEqualTo(true)
        assertThat(chatCompletionCreateParams.maxCompletionTokens()).isEqualTo(0L)
        assertThat(chatCompletionCreateParams.maxTokens()).isEqualTo(1L)
        assertThat(chatCompletionCreateParams.maxTurns()).isEqualTo(5L)
        assertThat(chatCompletionCreateParams.mcpServers())
            .isEqualTo(
                ChatCompletionCreateParams.McpServers.ofString("dedalus-labs/example-server")
            )
        assertThat(chatCompletionCreateParams.messages())
            .containsExactly(
                ChatCompletionCreateParams.Message.ofDeveloper(
                    ChatCompletionDeveloperMessageParam.builder()
                        .content("string")
                        .name("name")
                        .build()
                )
            )
        assertThat(chatCompletionCreateParams.metadata())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(chatCompletionCreateParams.modalities()).containsExactly("string")
        assertThat(chatCompletionCreateParams.modelAttributes())
            .isEqualTo(
                ChatCompletionCreateParams.ModelAttributes.builder()
                    .putAdditionalProperty(
                        "gpt-5",
                        JsonValue.from(mapOf("accuracy" to 0.95, "speed" to 0.6)),
                    )
                    .build()
            )
        assertThat(chatCompletionCreateParams.n()).isEqualTo(1L)
        assertThat(chatCompletionCreateParams.outputConfig())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(chatCompletionCreateParams.parallelToolCalls()).isEqualTo(true)
        assertThat(chatCompletionCreateParams.prediction())
            .isEqualTo(PredictionContent.builder().content("string").build())
        assertThat(chatCompletionCreateParams.presencePenalty()).isEqualTo(-2.0)
        assertThat(chatCompletionCreateParams.promptCacheKey()).isEqualTo("prompt_cache_key")
        assertThat(chatCompletionCreateParams.promptCacheRetention())
            .isEqualTo("prompt_cache_retention")
        assertThat(chatCompletionCreateParams.promptMode())
            .isEqualTo(ChatCompletionCreateParams.PromptMode.REASONING)
        assertThat(chatCompletionCreateParams.reasoningEffort()).isEqualTo("reasoning_effort")
        assertThat(chatCompletionCreateParams.responseFormat())
            .isEqualTo(
                ChatCompletionCreateParams.ResponseFormat.ofText(
                    ResponseFormatText.builder().build()
                )
            )
        assertThat(chatCompletionCreateParams.safePrompt()).isEqualTo(true)
        assertThat(chatCompletionCreateParams.safetyIdentifier()).isEqualTo("safety_identifier")
        assertThat(chatCompletionCreateParams.safetySettings())
            .containsExactly(
                ChatCompletionCreateParams.SafetySetting.builder()
                    .category(
                        ChatCompletionCreateParams.SafetySetting.Category.HARM_CATEGORY_UNSPECIFIED
                    )
                    .threshold(
                        ChatCompletionCreateParams.SafetySetting.Threshold
                            .HARM_BLOCK_THRESHOLD_UNSPECIFIED
                    )
                    .build()
            )
        assertThat(chatCompletionCreateParams.searchParameters())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(chatCompletionCreateParams.seed()).isEqualTo(0L)
        assertThat(chatCompletionCreateParams.serviceTier()).isEqualTo("service_tier")
        assertThat(chatCompletionCreateParams.speed())
            .isEqualTo(ChatCompletionCreateParams.Speed.STANDARD)
        assertThat(chatCompletionCreateParams.stop())
            .isEqualTo(ChatCompletionCreateParams.Stop.ofStrings(listOf("string")))
        assertThat(chatCompletionCreateParams.store()).isEqualTo(true)
        assertThat(chatCompletionCreateParams.stream()).isEqualTo(true)
        assertThat(chatCompletionCreateParams.streamOptions())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(chatCompletionCreateParams.systemInstruction())
            .isEqualTo(
                ChatCompletionCreateParams.SystemInstruction.ofJsonObjectInput(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
            )
        assertThat(chatCompletionCreateParams.temperature()).isEqualTo(0.0)
        assertThat(chatCompletionCreateParams.thinking())
            .isEqualTo(
                ChatCompletionCreateParams.Thinking.ofEnabled(
                    ThinkingConfigEnabled.builder().budgetTokens(1024L).build()
                )
            )
        assertThat(chatCompletionCreateParams.toolChoice())
            .isEqualTo(ChatCompletionCreateParams.ToolChoice.ofString("string"))
        assertThat(chatCompletionCreateParams.toolConfig())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(chatCompletionCreateParams.tools())
            .containsExactly(
                ChatCompletionToolParam.builder()
                    .function(FunctionDefinition.builder().name("name").build())
                    .type(ChatCompletionToolParam.Type.FUNCTION)
                    .build()
            )
        assertThat(chatCompletionCreateParams.topK()).isEqualTo(0L)
        assertThat(chatCompletionCreateParams.topLogprobs()).isEqualTo(0L)
        assertThat(chatCompletionCreateParams.topP()).isEqualTo(0.0)
        assertThat(chatCompletionCreateParams.user()).isEqualTo("user")
        assertThat(chatCompletionCreateParams.verbosity()).isEqualTo("verbosity")
        assertThat(chatCompletionCreateParams.webSearchOptions())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionCreateParams =
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

        val roundtrippedChatCompletionCreateParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionCreateParams),
                jacksonTypeRef<ChatCompletionCreateParams>(),
            )

        assertThat(roundtrippedChatCompletionCreateParams).isEqualTo(chatCompletionCreateParams)
    }
}
