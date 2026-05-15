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
 * Messages sent by an end user, containing prompts or additional context information.
 *
 * Fields:
 * - content (required): str | Annotated[list[ChatCompletionRequestUserMessageContentPart],
 *   MinLen(1), ArrayTitle("ChatCompletionRequestUserMessageContentArray")]
 * - role (required): Literal["user"]
 * - name (optional): str
 */
class ChatCompletionUserMessageParam
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<Content>,
    private val role: JsonValue,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(content, role, name, mutableMapOf())

    /**
     * The contents of the user message.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): Content = content.getRequired("content")

    /**
     * The role of the messages author, in this case `user`.
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("user")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /**
     * An optional name for the participant. Provides the model information to differentiate between
     * participants of the same role.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of
         * [ChatCompletionUserMessageParam].
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionUserMessageParam]. */
    class Builder internal constructor() {

        private var content: JsonField<Content>? = null
        private var role: JsonValue = JsonValue.from("user")
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionUserMessageParam: ChatCompletionUserMessageParam) = apply {
            content = chatCompletionUserMessageParam.content
            role = chatCompletionUserMessageParam.role
            name = chatCompletionUserMessageParam.name
            additionalProperties =
                chatCompletionUserMessageParam.additionalProperties.toMutableMap()
        }

        /** The contents of the user message. */
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
         * `Content.ofChatCompletionRequestUserMessageContentArray(chatCompletionRequestUserMessageContentArray)`.
         */
        fun contentOfChatCompletionRequestUserMessageContentArray(
            chatCompletionRequestUserMessageContentArray:
                List<Content.UnnamedSchemaWithArrayParent2>
        ) =
            content(
                Content.ofChatCompletionRequestUserMessageContentArray(
                    chatCompletionRequestUserMessageContentArray
                )
            )

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("user")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun role(role: JsonValue) = apply { this.role = role }

        /**
         * An optional name for the participant. Provides the model information to differentiate
         * between participants of the same role.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [ChatCompletionUserMessageParam].
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
        fun build(): ChatCompletionUserMessageParam =
            ChatCompletionUserMessageParam(
                checkRequired("content", content),
                role,
                name,
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
    fun validate(): ChatCompletionUserMessageParam = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        _role().let {
            if (it != JsonValue.from("user")) {
                throw DedalusInvalidDataException("'role' is invalid, received $it")
            }
        }
        name()
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
            role.let { if (it == JsonValue.from("user")) 1 else 0 } +
            (if (name.asKnown() == null) 0 else 1)

    /** The contents of the user message. */
    @JsonDeserialize(using = Content.Deserializer::class)
    @JsonSerialize(using = Content.Serializer::class)
    class Content
    private constructor(
        private val string: String? = null,
        private val chatCompletionRequestUserMessageContentArray:
            List<UnnamedSchemaWithArrayParent2>? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun chatCompletionRequestUserMessageContentArray(): List<UnnamedSchemaWithArrayParent2>? =
            chatCompletionRequestUserMessageContentArray

        fun isString(): Boolean = string != null

        fun isChatCompletionRequestUserMessageContentArray(): Boolean =
            chatCompletionRequestUserMessageContentArray != null

        fun asString(): String = string.getOrThrow("string")

        fun asChatCompletionRequestUserMessageContentArray(): List<UnnamedSchemaWithArrayParent2> =
            chatCompletionRequestUserMessageContentArray.getOrThrow(
                "chatCompletionRequestUserMessageContentArray"
            )

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
                chatCompletionRequestUserMessageContentArray != null ->
                    visitor.visitChatCompletionRequestUserMessageContentArray(
                        chatCompletionRequestUserMessageContentArray
                    )
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

                    override fun visitChatCompletionRequestUserMessageContentArray(
                        chatCompletionRequestUserMessageContentArray:
                            List<UnnamedSchemaWithArrayParent2>
                    ) {
                        chatCompletionRequestUserMessageContentArray.forEach { it.validate() }
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

                    override fun visitChatCompletionRequestUserMessageContentArray(
                        chatCompletionRequestUserMessageContentArray:
                            List<UnnamedSchemaWithArrayParent2>
                    ) = chatCompletionRequestUserMessageContentArray.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Content &&
                string == other.string &&
                chatCompletionRequestUserMessageContentArray ==
                    other.chatCompletionRequestUserMessageContentArray
        }

        override fun hashCode(): Int =
            Objects.hash(string, chatCompletionRequestUserMessageContentArray)

        override fun toString(): String =
            when {
                string != null -> "Content{string=$string}"
                chatCompletionRequestUserMessageContentArray != null ->
                    "Content{chatCompletionRequestUserMessageContentArray=$chatCompletionRequestUserMessageContentArray}"
                _json != null -> "Content{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Content")
            }

        companion object {

            fun ofString(string: String) = Content(string = string)

            fun ofChatCompletionRequestUserMessageContentArray(
                chatCompletionRequestUserMessageContentArray: List<UnnamedSchemaWithArrayParent2>
            ) =
                Content(
                    chatCompletionRequestUserMessageContentArray =
                        chatCompletionRequestUserMessageContentArray.toImmutable()
                )
        }

        /**
         * An interface that defines how to map each variant of [Content] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitChatCompletionRequestUserMessageContentArray(
                chatCompletionRequestUserMessageContentArray: List<UnnamedSchemaWithArrayParent2>
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
                                    jacksonTypeRef<List<UnnamedSchemaWithArrayParent2>>(),
                                )
                                ?.let {
                                    Content(
                                        chatCompletionRequestUserMessageContentArray = it,
                                        _json = json,
                                    )
                                },
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
                    value.chatCompletionRequestUserMessageContentArray != null ->
                        generator.writeObject(value.chatCompletionRequestUserMessageContentArray)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Content")
                }
            }
        }

        /**
         * Learn about [text inputs](/docs/guides/text-generation).
         *
         * Fields:
         * - type (required): Literal["text"]
         * - text (required): str
         */
        @JsonDeserialize(using = UnnamedSchemaWithArrayParent2.Deserializer::class)
        @JsonSerialize(using = UnnamedSchemaWithArrayParent2.Serializer::class)
        class UnnamedSchemaWithArrayParent2
        private constructor(
            private val text: ChatCompletionContentPartTextParam? = null,
            private val imageUrl: ChatCompletionContentPartImageParam? = null,
            private val inputAudio: ChatCompletionContentPartInputAudioParam? = null,
            private val file: ChatCompletionContentPartFileParam? = null,
            private val _json: JsonValue? = null,
        ) {

            /**
             * Learn about [text inputs](/docs/guides/text-generation).
             *
             * Fields:
             * - type (required): Literal["text"]
             * - text (required): str
             */
            fun text(): ChatCompletionContentPartTextParam? = text

            /**
             * Learn about [image inputs](/docs/guides/vision).
             *
             * Fields:
             * - type (required): Literal["image_url"]
             * - image_url (required): ImageUrl
             */
            fun imageUrl(): ChatCompletionContentPartImageParam? = imageUrl

            /**
             * Learn about [audio inputs](/docs/guides/audio).
             *
             * Fields:
             * - type (required): Literal["input_audio"]
             * - input_audio (required): InputAudio
             */
            fun inputAudio(): ChatCompletionContentPartInputAudioParam? = inputAudio

            /**
             * Learn about [file inputs](/docs/guides/text) for text generation.
             *
             * Fields:
             * - type (required): Literal["file"]
             * - file (required): File
             */
            fun file(): ChatCompletionContentPartFileParam? = file

            fun isText(): Boolean = text != null

            fun isImageUrl(): Boolean = imageUrl != null

            fun isInputAudio(): Boolean = inputAudio != null

            fun isFile(): Boolean = file != null

            /**
             * Learn about [text inputs](/docs/guides/text-generation).
             *
             * Fields:
             * - type (required): Literal["text"]
             * - text (required): str
             */
            fun asText(): ChatCompletionContentPartTextParam = text.getOrThrow("text")

            /**
             * Learn about [image inputs](/docs/guides/vision).
             *
             * Fields:
             * - type (required): Literal["image_url"]
             * - image_url (required): ImageUrl
             */
            fun asImageUrl(): ChatCompletionContentPartImageParam = imageUrl.getOrThrow("imageUrl")

            /**
             * Learn about [audio inputs](/docs/guides/audio).
             *
             * Fields:
             * - type (required): Literal["input_audio"]
             * - input_audio (required): InputAudio
             */
            fun asInputAudio(): ChatCompletionContentPartInputAudioParam =
                inputAudio.getOrThrow("inputAudio")

            /**
             * Learn about [file inputs](/docs/guides/text) for text generation.
             *
             * Fields:
             * - type (required): Literal["file"]
             * - file (required): File
             */
            fun asFile(): ChatCompletionContentPartFileParam = file.getOrThrow("file")

            fun _json(): JsonValue? = _json

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```kotlin
             * import com.dedalus_sdk.api.core.JsonValue
             *
             * val result: String? = unnamedSchemaWithArrayParent2.accept(object : UnnamedSchemaWithArrayParent2.Visitor<String?> {
             *     override fun visitText(text: ChatCompletionContentPartTextParam): String? = text.toString()
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
             * @throws DedalusInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    text != null -> visitor.visitText(text)
                    imageUrl != null -> visitor.visitImageUrl(imageUrl)
                    inputAudio != null -> visitor.visitInputAudio(inputAudio)
                    file != null -> visitor.visitFile(file)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DedalusInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): UnnamedSchemaWithArrayParent2 = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitText(text: ChatCompletionContentPartTextParam) {
                            text.validate()
                        }

                        override fun visitImageUrl(imageUrl: ChatCompletionContentPartImageParam) {
                            imageUrl.validate()
                        }

                        override fun visitInputAudio(
                            inputAudio: ChatCompletionContentPartInputAudioParam
                        ) {
                            inputAudio.validate()
                        }

                        override fun visitFile(file: ChatCompletionContentPartFileParam) {
                            file.validate()
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
                        override fun visitText(text: ChatCompletionContentPartTextParam) =
                            text.validity()

                        override fun visitImageUrl(imageUrl: ChatCompletionContentPartImageParam) =
                            imageUrl.validity()

                        override fun visitInputAudio(
                            inputAudio: ChatCompletionContentPartInputAudioParam
                        ) = inputAudio.validity()

                        override fun visitFile(file: ChatCompletionContentPartFileParam) =
                            file.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnnamedSchemaWithArrayParent2 &&
                    text == other.text &&
                    imageUrl == other.imageUrl &&
                    inputAudio == other.inputAudio &&
                    file == other.file
            }

            override fun hashCode(): Int = Objects.hash(text, imageUrl, inputAudio, file)

            override fun toString(): String =
                when {
                    text != null -> "UnnamedSchemaWithArrayParent2{text=$text}"
                    imageUrl != null -> "UnnamedSchemaWithArrayParent2{imageUrl=$imageUrl}"
                    inputAudio != null -> "UnnamedSchemaWithArrayParent2{inputAudio=$inputAudio}"
                    file != null -> "UnnamedSchemaWithArrayParent2{file=$file}"
                    _json != null -> "UnnamedSchemaWithArrayParent2{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent2")
                }

            companion object {

                /**
                 * Learn about [text inputs](/docs/guides/text-generation).
                 *
                 * Fields:
                 * - type (required): Literal["text"]
                 * - text (required): str
                 */
                fun ofText(text: ChatCompletionContentPartTextParam) =
                    UnnamedSchemaWithArrayParent2(text = text)

                /**
                 * Learn about [image inputs](/docs/guides/vision).
                 *
                 * Fields:
                 * - type (required): Literal["image_url"]
                 * - image_url (required): ImageUrl
                 */
                fun ofImageUrl(imageUrl: ChatCompletionContentPartImageParam) =
                    UnnamedSchemaWithArrayParent2(imageUrl = imageUrl)

                /**
                 * Learn about [audio inputs](/docs/guides/audio).
                 *
                 * Fields:
                 * - type (required): Literal["input_audio"]
                 * - input_audio (required): InputAudio
                 */
                fun ofInputAudio(inputAudio: ChatCompletionContentPartInputAudioParam) =
                    UnnamedSchemaWithArrayParent2(inputAudio = inputAudio)

                /**
                 * Learn about [file inputs](/docs/guides/text) for text generation.
                 *
                 * Fields:
                 * - type (required): Literal["file"]
                 * - file (required): File
                 */
                fun ofFile(file: ChatCompletionContentPartFileParam) =
                    UnnamedSchemaWithArrayParent2(file = file)
            }

            /**
             * An interface that defines how to map each variant of [UnnamedSchemaWithArrayParent2]
             * to a value of type [T].
             */
            interface Visitor<out T> {

                /**
                 * Learn about [text inputs](/docs/guides/text-generation).
                 *
                 * Fields:
                 * - type (required): Literal["text"]
                 * - text (required): str
                 */
                fun visitText(text: ChatCompletionContentPartTextParam): T

                /**
                 * Learn about [image inputs](/docs/guides/vision).
                 *
                 * Fields:
                 * - type (required): Literal["image_url"]
                 * - image_url (required): ImageUrl
                 */
                fun visitImageUrl(imageUrl: ChatCompletionContentPartImageParam): T

                /**
                 * Learn about [audio inputs](/docs/guides/audio).
                 *
                 * Fields:
                 * - type (required): Literal["input_audio"]
                 * - input_audio (required): InputAudio
                 */
                fun visitInputAudio(inputAudio: ChatCompletionContentPartInputAudioParam): T

                /**
                 * Learn about [file inputs](/docs/guides/text) for text generation.
                 *
                 * Fields:
                 * - type (required): Literal["file"]
                 * - file (required): File
                 */
                fun visitFile(file: ChatCompletionContentPartFileParam): T

                /**
                 * Maps an unknown variant of [UnnamedSchemaWithArrayParent2] to a value of type
                 * [T].
                 *
                 * An instance of [UnnamedSchemaWithArrayParent2] can contain an unknown variant if
                 * it was deserialized from data that doesn't match any known variant. For example,
                 * if the SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws DedalusInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw DedalusInvalidDataException(
                        "Unknown UnnamedSchemaWithArrayParent2: $json"
                    )
                }
            }

            internal class Deserializer :
                BaseDeserializer<UnnamedSchemaWithArrayParent2>(
                    UnnamedSchemaWithArrayParent2::class
                ) {

                override fun ObjectCodec.deserialize(
                    node: JsonNode
                ): UnnamedSchemaWithArrayParent2 {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject()?.get("type")?.asString()

                    when (type) {
                        "text" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<ChatCompletionContentPartTextParam>(),
                                )
                                ?.let { UnnamedSchemaWithArrayParent2(text = it, _json = json) }
                                ?: UnnamedSchemaWithArrayParent2(_json = json)
                        }
                        "image_url" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<ChatCompletionContentPartImageParam>(),
                                )
                                ?.let { UnnamedSchemaWithArrayParent2(imageUrl = it, _json = json) }
                                ?: UnnamedSchemaWithArrayParent2(_json = json)
                        }
                        "input_audio" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<ChatCompletionContentPartInputAudioParam>(),
                                )
                                ?.let {
                                    UnnamedSchemaWithArrayParent2(inputAudio = it, _json = json)
                                } ?: UnnamedSchemaWithArrayParent2(_json = json)
                        }
                        "file" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<ChatCompletionContentPartFileParam>(),
                                )
                                ?.let { UnnamedSchemaWithArrayParent2(file = it, _json = json) }
                                ?: UnnamedSchemaWithArrayParent2(_json = json)
                        }
                    }

                    return UnnamedSchemaWithArrayParent2(_json = json)
                }
            }

            internal class Serializer :
                BaseSerializer<UnnamedSchemaWithArrayParent2>(
                    UnnamedSchemaWithArrayParent2::class
                ) {

                override fun serialize(
                    value: UnnamedSchemaWithArrayParent2,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.text != null -> generator.writeObject(value.text)
                        value.imageUrl != null -> generator.writeObject(value.imageUrl)
                        value.inputAudio != null -> generator.writeObject(value.inputAudio)
                        value.file != null -> generator.writeObject(value.file)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent2")
                    }
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCompletionUserMessageParam &&
            content == other.content &&
            role == other.role &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(content, role, name, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionUserMessageParam{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
}
