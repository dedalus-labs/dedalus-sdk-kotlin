// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.services.blocking.audio.SpeechService
import com.dedalus_sdk.api.services.blocking.audio.TranscriptionService
import com.dedalus_sdk.api.services.blocking.audio.TranslationService

interface AudioService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioService

    fun speech(): SpeechService

    fun transcriptions(): TranscriptionService

    fun translations(): TranslationService

    /** A view of [AudioService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioService.WithRawResponse

        fun speech(): SpeechService.WithRawResponse

        fun transcriptions(): TranscriptionService.WithRawResponse

        fun translations(): TranslationService.WithRawResponse
    }
}
