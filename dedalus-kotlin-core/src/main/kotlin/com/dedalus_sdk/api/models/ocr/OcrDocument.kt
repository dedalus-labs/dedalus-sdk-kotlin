// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.ocr

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

/** Document input for OCR. */
class OcrDocument
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val documentUrl: JsonField<String>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("document_url")
        @ExcludeMissing
        documentUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(documentUrl, type, mutableMapOf())

    /**
     * Data URI with base64-encoded document
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentUrl(): String = documentUrl.getRequired("document_url")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): String? = type.getNullable("type")

    /**
     * Returns the raw JSON value of [documentUrl].
     *
     * Unlike [documentUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_url")
    @ExcludeMissing
    fun _documentUrl(): JsonField<String> = documentUrl

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [OcrDocument].
         *
         * The following fields are required:
         * ```kotlin
         * .documentUrl()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OcrDocument]. */
    class Builder internal constructor() {

        private var documentUrl: JsonField<String>? = null
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ocrDocument: OcrDocument) = apply {
            documentUrl = ocrDocument.documentUrl
            type = ocrDocument.type
            additionalProperties = ocrDocument.additionalProperties.toMutableMap()
        }

        /** Data URI with base64-encoded document */
        fun documentUrl(documentUrl: String) = documentUrl(JsonField.of(documentUrl))

        /**
         * Sets [Builder.documentUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentUrl(documentUrl: JsonField<String>) = apply { this.documentUrl = documentUrl }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [OcrDocument].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .documentUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OcrDocument =
            OcrDocument(
                checkRequired("documentUrl", documentUrl),
                type,
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
    fun validate(): OcrDocument = apply {
        if (validated) {
            return@apply
        }

        documentUrl()
        type()
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
        (if (documentUrl.asKnown() == null) 0 else 1) + (if (type.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OcrDocument &&
            documentUrl == other.documentUrl &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(documentUrl, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OcrDocument{documentUrl=$documentUrl, type=$type, additionalProperties=$additionalProperties}"
}
