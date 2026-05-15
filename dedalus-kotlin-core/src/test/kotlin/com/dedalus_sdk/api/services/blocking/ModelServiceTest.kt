// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ModelServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val modelService = client.models()

        val model = modelService.retrieve("model_id")

        model.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val modelService = client.models()

        val listModelsResponse = modelService.list()

        listModelsResponse.validate()
    }
}
