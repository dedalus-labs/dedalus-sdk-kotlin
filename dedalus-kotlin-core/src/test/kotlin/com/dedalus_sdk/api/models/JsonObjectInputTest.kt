// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JsonObjectInputTest {

    @Test
    fun create() {
        val jsonObjectInput =
            JsonObjectInput.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jsonObjectInput =
            JsonObjectInput.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()

        val roundtrippedJsonObjectInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jsonObjectInput),
                jacksonTypeRef<JsonObjectInput>(),
            )

        assertThat(roundtrippedJsonObjectInput).isEqualTo(jsonObjectInput)
    }
}
