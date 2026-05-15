// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionMessageTest {

    @Test
    fun create() {
        val chatCompletionMessage =
            ChatCompletionMessage.builder()
                .content("content")
                .refusal("refusal")
                .addAnnotation(
                    ChatCompletionMessage.Annotation.builder()
                        .urlCitation(
                            ChatCompletionMessage.Annotation.UrlCitation.builder()
                                .endIndex(0L)
                                .startIndex(0L)
                                .title("title")
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .audio(
                    ChatCompletionMessage.Audio.builder()
                        .id("id")
                        .data("data")
                        .expiresAt(0L)
                        .transcript("transcript")
                        .build()
                )
                .functionCall(
                    ChatCompletionMessage.FunctionCall.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
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

        assertThat(chatCompletionMessage.content()).isEqualTo("content")
        assertThat(chatCompletionMessage.refusal()).isEqualTo("refusal")
        assertThat(chatCompletionMessage.annotations())
            .containsExactly(
                ChatCompletionMessage.Annotation.builder()
                    .urlCitation(
                        ChatCompletionMessage.Annotation.UrlCitation.builder()
                            .endIndex(0L)
                            .startIndex(0L)
                            .title("title")
                            .url("url")
                            .build()
                    )
                    .build()
            )
        assertThat(chatCompletionMessage.audio())
            .isEqualTo(
                ChatCompletionMessage.Audio.builder()
                    .id("id")
                    .data("data")
                    .expiresAt(0L)
                    .transcript("transcript")
                    .build()
            )
        assertThat(chatCompletionMessage.functionCall())
            .isEqualTo(
                ChatCompletionMessage.FunctionCall.builder()
                    .arguments("arguments")
                    .name("name")
                    .build()
            )
        assertThat(chatCompletionMessage.toolCalls())
            .containsExactly(
                ChatCompletionMessage.ToolCall.ofFunction(
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
        val chatCompletionMessage =
            ChatCompletionMessage.builder()
                .content("content")
                .refusal("refusal")
                .addAnnotation(
                    ChatCompletionMessage.Annotation.builder()
                        .urlCitation(
                            ChatCompletionMessage.Annotation.UrlCitation.builder()
                                .endIndex(0L)
                                .startIndex(0L)
                                .title("title")
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .audio(
                    ChatCompletionMessage.Audio.builder()
                        .id("id")
                        .data("data")
                        .expiresAt(0L)
                        .transcript("transcript")
                        .build()
                )
                .functionCall(
                    ChatCompletionMessage.FunctionCall.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
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

        val roundtrippedChatCompletionMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionMessage),
                jacksonTypeRef<ChatCompletionMessage>(),
            )

        assertThat(roundtrippedChatCompletionMessage).isEqualTo(chatCompletionMessage)
    }
}
