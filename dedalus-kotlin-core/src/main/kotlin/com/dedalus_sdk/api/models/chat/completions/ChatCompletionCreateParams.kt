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
import com.dedalus_sdk.api.core.checkKnown
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.getOrThrow
import com.dedalus_sdk.api.core.toImmutable
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.dedalus_sdk.api.models.Credential
import com.dedalus_sdk.api.models.DedalusModel
import com.dedalus_sdk.api.models.DedalusModelChoice
import com.dedalus_sdk.api.models.JsonObjectInput
import com.dedalus_sdk.api.models.McpServerSpec
import com.dedalus_sdk.api.models.ResponseFormatJsonObject
import com.dedalus_sdk.api.models.ResponseFormatJsonSchema
import com.dedalus_sdk.api.models.ResponseFormatText
import com.dedalus_sdk.api.models.UnnamedSchemaWithArrayParent0
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
 * ChatCompletion request schema.
 *
 * Supports OpenAI-compatible parameters, provider-specific extensions, server-side execution, and
 * agent orchestration features.
 */
class ChatCompletionCreateParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val model: JsonField<Model>,
    private val agentAttributes: JsonField<AgentAttributes>,
    private val audio: JsonField<ChatCompletionAudioParam>,
    private val automaticToolExecution: JsonField<Boolean>,
    private val cachedContent: JsonField<String>,
    private val correlationId: JsonField<String>,
    private val credentials: JsonField<Credentials>,
    private val deferred: JsonField<Boolean>,
    private val deferredCalls: JsonField<List<DeferredCallResponse>>,
    private val frequencyPenalty: JsonField<Double>,
    private val functionCall: JsonField<String>,
    private val functions: JsonField<List<ChatCompletionFunctions>>,
    private val generationConfig: JsonField<JsonObjectInput>,
    private val guardrails: JsonField<List<Guardrail>>,
    private val handoffConfig: JsonField<HandoffConfig>,
    private val handoffMode: JsonField<Boolean>,
    private val inferenceGeo: JsonField<String>,
    private val logitBias: JsonField<LogitBias>,
    private val logprobs: JsonField<Boolean>,
    private val maxCompletionTokens: JsonField<Long>,
    private val maxTokens: JsonField<Long>,
    private val maxTurns: JsonField<Long>,
    private val mcpServers: JsonField<McpServers>,
    private val messages: JsonField<List<Message>>,
    private val metadata: JsonField<JsonObjectInput>,
    private val modalities: JsonField<List<String>>,
    private val modelAttributes: JsonField<ModelAttributes>,
    private val n: JsonField<Long>,
    private val outputConfig: JsonField<JsonObjectInput>,
    private val parallelToolCalls: JsonField<Boolean>,
    private val prediction: JsonField<PredictionContent>,
    private val presencePenalty: JsonField<Double>,
    private val promptCacheKey: JsonField<String>,
    private val promptCacheRetention: JsonField<String>,
    private val promptMode: JsonField<PromptMode>,
    private val reasoningEffort: JsonField<String>,
    private val responseFormat: JsonField<ResponseFormat>,
    private val safePrompt: JsonField<Boolean>,
    private val safetyIdentifier: JsonField<String>,
    private val safetySettings: JsonField<List<SafetySetting>>,
    private val searchParameters: JsonField<JsonObjectInput>,
    private val seed: JsonField<Long>,
    private val serviceTier: JsonField<String>,
    private val speed: JsonField<Speed>,
    private val stop: JsonField<Stop>,
    private val store: JsonField<Boolean>,
    private val stream: JsonField<Boolean>,
    private val streamOptions: JsonField<JsonObjectInput>,
    private val systemInstruction: JsonField<SystemInstruction>,
    private val temperature: JsonField<Double>,
    private val thinking: JsonField<Thinking>,
    private val toolChoice: JsonField<ToolChoice>,
    private val toolConfig: JsonField<JsonObjectInput>,
    private val tools: JsonField<List<ChatCompletionToolParam>>,
    private val topK: JsonField<Long>,
    private val topLogprobs: JsonField<Long>,
    private val topP: JsonField<Double>,
    private val user: JsonField<String>,
    private val verbosity: JsonField<String>,
    private val webSearchOptions: JsonField<JsonObjectInput>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
        @JsonProperty("agent_attributes")
        @ExcludeMissing
        agentAttributes: JsonField<AgentAttributes> = JsonMissing.of(),
        @JsonProperty("audio")
        @ExcludeMissing
        audio: JsonField<ChatCompletionAudioParam> = JsonMissing.of(),
        @JsonProperty("automatic_tool_execution")
        @ExcludeMissing
        automaticToolExecution: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cached_content")
        @ExcludeMissing
        cachedContent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("correlation_id")
        @ExcludeMissing
        correlationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credentials")
        @ExcludeMissing
        credentials: JsonField<Credentials> = JsonMissing.of(),
        @JsonProperty("deferred") @ExcludeMissing deferred: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("deferred_calls")
        @ExcludeMissing
        deferredCalls: JsonField<List<DeferredCallResponse>> = JsonMissing.of(),
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        frequencyPenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("function_call")
        @ExcludeMissing
        functionCall: JsonField<String> = JsonMissing.of(),
        @JsonProperty("functions")
        @ExcludeMissing
        functions: JsonField<List<ChatCompletionFunctions>> = JsonMissing.of(),
        @JsonProperty("generation_config")
        @ExcludeMissing
        generationConfig: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("guardrails")
        @ExcludeMissing
        guardrails: JsonField<List<Guardrail>> = JsonMissing.of(),
        @JsonProperty("handoff_config")
        @ExcludeMissing
        handoffConfig: JsonField<HandoffConfig> = JsonMissing.of(),
        @JsonProperty("handoff_mode")
        @ExcludeMissing
        handoffMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inference_geo")
        @ExcludeMissing
        inferenceGeo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logit_bias")
        @ExcludeMissing
        logitBias: JsonField<LogitBias> = JsonMissing.of(),
        @JsonProperty("logprobs") @ExcludeMissing logprobs: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_completion_tokens")
        @ExcludeMissing
        maxCompletionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_tokens") @ExcludeMissing maxTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_turns") @ExcludeMissing maxTurns: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mcp_servers")
        @ExcludeMissing
        mcpServers: JsonField<McpServers> = JsonMissing.of(),
        @JsonProperty("messages")
        @ExcludeMissing
        messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        metadata: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("modalities")
        @ExcludeMissing
        modalities: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("model_attributes")
        @ExcludeMissing
        modelAttributes: JsonField<ModelAttributes> = JsonMissing.of(),
        @JsonProperty("n") @ExcludeMissing n: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("output_config")
        @ExcludeMissing
        outputConfig: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("parallel_tool_calls")
        @ExcludeMissing
        parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("prediction")
        @ExcludeMissing
        prediction: JsonField<PredictionContent> = JsonMissing.of(),
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        presencePenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("prompt_cache_key")
        @ExcludeMissing
        promptCacheKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_cache_retention")
        @ExcludeMissing
        promptCacheRetention: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_mode")
        @ExcludeMissing
        promptMode: JsonField<PromptMode> = JsonMissing.of(),
        @JsonProperty("reasoning_effort")
        @ExcludeMissing
        reasoningEffort: JsonField<String> = JsonMissing.of(),
        @JsonProperty("response_format")
        @ExcludeMissing
        responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
        @JsonProperty("safe_prompt")
        @ExcludeMissing
        safePrompt: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("safety_identifier")
        @ExcludeMissing
        safetyIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("safety_settings")
        @ExcludeMissing
        safetySettings: JsonField<List<SafetySetting>> = JsonMissing.of(),
        @JsonProperty("search_parameters")
        @ExcludeMissing
        searchParameters: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("service_tier")
        @ExcludeMissing
        serviceTier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Speed> = JsonMissing.of(),
        @JsonProperty("stop") @ExcludeMissing stop: JsonField<Stop> = JsonMissing.of(),
        @JsonProperty("store") @ExcludeMissing store: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stream_options")
        @ExcludeMissing
        streamOptions: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("system_instruction")
        @ExcludeMissing
        systemInstruction: JsonField<SystemInstruction> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("thinking") @ExcludeMissing thinking: JsonField<Thinking> = JsonMissing.of(),
        @JsonProperty("tool_choice")
        @ExcludeMissing
        toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
        @JsonProperty("tool_config")
        @ExcludeMissing
        toolConfig: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("tools")
        @ExcludeMissing
        tools: JsonField<List<ChatCompletionToolParam>> = JsonMissing.of(),
        @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("top_logprobs")
        @ExcludeMissing
        topLogprobs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verbosity") @ExcludeMissing verbosity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("web_search_options")
        @ExcludeMissing
        webSearchOptions: JsonField<JsonObjectInput> = JsonMissing.of(),
    ) : this(
        model,
        agentAttributes,
        audio,
        automaticToolExecution,
        cachedContent,
        correlationId,
        credentials,
        deferred,
        deferredCalls,
        frequencyPenalty,
        functionCall,
        functions,
        generationConfig,
        guardrails,
        handoffConfig,
        handoffMode,
        inferenceGeo,
        logitBias,
        logprobs,
        maxCompletionTokens,
        maxTokens,
        maxTurns,
        mcpServers,
        messages,
        metadata,
        modalities,
        modelAttributes,
        n,
        outputConfig,
        parallelToolCalls,
        prediction,
        presencePenalty,
        promptCacheKey,
        promptCacheRetention,
        promptMode,
        reasoningEffort,
        responseFormat,
        safePrompt,
        safetyIdentifier,
        safetySettings,
        searchParameters,
        seed,
        serviceTier,
        speed,
        stop,
        store,
        stream,
        streamOptions,
        systemInstruction,
        temperature,
        thinking,
        toolChoice,
        toolConfig,
        tools,
        topK,
        topLogprobs,
        topP,
        user,
        verbosity,
        webSearchOptions,
        mutableMapOf(),
    )

    /**
     * Model identifier. Accepts model ID strings, lists for routing, or DedalusModel objects with
     * per-model settings.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): Model = model.getRequired("model")

    /**
     * Agent attributes. Values in [0.0, 1.0].
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentAttributes(): AgentAttributes? = agentAttributes.getNullable("agent_attributes")

    /**
     * Parameters for audio output. Required when audio output is requested with `modalities:
     * ["audio"]`. [Learn more](/docs/guides/audio).
     *
     * Fields:
     * - voice (required): VoiceIdsOrCustomVoice
     * - format (required): Literal["wav", "aac", "mp3", "flac", "opus", "pcm16"]
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audio(): ChatCompletionAudioParam? = audio.getNullable("audio")

    /**
     * Execute tools server-side. If false, returns raw tool calls for manual handling.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun automaticToolExecution(): Boolean? =
        automaticToolExecution.getNullable("automatic_tool_execution")

    /**
     * Optional. The name of the content [cached](https://ai.google.dev/gemini-api/docs/caching) to
     * use as context to serve the prediction. Format: `cachedContents/{cachedContent}`
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cachedContent(): String? = cachedContent.getNullable("cached_content")

    /**
     * Stable session ID for resuming a previous handoff. Returned by the server on handoff; echo it
     * on the next request to resume.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correlationId(): String? = correlationId.getNullable("correlation_id")

    /**
     * Credentials for MCP server authentication. Each credential is matched to servers by
     * connection name.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credentials(): Credentials? = credentials.getNullable("credentials")

    /**
     * If set to `true`, the request returns a `request_id`. You can then get the deferred response
     * by GET `/v1/chat/deferred-completion/{request_id}`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deferred(): Boolean? = deferred.getNullable("deferred")

    /**
     * Tier 2 stateless resumption. Deferred tool specs from a previous handoff response, sent back
     * verbatim so the server can resume without Redis.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deferredCalls(): List<DeferredCallResponse>? = deferredCalls.getNullable("deferred_calls")

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing
     * frequency in the text so far, decreasing the model's likelihood to repeat the same line
     * verbatim.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyPenalty(): Double? = frequencyPenalty.getNullable("frequency_penalty")

    /**
     * Deprecated in favor of `tool_choice`. Controls which (if any) function is called by the
     * model. `none` means the model will not call a function and instead generates a message.
     * `auto` means the model can pick between generating a message or calling a function.
     * Specifying a particular function via `{"name": "my_function"}` forces the model to call that
     * function. `none` is the default when no functions are present. `auto` is the default if
     * functions are present.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun functionCall(): String? = functionCall.getNullable("function_call")

    /**
     * Deprecated in favor of `tools`. A list of functions the model may generate JSON inputs for.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun functions(): List<ChatCompletionFunctions>? = functions.getNullable("functions")

    /**
     * Generation parameters wrapper (Google-specific)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generationConfig(): JsonObjectInput? = generationConfig.getNullable("generation_config")

    /**
     * Content filtering and safety policy configuration.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guardrails(): List<Guardrail>? = guardrails.getNullable("guardrails")

    /**
     * Configuration for multi-model handoffs.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun handoffConfig(): HandoffConfig? = handoffConfig.getNullable("handoff_config")

    /**
     * Handoff control. None or omitted: auto-detect. true: structured handoff (SDK). false: drop-in
     * (LLM re-run for mixed turns).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun handoffMode(): Boolean? = handoffMode.getNullable("handoff_mode")

    /**
     * Specifies the geographic region for inference processing. If not specified, the workspace's
     * `default_inference_geo` is used.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inferenceGeo(): String? = inferenceGeo.getNullable("inference_geo")

    /**
     * Modify the likelihood of specified tokens appearing in the completion. Accepts a JSON object
     * that maps tokens (specified by their token ID in the tokenizer) to an associated bias value
     * from -100 to 100. Mathematically, the bias is added to the logits generated by the model
     * prior to sampling. The exact effect will vary per model, but values between -1 and 1 should
     * decrease or increase likelihood of selection; values like -100 or 100 should result in a ban
     * or exclusive selection of the relevant token.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logitBias(): LogitBias? = logitBias.getNullable("logit_bias")

    /**
     * Whether to return log probabilities of the output tokens or not. If true, returns the log
     * probabilities of each output token returned in the `content` of `message`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logprobs(): Boolean? = logprobs.getNullable("logprobs")

    /**
     * Maximum tokens in completion (newer parameter name)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxCompletionTokens(): Long? = maxCompletionTokens.getNullable("max_completion_tokens")

    /**
     * Maximum tokens in completion
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

    /**
     * Maximum conversation turns.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTurns(): Long? = maxTurns.getNullable("max_turns")

    /**
     * MCP server identifiers. Accepts marketplace slugs, URLs, or MCPServerSpec objects. MCP tools
     * are executed server-side and billed separately.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcpServers(): McpServers? = mcpServers.getNullable("mcp_servers")

    /**
     * Conversation history (OpenAI: messages, Google: contents, Responses: input)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messages(): List<Message>? = messages.getNullable("messages")

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing
     * additional information about the object in a structured format, and querying for objects via
     * API or the dashboard. Keys are strings with a maximum length of 64 characters. Values are
     * strings with a maximum length of 512 characters.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): JsonObjectInput? = metadata.getNullable("metadata")

    /**
     * Output types that you would like the model to generate. Most models are capable of generating
     * text, which is the default: `["text"]` The `gpt-4o-audio-preview` model can also be used to
     * [generate audio](/docs/guides/audio). To request that this model generate both text and audio
     * responses, you can use: `["text", "audio"]`
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modalities(): List<String>? = modalities.getNullable("modalities")

    /**
     * Model attributes for routing. Maps model IDs to attribute dictionaries with values in
     * [0.0, 1.0].
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelAttributes(): ModelAttributes? = modelAttributes.getNullable("model_attributes")

    /**
     * How many chat completion choices to generate for each input message. Note that you will be
     * charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to
     * minimize costs.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun n(): Long? = n.getNullable("n")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputConfig(): JsonObjectInput? = outputConfig.getNullable("output_config")

    /**
     * Whether to enable parallel tool calls (Anthropic uses inverted polarity).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parallelToolCalls(): Boolean? = parallelToolCalls.getNullable("parallel_tool_calls")

    /**
     * Static predicted output content, such as the content of a text file that is being
     * regenerated.
     *
     * Fields:
     * - type (required): Literal["content"]
     * - content (required): str | Annotated[list[ChatCompletionRequestMessageContentPartText],
     *   MinLen(1), ArrayTitle("PredictionContentArray")]
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prediction(): PredictionContent? = prediction.getNullable("prediction")

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear
     * in the text so far, increasing the model's likelihood to talk about new topics.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presencePenalty(): Double? = presencePenalty.getNullable("presence_penalty")

    /**
     * Used by OpenAI to cache responses for similar requests to optimize your cache hit rates.
     * Replaces the `user` field. [Learn more](/docs/guides/prompt-caching).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCacheKey(): String? = promptCacheKey.getNullable("prompt_cache_key")

    /**
     * The retention policy for the prompt cache. Set to `24h` to enable extended prompt caching,
     * which keeps cached prefixes active for longer, up to a maximum of 24 hours.
     * [Learn more](/docs/guides/prompt-caching#prompt-cache-retention).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptCacheRetention(): String? = promptCacheRetention.getNullable("prompt_cache_retention")

    /**
     * Allows toggling between the reasoning mode and no system prompt. When set to `reasoning` the
     * system prompt for reasoning models will be used.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptMode(): PromptMode? = promptMode.getNullable("prompt_mode")

    /**
     * Constrains effort on reasoning for
     * [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported
     * values are `none`, `minimal`, `low`, `medium`, `high`, and `xhigh`. Reducing reasoning effort
     * can result in faster responses and fewer tokens used on reasoning in a response. - `gpt-5.1`
     * defaults to `none`, which does not perform reasoning. The supported reasoning values for
     * `gpt-5.1` are `none`, `low`, `medium`, and `high`. Tool calls are supported for all reasoning
     * values in gpt-5.1. - All models before `gpt-5.1` default to `medium` reasoning effort, and do
     * not support `none`. - The `gpt-5-pro` model defaults to (and only supports) `high` reasoning
     * effort. - `xhigh` is supported for all models after `gpt-5.1-codex-max`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasoningEffort(): String? = reasoningEffort.getNullable("reasoning_effort")

    /**
     * An object specifying the format that the model must output. Setting to `{ "type":
     * "json_schema", "json_schema": {...} }` enables Structured Outputs which ensures the model
     * will match your supplied JSON schema. Learn more in the
     * [Structured Outputs guide](/docs/guides/structured-outputs). Setting to `{ "type":
     * "json_object" }` enables the older JSON mode, which ensures the message the model generates
     * is valid JSON. Using `json_schema` is preferred for models that support it.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

    /**
     * Whether to inject a safety prompt before all conversations.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun safePrompt(): Boolean? = safePrompt.getNullable("safe_prompt")

    /**
     * A stable identifier used to help detect users of your application that may be violating
     * OpenAI's usage policies. The IDs should be a string that uniquely identifies each user. We
     * recommend hashing their username or email address, in order to avoid sending us any
     * identifying information. [Learn more](/docs/guides/safety-best-practices#safety-identifiers).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun safetyIdentifier(): String? = safetyIdentifier.getNullable("safety_identifier")

    /**
     * Safety/content filtering settings (Google-specific)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun safetySettings(): List<SafetySetting>? = safetySettings.getNullable("safety_settings")

    /**
     * Set the parameters to be used for searched data. If not set, no data will be acquired by the
     * model.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchParameters(): JsonObjectInput? = searchParameters.getNullable("search_parameters")

    /**
     * Random seed for deterministic output
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seed(): Long? = seed.getNullable("seed")

    /**
     * Service tier for request processing
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceTier(): String? = serviceTier.getNullable("service_tier")

    /**
     * The inference speed mode for this request. `"fast"` enables high output-tokens-per-second
     * inference.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speed(): Speed? = speed.getNullable("speed")

    /**
     * Sequences that stop generation
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stop(): Stop? = stop.getNullable("stop")

    /**
     * Whether or not to store the output of this chat completion request for use in our
     * [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products.
     * Supports text and image inputs. Note: image inputs over 8MB will be dropped.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun store(): Boolean? = store.getNullable("store")

    /**
     * Enable streaming response
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Boolean? = stream.getNullable("stream")

    /**
     * Options for streaming response. Only set this when you set `stream: true`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamOptions(): JsonObjectInput? = streamOptions.getNullable("stream_options")

    /**
     * System instruction/prompt
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemInstruction(): SystemInstruction? =
        systemInstruction.getNullable("system_instruction")

    /**
     * Sampling temperature (0-2 for most providers)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Double? = temperature.getNullable("temperature")

    /**
     * Extended thinking configuration (Anthropic-specific)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thinking(): Thinking? = thinking.getNullable("thinking")

    /**
     * Controls which (if any) tool is called by the model. `none` means the model will not call any
     * tool and instead generates a message. `auto` means the model can pick between generating a
     * message or calling one or more tools. `required` means the model must call one or more tools.
     * Specifying a particular tool via `{"type": "function", "function": {"name": "my_function"}}`
     * forces the model to call that tool. `none` is the default when no tools are present. `auto`
     * is the default if tools are present.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

    /**
     * Tool calling configuration (Google-specific)
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolConfig(): JsonObjectInput? = toolConfig.getNullable("tool_config")

    /**
     * Available tools/functions for the model
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): List<ChatCompletionToolParam>? = tools.getNullable("tools")

    /**
     * Top-k sampling parameter
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topK(): Long? = topK.getNullable("top_k")

    /**
     * An integer between 0 and 20 specifying the number of most likely tokens to return at each
     * token position, each with an associated log probability. `logprobs` must be set to `true` if
     * this parameter is used.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topLogprobs(): Long? = topLogprobs.getNullable("top_logprobs")

    /**
     * Nucleus sampling threshold
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Double? = topP.getNullable("top_p")

    /**
     * This field is being replaced by `safety_identifier` and `prompt_cache_key`. Use
     * `prompt_cache_key` instead to maintain caching optimizations. A stable identifier for your
     * end-users. Used to boost cache hit rates by better bucketing similar requests and to help
     * OpenAI detect and prevent abuse.
     * [Learn more](/docs/guides/safety-best-practices#safety-identifiers).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): String? = user.getNullable("user")

    /**
     * Constrains the verbosity of the model's response. Lower values will result in more concise
     * responses, while higher values will result in more verbose responses. Currently supported
     * values are `low`, `medium`, and `high`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verbosity(): String? = verbosity.getNullable("verbosity")

    /**
     * This tool searches the web for relevant results to use in a response. Learn more about the
     * [web search tool](/docs/guides/tools-web-search?api-mode=chat).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webSearchOptions(): JsonObjectInput? = webSearchOptions.getNullable("web_search_options")

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

    /**
     * Returns the raw JSON value of [agentAttributes].
     *
     * Unlike [agentAttributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_attributes")
    @ExcludeMissing
    fun _agentAttributes(): JsonField<AgentAttributes> = agentAttributes

    /**
     * Returns the raw JSON value of [audio].
     *
     * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<ChatCompletionAudioParam> = audio

    /**
     * Returns the raw JSON value of [automaticToolExecution].
     *
     * Unlike [automaticToolExecution], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("automatic_tool_execution")
    @ExcludeMissing
    fun _automaticToolExecution(): JsonField<Boolean> = automaticToolExecution

    /**
     * Returns the raw JSON value of [cachedContent].
     *
     * Unlike [cachedContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cached_content")
    @ExcludeMissing
    fun _cachedContent(): JsonField<String> = cachedContent

    /**
     * Returns the raw JSON value of [correlationId].
     *
     * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("correlation_id")
    @ExcludeMissing
    fun _correlationId(): JsonField<String> = correlationId

    /**
     * Returns the raw JSON value of [credentials].
     *
     * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credentials")
    @ExcludeMissing
    fun _credentials(): JsonField<Credentials> = credentials

    /**
     * Returns the raw JSON value of [deferred].
     *
     * Unlike [deferred], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deferred") @ExcludeMissing fun _deferred(): JsonField<Boolean> = deferred

    /**
     * Returns the raw JSON value of [deferredCalls].
     *
     * Unlike [deferredCalls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deferred_calls")
    @ExcludeMissing
    fun _deferredCalls(): JsonField<List<DeferredCallResponse>> = deferredCalls

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
     * Returns the raw JSON value of [functionCall].
     *
     * Unlike [functionCall], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("function_call")
    @ExcludeMissing
    fun _functionCall(): JsonField<String> = functionCall

    /**
     * Returns the raw JSON value of [functions].
     *
     * Unlike [functions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("functions")
    @ExcludeMissing
    fun _functions(): JsonField<List<ChatCompletionFunctions>> = functions

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
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guardrails")
    @ExcludeMissing
    fun _guardrails(): JsonField<List<Guardrail>> = guardrails

    /**
     * Returns the raw JSON value of [handoffConfig].
     *
     * Unlike [handoffConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("handoff_config")
    @ExcludeMissing
    fun _handoffConfig(): JsonField<HandoffConfig> = handoffConfig

    /**
     * Returns the raw JSON value of [handoffMode].
     *
     * Unlike [handoffMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("handoff_mode")
    @ExcludeMissing
    fun _handoffMode(): JsonField<Boolean> = handoffMode

    /**
     * Returns the raw JSON value of [inferenceGeo].
     *
     * Unlike [inferenceGeo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inference_geo")
    @ExcludeMissing
    fun _inferenceGeo(): JsonField<String> = inferenceGeo

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
     * Returns the raw JSON value of [maxTurns].
     *
     * Unlike [maxTurns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_turns") @ExcludeMissing fun _maxTurns(): JsonField<Long> = maxTurns

    /**
     * Returns the raw JSON value of [mcpServers].
     *
     * Unlike [mcpServers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp_servers")
    @ExcludeMissing
    fun _mcpServers(): JsonField<McpServers> = mcpServers

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages") @ExcludeMissing fun _messages(): JsonField<List<Message>> = messages

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<JsonObjectInput> = metadata

    /**
     * Returns the raw JSON value of [modalities].
     *
     * Unlike [modalities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modalities")
    @ExcludeMissing
    fun _modalities(): JsonField<List<String>> = modalities

    /**
     * Returns the raw JSON value of [modelAttributes].
     *
     * Unlike [modelAttributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_attributes")
    @ExcludeMissing
    fun _modelAttributes(): JsonField<ModelAttributes> = modelAttributes

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Long> = n

    /**
     * Returns the raw JSON value of [outputConfig].
     *
     * Unlike [outputConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_config")
    @ExcludeMissing
    fun _outputConfig(): JsonField<JsonObjectInput> = outputConfig

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
    fun _prediction(): JsonField<PredictionContent> = prediction

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
     * Returns the raw JSON value of [promptCacheRetention].
     *
     * Unlike [promptCacheRetention], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prompt_cache_retention")
    @ExcludeMissing
    fun _promptCacheRetention(): JsonField<String> = promptCacheRetention

    /**
     * Returns the raw JSON value of [promptMode].
     *
     * Unlike [promptMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_mode")
    @ExcludeMissing
    fun _promptMode(): JsonField<PromptMode> = promptMode

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
    fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

    /**
     * Returns the raw JSON value of [safePrompt].
     *
     * Unlike [safePrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("safe_prompt") @ExcludeMissing fun _safePrompt(): JsonField<Boolean> = safePrompt

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
    fun _safetySettings(): JsonField<List<SafetySetting>> = safetySettings

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
     * Returns the raw JSON value of [speed].
     *
     * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Speed> = speed

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
    fun _systemInstruction(): JsonField<SystemInstruction> = systemInstruction

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
    @JsonProperty("thinking") @ExcludeMissing fun _thinking(): JsonField<Thinking> = thinking

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
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools")
    @ExcludeMissing
    fun _tools(): JsonField<List<ChatCompletionToolParam>> = tools

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

        /**
         * Returns a mutable builder for constructing an instance of [ChatCompletionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionCreateParams]. */
    class Builder internal constructor() {

        private var model: JsonField<Model>? = null
        private var agentAttributes: JsonField<AgentAttributes> = JsonMissing.of()
        private var audio: JsonField<ChatCompletionAudioParam> = JsonMissing.of()
        private var automaticToolExecution: JsonField<Boolean> = JsonMissing.of()
        private var cachedContent: JsonField<String> = JsonMissing.of()
        private var correlationId: JsonField<String> = JsonMissing.of()
        private var credentials: JsonField<Credentials> = JsonMissing.of()
        private var deferred: JsonField<Boolean> = JsonMissing.of()
        private var deferredCalls: JsonField<MutableList<DeferredCallResponse>>? = null
        private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
        private var functionCall: JsonField<String> = JsonMissing.of()
        private var functions: JsonField<MutableList<ChatCompletionFunctions>>? = null
        private var generationConfig: JsonField<JsonObjectInput> = JsonMissing.of()
        private var guardrails: JsonField<MutableList<Guardrail>>? = null
        private var handoffConfig: JsonField<HandoffConfig> = JsonMissing.of()
        private var handoffMode: JsonField<Boolean> = JsonMissing.of()
        private var inferenceGeo: JsonField<String> = JsonMissing.of()
        private var logitBias: JsonField<LogitBias> = JsonMissing.of()
        private var logprobs: JsonField<Boolean> = JsonMissing.of()
        private var maxCompletionTokens: JsonField<Long> = JsonMissing.of()
        private var maxTokens: JsonField<Long> = JsonMissing.of()
        private var maxTurns: JsonField<Long> = JsonMissing.of()
        private var mcpServers: JsonField<McpServers> = JsonMissing.of()
        private var messages: JsonField<MutableList<Message>>? = null
        private var metadata: JsonField<JsonObjectInput> = JsonMissing.of()
        private var modalities: JsonField<MutableList<String>>? = null
        private var modelAttributes: JsonField<ModelAttributes> = JsonMissing.of()
        private var n: JsonField<Long> = JsonMissing.of()
        private var outputConfig: JsonField<JsonObjectInput> = JsonMissing.of()
        private var parallelToolCalls: JsonField<Boolean> = JsonMissing.of()
        private var prediction: JsonField<PredictionContent> = JsonMissing.of()
        private var presencePenalty: JsonField<Double> = JsonMissing.of()
        private var promptCacheKey: JsonField<String> = JsonMissing.of()
        private var promptCacheRetention: JsonField<String> = JsonMissing.of()
        private var promptMode: JsonField<PromptMode> = JsonMissing.of()
        private var reasoningEffort: JsonField<String> = JsonMissing.of()
        private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
        private var safePrompt: JsonField<Boolean> = JsonMissing.of()
        private var safetyIdentifier: JsonField<String> = JsonMissing.of()
        private var safetySettings: JsonField<MutableList<SafetySetting>>? = null
        private var searchParameters: JsonField<JsonObjectInput> = JsonMissing.of()
        private var seed: JsonField<Long> = JsonMissing.of()
        private var serviceTier: JsonField<String> = JsonMissing.of()
        private var speed: JsonField<Speed> = JsonMissing.of()
        private var stop: JsonField<Stop> = JsonMissing.of()
        private var store: JsonField<Boolean> = JsonMissing.of()
        private var stream: JsonField<Boolean> = JsonMissing.of()
        private var streamOptions: JsonField<JsonObjectInput> = JsonMissing.of()
        private var systemInstruction: JsonField<SystemInstruction> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var thinking: JsonField<Thinking> = JsonMissing.of()
        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
        private var toolConfig: JsonField<JsonObjectInput> = JsonMissing.of()
        private var tools: JsonField<MutableList<ChatCompletionToolParam>>? = null
        private var topK: JsonField<Long> = JsonMissing.of()
        private var topLogprobs: JsonField<Long> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var verbosity: JsonField<String> = JsonMissing.of()
        private var webSearchOptions: JsonField<JsonObjectInput> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionCreateParams: ChatCompletionCreateParams) = apply {
            model = chatCompletionCreateParams.model
            agentAttributes = chatCompletionCreateParams.agentAttributes
            audio = chatCompletionCreateParams.audio
            automaticToolExecution = chatCompletionCreateParams.automaticToolExecution
            cachedContent = chatCompletionCreateParams.cachedContent
            correlationId = chatCompletionCreateParams.correlationId
            credentials = chatCompletionCreateParams.credentials
            deferred = chatCompletionCreateParams.deferred
            deferredCalls = chatCompletionCreateParams.deferredCalls.map { it.toMutableList() }
            frequencyPenalty = chatCompletionCreateParams.frequencyPenalty
            functionCall = chatCompletionCreateParams.functionCall
            functions = chatCompletionCreateParams.functions.map { it.toMutableList() }
            generationConfig = chatCompletionCreateParams.generationConfig
            guardrails = chatCompletionCreateParams.guardrails.map { it.toMutableList() }
            handoffConfig = chatCompletionCreateParams.handoffConfig
            handoffMode = chatCompletionCreateParams.handoffMode
            inferenceGeo = chatCompletionCreateParams.inferenceGeo
            logitBias = chatCompletionCreateParams.logitBias
            logprobs = chatCompletionCreateParams.logprobs
            maxCompletionTokens = chatCompletionCreateParams.maxCompletionTokens
            maxTokens = chatCompletionCreateParams.maxTokens
            maxTurns = chatCompletionCreateParams.maxTurns
            mcpServers = chatCompletionCreateParams.mcpServers
            messages = chatCompletionCreateParams.messages.map { it.toMutableList() }
            metadata = chatCompletionCreateParams.metadata
            modalities = chatCompletionCreateParams.modalities.map { it.toMutableList() }
            modelAttributes = chatCompletionCreateParams.modelAttributes
            n = chatCompletionCreateParams.n
            outputConfig = chatCompletionCreateParams.outputConfig
            parallelToolCalls = chatCompletionCreateParams.parallelToolCalls
            prediction = chatCompletionCreateParams.prediction
            presencePenalty = chatCompletionCreateParams.presencePenalty
            promptCacheKey = chatCompletionCreateParams.promptCacheKey
            promptCacheRetention = chatCompletionCreateParams.promptCacheRetention
            promptMode = chatCompletionCreateParams.promptMode
            reasoningEffort = chatCompletionCreateParams.reasoningEffort
            responseFormat = chatCompletionCreateParams.responseFormat
            safePrompt = chatCompletionCreateParams.safePrompt
            safetyIdentifier = chatCompletionCreateParams.safetyIdentifier
            safetySettings = chatCompletionCreateParams.safetySettings.map { it.toMutableList() }
            searchParameters = chatCompletionCreateParams.searchParameters
            seed = chatCompletionCreateParams.seed
            serviceTier = chatCompletionCreateParams.serviceTier
            speed = chatCompletionCreateParams.speed
            stop = chatCompletionCreateParams.stop
            store = chatCompletionCreateParams.store
            stream = chatCompletionCreateParams.stream
            streamOptions = chatCompletionCreateParams.streamOptions
            systemInstruction = chatCompletionCreateParams.systemInstruction
            temperature = chatCompletionCreateParams.temperature
            thinking = chatCompletionCreateParams.thinking
            toolChoice = chatCompletionCreateParams.toolChoice
            toolConfig = chatCompletionCreateParams.toolConfig
            tools = chatCompletionCreateParams.tools.map { it.toMutableList() }
            topK = chatCompletionCreateParams.topK
            topLogprobs = chatCompletionCreateParams.topLogprobs
            topP = chatCompletionCreateParams.topP
            user = chatCompletionCreateParams.user
            verbosity = chatCompletionCreateParams.verbosity
            webSearchOptions = chatCompletionCreateParams.webSearchOptions
            additionalProperties = chatCompletionCreateParams.additionalProperties.toMutableMap()
        }

        /**
         * Model identifier. Accepts model ID strings, lists for routing, or DedalusModel objects
         * with per-model settings.
         */
        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

        /** Alias for calling [model] with `Model.ofModelId(modelId)`. */
        fun model(modelId: String) = model(Model.ofModelId(modelId))

        /** Alias for calling [model] with `Model.ofDedalus(dedalus)`. */
        fun model(dedalus: DedalusModel) = model(Model.ofDedalus(dedalus))

        /** Alias for calling [model] with `Model.ofDedalusModelChoices(dedalusModelChoices)`. */
        fun modelOfDedalusModelChoices(dedalusModelChoices: List<DedalusModelChoice>) =
            model(Model.ofDedalusModelChoices(dedalusModelChoices))

        /** Agent attributes. Values in [0.0, 1.0]. */
        fun agentAttributes(agentAttributes: AgentAttributes?) =
            agentAttributes(JsonField.ofNullable(agentAttributes))

        /**
         * Sets [Builder.agentAttributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentAttributes] with a well-typed [AgentAttributes]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun agentAttributes(agentAttributes: JsonField<AgentAttributes>) = apply {
            this.agentAttributes = agentAttributes
        }

        /**
         * Parameters for audio output. Required when audio output is requested with `modalities:
         * ["audio"]`. [Learn more](/docs/guides/audio).
         *
         * Fields:
         * - voice (required): VoiceIdsOrCustomVoice
         * - format (required): Literal["wav", "aac", "mp3", "flac", "opus", "pcm16"]
         */
        fun audio(audio: ChatCompletionAudioParam?) = audio(JsonField.ofNullable(audio))

        /**
         * Sets [Builder.audio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audio] with a well-typed [ChatCompletionAudioParam]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun audio(audio: JsonField<ChatCompletionAudioParam>) = apply { this.audio = audio }

        /** Execute tools server-side. If false, returns raw tool calls for manual handling. */
        fun automaticToolExecution(automaticToolExecution: Boolean) =
            automaticToolExecution(JsonField.of(automaticToolExecution))

        /**
         * Sets [Builder.automaticToolExecution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.automaticToolExecution] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun automaticToolExecution(automaticToolExecution: JsonField<Boolean>) = apply {
            this.automaticToolExecution = automaticToolExecution
        }

        /**
         * Optional. The name of the content [cached](https://ai.google.dev/gemini-api/docs/caching)
         * to use as context to serve the prediction. Format: `cachedContents/{cachedContent}`
         */
        fun cachedContent(cachedContent: String?) =
            cachedContent(JsonField.ofNullable(cachedContent))

        /**
         * Sets [Builder.cachedContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cachedContent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cachedContent(cachedContent: JsonField<String>) = apply {
            this.cachedContent = cachedContent
        }

        /**
         * Stable session ID for resuming a previous handoff. Returned by the server on handoff;
         * echo it on the next request to resume.
         */
        fun correlationId(correlationId: String?) =
            correlationId(JsonField.ofNullable(correlationId))

        /**
         * Sets [Builder.correlationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correlationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correlationId(correlationId: JsonField<String>) = apply {
            this.correlationId = correlationId
        }

        /**
         * Credentials for MCP server authentication. Each credential is matched to servers by
         * connection name.
         */
        fun credentials(credentials: Credentials?) = credentials(JsonField.ofNullable(credentials))

        /**
         * Sets [Builder.credentials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentials] with a well-typed [Credentials] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentials(credentials: JsonField<Credentials>) = apply {
            this.credentials = credentials
        }

        /** Alias for calling [credentials] with `Credentials.ofCredential(credential)`. */
        fun credentials(credential: Credential) = credentials(Credentials.ofCredential(credential))

        /** Alias for calling [credentials] with `Credentials.ofMcpCredentials(mcpCredentials)`. */
        fun credentialsOfMcpCredentials(mcpCredentials: List<Credential>) =
            credentials(Credentials.ofMcpCredentials(mcpCredentials))

        /**
         * If set to `true`, the request returns a `request_id`. You can then get the deferred
         * response by GET `/v1/chat/deferred-completion/{request_id}`.
         */
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

        /**
         * Tier 2 stateless resumption. Deferred tool specs from a previous handoff response, sent
         * back verbatim so the server can resume without Redis.
         */
        fun deferredCalls(deferredCalls: List<DeferredCallResponse>?) =
            deferredCalls(JsonField.ofNullable(deferredCalls))

        /**
         * Sets [Builder.deferredCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deferredCalls] with a well-typed
         * `List<DeferredCallResponse>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun deferredCalls(deferredCalls: JsonField<List<DeferredCallResponse>>) = apply {
            this.deferredCalls = deferredCalls.map { it.toMutableList() }
        }

        /**
         * Adds a single [DeferredCallResponse] to [deferredCalls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeferredCall(deferredCall: DeferredCallResponse) = apply {
            deferredCalls =
                (deferredCalls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deferredCalls", it).add(deferredCall)
                }
        }

        /**
         * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing
         * frequency in the text so far, decreasing the model's likelihood to repeat the same line
         * verbatim.
         */
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

        /**
         * Deprecated in favor of `tool_choice`. Controls which (if any) function is called by the
         * model. `none` means the model will not call a function and instead generates a message.
         * `auto` means the model can pick between generating a message or calling a function.
         * Specifying a particular function via `{"name": "my_function"}` forces the model to call
         * that function. `none` is the default when no functions are present. `auto` is the default
         * if functions are present.
         */
        fun functionCall(functionCall: String?) = functionCall(JsonField.ofNullable(functionCall))

        /**
         * Sets [Builder.functionCall] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functionCall] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun functionCall(functionCall: JsonField<String>) = apply {
            this.functionCall = functionCall
        }

        /**
         * Deprecated in favor of `tools`. A list of functions the model may generate JSON inputs
         * for.
         */
        fun functions(functions: List<ChatCompletionFunctions>?) =
            functions(JsonField.ofNullable(functions))

        /**
         * Sets [Builder.functions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functions] with a well-typed
         * `List<ChatCompletionFunctions>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun functions(functions: JsonField<List<ChatCompletionFunctions>>) = apply {
            this.functions = functions.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatCompletionFunctions] to [functions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFunction(function: ChatCompletionFunctions) = apply {
            functions =
                (functions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("functions", it).add(function)
                }
        }

        /** Generation parameters wrapper (Google-specific) */
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

        /** Content filtering and safety policy configuration. */
        fun guardrails(guardrails: List<Guardrail>?) = guardrails(JsonField.ofNullable(guardrails))

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed `List<Guardrail>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<List<Guardrail>>) = apply {
            this.guardrails = guardrails.map { it.toMutableList() }
        }

        /**
         * Adds a single [Guardrail] to [guardrails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuardrail(guardrail: Guardrail) = apply {
            guardrails =
                (guardrails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("guardrails", it).add(guardrail)
                }
        }

        /** Configuration for multi-model handoffs. */
        fun handoffConfig(handoffConfig: HandoffConfig?) =
            handoffConfig(JsonField.ofNullable(handoffConfig))

        /**
         * Sets [Builder.handoffConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.handoffConfig] with a well-typed [HandoffConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun handoffConfig(handoffConfig: JsonField<HandoffConfig>) = apply {
            this.handoffConfig = handoffConfig
        }

        /**
         * Handoff control. None or omitted: auto-detect. true: structured handoff (SDK). false:
         * drop-in (LLM re-run for mixed turns).
         */
        fun handoffMode(handoffMode: Boolean?) = handoffMode(JsonField.ofNullable(handoffMode))

        /**
         * Alias for [Builder.handoffMode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun handoffMode(handoffMode: Boolean) = handoffMode(handoffMode as Boolean?)

        /**
         * Sets [Builder.handoffMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.handoffMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun handoffMode(handoffMode: JsonField<Boolean>) = apply { this.handoffMode = handoffMode }

        /**
         * Specifies the geographic region for inference processing. If not specified, the
         * workspace's `default_inference_geo` is used.
         */
        fun inferenceGeo(inferenceGeo: String?) = inferenceGeo(JsonField.ofNullable(inferenceGeo))

        /**
         * Sets [Builder.inferenceGeo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inferenceGeo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inferenceGeo(inferenceGeo: JsonField<String>) = apply {
            this.inferenceGeo = inferenceGeo
        }

        /**
         * Modify the likelihood of specified tokens appearing in the completion. Accepts a JSON
         * object that maps tokens (specified by their token ID in the tokenizer) to an associated
         * bias value from -100 to 100. Mathematically, the bias is added to the logits generated by
         * the model prior to sampling. The exact effect will vary per model, but values between -1
         * and 1 should decrease or increase likelihood of selection; values like -100 or 100 should
         * result in a ban or exclusive selection of the relevant token.
         */
        fun logitBias(logitBias: LogitBias?) = logitBias(JsonField.ofNullable(logitBias))

        /**
         * Sets [Builder.logitBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logitBias] with a well-typed [LogitBias] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logitBias(logitBias: JsonField<LogitBias>) = apply { this.logitBias = logitBias }

        /**
         * Whether to return log probabilities of the output tokens or not. If true, returns the log
         * probabilities of each output token returned in the `content` of `message`.
         */
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

        /** Maximum tokens in completion (newer parameter name) */
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

        /** Maximum tokens in completion */
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

        /** Maximum conversation turns. */
        fun maxTurns(maxTurns: Long?) = maxTurns(JsonField.ofNullable(maxTurns))

        /**
         * Alias for [Builder.maxTurns].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTurns(maxTurns: Long) = maxTurns(maxTurns as Long?)

        /**
         * Sets [Builder.maxTurns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTurns] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTurns(maxTurns: JsonField<Long>) = apply { this.maxTurns = maxTurns }

        /**
         * MCP server identifiers. Accepts marketplace slugs, URLs, or MCPServerSpec objects. MCP
         * tools are executed server-side and billed separately.
         */
        fun mcpServers(mcpServers: McpServers?) = mcpServers(JsonField.ofNullable(mcpServers))

        /**
         * Sets [Builder.mcpServers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpServers] with a well-typed [McpServers] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mcpServers(mcpServers: JsonField<McpServers>) = apply { this.mcpServers = mcpServers }

        /** Alias for calling [mcpServers] with `McpServers.ofString(string)`. */
        fun mcpServers(string: String) = mcpServers(McpServers.ofString(string))

        /** Alias for calling [mcpServers] with `McpServers.ofServerSpec(serverSpec)`. */
        fun mcpServers(serverSpec: McpServerSpec) = mcpServers(McpServers.ofServerSpec(serverSpec))

        /** Alias for calling [Builder.mcpServers] with `McpServers.ofMcpServers(mcpServers)`. */
        fun mcpServersOfMcpServers(mcpServers: List<UnnamedSchemaWithArrayParent0>) =
            mcpServers(McpServers.ofMcpServers(mcpServers))

        /** Conversation history (OpenAI: messages, Google: contents, Responses: input) */
        fun messages(messages: List<Message>?) = messages(JsonField.ofNullable(messages))

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply {
            this.messages = messages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply {
            messages =
                (messages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("messages", it).add(message)
                }
        }

        /** Alias for calling [addMessage] with `Message.ofDeveloper(developer)`. */
        fun addMessage(developer: ChatCompletionDeveloperMessageParam) =
            addMessage(Message.ofDeveloper(developer))

        /**
         * Alias for calling [addMessage] with the following:
         * ```kotlin
         * ChatCompletionDeveloperMessageParam.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addDeveloperMessage(content: ChatCompletionDeveloperMessageParam.Content) =
            addMessage(ChatCompletionDeveloperMessageParam.builder().content(content).build())

        /**
         * Alias for calling [addDeveloperMessage] with
         * `ChatCompletionDeveloperMessageParam.Content.ofString(string)`.
         */
        fun addDeveloperMessage(string: String) =
            addDeveloperMessage(ChatCompletionDeveloperMessageParam.Content.ofString(string))

        /**
         * Alias for calling [addDeveloperMessage] with
         * `ChatCompletionDeveloperMessageParam.Content.ofChatCompletionRequestDeveloperMessageContentArray(chatCompletionRequestDeveloperMessageContentArray)`.
         */
        fun addDeveloperMessageOfChatCompletionRequestDeveloperMessageContentArray(
            chatCompletionRequestDeveloperMessageContentArray:
                List<ChatCompletionContentPartTextParam>
        ) =
            addDeveloperMessage(
                ChatCompletionDeveloperMessageParam.Content
                    .ofChatCompletionRequestDeveloperMessageContentArray(
                        chatCompletionRequestDeveloperMessageContentArray
                    )
            )

        /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
        fun addMessage(system: ChatCompletionSystemMessageParam) =
            addMessage(Message.ofSystem(system))

        /**
         * Alias for calling [addMessage] with the following:
         * ```kotlin
         * ChatCompletionSystemMessageParam.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemMessage(content: ChatCompletionSystemMessageParam.Content) =
            addMessage(ChatCompletionSystemMessageParam.builder().content(content).build())

        /**
         * Alias for calling [addSystemMessage] with
         * `ChatCompletionSystemMessageParam.Content.ofString(string)`.
         */
        fun addSystemMessage(string: String) =
            addSystemMessage(ChatCompletionSystemMessageParam.Content.ofString(string))

        /**
         * Alias for calling [addSystemMessage] with
         * `ChatCompletionSystemMessageParam.Content.ofChatCompletionRequestSystemMessageContentArray(chatCompletionRequestSystemMessageContentArray)`.
         */
        fun addSystemMessageOfChatCompletionRequestSystemMessageContentArray(
            chatCompletionRequestSystemMessageContentArray: List<ChatCompletionContentPartTextParam>
        ) =
            addSystemMessage(
                ChatCompletionSystemMessageParam.Content
                    .ofChatCompletionRequestSystemMessageContentArray(
                        chatCompletionRequestSystemMessageContentArray
                    )
            )

        /** Alias for calling [addMessage] with `Message.ofUser(user)`. */
        fun addMessage(user: ChatCompletionUserMessageParam) = addMessage(Message.ofUser(user))

        /**
         * Alias for calling [addMessage] with the following:
         * ```kotlin
         * ChatCompletionUserMessageParam.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserMessage(content: ChatCompletionUserMessageParam.Content) =
            addMessage(ChatCompletionUserMessageParam.builder().content(content).build())

        /**
         * Alias for calling [addUserMessage] with
         * `ChatCompletionUserMessageParam.Content.ofString(string)`.
         */
        fun addUserMessage(string: String) =
            addUserMessage(ChatCompletionUserMessageParam.Content.ofString(string))

        /**
         * Alias for calling [addUserMessage] with
         * `ChatCompletionUserMessageParam.Content.ofChatCompletionRequestUserMessageContentArray(chatCompletionRequestUserMessageContentArray)`.
         */
        fun addUserMessageOfChatCompletionRequestUserMessageContentArray(
            chatCompletionRequestUserMessageContentArray:
                List<ChatCompletionUserMessageParam.Content.UnnamedSchemaWithArrayParent2>
        ) =
            addUserMessage(
                ChatCompletionUserMessageParam.Content
                    .ofChatCompletionRequestUserMessageContentArray(
                        chatCompletionRequestUserMessageContentArray
                    )
            )

        /** Alias for calling [addMessage] with `Message.ofAssistant(assistant)`. */
        fun addMessage(assistant: ChatCompletionAssistantMessageParam) =
            addMessage(Message.ofAssistant(assistant))

        /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
        fun addMessage(tool: ChatCompletionToolMessageParam) = addMessage(Message.ofTool(tool))

        /** Alias for calling [addMessage] with `Message.ofFunction(function)`. */
        fun addMessage(function: ChatCompletionFunctionMessageParam) =
            addMessage(Message.ofFunction(function))

        /**
         * Set of 16 key-value pairs that can be attached to an object. This can be useful for
         * storing additional information about the object in a structured format, and querying for
         * objects via API or the dashboard. Keys are strings with a maximum length of 64
         * characters. Values are strings with a maximum length of 512 characters.
         */
        fun metadata(metadata: JsonObjectInput?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadata(metadata: JsonField<JsonObjectInput>) = apply { this.metadata = metadata }

        /**
         * Output types that you would like the model to generate. Most models are capable of
         * generating text, which is the default: `["text"]` The `gpt-4o-audio-preview` model can
         * also be used to [generate audio](/docs/guides/audio). To request that this model generate
         * both text and audio responses, you can use: `["text", "audio"]`
         */
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

        /**
         * Model attributes for routing. Maps model IDs to attribute dictionaries with values in
         * [0.0, 1.0].
         */
        fun modelAttributes(modelAttributes: ModelAttributes?) =
            modelAttributes(JsonField.ofNullable(modelAttributes))

        /**
         * Sets [Builder.modelAttributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelAttributes] with a well-typed [ModelAttributes]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun modelAttributes(modelAttributes: JsonField<ModelAttributes>) = apply {
            this.modelAttributes = modelAttributes
        }

        /**
         * How many chat completion choices to generate for each input message. Note that you will
         * be charged based on the number of generated tokens across all of the choices. Keep `n` as
         * `1` to minimize costs.
         */
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

        fun outputConfig(outputConfig: JsonObjectInput?) =
            outputConfig(JsonField.ofNullable(outputConfig))

        /**
         * Sets [Builder.outputConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputConfig] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputConfig(outputConfig: JsonField<JsonObjectInput>) = apply {
            this.outputConfig = outputConfig
        }

        /** Whether to enable parallel tool calls (Anthropic uses inverted polarity). */
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

        /**
         * Static predicted output content, such as the content of a text file that is being
         * regenerated.
         *
         * Fields:
         * - type (required): Literal["content"]
         * - content (required): str | Annotated[list[ChatCompletionRequestMessageContentPartText],
         *   MinLen(1), ArrayTitle("PredictionContentArray")]
         */
        fun prediction(prediction: PredictionContent?) =
            prediction(JsonField.ofNullable(prediction))

        /**
         * Sets [Builder.prediction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prediction] with a well-typed [PredictionContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prediction(prediction: JsonField<PredictionContent>) = apply {
            this.prediction = prediction
        }

        /**
         * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they
         * appear in the text so far, increasing the model's likelihood to talk about new topics.
         */
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

        /**
         * Used by OpenAI to cache responses for similar requests to optimize your cache hit rates.
         * Replaces the `user` field. [Learn more](/docs/guides/prompt-caching).
         */
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
         * The retention policy for the prompt cache. Set to `24h` to enable extended prompt
         * caching, which keeps cached prefixes active for longer, up to a maximum of 24 hours.
         * [Learn more](/docs/guides/prompt-caching#prompt-cache-retention).
         */
        fun promptCacheRetention(promptCacheRetention: String?) =
            promptCacheRetention(JsonField.ofNullable(promptCacheRetention))

        /**
         * Sets [Builder.promptCacheRetention] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCacheRetention] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promptCacheRetention(promptCacheRetention: JsonField<String>) = apply {
            this.promptCacheRetention = promptCacheRetention
        }

        /**
         * Allows toggling between the reasoning mode and no system prompt. When set to `reasoning`
         * the system prompt for reasoning models will be used.
         */
        fun promptMode(promptMode: PromptMode?) = promptMode(JsonField.ofNullable(promptMode))

        /**
         * Sets [Builder.promptMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptMode] with a well-typed [PromptMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promptMode(promptMode: JsonField<PromptMode>) = apply { this.promptMode = promptMode }

        /**
         * Constrains effort on reasoning for
         * [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently
         * supported values are `none`, `minimal`, `low`, `medium`, `high`, and `xhigh`. Reducing
         * reasoning effort can result in faster responses and fewer tokens used on reasoning in a
         * response. - `gpt-5.1` defaults to `none`, which does not perform reasoning. The supported
         * reasoning values for `gpt-5.1` are `none`, `low`, `medium`, and `high`. Tool calls are
         * supported for all reasoning values in gpt-5.1. - All models before `gpt-5.1` default to
         * `medium` reasoning effort, and do not support `none`. - The `gpt-5-pro` model defaults to
         * (and only supports) `high` reasoning effort. - `xhigh` is supported for all models after
         * `gpt-5.1-codex-max`.
         */
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

        /**
         * An object specifying the format that the model must output. Setting to `{ "type":
         * "json_schema", "json_schema": {...} }` enables Structured Outputs which ensures the model
         * will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](/docs/guides/structured-outputs). Setting to `{ "type":
         * "json_object" }` enables the older JSON mode, which ensures the message the model
         * generates is valid JSON. Using `json_schema` is preferred for models that support it.
         */
        fun responseFormat(responseFormat: ResponseFormat?) =
            responseFormat(JsonField.ofNullable(responseFormat))

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            this.responseFormat = responseFormat
        }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofText(text)`. */
        fun responseFormat(text: ResponseFormatText) = responseFormat(ResponseFormat.ofText(text))

        /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonSchema(jsonSchema)`. */
        fun responseFormat(jsonSchema: ResponseFormatJsonSchema) =
            responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

        /**
         * Alias for calling [responseFormat] with the following:
         * ```kotlin
         * ResponseFormatJsonSchema.builder()
         *     .jsonSchema(jsonSchema)
         *     .build()
         * ```
         */
        fun jsonSchemaResponseFormat(jsonSchema: ResponseFormatJsonSchema.JsonSchema) =
            responseFormat(ResponseFormatJsonSchema.builder().jsonSchema(jsonSchema).build())

        /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonObject(jsonObject)`. */
        fun responseFormat(jsonObject: ResponseFormatJsonObject) =
            responseFormat(ResponseFormat.ofJsonObject(jsonObject))

        /** Whether to inject a safety prompt before all conversations. */
        fun safePrompt(safePrompt: Boolean?) = safePrompt(JsonField.ofNullable(safePrompt))

        /**
         * Alias for [Builder.safePrompt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun safePrompt(safePrompt: Boolean) = safePrompt(safePrompt as Boolean?)

        /**
         * Sets [Builder.safePrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.safePrompt] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun safePrompt(safePrompt: JsonField<Boolean>) = apply { this.safePrompt = safePrompt }

        /**
         * A stable identifier used to help detect users of your application that may be violating
         * OpenAI's usage policies. The IDs should be a string that uniquely identifies each user.
         * We recommend hashing their username or email address, in order to avoid sending us any
         * identifying information.
         * [Learn more](/docs/guides/safety-best-practices#safety-identifiers).
         */
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

        /** Safety/content filtering settings (Google-specific) */
        fun safetySettings(safetySettings: List<SafetySetting>?) =
            safetySettings(JsonField.ofNullable(safetySettings))

        /**
         * Sets [Builder.safetySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.safetySettings] with a well-typed `List<SafetySetting>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun safetySettings(safetySettings: JsonField<List<SafetySetting>>) = apply {
            this.safetySettings = safetySettings.map { it.toMutableList() }
        }

        /**
         * Adds a single [SafetySetting] to [safetySettings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSafetySetting(safetySetting: SafetySetting) = apply {
            safetySettings =
                (safetySettings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("safetySettings", it).add(safetySetting)
                }
        }

        /**
         * Set the parameters to be used for searched data. If not set, no data will be acquired by
         * the model.
         */
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

        /** Random seed for deterministic output */
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

        /** Service tier for request processing */
        fun serviceTier(serviceTier: String?) = serviceTier(JsonField.ofNullable(serviceTier))

        /**
         * Sets [Builder.serviceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceTier(serviceTier: JsonField<String>) = apply { this.serviceTier = serviceTier }

        /**
         * The inference speed mode for this request. `"fast"` enables high output-tokens-per-second
         * inference.
         */
        fun speed(speed: Speed?) = speed(JsonField.ofNullable(speed))

        /**
         * Sets [Builder.speed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speed] with a well-typed [Speed] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speed(speed: JsonField<Speed>) = apply { this.speed = speed }

        /** Sequences that stop generation */
        fun stop(stop: Stop?) = stop(JsonField.ofNullable(stop))

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed [Stop] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stop(stop: JsonField<Stop>) = apply { this.stop = stop }

        /** Alias for calling [stop] with `Stop.ofStrings(strings)`. */
        fun stopOfStrings(strings: List<String>) = stop(Stop.ofStrings(strings))

        /** Alias for calling [stop] with `Stop.ofString(string)`. */
        fun stop(string: String) = stop(Stop.ofString(string))

        /**
         * Whether or not to store the output of this chat completion request for use in our
         * [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products.
         * Supports text and image inputs. Note: image inputs over 8MB will be dropped.
         */
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

        /** Enable streaming response */
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

        /** Options for streaming response. Only set this when you set `stream: true`. */
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

        /** System instruction/prompt */
        fun systemInstruction(systemInstruction: SystemInstruction?) =
            systemInstruction(JsonField.ofNullable(systemInstruction))

        /**
         * Sets [Builder.systemInstruction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemInstruction] with a well-typed [SystemInstruction]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun systemInstruction(systemInstruction: JsonField<SystemInstruction>) = apply {
            this.systemInstruction = systemInstruction
        }

        /**
         * Alias for calling [systemInstruction] with
         * `SystemInstruction.ofJsonObjectInput(jsonObjectInput)`.
         */
        fun systemInstruction(jsonObjectInput: JsonObjectInput) =
            systemInstruction(SystemInstruction.ofJsonObjectInput(jsonObjectInput))

        /** Alias for calling [systemInstruction] with `SystemInstruction.ofString(string)`. */
        fun systemInstruction(string: String) =
            systemInstruction(SystemInstruction.ofString(string))

        /** Sampling temperature (0-2 for most providers) */
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

        /** Extended thinking configuration (Anthropic-specific) */
        fun thinking(thinking: Thinking?) = thinking(JsonField.ofNullable(thinking))

        /**
         * Sets [Builder.thinking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thinking] with a well-typed [Thinking] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun thinking(thinking: JsonField<Thinking>) = apply { this.thinking = thinking }

        /** Alias for calling [thinking] with `Thinking.ofEnabled(enabled)`. */
        fun thinking(enabled: ThinkingConfigEnabled) = thinking(Thinking.ofEnabled(enabled))

        /**
         * Alias for calling [thinking] with the following:
         * ```kotlin
         * ThinkingConfigEnabled.builder()
         *     .budgetTokens(budgetTokens)
         *     .build()
         * ```
         */
        fun enabledThinking(budgetTokens: Long) =
            thinking(ThinkingConfigEnabled.builder().budgetTokens(budgetTokens).build())

        /** Alias for calling [thinking] with `Thinking.ofDisabled(disabled)`. */
        fun thinking(disabled: ThinkingConfigDisabled) = thinking(Thinking.ofDisabled(disabled))

        /** Alias for calling [thinking] with `Thinking.ofAdaptive()`. */
        fun thinkingAdaptive() = thinking(Thinking.ofAdaptive())

        /**
         * Controls which (if any) tool is called by the model. `none` means the model will not call
         * any tool and instead generates a message. `auto` means the model can pick between
         * generating a message or calling one or more tools. `required` means the model must call
         * one or more tools. Specifying a particular tool via `{"type": "function", "function":
         * {"name": "my_function"}}` forces the model to call that tool. `none` is the default when
         * no tools are present. `auto` is the default if tools are present.
         */
        fun toolChoice(toolChoice: ToolChoice?) = toolChoice(JsonField.ofNullable(toolChoice))

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { this.toolChoice = toolChoice }

        /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
        fun toolChoice(string: String) = toolChoice(ToolChoice.ofString(string))

        /** Alias for calling [toolChoice] with `ToolChoice.ofAuto(auto)`. */
        fun toolChoice(auto: ToolChoiceAuto) = toolChoice(ToolChoice.ofAuto(auto))

        /** Alias for calling [toolChoice] with `ToolChoice.ofAny(any)`. */
        fun toolChoice(any: ToolChoiceAny) = toolChoice(ToolChoice.ofAny(any))

        /** Alias for calling [toolChoice] with `ToolChoice.ofTool(tool)`. */
        fun toolChoice(tool: ToolChoiceTool) = toolChoice(ToolChoice.ofTool(tool))

        /** Alias for calling [toolChoice] with `ToolChoice.ofNone(none)`. */
        fun toolChoice(none: ToolChoiceNone) = toolChoice(ToolChoice.ofNone(none))

        /** Tool calling configuration (Google-specific) */
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

        /** Available tools/functions for the model */
        fun tools(tools: List<ChatCompletionToolParam>?) = tools(JsonField.ofNullable(tools))

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<ChatCompletionToolParam>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tools(tools: JsonField<List<ChatCompletionToolParam>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatCompletionToolParam] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: ChatCompletionToolParam) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
        }

        /** Top-k sampling parameter */
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

        /**
         * An integer between 0 and 20 specifying the number of most likely tokens to return at each
         * token position, each with an associated log probability. `logprobs` must be set to `true`
         * if this parameter is used.
         */
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

        /** Nucleus sampling threshold */
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

        /**
         * This field is being replaced by `safety_identifier` and `prompt_cache_key`. Use
         * `prompt_cache_key` instead to maintain caching optimizations. A stable identifier for
         * your end-users. Used to boost cache hit rates by better bucketing similar requests and to
         * help OpenAI detect and prevent abuse.
         * [Learn more](/docs/guides/safety-best-practices#safety-identifiers).
         */
        fun user(user: String?) = user(JsonField.ofNullable(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        /**
         * Constrains the verbosity of the model's response. Lower values will result in more
         * concise responses, while higher values will result in more verbose responses. Currently
         * supported values are `low`, `medium`, and `high`.
         */
        fun verbosity(verbosity: String?) = verbosity(JsonField.ofNullable(verbosity))

        /**
         * Sets [Builder.verbosity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verbosity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun verbosity(verbosity: JsonField<String>) = apply { this.verbosity = verbosity }

        /**
         * This tool searches the web for relevant results to use in a response. Learn more about
         * the [web search tool](/docs/guides/tools-web-search?api-mode=chat).
         */
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
         * Returns an immutable instance of [ChatCompletionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionCreateParams =
            ChatCompletionCreateParams(
                checkRequired("model", model),
                agentAttributes,
                audio,
                automaticToolExecution,
                cachedContent,
                correlationId,
                credentials,
                deferred,
                (deferredCalls ?: JsonMissing.of()).map { it.toImmutable() },
                frequencyPenalty,
                functionCall,
                (functions ?: JsonMissing.of()).map { it.toImmutable() },
                generationConfig,
                (guardrails ?: JsonMissing.of()).map { it.toImmutable() },
                handoffConfig,
                handoffMode,
                inferenceGeo,
                logitBias,
                logprobs,
                maxCompletionTokens,
                maxTokens,
                maxTurns,
                mcpServers,
                (messages ?: JsonMissing.of()).map { it.toImmutable() },
                metadata,
                (modalities ?: JsonMissing.of()).map { it.toImmutable() },
                modelAttributes,
                n,
                outputConfig,
                parallelToolCalls,
                prediction,
                presencePenalty,
                promptCacheKey,
                promptCacheRetention,
                promptMode,
                reasoningEffort,
                responseFormat,
                safePrompt,
                safetyIdentifier,
                (safetySettings ?: JsonMissing.of()).map { it.toImmutable() },
                searchParameters,
                seed,
                serviceTier,
                speed,
                stop,
                store,
                stream,
                streamOptions,
                systemInstruction,
                temperature,
                thinking,
                toolChoice,
                toolConfig,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                topK,
                topLogprobs,
                topP,
                user,
                verbosity,
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
    fun validate(): ChatCompletionCreateParams = apply {
        if (validated) {
            return@apply
        }

        model().validate()
        agentAttributes()?.validate()
        audio()?.validate()
        automaticToolExecution()
        cachedContent()
        correlationId()
        credentials()?.validate()
        deferred()
        deferredCalls()?.forEach { it.validate() }
        frequencyPenalty()
        functionCall()
        functions()?.forEach { it.validate() }
        generationConfig()?.validate()
        guardrails()?.forEach { it.validate() }
        handoffConfig()?.validate()
        handoffMode()
        inferenceGeo()
        logitBias()?.validate()
        logprobs()
        maxCompletionTokens()
        maxTokens()
        maxTurns()
        mcpServers()?.validate()
        messages()?.forEach { it.validate() }
        metadata()?.validate()
        modalities()
        modelAttributes()?.validate()
        n()
        outputConfig()?.validate()
        parallelToolCalls()
        prediction()?.validate()
        presencePenalty()
        promptCacheKey()
        promptCacheRetention()
        promptMode()?.validate()
        reasoningEffort()
        responseFormat()?.validate()
        safePrompt()
        safetyIdentifier()
        safetySettings()?.forEach { it.validate() }
        searchParameters()?.validate()
        seed()
        serviceTier()
        speed()?.validate()
        stop()?.validate()
        store()
        stream()
        streamOptions()?.validate()
        systemInstruction()?.validate()
        temperature()
        thinking()?.validate()
        toolChoice()?.validate()
        toolConfig()?.validate()
        tools()?.forEach { it.validate() }
        topK()
        topLogprobs()
        topP()
        user()
        verbosity()
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
        (model.asKnown()?.validity() ?: 0) +
            (agentAttributes.asKnown()?.validity() ?: 0) +
            (audio.asKnown()?.validity() ?: 0) +
            (if (automaticToolExecution.asKnown() == null) 0 else 1) +
            (if (cachedContent.asKnown() == null) 0 else 1) +
            (if (correlationId.asKnown() == null) 0 else 1) +
            (credentials.asKnown()?.validity() ?: 0) +
            (if (deferred.asKnown() == null) 0 else 1) +
            (deferredCalls.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (frequencyPenalty.asKnown() == null) 0 else 1) +
            (if (functionCall.asKnown() == null) 0 else 1) +
            (functions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (generationConfig.asKnown()?.validity() ?: 0) +
            (guardrails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (handoffConfig.asKnown()?.validity() ?: 0) +
            (if (handoffMode.asKnown() == null) 0 else 1) +
            (if (inferenceGeo.asKnown() == null) 0 else 1) +
            (logitBias.asKnown()?.validity() ?: 0) +
            (if (logprobs.asKnown() == null) 0 else 1) +
            (if (maxCompletionTokens.asKnown() == null) 0 else 1) +
            (if (maxTokens.asKnown() == null) 0 else 1) +
            (if (maxTurns.asKnown() == null) 0 else 1) +
            (mcpServers.asKnown()?.validity() ?: 0) +
            (messages.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (modalities.asKnown()?.size ?: 0) +
            (modelAttributes.asKnown()?.validity() ?: 0) +
            (if (n.asKnown() == null) 0 else 1) +
            (outputConfig.asKnown()?.validity() ?: 0) +
            (if (parallelToolCalls.asKnown() == null) 0 else 1) +
            (prediction.asKnown()?.validity() ?: 0) +
            (if (presencePenalty.asKnown() == null) 0 else 1) +
            (if (promptCacheKey.asKnown() == null) 0 else 1) +
            (if (promptCacheRetention.asKnown() == null) 0 else 1) +
            (promptMode.asKnown()?.validity() ?: 0) +
            (if (reasoningEffort.asKnown() == null) 0 else 1) +
            (responseFormat.asKnown()?.validity() ?: 0) +
            (if (safePrompt.asKnown() == null) 0 else 1) +
            (if (safetyIdentifier.asKnown() == null) 0 else 1) +
            (safetySettings.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (searchParameters.asKnown()?.validity() ?: 0) +
            (if (seed.asKnown() == null) 0 else 1) +
            (if (serviceTier.asKnown() == null) 0 else 1) +
            (speed.asKnown()?.validity() ?: 0) +
            (stop.asKnown()?.validity() ?: 0) +
            (if (store.asKnown() == null) 0 else 1) +
            (if (stream.asKnown() == null) 0 else 1) +
            (streamOptions.asKnown()?.validity() ?: 0) +
            (systemInstruction.asKnown()?.validity() ?: 0) +
            (if (temperature.asKnown() == null) 0 else 1) +
            (thinking.asKnown()?.validity() ?: 0) +
            (toolChoice.asKnown()?.validity() ?: 0) +
            (toolConfig.asKnown()?.validity() ?: 0) +
            (tools.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (topK.asKnown() == null) 0 else 1) +
            (if (topLogprobs.asKnown() == null) 0 else 1) +
            (if (topP.asKnown() == null) 0 else 1) +
            (if (user.asKnown() == null) 0 else 1) +
            (if (verbosity.asKnown() == null) 0 else 1) +
            (webSearchOptions.asKnown()?.validity() ?: 0)

    /**
     * Model identifier. Accepts model ID strings, lists for routing, or DedalusModel objects with
     * per-model settings.
     */
    @JsonDeserialize(using = Model.Deserializer::class)
    @JsonSerialize(using = Model.Serializer::class)
    class Model
    private constructor(
        private val modelId: String? = null,
        private val dedalus: DedalusModel? = null,
        private val dedalusModelChoices: List<DedalusModelChoice>? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Model identifier string (e.g., 'openai/gpt-5', 'anthropic/claude-3-5-sonnet'). */
        fun modelId(): String? = modelId

        /**
         * Structured model selection entry used in request payloads.
         *
         * Supports OpenAI-style semantics (string model id) while enabling optional per-model
         * default settings for Dedalus multi-model routing.
         */
        fun dedalus(): DedalusModel? = dedalus

        fun dedalusModelChoices(): List<DedalusModelChoice>? = dedalusModelChoices

        fun isModelId(): Boolean = modelId != null

        fun isDedalus(): Boolean = dedalus != null

        fun isDedalusModelChoices(): Boolean = dedalusModelChoices != null

        /** Model identifier string (e.g., 'openai/gpt-5', 'anthropic/claude-3-5-sonnet'). */
        fun asModelId(): String = modelId.getOrThrow("modelId")

        /**
         * Structured model selection entry used in request payloads.
         *
         * Supports OpenAI-style semantics (string model id) while enabling optional per-model
         * default settings for Dedalus multi-model routing.
         */
        fun asDedalus(): DedalusModel = dedalus.getOrThrow("dedalus")

        fun asDedalusModelChoices(): List<DedalusModelChoice> =
            dedalusModelChoices.getOrThrow("dedalusModelChoices")

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
         * val result: String? = model.accept(object : Model.Visitor<String?> {
         *     override fun visitModelId(modelId: String): String? = modelId.toString()
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
                modelId != null -> visitor.visitModelId(modelId)
                dedalus != null -> visitor.visitDedalus(dedalus)
                dedalusModelChoices != null -> visitor.visitDedalusModelChoices(dedalusModelChoices)
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
        fun validate(): Model = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitModelId(modelId: String) {}

                    override fun visitDedalus(dedalus: DedalusModel) {
                        dedalus.validate()
                    }

                    override fun visitDedalusModelChoices(
                        dedalusModelChoices: List<DedalusModelChoice>
                    ) {
                        dedalusModelChoices.forEach { it.validate() }
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
                    override fun visitModelId(modelId: String) = 1

                    override fun visitDedalus(dedalus: DedalusModel) = dedalus.validity()

                    override fun visitDedalusModelChoices(
                        dedalusModelChoices: List<DedalusModelChoice>
                    ) = dedalusModelChoices.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Model &&
                modelId == other.modelId &&
                dedalus == other.dedalus &&
                dedalusModelChoices == other.dedalusModelChoices
        }

        override fun hashCode(): Int = Objects.hash(modelId, dedalus, dedalusModelChoices)

        override fun toString(): String =
            when {
                modelId != null -> "Model{modelId=$modelId}"
                dedalus != null -> "Model{dedalus=$dedalus}"
                dedalusModelChoices != null -> "Model{dedalusModelChoices=$dedalusModelChoices}"
                _json != null -> "Model{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Model")
            }

        companion object {

            /** Model identifier string (e.g., 'openai/gpt-5', 'anthropic/claude-3-5-sonnet'). */
            fun ofModelId(modelId: String) = Model(modelId = modelId)

            /**
             * Structured model selection entry used in request payloads.
             *
             * Supports OpenAI-style semantics (string model id) while enabling optional per-model
             * default settings for Dedalus multi-model routing.
             */
            fun ofDedalus(dedalus: DedalusModel) = Model(dedalus = dedalus)

            fun ofDedalusModelChoices(dedalusModelChoices: List<DedalusModelChoice>) =
                Model(dedalusModelChoices = dedalusModelChoices.toImmutable())
        }

        /** An interface that defines how to map each variant of [Model] to a value of type [T]. */
        interface Visitor<out T> {

            /** Model identifier string (e.g., 'openai/gpt-5', 'anthropic/claude-3-5-sonnet'). */
            fun visitModelId(modelId: String): T

            /**
             * Structured model selection entry used in request payloads.
             *
             * Supports OpenAI-style semantics (string model id) while enabling optional per-model
             * default settings for Dedalus multi-model routing.
             */
            fun visitDedalus(dedalus: DedalusModel): T

            fun visitDedalusModelChoices(dedalusModelChoices: List<DedalusModelChoice>): T

            /**
             * Maps an unknown variant of [Model] to a value of type [T].
             *
             * An instance of [Model] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Model: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Model>(Model::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Model {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DedalusModel>())?.let {
                                Model(dedalus = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Model(modelId = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<DedalusModelChoice>>())?.let {
                                Model(dedalusModelChoices = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Model(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Model>(Model::class) {

            override fun serialize(
                value: Model,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.modelId != null -> generator.writeObject(value.modelId)
                    value.dedalus != null -> generator.writeObject(value.dedalus)
                    value.dedalusModelChoices != null ->
                        generator.writeObject(value.dedalusModelChoices)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Model")
                }
            }
        }
    }

    /** Agent attributes. Values in [0.0, 1.0]. */
    class AgentAttributes
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

            /** Returns a mutable builder for constructing an instance of [AgentAttributes]. */
            fun builder() = Builder()
        }

        /** A builder for [AgentAttributes]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agentAttributes: AgentAttributes) = apply {
                additionalProperties = agentAttributes.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AgentAttributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AgentAttributes = AgentAttributes(additionalProperties.toImmutable())
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
        fun validate(): AgentAttributes = apply {
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

            return other is AgentAttributes && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AgentAttributes{additionalProperties=$additionalProperties}"
    }

    /**
     * Credentials for MCP server authentication. Each credential is matched to servers by
     * connection name.
     */
    @JsonDeserialize(using = Credentials.Deserializer::class)
    @JsonSerialize(using = Credentials.Serializer::class)
    class Credentials
    private constructor(
        private val credential: Credential? = null,
        private val mcpCredentials: List<Credential>? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Credential for MCP server authentication.
         *
         * Passed at endpoint level (e.g., chat.completions.create) and matched to MCP servers by
         * connection name. Wire format matches dedalus_mcp.Credential.to_dict().
         */
        fun credential(): Credential? = credential

        /** List of credentials for MCP server authentication. */
        fun mcpCredentials(): List<Credential>? = mcpCredentials

        fun isCredential(): Boolean = credential != null

        fun isMcpCredentials(): Boolean = mcpCredentials != null

        /**
         * Credential for MCP server authentication.
         *
         * Passed at endpoint level (e.g., chat.completions.create) and matched to MCP servers by
         * connection name. Wire format matches dedalus_mcp.Credential.to_dict().
         */
        fun asCredential(): Credential = credential.getOrThrow("credential")

        /** List of credentials for MCP server authentication. */
        fun asMcpCredentials(): List<Credential> = mcpCredentials.getOrThrow("mcpCredentials")

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
         * val result: String? = credentials.accept(object : Credentials.Visitor<String?> {
         *     override fun visitCredential(credential: Credential): String? = credential.toString()
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
                credential != null -> visitor.visitCredential(credential)
                mcpCredentials != null -> visitor.visitMcpCredentials(mcpCredentials)
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
        fun validate(): Credentials = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCredential(credential: Credential) {
                        credential.validate()
                    }

                    override fun visitMcpCredentials(mcpCredentials: List<Credential>) {
                        mcpCredentials.forEach { it.validate() }
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
                    override fun visitCredential(credential: Credential) = credential.validity()

                    override fun visitMcpCredentials(mcpCredentials: List<Credential>) =
                        mcpCredentials.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Credentials &&
                credential == other.credential &&
                mcpCredentials == other.mcpCredentials
        }

        override fun hashCode(): Int = Objects.hash(credential, mcpCredentials)

        override fun toString(): String =
            when {
                credential != null -> "Credentials{credential=$credential}"
                mcpCredentials != null -> "Credentials{mcpCredentials=$mcpCredentials}"
                _json != null -> "Credentials{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Credentials")
            }

        companion object {

            /**
             * Credential for MCP server authentication.
             *
             * Passed at endpoint level (e.g., chat.completions.create) and matched to MCP servers
             * by connection name. Wire format matches dedalus_mcp.Credential.to_dict().
             */
            fun ofCredential(credential: Credential) = Credentials(credential = credential)

            /** List of credentials for MCP server authentication. */
            fun ofMcpCredentials(mcpCredentials: List<Credential>) =
                Credentials(mcpCredentials = mcpCredentials.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [Credentials] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /**
             * Credential for MCP server authentication.
             *
             * Passed at endpoint level (e.g., chat.completions.create) and matched to MCP servers
             * by connection name. Wire format matches dedalus_mcp.Credential.to_dict().
             */
            fun visitCredential(credential: Credential): T

            /** List of credentials for MCP server authentication. */
            fun visitMcpCredentials(mcpCredentials: List<Credential>): T

            /**
             * Maps an unknown variant of [Credentials] to a value of type [T].
             *
             * An instance of [Credentials] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Credentials: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Credentials>(Credentials::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Credentials {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Credential>())?.let {
                                Credentials(credential = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<Credential>>())?.let {
                                Credentials(mcpCredentials = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Credentials(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Credentials>(Credentials::class) {

            override fun serialize(
                value: Credentials,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.credential != null -> generator.writeObject(value.credential)
                    value.mcpCredentials != null -> generator.writeObject(value.mcpCredentials)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Credentials")
                }
            }
        }
    }

    class Guardrail
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

            /** Returns a mutable builder for constructing an instance of [Guardrail]. */
            fun builder() = Builder()
        }

        /** A builder for [Guardrail]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(guardrail: Guardrail) = apply {
                additionalProperties = guardrail.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Guardrail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Guardrail = Guardrail(additionalProperties.toImmutable())
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
        fun validate(): Guardrail = apply {
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

            return other is Guardrail && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Guardrail{additionalProperties=$additionalProperties}"
    }

    /** Configuration for multi-model handoffs. */
    class HandoffConfig
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

            /** Returns a mutable builder for constructing an instance of [HandoffConfig]. */
            fun builder() = Builder()
        }

        /** A builder for [HandoffConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(handoffConfig: HandoffConfig) = apply {
                additionalProperties = handoffConfig.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [HandoffConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): HandoffConfig = HandoffConfig(additionalProperties.toImmutable())
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
        fun validate(): HandoffConfig = apply {
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

            return other is HandoffConfig && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "HandoffConfig{additionalProperties=$additionalProperties}"
    }

    /**
     * Modify the likelihood of specified tokens appearing in the completion. Accepts a JSON object
     * that maps tokens (specified by their token ID in the tokenizer) to an associated bias value
     * from -100 to 100. Mathematically, the bias is added to the logits generated by the model
     * prior to sampling. The exact effect will vary per model, but values between -1 and 1 should
     * decrease or increase likelihood of selection; values like -100 or 100 should result in a ban
     * or exclusive selection of the relevant token.
     */
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

    /**
     * MCP server identifiers. Accepts marketplace slugs, URLs, or MCPServerSpec objects. MCP tools
     * are executed server-side and billed separately.
     */
    @JsonDeserialize(using = McpServers.Deserializer::class)
    @JsonSerialize(using = McpServers.Serializer::class)
    class McpServers
    private constructor(
        private val string: String? = null,
        private val serverSpec: McpServerSpec? = null,
        private val mcpServers: List<UnnamedSchemaWithArrayParent0>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        /**
         * Structured MCP server specification.
         *
         * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
         * "version": "v1.0.0"} URL-based: {"url": "https://mcp.dedaluslabs.ai/acme/my-server/mcp",
         * "name": "custom-server"}
         */
        fun serverSpec(): McpServerSpec? = serverSpec

        /** List of MCP server inputs (slugs or structured specs). */
        fun mcpServers(): List<UnnamedSchemaWithArrayParent0>? = mcpServers

        fun isString(): Boolean = string != null

        fun isServerSpec(): Boolean = serverSpec != null

        fun isMcpServers(): Boolean = mcpServers != null

        fun asString(): String = string.getOrThrow("string")

        /**
         * Structured MCP server specification.
         *
         * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
         * "version": "v1.0.0"} URL-based: {"url": "https://mcp.dedaluslabs.ai/acme/my-server/mcp",
         * "name": "custom-server"}
         */
        fun asServerSpec(): McpServerSpec = serverSpec.getOrThrow("serverSpec")

        /** List of MCP server inputs (slugs or structured specs). */
        fun asMcpServers(): List<UnnamedSchemaWithArrayParent0> =
            mcpServers.getOrThrow("mcpServers")

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
         * val result: String? = mcpServers.accept(object : McpServers.Visitor<String?> {
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
                serverSpec != null -> visitor.visitServerSpec(serverSpec)
                mcpServers != null -> visitor.visitMcpServers(mcpServers)
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
        fun validate(): McpServers = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitServerSpec(serverSpec: McpServerSpec) {
                        serverSpec.validate()
                    }

                    override fun visitMcpServers(mcpServers: List<UnnamedSchemaWithArrayParent0>) {
                        mcpServers.forEach { it.validate() }
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

                    override fun visitServerSpec(serverSpec: McpServerSpec) = serverSpec.validity()

                    override fun visitMcpServers(mcpServers: List<UnnamedSchemaWithArrayParent0>) =
                        mcpServers.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is McpServers &&
                string == other.string &&
                serverSpec == other.serverSpec &&
                mcpServers == other.mcpServers
        }

        override fun hashCode(): Int = Objects.hash(string, serverSpec, mcpServers)

        override fun toString(): String =
            when {
                string != null -> "McpServers{string=$string}"
                serverSpec != null -> "McpServers{serverSpec=$serverSpec}"
                mcpServers != null -> "McpServers{mcpServers=$mcpServers}"
                _json != null -> "McpServers{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid McpServers")
            }

        companion object {

            fun ofString(string: String) = McpServers(string = string)

            /**
             * Structured MCP server specification.
             *
             * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
             * "version": "v1.0.0"} URL-based: {"url":
             * "https://mcp.dedaluslabs.ai/acme/my-server/mcp", "name": "custom-server"}
             */
            fun ofServerSpec(serverSpec: McpServerSpec) = McpServers(serverSpec = serverSpec)

            /** List of MCP server inputs (slugs or structured specs). */
            fun ofMcpServers(mcpServers: List<UnnamedSchemaWithArrayParent0>) =
                McpServers(mcpServers = mcpServers.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [McpServers] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            /**
             * Structured MCP server specification.
             *
             * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
             * "version": "v1.0.0"} URL-based: {"url":
             * "https://mcp.dedaluslabs.ai/acme/my-server/mcp", "name": "custom-server"}
             */
            fun visitServerSpec(serverSpec: McpServerSpec): T

            /** List of MCP server inputs (slugs or structured specs). */
            fun visitMcpServers(mcpServers: List<UnnamedSchemaWithArrayParent0>): T

            /**
             * Maps an unknown variant of [McpServers] to a value of type [T].
             *
             * An instance of [McpServers] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown McpServers: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<McpServers>(McpServers::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): McpServers {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<McpServerSpec>())?.let {
                                McpServers(serverSpec = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                McpServers(string = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<UnnamedSchemaWithArrayParent0>>(),
                                )
                                ?.let { McpServers(mcpServers = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> McpServers(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<McpServers>(McpServers::class) {

            override fun serialize(
                value: McpServers,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.serverSpec != null -> generator.writeObject(value.serverSpec)
                    value.mcpServers != null -> generator.writeObject(value.mcpServers)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid McpServers")
                }
            }
        }

        /**
         * Structured MCP server specification.
         *
         * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
         * "version": "v1.0.0"} URL-based: {"url": "https://mcp.dedaluslabs.ai/acme/my-server/mcp",
         * "name": "custom-server"}
         */
        @JsonDeserialize(using = UnnamedSchemaWithArrayParent0.Deserializer::class)
        @JsonSerialize(using = UnnamedSchemaWithArrayParent0.Serializer::class)
        class UnnamedSchemaWithArrayParent0
        private constructor(
            private val string: String? = null,
            private val mcpServerSpec: McpServerSpec? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            /**
             * Structured MCP server specification.
             *
             * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
             * "version": "v1.0.0"} URL-based: {"url":
             * "https://mcp.dedaluslabs.ai/acme/my-server/mcp", "name": "custom-server"}
             */
            fun mcpServerSpec(): McpServerSpec? = mcpServerSpec

            fun isString(): Boolean = string != null

            fun isMcpServerSpec(): Boolean = mcpServerSpec != null

            fun asString(): String = string.getOrThrow("string")

            /**
             * Structured MCP server specification.
             *
             * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
             * "version": "v1.0.0"} URL-based: {"url":
             * "https://mcp.dedaluslabs.ai/acme/my-server/mcp", "name": "custom-server"}
             */
            fun asMcpServerSpec(): McpServerSpec = mcpServerSpec.getOrThrow("mcpServerSpec")

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
             * val result: String? = unnamedSchemaWithArrayParent0.accept(object : UnnamedSchemaWithArrayParent0.Visitor<String?> {
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
             * @throws DedalusInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    mcpServerSpec != null -> visitor.visitMcpServerSpec(mcpServerSpec)
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
            fun validate(): UnnamedSchemaWithArrayParent0 = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitMcpServerSpec(mcpServerSpec: McpServerSpec) {
                            mcpServerSpec.validate()
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

                        override fun visitMcpServerSpec(mcpServerSpec: McpServerSpec) =
                            mcpServerSpec.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnnamedSchemaWithArrayParent0 &&
                    string == other.string &&
                    mcpServerSpec == other.mcpServerSpec
            }

            override fun hashCode(): Int = Objects.hash(string, mcpServerSpec)

            override fun toString(): String =
                when {
                    string != null -> "UnnamedSchemaWithArrayParent0{string=$string}"
                    mcpServerSpec != null ->
                        "UnnamedSchemaWithArrayParent0{mcpServerSpec=$mcpServerSpec}"
                    _json != null -> "UnnamedSchemaWithArrayParent0{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent0")
                }

            companion object {

                fun ofString(string: String) = UnnamedSchemaWithArrayParent0(string = string)

                /**
                 * Structured MCP server specification.
                 *
                 * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
                 * "version": "v1.0.0"} URL-based: {"url":
                 * "https://mcp.dedaluslabs.ai/acme/my-server/mcp", "name": "custom-server"}
                 */
                fun ofMcpServerSpec(mcpServerSpec: McpServerSpec) =
                    UnnamedSchemaWithArrayParent0(mcpServerSpec = mcpServerSpec)
            }

            /**
             * An interface that defines how to map each variant of [UnnamedSchemaWithArrayParent0]
             * to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                /**
                 * Structured MCP server specification.
                 *
                 * Slug-based: {"slug": "dedalus-labs/brave-search", "name": "github-integration",
                 * "version": "v1.0.0"} URL-based: {"url":
                 * "https://mcp.dedaluslabs.ai/acme/my-server/mcp", "name": "custom-server"}
                 */
                fun visitMcpServerSpec(mcpServerSpec: McpServerSpec): T

                /**
                 * Maps an unknown variant of [UnnamedSchemaWithArrayParent0] to a value of type
                 * [T].
                 *
                 * An instance of [UnnamedSchemaWithArrayParent0] can contain an unknown variant if
                 * it was deserialized from data that doesn't match any known variant. For example,
                 * if the SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws DedalusInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw DedalusInvalidDataException(
                        "Unknown UnnamedSchemaWithArrayParent0: $json"
                    )
                }
            }

            internal class Deserializer :
                BaseDeserializer<UnnamedSchemaWithArrayParent0>(
                    UnnamedSchemaWithArrayParent0::class
                ) {

                override fun ObjectCodec.deserialize(
                    node: JsonNode
                ): UnnamedSchemaWithArrayParent0 {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<McpServerSpec>())?.let {
                                    UnnamedSchemaWithArrayParent0(mcpServerSpec = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    UnnamedSchemaWithArrayParent0(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> UnnamedSchemaWithArrayParent0(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<UnnamedSchemaWithArrayParent0>(
                    UnnamedSchemaWithArrayParent0::class
                ) {

                override fun serialize(
                    value: UnnamedSchemaWithArrayParent0,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.mcpServerSpec != null -> generator.writeObject(value.mcpServerSpec)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent0")
                    }
                }
            }
        }
    }

    /**
     * Developer-provided instructions that the model should follow, regardless of messages sent by
     * the user. With o1 models and newer, `developer` messages replace the previous `system`
     * messages.
     *
     * Fields:
     * - content (required): str | Annotated[list[ChatCompletionRequestMessageContentPartText],
     *   MinLen(1), ArrayTitle("ChatCompletionRequestDeveloperMessageContentArray")]
     * - role (required): Literal["developer"]
     * - name (optional): str
     */
    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val developer: ChatCompletionDeveloperMessageParam? = null,
        private val system: ChatCompletionSystemMessageParam? = null,
        private val user: ChatCompletionUserMessageParam? = null,
        private val assistant: ChatCompletionAssistantMessageParam? = null,
        private val tool: ChatCompletionToolMessageParam? = null,
        private val function: ChatCompletionFunctionMessageParam? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user. With o1 models and newer, `developer` messages replace the previous `system`
         * messages.
         *
         * Fields:
         * - content (required): str | Annotated[list[ChatCompletionRequestMessageContentPartText],
         *   MinLen(1), ArrayTitle("ChatCompletionRequestDeveloperMessageContentArray")]
         * - role (required): Literal["developer"]
         * - name (optional): str
         */
        fun developer(): ChatCompletionDeveloperMessageParam? = developer

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user. With o1 models and newer, use `developer` messages for this purpose instead.
         *
         * Fields:
         * - content (required): str |
         *   Annotated[list[ChatCompletionRequestSystemMessageContentPart], MinLen(1),
         *   ArrayTitle("ChatCompletionRequestSystemMessageContentArray")]
         * - role (required): Literal["system"]
         * - name (optional): str
         */
        fun system(): ChatCompletionSystemMessageParam? = system

        /**
         * Messages sent by an end user, containing prompts or additional context information.
         *
         * Fields:
         * - content (required): str | Annotated[list[ChatCompletionRequestUserMessageContentPart],
         *   MinLen(1), ArrayTitle("ChatCompletionRequestUserMessageContentArray")]
         * - role (required): Literal["user"]
         * - name (optional): str
         */
        fun user(): ChatCompletionUserMessageParam? = user

        /**
         * Messages sent by the model in response to user messages.
         *
         * Fields:
         * - content (optional): str |
         *   Annotated[list[ChatCompletionRequestAssistantMessageContentPart], MinLen(1),
         *   ArrayTitle("ChatCompletionRequestAssistantMessageContentArray")] | None
         * - refusal (optional): str | None
         * - role (required): Literal["assistant"]
         * - name (optional): str
         * - audio (optional): Audio | None
         * - tool_calls (optional): ChatCompletionMessageToolCalls
         * - function_call (optional): FunctionCall | None
         */
        fun assistant(): ChatCompletionAssistantMessageParam? = assistant

        /**
         * Schema for ChatCompletionRequestToolMessage.
         *
         * Fields:
         * - role (required): Literal["tool"]
         * - content (required): str | Annotated[list[ChatCompletionRequestToolMessageContentPart],
         *   MinLen(1), ArrayTitle("ChatCompletionRequestToolMessageContentArray")]
         * - tool_call_id (required): str
         */
        fun tool(): ChatCompletionToolMessageParam? = tool

        /**
         * Schema for ChatCompletionRequestFunctionMessage.
         *
         * Fields:
         * - role (required): Literal["function"]
         * - content (required): str | None
         * - name (required): str
         */
        fun function(): ChatCompletionFunctionMessageParam? = function

        fun isDeveloper(): Boolean = developer != null

        fun isSystem(): Boolean = system != null

        fun isUser(): Boolean = user != null

        fun isAssistant(): Boolean = assistant != null

        fun isTool(): Boolean = tool != null

        fun isFunction(): Boolean = function != null

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user. With o1 models and newer, `developer` messages replace the previous `system`
         * messages.
         *
         * Fields:
         * - content (required): str | Annotated[list[ChatCompletionRequestMessageContentPartText],
         *   MinLen(1), ArrayTitle("ChatCompletionRequestDeveloperMessageContentArray")]
         * - role (required): Literal["developer"]
         * - name (optional): str
         */
        fun asDeveloper(): ChatCompletionDeveloperMessageParam = developer.getOrThrow("developer")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user. With o1 models and newer, use `developer` messages for this purpose instead.
         *
         * Fields:
         * - content (required): str |
         *   Annotated[list[ChatCompletionRequestSystemMessageContentPart], MinLen(1),
         *   ArrayTitle("ChatCompletionRequestSystemMessageContentArray")]
         * - role (required): Literal["system"]
         * - name (optional): str
         */
        fun asSystem(): ChatCompletionSystemMessageParam = system.getOrThrow("system")

        /**
         * Messages sent by an end user, containing prompts or additional context information.
         *
         * Fields:
         * - content (required): str | Annotated[list[ChatCompletionRequestUserMessageContentPart],
         *   MinLen(1), ArrayTitle("ChatCompletionRequestUserMessageContentArray")]
         * - role (required): Literal["user"]
         * - name (optional): str
         */
        fun asUser(): ChatCompletionUserMessageParam = user.getOrThrow("user")

        /**
         * Messages sent by the model in response to user messages.
         *
         * Fields:
         * - content (optional): str |
         *   Annotated[list[ChatCompletionRequestAssistantMessageContentPart], MinLen(1),
         *   ArrayTitle("ChatCompletionRequestAssistantMessageContentArray")] | None
         * - refusal (optional): str | None
         * - role (required): Literal["assistant"]
         * - name (optional): str
         * - audio (optional): Audio | None
         * - tool_calls (optional): ChatCompletionMessageToolCalls
         * - function_call (optional): FunctionCall | None
         */
        fun asAssistant(): ChatCompletionAssistantMessageParam = assistant.getOrThrow("assistant")

        /**
         * Schema for ChatCompletionRequestToolMessage.
         *
         * Fields:
         * - role (required): Literal["tool"]
         * - content (required): str | Annotated[list[ChatCompletionRequestToolMessageContentPart],
         *   MinLen(1), ArrayTitle("ChatCompletionRequestToolMessageContentArray")]
         * - tool_call_id (required): str
         */
        fun asTool(): ChatCompletionToolMessageParam = tool.getOrThrow("tool")

        /**
         * Schema for ChatCompletionRequestFunctionMessage.
         *
         * Fields:
         * - role (required): Literal["function"]
         * - content (required): str | None
         * - name (required): str
         */
        fun asFunction(): ChatCompletionFunctionMessageParam = function.getOrThrow("function")

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
         * val result: String? = message.accept(object : Message.Visitor<String?> {
         *     override fun visitDeveloper(developer: ChatCompletionDeveloperMessageParam): String? = developer.toString()
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
                developer != null -> visitor.visitDeveloper(developer)
                system != null -> visitor.visitSystem(system)
                user != null -> visitor.visitUser(user)
                assistant != null -> visitor.visitAssistant(assistant)
                tool != null -> visitor.visitTool(tool)
                function != null -> visitor.visitFunction(function)
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
        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDeveloper(developer: ChatCompletionDeveloperMessageParam) {
                        developer.validate()
                    }

                    override fun visitSystem(system: ChatCompletionSystemMessageParam) {
                        system.validate()
                    }

                    override fun visitUser(user: ChatCompletionUserMessageParam) {
                        user.validate()
                    }

                    override fun visitAssistant(assistant: ChatCompletionAssistantMessageParam) {
                        assistant.validate()
                    }

                    override fun visitTool(tool: ChatCompletionToolMessageParam) {
                        tool.validate()
                    }

                    override fun visitFunction(function: ChatCompletionFunctionMessageParam) {
                        function.validate()
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
                    override fun visitDeveloper(developer: ChatCompletionDeveloperMessageParam) =
                        developer.validity()

                    override fun visitSystem(system: ChatCompletionSystemMessageParam) =
                        system.validity()

                    override fun visitUser(user: ChatCompletionUserMessageParam) = user.validity()

                    override fun visitAssistant(assistant: ChatCompletionAssistantMessageParam) =
                        assistant.validity()

                    override fun visitTool(tool: ChatCompletionToolMessageParam) = tool.validity()

                    override fun visitFunction(function: ChatCompletionFunctionMessageParam) =
                        function.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                developer == other.developer &&
                system == other.system &&
                user == other.user &&
                assistant == other.assistant &&
                tool == other.tool &&
                function == other.function
        }

        override fun hashCode(): Int =
            Objects.hash(developer, system, user, assistant, tool, function)

        override fun toString(): String =
            when {
                developer != null -> "Message{developer=$developer}"
                system != null -> "Message{system=$system}"
                user != null -> "Message{user=$user}"
                assistant != null -> "Message{assistant=$assistant}"
                tool != null -> "Message{tool=$tool}"
                function != null -> "Message{function=$function}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user. With o1 models and newer, `developer` messages replace the previous
             * `system` messages.
             *
             * Fields:
             * - content (required): str |
             *   Annotated[list[ChatCompletionRequestMessageContentPartText], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestDeveloperMessageContentArray")]
             * - role (required): Literal["developer"]
             * - name (optional): str
             */
            fun ofDeveloper(developer: ChatCompletionDeveloperMessageParam) =
                Message(developer = developer)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user. With o1 models and newer, use `developer` messages for this purpose
             * instead.
             *
             * Fields:
             * - content (required): str |
             *   Annotated[list[ChatCompletionRequestSystemMessageContentPart], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestSystemMessageContentArray")]
             * - role (required): Literal["system"]
             * - name (optional): str
             */
            fun ofSystem(system: ChatCompletionSystemMessageParam) = Message(system = system)

            /**
             * Messages sent by an end user, containing prompts or additional context information.
             *
             * Fields:
             * - content (required): str |
             *   Annotated[list[ChatCompletionRequestUserMessageContentPart], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestUserMessageContentArray")]
             * - role (required): Literal["user"]
             * - name (optional): str
             */
            fun ofUser(user: ChatCompletionUserMessageParam) = Message(user = user)

            /**
             * Messages sent by the model in response to user messages.
             *
             * Fields:
             * - content (optional): str |
             *   Annotated[list[ChatCompletionRequestAssistantMessageContentPart], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestAssistantMessageContentArray")] | None
             * - refusal (optional): str | None
             * - role (required): Literal["assistant"]
             * - name (optional): str
             * - audio (optional): Audio | None
             * - tool_calls (optional): ChatCompletionMessageToolCalls
             * - function_call (optional): FunctionCall | None
             */
            fun ofAssistant(assistant: ChatCompletionAssistantMessageParam) =
                Message(assistant = assistant)

            /**
             * Schema for ChatCompletionRequestToolMessage.
             *
             * Fields:
             * - role (required): Literal["tool"]
             * - content (required): str |
             *   Annotated[list[ChatCompletionRequestToolMessageContentPart], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestToolMessageContentArray")]
             * - tool_call_id (required): str
             */
            fun ofTool(tool: ChatCompletionToolMessageParam) = Message(tool = tool)

            /**
             * Schema for ChatCompletionRequestFunctionMessage.
             *
             * Fields:
             * - role (required): Literal["function"]
             * - content (required): str | None
             * - name (required): str
             */
            fun ofFunction(function: ChatCompletionFunctionMessageParam) =
                Message(function = function)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user. With o1 models and newer, `developer` messages replace the previous
             * `system` messages.
             *
             * Fields:
             * - content (required): str |
             *   Annotated[list[ChatCompletionRequestMessageContentPartText], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestDeveloperMessageContentArray")]
             * - role (required): Literal["developer"]
             * - name (optional): str
             */
            fun visitDeveloper(developer: ChatCompletionDeveloperMessageParam): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user. With o1 models and newer, use `developer` messages for this purpose
             * instead.
             *
             * Fields:
             * - content (required): str |
             *   Annotated[list[ChatCompletionRequestSystemMessageContentPart], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestSystemMessageContentArray")]
             * - role (required): Literal["system"]
             * - name (optional): str
             */
            fun visitSystem(system: ChatCompletionSystemMessageParam): T

            /**
             * Messages sent by an end user, containing prompts or additional context information.
             *
             * Fields:
             * - content (required): str |
             *   Annotated[list[ChatCompletionRequestUserMessageContentPart], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestUserMessageContentArray")]
             * - role (required): Literal["user"]
             * - name (optional): str
             */
            fun visitUser(user: ChatCompletionUserMessageParam): T

            /**
             * Messages sent by the model in response to user messages.
             *
             * Fields:
             * - content (optional): str |
             *   Annotated[list[ChatCompletionRequestAssistantMessageContentPart], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestAssistantMessageContentArray")] | None
             * - refusal (optional): str | None
             * - role (required): Literal["assistant"]
             * - name (optional): str
             * - audio (optional): Audio | None
             * - tool_calls (optional): ChatCompletionMessageToolCalls
             * - function_call (optional): FunctionCall | None
             */
            fun visitAssistant(assistant: ChatCompletionAssistantMessageParam): T

            /**
             * Schema for ChatCompletionRequestToolMessage.
             *
             * Fields:
             * - role (required): Literal["tool"]
             * - content (required): str |
             *   Annotated[list[ChatCompletionRequestToolMessageContentPart], MinLen(1),
             *   ArrayTitle("ChatCompletionRequestToolMessageContentArray")]
             * - tool_call_id (required): str
             */
            fun visitTool(tool: ChatCompletionToolMessageParam): T

            /**
             * Schema for ChatCompletionRequestFunctionMessage.
             *
             * Fields:
             * - role (required): Literal["function"]
             * - content (required): str | None
             * - name (required): str
             */
            fun visitFunction(function: ChatCompletionFunctionMessageParam): T

            /**
             * Maps an unknown variant of [Message] to a value of type [T].
             *
             * An instance of [Message] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Message: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)
                val role = json.asObject()?.get("role")?.asString()

                when (role) {
                    "developer" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ChatCompletionDeveloperMessageParam>(),
                            )
                            ?.let { Message(developer = it, _json = json) } ?: Message(_json = json)
                    }
                    "system" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ChatCompletionSystemMessageParam>(),
                            )
                            ?.let { Message(system = it, _json = json) } ?: Message(_json = json)
                    }
                    "user" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ChatCompletionUserMessageParam>(),
                            )
                            ?.let { Message(user = it, _json = json) } ?: Message(_json = json)
                    }
                    "assistant" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ChatCompletionAssistantMessageParam>(),
                            )
                            ?.let { Message(assistant = it, _json = json) } ?: Message(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ChatCompletionToolMessageParam>(),
                            )
                            ?.let { Message(tool = it, _json = json) } ?: Message(_json = json)
                    }
                    "function" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ChatCompletionFunctionMessageParam>(),
                            )
                            ?.let { Message(function = it, _json = json) } ?: Message(_json = json)
                    }
                }

                return Message(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.developer != null -> generator.writeObject(value.developer)
                    value.system != null -> generator.writeObject(value.system)
                    value.user != null -> generator.writeObject(value.user)
                    value.assistant != null -> generator.writeObject(value.assistant)
                    value.tool != null -> generator.writeObject(value.tool)
                    value.function != null -> generator.writeObject(value.function)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }
    }

    /**
     * Model attributes for routing. Maps model IDs to attribute dictionaries with values in
     * [0.0, 1.0].
     */
    class ModelAttributes
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

            /** Returns a mutable builder for constructing an instance of [ModelAttributes]. */
            fun builder() = Builder()
        }

        /** A builder for [ModelAttributes]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelAttributes: ModelAttributes) = apply {
                additionalProperties = modelAttributes.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ModelAttributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelAttributes = ModelAttributes(additionalProperties.toImmutable())
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
        fun validate(): ModelAttributes = apply {
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

            return other is ModelAttributes && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelAttributes{additionalProperties=$additionalProperties}"
    }

    /**
     * Allows toggling between the reasoning mode and no system prompt. When set to `reasoning` the
     * system prompt for reasoning models will be used.
     */
    class PromptMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val REASONING = of("reasoning")

            fun of(value: String) = PromptMode(JsonField.of(value))
        }

        /** An enum containing [PromptMode]'s known values. */
        enum class Known {
            REASONING
        }

        /**
         * An enum containing [PromptMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PromptMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REASONING,
            /**
             * An enum member indicating that [PromptMode] was instantiated with an unknown value.
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
                REASONING -> Value.REASONING
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
                REASONING -> Known.REASONING
                else -> throw DedalusInvalidDataException("Unknown PromptMode: $value")
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
        fun validate(): PromptMode = apply {
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

            return other is PromptMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * An object specifying the format that the model must output. Setting to `{ "type":
     * "json_schema", "json_schema": {...} }` enables Structured Outputs which ensures the model
     * will match your supplied JSON schema. Learn more in the
     * [Structured Outputs guide](/docs/guides/structured-outputs). Setting to `{ "type":
     * "json_object" }` enables the older JSON mode, which ensures the message the model generates
     * is valid JSON. Using `json_schema` is preferred for models that support it.
     */
    @JsonDeserialize(using = ResponseFormat.Deserializer::class)
    @JsonSerialize(using = ResponseFormat.Serializer::class)
    class ResponseFormat
    private constructor(
        private val text: ResponseFormatText? = null,
        private val jsonSchema: ResponseFormatJsonSchema? = null,
        private val jsonObject: ResponseFormatJsonObject? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Default response format. Used to generate text responses.
         *
         * Fields:
         * - type (required): Literal["text"]
         */
        fun text(): ResponseFormatText? = text

        /**
         * JSON Schema response format. Used to generate structured JSON responses. Learn more about
         * [Structured Outputs](/docs/guides/structured-outputs).
         *
         * Fields:
         * - type (required): Literal["json_schema"]
         * - json_schema (required): JSONSchema
         */
        fun jsonSchema(): ResponseFormatJsonSchema? = jsonSchema

        /**
         * JSON object response format. An older method of generating JSON responses. Using
         * `json_schema` is recommended for models that support it. Note that the model will not
         * generate JSON without a system or user message instructing it to do so.
         *
         * Fields:
         * - type (required): Literal["json_object"]
         */
        fun jsonObject(): ResponseFormatJsonObject? = jsonObject

        fun isText(): Boolean = text != null

        fun isJsonSchema(): Boolean = jsonSchema != null

        fun isJsonObject(): Boolean = jsonObject != null

        /**
         * Default response format. Used to generate text responses.
         *
         * Fields:
         * - type (required): Literal["text"]
         */
        fun asText(): ResponseFormatText = text.getOrThrow("text")

        /**
         * JSON Schema response format. Used to generate structured JSON responses. Learn more about
         * [Structured Outputs](/docs/guides/structured-outputs).
         *
         * Fields:
         * - type (required): Literal["json_schema"]
         * - json_schema (required): JSONSchema
         */
        fun asJsonSchema(): ResponseFormatJsonSchema = jsonSchema.getOrThrow("jsonSchema")

        /**
         * JSON object response format. An older method of generating JSON responses. Using
         * `json_schema` is recommended for models that support it. Note that the model will not
         * generate JSON without a system or user message instructing it to do so.
         *
         * Fields:
         * - type (required): Literal["json_object"]
         */
        fun asJsonObject(): ResponseFormatJsonObject = jsonObject.getOrThrow("jsonObject")

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
         * val result: String? = responseFormat.accept(object : ResponseFormat.Visitor<String?> {
         *     override fun visitText(text: ResponseFormatText): String? = text.toString()
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
                text != null -> visitor.visitText(text)
                jsonSchema != null -> visitor.visitJsonSchema(jsonSchema)
                jsonObject != null -> visitor.visitJsonObject(jsonObject)
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
        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitText(text: ResponseFormatText) {
                        text.validate()
                    }

                    override fun visitJsonSchema(jsonSchema: ResponseFormatJsonSchema) {
                        jsonSchema.validate()
                    }

                    override fun visitJsonObject(jsonObject: ResponseFormatJsonObject) {
                        jsonObject.validate()
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
                    override fun visitText(text: ResponseFormatText) = text.validity()

                    override fun visitJsonSchema(jsonSchema: ResponseFormatJsonSchema) =
                        jsonSchema.validity()

                    override fun visitJsonObject(jsonObject: ResponseFormatJsonObject) =
                        jsonObject.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResponseFormat &&
                text == other.text &&
                jsonSchema == other.jsonSchema &&
                jsonObject == other.jsonObject
        }

        override fun hashCode(): Int = Objects.hash(text, jsonSchema, jsonObject)

        override fun toString(): String =
            when {
                text != null -> "ResponseFormat{text=$text}"
                jsonSchema != null -> "ResponseFormat{jsonSchema=$jsonSchema}"
                jsonObject != null -> "ResponseFormat{jsonObject=$jsonObject}"
                _json != null -> "ResponseFormat{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }

        companion object {

            /**
             * Default response format. Used to generate text responses.
             *
             * Fields:
             * - type (required): Literal["text"]
             */
            fun ofText(text: ResponseFormatText) = ResponseFormat(text = text)

            /**
             * JSON Schema response format. Used to generate structured JSON responses. Learn more
             * about [Structured Outputs](/docs/guides/structured-outputs).
             *
             * Fields:
             * - type (required): Literal["json_schema"]
             * - json_schema (required): JSONSchema
             */
            fun ofJsonSchema(jsonSchema: ResponseFormatJsonSchema) =
                ResponseFormat(jsonSchema = jsonSchema)

            /**
             * JSON object response format. An older method of generating JSON responses. Using
             * `json_schema` is recommended for models that support it. Note that the model will not
             * generate JSON without a system or user message instructing it to do so.
             *
             * Fields:
             * - type (required): Literal["json_object"]
             */
            fun ofJsonObject(jsonObject: ResponseFormatJsonObject) =
                ResponseFormat(jsonObject = jsonObject)
        }

        /**
         * An interface that defines how to map each variant of [ResponseFormat] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /**
             * Default response format. Used to generate text responses.
             *
             * Fields:
             * - type (required): Literal["text"]
             */
            fun visitText(text: ResponseFormatText): T

            /**
             * JSON Schema response format. Used to generate structured JSON responses. Learn more
             * about [Structured Outputs](/docs/guides/structured-outputs).
             *
             * Fields:
             * - type (required): Literal["json_schema"]
             * - json_schema (required): JSONSchema
             */
            fun visitJsonSchema(jsonSchema: ResponseFormatJsonSchema): T

            /**
             * JSON object response format. An older method of generating JSON responses. Using
             * `json_schema` is recommended for models that support it. Note that the model will not
             * generate JSON without a system or user message instructing it to do so.
             *
             * Fields:
             * - type (required): Literal["json_object"]
             */
            fun visitJsonObject(jsonObject: ResponseFormatJsonObject): T

            /**
             * Maps an unknown variant of [ResponseFormat] to a value of type [T].
             *
             * An instance of [ResponseFormat] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown ResponseFormat: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "text" -> {
                        return tryDeserialize(node, jacksonTypeRef<ResponseFormatText>())?.let {
                            ResponseFormat(text = it, _json = json)
                        } ?: ResponseFormat(_json = json)
                    }
                    "json_schema" -> {
                        return tryDeserialize(node, jacksonTypeRef<ResponseFormatJsonSchema>())
                            ?.let { ResponseFormat(jsonSchema = it, _json = json) }
                            ?: ResponseFormat(_json = json)
                    }
                    "json_object" -> {
                        return tryDeserialize(node, jacksonTypeRef<ResponseFormatJsonObject>())
                            ?.let { ResponseFormat(jsonObject = it, _json = json) }
                            ?: ResponseFormat(_json = json)
                    }
                }

                return ResponseFormat(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

            override fun serialize(
                value: ResponseFormat,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.text != null -> generator.writeObject(value.text)
                    value.jsonSchema != null -> generator.writeObject(value.jsonSchema)
                    value.jsonObject != null -> generator.writeObject(value.jsonObject)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ResponseFormat")
                }
            }
        }
    }

    /**
     * Safety setting, affecting the safety-blocking behavior.
     *
     * Passing a safety setting for a category changes the allowed probability that content is
     * blocked.
     *
     * Fields:
     * - threshold (required): Literal["HARM_BLOCK_THRESHOLD_UNSPECIFIED", "BLOCK_LOW_AND_ABOVE",
     *   "BLOCK_MEDIUM_AND_ABOVE", "BLOCK_ONLY_HIGH", "BLOCK_NONE", "OFF"]
     * - category (required): HarmCategory
     */
    class SafetySetting
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val threshold: JsonField<Threshold>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("threshold")
            @ExcludeMissing
            threshold: JsonField<Threshold> = JsonMissing.of(),
        ) : this(category, threshold, mutableMapOf())

        /**
         * Required. The category for this setting.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Required. Controls the probability threshold at which harm is blocked.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun threshold(): Threshold = threshold.getRequired("threshold")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [threshold].
         *
         * Unlike [threshold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("threshold")
        @ExcludeMissing
        fun _threshold(): JsonField<Threshold> = threshold

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
             * Returns a mutable builder for constructing an instance of [SafetySetting].
             *
             * The following fields are required:
             * ```kotlin
             * .category()
             * .threshold()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SafetySetting]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var threshold: JsonField<Threshold>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(safetySetting: SafetySetting) = apply {
                category = safetySetting.category
                threshold = safetySetting.threshold
                additionalProperties = safetySetting.additionalProperties.toMutableMap()
            }

            /** Required. The category for this setting. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Required. Controls the probability threshold at which harm is blocked. */
            fun threshold(threshold: Threshold) = threshold(JsonField.of(threshold))

            /**
             * Sets [Builder.threshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threshold] with a well-typed [Threshold] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threshold(threshold: JsonField<Threshold>) = apply { this.threshold = threshold }

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
             * Returns an immutable instance of [SafetySetting].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .category()
             * .threshold()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SafetySetting =
                SafetySetting(
                    checkRequired("category", category),
                    checkRequired("threshold", threshold),
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
        fun validate(): SafetySetting = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            threshold().validate()
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
            (category.asKnown()?.validity() ?: 0) + (threshold.asKnown()?.validity() ?: 0)

        /** Required. The category for this setting. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val HARM_CATEGORY_UNSPECIFIED = of("HARM_CATEGORY_UNSPECIFIED")

                val HARM_CATEGORY_DEROGATORY = of("HARM_CATEGORY_DEROGATORY")

                val HARM_CATEGORY_TOXICITY = of("HARM_CATEGORY_TOXICITY")

                val HARM_CATEGORY_VIOLENCE = of("HARM_CATEGORY_VIOLENCE")

                val HARM_CATEGORY_SEXUAL = of("HARM_CATEGORY_SEXUAL")

                val HARM_CATEGORY_MEDICAL = of("HARM_CATEGORY_MEDICAL")

                val HARM_CATEGORY_DANGEROUS = of("HARM_CATEGORY_DANGEROUS")

                val HARM_CATEGORY_HARASSMENT = of("HARM_CATEGORY_HARASSMENT")

                val HARM_CATEGORY_HATE_SPEECH = of("HARM_CATEGORY_HATE_SPEECH")

                val HARM_CATEGORY_SEXUALLY_EXPLICIT = of("HARM_CATEGORY_SEXUALLY_EXPLICIT")

                val HARM_CATEGORY_DANGEROUS_CONTENT = of("HARM_CATEGORY_DANGEROUS_CONTENT")

                val HARM_CATEGORY_CIVIC_INTEGRITY = of("HARM_CATEGORY_CIVIC_INTEGRITY")

                fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                HARM_CATEGORY_UNSPECIFIED,
                HARM_CATEGORY_DEROGATORY,
                HARM_CATEGORY_TOXICITY,
                HARM_CATEGORY_VIOLENCE,
                HARM_CATEGORY_SEXUAL,
                HARM_CATEGORY_MEDICAL,
                HARM_CATEGORY_DANGEROUS,
                HARM_CATEGORY_HARASSMENT,
                HARM_CATEGORY_HATE_SPEECH,
                HARM_CATEGORY_SEXUALLY_EXPLICIT,
                HARM_CATEGORY_DANGEROUS_CONTENT,
                HARM_CATEGORY_CIVIC_INTEGRITY,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HARM_CATEGORY_UNSPECIFIED,
                HARM_CATEGORY_DEROGATORY,
                HARM_CATEGORY_TOXICITY,
                HARM_CATEGORY_VIOLENCE,
                HARM_CATEGORY_SEXUAL,
                HARM_CATEGORY_MEDICAL,
                HARM_CATEGORY_DANGEROUS,
                HARM_CATEGORY_HARASSMENT,
                HARM_CATEGORY_HATE_SPEECH,
                HARM_CATEGORY_SEXUALLY_EXPLICIT,
                HARM_CATEGORY_DANGEROUS_CONTENT,
                HARM_CATEGORY_CIVIC_INTEGRITY,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
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
                    HARM_CATEGORY_UNSPECIFIED -> Value.HARM_CATEGORY_UNSPECIFIED
                    HARM_CATEGORY_DEROGATORY -> Value.HARM_CATEGORY_DEROGATORY
                    HARM_CATEGORY_TOXICITY -> Value.HARM_CATEGORY_TOXICITY
                    HARM_CATEGORY_VIOLENCE -> Value.HARM_CATEGORY_VIOLENCE
                    HARM_CATEGORY_SEXUAL -> Value.HARM_CATEGORY_SEXUAL
                    HARM_CATEGORY_MEDICAL -> Value.HARM_CATEGORY_MEDICAL
                    HARM_CATEGORY_DANGEROUS -> Value.HARM_CATEGORY_DANGEROUS
                    HARM_CATEGORY_HARASSMENT -> Value.HARM_CATEGORY_HARASSMENT
                    HARM_CATEGORY_HATE_SPEECH -> Value.HARM_CATEGORY_HATE_SPEECH
                    HARM_CATEGORY_SEXUALLY_EXPLICIT -> Value.HARM_CATEGORY_SEXUALLY_EXPLICIT
                    HARM_CATEGORY_DANGEROUS_CONTENT -> Value.HARM_CATEGORY_DANGEROUS_CONTENT
                    HARM_CATEGORY_CIVIC_INTEGRITY -> Value.HARM_CATEGORY_CIVIC_INTEGRITY
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
                    HARM_CATEGORY_UNSPECIFIED -> Known.HARM_CATEGORY_UNSPECIFIED
                    HARM_CATEGORY_DEROGATORY -> Known.HARM_CATEGORY_DEROGATORY
                    HARM_CATEGORY_TOXICITY -> Known.HARM_CATEGORY_TOXICITY
                    HARM_CATEGORY_VIOLENCE -> Known.HARM_CATEGORY_VIOLENCE
                    HARM_CATEGORY_SEXUAL -> Known.HARM_CATEGORY_SEXUAL
                    HARM_CATEGORY_MEDICAL -> Known.HARM_CATEGORY_MEDICAL
                    HARM_CATEGORY_DANGEROUS -> Known.HARM_CATEGORY_DANGEROUS
                    HARM_CATEGORY_HARASSMENT -> Known.HARM_CATEGORY_HARASSMENT
                    HARM_CATEGORY_HATE_SPEECH -> Known.HARM_CATEGORY_HATE_SPEECH
                    HARM_CATEGORY_SEXUALLY_EXPLICIT -> Known.HARM_CATEGORY_SEXUALLY_EXPLICIT
                    HARM_CATEGORY_DANGEROUS_CONTENT -> Known.HARM_CATEGORY_DANGEROUS_CONTENT
                    HARM_CATEGORY_CIVIC_INTEGRITY -> Known.HARM_CATEGORY_CIVIC_INTEGRITY
                    else -> throw DedalusInvalidDataException("Unknown Category: $value")
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
            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Required. Controls the probability threshold at which harm is blocked. */
        class Threshold @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val HARM_BLOCK_THRESHOLD_UNSPECIFIED = of("HARM_BLOCK_THRESHOLD_UNSPECIFIED")

                val BLOCK_LOW_AND_ABOVE = of("BLOCK_LOW_AND_ABOVE")

                val BLOCK_MEDIUM_AND_ABOVE = of("BLOCK_MEDIUM_AND_ABOVE")

                val BLOCK_ONLY_HIGH = of("BLOCK_ONLY_HIGH")

                val BLOCK_NONE = of("BLOCK_NONE")

                val OFF = of("OFF")

                fun of(value: String) = Threshold(JsonField.of(value))
            }

            /** An enum containing [Threshold]'s known values. */
            enum class Known {
                HARM_BLOCK_THRESHOLD_UNSPECIFIED,
                BLOCK_LOW_AND_ABOVE,
                BLOCK_MEDIUM_AND_ABOVE,
                BLOCK_ONLY_HIGH,
                BLOCK_NONE,
                OFF,
            }

            /**
             * An enum containing [Threshold]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Threshold] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HARM_BLOCK_THRESHOLD_UNSPECIFIED,
                BLOCK_LOW_AND_ABOVE,
                BLOCK_MEDIUM_AND_ABOVE,
                BLOCK_ONLY_HIGH,
                BLOCK_NONE,
                OFF,
                /**
                 * An enum member indicating that [Threshold] was instantiated with an unknown
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
                    HARM_BLOCK_THRESHOLD_UNSPECIFIED -> Value.HARM_BLOCK_THRESHOLD_UNSPECIFIED
                    BLOCK_LOW_AND_ABOVE -> Value.BLOCK_LOW_AND_ABOVE
                    BLOCK_MEDIUM_AND_ABOVE -> Value.BLOCK_MEDIUM_AND_ABOVE
                    BLOCK_ONLY_HIGH -> Value.BLOCK_ONLY_HIGH
                    BLOCK_NONE -> Value.BLOCK_NONE
                    OFF -> Value.OFF
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
                    HARM_BLOCK_THRESHOLD_UNSPECIFIED -> Known.HARM_BLOCK_THRESHOLD_UNSPECIFIED
                    BLOCK_LOW_AND_ABOVE -> Known.BLOCK_LOW_AND_ABOVE
                    BLOCK_MEDIUM_AND_ABOVE -> Known.BLOCK_MEDIUM_AND_ABOVE
                    BLOCK_ONLY_HIGH -> Known.BLOCK_ONLY_HIGH
                    BLOCK_NONE -> Known.BLOCK_NONE
                    OFF -> Known.OFF
                    else -> throw DedalusInvalidDataException("Unknown Threshold: $value")
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
            fun validate(): Threshold = apply {
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

                return other is Threshold && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SafetySetting &&
                category == other.category &&
                threshold == other.threshold &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, threshold, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SafetySetting{category=$category, threshold=$threshold, additionalProperties=$additionalProperties}"
    }

    /**
     * The inference speed mode for this request. `"fast"` enables high output-tokens-per-second
     * inference.
     */
    class Speed @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val STANDARD = of("standard")

            val FAST = of("fast")

            fun of(value: String) = Speed(JsonField.of(value))
        }

        /** An enum containing [Speed]'s known values. */
        enum class Known {
            STANDARD,
            FAST,
        }

        /**
         * An enum containing [Speed]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Speed] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STANDARD,
            FAST,
            /** An enum member indicating that [Speed] was instantiated with an unknown value. */
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
                STANDARD -> Value.STANDARD
                FAST -> Value.FAST
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
                STANDARD -> Known.STANDARD
                FAST -> Known.FAST
                else -> throw DedalusInvalidDataException("Unknown Speed: $value")
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
        fun validate(): Speed = apply {
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

            return other is Speed && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sequences that stop generation */
    @JsonDeserialize(using = Stop.Deserializer::class)
    @JsonSerialize(using = Stop.Serializer::class)
    class Stop
    private constructor(
        private val strings: List<String>? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun strings(): List<String>? = strings

        fun string(): String? = string

        fun isStrings(): Boolean = strings != null

        fun isString(): Boolean = string != null

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun asString(): String = string.getOrThrow("string")

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
         *     override fun visitStrings(strings: List<String>): String? = strings.toString()
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
                strings != null -> visitor.visitStrings(strings)
                string != null -> visitor.visitString(string)
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
                    override fun visitStrings(strings: List<String>) {}

                    override fun visitString(string: String) {}
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
                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stop && strings == other.strings && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(strings, string)

        override fun toString(): String =
            when {
                strings != null -> "Stop{strings=$strings}"
                string != null -> "Stop{string=$string}"
                _json != null -> "Stop{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Stop")
            }

        companion object {

            fun ofStrings(strings: List<String>) = Stop(strings = strings.toImmutable())

            fun ofString(string: String) = Stop(string = string)
        }

        /** An interface that defines how to map each variant of [Stop] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitStrings(strings: List<String>): T

            fun visitString(string: String): T

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
                    value.strings != null -> generator.writeObject(value.strings)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Stop")
                }
            }
        }
    }

    /** System instruction/prompt */
    @JsonDeserialize(using = SystemInstruction.Deserializer::class)
    @JsonSerialize(using = SystemInstruction.Serializer::class)
    class SystemInstruction
    private constructor(
        private val jsonObjectInput: JsonObjectInput? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun jsonObjectInput(): JsonObjectInput? = jsonObjectInput

        fun string(): String? = string

        fun isJsonObjectInput(): Boolean = jsonObjectInput != null

        fun isString(): Boolean = string != null

        fun asJsonObjectInput(): JsonObjectInput = jsonObjectInput.getOrThrow("jsonObjectInput")

        fun asString(): String = string.getOrThrow("string")

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
         * val result: String? = systemInstruction.accept(object : SystemInstruction.Visitor<String?> {
         *     override fun visitJsonObjectInput(jsonObjectInput: JsonObjectInput): String? = jsonObjectInput.toString()
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
                jsonObjectInput != null -> visitor.visitJsonObjectInput(jsonObjectInput)
                string != null -> visitor.visitString(string)
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
        fun validate(): SystemInstruction = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitJsonObjectInput(jsonObjectInput: JsonObjectInput) {
                        jsonObjectInput.validate()
                    }

                    override fun visitString(string: String) {}
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
                    override fun visitJsonObjectInput(jsonObjectInput: JsonObjectInput) =
                        jsonObjectInput.validity()

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SystemInstruction &&
                jsonObjectInput == other.jsonObjectInput &&
                string == other.string
        }

        override fun hashCode(): Int = Objects.hash(jsonObjectInput, string)

        override fun toString(): String =
            when {
                jsonObjectInput != null -> "SystemInstruction{jsonObjectInput=$jsonObjectInput}"
                string != null -> "SystemInstruction{string=$string}"
                _json != null -> "SystemInstruction{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SystemInstruction")
            }

        companion object {

            fun ofJsonObjectInput(jsonObjectInput: JsonObjectInput) =
                SystemInstruction(jsonObjectInput = jsonObjectInput)

            fun ofString(string: String) = SystemInstruction(string = string)
        }

        /**
         * An interface that defines how to map each variant of [SystemInstruction] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitJsonObjectInput(jsonObjectInput: JsonObjectInput): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [SystemInstruction] to a value of type [T].
             *
             * An instance of [SystemInstruction] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown SystemInstruction: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<SystemInstruction>(SystemInstruction::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SystemInstruction {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<JsonObjectInput>())?.let {
                                SystemInstruction(jsonObjectInput = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                SystemInstruction(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> SystemInstruction(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<SystemInstruction>(SystemInstruction::class) {

            override fun serialize(
                value: SystemInstruction,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.jsonObjectInput != null -> generator.writeObject(value.jsonObjectInput)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SystemInstruction")
                }
            }
        }
    }

    /** Extended thinking configuration (Anthropic-specific) */
    @JsonDeserialize(using = Thinking.Deserializer::class)
    @JsonSerialize(using = Thinking.Serializer::class)
    class Thinking
    private constructor(
        private val enabled: ThinkingConfigEnabled? = null,
        private val disabled: ThinkingConfigDisabled? = null,
        private val adaptive: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Schema for ThinkingConfigEnabled.
         *
         * Fields:
         * - budget_tokens (required): int
         * - type (required): Literal["enabled"]
         */
        fun enabled(): ThinkingConfigEnabled? = enabled

        /**
         * Schema for ThinkingConfigDisabled.
         *
         * Fields:
         * - type (required): Literal["disabled"]
         */
        fun disabled(): ThinkingConfigDisabled? = disabled

        /**
         * Schema for ThinkingConfigAdaptive.
         *
         * Fields:
         * - type (required): Literal["adaptive"]
         */
        fun adaptive(): JsonValue? = adaptive

        fun isEnabled(): Boolean = enabled != null

        fun isDisabled(): Boolean = disabled != null

        fun isAdaptive(): Boolean = adaptive != null

        /**
         * Schema for ThinkingConfigEnabled.
         *
         * Fields:
         * - budget_tokens (required): int
         * - type (required): Literal["enabled"]
         */
        fun asEnabled(): ThinkingConfigEnabled = enabled.getOrThrow("enabled")

        /**
         * Schema for ThinkingConfigDisabled.
         *
         * Fields:
         * - type (required): Literal["disabled"]
         */
        fun asDisabled(): ThinkingConfigDisabled = disabled.getOrThrow("disabled")

        /**
         * Schema for ThinkingConfigAdaptive.
         *
         * Fields:
         * - type (required): Literal["adaptive"]
         */
        fun asAdaptive(): JsonValue = adaptive.getOrThrow("adaptive")

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
         * val result: String? = thinking.accept(object : Thinking.Visitor<String?> {
         *     override fun visitEnabled(enabled: ThinkingConfigEnabled): String? = enabled.toString()
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
                enabled != null -> visitor.visitEnabled(enabled)
                disabled != null -> visitor.visitDisabled(disabled)
                adaptive != null -> visitor.visitAdaptive(adaptive)
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
        fun validate(): Thinking = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitEnabled(enabled: ThinkingConfigEnabled) {
                        enabled.validate()
                    }

                    override fun visitDisabled(disabled: ThinkingConfigDisabled) {
                        disabled.validate()
                    }

                    override fun visitAdaptive(adaptive: JsonValue) {
                        adaptive.let {
                            if (it != JsonValue.from(mapOf("type" to "adaptive"))) {
                                throw DedalusInvalidDataException(
                                    "'adaptive' is invalid, received $it"
                                )
                            }
                        }
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
                    override fun visitEnabled(enabled: ThinkingConfigEnabled) = enabled.validity()

                    override fun visitDisabled(disabled: ThinkingConfigDisabled) =
                        disabled.validity()

                    override fun visitAdaptive(adaptive: JsonValue) =
                        adaptive.let {
                            if (it == JsonValue.from(mapOf("type" to "adaptive"))) 1 else 0
                        }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Thinking &&
                enabled == other.enabled &&
                disabled == other.disabled &&
                adaptive == other.adaptive
        }

        override fun hashCode(): Int = Objects.hash(enabled, disabled, adaptive)

        override fun toString(): String =
            when {
                enabled != null -> "Thinking{enabled=$enabled}"
                disabled != null -> "Thinking{disabled=$disabled}"
                adaptive != null -> "Thinking{adaptive=$adaptive}"
                _json != null -> "Thinking{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Thinking")
            }

        companion object {

            /**
             * Schema for ThinkingConfigEnabled.
             *
             * Fields:
             * - budget_tokens (required): int
             * - type (required): Literal["enabled"]
             */
            fun ofEnabled(enabled: ThinkingConfigEnabled) = Thinking(enabled = enabled)

            /**
             * Schema for ThinkingConfigDisabled.
             *
             * Fields:
             * - type (required): Literal["disabled"]
             */
            fun ofDisabled(disabled: ThinkingConfigDisabled) = Thinking(disabled = disabled)

            /**
             * Schema for ThinkingConfigAdaptive.
             *
             * Fields:
             * - type (required): Literal["adaptive"]
             */
            fun ofAdaptive() = Thinking(adaptive = JsonValue.from(mapOf("type" to "adaptive")))
        }

        /**
         * An interface that defines how to map each variant of [Thinking] to a value of type [T].
         */
        interface Visitor<out T> {

            /**
             * Schema for ThinkingConfigEnabled.
             *
             * Fields:
             * - budget_tokens (required): int
             * - type (required): Literal["enabled"]
             */
            fun visitEnabled(enabled: ThinkingConfigEnabled): T

            /**
             * Schema for ThinkingConfigDisabled.
             *
             * Fields:
             * - type (required): Literal["disabled"]
             */
            fun visitDisabled(disabled: ThinkingConfigDisabled): T

            /**
             * Schema for ThinkingConfigAdaptive.
             *
             * Fields:
             * - type (required): Literal["adaptive"]
             */
            fun visitAdaptive(adaptive: JsonValue): T

            /**
             * Maps an unknown variant of [Thinking] to a value of type [T].
             *
             * An instance of [Thinking] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown Thinking: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Thinking>(Thinking::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Thinking {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "enabled" -> {
                        return tryDeserialize(node, jacksonTypeRef<ThinkingConfigEnabled>())?.let {
                            Thinking(enabled = it, _json = json)
                        } ?: Thinking(_json = json)
                    }
                    "disabled" -> {
                        return tryDeserialize(node, jacksonTypeRef<ThinkingConfigDisabled>())?.let {
                            Thinking(disabled = it, _json = json)
                        } ?: Thinking(_json = json)
                    }
                    "adaptive" -> {
                        return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                            ?.let { Thinking(adaptive = it, _json = json) }
                            ?.takeIf { it.isValid() } ?: Thinking(_json = json)
                    }
                }

                return Thinking(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Thinking>(Thinking::class) {

            override fun serialize(
                value: Thinking,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.enabled != null -> generator.writeObject(value.enabled)
                    value.disabled != null -> generator.writeObject(value.disabled)
                    value.adaptive != null -> generator.writeObject(value.adaptive)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Thinking")
                }
            }
        }
    }

    /**
     * Controls which (if any) tool is called by the model. `none` means the model will not call any
     * tool and instead generates a message. `auto` means the model can pick between generating a
     * message or calling one or more tools. `required` means the model must call one or more tools.
     * Specifying a particular tool via `{"type": "function", "function": {"name": "my_function"}}`
     * forces the model to call that tool. `none` is the default when no tools are present. `auto`
     * is the default if tools are present.
     */
    @JsonDeserialize(using = ToolChoice.Deserializer::class)
    @JsonSerialize(using = ToolChoice.Serializer::class)
    class ToolChoice
    private constructor(
        private val string: String? = null,
        private val auto: ToolChoiceAuto? = null,
        private val any: ToolChoiceAny? = null,
        private val tool: ToolChoiceTool? = null,
        private val none: ToolChoiceNone? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        /**
         * The model will automatically decide whether to use tools.
         *
         * Fields:
         * - disable_parallel_tool_use (optional): bool
         * - type (required): Literal["auto"]
         */
        fun auto(): ToolChoiceAuto? = auto

        /**
         * The model will use any available tools.
         *
         * Fields:
         * - disable_parallel_tool_use (optional): bool
         * - type (required): Literal["any"]
         */
        fun any(): ToolChoiceAny? = any

        /**
         * The model will use the specified tool with `tool_choice.name`.
         *
         * Fields:
         * - disable_parallel_tool_use (optional): bool
         * - name (required): str
         * - type (required): Literal["tool"]
         */
        fun tool(): ToolChoiceTool? = tool

        /**
         * The model will not be allowed to use tools.
         *
         * Fields:
         * - type (required): Literal["none"]
         */
        fun none(): ToolChoiceNone? = none

        fun isString(): Boolean = string != null

        fun isAuto(): Boolean = auto != null

        fun isAny(): Boolean = any != null

        fun isTool(): Boolean = tool != null

        fun isNone(): Boolean = none != null

        fun asString(): String = string.getOrThrow("string")

        /**
         * The model will automatically decide whether to use tools.
         *
         * Fields:
         * - disable_parallel_tool_use (optional): bool
         * - type (required): Literal["auto"]
         */
        fun asAuto(): ToolChoiceAuto = auto.getOrThrow("auto")

        /**
         * The model will use any available tools.
         *
         * Fields:
         * - disable_parallel_tool_use (optional): bool
         * - type (required): Literal["any"]
         */
        fun asAny(): ToolChoiceAny = any.getOrThrow("any")

        /**
         * The model will use the specified tool with `tool_choice.name`.
         *
         * Fields:
         * - disable_parallel_tool_use (optional): bool
         * - name (required): str
         * - type (required): Literal["tool"]
         */
        fun asTool(): ToolChoiceTool = tool.getOrThrow("tool")

        /**
         * The model will not be allowed to use tools.
         *
         * Fields:
         * - type (required): Literal["none"]
         */
        fun asNone(): ToolChoiceNone = none.getOrThrow("none")

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
         * val result: String? = toolChoice.accept(object : ToolChoice.Visitor<String?> {
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
                auto != null -> visitor.visitAuto(auto)
                any != null -> visitor.visitAny(any)
                tool != null -> visitor.visitTool(tool)
                none != null -> visitor.visitNone(none)
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
        fun validate(): ToolChoice = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitAuto(auto: ToolChoiceAuto) {
                        auto.validate()
                    }

                    override fun visitAny(any: ToolChoiceAny) {
                        any.validate()
                    }

                    override fun visitTool(tool: ToolChoiceTool) {
                        tool.validate()
                    }

                    override fun visitNone(none: ToolChoiceNone) {
                        none.validate()
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

                    override fun visitAuto(auto: ToolChoiceAuto) = auto.validity()

                    override fun visitAny(any: ToolChoiceAny) = any.validity()

                    override fun visitTool(tool: ToolChoiceTool) = tool.validity()

                    override fun visitNone(none: ToolChoiceNone) = none.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolChoice &&
                string == other.string &&
                auto == other.auto &&
                any == other.any &&
                tool == other.tool &&
                none == other.none
        }

        override fun hashCode(): Int = Objects.hash(string, auto, any, tool, none)

        override fun toString(): String =
            when {
                string != null -> "ToolChoice{string=$string}"
                auto != null -> "ToolChoice{auto=$auto}"
                any != null -> "ToolChoice{any=$any}"
                tool != null -> "ToolChoice{tool=$tool}"
                none != null -> "ToolChoice{none=$none}"
                _json != null -> "ToolChoice{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolChoice")
            }

        companion object {

            fun ofString(string: String) = ToolChoice(string = string)

            /**
             * The model will automatically decide whether to use tools.
             *
             * Fields:
             * - disable_parallel_tool_use (optional): bool
             * - type (required): Literal["auto"]
             */
            fun ofAuto(auto: ToolChoiceAuto) = ToolChoice(auto = auto)

            /**
             * The model will use any available tools.
             *
             * Fields:
             * - disable_parallel_tool_use (optional): bool
             * - type (required): Literal["any"]
             */
            fun ofAny(any: ToolChoiceAny) = ToolChoice(any = any)

            /**
             * The model will use the specified tool with `tool_choice.name`.
             *
             * Fields:
             * - disable_parallel_tool_use (optional): bool
             * - name (required): str
             * - type (required): Literal["tool"]
             */
            fun ofTool(tool: ToolChoiceTool) = ToolChoice(tool = tool)

            /**
             * The model will not be allowed to use tools.
             *
             * Fields:
             * - type (required): Literal["none"]
             */
            fun ofNone(none: ToolChoiceNone) = ToolChoice(none = none)
        }

        /**
         * An interface that defines how to map each variant of [ToolChoice] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            /**
             * The model will automatically decide whether to use tools.
             *
             * Fields:
             * - disable_parallel_tool_use (optional): bool
             * - type (required): Literal["auto"]
             */
            fun visitAuto(auto: ToolChoiceAuto): T

            /**
             * The model will use any available tools.
             *
             * Fields:
             * - disable_parallel_tool_use (optional): bool
             * - type (required): Literal["any"]
             */
            fun visitAny(any: ToolChoiceAny): T

            /**
             * The model will use the specified tool with `tool_choice.name`.
             *
             * Fields:
             * - disable_parallel_tool_use (optional): bool
             * - name (required): str
             * - type (required): Literal["tool"]
             */
            fun visitTool(tool: ToolChoiceTool): T

            /**
             * The model will not be allowed to use tools.
             *
             * Fields:
             * - type (required): Literal["none"]
             */
            fun visitNone(none: ToolChoiceNone): T

            /**
             * Maps an unknown variant of [ToolChoice] to a value of type [T].
             *
             * An instance of [ToolChoice] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws DedalusInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DedalusInvalidDataException("Unknown ToolChoice: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ToolChoiceAuto>())?.let {
                                ToolChoice(auto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ToolChoiceAny>())?.let {
                                ToolChoice(any = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ToolChoiceTool>())?.let {
                                ToolChoice(tool = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ToolChoiceNone>())?.let {
                                ToolChoice(none = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                ToolChoice(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ToolChoice(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

            override fun serialize(
                value: ToolChoice,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.auto != null -> generator.writeObject(value.auto)
                    value.any != null -> generator.writeObject(value.any)
                    value.tool != null -> generator.writeObject(value.tool)
                    value.none != null -> generator.writeObject(value.none)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolChoice")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCompletionCreateParams &&
            model == other.model &&
            agentAttributes == other.agentAttributes &&
            audio == other.audio &&
            automaticToolExecution == other.automaticToolExecution &&
            cachedContent == other.cachedContent &&
            correlationId == other.correlationId &&
            credentials == other.credentials &&
            deferred == other.deferred &&
            deferredCalls == other.deferredCalls &&
            frequencyPenalty == other.frequencyPenalty &&
            functionCall == other.functionCall &&
            functions == other.functions &&
            generationConfig == other.generationConfig &&
            guardrails == other.guardrails &&
            handoffConfig == other.handoffConfig &&
            handoffMode == other.handoffMode &&
            inferenceGeo == other.inferenceGeo &&
            logitBias == other.logitBias &&
            logprobs == other.logprobs &&
            maxCompletionTokens == other.maxCompletionTokens &&
            maxTokens == other.maxTokens &&
            maxTurns == other.maxTurns &&
            mcpServers == other.mcpServers &&
            messages == other.messages &&
            metadata == other.metadata &&
            modalities == other.modalities &&
            modelAttributes == other.modelAttributes &&
            n == other.n &&
            outputConfig == other.outputConfig &&
            parallelToolCalls == other.parallelToolCalls &&
            prediction == other.prediction &&
            presencePenalty == other.presencePenalty &&
            promptCacheKey == other.promptCacheKey &&
            promptCacheRetention == other.promptCacheRetention &&
            promptMode == other.promptMode &&
            reasoningEffort == other.reasoningEffort &&
            responseFormat == other.responseFormat &&
            safePrompt == other.safePrompt &&
            safetyIdentifier == other.safetyIdentifier &&
            safetySettings == other.safetySettings &&
            searchParameters == other.searchParameters &&
            seed == other.seed &&
            serviceTier == other.serviceTier &&
            speed == other.speed &&
            stop == other.stop &&
            store == other.store &&
            stream == other.stream &&
            streamOptions == other.streamOptions &&
            systemInstruction == other.systemInstruction &&
            temperature == other.temperature &&
            thinking == other.thinking &&
            toolChoice == other.toolChoice &&
            toolConfig == other.toolConfig &&
            tools == other.tools &&
            topK == other.topK &&
            topLogprobs == other.topLogprobs &&
            topP == other.topP &&
            user == other.user &&
            verbosity == other.verbosity &&
            webSearchOptions == other.webSearchOptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            model,
            agentAttributes,
            audio,
            automaticToolExecution,
            cachedContent,
            correlationId,
            credentials,
            deferred,
            deferredCalls,
            frequencyPenalty,
            functionCall,
            functions,
            generationConfig,
            guardrails,
            handoffConfig,
            handoffMode,
            inferenceGeo,
            logitBias,
            logprobs,
            maxCompletionTokens,
            maxTokens,
            maxTurns,
            mcpServers,
            messages,
            metadata,
            modalities,
            modelAttributes,
            n,
            outputConfig,
            parallelToolCalls,
            prediction,
            presencePenalty,
            promptCacheKey,
            promptCacheRetention,
            promptMode,
            reasoningEffort,
            responseFormat,
            safePrompt,
            safetyIdentifier,
            safetySettings,
            searchParameters,
            seed,
            serviceTier,
            speed,
            stop,
            store,
            stream,
            streamOptions,
            systemInstruction,
            temperature,
            thinking,
            toolChoice,
            toolConfig,
            tools,
            topK,
            topLogprobs,
            topP,
            user,
            verbosity,
            webSearchOptions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionCreateParams{model=$model, agentAttributes=$agentAttributes, audio=$audio, automaticToolExecution=$automaticToolExecution, cachedContent=$cachedContent, correlationId=$correlationId, credentials=$credentials, deferred=$deferred, deferredCalls=$deferredCalls, frequencyPenalty=$frequencyPenalty, functionCall=$functionCall, functions=$functions, generationConfig=$generationConfig, guardrails=$guardrails, handoffConfig=$handoffConfig, handoffMode=$handoffMode, inferenceGeo=$inferenceGeo, logitBias=$logitBias, logprobs=$logprobs, maxCompletionTokens=$maxCompletionTokens, maxTokens=$maxTokens, maxTurns=$maxTurns, mcpServers=$mcpServers, messages=$messages, metadata=$metadata, modalities=$modalities, modelAttributes=$modelAttributes, n=$n, outputConfig=$outputConfig, parallelToolCalls=$parallelToolCalls, prediction=$prediction, presencePenalty=$presencePenalty, promptCacheKey=$promptCacheKey, promptCacheRetention=$promptCacheRetention, promptMode=$promptMode, reasoningEffort=$reasoningEffort, responseFormat=$responseFormat, safePrompt=$safePrompt, safetyIdentifier=$safetyIdentifier, safetySettings=$safetySettings, searchParameters=$searchParameters, seed=$seed, serviceTier=$serviceTier, speed=$speed, stop=$stop, store=$store, stream=$stream, streamOptions=$streamOptions, systemInstruction=$systemInstruction, temperature=$temperature, thinking=$thinking, toolChoice=$toolChoice, toolConfig=$toolConfig, tools=$tools, topK=$topK, topLogprobs=$topLogprobs, topP=$topP, user=$user, verbosity=$verbosity, webSearchOptions=$webSearchOptions, additionalProperties=$additionalProperties}"
}
