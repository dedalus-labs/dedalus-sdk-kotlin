// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionContentPartRefusalParamTest {

    @Test
    fun create() {
        val chatCompletionContentPartRefusalParam =
            ChatCompletionContentPartRefusalParam.builder().refusal("refusal").build()

        assertThat(chatCompletionContentPartRefusalParam.refusal()).isEqualTo("refusal")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionContentPartRefusalParam =
            ChatCompletionContentPartRefusalParam.builder().refusal("refusal").build()

        val roundtrippedChatCompletionContentPartRefusalParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionContentPartRefusalParam),
                jacksonTypeRef<ChatCompletionContentPartRefusalParam>(),
            )

        assertThat(roundtrippedChatCompletionContentPartRefusalParam)
            .isEqualTo(chatCompletionContentPartRefusalParam)
    }
}
