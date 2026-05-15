// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.embeddings

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateEmbeddingRequestTest {

    @Test
    fun create() {
        val createEmbeddingRequest =
            CreateEmbeddingRequest.builder()
                .input("string")
                .model(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
                .dimensions(1L)
                .encodingFormat(CreateEmbeddingRequest.EncodingFormat.FLOAT)
                .user("user")
                .build()

        assertThat(createEmbeddingRequest.input())
            .isEqualTo(CreateEmbeddingRequest.Input.ofString("string"))
        assertThat(createEmbeddingRequest.model())
            .isEqualTo(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
        assertThat(createEmbeddingRequest.dimensions()).isEqualTo(1L)
        assertThat(createEmbeddingRequest.encodingFormat())
            .isEqualTo(CreateEmbeddingRequest.EncodingFormat.FLOAT)
        assertThat(createEmbeddingRequest.user()).isEqualTo("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createEmbeddingRequest =
            CreateEmbeddingRequest.builder()
                .input("string")
                .model(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
                .dimensions(1L)
                .encodingFormat(CreateEmbeddingRequest.EncodingFormat.FLOAT)
                .user("user")
                .build()

        val roundtrippedCreateEmbeddingRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createEmbeddingRequest),
                jacksonTypeRef<CreateEmbeddingRequest>(),
            )

        assertThat(roundtrippedCreateEmbeddingRequest).isEqualTo(createEmbeddingRequest)
    }
}
