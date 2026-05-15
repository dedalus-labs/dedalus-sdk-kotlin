// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.services.async.audio.SpeechServiceAsync
import com.dedalus_sdk.api.services.async.audio.TranscriptionServiceAsync
import com.dedalus_sdk.api.services.async.audio.TranslationServiceAsync

interface AudioServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioServiceAsync

    fun speech(): SpeechServiceAsync

    fun transcriptions(): TranscriptionServiceAsync

    fun translations(): TranslationServiceAsync

    /** A view of [AudioServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudioServiceAsync.WithRawResponse

        fun speech(): SpeechServiceAsync.WithRawResponse

        fun transcriptions(): TranscriptionServiceAsync.WithRawResponse

        fun translations(): TranslationServiceAsync.WithRawResponse
    }
}
