// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.services.blocking

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.models.images.CreateImageRequest
import com.dedalus_sdk.api.models.images.ImageCreateVariationParams
import com.dedalus_sdk.api.models.images.ImageEditParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ImageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createVariation() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val imageService = client.images()

        val imagesResponse =
            imageService.createVariation(
                ImageCreateVariationParams.builder()
                    .image("Example data".byteInputStream())
                    .model("model")
                    .n(0L)
                    .responseFormat("response_format")
                    .size("size")
                    .user("user")
                    .build()
            )

        imagesResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun edit() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val imageService = client.images()

        val imagesResponse =
            imageService.edit(
                ImageEditParams.builder()
                    .image("Example data".byteInputStream())
                    .prompt("prompt")
                    .mask("Example data".byteInputStream())
                    .model("model")
                    .n(0L)
                    .responseFormat("response_format")
                    .size("size")
                    .user("user")
                    .build()
            )

        imagesResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generate() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()
        val imageService = client.images()

        val imagesResponse =
            imageService.generate(
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

        imagesResponse.validate()
    }
}
