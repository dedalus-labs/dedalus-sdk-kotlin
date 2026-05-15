// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async.audio

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponse
import com.dedalus_sdk.api.models.audio.speech.SpeechCreateParams
import com.google.errorprone.annotations.MustBeClosed

interface SpeechServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpeechServiceAsync

    /**
     * Generate speech audio from text.
     *
     * Generates audio from the input text using text-to-speech models. Supports multiple voices and
     * output formats including mp3, opus, aac, flac, wav, and pcm.
     *
     * Returns streaming audio data that can be saved to a file or streamed directly to users.
     */
    @MustBeClosed
    suspend fun create(
        params: SpeechCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * A view of [SpeechServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SpeechServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/audio/speech`, but is otherwise the same as
         * [SpeechServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SpeechCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
