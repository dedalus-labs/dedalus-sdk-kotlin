// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.responses

import com.dedalus_sdk.api.core.BaseDeserializer
import com.dedalus_sdk.api.core.BaseSerializer
import com.dedalus_sdk.api.core.Enum
import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.allMaxBy
import com.dedalus_sdk.api.core.checkKnown
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.getOrThrow
import com.dedalus_sdk.api.core.toImmutable
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.dedalus_sdk.api.models.JsonObjectInput
import com.dedalus_sdk.api.models.McpToolResult
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects

/** Responses API response with Dedalus extensions. */
class Response
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<Double>,
    private val model: JsonField<String>,
    private val output: JsonField<List<JsonObjectInput>>,
    private val status: JsonField<Status>,
    private val background: JsonField<Boolean>,
    private val completedAt: JsonField<Double>,
    private val conversation: JsonField<JsonObjectInput>,
    private val error: JsonField<JsonObjectInput>,
    private val frequencyPenalty: JsonField<Double>,
    private val incompleteDetails: JsonField<IncompleteDetails>,
    private val instructions: JsonField<Instructions>,
    private val maxOutputTokens: JsonField<Long>,
    private val maxToolCalls: JsonField<Long>,
    private val mcpServerErrors: JsonField<McpServerErrors>,
    private val mcpToolResults: JsonField<List<McpToolResult>>,
    private val metadata: JsonField<Metadata>,
    private val object_: JsonField<Object>,
    private val outputText: JsonField<String>,
    private val parallelToolCalls: JsonField<Boolean>,
    private val presencePenalty: JsonField<Double>,
    private val previousResponseId: JsonField<String>,
    private val promptCacheKey: JsonField<String>,
    private val reasoning: JsonField<JsonObjectInput>,
    private val safetyIdentifier: JsonField<String>,
    private val serviceTier: JsonField<String>,
    private val store: JsonField<Boolean>,
    private val temperature: JsonField<Double>,
    private val text: JsonField<JsonObjectInput>,
    private val toolChoice: JsonField<ToolChoice>,
    private val tools: JsonField<List<JsonObjectInput>>,
    private val toolsExecuted: JsonField<List<String>>,
    private val topLogprobs: JsonField<Long>,
    private val topP: JsonField<Double>,
    private val truncation: JsonField<String>,
    private val usage: JsonField<JsonObjectInput>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("output")
        @ExcludeMissing
        output: JsonField<List<JsonObjectInput>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("background")
        @ExcludeMissing
        background: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("conversation")
        @ExcludeMissing
        conversation: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        frequencyPenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("incomplete_details")
        @ExcludeMissing
        incompleteDetails: JsonField<IncompleteDetails> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<Instructions> = JsonMissing.of(),
        @JsonProperty("max_output_tokens")
        @ExcludeMissing
        maxOutputTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_tool_calls")
        @ExcludeMissing
        maxToolCalls: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mcp_server_errors")
        @ExcludeMissing
        mcpServerErrors: JsonField<McpServerErrors> = JsonMissing.of(),
        @JsonProperty("mcp_tool_results")
        @ExcludeMissing
        mcpToolResults: JsonField<List<McpToolResult>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<Object> = JsonMissing.of(),
        @JsonProperty("output_text")
        @ExcludeMissing
        outputText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parallel_tool_calls")
        @ExcludeMissing
        parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        presencePenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("previous_response_id")
        @ExcludeMissing
        previousResponseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_cache_key")
        @ExcludeMissing
        promptCacheKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reasoning")
        @ExcludeMissing
        reasoning: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("safety_identifier")
        @ExcludeMissing
        safetyIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_tier")
        @ExcludeMissing
        serviceTier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("store") @ExcludeMissing store: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("tool_choice")
        @ExcludeMissing
        toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
        @JsonProperty("tools")
        @ExcludeMissing
        tools: JsonField<List<JsonObjectInput>> = JsonMissing.of(),
        @JsonProperty("tools_executed")
        @ExcludeMissing
        toolsExecuted: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("top_logprobs")
        @ExcludeMissing
        topLogprobs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("truncation")
        @ExcludeMissing
        truncation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<JsonObjectInput> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        model,
        output,
        status,
        background,
        completedAt,
        conversation,
        error,
        frequencyPenalty,
        incompleteDetails,
        instructions,
        maxOutputTokens,
        maxToolCalls,
        mcpServerErrors,
        mcpToolResults,
        metadata,
        object_,
        outputText,
        parallelToolCalls,
        presencePenalty,
        previousResponseId,
        promptCacheKey,
        reasoning,
        safetyIdentifier,
        serviceTier,
        store,
        temperature,
        text,
        toolChoice,
        tools,
        toolsExecuted,
        topLogprobs,
        topP,
        truncation,
        usage,
        mutableMapOf(),
    )

    /**
     * Unique identifier for this Response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Unix timestamp (in seconds) when this Response was created
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Double = createdAt.getRequired("created_at")

    /**
     * The model used for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * Array of content items generated by the model
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun output(): List<JsonObjectInput> = output.getRequired("output")

    /**
     * The status of the response generation
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Whether the request was run in the background
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun background(): Boolean? = background.getNullable("background")

    /**
     * Unix timestamp (in seconds) when the response was completed
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Double? = completedAt.getNullable("completed_at")

    /**
     * Conversation this response belongs to (requires BYOK)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversation(): JsonObjectInput? = conversation.getNullable("conversation")

    /**
     * Error details if status is 'failed'
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): JsonObjectInput? = error.getNullable("error")

    /**
     * Frequency penalty used for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyPenalty(): Double? = frequencyPenalty.getNullable("frequency_penalty")

    /**
     * Details about why the response is incomplete (e.g., max_output_tokens, content_filter)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun incompleteDetails(): IncompleteDetails? =
        incompleteDetails.getNullable("incomplete_details")

    /**
     * System/developer instructions used
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Instructions? = instructions.getNullable("instructions")

    /**
     * Maximum output tokens allowed for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxOutputTokens(): Long? = maxOutputTokens.getNullable("max_output_tokens")

    /**
     * Maximum tool calls allowed for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxToolCalls(): Long? = maxToolCalls.getNullable("max_tool_calls")

    /**
     * MCP server failures keyed by server name.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcpServerErrors(): McpServerErrors? = mcpServerErrors.getNullable("mcp_server_errors")

    /**
     * Results of MCP tool executions including inputs, outputs, and timing.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcpToolResults(): List<McpToolResult>? = mcpToolResults.getNullable("mcp_tool_results")

    /**
     * Key-value pairs attached to this response (requires BYOK)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * The object type, always 'response'
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun object_(): Object? = object_.getNullable("object")

    /**
     * Aggregated text output from all output_text items (SDK-only convenience property)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputText(): String? = outputText.getNullable("output_text")

    /**
     * Whether parallel tool calls were enabled
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parallelToolCalls(): Boolean? = parallelToolCalls.getNullable("parallel_tool_calls")

    /**
     * Presence penalty used for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presencePenalty(): Double? = presencePenalty.getNullable("presence_penalty")

    /**
     * Previous response ID referenced, if any
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousResponseId(): String? = previousResponseId.getNullable("previous_response_id")

    /**
     * Prompt cache key used for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCacheKey(): String? = promptCacheKey.getNullable("prompt_cache_key")

    /**
     * Reasoning configuration and outputs
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasoning(): JsonObjectInput? = reasoning.getNullable("reasoning")

    /**
     * Safety identifier used for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun safetyIdentifier(): String? = safetyIdentifier.getNullable("safety_identifier")

    /**
     * Service tier used for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceTier(): String? = serviceTier.getNullable("service_tier")

    /**
     * Whether the response was stored for later retrieval
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun store(): Boolean? = store.getNullable("store")

    /**
     * Temperature parameter used
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Double? = temperature.getNullable("temperature")

    /**
     * Text configuration used for this response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): JsonObjectInput? = text.getNullable("text")

    /**
     * Tool choice configuration used
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

    /**
     * Tools that were available to the model
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): List<JsonObjectInput>? = tools.getNullable("tools")

    /**
     * List of tool names that were executed server-side (e.g., MCP tools).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolsExecuted(): List<String>? = toolsExecuted.getNullable("tools_executed")

    /**
     * Number of logprob tokens returned per position
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topLogprobs(): Long? = topLogprobs.getNullable("top_logprobs")

    /**
     * Top-p parameter used
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Double? = topP.getNullable("top_p")

    /**
     * Truncation strategy applied when context exceeded limits
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun truncation(): String? = truncation.getNullable("truncation")

    /**
     * Token usage statistics for the response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usage(): JsonObjectInput? = usage.getNullable("usage")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Double> = createdAt

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [output].
     *
     * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<List<JsonObjectInput>> = output

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [background].
     *
     * Unlike [background], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("background") @ExcludeMissing fun _background(): JsonField<Boolean> = background

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<Double> = completedAt

    /**
     * Returns the raw JSON value of [conversation].
     *
     * Unlike [conversation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversation")
    @ExcludeMissing
    fun _conversation(): JsonField<JsonObjectInput> = conversation

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<JsonObjectInput> = error

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frequency_penalty")
    @ExcludeMissing
    fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

    /**
     * Returns the raw JSON value of [incompleteDetails].
     *
     * Unlike [incompleteDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("incomplete_details")
    @ExcludeMissing
    fun _incompleteDetails(): JsonField<IncompleteDetails> = incompleteDetails

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<Instructions> = instructions

    /**
     * Returns the raw JSON value of [maxOutputTokens].
     *
     * Unlike [maxOutputTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_output_tokens")
    @ExcludeMissing
    fun _maxOutputTokens(): JsonField<Long> = maxOutputTokens

    /**
     * Returns the raw JSON value of [maxToolCalls].
     *
     * Unlike [maxToolCalls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_tool_calls")
    @ExcludeMissing
    fun _maxToolCalls(): JsonField<Long> = maxToolCalls

    /**
     * Returns the raw JSON value of [mcpServerErrors].
     *
     * Unlike [mcpServerErrors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp_server_errors")
    @ExcludeMissing
    fun _mcpServerErrors(): JsonField<McpServerErrors> = mcpServerErrors

    /**
     * Returns the raw JSON value of [mcpToolResults].
     *
     * Unlike [mcpToolResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp_tool_results")
    @ExcludeMissing
    fun _mcpToolResults(): JsonField<List<McpToolResult>> = mcpToolResults

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<Object> = object_

    /**
     * Returns the raw JSON value of [outputText].
     *
     * Unlike [outputText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_text") @ExcludeMissing fun _outputText(): JsonField<String> = outputText

    /**
     * Returns the raw JSON value of [parallelToolCalls].
     *
     * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parallel_tool_calls")
    @ExcludeMissing
    fun _parallelToolCalls(): JsonField<Boolean> = parallelToolCalls

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("presence_penalty")
    @ExcludeMissing
    fun _presencePenalty(): JsonField<Double> = presencePenalty

    /**
     * Returns the raw JSON value of [previousResponseId].
     *
     * Unlike [previousResponseId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_response_id")
    @ExcludeMissing
    fun _previousResponseId(): JsonField<String> = previousResponseId

    /**
     * Returns the raw JSON value of [promptCacheKey].
     *
     * Unlike [promptCacheKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_cache_key")
    @ExcludeMissing
    fun _promptCacheKey(): JsonField<String> = promptCacheKey

    /**
     * Returns the raw JSON value of [reasoning].
     *
     * Unlike [reasoning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reasoning")
    @ExcludeMissing
    fun _reasoning(): JsonField<JsonObjectInput> = reasoning

    /**
     * Returns the raw JSON value of [safetyIdentifier].
     *
     * Unlike [safetyIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("safety_identifier")
    @ExcludeMissing
    fun _safetyIdentifier(): JsonField<String> = safetyIdentifier

    /**
     * Returns the raw JSON value of [serviceTier].
     *
     * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_tier")
    @ExcludeMissing
    fun _serviceTier(): JsonField<String> = serviceTier

    /**
     * Returns the raw JSON value of [store].
     *
     * Unlike [store], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("store") @ExcludeMissing fun _store(): JsonField<Boolean> = store

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<JsonObjectInput> = text

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_choice")
    @ExcludeMissing
    fun _toolChoice(): JsonField<ToolChoice> = toolChoice

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<JsonObjectInput>> = tools

    /**
     * Returns the raw JSON value of [toolsExecuted].
     *
     * Unlike [toolsExecuted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools_executed")
    @ExcludeMissing
    fun _toolsExecuted(): JsonField<List<String>> = toolsExecuted

    /**
     * Returns the raw JSON value of [topLogprobs].
     *
     * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_logprobs") @ExcludeMissing fun _topLogprobs(): JsonField<Long> = topLogprobs

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

    /**
     * Returns the raw JSON value of [truncation].
     *
     * Unlike [truncation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("truncation") @ExcludeMissing fun _truncation(): JsonField<String> = truncation

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<JsonObjectInput> = usage

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Response].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .model()
         * .output()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Response]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<Double>? = null
        private var model: JsonField<String>? = null
        private var output: JsonField<MutableList<JsonObjectInput>>? = null
        private var status: JsonField<Status>? = null
        private var background: JsonField<Boolean> = JsonMissing.of()
        private var completedAt: JsonField<Double> = JsonMissing.of()
        private var conversation: JsonField<JsonObjectInput> = JsonMissing.of()
        private var error: JsonField<JsonObjectInput> = JsonMissing.of()
        private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
        private var incompleteDetails: JsonField<IncompleteDetails> = JsonMissing.of()
        private var instructions: JsonField<Instructions> = JsonMissing.of()
        private var maxOutputTokens: JsonField<Long> = JsonMissing.of()
        private var maxToolCalls: JsonField<Long> = JsonMissing.of()
        private var mcpServerErrors: JsonField<McpServerErrors> = JsonMissing.of()
        private var mcpToolResults: JsonField<MutableList<McpToolResult>>? = null
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var object_: JsonField<Object> = JsonMissing.of()
        private var outputText: JsonField<String> = JsonMissing.of()
        private var parallelToolCalls: JsonField<Boolean> = JsonMissing.of()
        private var presencePenalty: JsonField<Double> = JsonMissing.of()
        private var previousResponseId: JsonField<String> = JsonMissing.of()
        private var promptCacheKey: JsonField<String> = JsonMissing.of()
        private var reasoning: JsonField<JsonObjectInput> = JsonMissing.of()
        private var safetyIdentifier: JsonField<String> = JsonMissing.of()
        private var serviceTier: JsonField<String> = JsonMissing.of()
        private var store: JsonField<Boolean> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var text: JsonField<JsonObjectInput> = JsonMissing.of()
        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
        private var tools: JsonField<MutableList<JsonObjectInput>>? = null
        private var toolsExecuted: JsonField<MutableList<String>>? = null
        private var topLogprobs: JsonField<Long> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var truncation: JsonField<String> = JsonMissing.of()
        private var usage: JsonField<JsonObjectInput> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(response: Response) = apply {
            id = response.id
            createdAt = response.createdAt
            model = response.model
            output = response.output.map { it.toMutableList() }
            status = response.status
            background = response.background
            completedAt = response.completedAt
            conversation = response.conversation
            error = response.error
            frequencyPenalty = response.frequencyPenalty
            incompleteDetails = response.incompleteDetails
            instructions = response.instructions
            maxOutputTokens = response.maxOutputTokens
            maxToolCalls = response.maxToolCalls
            mcpServerErrors = response.mcpServerErrors
            mcpToolResults = response.mcpToolResults.map { it.toMutableList() }
            metadata = response.metadata
            object_ = response.object_
            outputText = response.outputText
            parallelToolCalls = response.parallelToolCalls
            presencePenalty = response.presencePenalty
            previousResponseId = response.previousResponseId
            promptCacheKey = response.promptCacheKey
            reasoning = response.reasoning
            safetyIdentifier = response.safetyIdentifier
            serviceTier = response.serviceTier
            store = response.store
            temperature = response.temperature
            text = response.text
            toolChoice = response.toolChoice
            tools = response.tools.map { it.toMutableList() }
            toolsExecuted = response.toolsExecuted.map { it.toMutableList() }
            topLogprobs = response.topLogprobs
            topP = response.topP
            truncation = response.truncation
            usage = response.usage
            additionalProperties = response.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this Response */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unix timestamp (in seconds) when this Response was created */
        fun createdAt(createdAt: Double) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<Double>) = apply { this.createdAt = createdAt }

        /** The model used for this response */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** Array of content items generated by the model */
        fun output(output: List<JsonObjectInput>) = output(JsonField.of(output))

        /**
         * Sets [Builder.output] to an arbitrary JSON value.
         *
         * You should usually call [Builder.output] with a well-typed `List<JsonObjectInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun output(output: JsonField<List<JsonObjectInput>>) = apply {
            this.output = output.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonObjectInput] to [Builder.output].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutput(output: JsonObjectInput) = apply {
            this.output =
                (this.output ?: JsonField.of(mutableListOf())).also {
                    checkKnown("output", it).add(output)
                }
        }

        /** The status of the response generation */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Whether the request was run in the background */
        fun background(background: Boolean?) = background(JsonField.ofNullable(background))

        /**
         * Alias for [Builder.background].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun background(background: Boolean) = background(background as Boolean?)

        /**
         * Sets [Builder.background] to an arbitrary JSON value.
         *
         * You should usually call [Builder.background] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun background(background: JsonField<Boolean>) = apply { this.background = background }

        /** Unix timestamp (in seconds) when the response was completed */
        fun completedAt(completedAt: Double?) = completedAt(JsonField.ofNullable(completedAt))

        /**
         * Alias for [Builder.completedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun completedAt(completedAt: Double) = completedAt(completedAt as Double?)

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun completedAt(completedAt: JsonField<Double>) = apply { this.completedAt = completedAt }

        /** Conversation this response belongs to (requires BYOK) */
        fun conversation(conversation: JsonObjectInput?) =
            conversation(JsonField.ofNullable(conversation))

        /**
         * Sets [Builder.conversation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversation] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversation(conversation: JsonField<JsonObjectInput>) = apply {
            this.conversation = conversation
        }

        /** Error details if status is 'failed' */
        fun error(error: JsonObjectInput?) = error(JsonField.ofNullable(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun error(error: JsonField<JsonObjectInput>) = apply { this.error = error }

        /** Frequency penalty used for this response */
        fun frequencyPenalty(frequencyPenalty: Double?) =
            frequencyPenalty(JsonField.ofNullable(frequencyPenalty))

        /**
         * Alias for [Builder.frequencyPenalty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun frequencyPenalty(frequencyPenalty: Double) =
            frequencyPenalty(frequencyPenalty as Double?)

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            this.frequencyPenalty = frequencyPenalty
        }

        /**
         * Details about why the response is incomplete (e.g., max_output_tokens, content_filter)
         */
        fun incompleteDetails(incompleteDetails: IncompleteDetails?) =
            incompleteDetails(JsonField.ofNullable(incompleteDetails))

        /**
         * Sets [Builder.incompleteDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incompleteDetails] with a well-typed [IncompleteDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun incompleteDetails(incompleteDetails: JsonField<IncompleteDetails>) = apply {
            this.incompleteDetails = incompleteDetails
        }

        /** System/developer instructions used */
        fun instructions(instructions: Instructions?) =
            instructions(JsonField.ofNullable(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [Instructions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instructions(instructions: JsonField<Instructions>) = apply {
            this.instructions = instructions
        }

        /** Alias for calling [instructions] with `Instructions.ofString(string)`. */
        fun instructions(string: String) = instructions(Instructions.ofString(string))

        /**
         * Alias for calling [instructions] with
         * `Instructions.ofJsonObjectInputs(jsonObjectInputs)`.
         */
        fun instructionsOfJsonObjectInputs(jsonObjectInputs: List<JsonObjectInput>) =
            instructions(Instructions.ofJsonObjectInputs(jsonObjectInputs))

        /** Maximum output tokens allowed for this response */
        fun maxOutputTokens(maxOutputTokens: Long?) =
            maxOutputTokens(JsonField.ofNullable(maxOutputTokens))

        /**
         * Alias for [Builder.maxOutputTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxOutputTokens(maxOutputTokens: Long) = maxOutputTokens(maxOutputTokens as Long?)

        /**
         * Sets [Builder.maxOutputTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxOutputTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxOutputTokens(maxOutputTokens: JsonField<Long>) = apply {
            this.maxOutputTokens = maxOutputTokens
        }

        /** Maximum tool calls allowed for this response */
        fun maxToolCalls(maxToolCalls: Long?) = maxToolCalls(JsonField.ofNullable(maxToolCalls))

        /**
         * Alias for [Builder.maxToolCalls].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxToolCalls(maxToolCalls: Long) = maxToolCalls(maxToolCalls as Long?)

        /**
         * Sets [Builder.maxToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxToolCalls] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxToolCalls(maxToolCalls: JsonField<Long>) = apply { this.maxToolCalls = maxToolCalls }

        /** MCP server failures keyed by server name. */
        fun mcpServerErrors(mcpServerErrors: McpServerErrors?) =
            mcpServerErrors(JsonField.ofNullable(mcpServerErrors))

        /**
         * Sets [Builder.mcpServerErrors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpServerErrors] with a well-typed [McpServerErrors]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mcpServerErrors(mcpServerErrors: JsonField<McpServerErrors>) = apply {
            this.mcpServerErrors = mcpServerErrors
        }

        /** Results of MCP tool executions including inputs, outputs, and timing. */
        fun mcpToolResults(mcpToolResults: List<McpToolResult>?) =
            mcpToolResults(JsonField.ofNullable(mcpToolResults))

        /**
         * Sets [Builder.mcpToolResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpToolResults] with a well-typed `List<McpToolResult>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mcpToolResults(mcpToolResults: JsonField<List<McpToolResult>>) = apply {
            this.mcpToolResults = mcpToolResults.map { it.toMutableList() }
        }

        /**
         * Adds a single [McpToolResult] to [mcpToolResults].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMcpToolResult(mcpToolResult: McpToolResult) = apply {
            mcpToolResults =
                (mcpToolResults ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mcpToolResults", it).add(mcpToolResult)
                }
        }

        /** Key-value pairs attached to this response (requires BYOK) */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The object type, always 'response' */
        fun object_(object_: Object) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [Object] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<Object>) = apply { this.object_ = object_ }

        /** Aggregated text output from all output_text items (SDK-only convenience property) */
        fun outputText(outputText: String?) = outputText(JsonField.ofNullable(outputText))

        /**
         * Sets [Builder.outputText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outputText(outputText: JsonField<String>) = apply { this.outputText = outputText }

        /** Whether parallel tool calls were enabled */
        fun parallelToolCalls(parallelToolCalls: Boolean?) =
            parallelToolCalls(JsonField.ofNullable(parallelToolCalls))

        /**
         * Alias for [Builder.parallelToolCalls].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun parallelToolCalls(parallelToolCalls: Boolean) =
            parallelToolCalls(parallelToolCalls as Boolean?)

        /**
         * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            this.parallelToolCalls = parallelToolCalls
        }

        /** Presence penalty used for this response */
        fun presencePenalty(presencePenalty: Double?) =
            presencePenalty(JsonField.ofNullable(presencePenalty))

        /**
         * Alias for [Builder.presencePenalty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun presencePenalty(presencePenalty: Double) = presencePenalty(presencePenalty as Double?)

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            this.presencePenalty = presencePenalty
        }

        /** Previous response ID referenced, if any */
        fun previousResponseId(previousResponseId: String?) =
            previousResponseId(JsonField.ofNullable(previousResponseId))

        /**
         * Sets [Builder.previousResponseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousResponseId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousResponseId(previousResponseId: JsonField<String>) = apply {
            this.previousResponseId = previousResponseId
        }

        /** Prompt cache key used for this response */
        fun promptCacheKey(promptCacheKey: String?) =
            promptCacheKey(JsonField.ofNullable(promptCacheKey))

        /**
         * Sets [Builder.promptCacheKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCacheKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promptCacheKey(promptCacheKey: JsonField<String>) = apply {
            this.promptCacheKey = promptCacheKey
        }

        /** Reasoning configuration and outputs */
        fun reasoning(reasoning: JsonObjectInput?) = reasoning(JsonField.ofNullable(reasoning))

        /**
         * Sets [Builder.reasoning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasoning] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reasoning(reasoning: JsonField<JsonObjectInput>) = apply { this.reasoning = reasoning }

        /** Safety identifier used for this response */
        fun safetyIdentifier(safetyIdentifier: String?) =
            safetyIdentifier(JsonField.ofNullable(safetyIdentifier))

        /**
         * Sets [Builder.safetyIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.safetyIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun safetyIdentifier(safetyIdentifier: JsonField<String>) = apply {
            this.safetyIdentifier = safetyIdentifier
        }

        /** Service tier used for this response */
        fun serviceTier(serviceTier: String?) = serviceTier(JsonField.ofNullable(serviceTier))

        /**
         * Sets [Builder.serviceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceTier(serviceTier: JsonField<String>) = apply { this.serviceTier = serviceTier }

        /** Whether the response was stored for later retrieval */
        fun store(store: Boolean?) = store(JsonField.ofNullable(store))

        /**
         * Alias for [Builder.store].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun store(store: Boolean) = store(store as Boolean?)

        /**
         * Sets [Builder.store] to an arbitrary JSON value.
         *
         * You should usually call [Builder.store] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun store(store: JsonField<Boolean>) = apply { this.store = store }

        /** Temperature parameter used */
        fun temperature(temperature: Double?) = temperature(JsonField.ofNullable(temperature))

        /**
         * Alias for [Builder.temperature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun temperature(temperature: Double) = temperature(temperature as Double?)

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        /** Text configuration used for this response */
        fun text(text: JsonObjectInput?) = text(JsonField.ofNullable(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [JsonObjectInput] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun text(text: JsonField<JsonObjectInput>) = apply { this.text = text }

        /** Tool choice configuration used */
        fun toolChoice(toolChoice: ToolChoice?) = toolChoice(JsonField.ofNullable(toolChoice))

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { this.toolChoice = toolChoice }

        /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
        fun toolChoice(string: String) = toolChoice(ToolChoice.ofString(string))

        /** Alias for calling [toolChoice] with `ToolChoice.ofJsonObjectInput(jsonObjectInput)`. */
        fun toolChoice(jsonObjectInput: JsonObjectInput) =
            toolChoice(ToolChoice.ofJsonObjectInput(jsonObjectInput))

        /** Tools that were available to the model */
        fun tools(tools: List<JsonObjectInput>?) = tools(JsonField.ofNullable(tools))

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<JsonObjectInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tools(tools: JsonField<List<JsonObjectInput>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonObjectInput] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: JsonObjectInput) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
        }

        /** List of tool names that were executed server-side (e.g., MCP tools). */
        fun toolsExecuted(toolsExecuted: List<String>?) =
            toolsExecuted(JsonField.ofNullable(toolsExecuted))

        /**
         * Sets [Builder.toolsExecuted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolsExecuted] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolsExecuted(toolsExecuted: JsonField<List<String>>) = apply {
            this.toolsExecuted = toolsExecuted.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.toolsExecuted].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolsExecuted(toolsExecuted: String) = apply {
            this.toolsExecuted =
                (this.toolsExecuted ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolsExecuted", it).add(toolsExecuted)
                }
        }

        /** Number of logprob tokens returned per position */
        fun topLogprobs(topLogprobs: Long?) = topLogprobs(JsonField.ofNullable(topLogprobs))

        /**
         * Alias for [Builder.topLogprobs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topLogprobs(topLogprobs: Long) = topLogprobs(topLogprobs as Long?)

        /**
         * Sets [Builder.topLogprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLogprobs(topLogprobs: JsonField<Long>) = apply { this.topLogprobs = topLogprobs }

        /** Top-p parameter used */
        fun topP(topP: Double?) = topP(JsonField.ofNullable(topP))

        /**
         * Alias for [Builder.topP].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topP(topP: Double) = topP(topP as Double?)

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

        /** Truncation strategy applied when context exceeded limits */
        fun truncation(truncation: String?) = truncation(JsonField.ofNullable(truncation))

        /**
         * Sets [Builder.truncation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truncation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun truncation(truncation: JsonField<String>) = apply { this.truncation = truncation }

        /** Token usage statistics for the response */
        fun usage(usage: JsonObjectInput?) = usage(JsonField.ofNullable(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usage(usage: JsonField<JsonObjectInput>) = apply { this.usage = usage }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Response].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .model()
         * .output()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Response =
            Response(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("model", model),
                checkRequired("output", output).map { it.toImmutable() },
                checkRequired("status", status),
                background,
                completedAt,
                conversation,
                error,
                frequencyPenalty,
                incompleteDetails,
                instructions,
                maxOutputTokens,
                maxToolCalls,
                mcpServerErrors,
                (mcpToolResults ?: JsonMissing.of()).map { it.toImmutable() },
                metadata,
                object_,
                outputText,
                parallelToolCalls,
                presencePenalty,
                previousResponseId,
                promptCacheKey,
                reasoning,
                safetyIdentifier,
                serviceTier,
                store,
                temperature,
                text,
                toolChoice,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                (toolsExecuted ?: JsonMissing.of()).map { it.toImmutable() },
                topLogprobs,
                topP,
                truncation,
                usage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DedalusInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Response = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        model()
        output().forEach { it.validate() }
        status().validate()
        background()
        completedAt()
        conversation()?.validate()
        error()?.validate()
        frequencyPenalty()
        incompleteDetails()?.validate()
        instructions()?.validate()
        maxOutputTokens()
        maxToolCalls()
        mcpServerErrors()?.validate()
        mcpToolResults()?.forEach { it.validate() }
        metadata()?.validate()
        object_()?.validate()
        outputText()
        parallelToolCalls()
        presencePenalty()
        previousResponseId()
        promptCacheKey()
        reasoning()?.validate()
        safetyIdentifier()
        serviceTier()
        store()
        temperature()
        text()?.validate()
        toolChoice()?.validate()
        tools()?.forEach { it.validate() }
        toolsExecuted()
        topLogprobs()
        topP()
        truncation()
        usage()?.validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: DedalusInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (model.asKnown() == null) 0 else 1) +
            (output.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (background.asKnown() == null) 0 else 1) +
            (if (completedAt.asKnown() == null) 0 else 1) +
            (conversation.asKnown()?.validity() ?: 0) +
            (error.asKnown()?.validity() ?: 0) +
            (if (frequencyPenalty.asKnown() == null) 0 else 1) +
            (incompleteDetails.asKnown()?.validity() ?: 0) +
            (instructions.asKnown()?.validity() ?: 0) +
            (if (maxOutputTokens.asKnown() == null) 0 else 1) +
            (if (maxToolCalls.asKnown() == null) 0 else 1) +
            (mcpServerErrors.asKnown()?.validity() ?: 0) +
            (mcpToolResults.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (object_.asKnown()?.validity() ?: 0) +
            (if (outputText.asKnown() == null) 0 else 1) +
            (if (parallelToolCalls.asKnown() == null) 0 else 1) +
            (if (presencePenalty.asKnown() == null) 0 else 1) +
            (if (previousResponseId.asKnown() == null) 0 else 1) +
            (if (promptCacheKey.asKnown() == null) 0 else 1) +
            (reasoning.asKnown()?.validity() ?: 0) +
            (if (safetyIdentifier.asKnown() == null) 0 else 1) +
            (if (serviceTier.asKnown() == null) 0 else 1) +
            (if (store.asKnown() == null) 0 else 1) +
            (if (temperature.asKnown() == null) 0 else 1) +
            (text.asKnown()?.validity() ?: 0) +
            (toolChoice.asKnown()?.validity() ?: 0) +
            (tools.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (toolsExecuted.asKnown()?.size ?: 0) +
            (if (topLogprobs.asKnown() == null) 0 else 1) +
            (if (topP.asKnown() == null) 0 else 1) +
            (if (truncation.asKnown() == null) 0 else 1) +
            (usage.asKnown()?.validity() ?: 0)

    /** The status of the response generation */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val COMPLETED = of("completed")

            val FAILED = of("failed")

            val IN_PROGRESS = of("in_progress")

            val CANCELLED = of("cancelled")

            val QUEUED = of("queued")

            val INCOMPLETE = of("incomplete")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED,
            FAILED,
            IN_PROGRESS,
            CANCELLED,
            QUEUED,
            INCOMPLETE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMPLETED,
            FAILED,
            IN_PROGRESS,
            CANCELLED,
            QUEUED,
            INCOMPLETE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                IN_PROGRESS -> Value.IN_PROGRESS
                CANCELLED -> Value.CANCELLED
                QUEUED -> Value.QUEUED
                INCOMPLETE -> Value.INCOMPLETE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                IN_PROGRESS -> Known.IN_PROGRESS
                CANCELLED -> Known.CANCELLED
                QUEUED -> Known.QUEUED
                INCOMPLETE -> Known.INCOMPLETE
                else -> throw DedalusInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Details about why the response is incomplete (e.g., max_output_tokens, content_filter) */
    class IncompleteDetails
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [IncompleteDetails]. */
            fun builder() = Builder()
        }

        /** A builder for [IncompleteDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(incompleteDetails: IncompleteDetails) = apply {
                additionalProperties = incompleteDetails.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [IncompleteDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IncompleteDetails = IncompleteDetails(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): IncompleteDetails = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IncompleteDetails && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "IncompleteDetails{additionalProperties=$additionalProperties}"
    }

    /** System/developer instructions used */
    @JsonDeserialize(using = Instructions.Deserializer::class)
    @JsonSerialize(using = Instructions.Serializer::class)
    class Instructions
    private constructor(
        private val string: String? = null,
        private val jsonObjectInputs: List<JsonObjectInput>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun jsonObjectInputs(): List<JsonObjectInput>? = jsonObjectInputs

        fun isString(): Boolean = string != null

        fun isJsonObjectInputs(): Boolean = jsonObjectInputs != null

        fun asString(): String = string.getOrThrow("string")

        fun asJsonObjectInputs(): List<JsonObjectInput> =
            jsonObjectInputs.getOrThrow("jsonObjectInputs")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.dedalus_sdk.api.core.JsonValue
         *
         * val result: String? = instructions.accept(object : Instructions.Visitor<String?> {
         *     override fun visitString(string: String): String? = string.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws DedalusInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                jsonObjectInputs != null -> visitor.visitJsonObjectInputs(jsonObjectInputs)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Instructions = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitJsonObjectInputs(jsonObjectInputs: List<JsonObjectInput>) {
                        jsonObjectInputs.forEach { it.validate() }
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitJsonObjectInputs(jsonObjectInputs: List<JsonObjectInput>) =
                        jsonObjectInputs.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Instructions &&
                string == other.string &&
                jsonObjectInputs == other.jsonObjectInputs
        }

        override fun hashCode(): Int = Objects.hash(string, jsonObjectInputs)

        override fun toString(): String =
            when {
                string != null -> "Instructions{string=$string}"
                jsonObjectInputs != null -> "Instructions{jsonObjectInputs=$jsonObjectInputs}"
                _json != null -> "Instructions{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Instructions")
            }

        companion object {

            fun ofString(string: String) = Instructions(string = string)

            fun ofJsonObjectInputs(jsonObjectInputs: List<JsonObjectInput>) =
                Instructions(jsonObjectInputs = jsonObjectInputs.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [Instructions] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitJsonObjectInputs(jsonObjectInputs: List<JsonObjectInput>): T

            /**
             * Maps an unknown variant of [Instructions] to a value of type [T].
             *
             * An instance of [Instructions] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Instructions: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Instructions>(Instructions::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Instructions {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Instructions(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<JsonObjectInput>>())?.let {
                                Instructions(jsonObjectInputs = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Instructions(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Instructions>(Instructions::class) {

            override fun serialize(
                value: Instructions,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonObjectInputs != null -> generator.writeObject(value.jsonObjectInputs)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Instructions")
                }
            }
        }
    }

    /** MCP server failures keyed by server name. */
    class McpServerErrors
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [McpServerErrors]. */
            fun builder() = Builder()
        }

        /** A builder for [McpServerErrors]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(mcpServerErrors: McpServerErrors) = apply {
                additionalProperties = mcpServerErrors.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [McpServerErrors].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): McpServerErrors = McpServerErrors(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): McpServerErrors = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is McpServerErrors && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "McpServerErrors{additionalProperties=$additionalProperties}"
    }

    /** Key-value pairs attached to this response (requires BYOK) */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** The object type, always 'response' */
    class Object @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val RESPONSE = of("response")

            fun of(value: String) = Object(JsonField.of(value))
        }

        /** An enum containing [Object]'s known values. */
        enum class Known {
            RESPONSE
        }

        /**
         * An enum containing [Object]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Object] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RESPONSE,
            /** An enum member indicating that [Object] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                RESPONSE -> Value.RESPONSE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                RESPONSE -> Known.RESPONSE
                else -> throw DedalusInvalidDataException("Unknown Object: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Object = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Object && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Tool choice configuration used */
    @JsonDeserialize(using = ToolChoice.Deserializer::class)
    @JsonSerialize(using = ToolChoice.Serializer::class)
    class ToolChoice
    private constructor(
        private val string: String? = null,
        private val jsonObjectInput: JsonObjectInput? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun jsonObjectInput(): JsonObjectInput? = jsonObjectInput

        fun isString(): Boolean = string != null

        fun isJsonObjectInput(): Boolean = jsonObjectInput != null

        fun asString(): String = string.getOrThrow("string")

        fun asJsonObjectInput(): JsonObjectInput = jsonObjectInput.getOrThrow("jsonObjectInput")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.dedalus_sdk.api.core.JsonValue
         *
         * val result: String? = toolChoice.accept(object : ToolChoice.Visitor<String?> {
         *     override fun visitString(string: String): String? = string.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws DedalusInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                jsonObjectInput != null -> visitor.visitJsonObjectInput(jsonObjectInput)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ToolChoice = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitJsonObjectInput(jsonObjectInput: JsonObjectInput) {
                        jsonObjectInput.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitJsonObjectInput(jsonObjectInput: JsonObjectInput) =
                        jsonObjectInput.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolChoice &&
                string == other.string &&
                jsonObjectInput == other.jsonObjectInput
        }

        override fun hashCode(): Int = Objects.hash(string, jsonObjectInput)

        override fun toString(): String =
            when {
                string != null -> "ToolChoice{string=$string}"
                jsonObjectInput != null -> "ToolChoice{jsonObjectInput=$jsonObjectInput}"
                _json != null -> "ToolChoice{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolChoice")
            }

        companion object {

            fun ofString(string: String) = ToolChoice(string = string)

            fun ofJsonObjectInput(jsonObjectInput: JsonObjectInput) =
                ToolChoice(jsonObjectInput = jsonObjectInput)
        }

        /**
         * An interface that defines how to map each variant of [ToolChoice] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitJsonObjectInput(jsonObjectInput: JsonObjectInput): T

            /**
             * Maps an unknown variant of [ToolChoice] to a value of type [T].
             *
             * An instance of [ToolChoice] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown ToolChoice: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<JsonObjectInput>())?.let {
                                ToolChoice(jsonObjectInput = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                ToolChoice(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ToolChoice(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

            override fun serialize(
                value: ToolChoice,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonObjectInput != null -> generator.writeObject(value.jsonObjectInput)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolChoice")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Response &&
            id == other.id &&
            createdAt == other.createdAt &&
            model == other.model &&
            output == other.output &&
            status == other.status &&
            background == other.background &&
            completedAt == other.completedAt &&
            conversation == other.conversation &&
            error == other.error &&
            frequencyPenalty == other.frequencyPenalty &&
            incompleteDetails == other.incompleteDetails &&
            instructions == other.instructions &&
            maxOutputTokens == other.maxOutputTokens &&
            maxToolCalls == other.maxToolCalls &&
            mcpServerErrors == other.mcpServerErrors &&
            mcpToolResults == other.mcpToolResults &&
            metadata == other.metadata &&
            object_ == other.object_ &&
            outputText == other.outputText &&
            parallelToolCalls == other.parallelToolCalls &&
            presencePenalty == other.presencePenalty &&
            previousResponseId == other.previousResponseId &&
            promptCacheKey == other.promptCacheKey &&
            reasoning == other.reasoning &&
            safetyIdentifier == other.safetyIdentifier &&
            serviceTier == other.serviceTier &&
            store == other.store &&
            temperature == other.temperature &&
            text == other.text &&
            toolChoice == other.toolChoice &&
            tools == other.tools &&
            toolsExecuted == other.toolsExecuted &&
            topLogprobs == other.topLogprobs &&
            topP == other.topP &&
            truncation == other.truncation &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            model,
            output,
            status,
            background,
            completedAt,
            conversation,
            error,
            frequencyPenalty,
            incompleteDetails,
            instructions,
            maxOutputTokens,
            maxToolCalls,
            mcpServerErrors,
            mcpToolResults,
            metadata,
            object_,
            outputText,
            parallelToolCalls,
            presencePenalty,
            previousResponseId,
            promptCacheKey,
            reasoning,
            safetyIdentifier,
            serviceTier,
            store,
            temperature,
            text,
            toolChoice,
            tools,
            toolsExecuted,
            topLogprobs,
            topP,
            truncation,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Response{id=$id, createdAt=$createdAt, model=$model, output=$output, status=$status, background=$background, completedAt=$completedAt, conversation=$conversation, error=$error, frequencyPenalty=$frequencyPenalty, incompleteDetails=$incompleteDetails, instructions=$instructions, maxOutputTokens=$maxOutputTokens, maxToolCalls=$maxToolCalls, mcpServerErrors=$mcpServerErrors, mcpToolResults=$mcpToolResults, metadata=$metadata, object_=$object_, outputText=$outputText, parallelToolCalls=$parallelToolCalls, presencePenalty=$presencePenalty, previousResponseId=$previousResponseId, promptCacheKey=$promptCacheKey, reasoning=$reasoning, safetyIdentifier=$safetyIdentifier, serviceTier=$serviceTier, store=$store, temperature=$temperature, text=$text, toolChoice=$toolChoice, tools=$tools, toolsExecuted=$toolsExecuted, topLogprobs=$topLogprobs, topP=$topP, truncation=$truncation, usage=$usage, additionalProperties=$additionalProperties}"
}
