// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.services.blocking.audio.SpeechService
import com.dedalus_sdk.api.services.blocking.audio.SpeechServiceImpl
import com.dedalus_sdk.api.services.blocking.audio.TranscriptionService
import com.dedalus_sdk.api.services.blocking.audio.TranscriptionServiceImpl
import com.dedalus_sdk.api.services.blocking.audio.TranslationService
import com.dedalus_sdk.api.services.blocking.audio.TranslationServiceImpl

class AudioServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioService {

    private val withRawResponse: AudioService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val speech: SpeechService by lazy { SpeechServiceImpl(clientOptions) }

    private val transcriptions: TranscriptionService by lazy {
        TranscriptionServiceImpl(clientOptions)
    }

    private val translations: TranslationService by lazy { TranslationServiceImpl(clientOptions) }

    override fun withRawResponse(): AudioService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioService =
        AudioServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun speech(): SpeechService = speech

    override fun transcriptions(): TranscriptionService = transcriptions

    override fun translations(): TranslationService = translations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioService.WithRawResponse {

        private val speech: SpeechService.WithRawResponse by lazy {
            SpeechServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcriptions: TranscriptionService.WithRawResponse by lazy {
            TranscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val translations: TranslationService.WithRawResponse by lazy {
            TranslationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudioService.WithRawResponse =
            AudioServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun speech(): SpeechService.WithRawResponse = speech

        override fun transcriptions(): TranscriptionService.WithRawResponse = transcriptions

        override fun translations(): TranslationService.WithRawResponse = translations
    }
}
