// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.models.ocr.OcrProcessParams
import com.dedalus_sdk.api.models.ocr.OcrRequest
import com.dedalus_sdk.api.models.ocr.OcrResponse
import com.google.errorprone.annotations.MustBeClosed

interface OcrService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OcrService

    /**
     * Process a document through Mistral OCR.
     *
     * Extracts text from PDFs and images, returning markdown-formatted content.
     */
    fun process(
        params: OcrProcessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OcrResponse

    /** @see process */
    fun process(
        ocrRequest: OcrRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OcrResponse =
        process(OcrProcessParams.builder().ocrRequest(ocrRequest).build(), requestOptions)

    /** A view of [OcrService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OcrService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/ocr`, but is otherwise the same as
         * [OcrService.process].
         */
        @MustBeClosed
        fun process(
            params: OcrProcessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OcrResponse>

        /** @see process */
        @MustBeClosed
        fun process(
            ocrRequest: OcrRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OcrResponse> =
            process(OcrProcessParams.builder().ocrRequest(ocrRequest).build(), requestOptions)
    }
}
