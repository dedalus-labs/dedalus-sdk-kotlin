// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionFunctionMessageParamTest {

    @Test
    fun create() {
        val chatCompletionFunctionMessageParam =
            ChatCompletionFunctionMessageParam.builder().content("content").name("name").build()

        assertThat(chatCompletionFunctionMessageParam.content()).isEqualTo("content")
        assertThat(chatCompletionFunctionMessageParam.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionFunctionMessageParam =
            ChatCompletionFunctionMessageParam.builder().content("content").name("name").build()

        val roundtrippedChatCompletionFunctionMessageParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionFunctionMessageParam),
                jacksonTypeRef<ChatCompletionFunctionMessageParam>(),
            )

        assertThat(roundtrippedChatCompletionFunctionMessageParam)
            .isEqualTo(chatCompletionFunctionMessageParam)
    }
}
