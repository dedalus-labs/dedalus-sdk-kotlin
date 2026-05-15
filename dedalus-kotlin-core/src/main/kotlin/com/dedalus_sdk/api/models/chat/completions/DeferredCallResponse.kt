// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.checkKnown
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.core.toImmutable
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.dedalus_sdk.api.models.JsonObjectInput
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Server-side call blocked until pending client calls complete.
 *
 * Carries full spec for stateless resumption on subsequent turns.
 */
class DeferredCallResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val arguments: JsonField<JsonObjectInput>,
    private val blockedBy: JsonField<List<String>>,
    private val dependencies: JsonField<List<String>>,
    private val venue: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arguments")
        @ExcludeMissing
        arguments: JsonField<JsonObjectInput> = JsonMissing.of(),
        @JsonProperty("blocked_by")
        @ExcludeMissing
        blockedBy: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("dependencies")
        @ExcludeMissing
        dependencies: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("venue") @ExcludeMissing venue: JsonField<String> = JsonMissing.of(),
    ) : this(id, name, arguments, blockedBy, dependencies, venue, mutableMapOf())

    /**
     * Unique identifier for this deferred call.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Name of the tool.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Input arguments for the tool call.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun arguments(): JsonObjectInput? = arguments.getNullable("arguments")

    /**
     * IDs of pending client calls blocking this call.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blockedBy(): List<String>? = blockedBy.getNullable("blocked_by")

    /**
     * IDs of calls this depends on.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dependencies(): List<String>? = dependencies.getNullable("dependencies")

    /**
     * Execution venue (server or client).
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun venue(): String? = venue.getNullable("venue")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [arguments].
     *
     * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arguments")
    @ExcludeMissing
    fun _arguments(): JsonField<JsonObjectInput> = arguments

    /**
     * Returns the raw JSON value of [blockedBy].
     *
     * Unlike [blockedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocked_by")
    @ExcludeMissing
    fun _blockedBy(): JsonField<List<String>> = blockedBy

    /**
     * Returns the raw JSON value of [dependencies].
     *
     * Unlike [dependencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dependencies")
    @ExcludeMissing
    fun _dependencies(): JsonField<List<String>> = dependencies

    /**
     * Returns the raw JSON value of [venue].
     *
     * Unlike [venue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("venue") @ExcludeMissing fun _venue(): JsonField<String> = venue

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DeferredCallResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DeferredCallResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var arguments: JsonField<JsonObjectInput> = JsonMissing.of()
        private var blockedBy: JsonField<MutableList<String>>? = null
        private var dependencies: JsonField<MutableList<String>>? = null
        private var venue: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(deferredCallResponse: DeferredCallResponse) = apply {
            id = deferredCallResponse.id
            name = deferredCallResponse.name
            arguments = deferredCallResponse.arguments
            blockedBy = deferredCallResponse.blockedBy.map { it.toMutableList() }
            dependencies = deferredCallResponse.dependencies.map { it.toMutableList() }
            venue = deferredCallResponse.venue
            additionalProperties = deferredCallResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this deferred call. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the tool. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Input arguments for the tool call. */
        fun arguments(arguments: JsonObjectInput) = arguments(JsonField.of(arguments))

        /**
         * Sets [Builder.arguments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arguments] with a well-typed [JsonObjectInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun arguments(arguments: JsonField<JsonObjectInput>) = apply { this.arguments = arguments }

        /** IDs of pending client calls blocking this call. */
        fun blockedBy(blockedBy: List<String>) = blockedBy(JsonField.of(blockedBy))

        /**
         * Sets [Builder.blockedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedBy] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blockedBy(blockedBy: JsonField<List<String>>) = apply {
            this.blockedBy = blockedBy.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.blockedBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockedBy(blockedBy: String) = apply {
            this.blockedBy =
                (this.blockedBy ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockedBy", it).add(blockedBy)
                }
        }

        /** IDs of calls this depends on. */
        fun dependencies(dependencies: List<String>) = dependencies(JsonField.of(dependencies))

        /**
         * Sets [Builder.dependencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependencies] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dependencies(dependencies: JsonField<List<String>>) = apply {
            this.dependencies = dependencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [dependencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDependency(dependency: String) = apply {
            dependencies =
                (dependencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dependencies", it).add(dependency)
                }
        }

        /** Execution venue (server or client). */
        fun venue(venue: String) = venue(JsonField.of(venue))

        /**
         * Sets [Builder.venue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.venue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun venue(venue: JsonField<String>) = apply { this.venue = venue }

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
         * Returns an immutable instance of [DeferredCallResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DeferredCallResponse =
            DeferredCallResponse(
                checkRequired("id", id),
                checkRequired("name", name),
                arguments,
                (blockedBy ?: JsonMissing.of()).map { it.toImmutable() },
                (dependencies ?: JsonMissing.of()).map { it.toImmutable() },
                venue,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): DeferredCallResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        arguments()?.validate()
        blockedBy()
        dependencies()
        venue()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (arguments.asKnown()?.validity() ?: 0) +
            (blockedBy.asKnown()?.size ?: 0) +
            (dependencies.asKnown()?.size ?: 0) +
            (if (venue.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeferredCallResponse &&
            id == other.id &&
            name == other.name &&
            arguments == other.arguments &&
            blockedBy == other.blockedBy &&
            dependencies == other.dependencies &&
            venue == other.venue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, name, arguments, blockedBy, dependencies, venue, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeferredCallResponse{id=$id, name=$name, arguments=$arguments, blockedBy=$blockedBy, dependencies=$dependencies, venue=$venue, additionalProperties=$additionalProperties}"
}
