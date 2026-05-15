// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking.chat

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.core.http.StreamResponse
import com.dedalus_sdk.api.models.chat.completions.ChatCompletion
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionChunk
import com.dedalus_sdk.api.models.chat.completions.ChatCompletionCreateParams
import com.dedalus_sdk.api.models.chat.completions.CompletionCreateParams
import com.google.errorprone.annotations.MustBeClosed

interface CompletionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompletionService

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
     * - If multiple models are supplied, the first one is used, and the agent may hand off to
     *   another model.
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
    fun create(
        params: CompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletion

    /** @see create */
    fun create(
        chatCompletionCreateParams: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletion =
        create(
            CompletionCreateParams.builder()
                .chatCompletionCreateParams(chatCompletionCreateParams)
                .build(),
            requestOptions,
        )

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
     * - If multiple models are supplied, the first one is used, and the agent may hand off to
     *   another model.
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
    @MustBeClosed
    fun createStreaming(
        params: CompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<ChatCompletionChunk>

    /** @see createStreaming */
    @MustBeClosed
    fun createStreaming(
        chatCompletionCreateParams: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<ChatCompletionChunk> =
        createStreaming(
            CompletionCreateParams.builder()
                .chatCompletionCreateParams(chatCompletionCreateParams)
                .build(),
            requestOptions,
        )

    /** A view of [CompletionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompletionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/chat/completions`, but is otherwise the same as
         * [CompletionService.create].
         */
        @MustBeClosed
        fun create(
            params: CompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletion>

        /** @see create */
        @MustBeClosed
        fun create(
            chatCompletionCreateParams: ChatCompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletion> =
            create(
                CompletionCreateParams.builder()
                    .chatCompletionCreateParams(chatCompletionCreateParams)
                    .build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/chat/completions`, but is otherwise the same as
         * [CompletionService.createStreaming].
         */
        @MustBeClosed
        fun createStreaming(
            params: CompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<ChatCompletionChunk>>

        /** @see createStreaming */
        @MustBeClosed
        fun createStreaming(
            chatCompletionCreateParams: ChatCompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<ChatCompletionChunk>> =
            createStreaming(
                CompletionCreateParams.builder()
                    .chatCompletionCreateParams(chatCompletionCreateParams)
                    .build(),
                requestOptions,
            )
    }
}
