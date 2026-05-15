// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.async

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.services.async.audio.SpeechServiceAsync
import com.dedalus_sdk.api.services.async.audio.SpeechServiceAsyncImpl
import com.dedalus_sdk.api.services.async.audio.TranscriptionServiceAsync
import com.dedalus_sdk.api.services.async.audio.TranscriptionServiceAsyncImpl
import com.dedalus_sdk.api.services.async.audio.TranslationServiceAsync
import com.dedalus_sdk.api.services.async.audio.TranslationServiceAsyncImpl

class AudioServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioServiceAsync {

    private val withRawResponse: AudioServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val speech: SpeechServiceAsync by lazy { SpeechServiceAsyncImpl(clientOptions) }

    private val transcriptions: TranscriptionServiceAsync by lazy {
        TranscriptionServiceAsyncImpl(clientOptions)
    }

    private val translations: TranslationServiceAsync by lazy {
        TranslationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): AudioServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioServiceAsync =
        AudioServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun speech(): SpeechServiceAsync = speech

    override fun transcriptions(): TranscriptionServiceAsync = transcriptions

    override fun translations(): TranslationServiceAsync = translations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioServiceAsync.WithRawResponse {

        private val speech: SpeechServiceAsync.WithRawResponse by lazy {
            SpeechServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcriptions: TranscriptionServiceAsync.WithRawResponse by lazy {
            TranscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val translations: TranslationServiceAsync.WithRawResponse by lazy {
            TranslationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudioServiceAsync.WithRawResponse =
            AudioServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun speech(): SpeechServiceAsync.WithRawResponse = speech

        override fun transcriptions(): TranscriptionServiceAsync.WithRawResponse = transcriptions

        override fun translations(): TranslationServiceAsync.WithRawResponse = translations
    }
}
