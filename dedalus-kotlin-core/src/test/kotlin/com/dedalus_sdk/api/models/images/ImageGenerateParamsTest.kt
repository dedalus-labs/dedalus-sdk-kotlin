// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.images

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageGenerateParamsTest {

    @Test
    fun create() {
        ImageGenerateParams.builder()
            .createImageRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ImageGenerateParams.builder()
                .createImageRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ImageGenerateParams.builder()
                .createImageRequest(
                    CreateImageRequest.builder().prompt("A white siamese cat").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(CreateImageRequest.builder().prompt("A white siamese cat").build())
    }
}
