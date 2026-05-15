// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.Enum
import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.checkKnown
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.toImmutable
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.dedalus_sdk.api.models.JsonObjectInput
import com.dedalus_sdk.api.models.McpToolResult
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Chat completion response for Dedalus API.
 *
 * OpenAI-compatible chat completion response with Dedalus extensions. Maintains full compatibility
 * with OpenAI API while providing additional features like server-side tool execution tracking and
 * MCP error reporting.
 */
class ChatCompletion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val choices: JsonField<List<Choice>>,
    private val created: JsonField<Long>,
    private val model: JsonField<String>,
    private val object_: JsonValue,
    private val correlationId: JsonField<String>,
    private val deferred: JsonField<List<DeferredCallResponse>>,
    private val mcpServerErrors: JsonField<McpServerErrors>,
    private val mcpToolResults: JsonField<List<McpToolResult>>,
    private val pendingTools: JsonField<List<PendingTool>>,
    private val serverResults: JsonField<ServerResults>,
    private val serviceTier: JsonField<ServiceTier>,
    private val systemFingerprint: JsonField<String>,
    private val toolsExecuted: JsonField<List<String>>,
    private val turnsConsumed: JsonField<Long>,
    private val usage: JsonField<CompletionUsage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("choices")
        @ExcludeMissing
        choices: JsonField<List<Choice>> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonValue = JsonMissing.of(),
        @JsonProperty("correlation_id")
        @ExcludeMissing
        correlationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deferred")
        @ExcludeMissing
        deferred: JsonField<List<DeferredCallResponse>> = JsonMissing.of(),
        @JsonProperty("mcp_server_errors")
        @ExcludeMissing
        mcpServerErrors: JsonField<McpServerErrors> = JsonMissing.of(),
        @JsonProperty("mcp_tool_results")
        @ExcludeMissing
        mcpToolResults: JsonField<List<McpToolResult>> = JsonMissing.of(),
        @JsonProperty("pending_tools")
        @ExcludeMissing
        pendingTools: JsonField<List<PendingTool>> = JsonMissing.of(),
        @JsonProperty("server_results")
        @ExcludeMissing
        serverResults: JsonField<ServerResults> = JsonMissing.of(),
        @JsonProperty("service_tier")
        @ExcludeMissing
        serviceTier: JsonField<ServiceTier> = JsonMissing.of(),
        @JsonProperty("system_fingerprint")
        @ExcludeMissing
        systemFingerprint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tools_executed")
        @ExcludeMissing
        toolsExecuted: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("turns_consumed")
        @ExcludeMissing
        turnsConsumed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<CompletionUsage> = JsonMissing.of(),
    ) : this(
        id,
        choices,
        created,
        model,
        object_,
        correlationId,
        deferred,
        mcpServerErrors,
        mcpToolResults,
        pendingTools,
        serverResults,
        serviceTier,
        systemFingerprint,
        toolsExecuted,
        turnsConsumed,
        usage,
        mutableMapOf(),
    )

    /**
     * A unique identifier for the chat completion.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A list of chat completion choices. Can be more than one if `n` is greater than 1.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun choices(): List<Choice> = choices.getRequired("choices")

    /**
     * The Unix timestamp (in seconds) of when the chat completion was created.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): Long = created.getRequired("created")

    /**
     * The model used for the chat completion.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * The object type, which is always `chat.completion`.
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("chat.completion")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonValue = object_

    /**
     * Stable session ID for cross-turn handoff state. Echo this on the next request to resume
     * server-side execution.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correlationId(): String? = correlationId.getNullable("correlation_id")

    /**
     * Server tools blocked on client results.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deferred(): List<DeferredCallResponse>? = deferred.getNullable("deferred")

    /**
     * MCP server failures keyed by server name.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcpServerErrors(): McpServerErrors? = mcpServerErrors.getNullable("mcp_server_errors")

    /**
     * Detailed results of MCP tool executions including inputs, outputs, and timing. Provides full
     * visibility into server-side tool execution for debugging and audit purposes.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcpToolResults(): List<McpToolResult>? = mcpToolResults.getNullable("mcp_tool_results")

    /**
     * Client tools to execute, with dependency ordering.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingTools(): List<PendingTool>? = pendingTools.getNullable("pending_tools")

    /**
     * Completed server tool outputs keyed by call ID.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serverResults(): ServerResults? = serverResults.getNullable("server_results")

    /**
     * Specifies the processing type used for serving the request.
     * - If set to 'auto', then the request will be processed with the service tier configured in
     *   the Project settings. Unless otherwise configured, the Project will use 'default'.
     * - If set to 'default', then the request will be processed with the standard pricing and
     *   performance for the selected model.
     * - If set to '[flex](/docs/guides/flex-processing)' or
     *   '[priority](https://openai.com/api-priority-processing/)', then the request will be
     *   processed with the corresponding service tier.
     * - When not set, the default behavior is 'auto'.
     *
     *   When the `service_tier` parameter is set, the response body will include the `service_tier`
     *   value based on the processing mode actually used to serve the request. This response value
     *   may be different from the value set in the parameter.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceTier(): ServiceTier? = serviceTier.getNullable("service_tier")

    /**
     * This fingerprint represents the backend configuration that the model runs with.
     *
     * Can be used in conjunction with the `seed` request parameter to understand when backend
     * changes have been made that might impact determinism.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemFingerprint(): String? = systemFingerprint.getNullable("system_fingerprint")

    /**
     * List of tool names that were executed server-side (e.g., MCP tools). Only present when tools
     * were executed on the server rather than returned for client-side execution.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolsExecuted(): List<String>? = toolsExecuted.getNullable("tools_executed")

    /**
     * Number of internal LLM calls made during this request. SDKs can sum this across their outer
     * loop to track total LLM calls.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun turnsConsumed(): Long? = turnsConsumed.getNullable("turns_consumed")

    /**
     * Usage statistics for the completion request.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usage(): CompletionUsage? = usage.getNullable("usage")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [choices].
     *
     * Unlike [choices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("choices") @ExcludeMissing fun _choices(): JsonField<List<Choice>> = choices

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [correlationId].
     *
     * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("correlation_id")
    @ExcludeMissing
    fun _correlationId(): JsonField<String> = correlationId

    /**
     * Returns the raw JSON value of [deferred].
     *
     * Unlike [deferred], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deferred")
    @ExcludeMissing
    fun _deferred(): JsonField<List<DeferredCallResponse>> = deferred

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
     * Returns the raw JSON value of [pendingTools].
     *
     * Unlike [pendingTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending_tools")
    @ExcludeMissing
    fun _pendingTools(): JsonField<List<PendingTool>> = pendingTools

    /**
     * Returns the raw JSON value of [serverResults].
     *
     * Unlike [serverResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("server_results")
    @ExcludeMissing
    fun _serverResults(): JsonField<ServerResults> = serverResults

    /**
     * Returns the raw JSON value of [serviceTier].
     *
     * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_tier")
    @ExcludeMissing
    fun _serviceTier(): JsonField<ServiceTier> = serviceTier

    /**
     * Returns the raw JSON value of [systemFingerprint].
     *
     * Unlike [systemFingerprint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("system_fingerprint")
    @ExcludeMissing
    fun _systemFingerprint(): JsonField<String> = systemFingerprint

    /**
     * Returns the raw JSON value of [toolsExecuted].
     *
     * Unlike [toolsExecuted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools_executed")
    @ExcludeMissing
    fun _toolsExecuted(): JsonField<List<String>> = toolsExecuted

    /**
     * Returns the raw JSON value of [turnsConsumed].
     *
     * Unlike [turnsConsumed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("turns_consumed")
    @ExcludeMissing
    fun _turnsConsumed(): JsonField<Long> = turnsConsumed

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<CompletionUsage> = usage

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
         * Returns a mutable builder for constructing an instance of [ChatCompletion].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .choices()
         * .created()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletion]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var choices: JsonField<MutableList<Choice>>? = null
        private var created: JsonField<Long>? = null
        private var model: JsonField<String>? = null
        private var object_: JsonValue = JsonValue.from("chat.completion")
        private var correlationId: JsonField<String> = JsonMissing.of()
        private var deferred: JsonField<MutableList<DeferredCallResponse>>? = null
        private var mcpServerErrors: JsonField<McpServerErrors> = JsonMissing.of()
        private var mcpToolResults: JsonField<MutableList<McpToolResult>>? = null
        private var pendingTools: JsonField<MutableList<PendingTool>>? = null
        private var serverResults: JsonField<ServerResults> = JsonMissing.of()
        private var serviceTier: JsonField<ServiceTier> = JsonMissing.of()
        private var systemFingerprint: JsonField<String> = JsonMissing.of()
        private var toolsExecuted: JsonField<MutableList<String>>? = null
        private var turnsConsumed: JsonField<Long> = JsonMissing.of()
        private var usage: JsonField<CompletionUsage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletion: ChatCompletion) = apply {
            id = chatCompletion.id
            choices = chatCompletion.choices.map { it.toMutableList() }
            created = chatCompletion.created
            model = chatCompletion.model
            object_ = chatCompletion.object_
            correlationId = chatCompletion.correlationId
            deferred = chatCompletion.deferred.map { it.toMutableList() }
            mcpServerErrors = chatCompletion.mcpServerErrors
            mcpToolResults = chatCompletion.mcpToolResults.map { it.toMutableList() }
            pendingTools = chatCompletion.pendingTools.map { it.toMutableList() }
            serverResults = chatCompletion.serverResults
            serviceTier = chatCompletion.serviceTier
            systemFingerprint = chatCompletion.systemFingerprint
            toolsExecuted = chatCompletion.toolsExecuted.map { it.toMutableList() }
            turnsConsumed = chatCompletion.turnsConsumed
            usage = chatCompletion.usage
            additionalProperties = chatCompletion.additionalProperties.toMutableMap()
        }

        /** A unique identifier for the chat completion. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** A list of chat completion choices. Can be more than one if `n` is greater than 1. */
        fun choices(choices: List<Choice>) = choices(JsonField.of(choices))

        /**
         * Sets [Builder.choices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.choices] with a well-typed `List<Choice>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun choices(choices: JsonField<List<Choice>>) = apply {
            this.choices = choices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Choice] to [choices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChoice(choice: Choice) = apply {
            choices =
                (choices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("choices", it).add(choice)
                }
        }

        /** The Unix timestamp (in seconds) of when the chat completion was created. */
        fun created(created: Long) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<Long>) = apply { this.created = created }

        /** The model used for the chat completion. */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("chat.completion")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun object_(object_: JsonValue) = apply { this.object_ = object_ }

        /**
         * Stable session ID for cross-turn handoff state. Echo this on the next request to resume
         * server-side execution.
         */
        fun correlationId(correlationId: String?) =
            correlationId(JsonField.ofNullable(correlationId))

        /**
         * Sets [Builder.correlationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correlationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correlationId(correlationId: JsonField<String>) = apply {
            this.correlationId = correlationId
        }

        /** Server tools blocked on client results. */
        fun deferred(deferred: List<DeferredCallResponse>?) =
            deferred(JsonField.ofNullable(deferred))

        /**
         * Sets [Builder.deferred] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deferred] with a well-typed `List<DeferredCallResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deferred(deferred: JsonField<List<DeferredCallResponse>>) = apply {
            this.deferred = deferred.map { it.toMutableList() }
        }

        /**
         * Adds a single [DeferredCallResponse] to [Builder.deferred].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeferred(deferred: DeferredCallResponse) = apply {
            this.deferred =
                (this.deferred ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deferred", it).add(deferred)
                }
        }

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

        /**
         * Detailed results of MCP tool executions including inputs, outputs, and timing. Provides
         * full visibility into server-side tool execution for debugging and audit purposes.
         */
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

        /** Client tools to execute, with dependency ordering. */
        fun pendingTools(pendingTools: List<PendingTool>?) =
            pendingTools(JsonField.ofNullable(pendingTools))

        /**
         * Sets [Builder.pendingTools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingTools] with a well-typed `List<PendingTool>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pendingTools(pendingTools: JsonField<List<PendingTool>>) = apply {
            this.pendingTools = pendingTools.map { it.toMutableList() }
        }

        /**
         * Adds a single [PendingTool] to [pendingTools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPendingTool(pendingTool: PendingTool) = apply {
            pendingTools =
                (pendingTools ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pendingTools", it).add(pendingTool)
                }
        }

        /** Completed server tool outputs keyed by call ID. */
        fun serverResults(serverResults: ServerResults?) =
            serverResults(JsonField.ofNullable(serverResults))

        /**
         * Sets [Builder.serverResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serverResults] with a well-typed [ServerResults] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serverResults(serverResults: JsonField<ServerResults>) = apply {
            this.serverResults = serverResults
        }

        /**
         * Specifies the processing type used for serving the request.
         * - If set to 'auto', then the request will be processed with the service tier configured
         *   in the Project settings. Unless otherwise configured, the Project will use 'default'.
         * - If set to 'default', then the request will be processed with the standard pricing and
         *   performance for the selected model.
         * - If set to '[flex](/docs/guides/flex-processing)' or
         *   '[priority](https://openai.com/api-priority-processing/)', then the request will be
         *   processed with the corresponding service tier.
         * - When not set, the default behavior is 'auto'.
         *
         *   When the `service_tier` parameter is set, the response body will include the
         *   `service_tier` value based on the processing mode actually used to serve the request.
         *   This response value may be different from the value set in the parameter.
         */
        fun serviceTier(serviceTier: ServiceTier?) = serviceTier(JsonField.ofNullable(serviceTier))

        /**
         * Sets [Builder.serviceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceTier] with a well-typed [ServiceTier] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceTier(serviceTier: JsonField<ServiceTier>) = apply {
            this.serviceTier = serviceTier
        }

        /**
         * This fingerprint represents the backend configuration that the model runs with.
         *
         * Can be used in conjunction with the `seed` request parameter to understand when backend
         * changes have been made that might impact determinism.
         */
        fun systemFingerprint(systemFingerprint: String) =
            systemFingerprint(JsonField.of(systemFingerprint))

        /**
         * Sets [Builder.systemFingerprint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemFingerprint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun systemFingerprint(systemFingerprint: JsonField<String>) = apply {
            this.systemFingerprint = systemFingerprint
        }

        /**
         * List of tool names that were executed server-side (e.g., MCP tools). Only present when
         * tools were executed on the server rather than returned for client-side execution.
         */
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

        /**
         * Number of internal LLM calls made during this request. SDKs can sum this across their
         * outer loop to track total LLM calls.
         */
        fun turnsConsumed(turnsConsumed: Long?) = turnsConsumed(JsonField.ofNullable(turnsConsumed))

        /**
         * Alias for [Builder.turnsConsumed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun turnsConsumed(turnsConsumed: Long) = turnsConsumed(turnsConsumed as Long?)

        /**
         * Sets [Builder.turnsConsumed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turnsConsumed] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun turnsConsumed(turnsConsumed: JsonField<Long>) = apply {
            this.turnsConsumed = turnsConsumed
        }

        /** Usage statistics for the completion request. */
        fun usage(usage: CompletionUsage) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [CompletionUsage] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usage(usage: JsonField<CompletionUsage>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [ChatCompletion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .choices()
         * .created()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletion =
            ChatCompletion(
                checkRequired("id", id),
                checkRequired("choices", choices).map { it.toImmutable() },
                checkRequired("created", created),
                checkRequired("model", model),
                object_,
                correlationId,
                (deferred ?: JsonMissing.of()).map { it.toImmutable() },
                mcpServerErrors,
                (mcpToolResults ?: JsonMissing.of()).map { it.toImmutable() },
                (pendingTools ?: JsonMissing.of()).map { it.toImmutable() },
                serverResults,
                serviceTier,
                systemFingerprint,
                (toolsExecuted ?: JsonMissing.of()).map { it.toImmutable() },
                turnsConsumed,
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
    fun validate(): ChatCompletion = apply {
        if (validated) {
            return@apply
        }

        id()
        choices().forEach { it.validate() }
        created()
        model()
        _object_().let {
            if (it != JsonValue.from("chat.completion")) {
                throw DedalusInvalidDataException("'object_' is invalid, received $it")
            }
        }
        correlationId()
        deferred()?.forEach { it.validate() }
        mcpServerErrors()?.validate()
        mcpToolResults()?.forEach { it.validate() }
        pendingTools()?.forEach { it.validate() }
        serverResults()?.validate()
        serviceTier()?.validate()
        systemFingerprint()
        toolsExecuted()
        turnsConsumed()
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
            (choices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (created.asKnown() == null) 0 else 1) +
            (if (model.asKnown() == null) 0 else 1) +
            object_.let { if (it == JsonValue.from("chat.completion")) 1 else 0 } +
            (if (correlationId.asKnown() == null) 0 else 1) +
            (deferred.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (mcpServerErrors.asKnown()?.validity() ?: 0) +
            (mcpToolResults.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (pendingTools.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (serverResults.asKnown()?.validity() ?: 0) +
            (serviceTier.asKnown()?.validity() ?: 0) +
            (if (systemFingerprint.asKnown() == null) 0 else 1) +
            (toolsExecuted.asKnown()?.size ?: 0) +
            (if (turnsConsumed.asKnown() == null) 0 else 1) +
            (usage.asKnown()?.validity() ?: 0)

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

    /** Client-side tool call the SDK must execute. */
    class PendingTool
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val arguments: JsonField<JsonObjectInput>,
        private val name: JsonField<String>,
        private val dependencies: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("arguments")
            @ExcludeMissing
            arguments: JsonField<JsonObjectInput> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dependencies")
            @ExcludeMissing
            dependencies: JsonField<List<String>> = JsonMissing.of(),
        ) : this(id, arguments, name, dependencies, mutableMapOf())

        /**
         * Unique identifier for this tool call.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Input arguments for the tool call.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun arguments(): JsonObjectInput = arguments.getRequired("arguments")

        /**
         * Name of the tool to execute.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * IDs of other pending calls that must complete first.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dependencies(): List<String>? = dependencies.getNullable("dependencies")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [arguments].
         *
         * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arguments")
        @ExcludeMissing
        fun _arguments(): JsonField<JsonObjectInput> = arguments

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [dependencies].
         *
         * Unlike [dependencies], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dependencies")
        @ExcludeMissing
        fun _dependencies(): JsonField<List<String>> = dependencies

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
             * Returns a mutable builder for constructing an instance of [PendingTool].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .arguments()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PendingTool]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var arguments: JsonField<JsonObjectInput>? = null
            private var name: JsonField<String>? = null
            private var dependencies: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(pendingTool: PendingTool) = apply {
                id = pendingTool.id
                arguments = pendingTool.arguments
                name = pendingTool.name
                dependencies = pendingTool.dependencies.map { it.toMutableList() }
                additionalProperties = pendingTool.additionalProperties.toMutableMap()
            }

            /** Unique identifier for this tool call. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Input arguments for the tool call. */
            fun arguments(arguments: JsonObjectInput) = arguments(JsonField.of(arguments))

            /**
             * Sets [Builder.arguments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arguments] with a well-typed [JsonObjectInput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arguments(arguments: JsonField<JsonObjectInput>) = apply {
                this.arguments = arguments
            }

            /** Name of the tool to execute. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** IDs of other pending calls that must complete first. */
            fun dependencies(dependencies: List<String>) = dependencies(JsonField.of(dependencies))

            /**
             * Sets [Builder.dependencies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dependencies] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dependencies(dependencies: JsonField<List<String>>) = apply {
                this.dependencies = dependencies.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [dependencies].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDependency(dependency: String) = apply {
                dependencies =
                    (dependencies ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dependencies", it).add(dependency)
                    }
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
             * Returns an immutable instance of [PendingTool].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .arguments()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PendingTool =
                PendingTool(
                    checkRequired("id", id),
                    checkRequired("arguments", arguments),
                    checkRequired("name", name),
                    (dependencies ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): PendingTool = apply {
            if (validated) {
                return@apply
            }

            id()
            arguments().validate()
            name()
            dependencies()
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
            (if (id.asKnown() == null) 0 else 1) +
                (arguments.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (dependencies.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PendingTool &&
                id == other.id &&
                arguments == other.arguments &&
                name == other.name &&
                dependencies == other.dependencies &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, arguments, name, dependencies, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PendingTool{id=$id, arguments=$arguments, name=$name, dependencies=$dependencies, additionalProperties=$additionalProperties}"
    }

    /** Completed server tool outputs keyed by call ID. */
    class ServerResults
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

            /** Returns a mutable builder for constructing an instance of [ServerResults]. */
            fun builder() = Builder()
        }

        /** A builder for [ServerResults]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(serverResults: ServerResults) = apply {
                additionalProperties = serverResults.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ServerResults].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ServerResults = ServerResults(additionalProperties.toImmutable())
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
        fun validate(): ServerResults = apply {
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

            return other is ServerResults && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ServerResults{additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies the processing type used for serving the request.
     * - If set to 'auto', then the request will be processed with the service tier configured in
     *   the Project settings. Unless otherwise configured, the Project will use 'default'.
     * - If set to 'default', then the request will be processed with the standard pricing and
     *   performance for the selected model.
     * - If set to '[flex](/docs/guides/flex-processing)' or
     *   '[priority](https://openai.com/api-priority-processing/)', then the request will be
     *   processed with the corresponding service tier.
     * - When not set, the default behavior is 'auto'.
     *
     *   When the `service_tier` parameter is set, the response body will include the `service_tier`
     *   value based on the processing mode actually used to serve the request. This response value
     *   may be different from the value set in the parameter.
     */
    class ServiceTier @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val AUTO = of("auto")

            val DEFAULT = of("default")

            val FLEX = of("flex")

            val SCALE = of("scale")

            val PRIORITY = of("priority")

            fun of(value: String) = ServiceTier(JsonField.of(value))
        }

        /** An enum containing [ServiceTier]'s known values. */
        enum class Known {
            AUTO,
            DEFAULT,
            FLEX,
            SCALE,
            PRIORITY,
        }

        /**
         * An enum containing [ServiceTier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ServiceTier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            DEFAULT,
            FLEX,
            SCALE,
            PRIORITY,
            /**
             * An enum member indicating that [ServiceTier] was instantiated with an unknown value.
             */
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
                AUTO -> Value.AUTO
                DEFAULT -> Value.DEFAULT
                FLEX -> Value.FLEX
                SCALE -> Value.SCALE
                PRIORITY -> Value.PRIORITY
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
                AUTO -> Known.AUTO
                DEFAULT -> Known.DEFAULT
                FLEX -> Known.FLEX
                SCALE -> Known.SCALE
                PRIORITY -> Known.PRIORITY
                else -> throw DedalusInvalidDataException("Unknown ServiceTier: $value")
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
        fun validate(): ServiceTier = apply {
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

            return other is ServiceTier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCompletion &&
            id == other.id &&
            choices == other.choices &&
            created == other.created &&
            model == other.model &&
            object_ == other.object_ &&
            correlationId == other.correlationId &&
            deferred == other.deferred &&
            mcpServerErrors == other.mcpServerErrors &&
            mcpToolResults == other.mcpToolResults &&
            pendingTools == other.pendingTools &&
            serverResults == other.serverResults &&
            serviceTier == other.serviceTier &&
            systemFingerprint == other.systemFingerprint &&
            toolsExecuted == other.toolsExecuted &&
            turnsConsumed == other.turnsConsumed &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            choices,
            created,
            model,
            object_,
            correlationId,
            deferred,
            mcpServerErrors,
            mcpToolResults,
            pendingTools,
            serverResults,
            serviceTier,
            systemFingerprint,
            toolsExecuted,
            turnsConsumed,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletion{id=$id, choices=$choices, created=$created, model=$model, object_=$object_, correlationId=$correlationId, deferred=$deferred, mcpServerErrors=$mcpServerErrors, mcpToolResults=$mcpToolResults, pendingTools=$pendingTools, serverResults=$serverResults, serviceTier=$serviceTier, systemFingerprint=$systemFingerprint, toolsExecuted=$toolsExecuted, turnsConsumed=$turnsConsumed, usage=$usage, additionalProperties=$additionalProperties}"
}
