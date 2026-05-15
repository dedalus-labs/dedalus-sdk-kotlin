// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.images

import com.dedalus_sdk.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageCreateVariationParamsTest {

    @Test
    fun create() {
        ImageCreateVariationParams.builder()
            .image("Example data".byteInputStream())
            .model("model")
            .n(0L)
            .responseFormat("response_format")
            .size("size")
            .user("user")
            .build()
    }

    @Test
    fun body() {
        val params =
            ImageCreateVariationParams.builder()
                .image("Example data".byteInputStream())
                .model("model")
                .n(0L)
                .responseFormat("response_format")
                .size("size")
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "image" to MultipartField.of("Example data".byteInputStream()),
                        "model" to MultipartField.of("model"),
                        "n" to MultipartField.of(0L),
                        "response_format" to MultipartField.of("response_format"),
                        "size" to MultipartField.of("size"),
                        "user" to MultipartField.of("user"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ImageCreateVariationParams.builder().image("Example data".byteInputStream()).build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf("image" to MultipartField.of("Example data".byteInputStream())).mapValues {
                    (_, field) ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }
}
