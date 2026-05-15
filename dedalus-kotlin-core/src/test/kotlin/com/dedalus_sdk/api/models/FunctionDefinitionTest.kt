// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionDefinitionTest {

    @Test
    fun create() {
        val functionDefinition = FunctionDefinition.builder().name("name").build()

        assertThat(functionDefinition.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionDefinition = FunctionDefinition.builder().name("name").build()

        val roundtrippedFunctionDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionDefinition),
                jacksonTypeRef<FunctionDefinition>(),
            )

        assertThat(roundtrippedFunctionDefinition).isEqualTo(functionDefinition)
    }
}
