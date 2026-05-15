// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.responses

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.models.Credential
import com.dedalus_sdk.api.models.JsonObjectInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseCreateParamsTest {

    @Test
    fun create() {
        ResponseCreateParams.builder()
            .responseCreateParams(
                ResponseCreateParams.builder()
                    .background(true)
                    .conversation("string")
                    .credentials(
                        Credential.builder()
                            .connectionName("external-service")
                            .values(
                                Credential.Values.builder()
                                    .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                    .build()
                            )
                            .build()
                    )
                    .frequencyPenalty(0.0)
                    .addInclude("message.output_text.logprobs")
                    .input("What is the capital of France?")
                    .instructions("You are a helpful assistant.")
                    .maxOutputTokens(1000L)
                    .maxToolCalls(10L)
                    .mcpServers("dedalus-labs/example-server")
                    .metadata(
                        ResponseCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .model("openai/gpt-4o")
                    .parallelToolCalls(true)
                    .presencePenalty(0.0)
                    .previousResponseId("previous_response_id")
                    .prompt(
                        ResponseCreateParams.Prompt.builder()
                            .id("id")
                            .variables(
                                JsonObjectInput.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .version("version")
                            .build()
                    )
                    .promptCacheKey("prompt_cache_key")
                    .reasoning(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .safetyIdentifier("safety_identifier")
                    .serviceTier(ResponseCreateParams.ServiceTier.AUTO)
                    .store(true)
                    .stream(true)
                    .streamOptions(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .temperature(0.0)
                    .text(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .toolChoice("auto")
                    .addTool(
                        JsonObjectInput.builder()
                            .putAdditionalProperty(
                                "function",
                                JsonValue.from(
                                    mapOf(
                                        "description" to null,
                                        "name" to null,
                                        "parameters" to null,
                                    )
                                ),
                            )
                            .putAdditionalProperty("type", JsonValue.from("function"))
                            .build()
                    )
                    .topLogprobs(5L)
                    .topP(0.1)
                    .truncation(ResponseCreateParams.Truncation.AUTO)
                    .user("user")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ResponseCreateParams.builder()
                .responseCreateParams(
                    ResponseCreateParams.builder()
                        .background(true)
                        .conversation("string")
                        .credentials(
                            Credential.builder()
                                .connectionName("external-service")
                                .values(
                                    Credential.Values.builder()
                                        .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                        .build()
                                )
                                .build()
                        )
                        .frequencyPenalty(0.0)
                        .addInclude("message.output_text.logprobs")
                        .input("What is the capital of France?")
                        .instructions("You are a helpful assistant.")
                        .maxOutputTokens(1000L)
                        .maxToolCalls(10L)
                        .mcpServers("dedalus-labs/example-server")
                        .metadata(
                            ResponseCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .parallelToolCalls(true)
                        .presencePenalty(0.0)
                        .previousResponseId("previous_response_id")
                        .prompt(
                            ResponseCreateParams.Prompt.builder()
                                .id("id")
                                .variables(
                                    JsonObjectInput.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .version("version")
                                .build()
                        )
                        .promptCacheKey("prompt_cache_key")
                        .reasoning(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .safetyIdentifier("safety_identifier")
                        .serviceTier(ResponseCreateParams.ServiceTier.AUTO)
                        .store(true)
                        .stream(true)
                        .streamOptions(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .temperature(0.0)
                        .text(
                            JsonObjectInput.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .toolChoice("auto")
                        .addTool(
                            JsonObjectInput.builder()
                                .putAdditionalProperty(
                                    "function",
                                    JsonValue.from(
                                        mapOf(
                                            "description" to null,
                                            "name" to null,
                                            "parameters" to null,
                                        )
                                    ),
                                )
                                .putAdditionalProperty("type", JsonValue.from("function"))
                                .build()
                        )
                        .topLogprobs(5L)
                        .topP(0.1)
                        .truncation(ResponseCreateParams.Truncation.AUTO)
                        .user("user")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ResponseCreateParams.builder()
                    .background(true)
                    .conversation("string")
                    .credentials(
                        Credential.builder()
                            .connectionName("external-service")
                            .values(
                                Credential.Values.builder()
                                    .putAdditionalProperty("api_key", JsonValue.from("sk-..."))
                                    .build()
                            )
                            .build()
                    )
                    .frequencyPenalty(0.0)
                    .addInclude("message.output_text.logprobs")
                    .input("What is the capital of France?")
                    .instructions("You are a helpful assistant.")
                    .maxOutputTokens(1000L)
                    .maxToolCalls(10L)
                    .mcpServers("dedalus-labs/example-server")
                    .metadata(
                        ResponseCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .model("openai/gpt-4o")
                    .parallelToolCalls(true)
                    .presencePenalty(0.0)
                    .previousResponseId("previous_response_id")
                    .prompt(
                        ResponseCreateParams.Prompt.builder()
                            .id("id")
                            .variables(
                                JsonObjectInput.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .version("version")
                            .build()
                    )
                    .promptCacheKey("prompt_cache_key")
                    .reasoning(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .safetyIdentifier("safety_identifier")
                    .serviceTier(ResponseCreateParams.ServiceTier.AUTO)
                    .store(true)
                    .stream(true)
                    .streamOptions(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .temperature(0.0)
                    .text(
                        JsonObjectInput.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .toolChoice("auto")
                    .addTool(
                        JsonObjectInput.builder()
                            .putAdditionalProperty(
                                "function",
                                JsonValue.from(
                                    mapOf(
                                        "description" to null,
                                        "name" to null,
                                        "parameters" to null,
                                    )
                                ),
                            )
                            .putAdditionalProperty("type", JsonValue.from("function"))
                            .build()
                    )
                    .topLogprobs(5L)
                    .topP(0.1)
                    .truncation(ResponseCreateParams.Truncation.AUTO)
                    .user("user")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ResponseCreateParams.builder()
                .responseCreateParams(ResponseCreateParams.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ResponseCreateParams.builder().build())
    }
}
