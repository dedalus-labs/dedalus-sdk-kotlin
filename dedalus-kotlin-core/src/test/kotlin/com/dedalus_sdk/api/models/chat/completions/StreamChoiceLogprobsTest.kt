// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamChoiceLogprobsTest {

    @Test
    fun create() {
        val streamChoiceLogprobs =
            StreamChoiceLogprobs.builder()
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

        assertThat(streamChoiceLogprobs.content())
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
        assertThat(streamChoiceLogprobs.refusal())
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
        val streamChoiceLogprobs =
            StreamChoiceLogprobs.builder()
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

        val roundtrippedStreamChoiceLogprobs =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamChoiceLogprobs),
                jacksonTypeRef<StreamChoiceLogprobs>(),
            )

        assertThat(roundtrippedStreamChoiceLogprobs).isEqualTo(streamChoiceLogprobs)
    }
}
