// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.models.embeddings.CreateEmbeddingRequest
import com.dedalus_sdk.api.models.embeddings.CreateEmbeddingResponse
import com.dedalus_sdk.api.models.embeddings.EmbeddingCreateParams
import com.google.errorprone.annotations.MustBeClosed

interface EmbeddingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmbeddingServiceAsync

    /** Create embeddings using the configured provider. */
    suspend fun create(
        params: EmbeddingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateEmbeddingResponse

    /** @see create */
    suspend fun create(
        createEmbeddingRequest: CreateEmbeddingRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateEmbeddingResponse =
        create(
            EmbeddingCreateParams.builder().createEmbeddingRequest(createEmbeddingRequest).build(),
            requestOptions,
        )

    /**
     * A view of [EmbeddingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EmbeddingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/embeddings`, but is otherwise the same as
         * [EmbeddingServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EmbeddingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateEmbeddingResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            createEmbeddingRequest: CreateEmbeddingRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateEmbeddingResponse> =
            create(
                EmbeddingCreateParams.builder()
                    .createEmbeddingRequest(createEmbeddingRequest)
                    .build(),
                requestOptions,
            )
    }
}
