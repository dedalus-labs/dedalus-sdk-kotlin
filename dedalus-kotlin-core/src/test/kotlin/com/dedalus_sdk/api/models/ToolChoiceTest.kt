// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ToolChoiceTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 = ToolChoice.UnionMember0.AUTO

        val toolChoice = ToolChoice.ofUnionMember0(unionMember0)

        assertThat(toolChoice.unionMember0()).isEqualTo(unionMember0)
        assertThat(toolChoice.string()).isNull()
        assertThat(toolChoice.unionMember2()).isNull()
        assertThat(toolChoice.mcp()).isNull()
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val toolChoice = ToolChoice.ofUnionMember0(ToolChoice.UnionMember0.AUTO)

        val roundtrippedToolChoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolChoice),
                jacksonTypeRef<ToolChoice>(),
            )

        assertThat(roundtrippedToolChoice).isEqualTo(toolChoice)
    }

    @Test
    fun ofString() {
        val string = "string"

        val toolChoice = ToolChoice.ofString(string)

        assertThat(toolChoice.unionMember0()).isNull()
        assertThat(toolChoice.string()).isEqualTo(string)
        assertThat(toolChoice.unionMember2()).isNull()
        assertThat(toolChoice.mcp()).isNull()
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val toolChoice = ToolChoice.ofString("string")

        val roundtrippedToolChoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolChoice),
                jacksonTypeRef<ToolChoice>(),
            )

        assertThat(roundtrippedToolChoice).isEqualTo(toolChoice)
    }

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            ToolChoice.UnionMember2.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val toolChoice = ToolChoice.ofUnionMember2(unionMember2)

        assertThat(toolChoice.unionMember0()).isNull()
        assertThat(toolChoice.string()).isNull()
        assertThat(toolChoice.unionMember2()).isEqualTo(unionMember2)
        assertThat(toolChoice.mcp()).isNull()
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val toolChoice =
            ToolChoice.ofUnionMember2(
                ToolChoice.UnionMember2.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedToolChoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolChoice),
                jacksonTypeRef<ToolChoice>(),
            )

        assertThat(roundtrippedToolChoice).isEqualTo(toolChoice)
    }

    @Test
    fun ofMcp() {
        val mcp =
            ToolChoice.McpToolChoice.builder().name("name").serverLabel("server_label").build()

        val toolChoice = ToolChoice.ofMcp(mcp)

        assertThat(toolChoice.unionMember0()).isNull()
        assertThat(toolChoice.string()).isNull()
        assertThat(toolChoice.unionMember2()).isNull()
        assertThat(toolChoice.mcp()).isEqualTo(mcp)
    }

    @Test
    fun ofMcpRoundtrip() {
        val jsonMapper = jsonMapper()
        val toolChoice =
            ToolChoice.ofMcp(
                ToolChoice.McpToolChoice.builder().name("name").serverLabel("server_label").build()
            )

        val roundtrippedToolChoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolChoice),
                jacksonTypeRef<ToolChoice>(),
            )

        assertThat(roundtrippedToolChoice).isEqualTo(toolChoice)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val toolChoice = jsonMapper().convertValue(testCase.value, jacksonTypeRef<ToolChoice>())

        val e = assertThrows<DedalusInvalidDataException> { toolChoice.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
