// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.images

import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.MultipartField
import com.dedalus_sdk.api.core.Params
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.http.Headers
import com.dedalus_sdk.api.core.http.QueryParams
import com.dedalus_sdk.api.core.toImmutable
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * Create variations of an image.
 *
 * DALL·E 2 only. Upload an image to generate variations.
 */
class ImageCreateVariationParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun image(): InputStream = body.image()

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): String? = body.model()

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun n(): Long? = body.n()

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): String? = body.responseFormat()

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun size(): String? = body.size()

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): String? = body.user()

    /**
     * Returns the raw multipart value of [image].
     *
     * Unlike [image], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _image(): MultipartField<InputStream> = body._image()

    /**
     * Returns the raw multipart value of [model].
     *
     * Unlike [model], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _model(): MultipartField<String> = body._model()

    /**
     * Returns the raw multipart value of [n].
     *
     * Unlike [n], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _n(): MultipartField<Long> = body._n()

    /**
     * Returns the raw multipart value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _responseFormat(): MultipartField<String> = body._responseFormat()

    /**
     * Returns the raw multipart value of [size].
     *
     * Unlike [size], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _size(): MultipartField<String> = body._size()

    /**
     * Returns the raw multipart value of [user].
     *
     * Unlike [user], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _user(): MultipartField<String> = body._user()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ImageCreateVariationParams].
         *
         * The following fields are required:
         * ```kotlin
         * .image()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ImageCreateVariationParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(imageCreateVariationParams: ImageCreateVariationParams) = apply {
            body = imageCreateVariationParams.body.toBuilder()
            additionalHeaders = imageCreateVariationParams.additionalHeaders.toBuilder()
            additionalQueryParams = imageCreateVariationParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [image]
         * - [model]
         * - [n]
         * - [responseFormat]
         * - [size]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun image(image: InputStream) = apply { body.image(image) }

        /**
         * Sets [Builder.image] to an arbitrary multipart value.
         *
         * You should usually call [Builder.image] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun image(image: MultipartField<InputStream>) = apply { body.image(image) }

        fun image(image: ByteArray) = apply { body.image(image) }

        fun image(path: Path) = apply { body.image(path) }

        fun model(model: String?) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary multipart value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: MultipartField<String>) = apply { body.model(model) }

        fun n(n: Long?) = apply { body.n(n) }

        /**
         * Alias for [Builder.n].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun n(n: Long) = n(n as Long?)

        /**
         * Sets [Builder.n] to an arbitrary multipart value.
         *
         * You should usually call [Builder.n] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: MultipartField<Long>) = apply { body.n(n) }

        fun responseFormat(responseFormat: String?) = apply { body.responseFormat(responseFormat) }

        /**
         * Sets [Builder.responseFormat] to an arbitrary multipart value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: MultipartField<String>) = apply {
            body.responseFormat(responseFormat)
        }

        fun size(size: String?) = apply { body.size(size) }

        /**
         * Sets [Builder.size] to an arbitrary multipart value.
         *
         * You should usually call [Builder.size] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: MultipartField<String>) = apply { body.size(size) }

        fun user(user: String?) = apply { body.user(user) }

        /**
         * Sets [Builder.user] to an arbitrary multipart value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: MultipartField<String>) = apply { body.user(user) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [ImageCreateVariationParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .image()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ImageCreateVariationParams =
            ImageCreateVariationParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "image" to _image(),
                "model" to _model(),
                "n" to _n(),
                "response_format" to _responseFormat(),
                "size" to _size(),
                "user" to _user(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val image: MultipartField<InputStream>,
        private val model: MultipartField<String>,
        private val n: MultipartField<Long>,
        private val responseFormat: MultipartField<String>,
        private val size: MultipartField<String>,
        private val user: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun image(): InputStream = image.value.getRequired("image")

        /**
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): String? = model.value.getNullable("model")

        /**
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun n(): Long? = n.value.getNullable("n")

        /**
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseFormat(): String? = responseFormat.value.getNullable("response_format")

        /**
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun size(): String? = size.value.getNullable("size")

        /**
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun user(): String? = user.value.getNullable("user")

        /**
         * Returns the raw multipart value of [image].
         *
         * Unlike [image], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("image") @ExcludeMissing fun _image(): MultipartField<InputStream> = image

        /**
         * Returns the raw multipart value of [model].
         *
         * Unlike [model], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): MultipartField<String> = model

        /**
         * Returns the raw multipart value of [n].
         *
         * Unlike [n], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("n") @ExcludeMissing fun _n(): MultipartField<Long> = n

        /**
         * Returns the raw multipart value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): MultipartField<String> = responseFormat

        /**
         * Returns the raw multipart value of [size].
         *
         * Unlike [size], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): MultipartField<String> = size

        /**
         * Returns the raw multipart value of [user].
         *
         * Unlike [user], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): MultipartField<String> = user

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .image()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var image: MultipartField<InputStream>? = null
            private var model: MultipartField<String> = MultipartField.of(null)
            private var n: MultipartField<Long> = MultipartField.of(null)
            private var responseFormat: MultipartField<String> = MultipartField.of(null)
            private var size: MultipartField<String> = MultipartField.of(null)
            private var user: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                image = body.image
                model = body.model
                n = body.n
                responseFormat = body.responseFormat
                size = body.size
                user = body.user
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun image(image: InputStream) = image(MultipartField.of(image))

            /**
             * Sets [Builder.image] to an arbitrary multipart value.
             *
             * You should usually call [Builder.image] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun image(image: MultipartField<InputStream>) = apply { this.image = image }

            fun image(image: ByteArray) = image(image.inputStream())

            fun image(path: Path) =
                image(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            fun model(model: String?) = model(MultipartField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary multipart value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: MultipartField<String>) = apply { this.model = model }

            fun n(n: Long?) = n(MultipartField.of(n))

            /**
             * Alias for [Builder.n].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun n(n: Long) = n(n as Long?)

            /**
             * Sets [Builder.n] to an arbitrary multipart value.
             *
             * You should usually call [Builder.n] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun n(n: MultipartField<Long>) = apply { this.n = n }

            fun responseFormat(responseFormat: String?) =
                responseFormat(MultipartField.of(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary multipart value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseFormat(responseFormat: MultipartField<String>) = apply {
                this.responseFormat = responseFormat
            }

            fun size(size: String?) = size(MultipartField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary multipart value.
             *
             * You should usually call [Builder.size] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: MultipartField<String>) = apply { this.size = size }

            fun user(user: String?) = user(MultipartField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary multipart value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: MultipartField<String>) = apply { this.user = user }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .image()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("image", image),
                    model,
                    n,
                    responseFormat,
                    size,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            image()
            model()
            n()
            responseFormat()
            size()
            user()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                image == other.image &&
                model == other.model &&
                n == other.n &&
                responseFormat == other.responseFormat &&
                size == other.size &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(image, model, n, responseFormat, size, user, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{image=$image, model=$model, n=$n, responseFormat=$responseFormat, size=$size, user=$user, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImageCreateVariationParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ImageCreateVariationParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
