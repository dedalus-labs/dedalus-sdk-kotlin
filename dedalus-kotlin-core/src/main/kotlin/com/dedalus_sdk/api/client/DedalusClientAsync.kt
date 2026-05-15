// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.client

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.services.async.AudioServiceAsync
import com.dedalus_sdk.api.services.async.ChatServiceAsync
import com.dedalus_sdk.api.services.async.EmbeddingServiceAsync
import com.dedalus_sdk.api.services.async.ImageServiceAsync
import com.dedalus_sdk.api.services.async.ModelServiceAsync
import com.dedalus_sdk.api.services.async.OcrServiceAsync
import com.dedalus_sdk.api.services.async.ResponseServiceAsync

/**
 * A client for interacting with the Dedalus REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface DedalusClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): DedalusClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DedalusClientAsync

    fun models(): ModelServiceAsync

    fun embeddings(): EmbeddingServiceAsync

    fun audio(): AudioServiceAsync

    fun images(): ImageServiceAsync

    fun ocr(): OcrServiceAsync

    fun responses(): ResponseServiceAsync

    fun chat(): ChatServiceAsync

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

    /**
     * A view of [DedalusClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DedalusClientAsync.WithRawResponse

        fun models(): ModelServiceAsync.WithRawResponse

        fun embeddings(): EmbeddingServiceAsync.WithRawResponse

        fun audio(): AudioServiceAsync.WithRawResponse

        fun images(): ImageServiceAsync.WithRawResponse

        fun ocr(): OcrServiceAsync.WithRawResponse

        fun responses(): ResponseServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse
    }
}
