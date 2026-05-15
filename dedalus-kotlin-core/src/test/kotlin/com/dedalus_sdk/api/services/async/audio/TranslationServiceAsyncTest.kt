// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async.audio

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClientAsync
import com.dedalus_sdk.api.models.audio.translations.TranslationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TranslationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = DedalusOkHttpClientAsync.builder().apiKey("My API Key").build()
        val translationServiceAsync = client.audio().translations()

        val translation =
            translationServiceAsync.create(
                TranslationCreateParams.builder()
                    .file("Example data".byteInputStream())
                    .model("model")
                    .prompt("prompt")
                    .responseFormat("response_format")
                    .temperature(0.0)
                    .build()
            )

        translation.validate()
    }
}
