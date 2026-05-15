// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.models.images.CreateImageRequest
import com.dedalus_sdk.api.models.images.ImageCreateVariationParams
import com.dedalus_sdk.api.models.images.ImageEditParams
import com.dedalus_sdk.api.models.images.ImageGenerateParams
import com.dedalus_sdk.api.models.images.ImagesResponse
import com.google.errorprone.annotations.MustBeClosed

interface ImageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageService

    /**
     * Create variations of an image.
     *
     * DALL·E 2 only. Upload an image to generate variations.
     */
    fun createVariation(
        params: ImageCreateVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImagesResponse

    /**
     * Edit images using inpainting.
     *
     * Supports dall-e-2 and gpt-image-1. Upload an image and optionally a mask to indicate which
     * areas to regenerate based on the prompt.
     */
    fun edit(
        params: ImageEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImagesResponse

    /**
     * Generate images from text prompts.
     *
     * Pure image generation models only (DALL-E, GPT Image). For multimodal models like
     * gemini-2.5-flash-image, use /v1/chat/completions.
     */
    fun generate(
        params: ImageGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImagesResponse

    /** @see generate */
    fun generate(
        createImageRequest: CreateImageRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImagesResponse =
        generate(
            ImageGenerateParams.builder().createImageRequest(createImageRequest).build(),
            requestOptions,
        )

    /** A view of [ImageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/images/variations`, but is otherwise the same
         * as [ImageService.createVariation].
         */
        @MustBeClosed
        fun createVariation(
            params: ImageCreateVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImagesResponse>

        /**
         * Returns a raw HTTP response for `post /v1/images/edits`, but is otherwise the same as
         * [ImageService.edit].
         */
        @MustBeClosed
        fun edit(
            params: ImageEditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImagesResponse>

        /**
         * Returns a raw HTTP response for `post /v1/images/generations`, but is otherwise the same
         * as [ImageService.generate].
         */
        @MustBeClosed
        fun generate(
            params: ImageGenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImagesResponse>

        /** @see generate */
        @MustBeClosed
        fun generate(
            createImageRequest: CreateImageRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImagesResponse> =
            generate(
                ImageGenerateParams.builder().createImageRequest(createImageRequest).build(),
                requestOptions,
            )
    }
}
