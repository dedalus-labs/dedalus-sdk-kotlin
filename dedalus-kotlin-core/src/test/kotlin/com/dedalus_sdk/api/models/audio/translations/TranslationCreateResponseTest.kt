// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.audio.translations

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TranslationCreateResponseTest {

    @Test
    fun ofCreateTranslationResponseVerboseJson() {
        val createTranslationResponseVerboseJson =
            TranslationCreateResponse.CreateTranslationResponseVerboseJson.builder()
                .duration(0.0)
                .language("language")
                .text("text")
                .addSegment(
                    TranslationCreateResponse.CreateTranslationResponseVerboseJson.Segment.builder()
                        .id(0L)
                        .avgLogprob(0.0)
                        .compressionRatio(0.0)
                        .end(0.0)
                        .noSpeechProb(0.0)
                        .seek(0L)
                        .start(0.0)
                        .temperature(0.0)
                        .text("text")
                        .addToken(0L)
                        .build()
                )
                .build()

        val translationCreateResponse =
            TranslationCreateResponse.ofCreateTranslationResponseVerboseJson(
                createTranslationResponseVerboseJson
            )

        assertThat(translationCreateResponse.createTranslationResponseVerboseJson())
            .isEqualTo(createTranslationResponseVerboseJson)
        assertThat(translationCreateResponse.createTranslationResponseJson()).isNull()
    }

    @Test
    fun ofCreateTranslationResponseVerboseJsonRoundtrip() {
        val jsonMapper = jsonMapper()
        val translationCreateResponse =
            TranslationCreateResponse.ofCreateTranslationResponseVerboseJson(
                TranslationCreateResponse.CreateTranslationResponseVerboseJson.builder()
                    .duration(0.0)
                    .language("language")
                    .text("text")
                    .addSegment(
                        TranslationCreateResponse.CreateTranslationResponseVerboseJson.Segment
                            .builder()
                            .id(0L)
                            .avgLogprob(0.0)
                            .compressionRatio(0.0)
                            .end(0.0)
                            .noSpeechProb(0.0)
                            .seek(0L)
                            .start(0.0)
                            .temperature(0.0)
                            .text("text")
                            .addToken(0L)
                            .build()
                    )
                    .build()
            )

        val roundtrippedTranslationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(translationCreateResponse),
                jacksonTypeRef<TranslationCreateResponse>(),
            )

        assertThat(roundtrippedTranslationCreateResponse).isEqualTo(translationCreateResponse)
    }

    @Test
    fun ofCreateTranslationResponseJson() {
        val createTranslationResponseJson =
            TranslationCreateResponse.CreateTranslationResponseJson.builder().text("text").build()

        val translationCreateResponse =
            TranslationCreateResponse.ofCreateTranslationResponseJson(createTranslationResponseJson)

        assertThat(translationCreateResponse.createTranslationResponseVerboseJson()).isNull()
        assertThat(translationCreateResponse.createTranslationResponseJson())
            .isEqualTo(createTranslationResponseJson)
    }

    @Test
    fun ofCreateTranslationResponseJsonRoundtrip() {
        val jsonMapper = jsonMapper()
        val translationCreateResponse =
            TranslationCreateResponse.ofCreateTranslationResponseJson(
                TranslationCreateResponse.CreateTranslationResponseJson.builder()
                    .text("text")
                    .build()
            )

        val roundtrippedTranslationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(translationCreateResponse),
                jacksonTypeRef<TranslationCreateResponse>(),
            )

        assertThat(roundtrippedTranslationCreateResponse).isEqualTo(translationCreateResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val translationCreateResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TranslationCreateResponse>())

        val e = assertThrows<DedalusInvalidDataException> { translationCreateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
