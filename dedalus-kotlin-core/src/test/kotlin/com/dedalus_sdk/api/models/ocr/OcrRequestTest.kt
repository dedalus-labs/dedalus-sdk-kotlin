// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.ocr

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OcrRequestTest {

    @Test
    fun create() {
        val ocrRequest =
            OcrRequest.builder()
                .document(OcrDocument.builder().documentUrl("document_url").type("type").build())
                .model("model")
                .build()

        assertThat(ocrRequest.document())
            .isEqualTo(OcrDocument.builder().documentUrl("document_url").type("type").build())
        assertThat(ocrRequest.model()).isEqualTo("model")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ocrRequest =
            OcrRequest.builder()
                .document(OcrDocument.builder().documentUrl("document_url").type("type").build())
                .model("model")
                .build()

        val roundtrippedOcrRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ocrRequest),
                jacksonTypeRef<OcrRequest>(),
            )

        assertThat(roundtrippedOcrRequest).isEqualTo(ocrRequest)
    }
}
