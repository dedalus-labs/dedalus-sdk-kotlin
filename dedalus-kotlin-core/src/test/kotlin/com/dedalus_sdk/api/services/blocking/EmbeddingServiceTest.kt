// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.models.embeddings.CreateEmbeddingRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmbeddingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val embeddingService = client.embeddings()

        val createEmbeddingResponse =
            embeddingService.create(
                CreateEmbeddingRequest.builder()
                    .input("string")
                    .model(CreateEmbeddingRequest.Model.TEXT_EMBEDDING_ADA_002)
                    .dimensions(1L)
                    .encodingFormat(CreateEmbeddingRequest.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )

        createEmbeddingResponse.validate()
    }
}
