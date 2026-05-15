// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamChoiceTest {

    @Test
    fun create() {
        val streamChoice =
            StreamChoice.builder()
                .delta(
                    ChoiceDelta.builder()
                        .content("content")
                        .functionCall(
                            ChoiceDelta.FunctionCall.builder()
                                .arguments("arguments")
                                .name("name")
                                .build()
                        )
                        .refusal("refusal")
                        .role(ChoiceDelta.Role.DEVELOPER)
                        .addToolCall(
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
                        )
                        .build()
                )
                .finishReason(StreamChoice.FinishReason.STOP)
                .index(0L)
                .logprobs(
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
                )
                .build()

        assertThat(streamChoice.delta())
            .isEqualTo(
                ChoiceDelta.builder()
                    .content("content")
                    .functionCall(
                        ChoiceDelta.FunctionCall.builder()
                            .arguments("arguments")
                            .name("name")
                            .build()
                    )
                    .refusal("refusal")
                    .role(ChoiceDelta.Role.DEVELOPER)
                    .addToolCall(
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
                    )
                    .build()
            )
        assertThat(streamChoice.finishReason()).isEqualTo(StreamChoice.FinishReason.STOP)
        assertThat(streamChoice.index()).isEqualTo(0L)
        assertThat(streamChoice.logprobs())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamChoice =
            StreamChoice.builder()
                .delta(
                    ChoiceDelta.builder()
                        .content("content")
                        .functionCall(
                            ChoiceDelta.FunctionCall.builder()
                                .arguments("arguments")
                                .name("name")
                                .build()
                        )
                        .refusal("refusal")
                        .role(ChoiceDelta.Role.DEVELOPER)
                        .addToolCall(
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
                        )
                        .build()
                )
                .finishReason(StreamChoice.FinishReason.STOP)
                .index(0L)
                .logprobs(
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
                )
                .build()

        val roundtrippedStreamChoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamChoice),
                jacksonTypeRef<StreamChoice>(),
            )

        assertThat(roundtrippedStreamChoice).isEqualTo(streamChoice)
    }
}
