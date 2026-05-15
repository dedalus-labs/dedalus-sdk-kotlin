// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.models

import com.dedalus_sdk.api.core.Params
import com.dedalus_sdk.api.core.http.Headers
import com.dedalus_sdk.api.core.http.QueryParams
import java.util.Objects

/**
 * Retrieve a model.
 *
 * Retrieve detailed information about a specific model, including its capabilities, provider, and
 * supported features.
 *
 * Args: model_id: The ID of the model to retrieve (e.g., 'openai/gpt-4',
 * 'anthropic/claude-3-5-sonnet-20241022') user: Authenticated user obtained from API key validation
 *
 * Returns: Model: Information about the requested model
 *
 * Raises: HTTPException:
 * - 401 if authentication fails
 * - 404 if model not found or not accessible with current API key
 * - 500 if internal error occurs
 *
 * Requires: Valid API key with 'read' scope permission
 *
 * Example:
 *
 *     ```python
 *     import dedalus_labs
 *
 *     client = dedalus_labs.Client(api_key="your-api-key")
 *     model = client.models.retrieve("openai/gpt-4")
 *
 *     print(f"Model: {model.id}")
 *     print(f"Owner: {model.owned_by}")
 *     ```
 *     Response:
 *     ```json
 *     {
 *         "id": "openai/gpt-4",
 *         "object": "model",
 *         "created": 1687882411,
 *         "owned_by": "openai"
 *     }
 *     ```
 */
class ModelRetrieveParams
private constructor(
    private val modelId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun modelId(): String? = modelId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ModelRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ModelRetrieveParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ModelRetrieveParams]. */
    class Builder internal constructor() {

        private var modelId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(modelRetrieveParams: ModelRetrieveParams) = apply {
            modelId = modelRetrieveParams.modelId
            additionalHeaders = modelRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = modelRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun modelId(modelId: String?) = apply { this.modelId = modelId }

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
         * Returns an immutable instance of [ModelRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ModelRetrieveParams =
            ModelRetrieveParams(modelId, additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> modelId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelRetrieveParams &&
            modelId == other.modelId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(modelId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ModelRetrieveParams{modelId=$modelId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
