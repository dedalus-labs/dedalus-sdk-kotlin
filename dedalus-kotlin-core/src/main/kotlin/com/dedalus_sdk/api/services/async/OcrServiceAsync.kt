// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.models.ocr.OcrProcessParams
import com.dedalus_sdk.api.models.ocr.OcrRequest
import com.dedalus_sdk.api.models.ocr.OcrResponse
import com.google.errorprone.annotations.MustBeClosed

interface OcrServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OcrServiceAsync

    /**
     * Process a document through Mistral OCR.
     *
     * Extracts text from PDFs and images, returning markdown-formatted content.
     */
    suspend fun process(
        params: OcrProcessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OcrResponse

    /** @see process */
    suspend fun process(
        ocrRequest: OcrRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OcrResponse =
        process(OcrProcessParams.builder().ocrRequest(ocrRequest).build(), requestOptions)

    /** A view of [OcrServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OcrServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/ocr`, but is otherwise the same as
         * [OcrServiceAsync.process].
         */
        @MustBeClosed
        suspend fun process(
            params: OcrProcessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OcrResponse>

        /** @see process */
        @MustBeClosed
        suspend fun process(
            ocrRequest: OcrRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OcrResponse> =
            process(OcrProcessParams.builder().ocrRequest(ocrRequest).build(), requestOptions)
    }
}
