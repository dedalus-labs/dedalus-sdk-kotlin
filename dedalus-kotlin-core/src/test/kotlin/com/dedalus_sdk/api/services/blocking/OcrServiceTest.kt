// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.models.ocr.OcrDocument
import com.dedalus_sdk.api.models.ocr.OcrRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OcrServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun process() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val ocrService = client.ocr()

        val ocrResponse =
            ocrService.process(
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
