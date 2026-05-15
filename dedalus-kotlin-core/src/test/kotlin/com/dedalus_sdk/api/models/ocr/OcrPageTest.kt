// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.ocr

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OcrPageTest {

    @Test
    fun create() {
        val ocrPage = OcrPage.builder().index(0L).markdown("markdown").build()

        assertThat(ocrPage.index()).isEqualTo(0L)
        assertThat(ocrPage.markdown()).isEqualTo("markdown")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ocrPage = OcrPage.builder().index(0L).markdown("markdown").build()

        val roundtrippedOcrPage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(ocrPage), jacksonTypeRef<OcrPage>())

        assertThat(roundtrippedOcrPage).isEqualTo(ocrPage)
    }
}
