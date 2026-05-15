// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.embeddings

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateEmbeddingResponseTest {

    @Test
    fun create() {
        val createEmbeddingResponse =
            CreateEmbeddingResponse.builder()
                .addData(CreateEmbeddingResponse.Data.builder().addEmbedding(0.0).index(0L).build())
                .model("model")
                .usage(
                    CreateEmbeddingResponse.Usage.builder().promptTokens(0L).totalTokens(0L).build()
                )
                .build()

        assertThat(createEmbeddingResponse.data())
            .containsExactly(
                CreateEmbeddingResponse.Data.builder().addEmbedding(0.0).index(0L).build()
            )
        assertThat(createEmbeddingResponse.model()).isEqualTo("model")
        assertThat(createEmbeddingResponse.usage())
            .isEqualTo(
                CreateEmbeddingResponse.Usage.builder().promptTokens(0L).totalTokens(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createEmbeddingResponse =
            CreateEmbeddingResponse.builder()
                .addData(CreateEmbeddingResponse.Data.builder().addEmbedding(0.0).index(0L).build())
                .model("model")
                .usage(
                    CreateEmbeddingResponse.Usage.builder().promptTokens(0L).totalTokens(0L).build()
                )
                .build()

        val roundtrippedCreateEmbeddingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createEmbeddingResponse),
                jacksonTypeRef<CreateEmbeddingResponse>(),
            )

        assertThat(roundtrippedCreateEmbeddingResponse).isEqualTo(createEmbeddingResponse)
    }
}
