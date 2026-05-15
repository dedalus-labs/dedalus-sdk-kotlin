// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking.audio

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.models.audio.translations.TranslationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TranslationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val translationService = client.audio().translations()

        val translation =
            translationService.create(
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
