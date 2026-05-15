// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.core.ClientOptions
import com.dedalus_sdk.api.core.RequestOptions
import com.dedalus_sdk.api.core.handlers.errorBodyHandler
import com.dedalus_sdk.api.core.handlers.errorHandler
import com.dedalus_sdk.api.core.handlers.jsonHandler
import com.dedalus_sdk.api.core.http.HttpMethod
import com.dedalus_sdk.api.core.http.HttpRequest
import com.dedalus_sdk.api.core.http.HttpResponse
import com.dedalus_sdk.api.core.http.HttpResponse.Handler
import com.dedalus_sdk.api.core.http.HttpResponseFor
import com.dedalus_sdk.api.core.http.json
import com.dedalus_sdk.api.core.http.multipartFormData
import com.dedalus_sdk.api.core.http.parseable
import com.dedalus_sdk.api.core.prepare
import com.dedalus_sdk.api.models.images.ImageCreateVariationParams
import com.dedalus_sdk.api.models.images.ImageEditParams
import com.dedalus_sdk.api.models.images.ImageGenerateParams
import com.dedalus_sdk.api.models.images.ImagesResponse

class ImageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ImageService {

    private val withRawResponse: ImageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ImageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageService =
        ImageServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun createVariation(
        params: ImageCreateVariationParams,
        requestOptions: RequestOptions,
    ): ImagesResponse =
        // post /v1/images/variations
        withRawResponse().createVariation(params, requestOptions).parse()

    override fun edit(params: ImageEditParams, requestOptions: RequestOptions): ImagesResponse =
        // post /v1/images/edits
        withRawResponse().edit(params, requestOptions).parse()

    override fun generate(
        params: ImageGenerateParams,
        requestOptions: RequestOptions,
    ): ImagesResponse =
        // post /v1/images/generations
        withRawResponse().generate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ImageService.WithRawResponse =
            ImageServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createVariationHandler: Handler<ImagesResponse> =
            jsonHandler<ImagesResponse>(clientOptions.jsonMapper)

        override fun createVariation(
            params: ImageCreateVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImagesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "images", "variations")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val editHandler: Handler<ImagesResponse> =
            jsonHandler<ImagesResponse>(clientOptions.jsonMapper)

        override fun edit(
            params: ImageEditParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImagesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "images", "edits")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { editHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val generateHandler: Handler<ImagesResponse> =
            jsonHandler<ImagesResponse>(clientOptions.jsonMapper)

        override fun generate(
            params: ImageGenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImagesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "images", "generations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
