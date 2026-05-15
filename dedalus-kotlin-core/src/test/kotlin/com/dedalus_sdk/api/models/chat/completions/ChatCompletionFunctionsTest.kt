// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionFunctionsTest {

    @Test
    fun create() {
        val chatCompletionFunctions =
            ChatCompletionFunctions.builder()
                .name("name")
                .description("description")
                .parameters(
                    ChatCompletionFunctions.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(chatCompletionFunctions.name()).isEqualTo("name")
        assertThat(chatCompletionFunctions.description()).isEqualTo("description")
        assertThat(chatCompletionFunctions.parameters())
            .isEqualTo(
                ChatCompletionFunctions.Parameters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionFunctions =
            ChatCompletionFunctions.builder()
                .name("name")
                .description("description")
                .parameters(
                    ChatCompletionFunctions.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedChatCompletionFunctions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionFunctions),
                jacksonTypeRef<ChatCompletionFunctions>(),
            )

        assertThat(roundtrippedChatCompletionFunctions).isEqualTo(chatCompletionFunctions)
    }
}
