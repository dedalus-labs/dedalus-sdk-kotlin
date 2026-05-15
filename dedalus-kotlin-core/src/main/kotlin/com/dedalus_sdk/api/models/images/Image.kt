// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.images

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

/** Single image object. */
class Image
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val b64Json: JsonField<String>,
    private val revisedPrompt: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("b64_json") @ExcludeMissing b64Json: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revised_prompt")
        @ExcludeMissing
        revisedPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(b64Json, revisedPrompt, url, mutableMapOf())

    /**
     * Base64-encoded image data (if response_format=b64_json)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun b64Json(): String? = b64Json.getNullable("b64_json")

    /**
     * Revised prompt used for generation (dall-e-3)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revisedPrompt(): String? = revisedPrompt.getNullable("revised_prompt")

    /**
     * URL of the generated image (if response_format=url)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): String? = url.getNullable("url")

    /**
     * Returns the raw JSON value of [b64Json].
     *
     * Unlike [b64Json], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("b64_json") @ExcludeMissing fun _b64Json(): JsonField<String> = b64Json

    /**
     * Returns the raw JSON value of [revisedPrompt].
     *
     * Unlike [revisedPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revised_prompt")
    @ExcludeMissing
    fun _revisedPrompt(): JsonField<String> = revisedPrompt

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

        /** Returns a mutable builder for constructing an instance of [Image]. */
        fun builder() = Builder()
    }

    /** A builder for [Image]. */
    class Builder internal constructor() {

        private var b64Json: JsonField<String> = JsonMissing.of()
        private var revisedPrompt: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(image: Image) = apply {
            b64Json = image.b64Json
            revisedPrompt = image.revisedPrompt
            url = image.url
            additionalProperties = image.additionalProperties.toMutableMap()
        }

        /** Base64-encoded image data (if response_format=b64_json) */
        fun b64Json(b64Json: String?) = b64Json(JsonField.ofNullable(b64Json))

        /**
         * Sets [Builder.b64Json] to an arbitrary JSON value.
         *
         * You should usually call [Builder.b64Json] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun b64Json(b64Json: JsonField<String>) = apply { this.b64Json = b64Json }

        /** Revised prompt used for generation (dall-e-3) */
        fun revisedPrompt(revisedPrompt: String?) =
            revisedPrompt(JsonField.ofNullable(revisedPrompt))

        /**
         * Sets [Builder.revisedPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revisedPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revisedPrompt(revisedPrompt: JsonField<String>) = apply {
            this.revisedPrompt = revisedPrompt
        }

        /** URL of the generated image (if response_format=url) */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [Image].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Image = Image(b64Json, revisedPrompt, url, additionalProperties.toMutableMap())
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
    fun validate(): Image = apply {
        if (validated) {
            return@apply
        }

        b64Json()
        revisedPrompt()
        url()
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
        (if (b64Json.asKnown() == null) 0 else 1) +
            (if (revisedPrompt.asKnown() == null) 0 else 1) +
            (if (url.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Image &&
            b64Json == other.b64Json &&
            revisedPrompt == other.revisedPrompt &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(b64Json, revisedPrompt, url, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Image{b64Json=$b64Json, revisedPrompt=$revisedPrompt, url=$url, additionalProperties=$additionalProperties}"
}
