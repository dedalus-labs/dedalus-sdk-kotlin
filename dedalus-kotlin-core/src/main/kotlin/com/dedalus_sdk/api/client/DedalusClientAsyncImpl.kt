// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.client

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.getPackageVersion
import com.dedalus_sdk.api.services.async.AudioServiceAsync
import com.dedalus_sdk.api.services.async.AudioServiceAsyncImpl
import com.dedalus_sdk.api.services.async.ChatServiceAsync
import com.dedalus_sdk.api.services.async.ChatServiceAsyncImpl
import com.dedalus_sdk.api.services.async.EmbeddingServiceAsync
import com.dedalus_sdk.api.services.async.EmbeddingServiceAsyncImpl
import com.dedalus_sdk.api.services.async.ImageServiceAsync
import com.dedalus_sdk.api.services.async.ImageServiceAsyncImpl
import com.dedalus_sdk.api.services.async.ModelServiceAsync
import com.dedalus_sdk.api.services.async.ModelServiceAsyncImpl
import com.dedalus_sdk.api.services.async.OcrServiceAsync
import com.dedalus_sdk.api.services.async.OcrServiceAsyncImpl
import com.dedalus_sdk.api.services.async.ResponseServiceAsync
import com.dedalus_sdk.api.services.async.ResponseServiceAsyncImpl

class DedalusClientAsyncImpl(private val clientOptions: ClientOptions) : DedalusClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: DedalusClient by lazy { DedalusClientImpl(clientOptions) }

    private val withRawResponse: DedalusClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val models: ModelServiceAsync by lazy {
        ModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val embeddings: EmbeddingServiceAsync by lazy {
        EmbeddingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val audio: AudioServiceAsync by lazy {
        AudioServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val images: ImageServiceAsync by lazy {
        ImageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ocr: OcrServiceAsync by lazy { OcrServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val responses: ResponseServiceAsync by lazy {
        ResponseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): DedalusClient = sync

    override fun withRawResponse(): DedalusClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DedalusClientAsync =
        DedalusClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun models(): ModelServiceAsync = models

    override fun embeddings(): EmbeddingServiceAsync = embeddings

    override fun audio(): AudioServiceAsync = audio

    override fun images(): ImageServiceAsync = images

    override fun ocr(): OcrServiceAsync = ocr

    override fun responses(): ResponseServiceAsync = responses

    override fun chat(): ChatServiceAsync = chat

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DedalusClientAsync.WithRawResponse {

        private val models: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val embeddings: EmbeddingServiceAsync.WithRawResponse by lazy {
            EmbeddingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val audio: AudioServiceAsync.WithRawResponse by lazy {
            AudioServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val images: ImageServiceAsync.WithRawResponse by lazy {
            ImageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ocr: OcrServiceAsync.WithRawResponse by lazy {
            OcrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val responses: ResponseServiceAsync.WithRawResponse by lazy {
            ResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DedalusClientAsync.WithRawResponse =
            DedalusClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun models(): ModelServiceAsync.WithRawResponse = models

        override fun embeddings(): EmbeddingServiceAsync.WithRawResponse = embeddings

        override fun audio(): AudioServiceAsync.WithRawResponse = audio

        override fun images(): ImageServiceAsync.WithRawResponse = images

        override fun ocr(): OcrServiceAsync.WithRawResponse = ocr

        override fun responses(): ResponseServiceAsync.WithRawResponse = responses

        override fun chat(): ChatServiceAsync.WithRawResponse = chat
    }
}
