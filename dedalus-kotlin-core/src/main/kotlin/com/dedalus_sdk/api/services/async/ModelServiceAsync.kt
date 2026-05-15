// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.models.models.ListModelsResponse
import com.dedalus_sdk.api.models.models.Model
import com.dedalus_sdk.api.models.models.ModelListParams
import com.dedalus_sdk.api.models.models.ModelRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModelServiceAsync

    /**
     * Retrieve a model.
     *
     * Retrieve detailed information about a specific model, including its capabilities, provider,
     * and supported features.
     *
     * Args: model_id: The ID of the model to retrieve (e.g., 'openai/gpt-4',
     * 'anthropic/claude-3-5-sonnet-20241022') user: Authenticated user obtained from API key
     * validation
     *
     * Returns: Model: Information about the requested model
     *
     * Raises: HTTPException:
     * - 401 if authentication fails
     * - 404 if model not found or not accessible with current API key
     * - 500 if internal error occurs
     *
     * Requires: Valid API key with 'read' scope permission
     *
     * Example:
     *
     *     ```python
     *     import dedalus_labs
     *
     *     client = dedalus_labs.Client(api_key="your-api-key")
     *     model = client.models.retrieve("openai/gpt-4")
     *
     *     print(f"Model: {model.id}")
     *     print(f"Owner: {model.owned_by}")
     *     ```
     *     Response:
     *     ```json
     *     {
     *         "id": "openai/gpt-4",
     *         "object": "model",
     *         "created": 1687882411,
     *         "owned_by": "openai"
     *     }
     *     ```
     */
    suspend fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Model = retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Model

    /** @see retrieve */
    suspend fun retrieve(modelId: String, requestOptions: RequestOptions): Model =
        retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

    /**
     * List available models.
     *
     * Retrieve the complete list of models available to your organization, including models from
     * OpenAI, Anthropic, Google, xAI, Mistral, Fireworks, and DeepSeek.
     *
     * Returns: ListModelsResponse: List of available models across all supported providers
     */
    suspend fun list(
        params: ModelListParams = ModelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListModelsResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ListModelsResponse =
        list(ModelListParams.none(), requestOptions)

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ModelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}`, but is otherwise the same as
         * [ModelServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Model> =
            retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Model>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            modelId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Model> = retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/models`, but is otherwise the same as
         * [ModelServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ModelListParams = ModelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListModelsResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ListModelsResponse> =
            list(ModelListParams.none(), requestOptions)
    }
}
