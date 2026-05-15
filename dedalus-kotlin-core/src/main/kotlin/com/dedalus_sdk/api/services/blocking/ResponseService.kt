// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.models.responses.Response
import com.dedalus_sdk.api.models.responses.ResponseCreateParams
import com.google.errorprone.annotations.MustBeClosed

interface ResponseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ResponseService

    /**
     * Create a response using the OpenAI Responses API.
     *
     * This endpoint routes directly to OpenAI's Responses API. Only OpenAI models are supported.
     */
    fun create(
        params: ResponseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Response

    /** @see create */
    fun create(
        responseCreateParams: ResponseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Response =
        create(
            ResponseCreateParams.builder().responseCreateParams(responseCreateParams).build(),
            requestOptions,
        )

    /** A view of [ResponseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ResponseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/responses`, but is otherwise the same as
         * [ResponseService.create].
         */
        @MustBeClosed
        fun create(
            params: ResponseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Response>

        /** @see create */
        @MustBeClosed
        fun create(
            responseCreateParams: ResponseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Response> =
            create(
                ResponseCreateParams.builder().responseCreateParams(responseCreateParams).build(),
                requestOptions,
            )
    }
}
