// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Breakdown of tokens used in the prompt.
 *
 * Fields:
 * - audio_tokens (optional): int
 * - cached_tokens (optional): int
 */
class PromptTokensDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val audioTokens: JsonField<Long>,
    private val cachedTokens: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("audio_tokens")
        @ExcludeMissing
        audioTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cached_tokens")
        @ExcludeMissing
        cachedTokens: JsonField<Long> = JsonMissing.of(),
    ) : this(audioTokens, cachedTokens, mutableMapOf())

    /**
     * Audio input tokens present in the prompt.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioTokens(): Long? = audioTokens.getNullable("audio_tokens")

    /**
     * Cached tokens present in the prompt.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cachedTokens(): Long? = cachedTokens.getNullable("cached_tokens")

    /**
     * Returns the raw JSON value of [audioTokens].
     *
     * Unlike [audioTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio_tokens") @ExcludeMissing fun _audioTokens(): JsonField<Long> = audioTokens

    /**
     * Returns the raw JSON value of [cachedTokens].
     *
     * Unlike [cachedTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cached_tokens")
    @ExcludeMissing
    fun _cachedTokens(): JsonField<Long> = cachedTokens

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

        /** Returns a mutable builder for constructing an instance of [PromptTokensDetails]. */
        fun builder() = Builder()
    }

    /** A builder for [PromptTokensDetails]. */
    class Builder internal constructor() {

        private var audioTokens: JsonField<Long> = JsonMissing.of()
        private var cachedTokens: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(promptTokensDetails: PromptTokensDetails) = apply {
            audioTokens = promptTokensDetails.audioTokens
            cachedTokens = promptTokensDetails.cachedTokens
            additionalProperties = promptTokensDetails.additionalProperties.toMutableMap()
        }

        /** Audio input tokens present in the prompt. */
        fun audioTokens(audioTokens: Long) = audioTokens(JsonField.of(audioTokens))

        /**
         * Sets [Builder.audioTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audioTokens(audioTokens: JsonField<Long>) = apply { this.audioTokens = audioTokens }

        /** Cached tokens present in the prompt. */
        fun cachedTokens(cachedTokens: Long) = cachedTokens(JsonField.of(cachedTokens))

        /**
         * Sets [Builder.cachedTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cachedTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cachedTokens(cachedTokens: JsonField<Long>) = apply { this.cachedTokens = cachedTokens }

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
         * Returns an immutable instance of [PromptTokensDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PromptTokensDetails =
            PromptTokensDetails(audioTokens, cachedTokens, additionalProperties.toMutableMap())
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
    fun validate(): PromptTokensDetails = apply {
        if (validated) {
            return@apply
        }

        audioTokens()
        cachedTokens()
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
        (if (audioTokens.asKnown() == null) 0 else 1) +
            (if (cachedTokens.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptTokensDetails &&
            audioTokens == other.audioTokens &&
            cachedTokens == other.cachedTokens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(audioTokens, cachedTokens, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PromptTokensDetails{audioTokens=$audioTokens, cachedTokens=$cachedTokens, additionalProperties=$additionalProperties}"
}
