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
import com.dedalus_sdk.api.core.http.parseable
import com.dedalus_sdk.api.core.prepare
import com.dedalus_sdk.api.models.ocr.OcrProcessParams
import com.dedalus_sdk.api.models.ocr.OcrResponse

class OcrServiceImpl internal constructor(private val clientOptions: ClientOptions) : OcrService {

    private val withRawResponse: OcrService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OcrService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OcrService =
        OcrServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun process(params: OcrProcessParams, requestOptions: RequestOptions): OcrResponse =
        // post /v1/ocr
        withRawResponse().process(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OcrService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OcrService.WithRawResponse =
            OcrServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val processHandler: Handler<OcrResponse> =
            jsonHandler<OcrResponse>(clientOptions.jsonMapper)

        override fun process(
            params: OcrProcessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OcrResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ocr")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { processHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
