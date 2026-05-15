// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.BaseDeserializer
import com.dedalus_sdk.api.core.BaseSerializer
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.allMaxBy
import com.dedalus_sdk.api.core.getOrThrow
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects

/** Dedalus model choice - either a string ID or DedalusModel configuration object. */
@JsonDeserialize(using = DedalusModelChoice.Deserializer::class)
@JsonSerialize(using = DedalusModelChoice.Serializer::class)
class DedalusModelChoice
private constructor(
    private val modelId: String? = null,
    private val dedalusModel: DedalusModel? = null,
    private val _json: JsonValue? = null,
) {

    /** Model identifier string (e.g., 'openai/gpt-5', 'anthropic/claude-3-5-sonnet'). */
    fun modelId(): String? = modelId

    /**
     * Structured model selection entry used in request payloads.
     *
     * Supports OpenAI-style semantics (string model id) while enabling optional per-model default
     * settings for Dedalus multi-model routing.
     */
    fun dedalusModel(): DedalusModel? = dedalusModel

    fun isModelId(): Boolean = modelId != null

    fun isDedalusModel(): Boolean = dedalusModel != null

    /** Model identifier string (e.g., 'openai/gpt-5', 'anthropic/claude-3-5-sonnet'). */
    fun asModelId(): String = modelId.getOrThrow("modelId")

    /**
     * Structured model selection entry used in request payloads.
     *
     * Supports OpenAI-style semantics (string model id) while enabling optional per-model default
     * settings for Dedalus multi-model routing.
     */
    fun asDedalusModel(): DedalusModel = dedalusModel.getOrThrow("dedalusModel")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.dedalus_sdk.api.core.JsonValue
     *
     * val result: String? = dedalusModelChoice.accept(object : DedalusModelChoice.Visitor<String?> {
     *     override fun visitModelId(modelId: String): String? = modelId.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws DedalusInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            modelId != null -> visitor.visitModelId(modelId)
            dedalusModel != null -> visitor.visitDedalusModel(dedalusModel)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DedalusInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DedalusModelChoice = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitModelId(modelId: String) {}

                override fun visitDedalusModel(dedalusModel: DedalusModel) {
                    dedalusModel.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: DedalusInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitModelId(modelId: String) = 1

                override fun visitDedalusModel(dedalusModel: DedalusModel) = dedalusModel.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DedalusModelChoice &&
            modelId == other.modelId &&
            dedalusModel == other.dedalusModel
    }

    override fun hashCode(): Int = Objects.hash(modelId, dedalusModel)

    override fun toString(): String =
        when {
            modelId != null -> "DedalusModelChoice{modelId=$modelId}"
            dedalusModel != null -> "DedalusModelChoice{dedalusModel=$dedalusModel}"
            _json != null -> "DedalusModelChoice{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DedalusModelChoice")
        }

    companion object {

        /** Model identifier string (e.g., 'openai/gpt-5', 'anthropic/claude-3-5-sonnet'). */
        fun ofModelId(modelId: String) = DedalusModelChoice(modelId = modelId)

        /**
         * Structured model selection entry used in request payloads.
         *
         * Supports OpenAI-style semantics (string model id) while enabling optional per-model
         * default settings for Dedalus multi-model routing.
         */
        fun ofDedalusModel(dedalusModel: DedalusModel) =
            DedalusModelChoice(dedalusModel = dedalusModel)
    }

    /**
     * An interface that defines how to map each variant of [DedalusModelChoice] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Model identifier string (e.g., 'openai/gpt-5', 'anthropic/claude-3-5-sonnet'). */
        fun visitModelId(modelId: String): T

        /**
         * Structured model selection entry used in request payloads.
         *
         * Supports OpenAI-style semantics (string model id) while enabling optional per-model
         * default settings for Dedalus multi-model routing.
         */
        fun visitDedalusModel(dedalusModel: DedalusModel): T

        /**
         * Maps an unknown variant of [DedalusModelChoice] to a value of type [T].
         *
         * An instance of [DedalusModelChoice] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws DedalusInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DedalusInvalidDataException("Unknown DedalusModelChoice: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<DedalusModelChoice>(DedalusModelChoice::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): DedalusModelChoice {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<DedalusModel>())?.let {
                            DedalusModelChoice(dedalusModel = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            DedalusModelChoice(modelId = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> DedalusModelChoice(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<DedalusModelChoice>(DedalusModelChoice::class) {

        override fun serialize(
            value: DedalusModelChoice,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.modelId != null -> generator.writeObject(value.modelId)
                value.dedalusModel != null -> generator.writeObject(value.dedalusModel)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DedalusModelChoice")
            }
        }
    }
}
