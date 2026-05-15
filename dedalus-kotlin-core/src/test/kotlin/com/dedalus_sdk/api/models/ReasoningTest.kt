// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReasoningTest {

    @Test
    fun create() {
        val reasoning =
            Reasoning.builder()
                .effort(Reasoning.Effort.NONE)
                .generateSummary(Reasoning.GenerateSummary.AUTO)
                .summary(Reasoning.Summary.AUTO)
                .build()

        assertThat(reasoning.effort()).isEqualTo(Reasoning.Effort.NONE)
        assertThat(reasoning.generateSummary()).isEqualTo(Reasoning.GenerateSummary.AUTO)
        assertThat(reasoning.summary()).isEqualTo(Reasoning.Summary.AUTO)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reasoning =
            Reasoning.builder()
                .effort(Reasoning.Effort.NONE)
                .generateSummary(Reasoning.GenerateSummary.AUTO)
                .summary(Reasoning.Summary.AUTO)
                .build()

        val roundtrippedReasoning =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reasoning),
                jacksonTypeRef<Reasoning>(),
            )

        assertThat(roundtrippedReasoning).isEqualTo(reasoning)
    }
}
