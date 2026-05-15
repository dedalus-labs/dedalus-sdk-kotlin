// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.images

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageTest {

    @Test
    fun create() {
        val image =
            Image.builder().b64Json("b64_json").revisedPrompt("revised_prompt").url("url").build()

        assertThat(image.b64Json()).isEqualTo("b64_json")
        assertThat(image.revisedPrompt()).isEqualTo("revised_prompt")
        assertThat(image.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val image =
            Image.builder().b64Json("b64_json").revisedPrompt("revised_prompt").url("url").build()

        val roundtrippedImage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(image), jacksonTypeRef<Image>())

        assertThat(roundtrippedImage).isEqualTo(image)
    }
}
