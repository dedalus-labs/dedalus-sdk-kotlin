// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

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
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.dedalus_sdk.api.models.VoiceIdsOrCustomVoice
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
 * Parameters for audio output. Required when audio output is requested with `modalities:
 * ["audio"]`. [Learn more](/docs/guides/audio).
 *
 * Fields:
 * - voice (required): VoiceIdsOrCustomVoice
 * - format (required): Literal["wav", "aac", "mp3", "flac", "opus", "pcm16"]
 */
class ChatCompletionAudioParam
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val format: JsonField<Format>,
    private val voice: JsonField<Voice>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of(),
        @JsonProperty("voice") @ExcludeMissing voice: JsonField<Voice> = JsonMissing.of(),
    ) : this(format, voice, mutableMapOf())

    /**
     * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun format(): Format = format.getRequired("format")

    /**
     * The voice the model uses to respond. Supported built-in voices are `alloy`, `ash`, `ballad`,
     * `coral`, `echo`, `fable`, `nova`, `onyx`, `sage`, `shimmer`, `marin`, and `cedar`. You may
     * also provide a custom voice object with an `id`, for example `{ "id": "voice_1234" }`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voice(): Voice = voice.getRequired("voice")

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<Voice> = voice

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
         * Returns a mutable builder for constructing an instance of [ChatCompletionAudioParam].
         *
         * The following fields are required:
         * ```kotlin
         * .format()
         * .voice()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionAudioParam]. */
    class Builder internal constructor() {

        private var format: JsonField<Format>? = null
        private var voice: JsonField<Voice>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionAudioParam: ChatCompletionAudioParam) = apply {
            format = chatCompletionAudioParam.format
            voice = chatCompletionAudioParam.voice
            additionalProperties = chatCompletionAudioParam.additionalProperties.toMutableMap()
        }

        /**
         * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or
         * `pcm16`.
         */
        fun format(format: Format) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [Format] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<Format>) = apply { this.format = format }

        /**
         * The voice the model uses to respond. Supported built-in voices are `alloy`, `ash`,
         * `ballad`, `coral`, `echo`, `fable`, `nova`, `onyx`, `sage`, `shimmer`, `marin`, and
         * `cedar`. You may also provide a custom voice object with an `id`, for example `{ "id":
         * "voice_1234" }`.
         */
        fun voice(voice: Voice) = voice(JsonField.of(voice))

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [Voice] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<Voice>) = apply { this.voice = voice }

        /** Alias for calling [voice] with `Voice.ofString(string)`. */
        fun voice(string: String) = voice(Voice.ofString(string))

        /** Alias for calling [voice] with `Voice.ofUnionMember1(unionMember1)`. */
        fun voice(unionMember1: Voice.UnionMember1) = voice(Voice.ofUnionMember1(unionMember1))

        /** Alias for calling [voice] with `Voice.ofIdsOrCustom(idsOrCustom)`. */
        fun voice(idsOrCustom: VoiceIdsOrCustomVoice) = voice(Voice.ofIdsOrCustom(idsOrCustom))

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
         * Returns an immutable instance of [ChatCompletionAudioParam].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .format()
         * .voice()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionAudioParam =
            ChatCompletionAudioParam(
                checkRequired("format", format),
                checkRequired("voice", voice),
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
    fun validate(): ChatCompletionAudioParam = apply {
        if (validated) {
            return@apply
        }

        format().validate()
        voice().validate()
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
        (format.asKnown()?.validity() ?: 0) + (voice.asKnown()?.validity() ?: 0)

    /**
     * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`.
     */
    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val WAV = of("wav")

            val AAC = of("aac")

            val MP3 = of("mp3")

            val FLAC = of("flac")

            val OPUS = of("opus")

            val PCM16 = of("pcm16")

            fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            WAV,
            AAC,
            MP3,
            FLAC,
            OPUS,
            PCM16,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAV,
            AAC,
            MP3,
            FLAC,
            OPUS,
            PCM16,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
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
                WAV -> Value.WAV
                AAC -> Value.AAC
                MP3 -> Value.MP3
                FLAC -> Value.FLAC
                OPUS -> Value.OPUS
                PCM16 -> Value.PCM16
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
                WAV -> Known.WAV
                AAC -> Known.AAC
                MP3 -> Known.MP3
                FLAC -> Known.FLAC
                OPUS -> Known.OPUS
                PCM16 -> Known.PCM16
                else -> throw DedalusInvalidDataException("Unknown Format: $value")
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
        fun validate(): Format = apply {
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

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The voice the model uses to respond. Supported built-in voices are `alloy`, `ash`, `ballad`,
     * `coral`, `echo`, `fable`, `nova`, `onyx`, `sage`, `shimmer`, `marin`, and `cedar`. You may
     * also provide a custom voice object with an `id`, for example `{ "id": "voice_1234" }`.
     */
    @JsonDeserialize(using = Voice.Deserializer::class)
    @JsonSerialize(using = Voice.Serializer::class)
    class Voice
    private constructor(
        private val string: String? = null,
        private val unionMember1: UnionMember1? = null,
        private val idsOrCustom: VoiceIdsOrCustomVoice? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun unionMember1(): UnionMember1? = unionMember1

        /**
         * Custom voice reference.
         *
         * Fields:
         * - id (required): str
         */
        fun idsOrCustom(): VoiceIdsOrCustomVoice? = idsOrCustom

        fun isString(): Boolean = string != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun isIdsOrCustom(): Boolean = idsOrCustom != null

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        /**
         * Custom voice reference.
         *
         * Fields:
         * - id (required): str
         */
        fun asIdsOrCustom(): VoiceIdsOrCustomVoice = idsOrCustom.getOrThrow("idsOrCustom")

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
         * val result: String? = voice.accept(object : Voice.Visitor<String?> {
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
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                idsOrCustom != null -> visitor.visitIdsOrCustom(idsOrCustom)
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
        fun validate(): Voice = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }

                    override fun visitIdsOrCustom(idsOrCustom: VoiceIdsOrCustomVoice) {
                        idsOrCustom.validate()
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

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun visitIdsOrCustom(idsOrCustom: VoiceIdsOrCustomVoice) =
                        idsOrCustom.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Voice &&
                string == other.string &&
                unionMember1 == other.unionMember1 &&
                idsOrCustom == other.idsOrCustom
        }

        override fun hashCode(): Int = Objects.hash(string, unionMember1, idsOrCustom)

        override fun toString(): String =
            when {
                string != null -> "Voice{string=$string}"
                unionMember1 != null -> "Voice{unionMember1=$unionMember1}"
                idsOrCustom != null -> "Voice{idsOrCustom=$idsOrCustom}"
                _json != null -> "Voice{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Voice")
            }

        companion object {

            fun ofString(string: String) = Voice(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) = Voice(unionMember1 = unionMember1)

            /**
             * Custom voice reference.
             *
             * Fields:
             * - id (required): str
             */
            fun ofIdsOrCustom(idsOrCustom: VoiceIdsOrCustomVoice) = Voice(idsOrCustom = idsOrCustom)
        }

        /** An interface that defines how to map each variant of [Voice] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Custom voice reference.
             *
             * Fields:
             * - id (required): str
             */
            fun visitIdsOrCustom(idsOrCustom: VoiceIdsOrCustomVoice): T

            /**
             * Maps an unknown variant of [Voice] to a value of type [T].
             *
             * An instance of [Voice] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Voice: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Voice>(Voice::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Voice {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Voice(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<VoiceIdsOrCustomVoice>())?.let {
                                Voice(idsOrCustom = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Voice(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Voice(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Voice>(Voice::class) {

            override fun serialize(
                value: Voice,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value.idsOrCustom != null -> generator.writeObject(value.idsOrCustom)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Voice")
                }
            }
        }

        class UnionMember1 @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ALLOY = of("alloy")

                val ASH = of("ash")

                val BALLAD = of("ballad")

                val CORAL = of("coral")

                val ECHO = of("echo")

                val SAGE = of("sage")

                val SHIMMER = of("shimmer")

                val VERSE = of("verse")

                val MARIN = of("marin")

                val CEDAR = of("cedar")

                fun of(value: String) = UnionMember1(JsonField.of(value))
            }

            /** An enum containing [UnionMember1]'s known values. */
            enum class Known {
                ALLOY,
                ASH,
                BALLAD,
                CORAL,
                ECHO,
                SAGE,
                SHIMMER,
                VERSE,
                MARIN,
                CEDAR,
            }

            /**
             * An enum containing [UnionMember1]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UnionMember1] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALLOY,
                ASH,
                BALLAD,
                CORAL,
                ECHO,
                SAGE,
                SHIMMER,
                VERSE,
                MARIN,
                CEDAR,
                /**
                 * An enum member indicating that [UnionMember1] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ALLOY -> Value.ALLOY
                    ASH -> Value.ASH
                    BALLAD -> Value.BALLAD
                    CORAL -> Value.CORAL
                    ECHO -> Value.ECHO
                    SAGE -> Value.SAGE
                    SHIMMER -> Value.SHIMMER
                    VERSE -> Value.VERSE
                    MARIN -> Value.MARIN
                    CEDAR -> Value.CEDAR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DedalusInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ALLOY -> Known.ALLOY
                    ASH -> Known.ASH
                    BALLAD -> Known.BALLAD
                    CORAL -> Known.CORAL
                    ECHO -> Known.ECHO
                    SAGE -> Known.SAGE
                    SHIMMER -> Known.SHIMMER
                    VERSE -> Known.VERSE
                    MARIN -> Known.MARIN
                    CEDAR -> Known.CEDAR
                    else -> throw DedalusInvalidDataException("Unknown UnionMember1: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DedalusInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): UnionMember1 = apply {
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

                return other is UnionMember1 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCompletionAudioParam &&
            format == other.format &&
            voice == other.voice &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(format, voice, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionAudioParam{format=$format, voice=$voice, additionalProperties=$additionalProperties}"
}
