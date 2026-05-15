// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.images

import com.dedalus_sdk.api.core.Enum
import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Request to generate images. */
class CreateImageRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val prompt: JsonField<String>,
    private val background: JsonField<Background>,
    private val model: JsonField<String>,
    private val moderation: JsonField<Moderation>,
    private val n: JsonField<Long>,
    private val outputCompression: JsonField<Long>,
    private val outputFormat: JsonField<OutputFormat>,
    private val partialImages: JsonField<Long>,
    private val quality: JsonField<Quality>,
    private val responseFormat: JsonField<ResponseFormat>,
    private val size: JsonField<Size>,
    private val stream: JsonField<Boolean>,
    private val style: JsonField<Style>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("background")
        @ExcludeMissing
        background: JsonField<Background> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("moderation")
        @ExcludeMissing
        moderation: JsonField<Moderation> = JsonMissing.of(),
        @JsonProperty("n") @ExcludeMissing n: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("output_compression")
        @ExcludeMissing
        outputCompression: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("output_format")
        @ExcludeMissing
        outputFormat: JsonField<OutputFormat> = JsonMissing.of(),
        @JsonProperty("partial_images")
        @ExcludeMissing
        partialImages: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("quality") @ExcludeMissing quality: JsonField<Quality> = JsonMissing.of(),
        @JsonProperty("response_format")
        @ExcludeMissing
        responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Size> = JsonMissing.of(),
        @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("style") @ExcludeMissing style: JsonField<Style> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(
        prompt,
        background,
        model,
        moderation,
        n,
        outputCompression,
        outputFormat,
        partialImages,
        quality,
        responseFormat,
        size,
        stream,
        style,
        user,
        mutableMapOf(),
    )

    /**
     * A text description of the desired image(s). The maximum length is 32000 characters for
     * `gpt-image-1`, 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prompt(): String = prompt.getRequired("prompt")

    /**
     * Allows to set transparency for the background of the generated image(s). This parameter is
     * only supported for `gpt-image-1`. Must be one of `transparent`, `opaque` or `auto` (default
     * value). When `auto` is used, the model will automatically determine the best background for
     * the image.
     *
     * If `transparent`, the output format needs to support transparency, so it should be set to
     * either `png` (default value) or `webp`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun background(): Background? = background.getNullable("background")

    /**
     * The model to use for image generation. One of `openai/dall-e-2`, `openai/dall-e-3`, or
     * `openai/gpt-image-1`. Defaults to `openai/dall-e-2` unless a parameter specific to
     * `gpt-image-1` is used.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): String? = model.getNullable("model")

    /**
     * Control the content-moderation level for images generated by `gpt-image-1`. Must be either
     * `low` for less restrictive filtering or `auto` (default value).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun moderation(): Moderation? = moderation.getNullable("moderation")

    /**
     * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is
     * supported.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun n(): Long? = n.getNullable("n")

    /**
     * The compression level (0-100%) for the generated images. This parameter is only supported for
     * `gpt-image-1` with the `webp` or `jpeg` output formats, and defaults to 100.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputCompression(): Long? = outputCompression.getNullable("output_compression")

    /**
     * The format in which the generated images are returned. This parameter is only supported for
     * `gpt-image-1`. Must be one of `png`, `jpeg`, or `webp`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputFormat(): OutputFormat? = outputFormat.getNullable("output_format")

    /**
     * The number of partial images to generate. This parameter is used for streaming responses that
     * return partial images. Value must be between 0 and 3. When set to 0, the response will be a
     * single image sent in one streaming event.
     *
     * Note that the final image may be sent before the full number of partial images are generated
     * if the full image is generated more quickly.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partialImages(): Long? = partialImages.getNullable("partial_images")

    /**
     * The quality of the image that will be generated.
     * - `auto` (default value) will automatically select the best quality for the given model.
     * - `high`, `medium` and `low` are supported for `gpt-image-1`.
     * - `hd` and `standard` are supported for `dall-e-3`.
     * - `standard` is the only option for `dall-e-2`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quality(): Quality? = quality.getNullable("quality")

    /**
     * The format in which generated images with `dall-e-2` and `dall-e-3` are returned. Must be one
     * of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been
     * generated. This parameter isn't supported for `gpt-image-1` which will always return
     * base64-encoded images.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

    /**
     * The size of the generated images. Must be one of `1024x1024`, `1536x1024` (landscape),
     * `1024x1536` (portrait), or `auto` (default value) for `gpt-image-1`, one of `256x256`,
     * `512x512`, or `1024x1024` for `dall-e-2`, and one of `1024x1024`, `1792x1024`, or `1024x1792`
     * for `dall-e-3`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun size(): Size? = size.getNullable("size")

    /**
     * Generate the image in streaming mode. Defaults to `false`. See the
     * [Image generation guide](https://platform.openai.com/docs/guides/image-generation) for more
     * information. This parameter is only supported for `gpt-image-1`.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Boolean? = stream.getNullable("stream")

    /**
     * The style of the generated images. This parameter is only supported for `dall-e-3`. Must be
     * one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and
     * dramatic images. Natural causes the model to produce more natural, less hyper-real looking
     * images.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun style(): Style? = style.getNullable("style")

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect
     * abuse.
     * [Learn more](https://platform.openai.com/docs/guides/safety-best-practices#end-user-ids).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): String? = user.getNullable("user")

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

    /**
     * Returns the raw JSON value of [background].
     *
     * Unlike [background], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("background")
    @ExcludeMissing
    fun _background(): JsonField<Background> = background

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [moderation].
     *
     * Unlike [moderation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("moderation")
    @ExcludeMissing
    fun _moderation(): JsonField<Moderation> = moderation

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Long> = n

    /**
     * Returns the raw JSON value of [outputCompression].
     *
     * Unlike [outputCompression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("output_compression")
    @ExcludeMissing
    fun _outputCompression(): JsonField<Long> = outputCompression

    /**
     * Returns the raw JSON value of [outputFormat].
     *
     * Unlike [outputFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_format")
    @ExcludeMissing
    fun _outputFormat(): JsonField<OutputFormat> = outputFormat

    /**
     * Returns the raw JSON value of [partialImages].
     *
     * Unlike [partialImages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("partial_images")
    @ExcludeMissing
    fun _partialImages(): JsonField<Long> = partialImages

    /**
     * Returns the raw JSON value of [quality].
     *
     * Unlike [quality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quality") @ExcludeMissing fun _quality(): JsonField<Quality> = quality

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_format")
    @ExcludeMissing
    fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Size> = size

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

    /**
     * Returns the raw JSON value of [style].
     *
     * Unlike [style], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("style") @ExcludeMissing fun _style(): JsonField<Style> = style

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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
         * Returns a mutable builder for constructing an instance of [CreateImageRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .prompt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreateImageRequest]. */
    class Builder internal constructor() {

        private var prompt: JsonField<String>? = null
        private var background: JsonField<Background> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var moderation: JsonField<Moderation> = JsonMissing.of()
        private var n: JsonField<Long> = JsonMissing.of()
        private var outputCompression: JsonField<Long> = JsonMissing.of()
        private var outputFormat: JsonField<OutputFormat> = JsonMissing.of()
        private var partialImages: JsonField<Long> = JsonMissing.of()
        private var quality: JsonField<Quality> = JsonMissing.of()
        private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
        private var size: JsonField<Size> = JsonMissing.of()
        private var stream: JsonField<Boolean> = JsonMissing.of()
        private var style: JsonField<Style> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(createImageRequest: CreateImageRequest) = apply {
            prompt = createImageRequest.prompt
            background = createImageRequest.background
            model = createImageRequest.model
            moderation = createImageRequest.moderation
            n = createImageRequest.n
            outputCompression = createImageRequest.outputCompression
            outputFormat = createImageRequest.outputFormat
            partialImages = createImageRequest.partialImages
            quality = createImageRequest.quality
            responseFormat = createImageRequest.responseFormat
            size = createImageRequest.size
            stream = createImageRequest.stream
            style = createImageRequest.style
            user = createImageRequest.user
            additionalProperties = createImageRequest.additionalProperties.toMutableMap()
        }

        /**
         * A text description of the desired image(s). The maximum length is 32000 characters for
         * `gpt-image-1`, 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
         */
        fun prompt(prompt: String) = prompt(JsonField.of(prompt))

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

        /**
         * Allows to set transparency for the background of the generated image(s). This parameter
         * is only supported for `gpt-image-1`. Must be one of `transparent`, `opaque` or `auto`
         * (default value). When `auto` is used, the model will automatically determine the best
         * background for the image.
         *
         * If `transparent`, the output format needs to support transparency, so it should be set to
         * either `png` (default value) or `webp`.
         */
        fun background(background: Background?) = background(JsonField.ofNullable(background))

        /**
         * Sets [Builder.background] to an arbitrary JSON value.
         *
         * You should usually call [Builder.background] with a well-typed [Background] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun background(background: JsonField<Background>) = apply { this.background = background }

        /**
         * The model to use for image generation. One of `openai/dall-e-2`, `openai/dall-e-3`, or
         * `openai/gpt-image-1`. Defaults to `openai/dall-e-2` unless a parameter specific to
         * `gpt-image-1` is used.
         */
        fun model(model: String?) = model(JsonField.ofNullable(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /**
         * Control the content-moderation level for images generated by `gpt-image-1`. Must be
         * either `low` for less restrictive filtering or `auto` (default value).
         */
        fun moderation(moderation: Moderation?) = moderation(JsonField.ofNullable(moderation))

        /**
         * Sets [Builder.moderation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.moderation] with a well-typed [Moderation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun moderation(moderation: JsonField<Moderation>) = apply { this.moderation = moderation }

        /**
         * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is
         * supported.
         */
        fun n(n: Long?) = n(JsonField.ofNullable(n))

        /**
         * Alias for [Builder.n].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun n(n: Long) = n(n as Long?)

        /**
         * Sets [Builder.n] to an arbitrary JSON value.
         *
         * You should usually call [Builder.n] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: JsonField<Long>) = apply { this.n = n }

        /**
         * The compression level (0-100%) for the generated images. This parameter is only supported
         * for `gpt-image-1` with the `webp` or `jpeg` output formats, and defaults to 100.
         */
        fun outputCompression(outputCompression: Long?) =
            outputCompression(JsonField.ofNullable(outputCompression))

        /**
         * Alias for [Builder.outputCompression].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun outputCompression(outputCompression: Long) =
            outputCompression(outputCompression as Long?)

        /**
         * Sets [Builder.outputCompression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputCompression] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputCompression(outputCompression: JsonField<Long>) = apply {
            this.outputCompression = outputCompression
        }

        /**
         * The format in which the generated images are returned. This parameter is only supported
         * for `gpt-image-1`. Must be one of `png`, `jpeg`, or `webp`.
         */
        fun outputFormat(outputFormat: OutputFormat?) =
            outputFormat(JsonField.ofNullable(outputFormat))

        /**
         * Sets [Builder.outputFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputFormat] with a well-typed [OutputFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputFormat(outputFormat: JsonField<OutputFormat>) = apply {
            this.outputFormat = outputFormat
        }

        /**
         * The number of partial images to generate. This parameter is used for streaming responses
         * that return partial images. Value must be between 0 and 3. When set to 0, the response
         * will be a single image sent in one streaming event.
         *
         * Note that the final image may be sent before the full number of partial images are
         * generated if the full image is generated more quickly.
         */
        fun partialImages(partialImages: Long?) = partialImages(JsonField.ofNullable(partialImages))

        /**
         * Alias for [Builder.partialImages].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun partialImages(partialImages: Long) = partialImages(partialImages as Long?)

        /**
         * Sets [Builder.partialImages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partialImages] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun partialImages(partialImages: JsonField<Long>) = apply {
            this.partialImages = partialImages
        }

        /**
         * The quality of the image that will be generated.
         * - `auto` (default value) will automatically select the best quality for the given model.
         * - `high`, `medium` and `low` are supported for `gpt-image-1`.
         * - `hd` and `standard` are supported for `dall-e-3`.
         * - `standard` is the only option for `dall-e-2`.
         */
        fun quality(quality: Quality?) = quality(JsonField.ofNullable(quality))

        /**
         * Sets [Builder.quality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quality] with a well-typed [Quality] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quality(quality: JsonField<Quality>) = apply { this.quality = quality }

        /**
         * The format in which generated images with `dall-e-2` and `dall-e-3` are returned. Must be
         * one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been
         * generated. This parameter isn't supported for `gpt-image-1` which will always return
         * base64-encoded images.
         */
        fun responseFormat(responseFormat: ResponseFormat?) =
            responseFormat(JsonField.ofNullable(responseFormat))

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            this.responseFormat = responseFormat
        }

        /**
         * The size of the generated images. Must be one of `1024x1024`, `1536x1024` (landscape),
         * `1024x1536` (portrait), or `auto` (default value) for `gpt-image-1`, one of `256x256`,
         * `512x512`, or `1024x1024` for `dall-e-2`, and one of `1024x1024`, `1792x1024`, or
         * `1024x1792` for `dall-e-3`.
         */
        fun size(size: Size?) = size(JsonField.ofNullable(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Size] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Size>) = apply { this.size = size }

        /**
         * Generate the image in streaming mode. Defaults to `false`. See the
         * [Image generation guide](https://platform.openai.com/docs/guides/image-generation) for
         * more information. This parameter is only supported for `gpt-image-1`.
         */
        fun stream(stream: Boolean?) = stream(JsonField.ofNullable(stream))

        /**
         * Alias for [Builder.stream].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stream(stream: Boolean) = stream(stream as Boolean?)

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

        /**
         * The style of the generated images. This parameter is only supported for `dall-e-3`. Must
         * be one of `vivid` or `natural`. Vivid causes the model to lean towards generating
         * hyper-real and dramatic images. Natural causes the model to produce more natural, less
         * hyper-real looking images.
         */
        fun style(style: Style?) = style(JsonField.ofNullable(style))

        /**
         * Sets [Builder.style] to an arbitrary JSON value.
         *
         * You should usually call [Builder.style] with a well-typed [Style] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun style(style: JsonField<Style>) = apply { this.style = style }

        /**
         * A unique identifier representing your end-user, which can help OpenAI to monitor and
         * detect abuse.
         * [Learn more](https://platform.openai.com/docs/guides/safety-best-practices#end-user-ids).
         */
        fun user(user: String?) = user(JsonField.ofNullable(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

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
         * Returns an immutable instance of [CreateImageRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .prompt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateImageRequest =
            CreateImageRequest(
                checkRequired("prompt", prompt),
                background,
                model,
                moderation,
                n,
                outputCompression,
                outputFormat,
                partialImages,
                quality,
                responseFormat,
                size,
                stream,
                style,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DedalusInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CreateImageRequest = apply {
        if (validated) {
            return@apply
        }

        prompt()
        background()?.validate()
        model()
        moderation()?.validate()
        n()
        outputCompression()
        outputFormat()?.validate()
        partialImages()
        quality()?.validate()
        responseFormat()?.validate()
        size()?.validate()
        stream()
        style()?.validate()
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

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (prompt.asKnown() == null) 0 else 1) +
            (background.asKnown()?.validity() ?: 0) +
            (if (model.asKnown() == null) 0 else 1) +
            (moderation.asKnown()?.validity() ?: 0) +
            (if (n.asKnown() == null) 0 else 1) +
            (if (outputCompression.asKnown() == null) 0 else 1) +
            (outputFormat.asKnown()?.validity() ?: 0) +
            (if (partialImages.asKnown() == null) 0 else 1) +
            (quality.asKnown()?.validity() ?: 0) +
            (responseFormat.asKnown()?.validity() ?: 0) +
            (size.asKnown()?.validity() ?: 0) +
            (if (stream.asKnown() == null) 0 else 1) +
            (style.asKnown()?.validity() ?: 0) +
            (if (user.asKnown() == null) 0 else 1)

    /**
     * Allows to set transparency for the background of the generated image(s). This parameter is
     * only supported for `gpt-image-1`. Must be one of `transparent`, `opaque` or `auto` (default
     * value). When `auto` is used, the model will automatically determine the best background for
     * the image.
     *
     * If `transparent`, the output format needs to support transparency, so it should be set to
     * either `png` (default value) or `webp`.
     */
    class Background @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val TRANSPARENT = of("transparent")

            val OPAQUE = of("opaque")

            val AUTO = of("auto")

            fun of(value: String) = Background(JsonField.of(value))
        }

        /** An enum containing [Background]'s known values. */
        enum class Known {
            TRANSPARENT,
            OPAQUE,
            AUTO,
        }

        /**
         * An enum containing [Background]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Background] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRANSPARENT,
            OPAQUE,
            AUTO,
            /**
             * An enum member indicating that [Background] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRANSPARENT -> Value.TRANSPARENT
                OPAQUE -> Value.OPAQUE
                AUTO -> Value.AUTO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TRANSPARENT -> Known.TRANSPARENT
                OPAQUE -> Known.OPAQUE
                AUTO -> Known.AUTO
                else -> throw DedalusInvalidDataException("Unknown Background: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

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
        fun validate(): Background = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Background && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Control the content-moderation level for images generated by `gpt-image-1`. Must be either
     * `low` for less restrictive filtering or `auto` (default value).
     */
    class Moderation @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val LOW = of("low")

            val AUTO = of("auto")

            fun of(value: String) = Moderation(JsonField.of(value))
        }

        /** An enum containing [Moderation]'s known values. */
        enum class Known {
            LOW,
            AUTO,
        }

        /**
         * An enum containing [Moderation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Moderation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            AUTO,
            /**
             * An enum member indicating that [Moderation] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LOW -> Value.LOW
                AUTO -> Value.AUTO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LOW -> Known.LOW
                AUTO -> Known.AUTO
                else -> throw DedalusInvalidDataException("Unknown Moderation: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

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
        fun validate(): Moderation = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Moderation && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The format in which the generated images are returned. This parameter is only supported for
     * `gpt-image-1`. Must be one of `png`, `jpeg`, or `webp`.
     */
    class OutputFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PNG = of("png")

            val JPEG = of("jpeg")

            val WEBP = of("webp")

            fun of(value: String) = OutputFormat(JsonField.of(value))
        }

        /** An enum containing [OutputFormat]'s known values. */
        enum class Known {
            PNG,
            JPEG,
            WEBP,
        }

        /**
         * An enum containing [OutputFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OutputFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PNG,
            JPEG,
            WEBP,
            /**
             * An enum member indicating that [OutputFormat] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PNG -> Value.PNG
                JPEG -> Value.JPEG
                WEBP -> Value.WEBP
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PNG -> Known.PNG
                JPEG -> Known.JPEG
                WEBP -> Known.WEBP
                else -> throw DedalusInvalidDataException("Unknown OutputFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

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
        fun validate(): OutputFormat = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OutputFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The quality of the image that will be generated.
     * - `auto` (default value) will automatically select the best quality for the given model.
     * - `high`, `medium` and `low` are supported for `gpt-image-1`.
     * - `hd` and `standard` are supported for `dall-e-3`.
     * - `standard` is the only option for `dall-e-2`.
     */
    class Quality @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AUTO = of("auto")

            val HIGH = of("high")

            val MEDIUM = of("medium")

            val LOW = of("low")

            val HD = of("hd")

            val STANDARD = of("standard")

            fun of(value: String) = Quality(JsonField.of(value))
        }

        /** An enum containing [Quality]'s known values. */
        enum class Known {
            AUTO,
            HIGH,
            MEDIUM,
            LOW,
            HD,
            STANDARD,
        }

        /**
         * An enum containing [Quality]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Quality] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            HIGH,
            MEDIUM,
            LOW,
            HD,
            STANDARD,
            /** An enum member indicating that [Quality] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AUTO -> Value.AUTO
                HIGH -> Value.HIGH
                MEDIUM -> Value.MEDIUM
                LOW -> Value.LOW
                HD -> Value.HD
                STANDARD -> Value.STANDARD
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AUTO -> Known.AUTO
                HIGH -> Known.HIGH
                MEDIUM -> Known.MEDIUM
                LOW -> Known.LOW
                HD -> Known.HD
                STANDARD -> Known.STANDARD
                else -> throw DedalusInvalidDataException("Unknown Quality: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

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
        fun validate(): Quality = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Quality && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The format in which generated images with `dall-e-2` and `dall-e-3` are returned. Must be one
     * of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been
     * generated. This parameter isn't supported for `gpt-image-1` which will always return
     * base64-encoded images.
     */
    class ResponseFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val URL = of("url")

            val B64_JSON = of("b64_json")

            fun of(value: String) = ResponseFormat(JsonField.of(value))
        }

        /** An enum containing [ResponseFormat]'s known values. */
        enum class Known {
            URL,
            B64_JSON,
        }

        /**
         * An enum containing [ResponseFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResponseFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            URL,
            B64_JSON,
            /**
             * An enum member indicating that [ResponseFormat] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                URL -> Value.URL
                B64_JSON -> Value.B64_JSON
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                URL -> Known.URL
                B64_JSON -> Known.B64_JSON
                else -> throw DedalusInvalidDataException("Unknown ResponseFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

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
        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResponseFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The size of the generated images. Must be one of `1024x1024`, `1536x1024` (landscape),
     * `1024x1536` (portrait), or `auto` (default value) for `gpt-image-1`, one of `256x256`,
     * `512x512`, or `1024x1024` for `dall-e-2`, and one of `1024x1024`, `1792x1024`, or `1024x1792`
     * for `dall-e-3`.
     */
    class Size @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val _256X256 = of("256x256")

            val _512X512 = of("512x512")

            val _1024X1024 = of("1024x1024")

            val _1536X1024 = of("1536x1024")

            val _1024X1536 = of("1024x1536")

            val _1792X1024 = of("1792x1024")

            val _1024X1792 = of("1024x1792")

            val AUTO = of("auto")

            fun of(value: String) = Size(JsonField.of(value))
        }

        /** An enum containing [Size]'s known values. */
        enum class Known {
            _256X256,
            _512X512,
            _1024X1024,
            _1536X1024,
            _1024X1536,
            _1792X1024,
            _1024X1792,
            AUTO,
        }

        /**
         * An enum containing [Size]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Size] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _256X256,
            _512X512,
            _1024X1024,
            _1536X1024,
            _1024X1536,
            _1792X1024,
            _1024X1792,
            AUTO,
            /** An enum member indicating that [Size] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _256X256 -> Value._256X256
                _512X512 -> Value._512X512
                _1024X1024 -> Value._1024X1024
                _1536X1024 -> Value._1536X1024
                _1024X1536 -> Value._1024X1536
                _1792X1024 -> Value._1792X1024
                _1024X1792 -> Value._1024X1792
                AUTO -> Value.AUTO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                _256X256 -> Known._256X256
                _512X512 -> Known._512X512
                _1024X1024 -> Known._1024X1024
                _1536X1024 -> Known._1536X1024
                _1024X1536 -> Known._1024X1536
                _1792X1024 -> Known._1792X1024
                _1024X1792 -> Known._1024X1792
                AUTO -> Known.AUTO
                else -> throw DedalusInvalidDataException("Unknown Size: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

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
        fun validate(): Size = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Size && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The style of the generated images. This parameter is only supported for `dall-e-3`. Must be
     * one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and
     * dramatic images. Natural causes the model to produce more natural, less hyper-real looking
     * images.
     */
    class Style @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val VIVID = of("vivid")

            val NATURAL = of("natural")

            fun of(value: String) = Style(JsonField.of(value))
        }

        /** An enum containing [Style]'s known values. */
        enum class Known {
            VIVID,
            NATURAL,
        }

        /**
         * An enum containing [Style]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Style] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VIVID,
            NATURAL,
            /** An enum member indicating that [Style] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                VIVID -> Value.VIVID
                NATURAL -> Value.NATURAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                VIVID -> Known.VIVID
                NATURAL -> Known.NATURAL
                else -> throw DedalusInvalidDataException("Unknown Style: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DedalusInvalidDataException("Value is not a String")

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
        fun validate(): Style = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DedalusInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Style && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateImageRequest &&
            prompt == other.prompt &&
            background == other.background &&
            model == other.model &&
            moderation == other.moderation &&
            n == other.n &&
            outputCompression == other.outputCompression &&
            outputFormat == other.outputFormat &&
            partialImages == other.partialImages &&
            quality == other.quality &&
            responseFormat == other.responseFormat &&
            size == other.size &&
            stream == other.stream &&
            style == other.style &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            prompt,
            background,
            model,
            moderation,
            n,
            outputCompression,
            outputFormat,
            partialImages,
            quality,
            responseFormat,
            size,
            stream,
            style,
            user,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateImageRequest{prompt=$prompt, background=$background, model=$model, moderation=$moderation, n=$n, outputCompression=$outputCompression, outputFormat=$outputFormat, partialImages=$partialImages, quality=$quality, responseFormat=$responseFormat, size=$size, stream=$stream, style=$style, user=$user, additionalProperties=$additionalProperties}"
}
