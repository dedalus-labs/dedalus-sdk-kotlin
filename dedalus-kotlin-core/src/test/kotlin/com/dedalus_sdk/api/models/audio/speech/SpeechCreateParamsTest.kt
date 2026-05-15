// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.audio.speech

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeechCreateParamsTest {

    @Test
    fun create() {
        SpeechCreateParams.builder()
            .input("input")
            .model(SpeechCreateParams.Model.TTS_1)
            .voice(SpeechCreateParams.Voice.UnionMember1.ALLOY)
            .instructions("instructions")
            .responseFormat(SpeechCreateParams.ResponseFormat.MP3)
            .speed(0.25)
            .streamFormat(SpeechCreateParams.StreamFormat.SSE)
            .build()
    }

    @Test
    fun body() {
        val params =
            SpeechCreateParams.builder()
                .input("input")
                .model(SpeechCreateParams.Model.TTS_1)
                .voice(SpeechCreateParams.Voice.UnionMember1.ALLOY)
                .instructions("instructions")
                .responseFormat(SpeechCreateParams.ResponseFormat.MP3)
                .speed(0.25)
                .streamFormat(SpeechCreateParams.StreamFormat.SSE)
                .build()

        val body = params._body()

        assertThat(body.input()).isEqualTo("input")
        assertThat(body.model()).isEqualTo(SpeechCreateParams.Model.TTS_1)
        assertThat(body.voice())
            .isEqualTo(
                SpeechCreateParams.Voice.ofUnionMember1(SpeechCreateParams.Voice.UnionMember1.ALLOY)
            )
        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.responseFormat()).isEqualTo(SpeechCreateParams.ResponseFormat.MP3)
        assertThat(body.speed()).isEqualTo(0.25)
        assertThat(body.streamFormat()).isEqualTo(SpeechCreateParams.StreamFormat.SSE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SpeechCreateParams.builder()
                .input("input")
                .model(SpeechCreateParams.Model.TTS_1)
                .voice(SpeechCreateParams.Voice.UnionMember1.ALLOY)
                .build()

        val body = params._body()

        assertThat(body.input()).isEqualTo("input")
        assertThat(body.model()).isEqualTo(SpeechCreateParams.Model.TTS_1)
        assertThat(body.voice())
            .isEqualTo(
                SpeechCreateParams.Voice.ofUnionMember1(SpeechCreateParams.Voice.UnionMember1.ALLOY)
            )
    }
}
