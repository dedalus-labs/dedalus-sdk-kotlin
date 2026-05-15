// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PredictionContentTest {

    @Test
    fun create() {
        val predictionContent = PredictionContent.builder().content("string").build()

        assertThat(predictionContent.content())
            .isEqualTo(PredictionContent.Content.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val predictionContent = PredictionContent.builder().content("string").build()

        val roundtrippedPredictionContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(predictionContent),
                jacksonTypeRef<PredictionContent>(),
            )

        assertThat(roundtrippedPredictionContent).isEqualTo(predictionContent)
    }
}
