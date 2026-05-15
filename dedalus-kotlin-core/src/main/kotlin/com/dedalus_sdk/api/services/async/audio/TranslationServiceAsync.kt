// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async.audio

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.models.audio.translations.TranslationCreateParams
import com.dedalus_sdk.api.models.audio.translations.TranslationCreateResponse
import com.google.errorprone.annotations.MustBeClosed

interface TranslationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TranslationServiceAsync

    /**
     * Translate audio into English.
     *
     * Translates audio files in any supported language to English text using OpenAI's Whisper
     * model. Supports the same audio formats as transcription. Maximum file size is 25 MB.
     *
     * Args: file: Audio file to translate (required) model: Model ID to use (e.g.,
     * "openai/whisper-1") prompt: Optional text to guide the model's style response_format: Format
     * of the output (json, text, srt, verbose_json, vtt) temperature: Sampling temperature between
     * 0 and 1
     *
     * Returns: Translation object with the English translation
     */
    suspend fun create(
        params: TranslationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranslationCreateResponse

    /**
     * A view of [TranslationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TranslationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/audio/translations`, but is otherwise the same
         * as [TranslationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TranslationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranslationCreateResponse>
    }
}
