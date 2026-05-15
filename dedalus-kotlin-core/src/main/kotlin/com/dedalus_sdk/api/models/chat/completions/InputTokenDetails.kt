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
 * Details about the input tokens billed for this request.
 *
 * Fields:
 * - text_tokens (optional): int
 * - audio_tokens (optional): int
 */
class InputTokenDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val audioTokens: JsonField<Long>,
    private val textTokens: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("audio_tokens")
        @ExcludeMissing
        audioTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("text_tokens") @ExcludeMissing textTokens: JsonField<Long> = JsonMissing.of(),
    ) : this(audioTokens, textTokens, mutableMapOf())

    /**
     * Number of audio tokens billed for this request.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioTokens(): Long? = audioTokens.getNullable("audio_tokens")

    /**
     * Number of text tokens billed for this request.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textTokens(): Long? = textTokens.getNullable("text_tokens")

    /**
     * Returns the raw JSON value of [audioTokens].
     *
     * Unlike [audioTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio_tokens") @ExcludeMissing fun _audioTokens(): JsonField<Long> = audioTokens

    /**
     * Returns the raw JSON value of [textTokens].
     *
     * Unlike [textTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_tokens") @ExcludeMissing fun _textTokens(): JsonField<Long> = textTokens

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

        /** Returns a mutable builder for constructing an instance of [InputTokenDetails]. */
        fun builder() = Builder()
    }

    /** A builder for [InputTokenDetails]. */
    class Builder internal constructor() {

        private var audioTokens: JsonField<Long> = JsonMissing.of()
        private var textTokens: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inputTokenDetails: InputTokenDetails) = apply {
            audioTokens = inputTokenDetails.audioTokens
            textTokens = inputTokenDetails.textTokens
            additionalProperties = inputTokenDetails.additionalProperties.toMutableMap()
        }

        /** Number of audio tokens billed for this request. */
        fun audioTokens(audioTokens: Long) = audioTokens(JsonField.of(audioTokens))

        /**
         * Sets [Builder.audioTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audioTokens(audioTokens: JsonField<Long>) = apply { this.audioTokens = audioTokens }

        /** Number of text tokens billed for this request. */
        fun textTokens(textTokens: Long) = textTokens(JsonField.of(textTokens))

        /**
         * Sets [Builder.textTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textTokens(textTokens: JsonField<Long>) = apply { this.textTokens = textTokens }

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
         * Returns an immutable instance of [InputTokenDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InputTokenDetails =
            InputTokenDetails(audioTokens, textTokens, additionalProperties.toMutableMap())
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
    fun validate(): InputTokenDetails = apply {
        if (validated) {
            return@apply
        }

        audioTokens()
        textTokens()
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
        (if (audioTokens.asKnown() == null) 0 else 1) + (if (textTokens.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InputTokenDetails &&
            audioTokens == other.audioTokens &&
            textTokens == other.textTokens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(audioTokens, textTokens, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InputTokenDetails{audioTokens=$audioTokens, textTokens=$textTokens, additionalProperties=$additionalProperties}"
}
