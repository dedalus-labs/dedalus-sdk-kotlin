// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThinkingConfigDisabledTest {

    @Test
    fun create() {
        val thinkingConfigDisabled = ThinkingConfigDisabled.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thinkingConfigDisabled = ThinkingConfigDisabled.builder().build()

        val roundtrippedThinkingConfigDisabled =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thinkingConfigDisabled),
                jacksonTypeRef<ThinkingConfigDisabled>(),
            )

        assertThat(roundtrippedThinkingConfigDisabled).isEqualTo(thinkingConfigDisabled)
    }
}
