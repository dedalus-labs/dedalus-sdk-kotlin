// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelTest {

    @Test
    fun create() {
        val model =
            Model.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .provider(Model.Provider.OPENAI)
                .capabilities(
                    Model.Capabilities.builder()
                        .audio(true)
                        .imageGeneration(true)
                        .inputTokenLimit(0L)
                        .outputTokenLimit(0L)
                        .streaming(true)
                        .structuredOutput(true)
                        .text(true)
                        .thinking(true)
                        .tools(true)
                        .vision(true)
                        .build()
                )
                .defaults(
                    Model.Defaults.builder()
                        .maxOutputTokens(0L)
                        .temperature(0.0)
                        .topK(0L)
                        .topP(0.0)
                        .build()
                )
                .description("description")
                .displayName("display_name")
                .addProviderDeclaredGenerationMethod("string")
                .providerInfo(
                    Model.ProviderInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .version("version")
                .build()

        assertThat(model.id()).isEqualTo("id")
        assertThat(model.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(model.provider()).isEqualTo(Model.Provider.OPENAI)
        assertThat(model.capabilities())
            .isEqualTo(
                Model.Capabilities.builder()
                    .audio(true)
                    .imageGeneration(true)
                    .inputTokenLimit(0L)
                    .outputTokenLimit(0L)
                    .streaming(true)
                    .structuredOutput(true)
                    .text(true)
                    .thinking(true)
                    .tools(true)
                    .vision(true)
                    .build()
            )
        assertThat(model.defaults())
            .isEqualTo(
                Model.Defaults.builder()
                    .maxOutputTokens(0L)
                    .temperature(0.0)
                    .topK(0L)
                    .topP(0.0)
                    .build()
            )
        assertThat(model.description()).isEqualTo("description")
        assertThat(model.displayName()).isEqualTo("display_name")
        assertThat(model.providerDeclaredGenerationMethods()).containsExactly("string")
        assertThat(model.providerInfo())
            .isEqualTo(
                Model.ProviderInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(model.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val model =
            Model.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .provider(Model.Provider.OPENAI)
                .capabilities(
                    Model.Capabilities.builder()
                        .audio(true)
                        .imageGeneration(true)
                        .inputTokenLimit(0L)
                        .outputTokenLimit(0L)
                        .streaming(true)
                        .structuredOutput(true)
                        .text(true)
                        .thinking(true)
                        .tools(true)
                        .vision(true)
                        .build()
                )
                .defaults(
                    Model.Defaults.builder()
                        .maxOutputTokens(0L)
                        .temperature(0.0)
                        .topK(0L)
                        .topP(0.0)
                        .build()
                )
                .description("description")
                .displayName("display_name")
                .addProviderDeclaredGenerationMethod("string")
                .providerInfo(
                    Model.ProviderInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .version("version")
                .build()

        val roundtrippedModel =
            jsonMapper.readValue(jsonMapper.writeValueAsString(model), jacksonTypeRef<Model>())

        assertThat(roundtrippedModel).isEqualTo(model)
    }
}
