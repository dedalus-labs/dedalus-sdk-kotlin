// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.ocr

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OcrProcessParamsTest {

    @Test
    fun create() {
        OcrProcessParams.builder()
            .ocrRequest(
                OcrRequest.builder()
                    .document(
                        OcrDocument.builder().documentUrl("document_url").type("type").build()
                    )
                    .model("model")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OcrProcessParams.builder()
                .ocrRequest(
                    OcrRequest.builder()
                        .document(
                            OcrDocument.builder().documentUrl("document_url").type("type").build()
                        )
                        .model("model")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                OcrRequest.builder()
                    .document(
                        OcrDocument.builder().documentUrl("document_url").type("type").build()
                    )
                    .model("model")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OcrProcessParams.builder()
                .ocrRequest(
                    OcrRequest.builder()
                        .document(OcrDocument.builder().documentUrl("document_url").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                OcrRequest.builder()
                    .document(OcrDocument.builder().documentUrl("document_url").build())
                    .build()
            )
    }
}
