// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionAssistantMessageParamTest {

    @Test
    fun create() {
        val chatCompletionAssistantMessageParam =
            ChatCompletionAssistantMessageParam.builder()
                .audio(Audio.builder().id("id").build())
                .content("string")
                .functionCall(
                    ChatCompletionAssistantMessageParam.FunctionCall.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
                .name("name")
                .refusal("refusal")
                .addToolCall(
                    ChatCompletionMessageToolCall.builder()
                        .id("id")
                        .function(
                            ChatCompletionMessageToolCall.Function.builder()
                                .arguments("arguments")
                                .name("name")
                                .build()
                        )
                        .thoughtSignature("thought_signature")
                        .build()
                )
                .build()

        assertThat(chatCompletionAssistantMessageParam.audio())
            .isEqualTo(Audio.builder().id("id").build())
        assertThat(chatCompletionAssistantMessageParam.content())
            .isEqualTo(ChatCompletionAssistantMessageParam.Content.ofString("string"))
        assertThat(chatCompletionAssistantMessageParam.functionCall())
            .isEqualTo(
                ChatCompletionAssistantMessageParam.FunctionCall.builder()
                    .arguments("arguments")
                    .name("name")
                    .build()
            )
        assertThat(chatCompletionAssistantMessageParam.name()).isEqualTo("name")
        assertThat(chatCompletionAssistantMessageParam.refusal()).isEqualTo("refusal")
        assertThat(chatCompletionAssistantMessageParam.toolCalls())
            .containsExactly(
                ChatCompletionAssistantMessageParam.ToolCall.ofFunction(
                    ChatCompletionMessageToolCall.builder()
                        .id("id")
                        .function(
                            ChatCompletionMessageToolCall.Function.builder()
                                .arguments("arguments")
                                .name("name")
                                .build()
                        )
                        .thoughtSignature("thought_signature")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionAssistantMessageParam =
            ChatCompletionAssistantMessageParam.builder()
                .audio(Audio.builder().id("id").build())
                .content("string")
                .functionCall(
                    ChatCompletionAssistantMessageParam.FunctionCall.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
                .name("name")
                .refusal("refusal")
                .addToolCall(
                    ChatCompletionMessageToolCall.builder()
                        .id("id")
                        .function(
                            ChatCompletionMessageToolCall.Function.builder()
                                .arguments("arguments")
                                .name("name")
                                .build()
                        )
                        .thoughtSignature("thought_signature")
                        .build()
                )
                .build()

        val roundtrippedChatCompletionAssistantMessageParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionAssistantMessageParam),
                jacksonTypeRef<ChatCompletionAssistantMessageParam>(),
            )

        assertThat(roundtrippedChatCompletionAssistantMessageParam)
            .isEqualTo(chatCompletionAssistantMessageParam)
    }
}
