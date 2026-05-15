// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking.audio

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TranscriptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val transcriptionService = client.audio().transcriptions()

        val transcription =
            transcriptionService.create(
                TranscriptionCreateParams.builder()
                    .file("Example data".byteInputStream())
                    .model("model")
                    .language("language")
                    .prompt("prompt")
                    .responseFormat("response_format")
                    .temperature(0.0)
                    .build()
            )

        transcription.validate()
    }
}
