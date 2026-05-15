// File generated from our OpenAPI spec by Stainless.

package com.dedalus_sdk.api.models.chat.completions

import com.dedalus_sdk.api.core.ExcludeMissing
import com.dedalus_sdk.api.core.JsonField
import com.dedalus_sdk.api.core.JsonMissing
import com.dedalus_sdk.api.core.JsonValue
import com.dedalus_sdk.api.core.checkRequired
import com.dedalus_sdk.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Learn about [file inputs](/docs/guides/text) for text generation.
 *
 * Fields:
 * - type (required): Literal["file"]
 * - file (required): File
 */
class ChatCompletionContentPartFileParam
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val file: JsonField<File>,
    private val type: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("file") @ExcludeMissing file: JsonField<File> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
    ) : this(file, type, mutableMapOf())

    /**
     * Schema for File.
     *
     * Fields:
     * - filename (optional): str
     * - file_data (optional): str
     * - file_id (optional): str
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): File = file.getRequired("file")

    /**
     * The type of the content part. Always `file`.
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("file")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * Returns the raw JSON value of [file].
     *
     * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<File> = file

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
         * Returns a mutable builder for constructing an instance of
         * [ChatCompletionContentPartFileParam].
         *
         * The following fields are required:
         * ```kotlin
         * .file()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionContentPartFileParam]. */
    class Builder internal constructor() {

        private var file: JsonField<File>? = null
        private var type: JsonValue = JsonValue.from("file")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionContentPartFileParam: ChatCompletionContentPartFileParam) =
            apply {
                file = chatCompletionContentPartFileParam.file
                type = chatCompletionContentPartFileParam.type
                additionalProperties =
                    chatCompletionContentPartFileParam.additionalProperties.toMutableMap()
            }

        /**
         * Schema for File.
         *
         * Fields:
         * - filename (optional): str
         * - file_data (optional): str
         * - file_id (optional): str
         */
        fun file(file: File) = file(JsonField.of(file))

        /**
         * Sets [Builder.file] to an arbitrary JSON value.
         *
         * You should usually call [Builder.file] with a well-typed [File] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun file(file: JsonField<File>) = apply { this.file = file }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("file")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

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
         * Returns an immutable instance of [ChatCompletionContentPartFileParam].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .file()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionContentPartFileParam =
            ChatCompletionContentPartFileParam(
                checkRequired("file", file),
                type,
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
    fun validate(): ChatCompletionContentPartFileParam = apply {
        if (validated) {
            return@apply
        }

        file().validate()
        _type().let {
            if (it != JsonValue.from("file")) {
                throw DedalusInvalidDataException("'type' is invalid, received $it")
            }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (file.asKnown()?.validity() ?: 0) + type.let { if (it == JsonValue.from("file")) 1 else 0 }

    /**
     * Schema for File.
     *
     * Fields:
     * - filename (optional): str
     * - file_data (optional): str
     * - file_id (optional): str
     */
    class File
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fileData: JsonField<String>,
        private val fileId: JsonField<String>,
        private val filename: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_data")
            @ExcludeMissing
            fileData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        ) : this(fileData, fileId, filename, mutableMapOf())

        /**
         * The base64 encoded file data, used when passing the file to the model as a string.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fileData(): String? = fileData.getNullable("file_data")

        /**
         * The ID of an uploaded file to use as input.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fileId(): String? = fileId.getNullable("file_id")

        /**
         * The name of the file, used when passing the file to the model as a string.
         *
         * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filename(): String? = filename.getNullable("filename")

        /**
         * Returns the raw JSON value of [fileData].
         *
         * Unlike [fileData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_data") @ExcludeMissing fun _fileData(): JsonField<String> = fileData

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

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

            /** Returns a mutable builder for constructing an instance of [File]. */
            fun builder() = Builder()
        }

        /** A builder for [File]. */
        class Builder internal constructor() {

            private var fileData: JsonField<String> = JsonMissing.of()
            private var fileId: JsonField<String> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(file: File) = apply {
                fileData = file.fileData
                fileId = file.fileId
                filename = file.filename
                additionalProperties = file.additionalProperties.toMutableMap()
            }

            /**
             * The base64 encoded file data, used when passing the file to the model as a string.
             */
            fun fileData(fileData: String) = fileData(JsonField.of(fileData))

            /**
             * Sets [Builder.fileData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileData] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileData(fileData: JsonField<String>) = apply { this.fileData = fileData }

            /** The ID of an uploaded file to use as input. */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            /** The name of the file, used when passing the file to the model as a string. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

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
             * Returns an immutable instance of [File].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): File =
                File(fileData, fileId, filename, additionalProperties.toMutableMap())
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
        fun validate(): File = apply {
            if (validated) {
                return@apply
            }

            fileData()
            fileId()
            filename()
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
            (if (fileData.asKnown() == null) 0 else 1) +
                (if (fileId.asKnown() == null) 0 else 1) +
                (if (filename.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is File &&
                fileData == other.fileData &&
                fileId == other.fileId &&
                filename == other.filename &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fileData, fileId, filename, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "File{fileData=$fileData, fileId=$fileId, filename=$filename, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCompletionContentPartFileParam &&
            file == other.file &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(file, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionContentPartFileParam{file=$file, type=$type, additionalProperties=$additionalProperties}"
}
