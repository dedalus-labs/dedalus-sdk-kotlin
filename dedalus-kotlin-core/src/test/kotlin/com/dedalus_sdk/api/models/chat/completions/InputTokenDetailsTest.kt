// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InputTokenDetailsTest {

    @Test
    fun create() {
        val inputTokenDetails = InputTokenDetails.builder().audioTokens(0L).textTokens(0L).build()

        assertThat(inputTokenDetails.audioTokens()).isEqualTo(0L)
        assertThat(inputTokenDetails.textTokens()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inputTokenDetails = InputTokenDetails.builder().audioTokens(0L).textTokens(0L).build()

        val roundtrippedInputTokenDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inputTokenDetails),
                jacksonTypeRef<InputTokenDetails>(),
            )

        assertThat(roundtrippedInputTokenDetails).isEqualTo(inputTokenDetails)
    }
}
