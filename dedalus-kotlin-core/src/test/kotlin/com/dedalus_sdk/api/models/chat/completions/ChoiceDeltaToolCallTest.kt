// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChoiceDeltaToolCallTest {

    @Test
    fun create() {
        val choiceDeltaToolCall =
            ChoiceDeltaToolCall.builder()
                .index(0L)
                .id("id")
                .function(
                    ChoiceDeltaToolCall.Function.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
                .type(ChoiceDeltaToolCall.Type.FUNCTION)
                .build()

        assertThat(choiceDeltaToolCall.index()).isEqualTo(0L)
        assertThat(choiceDeltaToolCall.id()).isEqualTo("id")
        assertThat(choiceDeltaToolCall.function())
            .isEqualTo(
                ChoiceDeltaToolCall.Function.builder().arguments("arguments").name("name").build()
            )
        assertThat(choiceDeltaToolCall.type()).isEqualTo(ChoiceDeltaToolCall.Type.FUNCTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val choiceDeltaToolCall =
            ChoiceDeltaToolCall.builder()
                .index(0L)
                .id("id")
                .function(
                    ChoiceDeltaToolCall.Function.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
                .type(ChoiceDeltaToolCall.Type.FUNCTION)
                .build()

        val roundtrippedChoiceDeltaToolCall =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(choiceDeltaToolCall),
                jacksonTypeRef<ChoiceDeltaToolCall>(),
            )

        assertThat(roundtrippedChoiceDeltaToolCall).isEqualTo(choiceDeltaToolCall)
    }
}
