// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.images

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateImageRequestTest {

    @Test
    fun create() {
        val createImageRequest =
            CreateImageRequest.builder()
                .prompt("A white siamese cat")
                .background(CreateImageRequest.Background.TRANSPARENT)
                .model("openai/dall-e-3")
                .moderation(CreateImageRequest.Moderation.AUTO)
                .n(1L)
                .outputCompression(85L)
                .outputFormat(CreateImageRequest.OutputFormat.PNG)
                .partialImages(0L)
                .quality(CreateImageRequest.Quality.STANDARD)
                .responseFormat(CreateImageRequest.ResponseFormat.URL)
                .size(CreateImageRequest.Size._1024X1024)
                .stream(true)
                .style(CreateImageRequest.Style.VIVID)
                .user("user")
                .build()

        assertThat(createImageRequest.prompt()).isEqualTo("A white siamese cat")
        assertThat(createImageRequest.background())
            .isEqualTo(CreateImageRequest.Background.TRANSPARENT)
        assertThat(createImageRequest.model()).isEqualTo("openai/dall-e-3")
        assertThat(createImageRequest.moderation()).isEqualTo(CreateImageRequest.Moderation.AUTO)
        assertThat(createImageRequest.n()).isEqualTo(1L)
        assertThat(createImageRequest.outputCompression()).isEqualTo(85L)
        assertThat(createImageRequest.outputFormat()).isEqualTo(CreateImageRequest.OutputFormat.PNG)
        assertThat(createImageRequest.partialImages()).isEqualTo(0L)
        assertThat(createImageRequest.quality()).isEqualTo(CreateImageRequest.Quality.STANDARD)
        assertThat(createImageRequest.responseFormat())
            .isEqualTo(CreateImageRequest.ResponseFormat.URL)
        assertThat(createImageRequest.size()).isEqualTo(CreateImageRequest.Size._1024X1024)
        assertThat(createImageRequest.stream()).isEqualTo(true)
        assertThat(createImageRequest.style()).isEqualTo(CreateImageRequest.Style.VIVID)
        assertThat(createImageRequest.user()).isEqualTo("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createImageRequest =
            CreateImageRequest.builder()
                .prompt("A white siamese cat")
                .background(CreateImageRequest.Background.TRANSPARENT)
                .model("openai/dall-e-3")
                .moderation(CreateImageRequest.Moderation.AUTO)
                .n(1L)
                .outputCompression(85L)
                .outputFormat(CreateImageRequest.OutputFormat.PNG)
                .partialImages(0L)
                .quality(CreateImageRequest.Quality.STANDARD)
                .responseFormat(CreateImageRequest.ResponseFormat.URL)
                .size(CreateImageRequest.Size._1024X1024)
                .stream(true)
                .style(CreateImageRequest.Style.VIVID)
                .user("user")
                .build()

        val roundtrippedCreateImageRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createImageRequest),
                jacksonTypeRef<CreateImageRequest>(),
            )

        assertThat(roundtrippedCreateImageRequest).isEqualTo(createImageRequest)
    }
}
