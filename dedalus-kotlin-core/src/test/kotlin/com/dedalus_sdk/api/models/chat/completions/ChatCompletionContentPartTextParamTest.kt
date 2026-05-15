// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionContentPartTextParamTest {

    @Test
    fun create() {
        val chatCompletionContentPartTextParam =
            ChatCompletionContentPartTextParam.builder().text("text").build()

        assertThat(chatCompletionContentPartTextParam.text()).isEqualTo("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionContentPartTextParam =
            ChatCompletionContentPartTextParam.builder().text("text").build()

        val roundtrippedChatCompletionContentPartTextParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionContentPartTextParam),
                jacksonTypeRef<ChatCompletionContentPartTextParam>(),
            )

        assertThat(roundtrippedChatCompletionContentPartTextParam)
            .isEqualTo(chatCompletionContentPartTextParam)
    }
}
