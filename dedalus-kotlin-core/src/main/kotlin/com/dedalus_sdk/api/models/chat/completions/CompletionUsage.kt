// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

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
 * Usage statistics for the completion request.
 *
 * Fields:
 * - completion_tokens (required): int
 * - prompt_tokens (required): int
 * - total_tokens (required): int
 * - completion_tokens_details (optional): CompletionTokensDetails
 * - prompt_tokens_details (optional): PromptTokensDetails
 */
class CompletionUsage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completionTokens: JsonField<Long>,
    private val promptTokens: JsonField<Long>,
    private val totalTokens: JsonField<Long>,
    private val completionTokensDetails: JsonField<CompletionTokensDetails>,
    private val promptTokensDetails: JsonField<PromptTokensDetails>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("completion_tokens_details")
        @ExcludeMissing
        completionTokensDetails: JsonField<CompletionTokensDetails> = JsonMissing.of(),
        @JsonProperty("prompt_tokens_details")
        @ExcludeMissing
        promptTokensDetails: JsonField<PromptTokensDetails> = JsonMissing.of(),
    ) : this(
        completionTokens,
        promptTokens,
        totalTokens,
        completionTokensDetails,
        promptTokensDetails,
        mutableMapOf(),
    )

    /**
     * Number of tokens in the generated completion.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun completionTokens(): Long = completionTokens.getRequired("completion_tokens")

    /**
     * Number of tokens in the prompt.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun promptTokens(): Long = promptTokens.getRequired("prompt_tokens")

    /**
     * Total number of tokens used in the request (prompt + completion).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

    /**
     * Breakdown of tokens used in a completion.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokensDetails(): CompletionTokensDetails? =
        completionTokensDetails.getNullable("completion_tokens_details")

    /**
     * Breakdown of tokens used in the prompt.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokensDetails(): PromptTokensDetails? =
        promptTokensDetails.getNullable("prompt_tokens_details")

    /**
     * Returns the raw JSON value of [completionTokens].
     *
     * Unlike [completionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_tokens")
    @ExcludeMissing
    fun _completionTokens(): JsonField<Long> = completionTokens

    /**
     * Returns the raw JSON value of [promptTokens].
     *
     * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_tokens")
    @ExcludeMissing
    fun _promptTokens(): JsonField<Long> = promptTokens

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

    /**
     * Returns the raw JSON value of [completionTokensDetails].
     *
     * Unlike [completionTokensDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("completion_tokens_details")
    @ExcludeMissing
    fun _completionTokensDetails(): JsonField<CompletionTokensDetails> = completionTokensDetails

    /**
     * Returns the raw JSON value of [promptTokensDetails].
     *
     * Unlike [promptTokensDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prompt_tokens_details")
    @ExcludeMissing
    fun _promptTokensDetails(): JsonField<PromptTokensDetails> = promptTokensDetails

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
         * Returns a mutable builder for constructing an instance of [CompletionUsage].
         *
         * The following fields are required:
         * ```kotlin
         * .completionTokens()
         * .promptTokens()
         * .totalTokens()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CompletionUsage]. */
    class Builder internal constructor() {

        private var completionTokens: JsonField<Long>? = null
        private var promptTokens: JsonField<Long>? = null
        private var totalTokens: JsonField<Long>? = null
        private var completionTokensDetails: JsonField<CompletionTokensDetails> = JsonMissing.of()
        private var promptTokensDetails: JsonField<PromptTokensDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(completionUsage: CompletionUsage) = apply {
            completionTokens = completionUsage.completionTokens
            promptTokens = completionUsage.promptTokens
            totalTokens = completionUsage.totalTokens
            completionTokensDetails = completionUsage.completionTokensDetails
            promptTokensDetails = completionUsage.promptTokensDetails
            additionalProperties = completionUsage.additionalProperties.toMutableMap()
        }

        /** Number of tokens in the generated completion. */
        fun completionTokens(completionTokens: Long) =
            completionTokens(JsonField.of(completionTokens))

        /**
         * Sets [Builder.completionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokens] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionTokens(completionTokens: JsonField<Long>) = apply {
            this.completionTokens = completionTokens
        }

        /** Number of tokens in the prompt. */
        fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

        /**
         * Sets [Builder.promptTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        /** Total number of tokens used in the request (prompt + completion). */
        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        /** Breakdown of tokens used in a completion. */
        fun completionTokensDetails(completionTokensDetails: CompletionTokensDetails) =
            completionTokensDetails(JsonField.of(completionTokensDetails))

        /**
         * Sets [Builder.completionTokensDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokensDetails] with a well-typed
         * [CompletionTokensDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun completionTokensDetails(completionTokensDetails: JsonField<CompletionTokensDetails>) =
            apply {
                this.completionTokensDetails = completionTokensDetails
            }

        /** Breakdown of tokens used in the prompt. */
        fun promptTokensDetails(promptTokensDetails: PromptTokensDetails) =
            promptTokensDetails(JsonField.of(promptTokensDetails))

        /**
         * Sets [Builder.promptTokensDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokensDetails] with a well-typed
         * [PromptTokensDetails] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun promptTokensDetails(promptTokensDetails: JsonField<PromptTokensDetails>) = apply {
            this.promptTokensDetails = promptTokensDetails
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
         * Returns an immutable instance of [CompletionUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .completionTokens()
         * .promptTokens()
         * .totalTokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompletionUsage =
            CompletionUsage(
                checkRequired("completionTokens", completionTokens),
                checkRequired("promptTokens", promptTokens),
                checkRequired("totalTokens", totalTokens),
                completionTokensDetails,
                promptTokensDetails,
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
    fun validate(): CompletionUsage = apply {
        if (validated) {
            return@apply
        }

        completionTokens()
        promptTokens()
        totalTokens()
        completionTokensDetails()?.validate()
        promptTokensDetails()?.validate()
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
        (if (completionTokens.asKnown() == null) 0 else 1) +
            (if (promptTokens.asKnown() == null) 0 else 1) +
            (if (totalTokens.asKnown() == null) 0 else 1) +
            (completionTokensDetails.asKnown()?.validity() ?: 0) +
            (promptTokensDetails.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompletionUsage &&
            completionTokens == other.completionTokens &&
            promptTokens == other.promptTokens &&
            totalTokens == other.totalTokens &&
            completionTokensDetails == other.completionTokensDetails &&
            promptTokensDetails == other.promptTokensDetails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            completionTokens,
            promptTokens,
            totalTokens,
            completionTokensDetails,
            promptTokensDetails,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompletionUsage{completionTokens=$completionTokens, promptTokens=$promptTokens, totalTokens=$totalTokens, completionTokensDetails=$completionTokensDetails, promptTokensDetails=$promptTokensDetails, additionalProperties=$additionalProperties}"
}
