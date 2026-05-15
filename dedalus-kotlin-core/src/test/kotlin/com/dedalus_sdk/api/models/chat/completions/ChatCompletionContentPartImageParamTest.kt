// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionContentPartImageParamTest {

    @Test
    fun create() {
        val chatCompletionContentPartImageParam =
            ChatCompletionContentPartImageParam.builder()
                .imageUrl(
                    ChatCompletionContentPartImageParam.ImageUrl.builder()
                        .url("https://example.com")
                        .detail(ChatCompletionContentPartImageParam.ImageUrl.Detail.AUTO)
                        .build()
                )
                .build()

        assertThat(chatCompletionContentPartImageParam.imageUrl())
            .isEqualTo(
                ChatCompletionContentPartImageParam.ImageUrl.builder()
                    .url("https://example.com")
                    .detail(ChatCompletionContentPartImageParam.ImageUrl.Detail.AUTO)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionContentPartImageParam =
            ChatCompletionContentPartImageParam.builder()
                .imageUrl(
                    ChatCompletionContentPartImageParam.ImageUrl.builder()
                        .url("https://example.com")
                        .detail(ChatCompletionContentPartImageParam.ImageUrl.Detail.AUTO)
                        .build()
                )
                .build()

        val roundtrippedChatCompletionContentPartImageParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionContentPartImageParam),
                jacksonTypeRef<ChatCompletionContentPartImageParam>(),
            )

        assertThat(roundtrippedChatCompletionContentPartImageParam)
            .isEqualTo(chatCompletionContentPartImageParam)
    }
}
