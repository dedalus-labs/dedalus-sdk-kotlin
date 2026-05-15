// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.embeddings

import com.dedalus_sdk.api.core.BaseDeserializer
import com.dedalus_sdk.api.core.BaseSerializer
import com.dedalus_sdk.api.core.Enum
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
 * Schema for EmbeddingRequest.
 *
 * Fields:
 * - input (required): str | Annotated[list[str], MinLen(1), MaxLen(2048),
 *   ArrayTitle("EmbeddingRequestInputArray")] | Annotated[list[int], MinLen(1), MaxLen(2048),
 *   ArrayTitle("EmbeddingRequestInputArray")] | Annotated[list[Annotated[list[int], MinLen(1),
 *   ArrayTitle("EmbeddingRequestInputItemArray")]], MinLen(1), MaxLen(2048),
 *   ArrayTitle("EmbeddingRequestInputArray")]
 * - model (required): str | Literal["text-embedding-ada-002", "text-embedding-3-small",
 *   "text-embedding-3-large"]
 * - encoding_format (optional): Literal["float", "base64"]
 * - dimensions (optional): int
 * - user (optional): str
 */
class CreateEmbeddingRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val input: JsonField<Input>,
    private val model: JsonField<Model>,
    private val dimensions: JsonField<Long>,
    private val encodingFormat: JsonField<EncodingFormat>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("input") @ExcludeMissing input: JsonField<Input> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
        @JsonProperty("dimensions") @ExcludeMissing dimensions: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("encoding_format")
        @ExcludeMissing
        encodingFormat: JsonField<EncodingFormat> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(input, model, dimensions, encodingFormat, user, mutableMapOf())

    /**
     * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a
     * single request, pass an array of strings or array of token arrays. The input must not exceed
     * the max input tokens for the model (8192 tokens for all embedding models), cannot be an empty
     * string, and any array must be 2048 dimensions or less.
     * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
     * for counting tokens. In addition to the per-input token limit, all embedding models enforce a
     * maximum of 300,000 tokens summed across all inputs in a single request.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun input(): Input = input.getRequired("input")

    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to
     * see all of your available models, or see our [Model overview](/docs/models) for descriptions
     * of them.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): Model = model.getRequired("model")

    /**
     * The number of dimensions the resulting output embeddings should have. Only supported in
     * `text-embedding-3` and later models.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dimensions(): Long? = dimensions.getNullable("dimensions")

    /**
     * The format to return the embeddings in. Can be either `float` or
     * [`base64`](https://pypi.org/project/pybase64/).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encodingFormat(): EncodingFormat? = encodingFormat.getNullable("encoding_format")

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect
     * abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): String? = user.getNullable("user")

    /**
     * Returns the raw JSON value of [input].
     *
     * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

    /**
     * Returns the raw JSON value of [dimensions].
     *
     * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dimensions") @ExcludeMissing fun _dimensions(): JsonField<Long> = dimensions

    /**
     * Returns the raw JSON value of [encodingFormat].
     *
     * Unlike [encodingFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encoding_format")
    @ExcludeMissing
    fun _encodingFormat(): JsonField<EncodingFormat> = encodingFormat

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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
         * Returns a mutable builder for constructing an instance of [CreateEmbeddingRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .input()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreateEmbeddingRequest]. */
    class Builder internal constructor() {

        private var input: JsonField<Input>? = null
        private var model: JsonField<Model>? = null
        private var dimensions: JsonField<Long> = JsonMissing.of()
        private var encodingFormat: JsonField<EncodingFormat> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(createEmbeddingRequest: CreateEmbeddingRequest) = apply {
            input = createEmbeddingRequest.input
            model = createEmbeddingRequest.model
            dimensions = createEmbeddingRequest.dimensions
            encodingFormat = createEmbeddingRequest.encodingFormat
            user = createEmbeddingRequest.user
            additionalProperties = createEmbeddingRequest.additionalProperties.toMutableMap()
        }

        /**
         * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in
         * a single request, pass an array of strings or array of token arrays. The input must not
         * exceed the max input tokens for the model (8192 tokens for all embedding models), cannot
         * be an empty string, and any array must be 2048 dimensions or less.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
         * for counting tokens. In addition to the per-input token limit, all embedding models
         * enforce a maximum of 300,000 tokens summed across all inputs in a single request.
         */
        fun input(input: Input) = input(JsonField.of(input))

        /**
         * Sets [Builder.input] to an arbitrary JSON value.
         *
         * You should usually call [Builder.input] with a well-typed [Input] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun input(input: JsonField<Input>) = apply { this.input = input }

        /** Alias for calling [input] with `Input.ofString(string)`. */
        fun input(string: String) = input(Input.ofString(string))

        /**
         * Alias for calling [input] with
         * `Input.ofEmbeddingRequestInputArray(embeddingRequestInputArray)`.
         */
        fun inputOfEmbeddingRequestInputArray(embeddingRequestInputArray: List<String>) =
            input(Input.ofEmbeddingRequestInputArray(embeddingRequestInputArray))

        /**
         * Alias for calling [input] with
         * `Input.ofEmbeddingRequestInputArray(embeddingRequestInputArray)`.
         */
        fun inputOfEmbeddingRequestInputArray(embeddingRequestInputArray: List<Long>) =
            input(Input.ofEmbeddingRequestInputArray(embeddingRequestInputArray))

        /**
         * Alias for calling [input] with
         * `Input.ofEmbeddingRequestInputArray(embeddingRequestInputArray)`.
         */
        fun inputOfEmbeddingRequestInputArray(embeddingRequestInputArray: List<List<Long>>) =
            input(Input.ofEmbeddingRequestInputArray(embeddingRequestInputArray))

        /**
         * ID of the model to use. You can use the [List models](/docs/api-reference/models/list)
         * API to see all of your available models, or see our [Model overview](/docs/models) for
         * descriptions of them.
         */
        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

        /**
         * Sets [model] to an arbitrary [String].
         *
         * You should usually call [model] with a well-typed [Model] constant instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(value: String) = model(Model.of(value))

        /**
         * The number of dimensions the resulting output embeddings should have. Only supported in
         * `text-embedding-3` and later models.
         */
        fun dimensions(dimensions: Long) = dimensions(JsonField.of(dimensions))

        /**
         * Sets [Builder.dimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensions] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dimensions(dimensions: JsonField<Long>) = apply { this.dimensions = dimensions }

        /**
         * The format to return the embeddings in. Can be either `float` or
         * [`base64`](https://pypi.org/project/pybase64/).
         */
        fun encodingFormat(encodingFormat: EncodingFormat) =
            encodingFormat(JsonField.of(encodingFormat))

        /**
         * Sets [Builder.encodingFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encodingFormat] with a well-typed [EncodingFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun encodingFormat(encodingFormat: JsonField<EncodingFormat>) = apply {
            this.encodingFormat = encodingFormat
        }

        /**
         * A unique identifier representing your end-user, which can help OpenAI to monitor and
         * detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).
         */
        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

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
         * Returns an immutable instance of [CreateEmbeddingRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .input()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateEmbeddingRequest =
            CreateEmbeddingRequest(
                checkRequired("input", input),
                checkRequired("model", model),
                dimensions,
                encodingFormat,
                user,
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
    fun validate(): CreateEmbeddingRequest = apply {
        if (validated) {
            return@apply
        }

        input().validate()
        model()
        dimensions()
        encodingFormat()?.validate()
        user()
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
        (input.asKnown()?.validity() ?: 0) +
            (if (model.asKnown() == null) 0 else 1) +
            (if (dimensions.asKnown() == null) 0 else 1) +
            (encodingFormat.asKnown()?.validity() ?: 0) +
            (if (user.asKnown() == null) 0 else 1)

    /**
     * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a
     * single request, pass an array of strings or array of token arrays. The input must not exceed
     * the max input tokens for the model (8192 tokens for all embedding models), cannot be an empty
     * string, and any array must be 2048 dimensions or less.
     * [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken)
     * for counting tokens. In addition to the per-input token limit, all embedding models enforce a
     * maximum of 300,000 tokens summed across all inputs in a single request.
     */
    @JsonDeserialize(using = Input.Deserializer::class)
    @JsonSerialize(using = Input.Serializer::class)
    class Input
    private constructor(
        private val string: String? = null,
        private val embeddingRequestInputArray: List<String>? = null,
        private val embeddingRequestInputArray: List<Long>? = null,
        private val embeddingRequestInputArray: List<List<Long>>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun embeddingRequestInputArray(): List<String>? = embeddingRequestInputArray

        fun embeddingRequestInputArray(): List<Long>? = embeddingRequestInputArray

        fun embeddingRequestInputArray(): List<List<Long>>? = embeddingRequestInputArray

        fun isString(): Boolean = string != null

        fun isEmbeddingRequestInputArray(): Boolean = embeddingRequestInputArray != null

        fun isEmbeddingRequestInputArray(): Boolean = embeddingRequestInputArray != null

        fun isEmbeddingRequestInputArray(): Boolean = embeddingRequestInputArray != null

        fun asString(): String = string.getOrThrow("string")

        fun asEmbeddingRequestInputArray(): List<String> =
            embeddingRequestInputArray.getOrThrow("embeddingRequestInputArray")

        fun asEmbeddingRequestInputArray(): List<Long> =
            embeddingRequestInputArray.getOrThrow("embeddingRequestInputArray")

        fun asEmbeddingRequestInputArray(): List<List<Long>> =
            embeddingRequestInputArray.getOrThrow("embeddingRequestInputArray")

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
         * val result: String? = input.accept(object : Input.Visitor<String?> {
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
                embeddingRequestInputArray != null ->
                    visitor.visitEmbeddingRequestInputArray(embeddingRequestInputArray)
                embeddingRequestInputArray != null ->
                    visitor.visitEmbeddingRequestInputArray(embeddingRequestInputArray)
                embeddingRequestInputArray != null ->
                    visitor.visitEmbeddingRequestInputArray(embeddingRequestInputArray)
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
        fun validate(): Input = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitEmbeddingRequestInputArray(
                        embeddingRequestInputArray: List<String>
                    ) {}

                    override fun visitEmbeddingRequestInputArray(
                        embeddingRequestInputArray: List<Long>
                    ) {}

                    override fun visitEmbeddingRequestInputArray(
                        embeddingRequestInputArray: List<List<Long>>
                    ) {}
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

                    override fun visitEmbeddingRequestInputArray(
                        embeddingRequestInputArray: List<String>
                    ) = embeddingRequestInputArray.size

                    override fun visitEmbeddingRequestInputArray(
                        embeddingRequestInputArray: List<Long>
                    ) = embeddingRequestInputArray.size

                    override fun visitEmbeddingRequestInputArray(
                        embeddingRequestInputArray: List<List<Long>>
                    ) = embeddingRequestInputArray.sumOf { it.size.toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Input &&
                string == other.string &&
                embeddingRequestInputArray == other.embeddingRequestInputArray &&
                embeddingRequestInputArray == other.embeddingRequestInputArray &&
                embeddingRequestInputArray == other.embeddingRequestInputArray
        }

        override fun hashCode(): Int =
            Objects.hash(
                string,
                embeddingRequestInputArray,
                embeddingRequestInputArray,
                embeddingRequestInputArray,
            )

        override fun toString(): String =
            when {
                string != null -> "Input{string=$string}"
                embeddingRequestInputArray != null ->
                    "Input{embeddingRequestInputArray=$embeddingRequestInputArray}"
                embeddingRequestInputArray != null ->
                    "Input{embeddingRequestInputArray=$embeddingRequestInputArray}"
                embeddingRequestInputArray != null ->
                    "Input{embeddingRequestInputArray=$embeddingRequestInputArray}"
                _json != null -> "Input{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Input")
            }

        companion object {

            fun ofString(string: String) = Input(string = string)

            fun ofEmbeddingRequestInputArray(embeddingRequestInputArray: List<String>) =
                Input(embeddingRequestInputArray = embeddingRequestInputArray.toImmutable())

            fun ofEmbeddingRequestInputArray(embeddingRequestInputArray: List<Long>) =
                Input(embeddingRequestInputArray = embeddingRequestInputArray.toImmutable())

            fun ofEmbeddingRequestInputArray(embeddingRequestInputArray: List<List<Long>>) =
                Input(embeddingRequestInputArray = embeddingRequestInputArray.toImmutable())
        }

        /** An interface that defines how to map each variant of [Input] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitEmbeddingRequestInputArray(embeddingRequestInputArray: List<String>): T

            fun visitEmbeddingRequestInputArray(embeddingRequestInputArray: List<Long>): T

            fun visitEmbeddingRequestInputArray(embeddingRequestInputArray: List<List<Long>>): T

            /**
             * Maps an unknown variant of [Input] to a value of type [T].
             *
             * An instance of [Input] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Input: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Input>(Input::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Input {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Input(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Input(embeddingRequestInputArray = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<Long>>())?.let {
                                Input(embeddingRequestInputArray = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<List<Long>>>())?.let {
                                Input(embeddingRequestInputArray = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Input(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Input>(Input::class) {

            override fun serialize(
                value: Input,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.embeddingRequestInputArray != null ->
                        generator.writeObject(value.embeddingRequestInputArray)
                    value.embeddingRequestInputArray != null ->
                        generator.writeObject(value.embeddingRequestInputArray)
                    value.embeddingRequestInputArray != null ->
                        generator.writeObject(value.embeddingRequestInputArray)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Input")
                }
            }
        }
    }

    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to
     * see all of your available models, or see our [Model overview](/docs/models) for descriptions
     * of them.
     */
    class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val TEXT_EMBEDDING_ADA_002 = of("text-embedding-ada-002")

            val TEXT_EMBEDDING_3_SMALL = of("text-embedding-3-small")

            val TEXT_EMBEDDING_3_LARGE = of("text-embedding-3-large")

            fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            TEXT_EMBEDDING_ADA_002,
            TEXT_EMBEDDING_3_SMALL,
            TEXT_EMBEDDING_3_LARGE,
        }

        /**
         * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Model] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEXT_EMBEDDING_ADA_002,
            TEXT_EMBEDDING_3_SMALL,
            TEXT_EMBEDDING_3_LARGE,
            /** An enum member indicating that [Model] was instantiated with an unknown value. */
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
                TEXT_EMBEDDING_ADA_002 -> Value.TEXT_EMBEDDING_ADA_002
                TEXT_EMBEDDING_3_SMALL -> Value.TEXT_EMBEDDING_3_SMALL
                TEXT_EMBEDDING_3_LARGE -> Value.TEXT_EMBEDDING_3_LARGE
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
                TEXT_EMBEDDING_ADA_002 -> Known.TEXT_EMBEDDING_ADA_002
                TEXT_EMBEDDING_3_SMALL -> Known.TEXT_EMBEDDING_3_SMALL
                TEXT_EMBEDDING_3_LARGE -> Known.TEXT_EMBEDDING_3_LARGE
                else -> throw DedalusInvalidDataException("Unknown Model: $value")
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
        fun validate(): Model = apply {
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

            return other is Model && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The format to return the embeddings in. Can be either `float` or
     * [`base64`](https://pypi.org/project/pybase64/).
     */
    class EncodingFormat @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val FLOAT = of("float")

            val BASE64 = of("base64")

            fun of(value: String) = EncodingFormat(JsonField.of(value))
        }

        /** An enum containing [EncodingFormat]'s known values. */
        enum class Known {
            FLOAT,
            BASE64,
        }

        /**
         * An enum containing [EncodingFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EncodingFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FLOAT,
            BASE64,
            /**
             * An enum member indicating that [EncodingFormat] was instantiated with an unknown
             * value.
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
                FLOAT -> Value.FLOAT
                BASE64 -> Value.BASE64
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
                FLOAT -> Known.FLOAT
                BASE64 -> Known.BASE64
                else -> throw DedalusInvalidDataException("Unknown EncodingFormat: $value")
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
        fun validate(): EncodingFormat = apply {
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

            return other is EncodingFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateEmbeddingRequest &&
            input == other.input &&
            model == other.model &&
            dimensions == other.dimensions &&
            encodingFormat == other.encodingFormat &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(input, model, dimensions, encodingFormat, user, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateEmbeddingRequest{input=$input, model=$model, dimensions=$dimensions, encodingFormat=$encodingFormat, user=$user, additionalProperties=$additionalProperties}"
}
