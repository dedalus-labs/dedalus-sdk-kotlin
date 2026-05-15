// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClientAsync
import com.dedalus_sdk.api.models.ocr.OcrDocument
import com.dedalus_sdk.api.models.ocr.OcrRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OcrServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun process() {
        val client = DedalusOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ocrServiceAsync = client.ocr()

        val ocrResponse =
            ocrServiceAsync.process(
                OcrRequest.builder()
                    .document(
                        OcrDocument.builder().documentUrl("document_url").type("type").build()
                    )
                    .model("model")
                    .build()
            )

        ocrResponse.validate()
    }
}
