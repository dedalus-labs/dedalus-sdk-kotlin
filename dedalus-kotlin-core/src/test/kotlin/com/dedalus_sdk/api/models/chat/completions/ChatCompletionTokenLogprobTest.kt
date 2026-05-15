// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionTokenLogprobTest {

    @Test
    fun create() {
        val chatCompletionTokenLogprob =
            ChatCompletionTokenLogprob.builder()
                .token("token")
                .addByte(0L)
                .logprob(0.0)
                .addTopLogprob(
                    ChatCompletionTokenLogprob.TopLogprob.builder()
                        .token("token")
                        .addByte(0L)
                        .logprob(0.0)
                        .build()
                )
                .build()

        assertThat(chatCompletionTokenLogprob.token()).isEqualTo("token")
        assertThat(chatCompletionTokenLogprob.bytes()).containsExactly(0L)
        assertThat(chatCompletionTokenLogprob.logprob()).isEqualTo(0.0)
        assertThat(chatCompletionTokenLogprob.topLogprobs())
            .containsExactly(
                ChatCompletionTokenLogprob.TopLogprob.builder()
                    .token("token")
                    .addByte(0L)
                    .logprob(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionTokenLogprob =
            ChatCompletionTokenLogprob.builder()
                .token("token")
                .addByte(0L)
                .logprob(0.0)
                .addTopLogprob(
                    ChatCompletionTokenLogprob.TopLogprob.builder()
                        .token("token")
                        .addByte(0L)
                        .logprob(0.0)
                        .build()
                )
                .build()

        val roundtrippedChatCompletionTokenLogprob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionTokenLogprob),
                jacksonTypeRef<ChatCompletionTokenLogprob>(),
            )

        assertThat(roundtrippedChatCompletionTokenLogprob).isEqualTo(chatCompletionTokenLogprob)
    }
}
