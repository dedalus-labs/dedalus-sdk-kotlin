// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JsonValueInputTest {

    @Test
    fun ofString() {
        val string = "string"

        val jsonValueInput = JsonValueInput.ofString(string)

        assertThat(jsonValueInput.string()).isEqualTo(string)
        assertThat(jsonValueInput.double()).isNull()
        assertThat(jsonValueInput.boolean()).isNull()
        assertThat(jsonValueInput.unionMember3()).isNull()
        assertThat(jsonValueInput.inputs()).isNull()
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val jsonValueInput = JsonValueInput.ofString("string")

        val roundtrippedJsonValueInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jsonValueInput),
                jacksonTypeRef<JsonValueInput>(),
            )

        assertThat(roundtrippedJsonValueInput).isEqualTo(jsonValueInput)
    }

    @Test
    fun ofDouble() {
        val double = 0.0

        val jsonValueInput = JsonValueInput.ofDouble(double)

        assertThat(jsonValueInput.string()).isNull()
        assertThat(jsonValueInput.double()).isEqualTo(double)
        assertThat(jsonValueInput.boolean()).isNull()
        assertThat(jsonValueInput.unionMember3()).isNull()
        assertThat(jsonValueInput.inputs()).isNull()
    }

    @Test
    fun ofDoubleRoundtrip() {
        val jsonMapper = jsonMapper()
        val jsonValueInput = JsonValueInput.ofDouble(0.0)

        val roundtrippedJsonValueInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jsonValueInput),
                jacksonTypeRef<JsonValueInput>(),
            )

        assertThat(roundtrippedJsonValueInput).isEqualTo(jsonValueInput)
    }

    @Test
    fun ofBoolean() {
        val boolean = true

        val jsonValueInput = JsonValueInput.ofBoolean(boolean)

        assertThat(jsonValueInput.string()).isNull()
        assertThat(jsonValueInput.double()).isNull()
        assertThat(jsonValueInput.boolean()).isEqualTo(boolean)
        assertThat(jsonValueInput.unionMember3()).isNull()
        assertThat(jsonValueInput.inputs()).isNull()
    }

    @Test
    fun ofBooleanRoundtrip() {
        val jsonMapper = jsonMapper()
        val jsonValueInput = JsonValueInput.ofBoolean(true)

        val roundtrippedJsonValueInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jsonValueInput),
                jacksonTypeRef<JsonValueInput>(),
            )

        assertThat(roundtrippedJsonValueInput).isEqualTo(jsonValueInput)
    }

    @Test
    fun ofUnionMember3() {
        val unionMember3 =
            JsonValueInput.UnionMember3.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()

        val jsonValueInput = JsonValueInput.ofUnionMember3(unionMember3)

        assertThat(jsonValueInput.string()).isNull()
        assertThat(jsonValueInput.double()).isNull()
        assertThat(jsonValueInput.boolean()).isNull()
        assertThat(jsonValueInput.unionMember3()).isEqualTo(unionMember3)
        assertThat(jsonValueInput.inputs()).isNull()
    }

    @Test
    fun ofUnionMember3Roundtrip() {
        val jsonMapper = jsonMapper()
        val jsonValueInput =
            JsonValueInput.ofUnionMember3(
                JsonValueInput.UnionMember3.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )

        val roundtrippedJsonValueInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jsonValueInput),
                jacksonTypeRef<JsonValueInput>(),
            )

        assertThat(roundtrippedJsonValueInput).isEqualTo(jsonValueInput)
    }

    @Test
    fun ofInputs() {
        val inputs = listOf(JsonValueInput.ofString("string"))

        val jsonValueInput = JsonValueInput.ofInputs(inputs)

        assertThat(jsonValueInput.string()).isNull()
        assertThat(jsonValueInput.double()).isNull()
        assertThat(jsonValueInput.boolean()).isNull()
        assertThat(jsonValueInput.unionMember3()).isNull()
        assertThat(jsonValueInput.inputs()).isEqualTo(inputs)
    }

    @Test
    fun ofInputsRoundtrip() {
        val jsonMapper = jsonMapper()
        val jsonValueInput = JsonValueInput.ofInputs(listOf(JsonValueInput.ofString("string")))

        val roundtrippedJsonValueInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jsonValueInput),
                jacksonTypeRef<JsonValueInput>(),
            )

        assertThat(roundtrippedJsonValueInput).isEqualTo(jsonValueInput)
    }
}
