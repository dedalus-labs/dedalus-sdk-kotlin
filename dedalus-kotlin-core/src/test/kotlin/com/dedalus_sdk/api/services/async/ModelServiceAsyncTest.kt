// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ModelServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = DedalusOkHttpClientAsync.builder().apiKey("My API Key").build()
        val modelServiceAsync = client.models()

        val model = modelServiceAsync.retrieve("model_id")

        model.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = DedalusOkHttpClientAsync.builder().apiKey("My API Key").build()
        val modelServiceAsync = client.models()

        val listModelsResponse = modelServiceAsync.list()

        listModelsResponse.validate()
    }
}
