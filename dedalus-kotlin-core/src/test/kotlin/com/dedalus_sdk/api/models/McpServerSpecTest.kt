// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerSpecTest {

    @Test
    fun create() {
        val mcpServerSpec =
            McpServerSpec.builder()
                .name("name")
                .credentials(
                    McpServerSpec.Credentials.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .slug("_1K--W2kIFj1/_-Mtu--_-p")
                .url("url")
                .version("version")
                .build()

        assertThat(mcpServerSpec.name()).isEqualTo("name")
        assertThat(mcpServerSpec.credentials())
            .isEqualTo(
                McpServerSpec.Credentials.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(mcpServerSpec.slug()).isEqualTo("_1K--W2kIFj1/_-Mtu--_-p")
        assertThat(mcpServerSpec.url()).isEqualTo("url")
        assertThat(mcpServerSpec.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerSpec =
            McpServerSpec.builder()
                .name("name")
                .credentials(
                    McpServerSpec.Credentials.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .slug("_1K--W2kIFj1/_-Mtu--_-p")
                .url("url")
                .version("version")
                .build()

        val roundtrippedMcpServerSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerSpec),
                jacksonTypeRef<McpServerSpec>(),
            )

        assertThat(roundtrippedMcpServerSpec).isEqualTo(mcpServerSpec)
    }
}
