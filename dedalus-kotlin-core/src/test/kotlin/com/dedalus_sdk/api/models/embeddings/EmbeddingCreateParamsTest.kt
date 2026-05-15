// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.embeddings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateParamsTest {

    @Test
    fun create() {
        EmbeddingCreateParams.builder()
            .createEmbeddingRequest(
                CreateEmbeddingRequest.builder()
                    .input("string")
                    .model(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
                    .dimensions(1L)
                    .encodingFormat(CreateEmbeddingRequest.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EmbeddingCreateParams.builder()
                .createEmbeddingRequest(
                    CreateEmbeddingRequest.builder()
                        .input("string")
                        .model(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
                        .dimensions(1L)
                        .encodingFormat(CreateEmbeddingRequest.EncodingFormat.FLOAT)
                        .user("user")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateEmbeddingRequest.builder()
                    .input("string")
                    .model(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
                    .dimensions(1L)
                    .encodingFormat(CreateEmbeddingRequest.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmbeddingCreateParams.builder()
                .createEmbeddingRequest(
                    CreateEmbeddingRequest.builder()
                        .input("string")
                        .model(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateEmbeddingRequest.builder()
                    .input("string")
                    .model(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
                    .build()
            )
    }
}
