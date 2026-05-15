// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChoiceLogprobsTest {

    @Test
    fun create() {
        val choiceLogprobs =
            ChoiceLogprobs.builder()
                .addContent(
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
                )
                .addRefusal(
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
                )
                .build()

        assertThat(choiceLogprobs.content())
            .containsExactly(
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
            )
        assertThat(choiceLogprobs.refusal())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val choiceLogprobs =
            ChoiceLogprobs.builder()
                .addContent(
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
                )
                .addRefusal(
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
                )
                .build()

        val roundtrippedChoiceLogprobs =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(choiceLogprobs),
                jacksonTypeRef<ChoiceLogprobs>(),
            )

        assertThat(roundtrippedChoiceLogprobs).isEqualTo(choiceLogprobs)
    }
}
