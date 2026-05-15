// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models

import com.dedalus_sdk.api.core.BaseDeserializer
import com.dedalus_sdk.api.core.BaseSerializer
import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.allMaxBy
import com.dedalus_sdk.api.core.getOrThrow
import com.dedalus_sdk.api.core.toImmutable
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects

@JsonDeserialize(using = JsonValueInput.Deserializer::class)
@JsonSerialize(using = JsonValueInput.Serializer::class)
class JsonValueInput
private constructor(
    private val string: String? = null,
    private val double: Double? = null,
    private val boolean: Boolean? = null,
    private val unionMember3: UnionMember3? = null,
    private val inputs: List<JsonValueInput?>? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): String? = string

    fun double(): Double? = double

    fun boolean(): Boolean? = boolean

    fun unionMember3(): UnionMember3? = unionMember3

    fun inputs(): List<JsonValueInput?>? = inputs

    fun isString(): Boolean = string != null

    fun isDouble(): Boolean = double != null

    fun isBoolean(): Boolean = boolean != null

    fun isUnionMember3(): Boolean = unionMember3 != null

    fun isInputs(): Boolean = inputs != null

    fun asString(): String = string.getOrThrow("string")

    fun asDouble(): Double = double.getOrThrow("double")

    fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

    fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

    fun asInputs(): List<JsonValueInput?> = inputs.getOrThrow("inputs")

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
     * val result: String? = jsonValueInput.accept(object : JsonValueInput.Visitor<String?> {
     *     override fun visitString(string: String): String? = string.toString()
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
            string != null -> visitor.visitString(string)
            double != null -> visitor.visitDouble(double)
            boolean != null -> visitor.visitBoolean(boolean)
            unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
            inputs != null -> visitor.visitInputs(inputs)
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
    fun validate(): JsonValueInput = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitDouble(double: Double) {}

                override fun visitBoolean(boolean: Boolean) {}

                override fun visitUnionMember3(unionMember3: UnionMember3) {
                    unionMember3.validate()
                }

                override fun visitInputs(inputs: List<JsonValueInput?>) {
                    inputs.forEach { it?.validate() }
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
                override fun visitString(string: String) = 1

                override fun visitDouble(double: Double) = 1

                override fun visitBoolean(boolean: Boolean) = 1

                override fun visitUnionMember3(unionMember3: UnionMember3) = unionMember3.validity()

                override fun visitInputs(inputs: List<JsonValueInput?>) =
                    inputs.sumOf { (it?.validity() ?: 0).toInt() }

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonValueInput &&
            string == other.string &&
            double == other.double &&
            boolean == other.boolean &&
            unionMember3 == other.unionMember3 &&
            inputs == other.inputs
    }

    override fun hashCode(): Int = Objects.hash(string, double, boolean, unionMember3, inputs)

    override fun toString(): String =
        when {
            string != null -> "JsonValueInput{string=$string}"
            double != null -> "JsonValueInput{double=$double}"
            boolean != null -> "JsonValueInput{boolean=$boolean}"
            unionMember3 != null -> "JsonValueInput{unionMember3=$unionMember3}"
            inputs != null -> "JsonValueInput{inputs=$inputs}"
            _json != null -> "JsonValueInput{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid JsonValueInput")
        }

    companion object {

        fun ofString(string: String) = JsonValueInput(string = string)

        fun ofDouble(double: Double) = JsonValueInput(double = double)

        fun ofBoolean(boolean: Boolean) = JsonValueInput(boolean = boolean)

        fun ofUnionMember3(unionMember3: UnionMember3) = JsonValueInput(unionMember3 = unionMember3)

        fun ofInputs(inputs: List<JsonValueInput?>) = JsonValueInput(inputs = inputs.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [JsonValueInput] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitDouble(double: Double): T

        fun visitBoolean(boolean: Boolean): T

        fun visitUnionMember3(unionMember3: UnionMember3): T

        fun visitInputs(inputs: List<JsonValueInput?>): T

        /**
         * Maps an unknown variant of [JsonValueInput] to a value of type [T].
         *
         * An instance of [JsonValueInput] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws DedalusInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DedalusInvalidDataException("Unknown JsonValueInput: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<JsonValueInput>(JsonValueInput::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): JsonValueInput {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember3>())?.let {
                            JsonValueInput(unionMember3 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            JsonValueInput(string = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                            JsonValueInput(double = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                            JsonValueInput(boolean = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<JsonValueInput?>>())?.let {
                            JsonValueInput(inputs = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants.
                0 -> JsonValueInput(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<JsonValueInput>(JsonValueInput::class) {

        override fun serialize(
            value: JsonValueInput,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.double != null -> generator.writeObject(value.double)
                value.boolean != null -> generator.writeObject(value.boolean)
                value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                value.inputs != null -> generator.writeObject(value.inputs)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid JsonValueInput")
            }
        }
    }

    class UnionMember3
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UnionMember3]. */
            fun builder() = Builder()
        }

        /** A builder for [UnionMember3]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unionMember3: UnionMember3) = apply {
                additionalProperties = unionMember3.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [UnionMember3].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember3 = UnionMember3(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): UnionMember3 = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember3 && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UnionMember3{additionalProperties=$additionalProperties}"
    }
}
