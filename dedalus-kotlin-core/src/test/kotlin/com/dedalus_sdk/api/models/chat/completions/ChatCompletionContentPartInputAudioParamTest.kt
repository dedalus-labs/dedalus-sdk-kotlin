// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionContentPartInputAudioParamTest {

    @Test
    fun create() {
        val chatCompletionContentPartInputAudioParam =
            ChatCompletionContentPartInputAudioParam.builder()
                .inputAudio(
                    ChatCompletionContentPartInputAudioParam.InputAudio.builder()
                        .data("data")
                        .format(ChatCompletionContentPartInputAudioParam.InputAudio.Format.WAV)
                        .build()
                )
                .build()

        assertThat(chatCompletionContentPartInputAudioParam.inputAudio())
            .isEqualTo(
                ChatCompletionContentPartInputAudioParam.InputAudio.builder()
                    .data("data")
                    .format(ChatCompletionContentPartInputAudioParam.InputAudio.Format.WAV)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionContentPartInputAudioParam =
            ChatCompletionContentPartInputAudioParam.builder()
                .inputAudio(
                    ChatCompletionContentPartInputAudioParam.InputAudio.builder()
                        .data("data")
                        .format(ChatCompletionContentPartInputAudioParam.InputAudio.Format.WAV)
                        .build()
                )
                .build()

        val roundtrippedChatCompletionContentPartInputAudioParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionContentPartInputAudioParam),
                jacksonTypeRef<ChatCompletionContentPartInputAudioParam>(),
            )

        assertThat(roundtrippedChatCompletionContentPartInputAudioParam)
            .isEqualTo(chatCompletionContentPartInputAudioParam)
    }
}
