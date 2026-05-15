// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.proguard

import com.dedalus_sdk.api.client.okhttp.DedalusOkHttpClient
import com.dedalus_sdk.api.core.jsonMapper
import com.dedalus_sdk.api.models.DedalusModelChoice
import com.dedalus_sdk.api.models.chat.completions.Audio
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/dedalus-kotlin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.models()).isNotNull()
        assertThat(client.embeddings()).isNotNull()
        assertThat(client.audio()).isNotNull()
        assertThat(client.images()).isNotNull()
        assertThat(client.ocr()).isNotNull()
        assertThat(client.responses()).isNotNull()
        assertThat(client.chat()).isNotNull()
    }

    @Test
    fun audioRoundtrip() {
        val jsonMapper = jsonMapper()
        val audio = Audio.builder().id("id").build()

        val roundtrippedAudio =
            jsonMapper.readValue(jsonMapper.writeValueAsString(audio), jacksonTypeRef<Audio>())

        assertThat(roundtrippedAudio).isEqualTo(audio)
    }

    @Test
    fun dedalusModelChoiceRoundtrip() {
        val jsonMapper = jsonMapper()
        val dedalusModelChoice = DedalusModelChoice.ofModelId("string")

        val roundtrippedDedalusModelChoice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dedalusModelChoice),
                jacksonTypeRef<DedalusModelChoice>(),
            )

        assertThat(roundtrippedDedalusModelChoice).isEqualTo(dedalusModelChoice)
    }
}
