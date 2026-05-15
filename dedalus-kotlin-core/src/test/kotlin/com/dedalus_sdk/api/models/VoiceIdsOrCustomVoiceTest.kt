// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceIdsOrCustomVoiceTest {

    @Test
    fun create() {
        val voiceIdsOrCustomVoice = VoiceIdsOrCustomVoice.builder().id("id").build()

        assertThat(voiceIdsOrCustomVoice.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceIdsOrCustomVoice = VoiceIdsOrCustomVoice.builder().id("id").build()

        val roundtrippedVoiceIdsOrCustomVoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceIdsOrCustomVoice),
                jacksonTypeRef<VoiceIdsOrCustomVoice>(),
            )

        assertThat(roundtrippedVoiceIdsOrCustomVoice).isEqualTo(voiceIdsOrCustomVoice)
    }
}
