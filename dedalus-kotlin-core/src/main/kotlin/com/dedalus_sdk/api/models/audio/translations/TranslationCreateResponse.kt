// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.audio.translations

import com.dedalus_sdk.api.core.BaseDeserializer
import com.dedalus_sdk.api.core.BaseSerializer
import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.allMaxBy
import com.dedalus_sdk.api.core.checkKnown
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
 * Fields: # noqa: D415.
 * - language (required): str
 * - duration (required): float
 * - text (required): str
 * - segments (optional): list[TranscriptionSegment]
 */
@JsonDeserialize(using = TranslationCreateResponse.Deserializer::class)
@JsonSerialize(using = TranslationCreateResponse.Serializer::class)
class TranslationCreateResponse
private constructor(
    private val createTranslationResponseVerboseJson: CreateTranslationResponseVerboseJson? = null,
    private val createTranslationResponseJson: CreateTranslationResponseJson? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Fields: # noqa: D415.
     * - language (required): str
     * - duration (required): float
     * - text (required): str
     * - segments (optional): list[TranscriptionSegment]
     */
    fun createTranslationResponseVerboseJson(): CreateTranslationResponseVerboseJson? =
        createTranslationResponseVerboseJson

    /**
     * Fields: # noqa: D415.
     * - text (required): str
     */
    fun createTranslationResponseJson(): CreateTranslationResponseJson? =
        createTranslationResponseJson

    fun isCreateTranslationResponseVerboseJson(): Boolean =
        createTranslationResponseVerboseJson != null

    fun isCreateTranslationResponseJson(): Boolean = createTranslationResponseJson != null

    /**
     * Fields: # noqa: D415.
     * - language (required): str
     * - duration (required): float
     * - text (required): str
     * - segments (optional): list[TranscriptionSegment]
     */
    fun asCreateTranslationResponseVerboseJson(): CreateTranslationResponseVerboseJson =
        createTranslationResponseVerboseJson.getOrThrow("createTranslationResponseVerboseJson")

    /**
     * Fields: # noqa: D415.
     * - text (required): str
     */
    fun asCreateTranslationResponseJson(): CreateTranslationResponseJson =
        createTranslationResponseJson.getOrThrow("createTranslationResponseJson")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.dedalus_sdk.api.core.JsonValue
     *
     * val result: String? = translationCreateResponse.accept(object : TranslationCreateResponse.Visitor<String?> {
     *     override fun visitCreateTranslationResponseVerboseJson(createTranslationResponseVerboseJson: CreateTranslationResponseVerboseJson): String? = createTranslationResponseVerboseJson.toString()
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
     * @throws DedalusInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            createTranslationResponseVerboseJson != null ->
                visitor.visitCreateTranslationResponseVerboseJson(
                    createTranslationResponseVerboseJson
                )
            createTranslationResponseJson != null ->
                visitor.visitCreateTranslationResponseJson(createTranslationResponseJson)
            else -> visitor.unknown(_json)
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
    fun validate(): TranslationCreateResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitCreateTranslationResponseVerboseJson(
                    createTranslationResponseVerboseJson: CreateTranslationResponseVerboseJson
                ) {
                    createTranslationResponseVerboseJson.validate()
                }

                override fun visitCreateTranslationResponseJson(
                    createTranslationResponseJson: CreateTranslationResponseJson
                ) {
                    createTranslationResponseJson.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitCreateTranslationResponseVerboseJson(
                    createTranslationResponseVerboseJson: CreateTranslationResponseVerboseJson
                ) = createTranslationResponseVerboseJson.validity()

                override fun visitCreateTranslationResponseJson(
                    createTranslationResponseJson: CreateTranslationResponseJson
                ) = createTranslationResponseJson.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranslationCreateResponse &&
            createTranslationResponseVerboseJson == other.createTranslationResponseVerboseJson &&
            createTranslationResponseJson == other.createTranslationResponseJson
    }

    override fun hashCode(): Int =
        Objects.hash(createTranslationResponseVerboseJson, createTranslationResponseJson)

    override fun toString(): String =
        when {
            createTranslationResponseVerboseJson != null ->
                "TranslationCreateResponse{createTranslationResponseVerboseJson=$createTranslationResponseVerboseJson}"
            createTranslationResponseJson != null ->
                "TranslationCreateResponse{createTranslationResponseJson=$createTranslationResponseJson}"
            _json != null -> "TranslationCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TranslationCreateResponse")
        }

    companion object {

        /**
         * Fields: # noqa: D415.
         * - language (required): str
         * - duration (required): float
         * - text (required): str
         * - segments (optional): list[TranscriptionSegment]
         */
        fun ofCreateTranslationResponseVerboseJson(
            createTranslationResponseVerboseJson: CreateTranslationResponseVerboseJson
        ) =
            TranslationCreateResponse(
                createTranslationResponseVerboseJson = createTranslationResponseVerboseJson
            )

        /**
         * Fields: # noqa: D415.
         * - text (required): str
         */
        fun ofCreateTranslationResponseJson(
            createTranslationResponseJson: CreateTranslationResponseJson
        ) = TranslationCreateResponse(createTranslationResponseJson = createTranslationResponseJson)
    }

    /**
     * An interface that defines how to map each variant of [TranslationCreateResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /**
         * Fields: # noqa: D415.
         * - language (required): str
         * - duration (required): float
         * - text (required): str
         * - segments (optional): list[TranscriptionSegment]
         */
        fun visitCreateTranslationResponseVerboseJson(
            createTranslationResponseVerboseJson: CreateTranslationResponseVerboseJson
        ): T

        /**
         * Fields: # noqa: D415.
         * - text (required): str
         */
        fun visitCreateTranslationResponseJson(
            createTranslationResponseJson: CreateTranslationResponseJson
        ): T

        /**
         * Maps an unknown variant of [TranslationCreateResponse] to a value of type [T].
         *
         * An instance of [TranslationCreateResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws DedalusInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DedalusInvalidDataException("Unknown TranslationCreateResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TranslationCreateResponse>(TranslationCreateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TranslationCreateResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<CreateTranslationResponseVerboseJson>())
                            ?.let {
                                TranslationCreateResponse(
                                    createTranslationResponseVerboseJson = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CreateTranslationResponseJson>())?.let {
                            TranslationCreateResponse(
                                createTranslationResponseJson = it,
                                _json = json,
                            )
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> TranslationCreateResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<TranslationCreateResponse>(TranslationCreateResponse::class) {

        override fun serialize(
            value: TranslationCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.createTranslationResponseVerboseJson != null ->
                    generator.writeObject(value.createTranslationResponseVerboseJson)
                value.createTranslationResponseJson != null ->
                    generator.writeObject(value.createTranslationResponseJson)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TranslationCreateResponse")
            }
        }
    }

    /**
     * Fields: # noqa: D415.
     * - language (required): str
     * - duration (required): float
     * - text (required): str
     * - segments (optional): list[TranscriptionSegment]
     */
    class CreateTranslationResponseVerboseJson
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val duration: JsonField<Double>,
        private val language: JsonField<String>,
        private val text: JsonField<String>,
        private val segments: JsonField<List<Segment>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segments")
            @ExcludeMissing
            segments: JsonField<List<Segment>> = JsonMissing.of(),
        ) : this(duration, language, text, segments, mutableMapOf())

        /**
         * The duration of the input audio.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun duration(): Double = duration.getRequired("duration")

        /**
         * The language of the output translation (always `english`).
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun language(): String = language.getRequired("language")

        /**
         * The translated text.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Segments of the translated text and their corresponding details.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun segments(): List<Segment>? = segments.getNullable("segments")

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [segments].
         *
         * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segments")
        @ExcludeMissing
        fun _segments(): JsonField<List<Segment>> = segments

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
             * [CreateTranslationResponseVerboseJson].
             *
             * The following fields are required:
             * ```kotlin
             * .duration()
             * .language()
             * .text()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreateTranslationResponseVerboseJson]. */
        class Builder internal constructor() {

            private var duration: JsonField<Double>? = null
            private var language: JsonField<String>? = null
            private var text: JsonField<String>? = null
            private var segments: JsonField<MutableList<Segment>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                createTranslationResponseVerboseJson: CreateTranslationResponseVerboseJson
            ) = apply {
                duration = createTranslationResponseVerboseJson.duration
                language = createTranslationResponseVerboseJson.language
                text = createTranslationResponseVerboseJson.text
                segments = createTranslationResponseVerboseJson.segments.map { it.toMutableList() }
                additionalProperties =
                    createTranslationResponseVerboseJson.additionalProperties.toMutableMap()
            }

            /** The duration of the input audio. */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            /** The language of the output translation (always `english`). */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** The translated text. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Segments of the translated text and their corresponding details. */
            fun segments(segments: List<Segment>) = segments(JsonField.of(segments))

            /**
             * Sets [Builder.segments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segments] with a well-typed `List<Segment>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segments(segments: JsonField<List<Segment>>) = apply {
                this.segments = segments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Segment] to [segments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSegment(segment: Segment) = apply {
                segments =
                    (segments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("segments", it).add(segment)
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
             * Returns an immutable instance of [CreateTranslationResponseVerboseJson].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .duration()
             * .language()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreateTranslationResponseVerboseJson =
                CreateTranslationResponseVerboseJson(
                    checkRequired("duration", duration),
                    checkRequired("language", language),
                    checkRequired("text", text),
                    (segments ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): CreateTranslationResponseVerboseJson = apply {
            if (validated) {
                return@apply
            }

            duration()
            language()
            text()
            segments()?.forEach { it.validate() }
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
            (if (duration.asKnown() == null) 0 else 1) +
                (if (language.asKnown() == null) 0 else 1) +
                (if (text.asKnown() == null) 0 else 1) +
                (segments.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * Fields: # noqa: D415.
         * - id (required): int
         * - seek (required): int
         * - start (required): float
         * - end (required): float
         * - text (required): str
         * - tokens (required): list[int]
         * - temperature (required): float
         * - avg_logprob (required): float
         * - compression_ratio (required): float
         * - no_speech_prob (required): float
         */
        class Segment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<Long>,
            private val avgLogprob: JsonField<Double>,
            private val compressionRatio: JsonField<Double>,
            private val end: JsonField<Double>,
            private val noSpeechProb: JsonField<Double>,
            private val seek: JsonField<Long>,
            private val start: JsonField<Double>,
            private val temperature: JsonField<Double>,
            private val text: JsonField<String>,
            private val tokens: JsonField<List<Long>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("avg_logprob")
                @ExcludeMissing
                avgLogprob: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("compression_ratio")
                @ExcludeMissing
                compressionRatio: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("end") @ExcludeMissing end: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("no_speech_prob")
                @ExcludeMissing
                noSpeechProb: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("seek") @ExcludeMissing seek: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("start") @ExcludeMissing start: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("temperature")
                @ExcludeMissing
                temperature: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tokens")
                @ExcludeMissing
                tokens: JsonField<List<Long>> = JsonMissing.of(),
            ) : this(
                id,
                avgLogprob,
                compressionRatio,
                end,
                noSpeechProb,
                seek,
                start,
                temperature,
                text,
                tokens,
                mutableMapOf(),
            )

            /**
             * Unique identifier of the segment.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): Long = id.getRequired("id")

            /**
             * Average logprob of the segment. If the value is lower than -1, consider the logprobs
             * failed.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun avgLogprob(): Double = avgLogprob.getRequired("avg_logprob")

            /**
             * Compression ratio of the segment. If the value is greater than 2.4, consider the
             * compression failed.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun compressionRatio(): Double = compressionRatio.getRequired("compression_ratio")

            /**
             * End time of the segment in seconds.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun end(): Double = end.getRequired("end")

            /**
             * Probability of no speech in the segment. If the value is higher than 1.0 and the
             * `avg_logprob` is below -1, consider this segment silent.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun noSpeechProb(): Double = noSpeechProb.getRequired("no_speech_prob")

            /**
             * Seek offset of the segment.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun seek(): Long = seek.getRequired("seek")

            /**
             * Start time of the segment in seconds.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun start(): Double = start.getRequired("start")

            /**
             * Temperature parameter used for generating the segment.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun temperature(): Double = temperature.getRequired("temperature")

            /**
             * Text content of the segment.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun text(): String = text.getRequired("text")

            /**
             * Array of token IDs for the text content.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tokens(): List<Long> = tokens.getRequired("tokens")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

            /**
             * Returns the raw JSON value of [avgLogprob].
             *
             * Unlike [avgLogprob], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("avg_logprob")
            @ExcludeMissing
            fun _avgLogprob(): JsonField<Double> = avgLogprob

            /**
             * Returns the raw JSON value of [compressionRatio].
             *
             * Unlike [compressionRatio], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("compression_ratio")
            @ExcludeMissing
            fun _compressionRatio(): JsonField<Double> = compressionRatio

            /**
             * Returns the raw JSON value of [end].
             *
             * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Double> = end

            /**
             * Returns the raw JSON value of [noSpeechProb].
             *
             * Unlike [noSpeechProb], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("no_speech_prob")
            @ExcludeMissing
            fun _noSpeechProb(): JsonField<Double> = noSpeechProb

            /**
             * Returns the raw JSON value of [seek].
             *
             * Unlike [seek], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("seek") @ExcludeMissing fun _seek(): JsonField<Long> = seek

            /**
             * Returns the raw JSON value of [start].
             *
             * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

            /**
             * Returns the raw JSON value of [temperature].
             *
             * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            /**
             * Returns the raw JSON value of [tokens].
             *
             * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<List<Long>> = tokens

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
                 * Returns a mutable builder for constructing an instance of [Segment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .avgLogprob()
                 * .compressionRatio()
                 * .end()
                 * .noSpeechProb()
                 * .seek()
                 * .start()
                 * .temperature()
                 * .text()
                 * .tokens()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Segment]. */
            class Builder internal constructor() {

                private var id: JsonField<Long>? = null
                private var avgLogprob: JsonField<Double>? = null
                private var compressionRatio: JsonField<Double>? = null
                private var end: JsonField<Double>? = null
                private var noSpeechProb: JsonField<Double>? = null
                private var seek: JsonField<Long>? = null
                private var start: JsonField<Double>? = null
                private var temperature: JsonField<Double>? = null
                private var text: JsonField<String>? = null
                private var tokens: JsonField<MutableList<Long>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(segment: Segment) = apply {
                    id = segment.id
                    avgLogprob = segment.avgLogprob
                    compressionRatio = segment.compressionRatio
                    end = segment.end
                    noSpeechProb = segment.noSpeechProb
                    seek = segment.seek
                    start = segment.start
                    temperature = segment.temperature
                    text = segment.text
                    tokens = segment.tokens.map { it.toMutableList() }
                    additionalProperties = segment.additionalProperties.toMutableMap()
                }

                /** Unique identifier of the segment. */
                fun id(id: Long) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun id(id: JsonField<Long>) = apply { this.id = id }

                /**
                 * Average logprob of the segment. If the value is lower than -1, consider the
                 * logprobs failed.
                 */
                fun avgLogprob(avgLogprob: Double) = avgLogprob(JsonField.of(avgLogprob))

                /**
                 * Sets [Builder.avgLogprob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.avgLogprob] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun avgLogprob(avgLogprob: JsonField<Double>) = apply {
                    this.avgLogprob = avgLogprob
                }

                /**
                 * Compression ratio of the segment. If the value is greater than 2.4, consider the
                 * compression failed.
                 */
                fun compressionRatio(compressionRatio: Double) =
                    compressionRatio(JsonField.of(compressionRatio))

                /**
                 * Sets [Builder.compressionRatio] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.compressionRatio] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun compressionRatio(compressionRatio: JsonField<Double>) = apply {
                    this.compressionRatio = compressionRatio
                }

                /** End time of the segment in seconds. */
                fun end(end: Double) = end(JsonField.of(end))

                /**
                 * Sets [Builder.end] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.end] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun end(end: JsonField<Double>) = apply { this.end = end }

                /**
                 * Probability of no speech in the segment. If the value is higher than 1.0 and the
                 * `avg_logprob` is below -1, consider this segment silent.
                 */
                fun noSpeechProb(noSpeechProb: Double) = noSpeechProb(JsonField.of(noSpeechProb))

                /**
                 * Sets [Builder.noSpeechProb] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.noSpeechProb] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun noSpeechProb(noSpeechProb: JsonField<Double>) = apply {
                    this.noSpeechProb = noSpeechProb
                }

                /** Seek offset of the segment. */
                fun seek(seek: Long) = seek(JsonField.of(seek))

                /**
                 * Sets [Builder.seek] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.seek] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun seek(seek: JsonField<Long>) = apply { this.seek = seek }

                /** Start time of the segment in seconds. */
                fun start(start: Double) = start(JsonField.of(start))

                /**
                 * Sets [Builder.start] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.start] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun start(start: JsonField<Double>) = apply { this.start = start }

                /** Temperature parameter used for generating the segment. */
                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                /**
                 * Sets [Builder.temperature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.temperature] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun temperature(temperature: JsonField<Double>) = apply {
                    this.temperature = temperature
                }

                /** Text content of the segment. */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                /** Array of token IDs for the text content. */
                fun tokens(tokens: List<Long>) = tokens(JsonField.of(tokens))

                /**
                 * Sets [Builder.tokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokens] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokens(tokens: JsonField<List<Long>>) = apply {
                    this.tokens = tokens.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [tokens].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addToken(token: Long) = apply {
                    tokens =
                        (tokens ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tokens", it).add(token)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Segment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .avgLogprob()
                 * .compressionRatio()
                 * .end()
                 * .noSpeechProb()
                 * .seek()
                 * .start()
                 * .temperature()
                 * .text()
                 * .tokens()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Segment =
                    Segment(
                        checkRequired("id", id),
                        checkRequired("avgLogprob", avgLogprob),
                        checkRequired("compressionRatio", compressionRatio),
                        checkRequired("end", end),
                        checkRequired("noSpeechProb", noSpeechProb),
                        checkRequired("seek", seek),
                        checkRequired("start", start),
                        checkRequired("temperature", temperature),
                        checkRequired("text", text),
                        checkRequired("tokens", tokens).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Segment = apply {
                if (validated) {
                    return@apply
                }

                id()
                avgLogprob()
                compressionRatio()
                end()
                noSpeechProb()
                seek()
                start()
                temperature()
                text()
                tokens()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (if (avgLogprob.asKnown() == null) 0 else 1) +
                    (if (compressionRatio.asKnown() == null) 0 else 1) +
                    (if (end.asKnown() == null) 0 else 1) +
                    (if (noSpeechProb.asKnown() == null) 0 else 1) +
                    (if (seek.asKnown() == null) 0 else 1) +
                    (if (start.asKnown() == null) 0 else 1) +
                    (if (temperature.asKnown() == null) 0 else 1) +
                    (if (text.asKnown() == null) 0 else 1) +
                    (tokens.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Segment &&
                    id == other.id &&
                    avgLogprob == other.avgLogprob &&
                    compressionRatio == other.compressionRatio &&
                    end == other.end &&
                    noSpeechProb == other.noSpeechProb &&
                    seek == other.seek &&
                    start == other.start &&
                    temperature == other.temperature &&
                    text == other.text &&
                    tokens == other.tokens &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    avgLogprob,
                    compressionRatio,
                    end,
                    noSpeechProb,
                    seek,
                    start,
                    temperature,
                    text,
                    tokens,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Segment{id=$id, avgLogprob=$avgLogprob, compressionRatio=$compressionRatio, end=$end, noSpeechProb=$noSpeechProb, seek=$seek, start=$start, temperature=$temperature, text=$text, tokens=$tokens, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateTranslationResponseVerboseJson &&
                duration == other.duration &&
                language == other.language &&
                text == other.text &&
                segments == other.segments &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(duration, language, text, segments, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateTranslationResponseVerboseJson{duration=$duration, language=$language, text=$text, segments=$segments, additionalProperties=$additionalProperties}"
    }

    /**
     * Fields: # noqa: D415.
     * - text (required): str
     */
    class CreateTranslationResponseJson
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of()
        ) : this(text, mutableMapOf())

        /**
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
             * [CreateTranslationResponseJson].
             *
             * The following fields are required:
             * ```kotlin
             * .text()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreateTranslationResponseJson]. */
        class Builder internal constructor() {

            private var text: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(createTranslationResponseJson: CreateTranslationResponseJson) =
                apply {
                    text = createTranslationResponseJson.text
                    additionalProperties =
                        createTranslationResponseJson.additionalProperties.toMutableMap()
                }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

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
             * Returns an immutable instance of [CreateTranslationResponseJson].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreateTranslationResponseJson =
                CreateTranslationResponseJson(
                    checkRequired("text", text),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): CreateTranslationResponseJson = apply {
            if (validated) {
                return@apply
            }

            text()
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
        internal fun validity(): Int = (if (text.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateTranslationResponseJson &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(text, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateTranslationResponseJson{text=$text, additionalProperties=$additionalProperties}"
    }
}
