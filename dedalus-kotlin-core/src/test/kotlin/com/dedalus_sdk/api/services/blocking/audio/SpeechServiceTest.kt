// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking.audio

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.models.audio.speech.SpeechCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class SpeechServiceTest {

    @Test
    fun create(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val speechService = client.audio().speech()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val speech =
            speechService.create(
                SpeechCreateParams.builder()
                    .input("input")
                    .model(SpeechCreateParams.Model.TTS_1)
                    .voice(SpeechCreateParams.Voice.UnionMember1.ALLOY)
                    .instructions("instructions")
                    .responseFormat(SpeechCreateParams.ResponseFormat.MP3)
                    .speed(0.25)
                    .streamFormat(SpeechCreateParams.StreamFormat.SSE)
                    .build()
            )

        assertThat(speech.body()).hasContent("abc")
    }
}
