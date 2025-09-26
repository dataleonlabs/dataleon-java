// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models.companies

import com.dataleon.api.core.ExcludeMissing
import com.dataleon.api.core.JsonField
import com.dataleon.api.core.JsonMissing
import com.dataleon.api.core.JsonValue
import com.dataleon.api.core.Params
import com.dataleon.api.core.checkRequired
import com.dataleon.api.core.http.Headers
import com.dataleon.api.core.http.QueryParams
import com.dataleon.api.errors.DataleonInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new company */
class CompanyCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Main information about the company being registered.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun company(): Company = body.company()

    /**
     * Unique identifier of the workspace in which the company is being created.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workspaceId(): String = body.workspaceId()

    /**
     * Optional identifier to track the origin of the request or integration from your system.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceId(): Optional<String> = body.sourceId()

    /**
     * Technical metadata and callback configuration.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technicalData(): Optional<TechnicalData> = body.technicalData()

    /**
     * Returns the raw JSON value of [company].
     *
     * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _company(): JsonField<Company> = body._company()

    /**
     * Returns the raw JSON value of [workspaceId].
     *
     * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _workspaceId(): JsonField<String> = body._workspaceId()

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceId(): JsonField<String> = body._sourceId()

    /**
     * Returns the raw JSON value of [technicalData].
     *
     * Unlike [technicalData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _technicalData(): JsonField<TechnicalData> = body._technicalData()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompanyCreateParams].
         *
         * The following fields are required:
         * ```java
         * .company()
         * .workspaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(companyCreateParams: CompanyCreateParams) = apply {
            body = companyCreateParams.body.toBuilder()
            additionalHeaders = companyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = companyCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [company]
         * - [workspaceId]
         * - [sourceId]
         * - [technicalData]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Main information about the company being registered. */
        fun company(company: Company) = apply { body.company(company) }

        /**
         * Sets [Builder.company] to an arbitrary JSON value.
         *
         * You should usually call [Builder.company] with a well-typed [Company] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun company(company: JsonField<Company>) = apply { body.company(company) }

        /** Unique identifier of the workspace in which the company is being created. */
        fun workspaceId(workspaceId: String) = apply { body.workspaceId(workspaceId) }

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { body.workspaceId(workspaceId) }

        /**
         * Optional identifier to track the origin of the request or integration from your system.
         */
        fun sourceId(sourceId: String) = apply { body.sourceId(sourceId) }

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { body.sourceId(sourceId) }

        /** Technical metadata and callback configuration. */
        fun technicalData(technicalData: TechnicalData) = apply {
            body.technicalData(technicalData)
        }

        /**
         * Sets [Builder.technicalData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technicalData] with a well-typed [TechnicalData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun technicalData(technicalData: JsonField<TechnicalData>) = apply {
            body.technicalData(technicalData)
        }

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
         * Returns an immutable instance of [CompanyCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .company()
         * .workspaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyCreateParams =
            CompanyCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val company: JsonField<Company>,
        private val workspaceId: JsonField<String>,
        private val sourceId: JsonField<String>,
        private val technicalData: JsonField<TechnicalData>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("company") @ExcludeMissing company: JsonField<Company> = JsonMissing.of(),
            @JsonProperty("workspace_id")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_id")
            @ExcludeMissing
            sourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("technical_data")
            @ExcludeMissing
            technicalData: JsonField<TechnicalData> = JsonMissing.of(),
        ) : this(company, workspaceId, sourceId, technicalData, mutableMapOf())

        /**
         * Main information about the company being registered.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun company(): Company = company.getRequired("company")

        /**
         * Unique identifier of the workspace in which the company is being created.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun workspaceId(): String = workspaceId.getRequired("workspace_id")

        /**
         * Optional identifier to track the origin of the request or integration from your system.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sourceId(): Optional<String> = sourceId.getOptional("source_id")

        /**
         * Technical metadata and callback configuration.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun technicalData(): Optional<TechnicalData> = technicalData.getOptional("technical_data")

        /**
         * Returns the raw JSON value of [company].
         *
         * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<Company> = company

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspace_id")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

        /**
         * Returns the raw JSON value of [sourceId].
         *
         * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

        /**
         * Returns the raw JSON value of [technicalData].
         *
         * Unlike [technicalData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("technical_data")
        @ExcludeMissing
        fun _technicalData(): JsonField<TechnicalData> = technicalData

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
             * .company()
             * .workspaceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var company: JsonField<Company>? = null
            private var workspaceId: JsonField<String>? = null
            private var sourceId: JsonField<String> = JsonMissing.of()
            private var technicalData: JsonField<TechnicalData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                company = body.company
                workspaceId = body.workspaceId
                sourceId = body.sourceId
                technicalData = body.technicalData
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Main information about the company being registered. */
            fun company(company: Company) = company(JsonField.of(company))

            /**
             * Sets [Builder.company] to an arbitrary JSON value.
             *
             * You should usually call [Builder.company] with a well-typed [Company] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun company(company: JsonField<Company>) = apply { this.company = company }

            /** Unique identifier of the workspace in which the company is being created. */
            fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

            /**
             * Sets [Builder.workspaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
            }

            /**
             * Optional identifier to track the origin of the request or integration from your
             * system.
             */
            fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

            /**
             * Sets [Builder.sourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

            /** Technical metadata and callback configuration. */
            fun technicalData(technicalData: TechnicalData) =
                technicalData(JsonField.of(technicalData))

            /**
             * Sets [Builder.technicalData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.technicalData] with a well-typed [TechnicalData]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun technicalData(technicalData: JsonField<TechnicalData>) = apply {
                this.technicalData = technicalData
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .company()
             * .workspaceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("company", company),
                    checkRequired("workspaceId", workspaceId),
                    sourceId,
                    technicalData,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            company().validate()
            workspaceId()
            sourceId()
            technicalData().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (company.asKnown().getOrNull()?.validity() ?: 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0) +
                (if (sourceId.asKnown().isPresent) 1 else 0) +
                (technicalData.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                company == other.company &&
                workspaceId == other.workspaceId &&
                sourceId == other.sourceId &&
                technicalData == other.technicalData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(company, workspaceId, sourceId, technicalData, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{company=$company, workspaceId=$workspaceId, sourceId=$sourceId, technicalData=$technicalData, additionalProperties=$additionalProperties}"
    }

    /** Main information about the company being registered. */
    class Company
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val address: JsonField<String>,
        private val commercialName: JsonField<String>,
        private val country: JsonField<String>,
        private val email: JsonField<String>,
        private val employerIdentificationNumber: JsonField<String>,
        private val legalForm: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val registrationDate: JsonField<String>,
        private val registrationId: JsonField<String>,
        private val shareCapital: JsonField<String>,
        private val status: JsonField<String>,
        private val taxIdentificationNumber: JsonField<String>,
        private val type: JsonField<String>,
        private val websiteUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commercial_name")
            @ExcludeMissing
            commercialName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("employer_identification_number")
            @ExcludeMissing
            employerIdentificationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_form")
            @ExcludeMissing
            legalForm: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_date")
            @ExcludeMissing
            registrationDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_id")
            @ExcludeMissing
            registrationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("share_capital")
            @ExcludeMissing
            shareCapital: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_identification_number")
            @ExcludeMissing
            taxIdentificationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website_url")
            @ExcludeMissing
            websiteUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            address,
            commercialName,
            country,
            email,
            employerIdentificationNumber,
            legalForm,
            phoneNumber,
            registrationDate,
            registrationId,
            shareCapital,
            status,
            taxIdentificationNumber,
            type,
            websiteUrl,
            mutableMapOf(),
        )

        /**
         * Legal name of the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Registered address of the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * Commercial or trade name of the company, if different from the legal name.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commercialName(): Optional<String> = commercialName.getOptional("commercial_name")

        /**
         * ISO 3166-1 alpha-2 country code of company registration (e.g., "FR" for France).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * Contact email address for the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Employer Identification Number (EIN) or equivalent.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun employerIdentificationNumber(): Optional<String> =
            employerIdentificationNumber.getOptional("employer_identification_number")

        /**
         * Legal structure of the company (e.g., SARL, SAS).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun legalForm(): Optional<String> = legalForm.getOptional("legal_form")

        /**
         * Contact phone number for the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Date of official company registration in YYYY-MM-DD format.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registrationDate(): Optional<String> = registrationDate.getOptional("registration_date")

        /**
         * Official company registration identifier.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registrationId(): Optional<String> = registrationId.getOptional("registration_id")

        /**
         * Declared share capital of the company, usually in euros.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shareCapital(): Optional<String> = shareCapital.getOptional("share_capital")

        /**
         * Current status of the company (e.g., active, inactive).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * National tax identifier (e.g., VAT or TIN).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxIdentificationNumber(): Optional<String> =
            taxIdentificationNumber.getOptional("tax_identification_number")

        /**
         * Type of company, such as "main" or "affiliated".
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Company’s official website URL.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun websiteUrl(): Optional<String> = websiteUrl.getOptional("website_url")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [commercialName].
         *
         * Unlike [commercialName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commercial_name")
        @ExcludeMissing
        fun _commercialName(): JsonField<String> = commercialName

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [employerIdentificationNumber].
         *
         * Unlike [employerIdentificationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("employer_identification_number")
        @ExcludeMissing
        fun _employerIdentificationNumber(): JsonField<String> = employerIdentificationNumber

        /**
         * Returns the raw JSON value of [legalForm].
         *
         * Unlike [legalForm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legal_form") @ExcludeMissing fun _legalForm(): JsonField<String> = legalForm

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [registrationDate].
         *
         * Unlike [registrationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registration_date")
        @ExcludeMissing
        fun _registrationDate(): JsonField<String> = registrationDate

        /**
         * Returns the raw JSON value of [registrationId].
         *
         * Unlike [registrationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registration_id")
        @ExcludeMissing
        fun _registrationId(): JsonField<String> = registrationId

        /**
         * Returns the raw JSON value of [shareCapital].
         *
         * Unlike [shareCapital], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("share_capital")
        @ExcludeMissing
        fun _shareCapital(): JsonField<String> = shareCapital

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [taxIdentificationNumber].
         *
         * Unlike [taxIdentificationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tax_identification_number")
        @ExcludeMissing
        fun _taxIdentificationNumber(): JsonField<String> = taxIdentificationNumber

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [websiteUrl].
         *
         * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website_url")
        @ExcludeMissing
        fun _websiteUrl(): JsonField<String> = websiteUrl

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
             * Returns a mutable builder for constructing an instance of [Company].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Company]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var address: JsonField<String> = JsonMissing.of()
            private var commercialName: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var employerIdentificationNumber: JsonField<String> = JsonMissing.of()
            private var legalForm: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var registrationDate: JsonField<String> = JsonMissing.of()
            private var registrationId: JsonField<String> = JsonMissing.of()
            private var shareCapital: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var taxIdentificationNumber: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var websiteUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(company: Company) = apply {
                name = company.name
                address = company.address
                commercialName = company.commercialName
                country = company.country
                email = company.email
                employerIdentificationNumber = company.employerIdentificationNumber
                legalForm = company.legalForm
                phoneNumber = company.phoneNumber
                registrationDate = company.registrationDate
                registrationId = company.registrationId
                shareCapital = company.shareCapital
                status = company.status
                taxIdentificationNumber = company.taxIdentificationNumber
                type = company.type
                websiteUrl = company.websiteUrl
                additionalProperties = company.additionalProperties.toMutableMap()
            }

            /** Legal name of the company. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Registered address of the company. */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Commercial or trade name of the company, if different from the legal name. */
            fun commercialName(commercialName: String) =
                commercialName(JsonField.of(commercialName))

            /**
             * Sets [Builder.commercialName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commercialName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commercialName(commercialName: JsonField<String>) = apply {
                this.commercialName = commercialName
            }

            /** ISO 3166-1 alpha-2 country code of company registration (e.g., "FR" for France). */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Contact email address for the company. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Employer Identification Number (EIN) or equivalent. */
            fun employerIdentificationNumber(employerIdentificationNumber: String) =
                employerIdentificationNumber(JsonField.of(employerIdentificationNumber))

            /**
             * Sets [Builder.employerIdentificationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employerIdentificationNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun employerIdentificationNumber(employerIdentificationNumber: JsonField<String>) =
                apply {
                    this.employerIdentificationNumber = employerIdentificationNumber
                }

            /** Legal structure of the company (e.g., SARL, SAS). */
            fun legalForm(legalForm: String) = legalForm(JsonField.of(legalForm))

            /**
             * Sets [Builder.legalForm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalForm] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalForm(legalForm: JsonField<String>) = apply { this.legalForm = legalForm }

            /** Contact phone number for the company. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Date of official company registration in YYYY-MM-DD format. */
            fun registrationDate(registrationDate: String) =
                registrationDate(JsonField.of(registrationDate))

            /**
             * Sets [Builder.registrationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationDate(registrationDate: JsonField<String>) = apply {
                this.registrationDate = registrationDate
            }

            /** Official company registration identifier. */
            fun registrationId(registrationId: String) =
                registrationId(JsonField.of(registrationId))

            /**
             * Sets [Builder.registrationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationId(registrationId: JsonField<String>) = apply {
                this.registrationId = registrationId
            }

            /** Declared share capital of the company, usually in euros. */
            fun shareCapital(shareCapital: String) = shareCapital(JsonField.of(shareCapital))

            /**
             * Sets [Builder.shareCapital] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shareCapital] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shareCapital(shareCapital: JsonField<String>) = apply {
                this.shareCapital = shareCapital
            }

            /** Current status of the company (e.g., active, inactive). */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** National tax identifier (e.g., VAT or TIN). */
            fun taxIdentificationNumber(taxIdentificationNumber: String) =
                taxIdentificationNumber(JsonField.of(taxIdentificationNumber))

            /**
             * Sets [Builder.taxIdentificationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxIdentificationNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun taxIdentificationNumber(taxIdentificationNumber: JsonField<String>) = apply {
                this.taxIdentificationNumber = taxIdentificationNumber
            }

            /** Type of company, such as "main" or "affiliated". */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Company’s official website URL. */
            fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

            /**
             * Sets [Builder.websiteUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.websiteUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

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
             * Returns an immutable instance of [Company].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Company =
                Company(
                    checkRequired("name", name),
                    address,
                    commercialName,
                    country,
                    email,
                    employerIdentificationNumber,
                    legalForm,
                    phoneNumber,
                    registrationDate,
                    registrationId,
                    shareCapital,
                    status,
                    taxIdentificationNumber,
                    type,
                    websiteUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Company = apply {
            if (validated) {
                return@apply
            }

            name()
            address()
            commercialName()
            country()
            email()
            employerIdentificationNumber()
            legalForm()
            phoneNumber()
            registrationDate()
            registrationId()
            shareCapital()
            status()
            taxIdentificationNumber()
            type()
            websiteUrl()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (address.asKnown().isPresent) 1 else 0) +
                (if (commercialName.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (employerIdentificationNumber.asKnown().isPresent) 1 else 0) +
                (if (legalForm.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (registrationDate.asKnown().isPresent) 1 else 0) +
                (if (registrationId.asKnown().isPresent) 1 else 0) +
                (if (shareCapital.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (taxIdentificationNumber.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (websiteUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Company &&
                name == other.name &&
                address == other.address &&
                commercialName == other.commercialName &&
                country == other.country &&
                email == other.email &&
                employerIdentificationNumber == other.employerIdentificationNumber &&
                legalForm == other.legalForm &&
                phoneNumber == other.phoneNumber &&
                registrationDate == other.registrationDate &&
                registrationId == other.registrationId &&
                shareCapital == other.shareCapital &&
                status == other.status &&
                taxIdentificationNumber == other.taxIdentificationNumber &&
                type == other.type &&
                websiteUrl == other.websiteUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                address,
                commercialName,
                country,
                email,
                employerIdentificationNumber,
                legalForm,
                phoneNumber,
                registrationDate,
                registrationId,
                shareCapital,
                status,
                taxIdentificationNumber,
                type,
                websiteUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Company{name=$name, address=$address, commercialName=$commercialName, country=$country, email=$email, employerIdentificationNumber=$employerIdentificationNumber, legalForm=$legalForm, phoneNumber=$phoneNumber, registrationDate=$registrationDate, registrationId=$registrationId, shareCapital=$shareCapital, status=$status, taxIdentificationNumber=$taxIdentificationNumber, type=$type, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
    }

    /** Technical metadata and callback configuration. */
    class TechnicalData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val activeAmlSuspicions: JsonField<Boolean>,
        private val callbackUrl: JsonField<String>,
        private val callbackUrlNotification: JsonField<String>,
        private val filteringScoreAmlSuspicions: JsonField<Float>,
        private val language: JsonField<String>,
        private val rawData: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active_aml_suspicions")
            @ExcludeMissing
            activeAmlSuspicions: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("callback_url")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("callback_url_notification")
            @ExcludeMissing
            callbackUrlNotification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filtering_score_aml_suspicions")
            @ExcludeMissing
            filteringScoreAmlSuspicions: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("raw_data") @ExcludeMissing rawData: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            activeAmlSuspicions,
            callbackUrl,
            callbackUrlNotification,
            filteringScoreAmlSuspicions,
            language,
            rawData,
            mutableMapOf(),
        )

        /**
         * Flag indicating whether there are active research AML (Anti-Money Laundering) suspicions
         * for the company when you apply for a new entry or get an existing one.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun activeAmlSuspicions(): Optional<Boolean> =
            activeAmlSuspicions.getOptional("active_aml_suspicions")

        /**
         * URL to receive a callback once the company is processed.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callback_url")

        /**
         * URL to receive notifications about the processing state and status.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun callbackUrlNotification(): Optional<String> =
            callbackUrlNotification.getOptional("callback_url_notification")

        /**
         * Minimum filtering score (between 0 and 1) for AML suspicions to be considered.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filteringScoreAmlSuspicions(): Optional<Float> =
            filteringScoreAmlSuspicions.getOptional("filtering_score_aml_suspicions")

        /**
         * Preferred language for responses or notifications (e.g., "eng", "fra").
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Flag indicating whether to include raw data in the response.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rawData(): Optional<Boolean> = rawData.getOptional("raw_data")

        /**
         * Returns the raw JSON value of [activeAmlSuspicions].
         *
         * Unlike [activeAmlSuspicions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("active_aml_suspicions")
        @ExcludeMissing
        fun _activeAmlSuspicions(): JsonField<Boolean> = activeAmlSuspicions

        /**
         * Returns the raw JSON value of [callbackUrl].
         *
         * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callback_url")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

        /**
         * Returns the raw JSON value of [callbackUrlNotification].
         *
         * Unlike [callbackUrlNotification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("callback_url_notification")
        @ExcludeMissing
        fun _callbackUrlNotification(): JsonField<String> = callbackUrlNotification

        /**
         * Returns the raw JSON value of [filteringScoreAmlSuspicions].
         *
         * Unlike [filteringScoreAmlSuspicions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("filtering_score_aml_suspicions")
        @ExcludeMissing
        fun _filteringScoreAmlSuspicions(): JsonField<Float> = filteringScoreAmlSuspicions

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [rawData].
         *
         * Unlike [rawData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw_data") @ExcludeMissing fun _rawData(): JsonField<Boolean> = rawData

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

            /** Returns a mutable builder for constructing an instance of [TechnicalData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TechnicalData]. */
        class Builder internal constructor() {

            private var activeAmlSuspicions: JsonField<Boolean> = JsonMissing.of()
            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var callbackUrlNotification: JsonField<String> = JsonMissing.of()
            private var filteringScoreAmlSuspicions: JsonField<Float> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var rawData: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(technicalData: TechnicalData) = apply {
                activeAmlSuspicions = technicalData.activeAmlSuspicions
                callbackUrl = technicalData.callbackUrl
                callbackUrlNotification = technicalData.callbackUrlNotification
                filteringScoreAmlSuspicions = technicalData.filteringScoreAmlSuspicions
                language = technicalData.language
                rawData = technicalData.rawData
                additionalProperties = technicalData.additionalProperties.toMutableMap()
            }

            /**
             * Flag indicating whether there are active research AML (Anti-Money Laundering)
             * suspicions for the company when you apply for a new entry or get an existing one.
             */
            fun activeAmlSuspicions(activeAmlSuspicions: Boolean) =
                activeAmlSuspicions(JsonField.of(activeAmlSuspicions))

            /**
             * Sets [Builder.activeAmlSuspicions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activeAmlSuspicions] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun activeAmlSuspicions(activeAmlSuspicions: JsonField<Boolean>) = apply {
                this.activeAmlSuspicions = activeAmlSuspicions
            }

            /** URL to receive a callback once the company is processed. */
            fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

            /**
             * Sets [Builder.callbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackUrl(callbackUrl: JsonField<String>) = apply {
                this.callbackUrl = callbackUrl
            }

            /** URL to receive notifications about the processing state and status. */
            fun callbackUrlNotification(callbackUrlNotification: String) =
                callbackUrlNotification(JsonField.of(callbackUrlNotification))

            /**
             * Sets [Builder.callbackUrlNotification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackUrlNotification] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callbackUrlNotification(callbackUrlNotification: JsonField<String>) = apply {
                this.callbackUrlNotification = callbackUrlNotification
            }

            /** Minimum filtering score (between 0 and 1) for AML suspicions to be considered. */
            fun filteringScoreAmlSuspicions(filteringScoreAmlSuspicions: Float) =
                filteringScoreAmlSuspicions(JsonField.of(filteringScoreAmlSuspicions))

            /**
             * Sets [Builder.filteringScoreAmlSuspicions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filteringScoreAmlSuspicions] with a well-typed
             * [Float] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun filteringScoreAmlSuspicions(filteringScoreAmlSuspicions: JsonField<Float>) = apply {
                this.filteringScoreAmlSuspicions = filteringScoreAmlSuspicions
            }

            /** Preferred language for responses or notifications (e.g., "eng", "fra"). */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Flag indicating whether to include raw data in the response. */
            fun rawData(rawData: Boolean) = rawData(JsonField.of(rawData))

            /**
             * Sets [Builder.rawData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rawData] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rawData(rawData: JsonField<Boolean>) = apply { this.rawData = rawData }

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
             * Returns an immutable instance of [TechnicalData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TechnicalData =
                TechnicalData(
                    activeAmlSuspicions,
                    callbackUrl,
                    callbackUrlNotification,
                    filteringScoreAmlSuspicions,
                    language,
                    rawData,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TechnicalData = apply {
            if (validated) {
                return@apply
            }

            activeAmlSuspicions()
            callbackUrl()
            callbackUrlNotification()
            filteringScoreAmlSuspicions()
            language()
            rawData()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (activeAmlSuspicions.asKnown().isPresent) 1 else 0) +
                (if (callbackUrl.asKnown().isPresent) 1 else 0) +
                (if (callbackUrlNotification.asKnown().isPresent) 1 else 0) +
                (if (filteringScoreAmlSuspicions.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (rawData.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TechnicalData &&
                activeAmlSuspicions == other.activeAmlSuspicions &&
                callbackUrl == other.callbackUrl &&
                callbackUrlNotification == other.callbackUrlNotification &&
                filteringScoreAmlSuspicions == other.filteringScoreAmlSuspicions &&
                language == other.language &&
                rawData == other.rawData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activeAmlSuspicions,
                callbackUrl,
                callbackUrlNotification,
                filteringScoreAmlSuspicions,
                language,
                rawData,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TechnicalData{activeAmlSuspicions=$activeAmlSuspicions, callbackUrl=$callbackUrl, callbackUrlNotification=$callbackUrlNotification, filteringScoreAmlSuspicions=$filteringScoreAmlSuspicions, language=$language, rawData=$rawData, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CompanyCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
