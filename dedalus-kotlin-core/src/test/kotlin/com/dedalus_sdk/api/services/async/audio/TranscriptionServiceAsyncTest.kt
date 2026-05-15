// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async.audio

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClientAsync
import com.dedalus_sdk.api.models.audio.transcriptions.TranscriptionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TranscriptionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = DedalusOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transcriptionServiceAsync = client.audio().transcriptions()

        val transcription =
            transcriptionServiceAsync.create(
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
