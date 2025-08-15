// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models.individuals.documents

import com.dataleon.api.core.Enum
import com.dataleon.api.core.ExcludeMissing
import com.dataleon.api.core.JsonField
import com.dataleon.api.core.JsonValue
import com.dataleon.api.core.MultipartField
import com.dataleon.api.core.Params
import com.dataleon.api.core.checkRequired
import com.dataleon.api.core.http.Headers
import com.dataleon.api.core.http.QueryParams
import com.dataleon.api.core.toImmutable
import com.dataleon.api.errors.DataleonInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

/** Upload documents to an individual */
class DocumentUploadParams
private constructor(
    private val individualId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun individualId(): Optional<String> = Optional.ofNullable(individualId)

    /**
     * Filter by document type for upload (must be one of the allowed values)
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): DocumentType = body.documentType()

    /**
     * File to upload (required)
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun file(): Optional<InputStream> = body.file()

    /**
     * URL of the file to upload (either `file` or `url` is required)
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = body.url()

    /**
     * Returns the raw multipart value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentType(): MultipartField<DocumentType> = body._documentType()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [url].
     *
     * Unlike [url], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _url(): MultipartField<String> = body._url()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentUploadParams].
         *
         * The following fields are required:
         * ```java
         * .documentType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentUploadParams]. */
    class Builder internal constructor() {

        private var individualId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentUploadParams: DocumentUploadParams) = apply {
            individualId = documentUploadParams.individualId
            body = documentUploadParams.body.toBuilder()
            additionalHeaders = documentUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentUploadParams.additionalQueryParams.toBuilder()
        }

        fun individualId(individualId: String?) = apply { this.individualId = individualId }

        /** Alias for calling [Builder.individualId] with `individualId.orElse(null)`. */
        fun individualId(individualId: Optional<String>) = individualId(individualId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [documentType]
         * - [file]
         * - [url]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Filter by document type for upload (must be one of the allowed values) */
        fun documentType(documentType: DocumentType) = apply { body.documentType(documentType) }

        /**
         * Sets [Builder.documentType] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentType(documentType: MultipartField<DocumentType>) = apply {
            body.documentType(documentType)
        }

        /** File to upload (required) */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /** File to upload (required) */
        fun file(file: ByteArray) = apply { body.file(file) }

        /** File to upload (required) */
        fun file(file: Path) = apply { body.file(file) }

        /** URL of the file to upload (either `file` or `url` is required) */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary multipart value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: MultipartField<String>) = apply { body.url(url) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DocumentUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .documentType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentUploadParams =
            DocumentUploadParams(
                individualId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("document_type" to _documentType(), "file" to _file(), "url" to _url()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> individualId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val documentType: MultipartField<DocumentType>,
        private val file: MultipartField<InputStream>,
        private val url: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Filter by document type for upload (must be one of the allowed values)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): DocumentType = documentType.value.getRequired("document_type")

        /**
         * File to upload (required)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun file(): Optional<InputStream> = file.value.getOptional("file")

        /**
         * URL of the file to upload (either `file` or `url` is required)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.value.getOptional("url")

        /**
         * Returns the raw multipart value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): MultipartField<DocumentType> = documentType

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [url].
         *
         * Unlike [url], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): MultipartField<String> = url

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .documentType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var documentType: MultipartField<DocumentType>? = null
            private var file: MultipartField<InputStream> = MultipartField.of(null)
            private var url: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                documentType = body.documentType
                file = body.file
                url = body.url
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Filter by document type for upload (must be one of the allowed values) */
            fun documentType(documentType: DocumentType) =
                documentType(MultipartField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: MultipartField<DocumentType>) = apply {
                this.documentType = documentType
            }

            /** File to upload (required) */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /** File to upload (required) */
            fun file(file: ByteArray) = file(file.inputStream())

            /** File to upload (required) */
            fun file(file: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(file.inputStream())
                        .filename(file.name)
                        .build()
                )

            /** URL of the file to upload (either `file` or `url` is required) */
            fun url(url: String) = url(MultipartField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary multipart value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: MultipartField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .documentType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("documentType", documentType),
                    file,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            documentType().validate()
            file()
            url()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DataleonInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                documentType == other.documentType &&
                file == other.file &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentType, file, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{documentType=$documentType, file=$file, url=$url, additionalProperties=$additionalProperties}"
    }

    /** Filter by document type for upload (must be one of the allowed values) */
    class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BANK_STATEMENTS = of("bank_statements")

            @JvmField val LIASSE_FISCALE = of("liasse_fiscale")

            @JvmField val AMORTISED_LOAN_SCHEDULE = of("amortised_loan_schedule")

            @JvmField val ACCOUNTING = of("accounting")

            @JvmField val INVOICE = of("invoice")

            @JvmField val RECEIPT = of("receipt")

            @JvmField val COMPANY_STATUTS = of("company_statuts")

            @JvmField val RIB = of("rib")

            @JvmField val LIVRET_FAMILLE = of("livret_famille")

            @JvmField val PAYSLIP = of("payslip")

            @JvmField val CARTE_GRISE = of("carte_grise")

            @JvmField val PROOF_ADDRESS = of("proof_address")

            @JvmField val IDENTITY_DOCUMENT = of("identity_document")

            @JvmField val TAX = of("tax")

            @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
        }

        /** An enum containing [DocumentType]'s known values. */
        enum class Known {
            BANK_STATEMENTS,
            LIASSE_FISCALE,
            AMORTISED_LOAN_SCHEDULE,
            ACCOUNTING,
            INVOICE,
            RECEIPT,
            COMPANY_STATUTS,
            RIB,
            LIVRET_FAMILLE,
            PAYSLIP,
            CARTE_GRISE,
            PROOF_ADDRESS,
            IDENTITY_DOCUMENT,
            TAX,
        }

        /**
         * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BANK_STATEMENTS,
            LIASSE_FISCALE,
            AMORTISED_LOAN_SCHEDULE,
            ACCOUNTING,
            INVOICE,
            RECEIPT,
            COMPANY_STATUTS,
            RIB,
            LIVRET_FAMILLE,
            PAYSLIP,
            CARTE_GRISE,
            PROOF_ADDRESS,
            IDENTITY_DOCUMENT,
            TAX,
            /**
             * An enum member indicating that [DocumentType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BANK_STATEMENTS -> Value.BANK_STATEMENTS
                LIASSE_FISCALE -> Value.LIASSE_FISCALE
                AMORTISED_LOAN_SCHEDULE -> Value.AMORTISED_LOAN_SCHEDULE
                ACCOUNTING -> Value.ACCOUNTING
                INVOICE -> Value.INVOICE
                RECEIPT -> Value.RECEIPT
                COMPANY_STATUTS -> Value.COMPANY_STATUTS
                RIB -> Value.RIB
                LIVRET_FAMILLE -> Value.LIVRET_FAMILLE
                PAYSLIP -> Value.PAYSLIP
                CARTE_GRISE -> Value.CARTE_GRISE
                PROOF_ADDRESS -> Value.PROOF_ADDRESS
                IDENTITY_DOCUMENT -> Value.IDENTITY_DOCUMENT
                TAX -> Value.TAX
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DataleonInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BANK_STATEMENTS -> Known.BANK_STATEMENTS
                LIASSE_FISCALE -> Known.LIASSE_FISCALE
                AMORTISED_LOAN_SCHEDULE -> Known.AMORTISED_LOAN_SCHEDULE
                ACCOUNTING -> Known.ACCOUNTING
                INVOICE -> Known.INVOICE
                RECEIPT -> Known.RECEIPT
                COMPANY_STATUTS -> Known.COMPANY_STATUTS
                RIB -> Known.RIB
                LIVRET_FAMILLE -> Known.LIVRET_FAMILLE
                PAYSLIP -> Known.PAYSLIP
                CARTE_GRISE -> Known.CARTE_GRISE
                PROOF_ADDRESS -> Known.PROOF_ADDRESS
                IDENTITY_DOCUMENT -> Known.IDENTITY_DOCUMENT
                TAX -> Known.TAX
                else -> throw DataleonInvalidDataException("Unknown DocumentType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DataleonInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                DataleonInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): DocumentType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DataleonInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentUploadParams &&
            individualId == other.individualId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(individualId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentUploadParams{individualId=$individualId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
