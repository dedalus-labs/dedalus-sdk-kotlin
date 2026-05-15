// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.embeddings

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.Params
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.http.Headers
import com.dedalus_sdk.api.core.http.QueryParams
import java.util.Objects

/** Create embeddings using the configured provider. */
class EmbeddingCreateParams
private constructor(
    private val createEmbeddingRequest: CreateEmbeddingRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Schema for EmbeddingRequest.
     *
     * Fields:
     * - input (required): str | Annotated[list[str], MinLen(1), MaxLen(2048),
     *   ArrayTitle("EmbeddingRequestInputArray")] | Annotated[list[int], MinLen(1), MaxLen(2048),
     *   ArrayTitle("EmbeddingRequestInputArray")] | Annotated[list[Annotated[list[int], MinLen(1),
     *   ArrayTitle("EmbeddingRequestInputItemArray")]], MinLen(1), MaxLen(2048),
     *   ArrayTitle("EmbeddingRequestInputArray")]
     * - model (required): str | Literal["text-embedding-ada-002", "text-embedding-3-small",
     *   "text-embedding-3-large"]
     * - encoding_format (optional): Literal["float", "base64"]
     * - dimensions (optional): int
     * - user (optional): str
     */
    fun createEmbeddingRequest(): CreateEmbeddingRequest = createEmbeddingRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        createEmbeddingRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmbeddingCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .createEmbeddingRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmbeddingCreateParams]. */
    class Builder internal constructor() {

        private var createEmbeddingRequest: CreateEmbeddingRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(embeddingCreateParams: EmbeddingCreateParams) = apply {
            createEmbeddingRequest = embeddingCreateParams.createEmbeddingRequest
            additionalHeaders = embeddingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = embeddingCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Schema for EmbeddingRequest.
         *
         * Fields:
         * - input (required): str | Annotated[list[str], MinLen(1), MaxLen(2048),
         *   ArrayTitle("EmbeddingRequestInputArray")] | Annotated[list[int], MinLen(1),
         *   MaxLen(2048), ArrayTitle("EmbeddingRequestInputArray")] |
         *   Annotated[list[Annotated[list[int], MinLen(1),
         *   ArrayTitle("EmbeddingRequestInputItemArray")]], MinLen(1), MaxLen(2048),
         *   ArrayTitle("EmbeddingRequestInputArray")]
         * - model (required): str | Literal["text-embedding-ada-002", "text-embedding-3-small",
         *   "text-embedding-3-large"]
         * - encoding_format (optional): Literal["float", "base64"]
         * - dimensions (optional): int
         * - user (optional): str
         */
        fun createEmbeddingRequest(createEmbeddingRequest: CreateEmbeddingRequest) = apply {
            this.createEmbeddingRequest = createEmbeddingRequest
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EmbeddingCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .createEmbeddingRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmbeddingCreateParams =
            EmbeddingCreateParams(
                checkRequired("createEmbeddingRequest", createEmbeddingRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreateEmbeddingRequest = createEmbeddingRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmbeddingCreateParams &&
            createEmbeddingRequest == other.createEmbeddingRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(createEmbeddingRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmbeddingCreateParams{createEmbeddingRequest=$createEmbeddingRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
