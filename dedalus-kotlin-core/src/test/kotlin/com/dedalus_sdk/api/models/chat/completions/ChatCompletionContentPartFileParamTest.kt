// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionContentPartFileParamTest {

    @Test
    fun create() {
        val chatCompletionContentPartFileParam =
            ChatCompletionContentPartFileParam.builder()
                .file(
                    ChatCompletionContentPartFileParam.File.builder()
                        .fileData("file_data")
                        .fileId("file_id")
                        .filename("filename")
                        .build()
                )
                .build()

        assertThat(chatCompletionContentPartFileParam.file())
            .isEqualTo(
                ChatCompletionContentPartFileParam.File.builder()
                    .fileData("file_data")
                    .fileId("file_id")
                    .filename("filename")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionContentPartFileParam =
            ChatCompletionContentPartFileParam.builder()
                .file(
                    ChatCompletionContentPartFileParam.File.builder()
                        .fileData("file_data")
                        .fileId("file_id")
                        .filename("filename")
                        .build()
                )
                .build()

        val roundtrippedChatCompletionContentPartFileParam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionContentPartFileParam),
                jacksonTypeRef<ChatCompletionContentPartFileParam>(),
            )

        assertThat(roundtrippedChatCompletionContentPartFileParam)
            .isEqualTo(chatCompletionContentPartFileParam)
    }
}
