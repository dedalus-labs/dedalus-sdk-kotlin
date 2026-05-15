// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.models.JsonObjectInput
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeferredCallResponseTest {

    @Test
    fun create() {
        val deferredCallResponse =
            DeferredCallResponse.builder()
                .id("id")
                .name("name")
                .arguments(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addBlockedBy("string")
                .addDependency("string")
                .venue("venue")
                .build()

        assertThat(deferredCallResponse.id()).isEqualTo("id")
        assertThat(deferredCallResponse.name()).isEqualTo("name")
        assertThat(deferredCallResponse.arguments())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(deferredCallResponse.blockedBy()).containsExactly("string")
        assertThat(deferredCallResponse.dependencies()).containsExactly("string")
        assertThat(deferredCallResponse.venue()).isEqualTo("venue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deferredCallResponse =
            DeferredCallResponse.builder()
                .id("id")
                .name("name")
                .arguments(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addBlockedBy("string")
                .addDependency("string")
                .venue("venue")
                .build()

        val roundtrippedDeferredCallResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deferredCallResponse),
                jacksonTypeRef<DeferredCallResponse>(),
            )

        assertThat(roundtrippedDeferredCallResponse).isEqualTo(deferredCallResponse)
    }
}
