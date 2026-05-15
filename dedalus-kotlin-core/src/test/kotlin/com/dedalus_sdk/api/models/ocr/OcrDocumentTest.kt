// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.ocr

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OcrDocumentTest {

    @Test
    fun create() {
        val ocrDocument = OcrDocument.builder().documentUrl("document_url").type("type").build()

        assertThat(ocrDocument.documentUrl()).isEqualTo("document_url")
        assertThat(ocrDocument.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ocrDocument = OcrDocument.builder().documentUrl("document_url").type("type").build()

        val roundtrippedOcrDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ocrDocument),
                jacksonTypeRef<OcrDocument>(),
            )

        assertThat(roundtrippedOcrDocument).isEqualTo(ocrDocument)
    }
}
