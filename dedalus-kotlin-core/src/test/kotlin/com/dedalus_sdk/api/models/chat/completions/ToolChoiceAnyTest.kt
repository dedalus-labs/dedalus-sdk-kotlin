// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolChoiceAnyTest {

    @Test
    fun create() {
        val toolChoiceAny = ToolChoiceAny.builder().disableParallelToolUse(true).build()

        assertThat(toolChoiceAny.disableParallelToolUse()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolChoiceAny = ToolChoiceAny.builder().disableParallelToolUse(true).build()

        val roundtrippedToolChoiceAny =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolChoiceAny),
                jacksonTypeRef<ToolChoiceAny>(),
            )

        assertThat(roundtrippedToolChoiceAny).isEqualTo(toolChoiceAny)
    }
}
