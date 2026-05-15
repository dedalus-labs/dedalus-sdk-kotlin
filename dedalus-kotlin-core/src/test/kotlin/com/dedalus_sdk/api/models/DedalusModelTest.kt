// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DedalusModelTest {

    @Test
    fun create() {
        val dedalusModel =
            DedalusModel.builder()
                .model("model")
                .settings(
                    ModelSettings.builder()
                        .attributes(
                            ModelSettings.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .audio(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .deferred(true)
                        .extraArgs(
                            ModelSettings.ExtraArgs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .extraHeaders(
                            ModelSettings.ExtraHeaders.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .extraQuery(
                            ModelSettings.ExtraQuery.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .frequencyPenalty(0.0)
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .includeUsage(true)
                        .inputAudioFormat("input_audio_format")
                        .inputAudioTranscription(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .logitBias(
                            ModelSettings.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(0L)
                        .metadata(
                            ModelSettings.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .n(0L)
                        .outputAudioFormat("output_audio_format")
                        .parallelToolCalls(true)
                        .prediction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .presencePenalty(0.0)
                        .promptCacheKey("prompt_cache_key")
                        .reasoning(
                            Reasoning.builder()
                                .effort(Reasoning.Effort.NONE)
                                .generateSummary(Reasoning.GenerateSummary.AUTO)
                                .summary(Reasoning.Summary.AUTO)
                                .build()
                        )
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .stop("string")
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .structuredOutput(JsonValue.from(mapOf<String, Any>()))
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .thinking(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .timeout(0.0)
                        .toolChoice(ToolChoice.UnionMember0.AUTO)
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .truncation(ModelSettings.Truncation.AUTO)
                        .turnDetection(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .user("user")
                        .verbosity("verbosity")
                        .voice("voice")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(dedalusModel.model()).isEqualTo("model")
        assertThat(dedalusModel.settings())
            .isEqualTo(
                ModelSettings.builder()
                    .attributes(
                        ModelSettings.Attributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .audio(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .deferred(true)
                    .extraArgs(
                        ModelSettings.ExtraArgs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .extraHeaders(
                        ModelSettings.ExtraHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .extraQuery(
                        ModelSettings.ExtraQuery.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .frequencyPenalty(0.0)
                    .generationConfig(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .includeUsage(true)
                    .inputAudioFormat("input_audio_format")
                    .inputAudioTranscription(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .logitBias(
                        ModelSettings.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(true)
                    .maxCompletionTokens(0L)
                    .maxTokens(0L)
                    .metadata(
                        ModelSettings.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addModality("string")
                    .n(0L)
                    .outputAudioFormat("output_audio_format")
                    .parallelToolCalls(true)
                    .prediction(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .presencePenalty(0.0)
                    .promptCacheKey("prompt_cache_key")
                    .reasoning(
                        Reasoning.builder()
                            .effort(Reasoning.Effort.NONE)
                            .generateSummary(Reasoning.GenerateSummary.AUTO)
                            .summary(Reasoning.Summary.AUTO)
                            .build()
                    )
                    .reasoningEffort("reasoning_effort")
                    .responseFormat(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .safetyIdentifier("safety_identifier")
                    .addSafetySetting(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .searchParameters(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .seed(0L)
                    .serviceTier("service_tier")
                    .stop("string")
                    .store(true)
                    .stream(true)
                    .streamOptions(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .structuredOutput(JsonValue.from(mapOf<String, Any>()))
                    .systemInstruction(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .temperature(0.0)
                    .thinking(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .timeout(0.0)
                    .toolChoice(ToolChoice.UnionMember0.AUTO)
                    .toolConfig(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .topK(0L)
                    .topLogprobs(0L)
                    .topP(0.0)
                    .truncation(ModelSettings.Truncation.AUTO)
                    .turnDetection(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .user("user")
                    .verbosity("verbosity")
                    .voice("voice")
                    .webSearchOptions(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dedalusModel =
            DedalusModel.builder()
                .model("model")
                .settings(
                    ModelSettings.builder()
                        .attributes(
                            ModelSettings.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .audio(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .deferred(true)
                        .extraArgs(
                            ModelSettings.ExtraArgs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .extraHeaders(
                            ModelSettings.ExtraHeaders.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .extraQuery(
                            ModelSettings.ExtraQuery.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .frequencyPenalty(0.0)
                        .generationConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .includeUsage(true)
                        .inputAudioFormat("input_audio_format")
                        .inputAudioTranscription(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .logitBias(
                            ModelSettings.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxCompletionTokens(0L)
                        .maxTokens(0L)
                        .metadata(
                            ModelSettings.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addModality("string")
                        .n(0L)
                        .outputAudioFormat("output_audio_format")
                        .parallelToolCalls(true)
                        .prediction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .presencePenalty(0.0)
                        .promptCacheKey("prompt_cache_key")
                        .reasoning(
                            Reasoning.builder()
                                .effort(Reasoning.Effort.NONE)
                                .generateSummary(Reasoning.GenerateSummary.AUTO)
                                .summary(Reasoning.Summary.AUTO)
                                .build()
                        )
                        .reasoningEffort("reasoning_effort")
                        .responseFormat(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .safetyIdentifier("safety_identifier")
                        .addSafetySetting(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .searchParameters(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .seed(0L)
                        .serviceTier("service_tier")
                        .stop("string")
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .structuredOutput(JsonValue.from(mapOf<String, Any>()))
                        .systemInstruction(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .thinking(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .timeout(0.0)
                        .toolChoice(ToolChoice.UnionMember0.AUTO)
                        .toolConfig(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .topK(0L)
                        .topLogprobs(0L)
                        .topP(0.0)
                        .truncation(ModelSettings.Truncation.AUTO)
                        .turnDetection(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .user("user")
                        .verbosity("verbosity")
                        .voice("voice")
                        .webSearchOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDedalusModel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dedalusModel),
                jacksonTypeRef<DedalusModel>(),
            )

        assertThat(roundtrippedDedalusModel).isEqualTo(dedalusModel)
    }
}
