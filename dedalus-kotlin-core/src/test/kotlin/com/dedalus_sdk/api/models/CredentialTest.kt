// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialTest {

    @Test
    fun create() {
        val credential =
            Credential.builder()
                .connectionName("connection_name")
                .values(
                    Credential.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(credential.connectionName()).isEqualTo("connection_name")
        assertThat(credential.values())
            .isEqualTo(
                Credential.Values.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credential =
            Credential.builder()
                .connectionName("connection_name")
                .values(
                    Credential.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedCredential =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credential),
                jacksonTypeRef<Credential>(),
            )

        assertThat(roundtrippedCredential).isEqualTo(credential)
    }
}
