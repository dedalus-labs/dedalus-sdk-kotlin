// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.responses

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.models.JsonObjectInput
import com.dedalus_sdk.api.models.McpToolResult
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseTest {

    @Test
    fun create() {
        val response =
            Response.builder()
                .id("id")
                .createdAt(0.0)
                .model("model")
                .addOutput(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .status(Response.Status.COMPLETED)
                .background(true)
                .completedAt(0.0)
                .conversation(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .error(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .frequencyPenalty(0.0)
                .incompleteDetails(
                    Response.IncompleteDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .instructions("string")
                .maxOutputTokens(0L)
                .maxToolCalls(0L)
                .mcpServerErrors(
                    Response.McpServerErrors.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "message" to "message",
                                    "code" to "code",
                                    "recommendation" to "recommendation",
                                )
                            ),
                        )
                        .build()
                )
                .addMcpToolResult(
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
                )
                .metadata(
                    Response.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .object_(Response.Object.RESPONSE)
                .outputText("output_text")
                .parallelToolCalls(true)
                .presencePenalty(0.0)
                .previousResponseId("previous_response_id")
                .promptCacheKey("prompt_cache_key")
                .reasoning(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .safetyIdentifier("safety_identifier")
                .serviceTier("service_tier")
                .store(true)
                .temperature(0.0)
                .text(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .toolChoice("string")
                .addTool(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addToolsExecuted("string")
                .topLogprobs(0L)
                .topP(0.0)
                .truncation("truncation")
                .usage(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(response.id()).isEqualTo("id")
        assertThat(response.createdAt()).isEqualTo(0.0)
        assertThat(response.model()).isEqualTo("model")
        assertThat(response.output())
            .containsExactly(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(response.status()).isEqualTo(Response.Status.COMPLETED)
        assertThat(response.background()).isEqualTo(true)
        assertThat(response.completedAt()).isEqualTo(0.0)
        assertThat(response.conversation())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(response.error())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(response.frequencyPenalty()).isEqualTo(0.0)
        assertThat(response.incompleteDetails())
            .isEqualTo(
                Response.IncompleteDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(response.instructions()).isEqualTo(Response.Instructions.ofString("string"))
        assertThat(response.maxOutputTokens()).isEqualTo(0L)
        assertThat(response.maxToolCalls()).isEqualTo(0L)
        assertThat(response.mcpServerErrors())
            .isEqualTo(
                Response.McpServerErrors.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "message" to "message",
                                "code" to "code",
                                "recommendation" to "recommendation",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(response.mcpToolResults())
            .containsExactly(
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
            )
        assertThat(response.metadata())
            .isEqualTo(
                Response.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(response.object_()).isEqualTo(Response.Object.RESPONSE)
        assertThat(response.outputText()).isEqualTo("output_text")
        assertThat(response.parallelToolCalls()).isEqualTo(true)
        assertThat(response.presencePenalty()).isEqualTo(0.0)
        assertThat(response.previousResponseId()).isEqualTo("previous_response_id")
        assertThat(response.promptCacheKey()).isEqualTo("prompt_cache_key")
        assertThat(response.reasoning())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(response.safetyIdentifier()).isEqualTo("safety_identifier")
        assertThat(response.serviceTier()).isEqualTo("service_tier")
        assertThat(response.store()).isEqualTo(true)
        assertThat(response.temperature()).isEqualTo(0.0)
        assertThat(response.text())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(response.toolChoice()).isEqualTo(Response.ToolChoice.ofString("string"))
        assertThat(response.tools())
            .containsExactly(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(response.toolsExecuted()).containsExactly("string")
        assertThat(response.topLogprobs()).isEqualTo(0L)
        assertThat(response.topP()).isEqualTo(0.0)
        assertThat(response.truncation()).isEqualTo("truncation")
        assertThat(response.usage())
            .isEqualTo(
                JsonObjectInput.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val response =
            Response.builder()
                .id("id")
                .createdAt(0.0)
                .model("model")
                .addOutput(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .status(Response.Status.COMPLETED)
                .background(true)
                .completedAt(0.0)
                .conversation(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .error(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .frequencyPenalty(0.0)
                .incompleteDetails(
                    Response.IncompleteDetails.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .instructions("string")
                .maxOutputTokens(0L)
                .maxToolCalls(0L)
                .mcpServerErrors(
                    Response.McpServerErrors.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "message" to "message",
                                    "code" to "code",
                                    "recommendation" to "recommendation",
                                )
                            ),
                        )
                        .build()
                )
                .addMcpToolResult(
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
                )
                .metadata(
                    Response.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .object_(Response.Object.RESPONSE)
                .outputText("output_text")
                .parallelToolCalls(true)
                .presencePenalty(0.0)
                .previousResponseId("previous_response_id")
                .promptCacheKey("prompt_cache_key")
                .reasoning(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .safetyIdentifier("safety_identifier")
                .serviceTier("service_tier")
                .store(true)
                .temperature(0.0)
                .text(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .toolChoice("string")
                .addTool(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addToolsExecuted("string")
                .topLogprobs(0L)
                .topP(0.0)
                .truncation("truncation")
                .usage(
                    JsonObjectInput.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(response),
                jacksonTypeRef<Response>(),
            )

        assertThat(roundtrippedResponse).isEqualTo(response)
    }
}
