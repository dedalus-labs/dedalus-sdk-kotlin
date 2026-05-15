// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.ocr

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OcrResponseTest {

    @Test
    fun create() {
        val ocrResponse =
            OcrResponse.builder()
                .model("model")
                .addPage(OcrPage.builder().index(0L).markdown("markdown").build())
                .usage(
                    OcrResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(ocrResponse.model()).isEqualTo("model")
        assertThat(ocrResponse.pages())
            .containsExactly(OcrPage.builder().index(0L).markdown("markdown").build())
        assertThat(ocrResponse.usage())
            .isEqualTo(
                OcrResponse.Usage.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ocrResponse =
            OcrResponse.builder()
                .model("model")
                .addPage(OcrPage.builder().index(0L).markdown("markdown").build())
                .usage(
                    OcrResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedOcrResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ocrResponse),
                jacksonTypeRef<OcrResponse>(),
            )

        assertThat(roundtrippedOcrResponse).isEqualTo(ocrResponse)
    }
}
