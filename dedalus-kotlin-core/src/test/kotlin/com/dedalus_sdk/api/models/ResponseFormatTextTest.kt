// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseFormatTextTest {

    @Test
    fun create() {
        val responseFormatText = ResponseFormatText.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseFormatText = ResponseFormatText.builder().build()

        val roundtrippedResponseFormatText =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseFormatText),
                jacksonTypeRef<ResponseFormatText>(),
            )

        assertThat(roundtrippedResponseFormatText).isEqualTo(responseFormatText)
    }
}
