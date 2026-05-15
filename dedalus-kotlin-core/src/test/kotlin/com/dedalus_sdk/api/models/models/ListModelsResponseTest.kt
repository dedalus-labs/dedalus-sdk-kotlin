// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListModelsResponseTest {

    @Test
    fun create() {
        val listModelsResponse =
            ListModelsResponse.builder()
                .addData(
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
                )
                .object_(ListModelsResponse.Object.LIST)
                .build()

        assertThat(listModelsResponse.data())
            .containsExactly(
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
            )
        assertThat(listModelsResponse.object_()).isEqualTo(ListModelsResponse.Object.LIST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listModelsResponse =
            ListModelsResponse.builder()
                .addData(
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
                )
                .object_(ListModelsResponse.Object.LIST)
                .build()

        val roundtrippedListModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listModelsResponse),
                jacksonTypeRef<ListModelsResponse>(),
            )

        assertThat(roundtrippedListModelsResponse).isEqualTo(listModelsResponse)
    }
}
