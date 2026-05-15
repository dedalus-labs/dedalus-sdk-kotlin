// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioTest {

    @Test
    fun create() {
        val audio = Audio.builder().id("id").build()

        assertThat(audio.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audio = Audio.builder().id("id").build()

        val roundtrippedAudio =
            jsonMapper.readValue(jsonMapper.writeValueAsString(audio), jacksonTypeRef<Audio>())

        assertThat(roundtrippedAudio).isEqualTo(audio)
    }
}
