// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.checkKnown
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.toImmutable
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Log probability information for the choice.
 *
 * Fields:
 * - content (required): list[ChatCompletionTokenLogprob]
 * - refusal (required): list[ChatCompletionTokenLogprob]
 */
class StreamChoiceLogprobs
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<List<ChatCompletionTokenLogprob>>,
    private val refusal: JsonField<List<ChatCompletionTokenLogprob>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<List<ChatCompletionTokenLogprob>> = JsonMissing.of(),
        @JsonProperty("refusal")
        @ExcludeMissing
        refusal: JsonField<List<ChatCompletionTokenLogprob>> = JsonMissing.of(),
    ) : this(content, refusal, mutableMapOf())

    /**
     * A list of message content tokens with log probability information.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): List<ChatCompletionTokenLogprob>? = content.getNullable("content")

    /**
     * A list of message refusal tokens with log probability information.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refusal(): List<ChatCompletionTokenLogprob>? = refusal.getNullable("refusal")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content")
    @ExcludeMissing
    fun _content(): JsonField<List<ChatCompletionTokenLogprob>> = content

    /**
     * Returns the raw JSON value of [refusal].
     *
     * Unlike [refusal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refusal")
    @ExcludeMissing
    fun _refusal(): JsonField<List<ChatCompletionTokenLogprob>> = refusal

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
         * Returns a mutable builder for constructing an instance of [StreamChoiceLogprobs].
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * .refusal()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [StreamChoiceLogprobs]. */
    class Builder internal constructor() {

        private var content: JsonField<MutableList<ChatCompletionTokenLogprob>>? = null
        private var refusal: JsonField<MutableList<ChatCompletionTokenLogprob>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(streamChoiceLogprobs: StreamChoiceLogprobs) = apply {
            content = streamChoiceLogprobs.content.map { it.toMutableList() }
            refusal = streamChoiceLogprobs.refusal.map { it.toMutableList() }
            additionalProperties = streamChoiceLogprobs.additionalProperties.toMutableMap()
        }

        /** A list of message content tokens with log probability information. */
        fun content(content: List<ChatCompletionTokenLogprob>?) =
            content(JsonField.ofNullable(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed
         * `List<ChatCompletionTokenLogprob>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<List<ChatCompletionTokenLogprob>>) = apply {
            this.content = content.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatCompletionTokenLogprob] to [Builder.content].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContent(content: ChatCompletionTokenLogprob) = apply {
            this.content =
                (this.content ?: JsonField.of(mutableListOf())).also {
                    checkKnown("content", it).add(content)
                }
        }

        /** A list of message refusal tokens with log probability information. */
        fun refusal(refusal: List<ChatCompletionTokenLogprob>?) =
            refusal(JsonField.ofNullable(refusal))

        /**
         * Sets [Builder.refusal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refusal] with a well-typed
         * `List<ChatCompletionTokenLogprob>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun refusal(refusal: JsonField<List<ChatCompletionTokenLogprob>>) = apply {
            this.refusal = refusal.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatCompletionTokenLogprob] to [Builder.refusal].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRefusal(refusal: ChatCompletionTokenLogprob) = apply {
            this.refusal =
                (this.refusal ?: JsonField.of(mutableListOf())).also {
                    checkKnown("refusal", it).add(refusal)
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
         * Returns an immutable instance of [StreamChoiceLogprobs].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * .refusal()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StreamChoiceLogprobs =
            StreamChoiceLogprobs(
                checkRequired("content", content).map { it.toImmutable() },
                checkRequired("refusal", refusal).map { it.toImmutable() },
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
    fun validate(): StreamChoiceLogprobs = apply {
        if (validated) {
            return@apply
        }

        content()?.forEach { it.validate() }
        refusal()?.forEach { it.validate() }
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
        (content.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (refusal.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StreamChoiceLogprobs &&
            content == other.content &&
            refusal == other.refusal &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(content, refusal, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StreamChoiceLogprobs{content=$content, refusal=$refusal, additionalProperties=$additionalProperties}"
}
