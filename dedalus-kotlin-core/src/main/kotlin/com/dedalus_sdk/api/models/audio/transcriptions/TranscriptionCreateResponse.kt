// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.audio.transcriptions

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
import com.dedalus_sdk.api.models.chat.completions.InputTokenDetails
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
 * Represents a verbose json transcription response returned by model, based on the provided input.
 *
 * Fields:
 * - language (required): str
 * - duration (required): float
 * - text (required): str
 * - words (optional): list[TranscriptionWord]
 * - segments (optional): list[TranscriptionSegment]
 * - usage (optional): TranscriptTextUsageDuration
 */
@JsonDeserialize(using = TranscriptionCreateResponse.Deserializer::class)
@JsonSerialize(using = TranscriptionCreateResponse.Serializer::class)
class TranscriptionCreateResponse
private constructor(
    private val createTranscriptionResponseVerboseJson: CreateTranscriptionResponseVerboseJson? =
        null,
    private val createTranscriptionResponseJson: CreateTranscriptionResponseJson? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Represents a verbose json transcription response returned by model, based on the provided
     * input.
     *
     * Fields:
     * - language (required): str
     * - duration (required): float
     * - text (required): str
     * - words (optional): list[TranscriptionWord]
     * - segments (optional): list[TranscriptionSegment]
     * - usage (optional): TranscriptTextUsageDuration
     */
    fun createTranscriptionResponseVerboseJson(): CreateTranscriptionResponseVerboseJson? =
        createTranscriptionResponseVerboseJson

    /**
     * Represents a transcription response returned by model, based on the provided input.
     *
     * Fields:
     * - text (required): str
     * - logprobs (optional): list[LogprobsItem]
     * - usage (optional): Usage
     */
    fun createTranscriptionResponseJson(): CreateTranscriptionResponseJson? =
        createTranscriptionResponseJson

    fun isCreateTranscriptionResponseVerboseJson(): Boolean =
        createTranscriptionResponseVerboseJson != null

    fun isCreateTranscriptionResponseJson(): Boolean = createTranscriptionResponseJson != null

    /**
     * Represents a verbose json transcription response returned by model, based on the provided
     * input.
     *
     * Fields:
     * - language (required): str
     * - duration (required): float
     * - text (required): str
     * - words (optional): list[TranscriptionWord]
     * - segments (optional): list[TranscriptionSegment]
     * - usage (optional): TranscriptTextUsageDuration
     */
    fun asCreateTranscriptionResponseVerboseJson(): CreateTranscriptionResponseVerboseJson =
        createTranscriptionResponseVerboseJson.getOrThrow("createTranscriptionResponseVerboseJson")

    /**
     * Represents a transcription response returned by model, based on the provided input.
     *
     * Fields:
     * - text (required): str
     * - logprobs (optional): list[LogprobsItem]
     * - usage (optional): Usage
     */
    fun asCreateTranscriptionResponseJson(): CreateTranscriptionResponseJson =
        createTranscriptionResponseJson.getOrThrow("createTranscriptionResponseJson")

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
     * val result: String? = transcriptionCreateResponse.accept(object : TranscriptionCreateResponse.Visitor<String?> {
     *     override fun visitCreateTranscriptionResponseVerboseJson(createTranscriptionResponseVerboseJson: CreateTranscriptionResponseVerboseJson): String? = createTranscriptionResponseVerboseJson.toString()
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
            createTranscriptionResponseVerboseJson != null ->
                visitor.visitCreateTranscriptionResponseVerboseJson(
                    createTranscriptionResponseVerboseJson
                )
            createTranscriptionResponseJson != null ->
                visitor.visitCreateTranscriptionResponseJson(createTranscriptionResponseJson)
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
    fun validate(): TranscriptionCreateResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitCreateTranscriptionResponseVerboseJson(
                    createTranscriptionResponseVerboseJson: CreateTranscriptionResponseVerboseJson
                ) {
                    createTranscriptionResponseVerboseJson.validate()
                }

                override fun visitCreateTranscriptionResponseJson(
                    createTranscriptionResponseJson: CreateTranscriptionResponseJson
                ) {
                    createTranscriptionResponseJson.validate()
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
                override fun visitCreateTranscriptionResponseVerboseJson(
                    createTranscriptionResponseVerboseJson: CreateTranscriptionResponseVerboseJson
                ) = createTranscriptionResponseVerboseJson.validity()

                override fun visitCreateTranscriptionResponseJson(
                    createTranscriptionResponseJson: CreateTranscriptionResponseJson
                ) = createTranscriptionResponseJson.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionCreateResponse &&
            createTranscriptionResponseVerboseJson ==
                other.createTranscriptionResponseVerboseJson &&
            createTranscriptionResponseJson == other.createTranscriptionResponseJson
    }

    override fun hashCode(): Int =
        Objects.hash(createTranscriptionResponseVerboseJson, createTranscriptionResponseJson)

    override fun toString(): String =
        when {
            createTranscriptionResponseVerboseJson != null ->
                "TranscriptionCreateResponse{createTranscriptionResponseVerboseJson=$createTranscriptionResponseVerboseJson}"
            createTranscriptionResponseJson != null ->
                "TranscriptionCreateResponse{createTranscriptionResponseJson=$createTranscriptionResponseJson}"
            _json != null -> "TranscriptionCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TranscriptionCreateResponse")
        }

    companion object {

        /**
         * Represents a verbose json transcription response returned by model, based on the provided
         * input.
         *
         * Fields:
         * - language (required): str
         * - duration (required): float
         * - text (required): str
         * - words (optional): list[TranscriptionWord]
         * - segments (optional): list[TranscriptionSegment]
         * - usage (optional): TranscriptTextUsageDuration
         */
        fun ofCreateTranscriptionResponseVerboseJson(
            createTranscriptionResponseVerboseJson: CreateTranscriptionResponseVerboseJson
        ) =
            TranscriptionCreateResponse(
                createTranscriptionResponseVerboseJson = createTranscriptionResponseVerboseJson
            )

        /**
         * Represents a transcription response returned by model, based on the provided input.
         *
         * Fields:
         * - text (required): str
         * - logprobs (optional): list[LogprobsItem]
         * - usage (optional): Usage
         */
        fun ofCreateTranscriptionResponseJson(
            createTranscriptionResponseJson: CreateTranscriptionResponseJson
        ) =
            TranscriptionCreateResponse(
                createTranscriptionResponseJson = createTranscriptionResponseJson
            )
    }

    /**
     * An interface that defines how to map each variant of [TranscriptionCreateResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /**
         * Represents a verbose json transcription response returned by model, based on the provided
         * input.
         *
         * Fields:
         * - language (required): str
         * - duration (required): float
         * - text (required): str
         * - words (optional): list[TranscriptionWord]
         * - segments (optional): list[TranscriptionSegment]
         * - usage (optional): TranscriptTextUsageDuration
         */
        fun visitCreateTranscriptionResponseVerboseJson(
            createTranscriptionResponseVerboseJson: CreateTranscriptionResponseVerboseJson
        ): T

        /**
         * Represents a transcription response returned by model, based on the provided input.
         *
         * Fields:
         * - text (required): str
         * - logprobs (optional): list[LogprobsItem]
         * - usage (optional): Usage
         */
        fun visitCreateTranscriptionResponseJson(
            createTranscriptionResponseJson: CreateTranscriptionResponseJson
        ): T

        /**
         * Maps an unknown variant of [TranscriptionCreateResponse] to a value of type [T].
         *
         * An instance of [TranscriptionCreateResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws DedalusInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DedalusInvalidDataException("Unknown TranscriptionCreateResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TranscriptionCreateResponse>(TranscriptionCreateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TranscriptionCreateResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CreateTranscriptionResponseVerboseJson>(),
                            )
                            ?.let {
                                TranscriptionCreateResponse(
                                    createTranscriptionResponseVerboseJson = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CreateTranscriptionResponseJson>())
                            ?.let {
                                TranscriptionCreateResponse(
                                    createTranscriptionResponseJson = it,
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
                0 -> TranscriptionCreateResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<TranscriptionCreateResponse>(TranscriptionCreateResponse::class) {

        override fun serialize(
            value: TranscriptionCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.createTranscriptionResponseVerboseJson != null ->
                    generator.writeObject(value.createTranscriptionResponseVerboseJson)
                value.createTranscriptionResponseJson != null ->
                    generator.writeObject(value.createTranscriptionResponseJson)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TranscriptionCreateResponse")
            }
        }
    }

    /**
     * Represents a verbose json transcription response returned by model, based on the provided
     * input.
     *
     * Fields:
     * - language (required): str
     * - duration (required): float
     * - text (required): str
     * - words (optional): list[TranscriptionWord]
     * - segments (optional): list[TranscriptionSegment]
     * - usage (optional): TranscriptTextUsageDuration
     */
    class CreateTranscriptionResponseVerboseJson
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val duration: JsonField<Double>,
        private val language: JsonField<String>,
        private val text: JsonField<String>,
        private val segments: JsonField<List<Segment>>,
        private val usage: JsonField<Usage>,
        private val words: JsonField<List<Word>>,
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
            @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
            @JsonProperty("words") @ExcludeMissing words: JsonField<List<Word>> = JsonMissing.of(),
        ) : this(duration, language, text, segments, usage, words, mutableMapOf())

        /**
         * The duration of the input audio.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun duration(): Double = duration.getRequired("duration")

        /**
         * The language of the input audio.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun language(): String = language.getRequired("language")

        /**
         * The transcribed text.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Segments of the transcribed text and their corresponding details.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun segments(): List<Segment>? = segments.getNullable("segments")

        /**
         * Usage statistics for models billed by audio input duration.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usage(): Usage? = usage.getNullable("usage")

        /**
         * Extracted words and their corresponding timestamps.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun words(): List<Word>? = words.getNullable("words")

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

        /**
         * Returns the raw JSON value of [usage].
         *
         * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

        /**
         * Returns the raw JSON value of [words].
         *
         * Unlike [words], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("words") @ExcludeMissing fun _words(): JsonField<List<Word>> = words

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
             * [CreateTranscriptionResponseVerboseJson].
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

        /** A builder for [CreateTranscriptionResponseVerboseJson]. */
        class Builder internal constructor() {

            private var duration: JsonField<Double>? = null
            private var language: JsonField<String>? = null
            private var text: JsonField<String>? = null
            private var segments: JsonField<MutableList<Segment>>? = null
            private var usage: JsonField<Usage> = JsonMissing.of()
            private var words: JsonField<MutableList<Word>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                createTranscriptionResponseVerboseJson: CreateTranscriptionResponseVerboseJson
            ) = apply {
                duration = createTranscriptionResponseVerboseJson.duration
                language = createTranscriptionResponseVerboseJson.language
                text = createTranscriptionResponseVerboseJson.text
                segments =
                    createTranscriptionResponseVerboseJson.segments.map { it.toMutableList() }
                usage = createTranscriptionResponseVerboseJson.usage
                words = createTranscriptionResponseVerboseJson.words.map { it.toMutableList() }
                additionalProperties =
                    createTranscriptionResponseVerboseJson.additionalProperties.toMutableMap()
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

            /** The language of the input audio. */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** The transcribed text. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Segments of the transcribed text and their corresponding details. */
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

            /** Usage statistics for models billed by audio input duration. */
            fun usage(usage: Usage) = usage(JsonField.of(usage))

            /**
             * Sets [Builder.usage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

            /** Extracted words and their corresponding timestamps. */
            fun words(words: List<Word>) = words(JsonField.of(words))

            /**
             * Sets [Builder.words] to an arbitrary JSON value.
             *
             * You should usually call [Builder.words] with a well-typed `List<Word>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun words(words: JsonField<List<Word>>) = apply {
                this.words = words.map { it.toMutableList() }
            }

            /**
             * Adds a single [Word] to [words].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWord(word: Word) = apply {
                words =
                    (words ?: JsonField.of(mutableListOf())).also {
                        checkKnown("words", it).add(word)
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
             * Returns an immutable instance of [CreateTranscriptionResponseVerboseJson].
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
            fun build(): CreateTranscriptionResponseVerboseJson =
                CreateTranscriptionResponseVerboseJson(
                    checkRequired("duration", duration),
                    checkRequired("language", language),
                    checkRequired("text", text),
                    (segments ?: JsonMissing.of()).map { it.toImmutable() },
                    usage,
                    (words ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): CreateTranscriptionResponseVerboseJson = apply {
            if (validated) {
                return@apply
            }

            duration()
            language()
            text()
            segments()?.forEach { it.validate() }
            usage()?.validate()
            words()?.forEach { it.validate() }
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
                (segments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (usage.asKnown()?.validity() ?: 0) +
                (words.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

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

        /** Usage statistics for models billed by audio input duration. */
        class Usage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val seconds: JsonField<Double>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("seconds")
                @ExcludeMissing
                seconds: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(seconds, type, mutableMapOf())

            /**
             * Duration of the input audio in seconds.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun seconds(): Double = seconds.getRequired("seconds")

            /**
             * The type of the usage object. Always `duration` for this variant.
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("duration")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [seconds].
             *
             * Unlike [seconds], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("seconds") @ExcludeMissing fun _seconds(): JsonField<Double> = seconds

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
                 * Returns a mutable builder for constructing an instance of [Usage].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .seconds()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Usage]. */
            class Builder internal constructor() {

                private var seconds: JsonField<Double>? = null
                private var type: JsonValue = JsonValue.from("duration")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usage: Usage) = apply {
                    seconds = usage.seconds
                    type = usage.type
                    additionalProperties = usage.additionalProperties.toMutableMap()
                }

                /** Duration of the input audio in seconds. */
                fun seconds(seconds: Double) = seconds(JsonField.of(seconds))

                /**
                 * Sets [Builder.seconds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.seconds] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun seconds(seconds: JsonField<Double>) = apply { this.seconds = seconds }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("duration")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [Usage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .seconds()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Usage =
                    Usage(
                        checkRequired("seconds", seconds),
                        type,
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
            fun validate(): Usage = apply {
                if (validated) {
                    return@apply
                }

                seconds()
                _type().let {
                    if (it != JsonValue.from("duration")) {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (seconds.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("duration")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Usage &&
                    seconds == other.seconds &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(seconds, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Usage{seconds=$seconds, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Fields: # noqa: D415.
         * - word (required): str
         * - start (required): float
         * - end (required): float
         */
        class Word
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val end: JsonField<Double>,
            private val start: JsonField<Double>,
            private val word: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("end") @ExcludeMissing end: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("start") @ExcludeMissing start: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("word") @ExcludeMissing word: JsonField<String> = JsonMissing.of(),
            ) : this(end, start, word, mutableMapOf())

            /**
             * End time of the word in seconds.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun end(): Double = end.getRequired("end")

            /**
             * Start time of the word in seconds.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun start(): Double = start.getRequired("start")

            /**
             * The text content of the word.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun word(): String = word.getRequired("word")

            /**
             * Returns the raw JSON value of [end].
             *
             * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Double> = end

            /**
             * Returns the raw JSON value of [start].
             *
             * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

            /**
             * Returns the raw JSON value of [word].
             *
             * Unlike [word], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("word") @ExcludeMissing fun _word(): JsonField<String> = word

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
                 * Returns a mutable builder for constructing an instance of [Word].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .end()
                 * .start()
                 * .word()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Word]. */
            class Builder internal constructor() {

                private var end: JsonField<Double>? = null
                private var start: JsonField<Double>? = null
                private var word: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(word: Word) = apply {
                    end = word.end
                    start = word.start
                    this.word = word.word
                    additionalProperties = word.additionalProperties.toMutableMap()
                }

                /** End time of the word in seconds. */
                fun end(end: Double) = end(JsonField.of(end))

                /**
                 * Sets [Builder.end] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.end] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun end(end: JsonField<Double>) = apply { this.end = end }

                /** Start time of the word in seconds. */
                fun start(start: Double) = start(JsonField.of(start))

                /**
                 * Sets [Builder.start] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.start] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun start(start: JsonField<Double>) = apply { this.start = start }

                /** The text content of the word. */
                fun word(word: String) = word(JsonField.of(word))

                /**
                 * Sets [Builder.word] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.word] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun word(word: JsonField<String>) = apply { this.word = word }

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
                 * Returns an immutable instance of [Word].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .end()
                 * .start()
                 * .word()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Word =
                    Word(
                        checkRequired("end", end),
                        checkRequired("start", start),
                        checkRequired("word", word),
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
            fun validate(): Word = apply {
                if (validated) {
                    return@apply
                }

                end()
                start()
                word()
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
                (if (end.asKnown() == null) 0 else 1) +
                    (if (start.asKnown() == null) 0 else 1) +
                    (if (word.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Word &&
                    end == other.end &&
                    start == other.start &&
                    word == other.word &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(end, start, word, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Word{end=$end, start=$start, word=$word, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateTranscriptionResponseVerboseJson &&
                duration == other.duration &&
                language == other.language &&
                text == other.text &&
                segments == other.segments &&
                usage == other.usage &&
                words == other.words &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(duration, language, text, segments, usage, words, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateTranscriptionResponseVerboseJson{duration=$duration, language=$language, text=$text, segments=$segments, usage=$usage, words=$words, additionalProperties=$additionalProperties}"
    }

    /**
     * Represents a transcription response returned by model, based on the provided input.
     *
     * Fields:
     * - text (required): str
     * - logprobs (optional): list[LogprobsItem]
     * - usage (optional): Usage
     */
    class CreateTranscriptionResponseJson
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val text: JsonField<String>,
        private val logprobs: JsonField<List<Logprob>>,
        private val usage: JsonField<Usage>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logprobs")
            @ExcludeMissing
            logprobs: JsonField<List<Logprob>> = JsonMissing.of(),
            @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
        ) : this(text, logprobs, usage, mutableMapOf())

        /**
         * The transcribed text.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * The log probabilities of the tokens in the transcription. Only returned with the models
         * `gpt-4o-transcribe` and `gpt-4o-mini-transcribe` if `logprobs` is added to the `include`
         * array.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logprobs(): List<Logprob>? = logprobs.getNullable("logprobs")

        /**
         * Token usage statistics for the request.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usage(): Usage? = usage.getNullable("usage")

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [logprobs].
         *
         * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logprobs")
        @ExcludeMissing
        fun _logprobs(): JsonField<List<Logprob>> = logprobs

        /**
         * Returns the raw JSON value of [usage].
         *
         * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
             * [CreateTranscriptionResponseJson].
             *
             * The following fields are required:
             * ```kotlin
             * .text()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreateTranscriptionResponseJson]. */
        class Builder internal constructor() {

            private var text: JsonField<String>? = null
            private var logprobs: JsonField<MutableList<Logprob>>? = null
            private var usage: JsonField<Usage> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(createTranscriptionResponseJson: CreateTranscriptionResponseJson) =
                apply {
                    text = createTranscriptionResponseJson.text
                    logprobs = createTranscriptionResponseJson.logprobs.map { it.toMutableList() }
                    usage = createTranscriptionResponseJson.usage
                    additionalProperties =
                        createTranscriptionResponseJson.additionalProperties.toMutableMap()
                }

            /** The transcribed text. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * The log probabilities of the tokens in the transcription. Only returned with the
             * models `gpt-4o-transcribe` and `gpt-4o-mini-transcribe` if `logprobs` is added to the
             * `include` array.
             */
            fun logprobs(logprobs: List<Logprob>) = logprobs(JsonField.of(logprobs))

            /**
             * Sets [Builder.logprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logprobs] with a well-typed `List<Logprob>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logprobs(logprobs: JsonField<List<Logprob>>) = apply {
                this.logprobs = logprobs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Logprob] to [logprobs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLogprob(logprob: Logprob) = apply {
                logprobs =
                    (logprobs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("logprobs", it).add(logprob)
                    }
            }

            /** Token usage statistics for the request. */
            fun usage(usage: Usage) = usage(JsonField.of(usage))

            /**
             * Sets [Builder.usage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

            /** Alias for calling [usage] with `Usage.ofTokens(tokens)`. */
            fun usage(tokens: Usage.Tokens) = usage(Usage.ofTokens(tokens))

            /** Alias for calling [usage] with `Usage.ofDuration(duration)`. */
            fun usage(duration: Usage.Duration) = usage(Usage.ofDuration(duration))

            /**
             * Alias for calling [usage] with the following:
             * ```kotlin
             * Usage.Duration.builder()
             *     .seconds(seconds)
             *     .build()
             * ```
             */
            fun durationUsage(seconds: Double) =
                usage(Usage.Duration.builder().seconds(seconds).build())

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
             * Returns an immutable instance of [CreateTranscriptionResponseJson].
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
            fun build(): CreateTranscriptionResponseJson =
                CreateTranscriptionResponseJson(
                    checkRequired("text", text),
                    (logprobs ?: JsonMissing.of()).map { it.toImmutable() },
                    usage,
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
        fun validate(): CreateTranscriptionResponseJson = apply {
            if (validated) {
                return@apply
            }

            text()
            logprobs()?.forEach { it.validate() }
            usage()?.validate()
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
            (if (text.asKnown() == null) 0 else 1) +
                (logprobs.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (usage.asKnown()?.validity() ?: 0)

        /**
         * Fields: # noqa: D415.
         * - token (optional): str
         * - logprob (optional): float
         * - bytes (optional): list[float]
         */
        class Logprob
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val token: JsonField<String>,
            private val bytes: JsonField<List<Double>>,
            private val logprob: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bytes")
                @ExcludeMissing
                bytes: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("logprob")
                @ExcludeMissing
                logprob: JsonField<Double> = JsonMissing.of(),
            ) : this(token, bytes, logprob, mutableMapOf())

            /**
             * The token in the transcription.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun token(): String? = token.getNullable("token")

            /**
             * The bytes of the token.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bytes(): List<Double>? = bytes.getNullable("bytes")

            /**
             * The log probability of the token.
             *
             * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun logprob(): Double? = logprob.getNullable("logprob")

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

            /**
             * Returns the raw JSON value of [bytes].
             *
             * Unlike [bytes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bytes") @ExcludeMissing fun _bytes(): JsonField<List<Double>> = bytes

            /**
             * Returns the raw JSON value of [logprob].
             *
             * Unlike [logprob], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("logprob") @ExcludeMissing fun _logprob(): JsonField<Double> = logprob

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

                /** Returns a mutable builder for constructing an instance of [Logprob]. */
                fun builder() = Builder()
            }

            /** A builder for [Logprob]. */
            class Builder internal constructor() {

                private var token: JsonField<String> = JsonMissing.of()
                private var bytes: JsonField<MutableList<Double>>? = null
                private var logprob: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(logprob: Logprob) = apply {
                    token = logprob.token
                    bytes = logprob.bytes.map { it.toMutableList() }
                    this.logprob = logprob.logprob
                    additionalProperties = logprob.additionalProperties.toMutableMap()
                }

                /** The token in the transcription. */
                fun token(token: String) = token(JsonField.of(token))

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                /** The bytes of the token. */
                fun bytes(bytes: List<Double>) = bytes(JsonField.of(bytes))

                /**
                 * Sets [Builder.bytes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bytes] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bytes(bytes: JsonField<List<Double>>) = apply {
                    this.bytes = bytes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [bytes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addByte(byte: Double) = apply {
                    bytes =
                        (bytes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("bytes", it).add(byte)
                        }
                }

                /** The log probability of the token. */
                fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                /**
                 * Sets [Builder.logprob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logprob] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

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
                 * Returns an immutable instance of [Logprob].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Logprob =
                    Logprob(
                        token,
                        (bytes ?: JsonMissing.of()).map { it.toImmutable() },
                        logprob,
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
            fun validate(): Logprob = apply {
                if (validated) {
                    return@apply
                }

                token()
                bytes()
                logprob()
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
                (if (token.asKnown() == null) 0 else 1) +
                    (bytes.asKnown()?.size ?: 0) +
                    (if (logprob.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Logprob &&
                    token == other.token &&
                    bytes == other.bytes &&
                    logprob == other.logprob &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(token, bytes, logprob, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Logprob{token=$token, bytes=$bytes, logprob=$logprob, additionalProperties=$additionalProperties}"
        }

        /** Token usage statistics for the request. */
        @JsonDeserialize(using = Usage.Deserializer::class)
        @JsonSerialize(using = Usage.Serializer::class)
        class Usage
        private constructor(
            private val tokens: Tokens? = null,
            private val duration: Duration? = null,
            private val _json: JsonValue? = null,
        ) {

            /**
             * Usage statistics for models billed by token usage.
             *
             * Fields:
             * - type (required): Literal['tokens']
             * - input_tokens (required): int
             * - input_token_details (optional): InputTokenDetails
             * - output_tokens (required): int
             * - total_tokens (required): int
             */
            fun tokens(): Tokens? = tokens

            /**
             * Usage statistics for models billed by audio input duration.
             *
             * Fields:
             * - type (required): Literal['duration']
             * - seconds (required): float
             */
            fun duration(): Duration? = duration

            fun isTokens(): Boolean = tokens != null

            fun isDuration(): Boolean = duration != null

            /**
             * Usage statistics for models billed by token usage.
             *
             * Fields:
             * - type (required): Literal['tokens']
             * - input_tokens (required): int
             * - input_token_details (optional): InputTokenDetails
             * - output_tokens (required): int
             * - total_tokens (required): int
             */
            fun asTokens(): Tokens = tokens.getOrThrow("tokens")

            /**
             * Usage statistics for models billed by audio input duration.
             *
             * Fields:
             * - type (required): Literal['duration']
             * - seconds (required): float
             */
            fun asDuration(): Duration = duration.getOrThrow("duration")

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
             * val result: String? = usage.accept(object : Usage.Visitor<String?> {
             *     override fun visitTokens(tokens: Tokens): String? = tokens.toString()
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
                    tokens != null -> visitor.visitTokens(tokens)
                    duration != null -> visitor.visitDuration(duration)
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
            fun validate(): Usage = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitTokens(tokens: Tokens) {
                            tokens.validate()
                        }

                        override fun visitDuration(duration: Duration) {
                            duration.validate()
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
                        override fun visitTokens(tokens: Tokens) = tokens.validity()

                        override fun visitDuration(duration: Duration) = duration.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Usage && tokens == other.tokens && duration == other.duration
            }

            override fun hashCode(): Int = Objects.hash(tokens, duration)

            override fun toString(): String =
                when {
                    tokens != null -> "Usage{tokens=$tokens}"
                    duration != null -> "Usage{duration=$duration}"
                    _json != null -> "Usage{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Usage")
                }

            companion object {

                /**
                 * Usage statistics for models billed by token usage.
                 *
                 * Fields:
                 * - type (required): Literal['tokens']
                 * - input_tokens (required): int
                 * - input_token_details (optional): InputTokenDetails
                 * - output_tokens (required): int
                 * - total_tokens (required): int
                 */
                fun ofTokens(tokens: Tokens) = Usage(tokens = tokens)

                /**
                 * Usage statistics for models billed by audio input duration.
                 *
                 * Fields:
                 * - type (required): Literal['duration']
                 * - seconds (required): float
                 */
                fun ofDuration(duration: Duration) = Usage(duration = duration)
            }

            /**
             * An interface that defines how to map each variant of [Usage] to a value of type [T].
             */
            interface Visitor<out T> {

                /**
                 * Usage statistics for models billed by token usage.
                 *
                 * Fields:
                 * - type (required): Literal['tokens']
                 * - input_tokens (required): int
                 * - input_token_details (optional): InputTokenDetails
                 * - output_tokens (required): int
                 * - total_tokens (required): int
                 */
                fun visitTokens(tokens: Tokens): T

                /**
                 * Usage statistics for models billed by audio input duration.
                 *
                 * Fields:
                 * - type (required): Literal['duration']
                 * - seconds (required): float
                 */
                fun visitDuration(duration: Duration): T

                /**
                 * Maps an unknown variant of [Usage] to a value of type [T].
                 *
                 * An instance of [Usage] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws DedalusInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw DedalusInvalidDataException("Unknown Usage: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Usage>(Usage::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Usage {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject()?.get("type")?.asString()

                    when (type) {
                        "tokens" -> {
                            return tryDeserialize(node, jacksonTypeRef<Tokens>())?.let {
                                Usage(tokens = it, _json = json)
                            } ?: Usage(_json = json)
                        }
                        "duration" -> {
                            return tryDeserialize(node, jacksonTypeRef<Duration>())?.let {
                                Usage(duration = it, _json = json)
                            } ?: Usage(_json = json)
                        }
                    }

                    return Usage(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Usage>(Usage::class) {

                override fun serialize(
                    value: Usage,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.tokens != null -> generator.writeObject(value.tokens)
                        value.duration != null -> generator.writeObject(value.duration)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Usage")
                    }
                }
            }

            /**
             * Usage statistics for models billed by token usage.
             *
             * Fields:
             * - type (required): Literal['tokens']
             * - input_tokens (required): int
             * - input_token_details (optional): InputTokenDetails
             * - output_tokens (required): int
             * - total_tokens (required): int
             */
            class Tokens
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val inputTokens: JsonField<Long>,
                private val outputTokens: JsonField<Long>,
                private val totalTokens: JsonField<Long>,
                private val type: JsonValue,
                private val inputTokenDetails: JsonField<InputTokenDetails>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("input_tokens")
                    @ExcludeMissing
                    inputTokens: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("output_tokens")
                    @ExcludeMissing
                    outputTokens: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("total_tokens")
                    @ExcludeMissing
                    totalTokens: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("input_token_details")
                    @ExcludeMissing
                    inputTokenDetails: JsonField<InputTokenDetails> = JsonMissing.of(),
                ) : this(
                    inputTokens,
                    outputTokens,
                    totalTokens,
                    type,
                    inputTokenDetails,
                    mutableMapOf(),
                )

                /**
                 * Number of input tokens billed for this request.
                 *
                 * @throws DedalusInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun inputTokens(): Long = inputTokens.getRequired("input_tokens")

                /**
                 * Number of output tokens generated.
                 *
                 * @throws DedalusInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun outputTokens(): Long = outputTokens.getRequired("output_tokens")

                /**
                 * Total number of tokens used (input + output).
                 *
                 * @throws DedalusInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

                /**
                 * The type of the usage object. Always `tokens` for this variant.
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("tokens")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Details about the input tokens billed for this request.
                 *
                 * @throws DedalusInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inputTokenDetails(): InputTokenDetails? =
                    inputTokenDetails.getNullable("input_token_details")

                /**
                 * Returns the raw JSON value of [inputTokens].
                 *
                 * Unlike [inputTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("input_tokens")
                @ExcludeMissing
                fun _inputTokens(): JsonField<Long> = inputTokens

                /**
                 * Returns the raw JSON value of [outputTokens].
                 *
                 * Unlike [outputTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("output_tokens")
                @ExcludeMissing
                fun _outputTokens(): JsonField<Long> = outputTokens

                /**
                 * Returns the raw JSON value of [totalTokens].
                 *
                 * Unlike [totalTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("total_tokens")
                @ExcludeMissing
                fun _totalTokens(): JsonField<Long> = totalTokens

                /**
                 * Returns the raw JSON value of [inputTokenDetails].
                 *
                 * Unlike [inputTokenDetails], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("input_token_details")
                @ExcludeMissing
                fun _inputTokenDetails(): JsonField<InputTokenDetails> = inputTokenDetails

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
                     * Returns a mutable builder for constructing an instance of [Tokens].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .inputTokens()
                     * .outputTokens()
                     * .totalTokens()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Tokens]. */
                class Builder internal constructor() {

                    private var inputTokens: JsonField<Long>? = null
                    private var outputTokens: JsonField<Long>? = null
                    private var totalTokens: JsonField<Long>? = null
                    private var type: JsonValue = JsonValue.from("tokens")
                    private var inputTokenDetails: JsonField<InputTokenDetails> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tokens: Tokens) = apply {
                        inputTokens = tokens.inputTokens
                        outputTokens = tokens.outputTokens
                        totalTokens = tokens.totalTokens
                        type = tokens.type
                        inputTokenDetails = tokens.inputTokenDetails
                        additionalProperties = tokens.additionalProperties.toMutableMap()
                    }

                    /** Number of input tokens billed for this request. */
                    fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

                    /**
                     * Sets [Builder.inputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputTokens] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun inputTokens(inputTokens: JsonField<Long>) = apply {
                        this.inputTokens = inputTokens
                    }

                    /** Number of output tokens generated. */
                    fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

                    /**
                     * Sets [Builder.outputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outputTokens] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun outputTokens(outputTokens: JsonField<Long>) = apply {
                        this.outputTokens = outputTokens
                    }

                    /** Total number of tokens used (input + output). */
                    fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

                    /**
                     * Sets [Builder.totalTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalTokens] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalTokens(totalTokens: JsonField<Long>) = apply {
                        this.totalTokens = totalTokens
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("tokens")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    /** Details about the input tokens billed for this request. */
                    fun inputTokenDetails(inputTokenDetails: InputTokenDetails) =
                        inputTokenDetails(JsonField.of(inputTokenDetails))

                    /**
                     * Sets [Builder.inputTokenDetails] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputTokenDetails] with a well-typed
                     * [InputTokenDetails] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun inputTokenDetails(inputTokenDetails: JsonField<InputTokenDetails>) = apply {
                        this.inputTokenDetails = inputTokenDetails
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
                     * Returns an immutable instance of [Tokens].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .inputTokens()
                     * .outputTokens()
                     * .totalTokens()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tokens =
                        Tokens(
                            checkRequired("inputTokens", inputTokens),
                            checkRequired("outputTokens", outputTokens),
                            checkRequired("totalTokens", totalTokens),
                            type,
                            inputTokenDetails,
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
                 * @throws DedalusInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Tokens = apply {
                    if (validated) {
                        return@apply
                    }

                    inputTokens()
                    outputTokens()
                    totalTokens()
                    _type().let {
                        if (it != JsonValue.from("tokens")) {
                            throw DedalusInvalidDataException("'type' is invalid, received $it")
                        }
                    }
                    inputTokenDetails()?.validate()
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
                    (if (inputTokens.asKnown() == null) 0 else 1) +
                        (if (outputTokens.asKnown() == null) 0 else 1) +
                        (if (totalTokens.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("tokens")) 1 else 0 } +
                        (inputTokenDetails.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tokens &&
                        inputTokens == other.inputTokens &&
                        outputTokens == other.outputTokens &&
                        totalTokens == other.totalTokens &&
                        type == other.type &&
                        inputTokenDetails == other.inputTokenDetails &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        inputTokens,
                        outputTokens,
                        totalTokens,
                        type,
                        inputTokenDetails,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tokens{inputTokens=$inputTokens, outputTokens=$outputTokens, totalTokens=$totalTokens, type=$type, inputTokenDetails=$inputTokenDetails, additionalProperties=$additionalProperties}"
            }

            /**
             * Usage statistics for models billed by audio input duration.
             *
             * Fields:
             * - type (required): Literal['duration']
             * - seconds (required): float
             */
            class Duration
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val seconds: JsonField<Double>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("seconds")
                    @ExcludeMissing
                    seconds: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(seconds, type, mutableMapOf())

                /**
                 * Duration of the input audio in seconds.
                 *
                 * @throws DedalusInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun seconds(): Double = seconds.getRequired("seconds")

                /**
                 * The type of the usage object. Always `duration` for this variant.
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("duration")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [seconds].
                 *
                 * Unlike [seconds], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("seconds") @ExcludeMissing fun _seconds(): JsonField<Double> = seconds

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
                     * Returns a mutable builder for constructing an instance of [Duration].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .seconds()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Duration]. */
                class Builder internal constructor() {

                    private var seconds: JsonField<Double>? = null
                    private var type: JsonValue = JsonValue.from("duration")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(duration: Duration) = apply {
                        seconds = duration.seconds
                        type = duration.type
                        additionalProperties = duration.additionalProperties.toMutableMap()
                    }

                    /** Duration of the input audio in seconds. */
                    fun seconds(seconds: Double) = seconds(JsonField.of(seconds))

                    /**
                     * Sets [Builder.seconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.seconds] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun seconds(seconds: JsonField<Double>) = apply { this.seconds = seconds }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("duration")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [Duration].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .seconds()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Duration =
                        Duration(
                            checkRequired("seconds", seconds),
                            type,
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
                 * @throws DedalusInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Duration = apply {
                    if (validated) {
                        return@apply
                    }

                    seconds()
                    _type().let {
                        if (it != JsonValue.from("duration")) {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (seconds.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("duration")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Duration &&
                        seconds == other.seconds &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(seconds, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Duration{seconds=$seconds, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateTranscriptionResponseJson &&
                text == other.text &&
                logprobs == other.logprobs &&
                usage == other.usage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(text, logprobs, usage, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateTranscriptionResponseJson{text=$text, logprobs=$logprobs, usage=$usage, additionalProperties=$additionalProperties}"
    }
}
