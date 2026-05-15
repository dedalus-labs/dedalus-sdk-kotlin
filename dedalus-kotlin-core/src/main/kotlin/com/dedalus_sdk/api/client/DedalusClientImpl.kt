// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.client

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.getPackageVersion
import com.dedalus_sdk.api.services.blocking.AudioService
import com.dedalus_sdk.api.services.blocking.AudioServiceImpl
import com.dedalus_sdk.api.services.blocking.ChatService
import com.dedalus_sdk.api.services.blocking.ChatServiceImpl
import com.dedalus_sdk.api.services.blocking.EmbeddingService
import com.dedalus_sdk.api.services.blocking.EmbeddingServiceImpl
import com.dedalus_sdk.api.services.blocking.ImageService
import com.dedalus_sdk.api.services.blocking.ImageServiceImpl
import com.dedalus_sdk.api.services.blocking.ModelService
import com.dedalus_sdk.api.services.blocking.ModelServiceImpl
import com.dedalus_sdk.api.services.blocking.OcrService
import com.dedalus_sdk.api.services.blocking.OcrServiceImpl
import com.dedalus_sdk.api.services.blocking.ResponseService
import com.dedalus_sdk.api.services.blocking.ResponseServiceImpl

class DedalusClientImpl(private val clientOptions: ClientOptions) : DedalusClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: DedalusClientAsync by lazy { DedalusClientAsyncImpl(clientOptions) }

    private val withRawResponse: DedalusClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val models: ModelService by lazy { ModelServiceImpl(clientOptionsWithUserAgent) }

    private val embeddings: EmbeddingService by lazy {
        EmbeddingServiceImpl(clientOptionsWithUserAgent)
    }

    private val audio: AudioService by lazy { AudioServiceImpl(clientOptionsWithUserAgent) }

    private val images: ImageService by lazy { ImageServiceImpl(clientOptionsWithUserAgent) }

    private val ocr: OcrService by lazy { OcrServiceImpl(clientOptionsWithUserAgent) }

    private val responses: ResponseService by lazy {
        ResponseServiceImpl(clientOptionsWithUserAgent)
    }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): DedalusClientAsync = async

    override fun withRawResponse(): DedalusClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DedalusClient =
        DedalusClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun models(): ModelService = models

    override fun embeddings(): EmbeddingService = embeddings

    override fun audio(): AudioService = audio

    override fun images(): ImageService = images

    override fun ocr(): OcrService = ocr

    override fun responses(): ResponseService = responses

    override fun chat(): ChatService = chat

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DedalusClient.WithRawResponse {

        private val models: ModelService.WithRawResponse by lazy {
            ModelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val embeddings: EmbeddingService.WithRawResponse by lazy {
            EmbeddingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val audio: AudioService.WithRawResponse by lazy {
            AudioServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val images: ImageService.WithRawResponse by lazy {
            ImageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ocr: OcrService.WithRawResponse by lazy {
            OcrServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val responses: ResponseService.WithRawResponse by lazy {
            ResponseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DedalusClient.WithRawResponse =
            DedalusClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun models(): ModelService.WithRawResponse = models

        override fun embeddings(): EmbeddingService.WithRawResponse = embeddings

        override fun audio(): AudioService.WithRawResponse = audio

        override fun images(): ImageService.WithRawResponse = images

        override fun ocr(): OcrService.WithRawResponse = ocr

        override fun responses(): ResponseService.WithRawResponse = responses

        override fun chat(): ChatService.WithRawResponse = chat
    }
}
