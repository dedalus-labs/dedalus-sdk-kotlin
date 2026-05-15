// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.models.FunctionDefinition
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionToolParamTest {

    @Test
    fun create() {
        val chatCompletionToolParam =
            ChatCompletionToolParam.builder()
                .function(FunctionDefinition.builder().name("name").build())
                .type(ChatCompletionToolParam.Type.FUNCTION)
                .build()

        assertThat(chatCompletionToolParam.function())
            .isEqualTo(FunctionDefinition.builder().name("name").build())
        assertThat(chatCompletionToolParam.type()).isEqualTo(ChatCompletionToolParam.Type.FUNCTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionToolParam =
            ChatCompletionToolParam.builder()
                .function(FunctionDefinition.builder().name("name").build())
                .type(ChatCompletionToolParam.Type.FUNCTION)
                .build()

        val roundtrippedChatCompletionToolParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionToolParam),
                jacksonTypeRef<ChatCompletionToolParam>(),
            )

        assertThat(roundtrippedChatCompletionToolParam).isEqualTo(chatCompletionToolParam)
    }
}
