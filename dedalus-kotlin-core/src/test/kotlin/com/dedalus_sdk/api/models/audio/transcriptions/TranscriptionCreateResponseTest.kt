// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.audio.transcriptions

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.dedalus_sdk.api.models.chat.completions.InputTokenDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TranscriptionCreateResponseTest {

    @Test
    fun ofCreateTranscriptionResponseVerboseJson() {
        val createTranscriptionResponseVerboseJson =
            TranscriptionCreateResponse.CreateTranscriptionResponseVerboseJson.builder()
                .duration(0.0)
                .language("language")
                .text("text")
                .addSegment(
                    TranscriptionCreateResponse.CreateTranscriptionResponseVerboseJson.Segment
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
                .usage(
                    TranscriptionCreateResponse.CreateTranscriptionResponseVerboseJson.Usage
                        .builder()
                        .seconds(0.0)
                        .build()
                )
                .addWord(
                    TranscriptionCreateResponse.CreateTranscriptionResponseVerboseJson.Word
                        .builder()
                        .end(0.0)
                        .start(0.0)
                        .word("word")
                        .build()
                )
                .build()

        val transcriptionCreateResponse =
            TranscriptionCreateResponse.ofCreateTranscriptionResponseVerboseJson(
                createTranscriptionResponseVerboseJson
            )

        assertThat(transcriptionCreateResponse.createTranscriptionResponseVerboseJson())
            .isEqualTo(createTranscriptionResponseVerboseJson)
        assertThat(transcriptionCreateResponse.createTranscriptionResponseJson()).isNull()
    }

    @Test
    fun ofCreateTranscriptionResponseVerboseJsonRoundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionCreateResponse =
            TranscriptionCreateResponse.ofCreateTranscriptionResponseVerboseJson(
                TranscriptionCreateResponse.CreateTranscriptionResponseVerboseJson.builder()
                    .duration(0.0)
                    .language("language")
                    .text("text")
                    .addSegment(
                        TranscriptionCreateResponse.CreateTranscriptionResponseVerboseJson.Segment
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
                    .usage(
                        TranscriptionCreateResponse.CreateTranscriptionResponseVerboseJson.Usage
                            .builder()
                            .seconds(0.0)
                            .build()
                    )
                    .addWord(
                        TranscriptionCreateResponse.CreateTranscriptionResponseVerboseJson.Word
                            .builder()
                            .end(0.0)
                            .start(0.0)
                            .word("word")
                            .build()
                    )
                    .build()
            )

        val roundtrippedTranscriptionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionCreateResponse),
                jacksonTypeRef<TranscriptionCreateResponse>(),
            )

        assertThat(roundtrippedTranscriptionCreateResponse).isEqualTo(transcriptionCreateResponse)
    }

    @Test
    fun ofCreateTranscriptionResponseJson() {
        val createTranscriptionResponseJson =
            TranscriptionCreateResponse.CreateTranscriptionResponseJson.builder()
                .text("text")
                .addLogprob(
                    TranscriptionCreateResponse.CreateTranscriptionResponseJson.Logprob.builder()
                        .token("token")
                        .addByte(0.0)
                        .logprob(0.0)
                        .build()
                )
                .usage(
                    TranscriptionCreateResponse.CreateTranscriptionResponseJson.Usage.Tokens
                        .builder()
                        .inputTokens(0L)
                        .outputTokens(0L)
                        .totalTokens(0L)
                        .inputTokenDetails(
                            InputTokenDetails.builder().audioTokens(0L).textTokens(0L).build()
                        )
                        .build()
                )
                .build()

        val transcriptionCreateResponse =
            TranscriptionCreateResponse.ofCreateTranscriptionResponseJson(
                createTranscriptionResponseJson
            )

        assertThat(transcriptionCreateResponse.createTranscriptionResponseVerboseJson()).isNull()
        assertThat(transcriptionCreateResponse.createTranscriptionResponseJson())
            .isEqualTo(createTranscriptionResponseJson)
    }

    @Test
    fun ofCreateTranscriptionResponseJsonRoundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionCreateResponse =
            TranscriptionCreateResponse.ofCreateTranscriptionResponseJson(
                TranscriptionCreateResponse.CreateTranscriptionResponseJson.builder()
                    .text("text")
                    .addLogprob(
                        TranscriptionCreateResponse.CreateTranscriptionResponseJson.Logprob
                            .builder()
                            .token("token")
                            .addByte(0.0)
                            .logprob(0.0)
                            .build()
                    )
                    .usage(
                        TranscriptionCreateResponse.CreateTranscriptionResponseJson.Usage.Tokens
                            .builder()
                            .inputTokens(0L)
                            .outputTokens(0L)
                            .totalTokens(0L)
                            .inputTokenDetails(
                                InputTokenDetails.builder().audioTokens(0L).textTokens(0L).build()
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedTranscriptionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionCreateResponse),
                jacksonTypeRef<TranscriptionCreateResponse>(),
            )

        assertThat(roundtrippedTranscriptionCreateResponse).isEqualTo(transcriptionCreateResponse)
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
        val transcriptionCreateResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TranscriptionCreateResponse>())

        val e = assertThrows<DedalusInvalidDataException> { transcriptionCreateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
