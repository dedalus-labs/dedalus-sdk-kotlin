// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionUserMessageParamTest {

    @Test
    fun create() {
        val chatCompletionUserMessageParam =
            ChatCompletionUserMessageParam.builder().content("string").name("name").build()

        assertThat(chatCompletionUserMessageParam.content())
            .isEqualTo(ChatCompletionUserMessageParam.Content.ofString("string"))
        assertThat(chatCompletionUserMessageParam.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionUserMessageParam =
            ChatCompletionUserMessageParam.builder().content("string").name("name").build()

        val roundtrippedChatCompletionUserMessageParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionUserMessageParam),
                jacksonTypeRef<ChatCompletionUserMessageParam>(),
            )

        assertThat(roundtrippedChatCompletionUserMessageParam)
            .isEqualTo(chatCompletionUserMessageParam)
    }
}
