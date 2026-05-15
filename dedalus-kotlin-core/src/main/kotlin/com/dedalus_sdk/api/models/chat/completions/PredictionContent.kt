// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.BaseDeserializer
import com.dedalus_sdk.api.core.BaseSerializer
import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.allMaxBy
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.getOrThrow
import com.dedalus_sdk.api.core.toImmutable
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
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

/**
 * Static predicted output content, such as the content of a text file that is being regenerated.
 *
 * Fields:
 * - type (required): Literal["content"]
 * - content (required): str | Annotated[list[ChatCompletionRequestMessageContentPartText],
 *   MinLen(1), ArrayTitle("PredictionContentArray")]
 */
class PredictionContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<Content>,
    private val type: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
    ) : this(content, type, mutableMapOf())

    /**
     * The content that should be matched when generating a model response. If generated tokens
     * would match this content, the entire model response can be returned much more quickly.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): Content = content.getRequired("content")

    /**
     * The type of the predicted content you want to provide. This type is currently always
     * `content`.
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("content")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

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
         * Returns a mutable builder for constructing an instance of [PredictionContent].
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PredictionContent]. */
    class Builder internal constructor() {

        private var content: JsonField<Content>? = null
        private var type: JsonValue = JsonValue.from("content")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(predictionContent: PredictionContent) = apply {
            content = predictionContent.content
            type = predictionContent.type
            additionalProperties = predictionContent.additionalProperties.toMutableMap()
        }

        /**
         * The content that should be matched when generating a model response. If generated tokens
         * would match this content, the entire model response can be returned much more quickly.
         */
        fun content(content: Content) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [Content] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<Content>) = apply { this.content = content }

        /** Alias for calling [content] with `Content.ofString(string)`. */
        fun content(string: String) = content(Content.ofString(string))

        /**
         * Alias for calling [content] with
         * `Content.ofPredictionContentArray(predictionContentArray)`.
         */
        fun contentOfPredictionContentArray(
            predictionContentArray: List<ChatCompletionContentPartTextParam>
        ) = content(Content.ofPredictionContentArray(predictionContentArray))

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("content")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

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
         * Returns an immutable instance of [PredictionContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PredictionContent =
            PredictionContent(
                checkRequired("content", content),
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
    fun validate(): PredictionContent = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        _type().let {
            if (it != JsonValue.from("content")) {
                throw DedalusInvalidDataException("'type' is invalid, received $it")
            }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (content.asKnown()?.validity() ?: 0) +
            type.let { if (it == JsonValue.from("content")) 1 else 0 }

    /**
     * The content that should be matched when generating a model response. If generated tokens
     * would match this content, the entire model response can be returned much more quickly.
     */
    @JsonDeserialize(using = Content.Deserializer::class)
    @JsonSerialize(using = Content.Serializer::class)
    class Content
    private constructor(
        private val string: String? = null,
        private val predictionContentArray: List<ChatCompletionContentPartTextParam>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun predictionContentArray(): List<ChatCompletionContentPartTextParam>? =
            predictionContentArray

        fun isString(): Boolean = string != null

        fun isPredictionContentArray(): Boolean = predictionContentArray != null

        fun asString(): String = string.getOrThrow("string")

        fun asPredictionContentArray(): List<ChatCompletionContentPartTextParam> =
            predictionContentArray.getOrThrow("predictionContentArray")

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
         * val result: String? = content.accept(object : Content.Visitor<String?> {
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
                predictionContentArray != null ->
                    visitor.visitPredictionContentArray(predictionContentArray)
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
        fun validate(): Content = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitPredictionContentArray(
                        predictionContentArray: List<ChatCompletionContentPartTextParam>
                    ) {
                        predictionContentArray.forEach { it.validate() }
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

                    override fun visitPredictionContentArray(
                        predictionContentArray: List<ChatCompletionContentPartTextParam>
                    ) = predictionContentArray.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Content &&
                string == other.string &&
                predictionContentArray == other.predictionContentArray
        }

        override fun hashCode(): Int = Objects.hash(string, predictionContentArray)

        override fun toString(): String =
            when {
                string != null -> "Content{string=$string}"
                predictionContentArray != null ->
                    "Content{predictionContentArray=$predictionContentArray}"
                _json != null -> "Content{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Content")
            }

        companion object {

            fun ofString(string: String) = Content(string = string)

            fun ofPredictionContentArray(
                predictionContentArray: List<ChatCompletionContentPartTextParam>
            ) = Content(predictionContentArray = predictionContentArray.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [Content] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitPredictionContentArray(
                predictionContentArray: List<ChatCompletionContentPartTextParam>
            ): T

            /**
             * Maps an unknown variant of [Content] to a value of type [T].
             *
             * An instance of [Content] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Content: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Content>(Content::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Content {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Content(string = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<ChatCompletionContentPartTextParam>>(),
                                )
                                ?.let { Content(predictionContentArray = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Content(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Content>(Content::class) {

            override fun serialize(
                value: Content,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.predictionContentArray != null ->
                        generator.writeObject(value.predictionContentArray)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Content")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PredictionContent &&
            content == other.content &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(content, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PredictionContent{content=$content, type=$type, additionalProperties=$additionalProperties}"
}
