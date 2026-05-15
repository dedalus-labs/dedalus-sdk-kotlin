// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpToolResultTest {

    @Test
    fun create() {
        val mcpToolResult =
            McpToolResult.builder()
                .arguments(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .isError(true)
                .serverName("server_name")
                .toolName("tool_name")
                .durationMs(0L)
                .result("string")
                .build()

        assertThat(mcpToolResult.arguments())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(mcpToolResult.isError()).isEqualTo(true)
        assertThat(mcpToolResult.serverName()).isEqualTo("server_name")
        assertThat(mcpToolResult.toolName()).isEqualTo("tool_name")
        assertThat(mcpToolResult.durationMs()).isEqualTo(0L)
        assertThat(mcpToolResult.result()).isEqualTo(JsonValueInput.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpToolResult =
            McpToolResult.builder()
                .arguments(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .isError(true)
                .serverName("server_name")
                .toolName("tool_name")
                .durationMs(0L)
                .result("string")
                .build()

        val roundtrippedMcpToolResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpToolResult),
                jacksonTypeRef<McpToolResult>(),
            )

        assertThat(roundtrippedMcpToolResult).isEqualTo(mcpToolResult)
    }
}
