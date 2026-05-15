// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.BaseDeserializer
import com.dedalus_sdk.api.core.BaseSerializer
import com.dedalus_sdk.api.core.Enum
import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.allMaxBy
import com.dedalus_sdk.api.core.checkKnown
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

class ModelSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attributes: JsonField<Attributes>,
    private val audio: JsonField<JsonObjectInput>,
    private val deferred: JsonField<Boolean>,
    private val extraArgs: JsonField<ExtraArgs>,
    private val extraHeaders: JsonField<ExtraHeaders>,
    private val extraQuery: JsonField<ExtraQuery>,
    private val frequencyPenalty: JsonField<Double>,
    private val generationConfig: JsonField<JsonObjectInput>,
    private val includeUsage: JsonField<Boolean>,
    private val inputAudioFormat: JsonField<String>,
    private val inputAudioTranscription: JsonField<JsonObjectInput>,
    private val logitBias: JsonField<LogitBias>,
    private val logprobs: JsonField<Boolean>,
    private val maxCompletionTokens: JsonField<Long>,
    private val maxTokens: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
    private val modalities: JsonField<List<String>>,
    private val n: JsonField<Long>,
    private val outputAudioFormat: JsonField<String>,
    private val parallelToolCalls: JsonField<Boolean>,
    private val prediction: JsonField<JsonObjectInput>,
    private val presencePenalty: JsonField<Double>,
    private val promptCacheKey: JsonField<String>,
    private val reasoning: JsonField<Reasoning>,
    private val reasoningEffort: JsonField<String>,
    private val responseFormat: JsonField<JsonObjectInput>,
    private val safetyIdentifier: JsonField<String>,
    private val safetySettings: JsonField<List<JsonObjectInput>>,
    private val searchParameters: JsonField<JsonObjectInput>,
    private val seed: JsonField<Long>,
    private val serviceTier: JsonField<String>,
    private val stop: JsonField<Stop>,
    private val store: JsonField<Boolean>,
    private val stream: JsonField<Boolean>,
    private val streamOptions: JsonField<JsonObjectInput>,
    private val structuredOutput: JsonValue,
    private val systemInstruction: JsonField<JsonObjectInput>,
    private val temperature: JsonField<Double>,
    private val thinking: JsonField<JsonObjectInput>,
    private val timeout: JsonField<Double>,
    private val toolChoice: JsonField<ToolChoice>,
    private val toolConfig: JsonField<JsonObjectInput>,
    private val topK: JsonField<Long>,
    private val topLogprobs: JsonField<Long>,
    private val topP: JsonField<Double>,
    private val truncation: JsonField<Truncation>,
    private val turnDetection: JsonField<JsonObjectInput>,
    private val user: JsonField<String>,
    private val verbosity: JsonField<String>,
    private val voice: JsonField<String>,
    private val webSearchOptions: JsonField<JsonObjectInput>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("audio") @ExcludeMissing audio: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("deferred") @ExcludeMissing deferred: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("extra_args")
        @ExcludeMissing
        extraArgs: JsonField<ExtraArgs> = JsonMissing.of(),
        @JsonProperty("extra_headers")
        @ExcludeMissing
        extraHeaders: JsonField<ExtraHeaders> = JsonMissing.of(),
        @JsonProperty("extra_query")
        @ExcludeMissing
        extraQuery: JsonField<ExtraQuery> = JsonMissing.of(),
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        frequencyPenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("generation_config")
        @ExcludeMissing
        generationConfig: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("include_usage")
        @ExcludeMissing
        includeUsage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("input_audio_format")
        @ExcludeMissing
        inputAudioFormat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input_audio_transcription")
        @ExcludeMissing
        inputAudioTranscription: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("logit_bias")
        @ExcludeMissing
        logitBias: JsonField<LogitBias> = JsonMissing.of(),
        @JsonProperty("logprobs") @ExcludeMissing logprobs: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_completion_tokens")
        @ExcludeMissing
        maxCompletionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_tokens") @ExcludeMissing maxTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("modalities")
        @ExcludeMissing
        modalities: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("n") @ExcludeMissing n: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("output_audio_format")
        @ExcludeMissing
        outputAudioFormat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parallel_tool_calls")
        @ExcludeMissing
        parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("prediction")
        @ExcludeMissing
        prediction: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        presencePenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("prompt_cache_key")
        @ExcludeMissing
        promptCacheKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reasoning")
        @ExcludeMissing
        reasoning: JsonField<Reasoning> = JsonMissing.of(),
        @JsonProperty("reasoning_effort")
        @ExcludeMissing
        reasoningEffort: JsonField<String> = JsonMissing.of(),
        @JsonProperty("response_format")
        @ExcludeMissing
        responseFormat: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("safety_identifier")
        @ExcludeMissing
        safetyIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("safety_settings")
        @ExcludeMissing
        safetySettings: JsonField<List<JsonObjectInput>> = JsonMissing.of(),
        @JsonProperty("search_parameters")
        @ExcludeMissing
        searchParameters: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("service_tier")
        @ExcludeMissing
        serviceTier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stop") @ExcludeMissing stop: JsonField<Stop> = JsonMissing.of(),
        @JsonProperty("store") @ExcludeMissing store: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stream_options")
        @ExcludeMissing
        streamOptions: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("structured_output")
        @ExcludeMissing
        structuredOutput: JsonValue = JsonMissing.of(),
        @JsonProperty("system_instruction")
        @ExcludeMissing
        systemInstruction: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("thinking")
        @ExcludeMissing
        thinking: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tool_choice")
        @ExcludeMissing
        toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
        @JsonProperty("tool_config")
        @ExcludeMissing
        toolConfig: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("top_logprobs")
        @ExcludeMissing
        topLogprobs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("truncation")
        @ExcludeMissing
        truncation: JsonField<Truncation> = JsonMissing.of(),
        @JsonProperty("turn_detection")
        @ExcludeMissing
        turnDetection: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verbosity") @ExcludeMissing verbosity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("web_search_options")
        @ExcludeMissing
        webSearchOptions: JsonField<JsonObjectInput> = JsonMissing.of(),
    ) : this(
        attributes,
        audio,
        deferred,
        extraArgs,
        extraHeaders,
        extraQuery,
        frequencyPenalty,
        generationConfig,
        includeUsage,
        inputAudioFormat,
        inputAudioTranscription,
        logitBias,
        logprobs,
        maxCompletionTokens,
        maxTokens,
        metadata,
        modalities,
        n,
        outputAudioFormat,
        parallelToolCalls,
        prediction,
        presencePenalty,
        promptCacheKey,
        reasoning,
        reasoningEffort,
        responseFormat,
        safetyIdentifier,
        safetySettings,
        searchParameters,
        seed,
        serviceTier,
        stop,
        store,
        stream,
        streamOptions,
        structuredOutput,
        systemInstruction,
        temperature,
        thinking,
        timeout,
        toolChoice,
        toolConfig,
        topK,
        topLogprobs,
        topP,
        truncation,
        turnDetection,
        user,
        verbosity,
        voice,
        webSearchOptions,
        mutableMapOf(),
    )

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attributes(): Attributes? = attributes.getNullable("attributes")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audio(): JsonObjectInput? = audio.getNullable("audio")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deferred(): Boolean? = deferred.getNullable("deferred")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extraArgs(): ExtraArgs? = extraArgs.getNullable("extra_args")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extraHeaders(): ExtraHeaders? = extraHeaders.getNullable("extra_headers")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extraQuery(): ExtraQuery? = extraQuery.getNullable("extra_query")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyPenalty(): Double? = frequencyPenalty.getNullable("frequency_penalty")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generationConfig(): JsonObjectInput? = generationConfig.getNullable("generation_config")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeUsage(): Boolean? = includeUsage.getNullable("include_usage")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputAudioFormat(): String? = inputAudioFormat.getNullable("input_audio_format")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputAudioTranscription(): JsonObjectInput? =
        inputAudioTranscription.getNullable("input_audio_transcription")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logitBias(): LogitBias? = logitBias.getNullable("logit_bias")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logprobs(): Boolean? = logprobs.getNullable("logprobs")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxCompletionTokens(): Long? = maxCompletionTokens.getNullable("max_completion_tokens")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modalities(): List<String>? = modalities.getNullable("modalities")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun n(): Long? = n.getNullable("n")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputAudioFormat(): String? = outputAudioFormat.getNullable("output_audio_format")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parallelToolCalls(): Boolean? = parallelToolCalls.getNullable("parallel_tool_calls")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prediction(): JsonObjectInput? = prediction.getNullable("prediction")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presencePenalty(): Double? = presencePenalty.getNullable("presence_penalty")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCacheKey(): String? = promptCacheKey.getNullable("prompt_cache_key")

    /**
     * **gpt-5 and o-series models only**
     *
     * Configuration options for
     * [reasoning models](https://platform.openai.com/docs/guides/reasoning).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasoning(): Reasoning? = reasoning.getNullable("reasoning")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasoningEffort(): String? = reasoningEffort.getNullable("reasoning_effort")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): JsonObjectInput? = responseFormat.getNullable("response_format")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun safetyIdentifier(): String? = safetyIdentifier.getNullable("safety_identifier")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun safetySettings(): List<JsonObjectInput>? = safetySettings.getNullable("safety_settings")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchParameters(): JsonObjectInput? = searchParameters.getNullable("search_parameters")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seed(): Long? = seed.getNullable("seed")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceTier(): String? = serviceTier.getNullable("service_tier")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stop(): Stop? = stop.getNullable("stop")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun store(): Boolean? = store.getNullable("store")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Boolean? = stream.getNullable("stream")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamOptions(): JsonObjectInput? = streamOptions.getNullable("stream_options")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = modelSettings.structuredOutput().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("structured_output")
    @ExcludeMissing
    fun _structuredOutput(): JsonValue = structuredOutput

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemInstruction(): JsonObjectInput? = systemInstruction.getNullable("system_instruction")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Double? = temperature.getNullable("temperature")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thinking(): JsonObjectInput? = thinking.getNullable("thinking")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Double? = timeout.getNullable("timeout")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolConfig(): JsonObjectInput? = toolConfig.getNullable("tool_config")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topK(): Long? = topK.getNullable("top_k")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topLogprobs(): Long? = topLogprobs.getNullable("top_logprobs")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Double? = topP.getNullable("top_p")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun truncation(): Truncation? = truncation.getNullable("truncation")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun turnDetection(): JsonObjectInput? = turnDetection.getNullable("turn_detection")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): String? = user.getNullable("user")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verbosity(): String? = verbosity.getNullable("verbosity")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voice(): String? = voice.getNullable("voice")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webSearchOptions(): JsonObjectInput? = webSearchOptions.getNullable("web_search_options")

    /**
     * Returns the raw JSON value of [attributes].
     *
     * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

    /**
     * Returns the raw JSON value of [audio].
     *
     * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<JsonObjectInput> = audio

    /**
     * Returns the raw JSON value of [deferred].
     *
     * Unlike [deferred], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deferred") @ExcludeMissing fun _deferred(): JsonField<Boolean> = deferred

    /**
     * Returns the raw JSON value of [extraArgs].
     *
     * Unlike [extraArgs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extra_args") @ExcludeMissing fun _extraArgs(): JsonField<ExtraArgs> = extraArgs

    /**
     * Returns the raw JSON value of [extraHeaders].
     *
     * Unlike [extraHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extra_headers")
    @ExcludeMissing
    fun _extraHeaders(): JsonField<ExtraHeaders> = extraHeaders

    /**
     * Returns the raw JSON value of [extraQuery].
     *
     * Unlike [extraQuery], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extra_query")
    @ExcludeMissing
    fun _extraQuery(): JsonField<ExtraQuery> = extraQuery

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frequency_penalty")
    @ExcludeMissing
    fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

    /**
     * Returns the raw JSON value of [generationConfig].
     *
     * Unlike [generationConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("generation_config")
    @ExcludeMissing
    fun _generationConfig(): JsonField<JsonObjectInput> = generationConfig

    /**
     * Returns the raw JSON value of [includeUsage].
     *
     * Unlike [includeUsage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("include_usage")
    @ExcludeMissing
    fun _includeUsage(): JsonField<Boolean> = includeUsage

    /**
     * Returns the raw JSON value of [inputAudioFormat].
     *
     * Unlike [inputAudioFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("input_audio_format")
    @ExcludeMissing
    fun _inputAudioFormat(): JsonField<String> = inputAudioFormat

    /**
     * Returns the raw JSON value of [inputAudioTranscription].
     *
     * Unlike [inputAudioTranscription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("input_audio_transcription")
    @ExcludeMissing
    fun _inputAudioTranscription(): JsonField<JsonObjectInput> = inputAudioTranscription

    /**
     * Returns the raw JSON value of [logitBias].
     *
     * Unlike [logitBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logit_bias") @ExcludeMissing fun _logitBias(): JsonField<LogitBias> = logitBias

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Boolean> = logprobs

    /**
     * Returns the raw JSON value of [maxCompletionTokens].
     *
     * Unlike [maxCompletionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_completion_tokens")
    @ExcludeMissing
    fun _maxCompletionTokens(): JsonField<Long> = maxCompletionTokens

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [modalities].
     *
     * Unlike [modalities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modalities")
    @ExcludeMissing
    fun _modalities(): JsonField<List<String>> = modalities

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Long> = n

    /**
     * Returns the raw JSON value of [outputAudioFormat].
     *
     * Unlike [outputAudioFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("output_audio_format")
    @ExcludeMissing
    fun _outputAudioFormat(): JsonField<String> = outputAudioFormat

    /**
     * Returns the raw JSON value of [parallelToolCalls].
     *
     * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parallel_tool_calls")
    @ExcludeMissing
    fun _parallelToolCalls(): JsonField<Boolean> = parallelToolCalls

    /**
     * Returns the raw JSON value of [prediction].
     *
     * Unlike [prediction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prediction")
    @ExcludeMissing
    fun _prediction(): JsonField<JsonObjectInput> = prediction

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("presence_penalty")
    @ExcludeMissing
    fun _presencePenalty(): JsonField<Double> = presencePenalty

    /**
     * Returns the raw JSON value of [promptCacheKey].
     *
     * Unlike [promptCacheKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_cache_key")
    @ExcludeMissing
    fun _promptCacheKey(): JsonField<String> = promptCacheKey

    /**
     * Returns the raw JSON value of [reasoning].
     *
     * Unlike [reasoning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reasoning") @ExcludeMissing fun _reasoning(): JsonField<Reasoning> = reasoning

    /**
     * Returns the raw JSON value of [reasoningEffort].
     *
     * Unlike [reasoningEffort], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reasoning_effort")
    @ExcludeMissing
    fun _reasoningEffort(): JsonField<String> = reasoningEffort

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_format")
    @ExcludeMissing
    fun _responseFormat(): JsonField<JsonObjectInput> = responseFormat

    /**
     * Returns the raw JSON value of [safetyIdentifier].
     *
     * Unlike [safetyIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("safety_identifier")
    @ExcludeMissing
    fun _safetyIdentifier(): JsonField<String> = safetyIdentifier

    /**
     * Returns the raw JSON value of [safetySettings].
     *
     * Unlike [safetySettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("safety_settings")
    @ExcludeMissing
    fun _safetySettings(): JsonField<List<JsonObjectInput>> = safetySettings

    /**
     * Returns the raw JSON value of [searchParameters].
     *
     * Unlike [searchParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("search_parameters")
    @ExcludeMissing
    fun _searchParameters(): JsonField<JsonObjectInput> = searchParameters

    /**
     * Returns the raw JSON value of [seed].
     *
     * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seed") @ExcludeMissing fun _seed(): JsonField<Long> = seed

    /**
     * Returns the raw JSON value of [serviceTier].
     *
     * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_tier")
    @ExcludeMissing
    fun _serviceTier(): JsonField<String> = serviceTier

    /**
     * Returns the raw JSON value of [stop].
     *
     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<Stop> = stop

    /**
     * Returns the raw JSON value of [store].
     *
     * Unlike [store], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("store") @ExcludeMissing fun _store(): JsonField<Boolean> = store

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

    /**
     * Returns the raw JSON value of [streamOptions].
     *
     * Unlike [streamOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream_options")
    @ExcludeMissing
    fun _streamOptions(): JsonField<JsonObjectInput> = streamOptions

    /**
     * Returns the raw JSON value of [systemInstruction].
     *
     * Unlike [systemInstruction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("system_instruction")
    @ExcludeMissing
    fun _systemInstruction(): JsonField<JsonObjectInput> = systemInstruction

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [thinking].
     *
     * Unlike [thinking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thinking") @ExcludeMissing fun _thinking(): JsonField<JsonObjectInput> = thinking

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_choice")
    @ExcludeMissing
    fun _toolChoice(): JsonField<ToolChoice> = toolChoice

    /**
     * Returns the raw JSON value of [toolConfig].
     *
     * Unlike [toolConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_config")
    @ExcludeMissing
    fun _toolConfig(): JsonField<JsonObjectInput> = toolConfig

    /**
     * Returns the raw JSON value of [topK].
     *
     * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

    /**
     * Returns the raw JSON value of [topLogprobs].
     *
     * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_logprobs") @ExcludeMissing fun _topLogprobs(): JsonField<Long> = topLogprobs

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

    /**
     * Returns the raw JSON value of [truncation].
     *
     * Unlike [truncation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("truncation")
    @ExcludeMissing
    fun _truncation(): JsonField<Truncation> = truncation

    /**
     * Returns the raw JSON value of [turnDetection].
     *
     * Unlike [turnDetection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("turn_detection")
    @ExcludeMissing
    fun _turnDetection(): JsonField<JsonObjectInput> = turnDetection

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

    /**
     * Returns the raw JSON value of [verbosity].
     *
     * Unlike [verbosity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verbosity") @ExcludeMissing fun _verbosity(): JsonField<String> = verbosity

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

    /**
     * Returns the raw JSON value of [webSearchOptions].
     *
     * Unlike [webSearchOptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("web_search_options")
    @ExcludeMissing
    fun _webSearchOptions(): JsonField<JsonObjectInput> = webSearchOptions

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

        /** Returns a mutable builder for constructing an instance of [ModelSettings]. */
        fun builder() = Builder()
    }

    /** A builder for [ModelSettings]. */
    class Builder internal constructor() {

        private var attributes: JsonField<Attributes> = JsonMissing.of()
        private var audio: JsonField<JsonObjectInput> = JsonMissing.of()
        private var deferred: JsonField<Boolean> = JsonMissing.of()
        private var extraArgs: JsonField<ExtraArgs> = JsonMissing.of()
        private var extraHeaders: JsonField<ExtraHeaders> = JsonMissing.of()
        private var extraQuery: JsonField<ExtraQuery> = JsonMissing.of()
        private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
        private var generationConfig: JsonField<JsonObjectInput> = JsonMissing.of()
        private var includeUsage: JsonField<Boolean> = JsonMissing.of()
        private var inputAudioFormat: JsonField<String> = JsonMissing.of()
        private var inputAudioTranscription: JsonField<JsonObjectInput> = JsonMissing.of()
        private var logitBias: JsonField<LogitBias> = JsonMissing.of()
        private var logprobs: JsonField<Boolean> = JsonMissing.of()
        private var maxCompletionTokens: JsonField<Long> = JsonMissing.of()
        private var maxTokens: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var modalities: JsonField<MutableList<String>>? = null
        private var n: JsonField<Long> = JsonMissing.of()
        private var outputAudioFormat: JsonField<String> = JsonMissing.of()
        private var parallelToolCalls: JsonField<Boolean> = JsonMissing.of()
        private var prediction: JsonField<JsonObjectInput> = JsonMissing.of()
        private var presencePenalty: JsonField<Double> = JsonMissing.of()
        private var promptCacheKey: JsonField<String> = JsonMissing.of()
        private var reasoning: JsonField<Reasoning> = JsonMissing.of()
        private var reasoningEffort: JsonField<String> = JsonMissing.of()
        private var responseFormat: JsonField<JsonObjectInput> = JsonMissing.of()
        private var safetyIdentifier: JsonField<String> = JsonMissing.of()
        private var safetySettings: JsonField<MutableList<JsonObjectInput>>? = null
        private var searchParameters: JsonField<JsonObjectInput> = JsonMissing.of()
        private var seed: JsonField<Long> = JsonMissing.of()
        private var serviceTier: JsonField<String> = JsonMissing.of()
        private var stop: JsonField<Stop> = JsonMissing.of()
        private var store: JsonField<Boolean> = JsonMissing.of()
        private var stream: JsonField<Boolean> = JsonMissing.of()
        private var streamOptions: JsonField<JsonObjectInput> = JsonMissing.of()
        private var structuredOutput: JsonValue = JsonMissing.of()
        private var systemInstruction: JsonField<JsonObjectInput> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var thinking: JsonField<JsonObjectInput> = JsonMissing.of()
        private var timeout: JsonField<Double> = JsonMissing.of()
        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
        private var toolConfig: JsonField<JsonObjectInput> = JsonMissing.of()
        private var topK: JsonField<Long> = JsonMissing.of()
        private var topLogprobs: JsonField<Long> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var truncation: JsonField<Truncation> = JsonMissing.of()
        private var turnDetection: JsonField<JsonObjectInput> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var verbosity: JsonField<String> = JsonMissing.of()
        private var voice: JsonField<String> = JsonMissing.of()
        private var webSearchOptions: JsonField<JsonObjectInput> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(modelSettings: ModelSettings) = apply {
            attributes = modelSettings.attributes
            audio = modelSettings.audio
            deferred = modelSettings.deferred
            extraArgs = modelSettings.extraArgs
            extraHeaders = modelSettings.extraHeaders
            extraQuery = modelSettings.extraQuery
            frequencyPenalty = modelSettings.frequencyPenalty
            generationConfig = modelSettings.generationConfig
            includeUsage = modelSettings.includeUsage
            inputAudioFormat = modelSettings.inputAudioFormat
            inputAudioTranscription = modelSettings.inputAudioTranscription
            logitBias = modelSettings.logitBias
            logprobs = modelSettings.logprobs
            maxCompletionTokens = modelSettings.maxCompletionTokens
            maxTokens = modelSettings.maxTokens
            metadata = modelSettings.metadata
            modalities = modelSettings.modalities.map { it.toMutableList() }
            n = modelSettings.n
            outputAudioFormat = modelSettings.outputAudioFormat
            parallelToolCalls = modelSettings.parallelToolCalls
            prediction = modelSettings.prediction
            presencePenalty = modelSettings.presencePenalty
            promptCacheKey = modelSettings.promptCacheKey
            reasoning = modelSettings.reasoning
            reasoningEffort = modelSettings.reasoningEffort
            responseFormat = modelSettings.responseFormat
            safetyIdentifier = modelSettings.safetyIdentifier
            safetySettings = modelSettings.safetySettings.map { it.toMutableList() }
            searchParameters = modelSettings.searchParameters
            seed = modelSettings.seed
            serviceTier = modelSettings.serviceTier
            stop = modelSettings.stop
            store = modelSettings.store
            stream = modelSettings.stream
            streamOptions = modelSettings.streamOptions
            structuredOutput = modelSettings.structuredOutput
            systemInstruction = modelSettings.systemInstruction
            temperature = modelSettings.temperature
            thinking = modelSettings.thinking
            timeout = modelSettings.timeout
            toolChoice = modelSettings.toolChoice
            toolConfig = modelSettings.toolConfig
            topK = modelSettings.topK
            topLogprobs = modelSettings.topLogprobs
            topP = modelSettings.topP
            truncation = modelSettings.truncation
            turnDetection = modelSettings.turnDetection
            user = modelSettings.user
            verbosity = modelSettings.verbosity
            voice = modelSettings.voice
            webSearchOptions = modelSettings.webSearchOptions
            additionalProperties = modelSettings.additionalProperties.toMutableMap()
        }

        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        fun audio(audio: JsonObjectInput?) = audio(JsonField.ofNullable(audio))

        /**
         * Sets [Builder.audio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audio] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun audio(audio: JsonField<JsonObjectInput>) = apply { this.audio = audio }

        fun deferred(deferred: Boolean?) = deferred(JsonField.ofNullable(deferred))

        /**
         * Alias for [Builder.deferred].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun deferred(deferred: Boolean) = deferred(deferred as Boolean?)

        /**
         * Sets [Builder.deferred] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deferred] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deferred(deferred: JsonField<Boolean>) = apply { this.deferred = deferred }

        fun extraArgs(extraArgs: ExtraArgs?) = extraArgs(JsonField.ofNullable(extraArgs))

        /**
         * Sets [Builder.extraArgs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extraArgs] with a well-typed [ExtraArgs] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extraArgs(extraArgs: JsonField<ExtraArgs>) = apply { this.extraArgs = extraArgs }

        fun extraHeaders(extraHeaders: ExtraHeaders?) =
            extraHeaders(JsonField.ofNullable(extraHeaders))

        /**
         * Sets [Builder.extraHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extraHeaders] with a well-typed [ExtraHeaders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extraHeaders(extraHeaders: JsonField<ExtraHeaders>) = apply {
            this.extraHeaders = extraHeaders
        }

        fun extraQuery(extraQuery: ExtraQuery?) = extraQuery(JsonField.ofNullable(extraQuery))

        /**
         * Sets [Builder.extraQuery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extraQuery] with a well-typed [ExtraQuery] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extraQuery(extraQuery: JsonField<ExtraQuery>) = apply { this.extraQuery = extraQuery }

        fun frequencyPenalty(frequencyPenalty: Double?) =
            frequencyPenalty(JsonField.ofNullable(frequencyPenalty))

        /**
         * Alias for [Builder.frequencyPenalty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun frequencyPenalty(frequencyPenalty: Double) =
            frequencyPenalty(frequencyPenalty as Double?)

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            this.frequencyPenalty = frequencyPenalty
        }

        fun generationConfig(generationConfig: JsonObjectInput?) =
            generationConfig(JsonField.ofNullable(generationConfig))

        /**
         * Sets [Builder.generationConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generationConfig] with a well-typed [JsonObjectInput]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun generationConfig(generationConfig: JsonField<JsonObjectInput>) = apply {
            this.generationConfig = generationConfig
        }

        fun includeUsage(includeUsage: Boolean?) = includeUsage(JsonField.ofNullable(includeUsage))

        /**
         * Alias for [Builder.includeUsage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeUsage(includeUsage: Boolean) = includeUsage(includeUsage as Boolean?)

        /**
         * Sets [Builder.includeUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeUsage] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun includeUsage(includeUsage: JsonField<Boolean>) = apply {
            this.includeUsage = includeUsage
        }

        fun inputAudioFormat(inputAudioFormat: String?) =
            inputAudioFormat(JsonField.ofNullable(inputAudioFormat))

        /**
         * Sets [Builder.inputAudioFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputAudioFormat] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputAudioFormat(inputAudioFormat: JsonField<String>) = apply {
            this.inputAudioFormat = inputAudioFormat
        }

        fun inputAudioTranscription(inputAudioTranscription: JsonObjectInput?) =
            inputAudioTranscription(JsonField.ofNullable(inputAudioTranscription))

        /**
         * Sets [Builder.inputAudioTranscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputAudioTranscription] with a well-typed
         * [JsonObjectInput] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun inputAudioTranscription(inputAudioTranscription: JsonField<JsonObjectInput>) = apply {
            this.inputAudioTranscription = inputAudioTranscription
        }

        fun logitBias(logitBias: LogitBias?) = logitBias(JsonField.ofNullable(logitBias))

        /**
         * Sets [Builder.logitBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logitBias] with a well-typed [LogitBias] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logitBias(logitBias: JsonField<LogitBias>) = apply { this.logitBias = logitBias }

        fun logprobs(logprobs: Boolean?) = logprobs(JsonField.ofNullable(logprobs))

        /**
         * Alias for [Builder.logprobs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun logprobs(logprobs: Boolean) = logprobs(logprobs as Boolean?)

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logprobs(logprobs: JsonField<Boolean>) = apply { this.logprobs = logprobs }

        fun maxCompletionTokens(maxCompletionTokens: Long?) =
            maxCompletionTokens(JsonField.ofNullable(maxCompletionTokens))

        /**
         * Alias for [Builder.maxCompletionTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxCompletionTokens(maxCompletionTokens: Long) =
            maxCompletionTokens(maxCompletionTokens as Long?)

        /**
         * Sets [Builder.maxCompletionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxCompletionTokens] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxCompletionTokens(maxCompletionTokens: JsonField<Long>) = apply {
            this.maxCompletionTokens = maxCompletionTokens
        }

        fun maxTokens(maxTokens: Long?) = maxTokens(JsonField.ofNullable(maxTokens))

        /**
         * Alias for [Builder.maxTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTokens(maxTokens: Long) = maxTokens(maxTokens as Long?)

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun modalities(modalities: List<String>?) = modalities(JsonField.ofNullable(modalities))

        /**
         * Sets [Builder.modalities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modalities] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modalities(modalities: JsonField<List<String>>) = apply {
            this.modalities = modalities.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [modalities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModality(modality: String) = apply {
            modalities =
                (modalities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("modalities", it).add(modality)
                }
        }

        fun n(n: Long?) = n(JsonField.ofNullable(n))

        /**
         * Alias for [Builder.n].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun n(n: Long) = n(n as Long?)

        /**
         * Sets [Builder.n] to an arbitrary JSON value.
         *
         * You should usually call [Builder.n] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: JsonField<Long>) = apply { this.n = n }

        fun outputAudioFormat(outputAudioFormat: String?) =
            outputAudioFormat(JsonField.ofNullable(outputAudioFormat))

        /**
         * Sets [Builder.outputAudioFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputAudioFormat] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputAudioFormat(outputAudioFormat: JsonField<String>) = apply {
            this.outputAudioFormat = outputAudioFormat
        }

        fun parallelToolCalls(parallelToolCalls: Boolean?) =
            parallelToolCalls(JsonField.ofNullable(parallelToolCalls))

        /**
         * Alias for [Builder.parallelToolCalls].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun parallelToolCalls(parallelToolCalls: Boolean) =
            parallelToolCalls(parallelToolCalls as Boolean?)

        /**
         * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            this.parallelToolCalls = parallelToolCalls
        }

        fun prediction(prediction: JsonObjectInput?) = prediction(JsonField.ofNullable(prediction))

        /**
         * Sets [Builder.prediction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prediction] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prediction(prediction: JsonField<JsonObjectInput>) = apply {
            this.prediction = prediction
        }

        fun presencePenalty(presencePenalty: Double?) =
            presencePenalty(JsonField.ofNullable(presencePenalty))

        /**
         * Alias for [Builder.presencePenalty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun presencePenalty(presencePenalty: Double) = presencePenalty(presencePenalty as Double?)

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            this.presencePenalty = presencePenalty
        }

        fun promptCacheKey(promptCacheKey: String?) =
            promptCacheKey(JsonField.ofNullable(promptCacheKey))

        /**
         * Sets [Builder.promptCacheKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCacheKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promptCacheKey(promptCacheKey: JsonField<String>) = apply {
            this.promptCacheKey = promptCacheKey
        }

        /**
         * **gpt-5 and o-series models only**
         *
         * Configuration options for
         * [reasoning models](https://platform.openai.com/docs/guides/reasoning).
         */
        fun reasoning(reasoning: Reasoning?) = reasoning(JsonField.ofNullable(reasoning))

        /**
         * Sets [Builder.reasoning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasoning] with a well-typed [Reasoning] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reasoning(reasoning: JsonField<Reasoning>) = apply { this.reasoning = reasoning }

        fun reasoningEffort(reasoningEffort: String?) =
            reasoningEffort(JsonField.ofNullable(reasoningEffort))

        /**
         * Sets [Builder.reasoningEffort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasoningEffort] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reasoningEffort(reasoningEffort: JsonField<String>) = apply {
            this.reasoningEffort = reasoningEffort
        }

        fun responseFormat(responseFormat: JsonObjectInput?) =
            responseFormat(JsonField.ofNullable(responseFormat))

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [JsonObjectInput]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun responseFormat(responseFormat: JsonField<JsonObjectInput>) = apply {
            this.responseFormat = responseFormat
        }

        fun safetyIdentifier(safetyIdentifier: String?) =
            safetyIdentifier(JsonField.ofNullable(safetyIdentifier))

        /**
         * Sets [Builder.safetyIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.safetyIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun safetyIdentifier(safetyIdentifier: JsonField<String>) = apply {
            this.safetyIdentifier = safetyIdentifier
        }

        fun safetySettings(safetySettings: List<JsonObjectInput>?) =
            safetySettings(JsonField.ofNullable(safetySettings))

        /**
         * Sets [Builder.safetySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.safetySettings] with a well-typed
         * `List<JsonObjectInput>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun safetySettings(safetySettings: JsonField<List<JsonObjectInput>>) = apply {
            this.safetySettings = safetySettings.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonObjectInput] to [safetySettings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSafetySetting(safetySetting: JsonObjectInput) = apply {
            safetySettings =
                (safetySettings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("safetySettings", it).add(safetySetting)
                }
        }

        fun searchParameters(searchParameters: JsonObjectInput?) =
            searchParameters(JsonField.ofNullable(searchParameters))

        /**
         * Sets [Builder.searchParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchParameters] with a well-typed [JsonObjectInput]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun searchParameters(searchParameters: JsonField<JsonObjectInput>) = apply {
            this.searchParameters = searchParameters
        }

        fun seed(seed: Long?) = seed(JsonField.ofNullable(seed))

        /**
         * Alias for [Builder.seed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun seed(seed: Long) = seed(seed as Long?)

        /**
         * Sets [Builder.seed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seed(seed: JsonField<Long>) = apply { this.seed = seed }

        fun serviceTier(serviceTier: String?) = serviceTier(JsonField.ofNullable(serviceTier))

        /**
         * Sets [Builder.serviceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceTier(serviceTier: JsonField<String>) = apply { this.serviceTier = serviceTier }

        fun stop(stop: Stop?) = stop(JsonField.ofNullable(stop))

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed [Stop] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stop(stop: JsonField<Stop>) = apply { this.stop = stop }

        /** Alias for calling [stop] with `Stop.ofString(string)`. */
        fun stop(string: String) = stop(Stop.ofString(string))

        /** Alias for calling [stop] with `Stop.ofStrings(strings)`. */
        fun stopOfStrings(strings: List<String>) = stop(Stop.ofStrings(strings))

        fun store(store: Boolean?) = store(JsonField.ofNullable(store))

        /**
         * Alias for [Builder.store].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun store(store: Boolean) = store(store as Boolean?)

        /**
         * Sets [Builder.store] to an arbitrary JSON value.
         *
         * You should usually call [Builder.store] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun store(store: JsonField<Boolean>) = apply { this.store = store }

        fun stream(stream: Boolean?) = stream(JsonField.ofNullable(stream))

        /**
         * Alias for [Builder.stream].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stream(stream: Boolean) = stream(stream as Boolean?)

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

        fun streamOptions(streamOptions: JsonObjectInput?) =
            streamOptions(JsonField.ofNullable(streamOptions))

        /**
         * Sets [Builder.streamOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamOptions] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamOptions(streamOptions: JsonField<JsonObjectInput>) = apply {
            this.streamOptions = streamOptions
        }

        fun structuredOutput(structuredOutput: JsonValue) = apply {
            this.structuredOutput = structuredOutput
        }

        fun systemInstruction(systemInstruction: JsonObjectInput?) =
            systemInstruction(JsonField.ofNullable(systemInstruction))

        /**
         * Sets [Builder.systemInstruction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemInstruction] with a well-typed [JsonObjectInput]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun systemInstruction(systemInstruction: JsonField<JsonObjectInput>) = apply {
            this.systemInstruction = systemInstruction
        }

        fun temperature(temperature: Double?) = temperature(JsonField.ofNullable(temperature))

        /**
         * Alias for [Builder.temperature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun temperature(temperature: Double) = temperature(temperature as Double?)

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        fun thinking(thinking: JsonObjectInput?) = thinking(JsonField.ofNullable(thinking))

        /**
         * Sets [Builder.thinking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thinking] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thinking(thinking: JsonField<JsonObjectInput>) = apply { this.thinking = thinking }

        fun timeout(timeout: Double?) = timeout(JsonField.ofNullable(timeout))

        /**
         * Alias for [Builder.timeout].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeout(timeout: Double) = timeout(timeout as Double?)

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

        fun toolChoice(toolChoice: ToolChoice?) = toolChoice(JsonField.ofNullable(toolChoice))

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { this.toolChoice = toolChoice }

        /** Alias for calling [toolChoice] with `ToolChoice.ofUnionMember0(unionMember0)`. */
        fun toolChoice(unionMember0: ToolChoice.UnionMember0) =
            toolChoice(ToolChoice.ofUnionMember0(unionMember0))

        /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
        fun toolChoice(string: String) = toolChoice(ToolChoice.ofString(string))

        /** Alias for calling [toolChoice] with `ToolChoice.ofUnionMember2(unionMember2)`. */
        fun toolChoice(unionMember2: ToolChoice.UnionMember2) =
            toolChoice(ToolChoice.ofUnionMember2(unionMember2))

        /** Alias for calling [toolChoice] with `ToolChoice.ofMcp(mcp)`. */
        fun toolChoice(mcp: ToolChoice.McpToolChoice) = toolChoice(ToolChoice.ofMcp(mcp))

        fun toolConfig(toolConfig: JsonObjectInput?) = toolConfig(JsonField.ofNullable(toolConfig))

        /**
         * Sets [Builder.toolConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolConfig] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolConfig(toolConfig: JsonField<JsonObjectInput>) = apply {
            this.toolConfig = toolConfig
        }

        fun topK(topK: Long?) = topK(JsonField.ofNullable(topK))

        /**
         * Alias for [Builder.topK].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topK(topK: Long) = topK(topK as Long?)

        /**
         * Sets [Builder.topK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

        fun topLogprobs(topLogprobs: Long?) = topLogprobs(JsonField.ofNullable(topLogprobs))

        /**
         * Alias for [Builder.topLogprobs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topLogprobs(topLogprobs: Long) = topLogprobs(topLogprobs as Long?)

        /**
         * Sets [Builder.topLogprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLogprobs(topLogprobs: JsonField<Long>) = apply { this.topLogprobs = topLogprobs }

        fun topP(topP: Double?) = topP(JsonField.ofNullable(topP))

        /**
         * Alias for [Builder.topP].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topP(topP: Double) = topP(topP as Double?)

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

        fun truncation(truncation: Truncation?) = truncation(JsonField.ofNullable(truncation))

        /**
         * Sets [Builder.truncation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truncation] with a well-typed [Truncation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun truncation(truncation: JsonField<Truncation>) = apply { this.truncation = truncation }

        fun turnDetection(turnDetection: JsonObjectInput?) =
            turnDetection(JsonField.ofNullable(turnDetection))

        /**
         * Sets [Builder.turnDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turnDetection] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun turnDetection(turnDetection: JsonField<JsonObjectInput>) = apply {
            this.turnDetection = turnDetection
        }

        fun user(user: String?) = user(JsonField.ofNullable(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        fun verbosity(verbosity: String?) = verbosity(JsonField.ofNullable(verbosity))

        /**
         * Sets [Builder.verbosity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verbosity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun verbosity(verbosity: JsonField<String>) = apply { this.verbosity = verbosity }

        fun voice(voice: String?) = voice(JsonField.ofNullable(voice))

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<String>) = apply { this.voice = voice }

        fun webSearchOptions(webSearchOptions: JsonObjectInput?) =
            webSearchOptions(JsonField.ofNullable(webSearchOptions))

        /**
         * Sets [Builder.webSearchOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webSearchOptions] with a well-typed [JsonObjectInput]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webSearchOptions(webSearchOptions: JsonField<JsonObjectInput>) = apply {
            this.webSearchOptions = webSearchOptions
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
         * Returns an immutable instance of [ModelSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ModelSettings =
            ModelSettings(
                attributes,
                audio,
                deferred,
                extraArgs,
                extraHeaders,
                extraQuery,
                frequencyPenalty,
                generationConfig,
                includeUsage,
                inputAudioFormat,
                inputAudioTranscription,
                logitBias,
                logprobs,
                maxCompletionTokens,
                maxTokens,
                metadata,
                (modalities ?: JsonMissing.of()).map { it.toImmutable() },
                n,
                outputAudioFormat,
                parallelToolCalls,
                prediction,
                presencePenalty,
                promptCacheKey,
                reasoning,
                reasoningEffort,
                responseFormat,
                safetyIdentifier,
                (safetySettings ?: JsonMissing.of()).map { it.toImmutable() },
                searchParameters,
                seed,
                serviceTier,
                stop,
                store,
                stream,
                streamOptions,
                structuredOutput,
                systemInstruction,
                temperature,
                thinking,
                timeout,
                toolChoice,
                toolConfig,
                topK,
                topLogprobs,
                topP,
                truncation,
                turnDetection,
                user,
                verbosity,
                voice,
                webSearchOptions,
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
    fun validate(): ModelSettings = apply {
        if (validated) {
            return@apply
        }

        attributes()?.validate()
        audio()?.validate()
        deferred()
        extraArgs()?.validate()
        extraHeaders()?.validate()
        extraQuery()?.validate()
        frequencyPenalty()
        generationConfig()?.validate()
        includeUsage()
        inputAudioFormat()
        inputAudioTranscription()?.validate()
        logitBias()?.validate()
        logprobs()
        maxCompletionTokens()
        maxTokens()
        metadata()?.validate()
        modalities()
        n()
        outputAudioFormat()
        parallelToolCalls()
        prediction()?.validate()
        presencePenalty()
        promptCacheKey()
        reasoning()?.validate()
        reasoningEffort()
        responseFormat()?.validate()
        safetyIdentifier()
        safetySettings()?.forEach { it.validate() }
        searchParameters()?.validate()
        seed()
        serviceTier()
        stop()?.validate()
        store()
        stream()
        streamOptions()?.validate()
        systemInstruction()?.validate()
        temperature()
        thinking()?.validate()
        timeout()
        toolChoice()?.validate()
        toolConfig()?.validate()
        topK()
        topLogprobs()
        topP()
        truncation()?.validate()
        turnDetection()?.validate()
        user()
        verbosity()
        voice()
        webSearchOptions()?.validate()
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
        (attributes.asKnown()?.validity() ?: 0) +
            (audio.asKnown()?.validity() ?: 0) +
            (if (deferred.asKnown() == null) 0 else 1) +
            (extraArgs.asKnown()?.validity() ?: 0) +
            (extraHeaders.asKnown()?.validity() ?: 0) +
            (extraQuery.asKnown()?.validity() ?: 0) +
            (if (frequencyPenalty.asKnown() == null) 0 else 1) +
            (generationConfig.asKnown()?.validity() ?: 0) +
            (if (includeUsage.asKnown() == null) 0 else 1) +
            (if (inputAudioFormat.asKnown() == null) 0 else 1) +
            (inputAudioTranscription.asKnown()?.validity() ?: 0) +
            (logitBias.asKnown()?.validity() ?: 0) +
            (if (logprobs.asKnown() == null) 0 else 1) +
            (if (maxCompletionTokens.asKnown() == null) 0 else 1) +
            (if (maxTokens.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (modalities.asKnown()?.size ?: 0) +
            (if (n.asKnown() == null) 0 else 1) +
            (if (outputAudioFormat.asKnown() == null) 0 else 1) +
            (if (parallelToolCalls.asKnown() == null) 0 else 1) +
            (prediction.asKnown()?.validity() ?: 0) +
            (if (presencePenalty.asKnown() == null) 0 else 1) +
            (if (promptCacheKey.asKnown() == null) 0 else 1) +
            (reasoning.asKnown()?.validity() ?: 0) +
            (if (reasoningEffort.asKnown() == null) 0 else 1) +
            (responseFormat.asKnown()?.validity() ?: 0) +
            (if (safetyIdentifier.asKnown() == null) 0 else 1) +
            (safetySettings.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (searchParameters.asKnown()?.validity() ?: 0) +
            (if (seed.asKnown() == null) 0 else 1) +
            (if (serviceTier.asKnown() == null) 0 else 1) +
            (stop.asKnown()?.validity() ?: 0) +
            (if (store.asKnown() == null) 0 else 1) +
            (if (stream.asKnown() == null) 0 else 1) +
            (streamOptions.asKnown()?.validity() ?: 0) +
            (systemInstruction.asKnown()?.validity() ?: 0) +
            (if (temperature.asKnown() == null) 0 else 1) +
            (thinking.asKnown()?.validity() ?: 0) +
            (if (timeout.asKnown() == null) 0 else 1) +
            (toolChoice.asKnown()?.validity() ?: 0) +
            (toolConfig.asKnown()?.validity() ?: 0) +
            (if (topK.asKnown() == null) 0 else 1) +
            (if (topLogprobs.asKnown() == null) 0 else 1) +
            (if (topP.asKnown() == null) 0 else 1) +
            (truncation.asKnown()?.validity() ?: 0) +
            (turnDetection.asKnown()?.validity() ?: 0) +
            (if (user.asKnown() == null) 0 else 1) +
            (if (verbosity.asKnown() == null) 0 else 1) +
            (if (voice.asKnown() == null) 0 else 1) +
            (webSearchOptions.asKnown()?.validity() ?: 0)

    class Attributes
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Attributes]. */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                additionalProperties = attributes.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attributes = Attributes(additionalProperties.toImmutable())
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
        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Attributes{additionalProperties=$additionalProperties}"
    }

    class ExtraArgs
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ExtraArgs]. */
            fun builder() = Builder()
        }

        /** A builder for [ExtraArgs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(extraArgs: ExtraArgs) = apply {
                additionalProperties = extraArgs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExtraArgs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtraArgs = ExtraArgs(additionalProperties.toImmutable())
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
        fun validate(): ExtraArgs = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtraArgs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExtraArgs{additionalProperties=$additionalProperties}"
    }

    class ExtraHeaders
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ExtraHeaders]. */
            fun builder() = Builder()
        }

        /** A builder for [ExtraHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(extraHeaders: ExtraHeaders) = apply {
                additionalProperties = extraHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExtraHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtraHeaders = ExtraHeaders(additionalProperties.toImmutable())
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
        fun validate(): ExtraHeaders = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtraHeaders && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExtraHeaders{additionalProperties=$additionalProperties}"
    }

    class ExtraQuery
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ExtraQuery]. */
            fun builder() = Builder()
        }

        /** A builder for [ExtraQuery]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(extraQuery: ExtraQuery) = apply {
                additionalProperties = extraQuery.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExtraQuery].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtraQuery = ExtraQuery(additionalProperties.toImmutable())
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
        fun validate(): ExtraQuery = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtraQuery && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExtraQuery{additionalProperties=$additionalProperties}"
    }

    class LogitBias
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [LogitBias]. */
            fun builder() = Builder()
        }

        /** A builder for [LogitBias]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logitBias: LogitBias) = apply {
                additionalProperties = logitBias.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [LogitBias].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LogitBias = LogitBias(additionalProperties.toImmutable())
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
        fun validate(): LogitBias = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LogitBias && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LogitBias{additionalProperties=$additionalProperties}"
    }

    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Stop.Deserializer::class)
    @JsonSerialize(using = Stop.Serializer::class)
    class Stop
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

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
         * val result: String? = stop.accept(object : Stop.Visitor<String?> {
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
                strings != null -> visitor.visitStrings(strings)
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
        fun validate(): Stop = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}
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

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stop && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "Stop{string=$string}"
                strings != null -> "Stop{strings=$strings}"
                _json != null -> "Stop{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Stop")
            }

        companion object {

            fun ofString(string: String) = Stop(string = string)

            fun ofStrings(strings: List<String>) = Stop(strings = strings.toImmutable())
        }

        /** An interface that defines how to map each variant of [Stop] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Stop] to a value of type [T].
             *
             * An instance of [Stop] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Stop: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Stop>(Stop::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Stop {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Stop(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Stop(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Stop(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Stop>(Stop::class) {

            override fun serialize(
                value: Stop,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Stop")
                }
            }
        }
    }

    class Truncation @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val AUTO = of("auto")

            val DISABLED = of("disabled")

            fun of(value: String) = Truncation(JsonField.of(value))
        }

        /** An enum containing [Truncation]'s known values. */
        enum class Known {
            AUTO,
            DISABLED,
        }

        /**
         * An enum containing [Truncation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Truncation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            DISABLED,
            /**
             * An enum member indicating that [Truncation] was instantiated with an unknown value.
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
                AUTO -> Value.AUTO
                DISABLED -> Value.DISABLED
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
                AUTO -> Known.AUTO
                DISABLED -> Known.DISABLED
                else -> throw DedalusInvalidDataException("Unknown Truncation: $value")
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
        fun validate(): Truncation = apply {
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

            return other is Truncation && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelSettings &&
            attributes == other.attributes &&
            audio == other.audio &&
            deferred == other.deferred &&
            extraArgs == other.extraArgs &&
            extraHeaders == other.extraHeaders &&
            extraQuery == other.extraQuery &&
            frequencyPenalty == other.frequencyPenalty &&
            generationConfig == other.generationConfig &&
            includeUsage == other.includeUsage &&
            inputAudioFormat == other.inputAudioFormat &&
            inputAudioTranscription == other.inputAudioTranscription &&
            logitBias == other.logitBias &&
            logprobs == other.logprobs &&
            maxCompletionTokens == other.maxCompletionTokens &&
            maxTokens == other.maxTokens &&
            metadata == other.metadata &&
            modalities == other.modalities &&
            n == other.n &&
            outputAudioFormat == other.outputAudioFormat &&
            parallelToolCalls == other.parallelToolCalls &&
            prediction == other.prediction &&
            presencePenalty == other.presencePenalty &&
            promptCacheKey == other.promptCacheKey &&
            reasoning == other.reasoning &&
            reasoningEffort == other.reasoningEffort &&
            responseFormat == other.responseFormat &&
            safetyIdentifier == other.safetyIdentifier &&
            safetySettings == other.safetySettings &&
            searchParameters == other.searchParameters &&
            seed == other.seed &&
            serviceTier == other.serviceTier &&
            stop == other.stop &&
            store == other.store &&
            stream == other.stream &&
            streamOptions == other.streamOptions &&
            structuredOutput == other.structuredOutput &&
            systemInstruction == other.systemInstruction &&
            temperature == other.temperature &&
            thinking == other.thinking &&
            timeout == other.timeout &&
            toolChoice == other.toolChoice &&
            toolConfig == other.toolConfig &&
            topK == other.topK &&
            topLogprobs == other.topLogprobs &&
            topP == other.topP &&
            truncation == other.truncation &&
            turnDetection == other.turnDetection &&
            user == other.user &&
            verbosity == other.verbosity &&
            voice == other.voice &&
            webSearchOptions == other.webSearchOptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            attributes,
            audio,
            deferred,
            extraArgs,
            extraHeaders,
            extraQuery,
            frequencyPenalty,
            generationConfig,
            includeUsage,
            inputAudioFormat,
            inputAudioTranscription,
            logitBias,
            logprobs,
            maxCompletionTokens,
            maxTokens,
            metadata,
            modalities,
            n,
            outputAudioFormat,
            parallelToolCalls,
            prediction,
            presencePenalty,
            promptCacheKey,
            reasoning,
            reasoningEffort,
            responseFormat,
            safetyIdentifier,
            safetySettings,
            searchParameters,
            seed,
            serviceTier,
            stop,
            store,
            stream,
            streamOptions,
            structuredOutput,
            systemInstruction,
            temperature,
            thinking,
            timeout,
            toolChoice,
            toolConfig,
            topK,
            topLogprobs,
            topP,
            truncation,
            turnDetection,
            user,
            verbosity,
            voice,
            webSearchOptions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModelSettings{attributes=$attributes, audio=$audio, deferred=$deferred, extraArgs=$extraArgs, extraHeaders=$extraHeaders, extraQuery=$extraQuery, frequencyPenalty=$frequencyPenalty, generationConfig=$generationConfig, includeUsage=$includeUsage, inputAudioFormat=$inputAudioFormat, inputAudioTranscription=$inputAudioTranscription, logitBias=$logitBias, logprobs=$logprobs, maxCompletionTokens=$maxCompletionTokens, maxTokens=$maxTokens, metadata=$metadata, modalities=$modalities, n=$n, outputAudioFormat=$outputAudioFormat, parallelToolCalls=$parallelToolCalls, prediction=$prediction, presencePenalty=$presencePenalty, promptCacheKey=$promptCacheKey, reasoning=$reasoning, reasoningEffort=$reasoningEffort, responseFormat=$responseFormat, safetyIdentifier=$safetyIdentifier, safetySettings=$safetySettings, searchParameters=$searchParameters, seed=$seed, serviceTier=$serviceTier, stop=$stop, store=$store, stream=$stream, streamOptions=$streamOptions, structuredOutput=$structuredOutput, systemInstruction=$systemInstruction, temperature=$temperature, thinking=$thinking, timeout=$timeout, toolChoice=$toolChoice, toolConfig=$toolConfig, topK=$topK, topLogprobs=$topLogprobs, topP=$topP, truncation=$truncation, turnDetection=$turnDetection, user=$user, verbosity=$verbosity, voice=$voice, webSearchOptions=$webSearchOptions, additionalProperties=$additionalProperties}"
}
