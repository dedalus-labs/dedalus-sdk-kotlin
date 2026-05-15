// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Result of a single MCP tool execution.
 *
 * Provides visibility into MCP tool calls including the full input arguments and structured output,
 * enabling debugging and audit trails.
 */
class McpToolResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val arguments: JsonField<JsonObjectInput>,
    private val isError: JsonField<Boolean>,
    private val serverName: JsonField<String>,
    private val toolName: JsonField<String>,
    private val durationMs: JsonField<Long>,
    private val result: JsonField<JsonValueInput>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("arguments")
        @ExcludeMissing
        arguments: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("is_error") @ExcludeMissing isError: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("server_name")
        @ExcludeMissing
        serverName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tool_name") @ExcludeMissing toolName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration_ms") @ExcludeMissing durationMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<JsonValueInput> = JsonMissing.of(),
    ) : this(arguments, isError, serverName, toolName, durationMs, result, mutableMapOf())

    /**
     * Input arguments passed to the tool.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun arguments(): JsonObjectInput = arguments.getRequired("arguments")

    /**
     * Whether the tool execution resulted in an error.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isError(): Boolean = isError.getRequired("is_error")

    /**
     * Name of the MCP server that handled the tool.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun serverName(): String = serverName.getRequired("server_name")

    /**
     * Name of the MCP tool that was executed.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolName(): String = toolName.getRequired("tool_name")

    /**
     * Execution time in milliseconds.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMs(): Long? = durationMs.getNullable("duration_ms")

    /**
     * Structured result from the tool (parsed from structuredContent or content).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): JsonValueInput? = result.getNullable("result")

    /**
     * Returns the raw JSON value of [arguments].
     *
     * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arguments")
    @ExcludeMissing
    fun _arguments(): JsonField<JsonObjectInput> = arguments

    /**
     * Returns the raw JSON value of [isError].
     *
     * Unlike [isError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_error") @ExcludeMissing fun _isError(): JsonField<Boolean> = isError

    /**
     * Returns the raw JSON value of [serverName].
     *
     * Unlike [serverName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("server_name") @ExcludeMissing fun _serverName(): JsonField<String> = serverName

    /**
     * Returns the raw JSON value of [toolName].
     *
     * Unlike [toolName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<String> = toolName

    /**
     * Returns the raw JSON value of [durationMs].
     *
     * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_ms") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<JsonValueInput> = result

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
         * Returns a mutable builder for constructing an instance of [McpToolResult].
         *
         * The following fields are required:
         * ```kotlin
         * .arguments()
         * .isError()
         * .serverName()
         * .toolName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [McpToolResult]. */
    class Builder internal constructor() {

        private var arguments: JsonField<JsonObjectInput>? = null
        private var isError: JsonField<Boolean>? = null
        private var serverName: JsonField<String>? = null
        private var toolName: JsonField<String>? = null
        private var durationMs: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<JsonValueInput> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(mcpToolResult: McpToolResult) = apply {
            arguments = mcpToolResult.arguments
            isError = mcpToolResult.isError
            serverName = mcpToolResult.serverName
            toolName = mcpToolResult.toolName
            durationMs = mcpToolResult.durationMs
            result = mcpToolResult.result
            additionalProperties = mcpToolResult.additionalProperties.toMutableMap()
        }

        /** Input arguments passed to the tool. */
        fun arguments(arguments: JsonObjectInput) = arguments(JsonField.of(arguments))

        /**
         * Sets [Builder.arguments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arguments] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun arguments(arguments: JsonField<JsonObjectInput>) = apply { this.arguments = arguments }

        /** Whether the tool execution resulted in an error. */
        fun isError(isError: Boolean) = isError(JsonField.of(isError))

        /**
         * Sets [Builder.isError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isError] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isError(isError: JsonField<Boolean>) = apply { this.isError = isError }

        /** Name of the MCP server that handled the tool. */
        fun serverName(serverName: String) = serverName(JsonField.of(serverName))

        /**
         * Sets [Builder.serverName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serverName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serverName(serverName: JsonField<String>) = apply { this.serverName = serverName }

        /** Name of the MCP tool that was executed. */
        fun toolName(toolName: String) = toolName(JsonField.of(toolName))

        /**
         * Sets [Builder.toolName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun toolName(toolName: JsonField<String>) = apply { this.toolName = toolName }

        /** Execution time in milliseconds. */
        fun durationMs(durationMs: Long?) = durationMs(JsonField.ofNullable(durationMs))

        /**
         * Alias for [Builder.durationMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun durationMs(durationMs: Long) = durationMs(durationMs as Long?)

        /**
         * Sets [Builder.durationMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

        /** Structured result from the tool (parsed from structuredContent or content). */
        fun result(result: JsonValueInput?) = result(JsonField.ofNullable(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [JsonValueInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun result(result: JsonField<JsonValueInput>) = apply { this.result = result }

        /** Alias for calling [result] with `JsonValueInput.ofString(string)`. */
        fun result(string: String) = result(JsonValueInput.ofString(string))

        /** Alias for calling [result] with `JsonValueInput.ofDouble(double)`. */
        fun result(double: Double) = result(JsonValueInput.ofDouble(double))

        /** Alias for calling [result] with `JsonValueInput.ofBoolean(boolean)`. */
        fun result(boolean: Boolean) = result(JsonValueInput.ofBoolean(boolean))

        /** Alias for calling [result] with `JsonValueInput.ofUnionMember3(unionMember3)`. */
        fun result(unionMember3: JsonValueInput.UnionMember3) =
            result(JsonValueInput.ofUnionMember3(unionMember3))

        /** Alias for calling [result] with `JsonValueInput.ofInputs(inputs)`. */
        fun resultOfInputs(inputs: List<JsonValueInput?>) = result(JsonValueInput.ofInputs(inputs))

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
         * Returns an immutable instance of [McpToolResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .arguments()
         * .isError()
         * .serverName()
         * .toolName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): McpToolResult =
            McpToolResult(
                checkRequired("arguments", arguments),
                checkRequired("isError", isError),
                checkRequired("serverName", serverName),
                checkRequired("toolName", toolName),
                durationMs,
                result,
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
    fun validate(): McpToolResult = apply {
        if (validated) {
            return@apply
        }

        arguments().validate()
        isError()
        serverName()
        toolName()
        durationMs()
        result()?.validate()
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
        (arguments.asKnown()?.validity() ?: 0) +
            (if (isError.asKnown() == null) 0 else 1) +
            (if (serverName.asKnown() == null) 0 else 1) +
            (if (toolName.asKnown() == null) 0 else 1) +
            (if (durationMs.asKnown() == null) 0 else 1) +
            (result.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is McpToolResult &&
            arguments == other.arguments &&
            isError == other.isError &&
            serverName == other.serverName &&
            toolName == other.toolName &&
            durationMs == other.durationMs &&
            result == other.result &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            arguments,
            isError,
            serverName,
            toolName,
            durationMs,
            result,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "McpToolResult{arguments=$arguments, isError=$isError, serverName=$serverName, toolName=$toolName, durationMs=$durationMs, result=$result, additionalProperties=$additionalProperties}"
}
