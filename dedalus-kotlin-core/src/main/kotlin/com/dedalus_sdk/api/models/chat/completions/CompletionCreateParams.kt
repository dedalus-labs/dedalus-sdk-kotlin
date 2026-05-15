// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.Params
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.http.Headers
import com.dedalus_sdk.api.core.http.QueryParams
import java.util.Objects

/**
 * Create a chat completion.
 *
 * Generates a model response for the given conversation and configuration. Supports
 * OpenAI-compatible parameters and provider-specific extensions.
 *
 * Headers:
 * - Authorization: bearer key for the calling account.
 * - X-Provider / X-Provider-Key: optional headers for using your own provider API key.
 *
 * Behavior:
 * - If multiple models are supplied, the first one is used, and the agent may hand off to another
 *   model.
 * - Tools may be invoked on the server or signaled for the client to run.
 * - Streaming responses emit incremental deltas; non-streaming returns a single object.
 * - Usage metrics are computed when available and returned in the response.
 *
 * Responses:
 * - 200 OK: JSON completion object with choices, message content, and usage.
 * - 400 Bad Request: validation error.
 * - 401 Unauthorized: authentication failed.
 * - 402 Payment Required or 429 Too Many Requests: quota, balance, or rate limit issue.
 * - 500 Internal Server Error: unexpected failure.
 *
 * Billing:
 * - Token usage metered by the selected model(s).
 * - Tool calls and MCP sessions may be billed separately.
 * - Streaming is settled after the stream ends via an async task.
 *
 * Example (non-streaming HTTP): POST /v1/chat/completions Content-Type: application/json
 * Authorization: Bearer <key>
 *
 * { "model": "provider/model-name", "messages": [{"role": "user", "content": "Hello"}] }
 *
 * 200 OK { "id": "cmpl_123", "object": "chat.completion", "choices":
 * [ {"index": 0, "message": {"role": "assistant", "content": "Hi there!"}, "finish_reason": "stop"} ],
 * "usage": {"prompt_tokens": 3, "completion_tokens": 4, "total_tokens": 7} }
 *
 * Example (streaming over SSE): POST /v1/chat/completions Accept: text/event-stream
 *
 * data: {"id":"cmpl_123","choices":[{"index":0,"delta":{"content":"Hi"}}]} data:
 * {"id":"cmpl_123","choices":[{"index":0,"delta":{"content":" there!"}}]} data: [DONE]
 */
class CompletionCreateParams
private constructor(
    private val chatCompletionCreateParams: ChatCompletionCreateParams,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ChatCompletion request schema.
     *
     * Supports OpenAI-compatible parameters, provider-specific extensions, server-side execution,
     * and agent orchestration features.
     */
    fun chatCompletionCreateParams(): ChatCompletionCreateParams = chatCompletionCreateParams

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        chatCompletionCreateParams._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompletionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .chatCompletionCreateParams()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CompletionCreateParams]. */
    class Builder internal constructor() {

        private var chatCompletionCreateParams: ChatCompletionCreateParams? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(completionCreateParams: CompletionCreateParams) = apply {
            chatCompletionCreateParams = completionCreateParams.chatCompletionCreateParams
            additionalHeaders = completionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = completionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * ChatCompletion request schema.
         *
         * Supports OpenAI-compatible parameters, provider-specific extensions, server-side
         * execution, and agent orchestration features.
         */
        fun chatCompletionCreateParams(chatCompletionCreateParams: ChatCompletionCreateParams) =
            apply {
                this.chatCompletionCreateParams = chatCompletionCreateParams
            }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CompletionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .chatCompletionCreateParams()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompletionCreateParams =
            CompletionCreateParams(
                checkRequired("chatCompletionCreateParams", chatCompletionCreateParams),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ChatCompletionCreateParams = chatCompletionCreateParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompletionCreateParams &&
            chatCompletionCreateParams == other.chatCompletionCreateParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(chatCompletionCreateParams, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CompletionCreateParams{chatCompletionCreateParams=$chatCompletionCreateParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
