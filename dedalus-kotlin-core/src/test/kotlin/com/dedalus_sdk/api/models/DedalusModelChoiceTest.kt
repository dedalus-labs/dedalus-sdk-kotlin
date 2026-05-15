// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DedalusModelChoiceTest {

    @Test
    fun ofModelId() {
        val modelId = "string"

        val dedalusModelChoice = DedalusModelChoice.ofModelId(modelId)

        assertThat(dedalusModelChoice.modelId()).isEqualTo(modelId)
        assertThat(dedalusModelChoice.dedalusModel()).isNull()
    }

    @Test
    fun ofModelIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val dedalusModelChoice = DedalusModelChoice.ofModelId("string")

        val roundtrippedDedalusModelChoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dedalusModelChoice),
                jacksonTypeRef<DedalusModelChoice>(),
            )

        assertThat(roundtrippedDedalusModelChoice).isEqualTo(dedalusModelChoice)
    }

    @Test
    fun ofDedalusModel() {
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

        val dedalusModelChoice = DedalusModelChoice.ofDedalusModel(dedalusModel)

        assertThat(dedalusModelChoice.modelId()).isNull()
        assertThat(dedalusModelChoice.dedalusModel()).isEqualTo(dedalusModel)
    }

    @Test
    fun ofDedalusModelRoundtrip() {
        val jsonMapper = jsonMapper()
        val dedalusModelChoice =
            DedalusModelChoice.ofDedalusModel(
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
            )

        val roundtrippedDedalusModelChoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dedalusModelChoice),
                jacksonTypeRef<DedalusModelChoice>(),
            )

        assertThat(roundtrippedDedalusModelChoice).isEqualTo(dedalusModelChoice)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val dedalusModelChoice =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<DedalusModelChoice>())

        val e = assertThrows<DedalusInvalidDataException> { dedalusModelChoice.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
