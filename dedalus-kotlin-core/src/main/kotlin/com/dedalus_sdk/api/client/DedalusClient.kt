// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.client

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.services.blocking.AudioService
import com.dedalus_sdk.api.services.blocking.ChatService
import com.dedalus_sdk.api.services.blocking.EmbeddingService
import com.dedalus_sdk.api.services.blocking.ImageService
import com.dedalus_sdk.api.services.blocking.ModelService
import com.dedalus_sdk.api.services.blocking.OcrService
import com.dedalus_sdk.api.services.blocking.ResponseService

/**
 * A client for interacting with the Dedalus REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface DedalusClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): DedalusClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DedalusClient

    fun models(): ModelService

    fun embeddings(): EmbeddingService

    fun audio(): AudioService

    fun images(): ImageService

    fun ocr(): OcrService

    fun responses(): ResponseService

    fun chat(): ChatService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [DedalusClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DedalusClient.WithRawResponse

        fun models(): ModelService.WithRawResponse

        fun embeddings(): EmbeddingService.WithRawResponse

        fun audio(): AudioService.WithRawResponse

        fun images(): ImageService.WithRawResponse

        fun ocr(): OcrService.WithRawResponse

        fun responses(): ResponseService.WithRawResponse

        fun chat(): ChatService.WithRawResponse
    }
}
