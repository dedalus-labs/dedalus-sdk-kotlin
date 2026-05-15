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
 * Schema for ChatCompletionRequestToolMessage.
 *
 * Fields:
 * - role (required): Literal["tool"]
 * - content (required): str | Annotated[list[ChatCompletionRequestToolMessageContentPart],
 *   MinLen(1), ArrayTitle("ChatCompletionRequestToolMessageContentArray")]
 * - tool_call_id (required): str
 */
class ChatCompletionToolMessageParam
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<Content>,
    private val role: JsonValue,
    private val toolCallId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
        @JsonProperty("tool_call_id")
        @ExcludeMissing
        toolCallId: JsonField<String> = JsonMissing.of(),
    ) : this(content, role, toolCallId, mutableMapOf())

    /**
     * The contents of the tool message.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): Content = content.getRequired("content")

    /**
     * The role of the messages author, in this case `tool`.
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("tool")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /**
     * Tool call that this message is responding to.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

    /**
     * Returns the raw JSON value of [toolCallId].
     *
     * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_call_id") @ExcludeMissing fun _toolCallId(): JsonField<String> = toolCallId

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
         * [ChatCompletionToolMessageParam].
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * .toolCallId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionToolMessageParam]. */
    class Builder internal constructor() {

        private var content: JsonField<Content>? = null
        private var role: JsonValue = JsonValue.from("tool")
        private var toolCallId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionToolMessageParam: ChatCompletionToolMessageParam) = apply {
            content = chatCompletionToolMessageParam.content
            role = chatCompletionToolMessageParam.role
            toolCallId = chatCompletionToolMessageParam.toolCallId
            additionalProperties =
                chatCompletionToolMessageParam.additionalProperties.toMutableMap()
        }

        /** The contents of the tool message. */
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
         * `Content.ofChatCompletionRequestToolMessageContentArray(chatCompletionRequestToolMessageContentArray)`.
         */
        fun contentOfChatCompletionRequestToolMessageContentArray(
            chatCompletionRequestToolMessageContentArray: List<ChatCompletionContentPartTextParam>
        ) =
            content(
                Content.ofChatCompletionRequestToolMessageContentArray(
                    chatCompletionRequestToolMessageContentArray
                )
            )

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("tool")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun role(role: JsonValue) = apply { this.role = role }

        /** Tool call that this message is responding to. */
        fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

        /**
         * Sets [Builder.toolCallId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolCallId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolCallId(toolCallId: JsonField<String>) = apply { this.toolCallId = toolCallId }

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
         * Returns an immutable instance of [ChatCompletionToolMessageParam].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * .toolCallId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionToolMessageParam =
            ChatCompletionToolMessageParam(
                checkRequired("content", content),
                role,
                checkRequired("toolCallId", toolCallId),
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
    fun validate(): ChatCompletionToolMessageParam = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        _role().let {
            if (it != JsonValue.from("tool")) {
                throw DedalusInvalidDataException("'role' is invalid, received $it")
            }
        }
        toolCallId()
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
            role.let { if (it == JsonValue.from("tool")) 1 else 0 } +
            (if (toolCallId.asKnown() == null) 0 else 1)

    /** The contents of the tool message. */
    @JsonDeserialize(using = Content.Deserializer::class)
    @JsonSerialize(using = Content.Serializer::class)
    class Content
    private constructor(
        private val string: String? = null,
        private val chatCompletionRequestToolMessageContentArray:
            List<ChatCompletionContentPartTextParam>? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun chatCompletionRequestToolMessageContentArray():
            List<ChatCompletionContentPartTextParam>? = chatCompletionRequestToolMessageContentArray

        fun isString(): Boolean = string != null

        fun isChatCompletionRequestToolMessageContentArray(): Boolean =
            chatCompletionRequestToolMessageContentArray != null

        fun asString(): String = string.getOrThrow("string")

        fun asChatCompletionRequestToolMessageContentArray():
            List<ChatCompletionContentPartTextParam> =
            chatCompletionRequestToolMessageContentArray.getOrThrow(
                "chatCompletionRequestToolMessageContentArray"
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
                chatCompletionRequestToolMessageContentArray != null ->
                    visitor.visitChatCompletionRequestToolMessageContentArray(
                        chatCompletionRequestToolMessageContentArray
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

                    override fun visitChatCompletionRequestToolMessageContentArray(
                        chatCompletionRequestToolMessageContentArray:
                            List<ChatCompletionContentPartTextParam>
                    ) {
                        chatCompletionRequestToolMessageContentArray.forEach { it.validate() }
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

                    override fun visitChatCompletionRequestToolMessageContentArray(
                        chatCompletionRequestToolMessageContentArray:
                            List<ChatCompletionContentPartTextParam>
                    ) = chatCompletionRequestToolMessageContentArray.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Content &&
                string == other.string &&
                chatCompletionRequestToolMessageContentArray ==
                    other.chatCompletionRequestToolMessageContentArray
        }

        override fun hashCode(): Int =
            Objects.hash(string, chatCompletionRequestToolMessageContentArray)

        override fun toString(): String =
            when {
                string != null -> "Content{string=$string}"
                chatCompletionRequestToolMessageContentArray != null ->
                    "Content{chatCompletionRequestToolMessageContentArray=$chatCompletionRequestToolMessageContentArray}"
                _json != null -> "Content{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Content")
            }

        companion object {

            fun ofString(string: String) = Content(string = string)

            fun ofChatCompletionRequestToolMessageContentArray(
                chatCompletionRequestToolMessageContentArray:
                    List<ChatCompletionContentPartTextParam>
            ) =
                Content(
                    chatCompletionRequestToolMessageContentArray =
                        chatCompletionRequestToolMessageContentArray.toImmutable()
                )
        }

        /**
         * An interface that defines how to map each variant of [Content] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitChatCompletionRequestToolMessageContentArray(
                chatCompletionRequestToolMessageContentArray:
                    List<ChatCompletionContentPartTextParam>
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
                                ?.let {
                                    Content(
                                        chatCompletionRequestToolMessageContentArray = it,
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
                    value.chatCompletionRequestToolMessageContentArray != null ->
                        generator.writeObject(value.chatCompletionRequestToolMessageContentArray)
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

        return other is ChatCompletionToolMessageParam &&
            content == other.content &&
            role == other.role &&
            toolCallId == other.toolCallId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(content, role, toolCallId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionToolMessageParam{content=$content, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
}
