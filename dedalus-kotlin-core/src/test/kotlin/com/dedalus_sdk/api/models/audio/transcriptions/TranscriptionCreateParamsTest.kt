// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.audio.transcriptions

import com.dedalus_sdk.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionCreateParamsTest {

    @Test
    fun create() {
        TranscriptionCreateParams.builder()
            .file("Example data".byteInputStream())
            .model("model")
            .language("language")
            .prompt("prompt")
            .responseFormat("response_format")
            .temperature(0.0)
            .build()
    }

    @Test
    fun body() {
        val params =
            TranscriptionCreateParams.builder()
                .file("Example data".byteInputStream())
                .model("model")
                .language("language")
                .prompt("prompt")
                .responseFormat("response_format")
                .temperature(0.0)
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
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "model" to MultipartField.of("model"),
                        "language" to MultipartField.of("language"),
                        "prompt" to MultipartField.of("prompt"),
                        "response_format" to MultipartField.of("response_format"),
                        "temperature" to MultipartField.of(0.0),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TranscriptionCreateParams.builder()
                .file("Example data".byteInputStream())
                .model("model")
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
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "model" to MultipartField.of("model"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
