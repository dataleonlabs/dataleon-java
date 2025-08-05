// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models.companies

import com.dataleon.api.core.Enum
import com.dataleon.api.core.ExcludeMissing
import com.dataleon.api.core.JsonField
import com.dataleon.api.core.JsonMissing
import com.dataleon.api.core.JsonValue
import com.dataleon.api.core.checkKnown
import com.dataleon.api.core.toImmutable
import com.dataleon.api.errors.DataleonInvalidDataException
import com.dataleon.api.models.Check
import com.dataleon.api.models.individuals.documents.GenericDocument
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CompanyRegistration
private constructor(
    private val amlSuspicions: JsonField<List<AmlSuspicion>>,
    private val certificat: JsonField<Certificat>,
    private val checks: JsonField<List<Check>>,
    private val company: JsonField<Company>,
    private val documents: JsonField<List<GenericDocument>>,
    private val members: JsonField<List<Member>>,
    private val portalUrl: JsonField<String>,
    private val properties: JsonField<List<Property>>,
    private val risk: JsonField<Risk>,
    private val sourceId: JsonField<String>,
    private val technicalData: JsonField<TechnicalData>,
    private val webviewUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aml_suspicions")
        @ExcludeMissing
        amlSuspicions: JsonField<List<AmlSuspicion>> = JsonMissing.of(),
        @JsonProperty("certificat")
        @ExcludeMissing
        certificat: JsonField<Certificat> = JsonMissing.of(),
        @JsonProperty("checks") @ExcludeMissing checks: JsonField<List<Check>> = JsonMissing.of(),
        @JsonProperty("company") @ExcludeMissing company: JsonField<Company> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<GenericDocument>> = JsonMissing.of(),
        @JsonProperty("members")
        @ExcludeMissing
        members: JsonField<List<Member>> = JsonMissing.of(),
        @JsonProperty("portal_url") @ExcludeMissing portalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<Property>> = JsonMissing.of(),
        @JsonProperty("risk") @ExcludeMissing risk: JsonField<Risk> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("technical_data")
        @ExcludeMissing
        technicalData: JsonField<TechnicalData> = JsonMissing.of(),
        @JsonProperty("webview_url")
        @ExcludeMissing
        webviewUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        amlSuspicions,
        certificat,
        checks,
        company,
        documents,
        members,
        portalUrl,
        properties,
        risk,
        sourceId,
        technicalData,
        webviewUrl,
        mutableMapOf(),
    )

    /**
     * List of AML (Anti-Money Laundering) suspicion entries linked to the company, including their
     * details.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amlSuspicions(): Optional<List<AmlSuspicion>> = amlSuspicions.getOptional("aml_suspicions")

    /**
     * Digital certificate associated with the company, if any, including its creation timestamp and
     * filename.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certificat(): Optional<Certificat> = certificat.getOptional("certificat")

    /**
     * List of verification or validation checks applied to the company, including their results and
     * messages.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checks(): Optional<List<Check>> = checks.getOptional("checks")

    /**
     * Main information about the company being registered, including legal name, registration ID,
     * and address.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun company(): Optional<Company> = company.getOptional("company")

    /**
     * All documents submitted or associated with the company, including their metadata and
     * processing status.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<GenericDocument>> = documents.getOptional("documents")

    /**
     * List of members or actors associated with the company, including personal and ownership
     * information.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun members(): Optional<List<Member>> = members.getOptional("members")

    /**
     * Admin or internal portal URL for viewing the company's details, typically used by internal
     * users.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portalUrl(): Optional<String> = portalUrl.getOptional("portal_url")

    /**
     * Custom key-value metadata fields associated with the company, allowing for flexible data
     * storage.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<List<Property>> = properties.getOptional("properties")

    /**
     * Risk assessment associated with the company, including a risk code, reason, and confidence
     * score.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun risk(): Optional<Risk> = risk.getOptional("risk")

    /**
     * Optional identifier indicating the source of the company record, useful for tracking or
     * integration purposes.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceId(): Optional<String> = sourceId.getOptional("source_id")

    /**
     * Technical metadata related to the request, such as IP address, QR code settings, and callback
     * URLs.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technicalData(): Optional<TechnicalData> = technicalData.getOptional("technical_data")

    /**
     * Public-facing webview URL for the company’s identification process, allowing external access
     * to the company data.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webviewUrl(): Optional<String> = webviewUrl.getOptional("webview_url")

    /**
     * Returns the raw JSON value of [amlSuspicions].
     *
     * Unlike [amlSuspicions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aml_suspicions")
    @ExcludeMissing
    fun _amlSuspicions(): JsonField<List<AmlSuspicion>> = amlSuspicions

    /**
     * Returns the raw JSON value of [certificat].
     *
     * Unlike [certificat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("certificat")
    @ExcludeMissing
    fun _certificat(): JsonField<Certificat> = certificat

    /**
     * Returns the raw JSON value of [checks].
     *
     * Unlike [checks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checks") @ExcludeMissing fun _checks(): JsonField<List<Check>> = checks

    /**
     * Returns the raw JSON value of [company].
     *
     * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<Company> = company

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<GenericDocument>> = documents

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("members") @ExcludeMissing fun _members(): JsonField<List<Member>> = members

    /**
     * Returns the raw JSON value of [portalUrl].
     *
     * Unlike [portalUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portal_url") @ExcludeMissing fun _portalUrl(): JsonField<String> = portalUrl

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<Property>> = properties

    /**
     * Returns the raw JSON value of [risk].
     *
     * Unlike [risk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("risk") @ExcludeMissing fun _risk(): JsonField<Risk> = risk

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /**
     * Returns the raw JSON value of [technicalData].
     *
     * Unlike [technicalData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("technical_data")
    @ExcludeMissing
    fun _technicalData(): JsonField<TechnicalData> = technicalData

    /**
     * Returns the raw JSON value of [webviewUrl].
     *
     * Unlike [webviewUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webview_url") @ExcludeMissing fun _webviewUrl(): JsonField<String> = webviewUrl

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

        /** Returns a mutable builder for constructing an instance of [CompanyRegistration]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyRegistration]. */
    class Builder internal constructor() {

        private var amlSuspicions: JsonField<MutableList<AmlSuspicion>>? = null
        private var certificat: JsonField<Certificat> = JsonMissing.of()
        private var checks: JsonField<MutableList<Check>>? = null
        private var company: JsonField<Company> = JsonMissing.of()
        private var documents: JsonField<MutableList<GenericDocument>>? = null
        private var members: JsonField<MutableList<Member>>? = null
        private var portalUrl: JsonField<String> = JsonMissing.of()
        private var properties: JsonField<MutableList<Property>>? = null
        private var risk: JsonField<Risk> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var technicalData: JsonField<TechnicalData> = JsonMissing.of()
        private var webviewUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyRegistration: CompanyRegistration) = apply {
            amlSuspicions = companyRegistration.amlSuspicions.map { it.toMutableList() }
            certificat = companyRegistration.certificat
            checks = companyRegistration.checks.map { it.toMutableList() }
            company = companyRegistration.company
            documents = companyRegistration.documents.map { it.toMutableList() }
            members = companyRegistration.members.map { it.toMutableList() }
            portalUrl = companyRegistration.portalUrl
            properties = companyRegistration.properties.map { it.toMutableList() }
            risk = companyRegistration.risk
            sourceId = companyRegistration.sourceId
            technicalData = companyRegistration.technicalData
            webviewUrl = companyRegistration.webviewUrl
            additionalProperties = companyRegistration.additionalProperties.toMutableMap()
        }

        /**
         * List of AML (Anti-Money Laundering) suspicion entries linked to the company, including
         * their details.
         */
        fun amlSuspicions(amlSuspicions: List<AmlSuspicion>) =
            amlSuspicions(JsonField.of(amlSuspicions))

        /**
         * Sets [Builder.amlSuspicions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amlSuspicions] with a well-typed `List<AmlSuspicion>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun amlSuspicions(amlSuspicions: JsonField<List<AmlSuspicion>>) = apply {
            this.amlSuspicions = amlSuspicions.map { it.toMutableList() }
        }

        /**
         * Adds a single [AmlSuspicion] to [amlSuspicions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAmlSuspicion(amlSuspicion: AmlSuspicion) = apply {
            amlSuspicions =
                (amlSuspicions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("amlSuspicions", it).add(amlSuspicion)
                }
        }

        /**
         * Digital certificate associated with the company, if any, including its creation timestamp
         * and filename.
         */
        fun certificat(certificat: Certificat) = certificat(JsonField.of(certificat))

        /**
         * Sets [Builder.certificat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certificat] with a well-typed [Certificat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certificat(certificat: JsonField<Certificat>) = apply { this.certificat = certificat }

        /**
         * List of verification or validation checks applied to the company, including their results
         * and messages.
         */
        fun checks(checks: List<Check>) = checks(JsonField.of(checks))

        /**
         * Sets [Builder.checks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checks] with a well-typed `List<Check>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checks(checks: JsonField<List<Check>>) = apply {
            this.checks = checks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Check] to [checks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCheck(check: Check) = apply {
            checks =
                (checks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("checks", it).add(check)
                }
        }

        /**
         * Main information about the company being registered, including legal name, registration
         * ID, and address.
         */
        fun company(company: Company) = company(JsonField.of(company))

        /**
         * Sets [Builder.company] to an arbitrary JSON value.
         *
         * You should usually call [Builder.company] with a well-typed [Company] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun company(company: JsonField<Company>) = apply { this.company = company }

        /**
         * All documents submitted or associated with the company, including their metadata and
         * processing status.
         */
        fun documents(documents: List<GenericDocument>) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<GenericDocument>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documents(documents: JsonField<List<GenericDocument>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [GenericDocument] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: GenericDocument) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        /**
         * List of members or actors associated with the company, including personal and ownership
         * information.
         */
        fun members(members: List<Member>) = members(JsonField.of(members))

        /**
         * Sets [Builder.members] to an arbitrary JSON value.
         *
         * You should usually call [Builder.members] with a well-typed `List<Member>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun members(members: JsonField<List<Member>>) = apply {
            this.members = members.map { it.toMutableList() }
        }

        /**
         * Adds a single [Member] to [members].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMember(member: Member) = apply {
            members =
                (members ?: JsonField.of(mutableListOf())).also {
                    checkKnown("members", it).add(member)
                }
        }

        /**
         * Admin or internal portal URL for viewing the company's details, typically used by
         * internal users.
         */
        fun portalUrl(portalUrl: String) = portalUrl(JsonField.of(portalUrl))

        /**
         * Sets [Builder.portalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun portalUrl(portalUrl: JsonField<String>) = apply { this.portalUrl = portalUrl }

        /**
         * Custom key-value metadata fields associated with the company, allowing for flexible data
         * storage.
         */
        fun properties(properties: List<Property>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<Property>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<List<Property>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [Property] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: Property) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
        }

        /**
         * Risk assessment associated with the company, including a risk code, reason, and
         * confidence score.
         */
        fun risk(risk: Risk) = risk(JsonField.of(risk))

        /**
         * Sets [Builder.risk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.risk] with a well-typed [Risk] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun risk(risk: JsonField<Risk>) = apply { this.risk = risk }

        /**
         * Optional identifier indicating the source of the company record, useful for tracking or
         * integration purposes.
         */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /**
         * Technical metadata related to the request, such as IP address, QR code settings, and
         * callback URLs.
         */
        fun technicalData(technicalData: TechnicalData) = technicalData(JsonField.of(technicalData))

        /**
         * Sets [Builder.technicalData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technicalData] with a well-typed [TechnicalData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun technicalData(technicalData: JsonField<TechnicalData>) = apply {
            this.technicalData = technicalData
        }

        /**
         * Public-facing webview URL for the company’s identification process, allowing external
         * access to the company data.
         */
        fun webviewUrl(webviewUrl: String) = webviewUrl(JsonField.of(webviewUrl))

        /**
         * Sets [Builder.webviewUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webviewUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webviewUrl(webviewUrl: JsonField<String>) = apply { this.webviewUrl = webviewUrl }

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
         * Returns an immutable instance of [CompanyRegistration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CompanyRegistration =
            CompanyRegistration(
                (amlSuspicions ?: JsonMissing.of()).map { it.toImmutable() },
                certificat,
                (checks ?: JsonMissing.of()).map { it.toImmutable() },
                company,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                (members ?: JsonMissing.of()).map { it.toImmutable() },
                portalUrl,
                (properties ?: JsonMissing.of()).map { it.toImmutable() },
                risk,
                sourceId,
                technicalData,
                webviewUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CompanyRegistration = apply {
        if (validated) {
            return@apply
        }

        amlSuspicions().ifPresent { it.forEach { it.validate() } }
        certificat().ifPresent { it.validate() }
        checks().ifPresent { it.forEach { it.validate() } }
        company().ifPresent { it.validate() }
        documents().ifPresent { it.forEach { it.validate() } }
        members().ifPresent { it.forEach { it.validate() } }
        portalUrl()
        properties().ifPresent { it.forEach { it.validate() } }
        risk().ifPresent { it.validate() }
        sourceId()
        technicalData().ifPresent { it.validate() }
        webviewUrl()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (amlSuspicions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (certificat.asKnown().getOrNull()?.validity() ?: 0) +
            (checks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (company.asKnown().getOrNull()?.validity() ?: 0) +
            (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (members.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (portalUrl.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (risk.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceId.asKnown().isPresent) 1 else 0) +
            (technicalData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webviewUrl.asKnown().isPresent) 1 else 0)

    /**
     * Represents a record of suspicion raised during Anti-Money Laundering (AML) screening.
     * Includes metadata such as risk score, origin, and linked watchlist types.
     */
    class AmlSuspicion
    private constructor(
        private val caption: JsonField<String>,
        private val checked: JsonField<Boolean>,
        private val relation: JsonField<String>,
        private val schema: JsonField<String>,
        private val score: JsonField<Float>,
        private val source: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("caption") @ExcludeMissing caption: JsonField<String> = JsonMissing.of(),
            @JsonProperty("checked") @ExcludeMissing checked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("relation")
            @ExcludeMissing
            relation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("schema") @ExcludeMissing schema: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(caption, checked, relation, schema, score, source, type, mutableMapOf())

        /**
         * Human-readable description or title for the suspicious finding.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun caption(): Optional<String> = caption.getOptional("caption")

        /**
         * Indicates whether this suspicion has been manually reviewed or confirmed.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun checked(): Optional<Boolean> = checked.getOptional("checked")

        /**
         * Nature of the relationship between the entity and the suspicious activity (e.g.,
         * "linked", "associated").
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun relation(): Optional<String> = relation.getOptional("relation")

        /**
         * Version of the evaluation schema or rule engine used.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun schema(): Optional<String> = schema.getOptional("schema")

        /**
         * Risk score between 0.0 and 1.0 indicating the severity of the suspicion.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Float> = score.getOptional("score")

        /**
         * URL identifying the source system or service providing this suspicion.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * Watchlist category associated with the suspicion. Possible values include Watchlist types
         * like "PEP", "Sanctions", "RiskyEntity", or "Crime".
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [caption].
         *
         * Unlike [caption], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonField<String> = caption

        /**
         * Returns the raw JSON value of [checked].
         *
         * Unlike [checked], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("checked") @ExcludeMissing fun _checked(): JsonField<Boolean> = checked

        /**
         * Returns the raw JSON value of [relation].
         *
         * Unlike [relation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("relation") @ExcludeMissing fun _relation(): JsonField<String> = relation

        /**
         * Returns the raw JSON value of [schema].
         *
         * Unlike [schema], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<String> = schema

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Float> = score

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [AmlSuspicion]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AmlSuspicion]. */
        class Builder internal constructor() {

            private var caption: JsonField<String> = JsonMissing.of()
            private var checked: JsonField<Boolean> = JsonMissing.of()
            private var relation: JsonField<String> = JsonMissing.of()
            private var schema: JsonField<String> = JsonMissing.of()
            private var score: JsonField<Float> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amlSuspicion: AmlSuspicion) = apply {
                caption = amlSuspicion.caption
                checked = amlSuspicion.checked
                relation = amlSuspicion.relation
                schema = amlSuspicion.schema
                score = amlSuspicion.score
                source = amlSuspicion.source
                type = amlSuspicion.type
                additionalProperties = amlSuspicion.additionalProperties.toMutableMap()
            }

            /** Human-readable description or title for the suspicious finding. */
            fun caption(caption: String) = caption(JsonField.of(caption))

            /**
             * Sets [Builder.caption] to an arbitrary JSON value.
             *
             * You should usually call [Builder.caption] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun caption(caption: JsonField<String>) = apply { this.caption = caption }

            /** Indicates whether this suspicion has been manually reviewed or confirmed. */
            fun checked(checked: Boolean) = checked(JsonField.of(checked))

            /**
             * Sets [Builder.checked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checked] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checked(checked: JsonField<Boolean>) = apply { this.checked = checked }

            /**
             * Nature of the relationship between the entity and the suspicious activity (e.g.,
             * "linked", "associated").
             */
            fun relation(relation: String) = relation(JsonField.of(relation))

            /**
             * Sets [Builder.relation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relation] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relation(relation: JsonField<String>) = apply { this.relation = relation }

            /** Version of the evaluation schema or rule engine used. */
            fun schema(schema: String) = schema(JsonField.of(schema))

            /**
             * Sets [Builder.schema] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schema] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schema(schema: JsonField<String>) = apply { this.schema = schema }

            /** Risk score between 0.0 and 1.0 indicating the severity of the suspicion. */
            fun score(score: Float) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun score(score: JsonField<Float>) = apply { this.score = score }

            /** URL identifying the source system or service providing this suspicion. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /**
             * Watchlist category associated with the suspicion. Possible values include Watchlist
             * types like "PEP", "Sanctions", "RiskyEntity", or "Crime".
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [AmlSuspicion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AmlSuspicion =
                AmlSuspicion(
                    caption,
                    checked,
                    relation,
                    schema,
                    score,
                    source,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AmlSuspicion = apply {
            if (validated) {
                return@apply
            }

            caption()
            checked()
            relation()
            schema()
            score()
            source()
            type().ifPresent { it.validate() }
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
            (if (caption.asKnown().isPresent) 1 else 0) +
                (if (checked.asKnown().isPresent) 1 else 0) +
                (if (relation.asKnown().isPresent) 1 else 0) +
                (if (schema.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Watchlist category associated with the suspicion. Possible values include Watchlist types
         * like "PEP", "Sanctions", "RiskyEntity", or "Crime".
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WATCHLIST = of("Watchlist")

                @JvmField val PEP = of("PEP")

                @JvmField val SANCTIONS = of("Sanctions")

                @JvmField val RISKY_ENTITY = of("RiskyEntity")

                @JvmField val CRIME = of("Crime")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                WATCHLIST,
                PEP,
                SANCTIONS,
                RISKY_ENTITY,
                CRIME,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WATCHLIST,
                PEP,
                SANCTIONS,
                RISKY_ENTITY,
                CRIME,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WATCHLIST -> Value.WATCHLIST
                    PEP -> Value.PEP
                    SANCTIONS -> Value.SANCTIONS
                    RISKY_ENTITY -> Value.RISKY_ENTITY
                    CRIME -> Value.CRIME
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DataleonInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WATCHLIST -> Known.WATCHLIST
                    PEP -> Known.PEP
                    SANCTIONS -> Known.SANCTIONS
                    RISKY_ENTITY -> Known.RISKY_ENTITY
                    CRIME -> Known.CRIME
                    else -> throw DataleonInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DataleonInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    DataleonInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AmlSuspicion && caption == other.caption && checked == other.checked && relation == other.relation && schema == other.schema && score == other.score && source == other.source && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(caption, checked, relation, schema, score, source, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AmlSuspicion{caption=$caption, checked=$checked, relation=$relation, schema=$schema, score=$score, source=$source, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Digital certificate associated with the company, if any, including its creation timestamp and
     * filename.
     */
    class Certificat
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val filename: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        ) : this(id, createdAt, filename, mutableMapOf())

        /**
         * Unique identifier for the certificate.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Timestamp when the certificate was created.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Name of the certificate file.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filename(): Optional<String> = filename.getOptional("filename")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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

            /** Returns a mutable builder for constructing an instance of [Certificat]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Certificat]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(certificat: Certificat) = apply {
                id = certificat.id
                createdAt = certificat.createdAt
                filename = certificat.filename
                additionalProperties = certificat.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the certificate. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Timestamp when the certificate was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Name of the certificate file. */
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
             * Returns an immutable instance of [Certificat].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Certificat =
                Certificat(id, createdAt, filename, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Certificat = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            filename()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Certificat && id == other.id && createdAt == other.createdAt && filename == other.filename && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, filename, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Certificat{id=$id, createdAt=$createdAt, filename=$filename, additionalProperties=$additionalProperties}"
    }

    /**
     * Main information about the company being registered, including legal name, registration ID,
     * and address.
     */
    class Company
    private constructor(
        private val address: JsonField<String>,
        private val commercialName: JsonField<String>,
        private val country: JsonField<String>,
        private val email: JsonField<String>,
        private val employerIdentificationNumber: JsonField<String>,
        private val legalForm: JsonField<String>,
        private val name: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val registrationDate: JsonField<LocalDate>,
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
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_date")
            @ExcludeMissing
            registrationDate: JsonField<LocalDate> = JsonMissing.of(),
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
            address,
            commercialName,
            country,
            email,
            employerIdentificationNumber,
            legalForm,
            name,
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
         * Full registered address of the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * Trade or commercial name of the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commercialName(): Optional<String> = commercialName.getOptional("commercial_name")

        /**
         * Country code where the company is registered.
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
         * Legal form or structure of the company (e.g., LLC, SARL).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun legalForm(): Optional<String> = legalForm.getOptional("legal_form")

        /**
         * Legal registered name of the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Contact phone number for the company, including country code.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Date when the company was officially registered.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registrationDate(): Optional<LocalDate> =
            registrationDate.getOptional("registration_date")

        /**
         * Official company registration number or ID.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registrationId(): Optional<String> = registrationId.getOptional("registration_id")

        /**
         * Total share capital of the company, including currency.
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
         * Tax identification number for the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxIdentificationNumber(): Optional<String> =
            taxIdentificationNumber.getOptional("tax_identification_number")

        /**
         * Type of company within the workspace, e.g., main or affiliated.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Official website URL of the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun websiteUrl(): Optional<String> = websiteUrl.getOptional("website_url")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
        fun _registrationDate(): JsonField<LocalDate> = registrationDate

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

            /** Returns a mutable builder for constructing an instance of [Company]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Company]. */
        class Builder internal constructor() {

            private var address: JsonField<String> = JsonMissing.of()
            private var commercialName: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var employerIdentificationNumber: JsonField<String> = JsonMissing.of()
            private var legalForm: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var registrationDate: JsonField<LocalDate> = JsonMissing.of()
            private var registrationId: JsonField<String> = JsonMissing.of()
            private var shareCapital: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var taxIdentificationNumber: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var websiteUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(company: Company) = apply {
                address = company.address
                commercialName = company.commercialName
                country = company.country
                email = company.email
                employerIdentificationNumber = company.employerIdentificationNumber
                legalForm = company.legalForm
                name = company.name
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

            /** Full registered address of the company. */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Trade or commercial name of the company. */
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

            /** Country code where the company is registered. */
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

            /** Legal form or structure of the company (e.g., LLC, SARL). */
            fun legalForm(legalForm: String) = legalForm(JsonField.of(legalForm))

            /**
             * Sets [Builder.legalForm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalForm] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalForm(legalForm: JsonField<String>) = apply { this.legalForm = legalForm }

            /** Legal registered name of the company. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Contact phone number for the company, including country code. */
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

            /** Date when the company was officially registered. */
            fun registrationDate(registrationDate: LocalDate) =
                registrationDate(JsonField.of(registrationDate))

            /**
             * Sets [Builder.registrationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun registrationDate(registrationDate: JsonField<LocalDate>) = apply {
                this.registrationDate = registrationDate
            }

            /** Official company registration number or ID. */
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

            /** Total share capital of the company, including currency. */
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

            /** Tax identification number for the company. */
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

            /** Type of company within the workspace, e.g., main or affiliated. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Official website URL of the company. */
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
             */
            fun build(): Company =
                Company(
                    address,
                    commercialName,
                    country,
                    email,
                    employerIdentificationNumber,
                    legalForm,
                    name,
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

            address()
            commercialName()
            country()
            email()
            employerIdentificationNumber()
            legalForm()
            name()
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
            (if (address.asKnown().isPresent) 1 else 0) +
                (if (commercialName.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (employerIdentificationNumber.asKnown().isPresent) 1 else 0) +
                (if (legalForm.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
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

            return /* spotless:off */ other is Company && address == other.address && commercialName == other.commercialName && country == other.country && email == other.email && employerIdentificationNumber == other.employerIdentificationNumber && legalForm == other.legalForm && name == other.name && phoneNumber == other.phoneNumber && registrationDate == other.registrationDate && registrationId == other.registrationId && shareCapital == other.shareCapital && status == other.status && taxIdentificationNumber == other.taxIdentificationNumber && type == other.type && websiteUrl == other.websiteUrl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, commercialName, country, email, employerIdentificationNumber, legalForm, name, phoneNumber, registrationDate, registrationId, shareCapital, status, taxIdentificationNumber, type, websiteUrl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Company{address=$address, commercialName=$commercialName, country=$country, email=$email, employerIdentificationNumber=$employerIdentificationNumber, legalForm=$legalForm, name=$name, phoneNumber=$phoneNumber, registrationDate=$registrationDate, registrationId=$registrationId, shareCapital=$shareCapital, status=$status, taxIdentificationNumber=$taxIdentificationNumber, type=$type, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
    }

    /** Represents a member or actor of a company, including personal and ownership information. */
    class Member
    private constructor(
        private val id: JsonField<String>,
        private val address: JsonField<String>,
        private val birthday: JsonField<OffsetDateTime>,
        private val birthplace: JsonField<String>,
        private val country: JsonField<String>,
        private val documents: JsonField<List<GenericDocument>>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val isBeneficialOwner: JsonField<Boolean>,
        private val isDelegator: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val livenessVerification: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val ownershipPercentage: JsonField<Long>,
        private val phoneNumber: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val registrationId: JsonField<String>,
        private val relation: JsonField<String>,
        private val roles: JsonField<String>,
        private val source: JsonField<Source>,
        private val state: JsonField<String>,
        private val status: JsonField<String>,
        private val type: JsonField<Type>,
        private val workspaceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("birthday")
            @ExcludeMissing
            birthday: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("birthplace")
            @ExcludeMissing
            birthplace: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<List<GenericDocument>> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_beneficial_owner")
            @ExcludeMissing
            isBeneficialOwner: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_delegator")
            @ExcludeMissing
            isDelegator: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("liveness_verification")
            @ExcludeMissing
            livenessVerification: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ownership_percentage")
            @ExcludeMissing
            ownershipPercentage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_id")
            @ExcludeMissing
            registrationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("relation")
            @ExcludeMissing
            relation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("roles") @ExcludeMissing roles: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("workspace_id")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            address,
            birthday,
            birthplace,
            country,
            documents,
            email,
            firstName,
            isBeneficialOwner,
            isDelegator,
            lastName,
            livenessVerification,
            name,
            ownershipPercentage,
            phoneNumber,
            postalCode,
            registrationId,
            relation,
            roles,
            source,
            state,
            status,
            type,
            workspaceId,
            mutableMapOf(),
        )

        /**
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Address of the member, which may include street, city, postal code, and country.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * Birthday (available only if type = person)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun birthday(): Optional<OffsetDateTime> = birthday.getOptional("birthday")

        /**
         * Birthplace (available only if type = person)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun birthplace(): Optional<String> = birthplace.getOptional("birthplace")

        /**
         * ISO 3166-1 alpha-2 country code of the member's address (e.g., "FR" for France).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * List of documents associated with the member, including their metadata and processing
         * status.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun documents(): Optional<List<GenericDocument>> = documents.getOptional("documents")

        /**
         * Email address of the member, which may be used for communication or verification
         * purposes.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * First name (available only if type = person)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * Indicates whether the member is a beneficial owner of the company, meaning they have
         * significant control or ownership.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isBeneficialOwner(): Optional<Boolean> =
            isBeneficialOwner.getOptional("is_beneficial_owner")

        /**
         * Indicates whether the member is a delegator, meaning they have authority to act on behalf
         * of the company.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isDelegator(): Optional<Boolean> = isDelegator.getOptional("is_delegator")

        /**
         * Last name (available only if type = person)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

        /**
         * Indicates whether liveness verification was performed for the member, typically in the
         * context of identity checks.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun livenessVerification(): Optional<Boolean> =
            livenessVerification.getOptional("liveness_verification")

        /**
         * Company name (available only if type = company)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Percentage of ownership the member has in the company, expressed as an integer between 0
         * and 100.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ownershipPercentage(): Optional<Long> =
            ownershipPercentage.getOptional("ownership_percentage")

        /**
         * Contact phone number of the member, including country code and area code.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Postal code of the member's address, typically a numeric or alphanumeric code.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

        /**
         * Official registration identifier of the member, such as a national ID or company
         * registration number.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registrationId(): Optional<String> = registrationId.getOptional("registration_id")

        /**
         * Type of relationship the member has with the company, such as "shareholder", "director",
         * or "beneficial_owner".
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun relation(): Optional<String> = relation.getOptional("relation")

        /**
         * Role of the member within the company, such as "legal_representative", "director", or
         * "manager".
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun roles(): Optional<String> = roles.getOptional("roles")

        /**
         * Source of the data (e.g., government, user, company)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun source(): Optional<Source> = source.getOptional("source")

        /**
         * Current state of the member in the workflow, such as "WAITING", "STARTED", "RUNNING", or
         * "PROCESSED".
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Status of the member in the system, indicating whether they are approved, pending, or
         * rejected. Possible values include "approved", "need_review", "rejected".
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Member type (person or company)
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Identifier of the workspace to which the member belongs, used for organizational
         * purposes.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [birthday].
         *
         * Unlike [birthday], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthday")
        @ExcludeMissing
        fun _birthday(): JsonField<OffsetDateTime> = birthday

        /**
         * Returns the raw JSON value of [birthplace].
         *
         * Unlike [birthplace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthplace")
        @ExcludeMissing
        fun _birthplace(): JsonField<String> = birthplace

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [documents].
         *
         * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): JsonField<List<GenericDocument>> = documents

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [isBeneficialOwner].
         *
         * Unlike [isBeneficialOwner], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_beneficial_owner")
        @ExcludeMissing
        fun _isBeneficialOwner(): JsonField<Boolean> = isBeneficialOwner

        /**
         * Returns the raw JSON value of [isDelegator].
         *
         * Unlike [isDelegator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_delegator")
        @ExcludeMissing
        fun _isDelegator(): JsonField<Boolean> = isDelegator

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [livenessVerification].
         *
         * Unlike [livenessVerification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("liveness_verification")
        @ExcludeMissing
        fun _livenessVerification(): JsonField<Boolean> = livenessVerification

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [ownershipPercentage].
         *
         * Unlike [ownershipPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ownership_percentage")
        @ExcludeMissing
        fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

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
         * Returns the raw JSON value of [relation].
         *
         * Unlike [relation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("relation") @ExcludeMissing fun _relation(): JsonField<String> = relation

        /**
         * Returns the raw JSON value of [roles].
         *
         * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<String> = roles

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspace_id")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

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

            /** Returns a mutable builder for constructing an instance of [Member]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Member]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var address: JsonField<String> = JsonMissing.of()
            private var birthday: JsonField<OffsetDateTime> = JsonMissing.of()
            private var birthplace: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var documents: JsonField<MutableList<GenericDocument>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var isBeneficialOwner: JsonField<Boolean> = JsonMissing.of()
            private var isDelegator: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var livenessVerification: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var ownershipPercentage: JsonField<Long> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var registrationId: JsonField<String> = JsonMissing.of()
            private var relation: JsonField<String> = JsonMissing.of()
            private var roles: JsonField<String> = JsonMissing.of()
            private var source: JsonField<Source> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var workspaceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(member: Member) = apply {
                id = member.id
                address = member.address
                birthday = member.birthday
                birthplace = member.birthplace
                country = member.country
                documents = member.documents.map { it.toMutableList() }
                email = member.email
                firstName = member.firstName
                isBeneficialOwner = member.isBeneficialOwner
                isDelegator = member.isDelegator
                lastName = member.lastName
                livenessVerification = member.livenessVerification
                name = member.name
                ownershipPercentage = member.ownershipPercentage
                phoneNumber = member.phoneNumber
                postalCode = member.postalCode
                registrationId = member.registrationId
                relation = member.relation
                roles = member.roles
                source = member.source
                state = member.state
                status = member.status
                type = member.type
                workspaceId = member.workspaceId
                additionalProperties = member.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Address of the member, which may include street, city, postal code, and country. */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Birthday (available only if type = person) */
            fun birthday(birthday: OffsetDateTime) = birthday(JsonField.of(birthday))

            /**
             * Sets [Builder.birthday] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthday] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthday(birthday: JsonField<OffsetDateTime>) = apply { this.birthday = birthday }

            /** Birthplace (available only if type = person) */
            fun birthplace(birthplace: String) = birthplace(JsonField.of(birthplace))

            /**
             * Sets [Builder.birthplace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthplace] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthplace(birthplace: JsonField<String>) = apply { this.birthplace = birthplace }

            /** ISO 3166-1 alpha-2 country code of the member's address (e.g., "FR" for France). */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * List of documents associated with the member, including their metadata and processing
             * status.
             */
            fun documents(documents: List<GenericDocument>) = documents(JsonField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documents] with a well-typed `List<GenericDocument>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun documents(documents: JsonField<List<GenericDocument>>) = apply {
                this.documents = documents.map { it.toMutableList() }
            }

            /**
             * Adds a single [GenericDocument] to [documents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocument(document: GenericDocument) = apply {
                documents =
                    (documents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documents", it).add(document)
                    }
            }

            /**
             * Email address of the member, which may be used for communication or verification
             * purposes.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** First name (available only if type = person) */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /**
             * Indicates whether the member is a beneficial owner of the company, meaning they have
             * significant control or ownership.
             */
            fun isBeneficialOwner(isBeneficialOwner: Boolean) =
                isBeneficialOwner(JsonField.of(isBeneficialOwner))

            /**
             * Sets [Builder.isBeneficialOwner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isBeneficialOwner] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isBeneficialOwner(isBeneficialOwner: JsonField<Boolean>) = apply {
                this.isBeneficialOwner = isBeneficialOwner
            }

            /**
             * Indicates whether the member is a delegator, meaning they have authority to act on
             * behalf of the company.
             */
            fun isDelegator(isDelegator: Boolean) = isDelegator(JsonField.of(isDelegator))

            /**
             * Sets [Builder.isDelegator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDelegator] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDelegator(isDelegator: JsonField<Boolean>) = apply {
                this.isDelegator = isDelegator
            }

            /** Last name (available only if type = person) */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /**
             * Indicates whether liveness verification was performed for the member, typically in
             * the context of identity checks.
             */
            fun livenessVerification(livenessVerification: Boolean) =
                livenessVerification(JsonField.of(livenessVerification))

            /**
             * Sets [Builder.livenessVerification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.livenessVerification] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun livenessVerification(livenessVerification: JsonField<Boolean>) = apply {
                this.livenessVerification = livenessVerification
            }

            /** Company name (available only if type = company) */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Percentage of ownership the member has in the company, expressed as an integer
             * between 0 and 100.
             */
            fun ownershipPercentage(ownershipPercentage: Long) =
                ownershipPercentage(JsonField.of(ownershipPercentage))

            /**
             * Sets [Builder.ownershipPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownershipPercentage] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
                this.ownershipPercentage = ownershipPercentage
            }

            /** Contact phone number of the member, including country code and area code. */
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

            /** Postal code of the member's address, typically a numeric or alphanumeric code. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * Official registration identifier of the member, such as a national ID or company
             * registration number.
             */
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

            /**
             * Type of relationship the member has with the company, such as "shareholder",
             * "director", or "beneficial_owner".
             */
            fun relation(relation: String) = relation(JsonField.of(relation))

            /**
             * Sets [Builder.relation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relation] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relation(relation: JsonField<String>) = apply { this.relation = relation }

            /**
             * Role of the member within the company, such as "legal_representative", "director", or
             * "manager".
             */
            fun roles(roles: String) = roles(JsonField.of(roles))

            /**
             * Sets [Builder.roles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roles] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roles(roles: JsonField<String>) = apply { this.roles = roles }

            /** Source of the data (e.g., government, user, company) */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /**
             * Current state of the member in the workflow, such as "WAITING", "STARTED", "RUNNING",
             * or "PROCESSED".
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /**
             * Status of the member in the system, indicating whether they are approved, pending, or
             * rejected. Possible values include "approved", "need_review", "rejected".
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Member type (person or company) */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Identifier of the workspace to which the member belongs, used for organizational
             * purposes.
             */
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
             * Returns an immutable instance of [Member].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Member =
                Member(
                    id,
                    address,
                    birthday,
                    birthplace,
                    country,
                    (documents ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    firstName,
                    isBeneficialOwner,
                    isDelegator,
                    lastName,
                    livenessVerification,
                    name,
                    ownershipPercentage,
                    phoneNumber,
                    postalCode,
                    registrationId,
                    relation,
                    roles,
                    source,
                    state,
                    status,
                    type,
                    workspaceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Member = apply {
            if (validated) {
                return@apply
            }

            id()
            address()
            birthday()
            birthplace()
            country()
            documents().ifPresent { it.forEach { it.validate() } }
            email()
            firstName()
            isBeneficialOwner()
            isDelegator()
            lastName()
            livenessVerification()
            name()
            ownershipPercentage()
            phoneNumber()
            postalCode()
            registrationId()
            relation()
            roles()
            source().ifPresent { it.validate() }
            state()
            status()
            type().ifPresent { it.validate() }
            workspaceId()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (address.asKnown().isPresent) 1 else 0) +
                (if (birthday.asKnown().isPresent) 1 else 0) +
                (if (birthplace.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (isBeneficialOwner.asKnown().isPresent) 1 else 0) +
                (if (isDelegator.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (if (livenessVerification.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (ownershipPercentage.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (registrationId.asKnown().isPresent) 1 else 0) +
                (if (relation.asKnown().isPresent) 1 else 0) +
                (if (roles.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0)

        /** Source of the data (e.g., government, user, company) */
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val GOUVE = of("gouve")

                @JvmField val USER = of("user")

                @JvmField val COMPANY = of("company")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                GOUVE,
                USER,
                COMPANY,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GOUVE,
                USER,
                COMPANY,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    GOUVE -> Value.GOUVE
                    USER -> Value.USER
                    COMPANY -> Value.COMPANY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DataleonInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    GOUVE -> Known.GOUVE
                    USER -> Known.USER
                    COMPANY -> Known.COMPANY
                    else -> throw DataleonInvalidDataException("Unknown Source: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DataleonInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    DataleonInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Source = apply {
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

                return /* spotless:off */ other is Source && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Member type (person or company) */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PERSON = of("person")

                @JvmField val COMPANY = of("company")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PERSON,
                COMPANY,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PERSON,
                COMPANY,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PERSON -> Value.PERSON
                    COMPANY -> Value.COMPANY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DataleonInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PERSON -> Known.PERSON
                    COMPANY -> Known.COMPANY
                    else -> throw DataleonInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DataleonInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    DataleonInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Member && id == other.id && address == other.address && birthday == other.birthday && birthplace == other.birthplace && country == other.country && documents == other.documents && email == other.email && firstName == other.firstName && isBeneficialOwner == other.isBeneficialOwner && isDelegator == other.isDelegator && lastName == other.lastName && livenessVerification == other.livenessVerification && name == other.name && ownershipPercentage == other.ownershipPercentage && phoneNumber == other.phoneNumber && postalCode == other.postalCode && registrationId == other.registrationId && relation == other.relation && roles == other.roles && source == other.source && state == other.state && status == other.status && type == other.type && workspaceId == other.workspaceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, address, birthday, birthplace, country, documents, email, firstName, isBeneficialOwner, isDelegator, lastName, livenessVerification, name, ownershipPercentage, phoneNumber, postalCode, registrationId, relation, roles, source, state, status, type, workspaceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Member{id=$id, address=$address, birthday=$birthday, birthplace=$birthplace, country=$country, documents=$documents, email=$email, firstName=$firstName, isBeneficialOwner=$isBeneficialOwner, isDelegator=$isDelegator, lastName=$lastName, livenessVerification=$livenessVerification, name=$name, ownershipPercentage=$ownershipPercentage, phoneNumber=$phoneNumber, postalCode=$postalCode, registrationId=$registrationId, relation=$relation, roles=$roles, source=$source, state=$state, status=$status, type=$type, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
    }

    /** Represents a generic property key-value pair with a specified type. */
    class Property
    private constructor(
        private val name: JsonField<String>,
        private val type: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(name, type, value, mutableMapOf())

        /**
         * Name/key of the property.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Data type of the property value.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Value associated with the property name.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /** Returns a mutable builder for constructing an instance of [Property]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Property]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(property: Property) = apply {
                name = property.name
                type = property.type
                value = property.value
                additionalProperties = property.additionalProperties.toMutableMap()
            }

            /** Name/key of the property. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Data type of the property value. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Value associated with the property name. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Property].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Property = Property(name, type, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Property = apply {
            if (validated) {
                return@apply
            }

            name()
            type()
            value()
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
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Property && name == other.name && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, type, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Property{name=$name, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * Risk assessment associated with the company, including a risk code, reason, and confidence
     * score.
     */
    class Risk
    private constructor(
        private val code: JsonField<String>,
        private val reason: JsonField<String>,
        private val score: JsonField<Float>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Float> = JsonMissing.of(),
        ) : this(code, reason, score, mutableMapOf())

        /**
         * Risk category or code identifier.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * Explanation or justification for the assigned risk.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Numeric risk score between 0.0 and 1.0 indicating severity or confidence.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Float> = score.getOptional("score")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Float> = score

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

            /** Returns a mutable builder for constructing an instance of [Risk]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Risk]. */
        class Builder internal constructor() {

            private var code: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var score: JsonField<Float> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(risk: Risk) = apply {
                code = risk.code
                reason = risk.reason
                score = risk.score
                additionalProperties = risk.additionalProperties.toMutableMap()
            }

            /** Risk category or code identifier. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Explanation or justification for the assigned risk. */
            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /** Numeric risk score between 0.0 and 1.0 indicating severity or confidence. */
            fun score(score: Float) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun score(score: JsonField<Float>) = apply { this.score = score }

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
             * Returns an immutable instance of [Risk].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Risk = Risk(code, reason, score, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Risk = apply {
            if (validated) {
                return@apply
            }

            code()
            reason()
            score()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Risk && code == other.code && reason == other.reason && score == other.score && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, reason, score, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Risk{code=$code, reason=$reason, score=$score, additionalProperties=$additionalProperties}"
    }

    /**
     * Technical metadata related to the request, such as IP address, QR code settings, and callback
     * URLs.
     */
    class TechnicalData
    private constructor(
        private val apiVersion: JsonField<Long>,
        private val approvedAt: JsonField<OffsetDateTime>,
        private val callbackUrl: JsonField<String>,
        private val callbackUrlNotification: JsonField<String>,
        private val disableNotification: JsonField<Boolean>,
        private val disableNotificationDate: JsonField<OffsetDateTime>,
        private val exportType: JsonField<String>,
        private val finishedAt: JsonField<OffsetDateTime>,
        private val ip: JsonField<String>,
        private val language: JsonField<String>,
        private val locationIp: JsonField<String>,
        private val needReviewAt: JsonField<OffsetDateTime>,
        private val notificationConfirmation: JsonField<Boolean>,
        private val qrCode: JsonField<String>,
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val startedAt: JsonField<OffsetDateTime>,
        private val transferAt: JsonField<OffsetDateTime>,
        private val transferMode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_version")
            @ExcludeMissing
            apiVersion: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("approved_at")
            @ExcludeMissing
            approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("callback_url")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("callback_url_notification")
            @ExcludeMissing
            callbackUrlNotification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disable_notification")
            @ExcludeMissing
            disableNotification: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("disable_notification_date")
            @ExcludeMissing
            disableNotificationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("export_type")
            @ExcludeMissing
            exportType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("finished_at")
            @ExcludeMissing
            finishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location_ip")
            @ExcludeMissing
            locationIp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("need_review_at")
            @ExcludeMissing
            needReviewAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("notification_confirmation")
            @ExcludeMissing
            notificationConfirmation: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("qr_code") @ExcludeMissing qrCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rejected_at")
            @ExcludeMissing
            rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("started_at")
            @ExcludeMissing
            startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transfer_at")
            @ExcludeMissing
            transferAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transfer_mode")
            @ExcludeMissing
            transferMode: JsonField<String> = JsonMissing.of(),
        ) : this(
            apiVersion,
            approvedAt,
            callbackUrl,
            callbackUrlNotification,
            disableNotification,
            disableNotificationDate,
            exportType,
            finishedAt,
            ip,
            language,
            locationIp,
            needReviewAt,
            notificationConfirmation,
            qrCode,
            rejectedAt,
            startedAt,
            transferAt,
            transferMode,
            mutableMapOf(),
        )

        /**
         * Version number of the API used.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiVersion(): Optional<Long> = apiVersion.getOptional("api_version")

        /**
         * Timestamp when the request or process was approved.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun approvedAt(): Optional<OffsetDateTime> = approvedAt.getOptional("approved_at")

        /**
         * URL to receive callback data from the AML system.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callback_url")

        /**
         * URL to receive notification updates about the processing status.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun callbackUrlNotification(): Optional<String> =
            callbackUrlNotification.getOptional("callback_url_notification")

        /**
         * Flag to indicate if notifications are disabled.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun disableNotification(): Optional<Boolean> =
            disableNotification.getOptional("disable_notification")

        /**
         * Timestamp when notifications were disabled; null if never disabled.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun disableNotificationDate(): Optional<OffsetDateTime> =
            disableNotificationDate.getOptional("disable_notification_date")

        /**
         * Export format defined by the API (e.g., "json", "xml").
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exportType(): Optional<String> = exportType.getOptional("export_type")

        /**
         * Timestamp when the process finished.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun finishedAt(): Optional<OffsetDateTime> = finishedAt.getOptional("finished_at")

        /**
         * IP address of the our system handling the request.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ip(): Optional<String> = ip.getOptional("ip")

        /**
         * Language preference used in the client workspace (e.g., "fra").
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * IP address of the end client (final user) captured.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun locationIp(): Optional<String> = locationIp.getOptional("location_ip")

        /**
         * Timestamp indicating when the request or process needs review; null if none.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun needReviewAt(): Optional<OffsetDateTime> = needReviewAt.getOptional("need_review_at")

        /**
         * Flag indicating if notification confirmation is required or received.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notificationConfirmation(): Optional<Boolean> =
            notificationConfirmation.getOptional("notification_confirmation")

        /**
         * Indicates whether QR code is enabled ("true" or "false").
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun qrCode(): Optional<String> = qrCode.getOptional("qr_code")

        /**
         * Timestamp when the request or process was rejected; null if not rejected.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rejectedAt(): Optional<OffsetDateTime> = rejectedAt.getOptional("rejected_at")

        /**
         * Timestamp when the process started.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

        /**
         * Date/time of data transfer.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transferAt(): Optional<OffsetDateTime> = transferAt.getOptional("transfer_at")

        /**
         * Mode of data transfer.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transferMode(): Optional<String> = transferMode.getOptional("transfer_mode")

        /**
         * Returns the raw JSON value of [apiVersion].
         *
         * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_version") @ExcludeMissing fun _apiVersion(): JsonField<Long> = apiVersion

        /**
         * Returns the raw JSON value of [approvedAt].
         *
         * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

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
         * Returns the raw JSON value of [disableNotification].
         *
         * Unlike [disableNotification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("disable_notification")
        @ExcludeMissing
        fun _disableNotification(): JsonField<Boolean> = disableNotification

        /**
         * Returns the raw JSON value of [disableNotificationDate].
         *
         * Unlike [disableNotificationDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("disable_notification_date")
        @ExcludeMissing
        fun _disableNotificationDate(): JsonField<OffsetDateTime> = disableNotificationDate

        /**
         * Returns the raw JSON value of [exportType].
         *
         * Unlike [exportType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("export_type")
        @ExcludeMissing
        fun _exportType(): JsonField<String> = exportType

        /**
         * Returns the raw JSON value of [finishedAt].
         *
         * Unlike [finishedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("finished_at")
        @ExcludeMissing
        fun _finishedAt(): JsonField<OffsetDateTime> = finishedAt

        /**
         * Returns the raw JSON value of [ip].
         *
         * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [locationIp].
         *
         * Unlike [locationIp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location_ip")
        @ExcludeMissing
        fun _locationIp(): JsonField<String> = locationIp

        /**
         * Returns the raw JSON value of [needReviewAt].
         *
         * Unlike [needReviewAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("need_review_at")
        @ExcludeMissing
        fun _needReviewAt(): JsonField<OffsetDateTime> = needReviewAt

        /**
         * Returns the raw JSON value of [notificationConfirmation].
         *
         * Unlike [notificationConfirmation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("notification_confirmation")
        @ExcludeMissing
        fun _notificationConfirmation(): JsonField<Boolean> = notificationConfirmation

        /**
         * Returns the raw JSON value of [qrCode].
         *
         * Unlike [qrCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("qr_code") @ExcludeMissing fun _qrCode(): JsonField<String> = qrCode

        /**
         * Returns the raw JSON value of [rejectedAt].
         *
         * Unlike [rejectedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

        /**
         * Returns the raw JSON value of [startedAt].
         *
         * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("started_at")
        @ExcludeMissing
        fun _startedAt(): JsonField<OffsetDateTime> = startedAt

        /**
         * Returns the raw JSON value of [transferAt].
         *
         * Unlike [transferAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transfer_at")
        @ExcludeMissing
        fun _transferAt(): JsonField<OffsetDateTime> = transferAt

        /**
         * Returns the raw JSON value of [transferMode].
         *
         * Unlike [transferMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transfer_mode")
        @ExcludeMissing
        fun _transferMode(): JsonField<String> = transferMode

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

            private var apiVersion: JsonField<Long> = JsonMissing.of()
            private var approvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var callbackUrlNotification: JsonField<String> = JsonMissing.of()
            private var disableNotification: JsonField<Boolean> = JsonMissing.of()
            private var disableNotificationDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var exportType: JsonField<String> = JsonMissing.of()
            private var finishedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ip: JsonField<String> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var locationIp: JsonField<String> = JsonMissing.of()
            private var needReviewAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var notificationConfirmation: JsonField<Boolean> = JsonMissing.of()
            private var qrCode: JsonField<String> = JsonMissing.of()
            private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transferAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transferMode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(technicalData: TechnicalData) = apply {
                apiVersion = technicalData.apiVersion
                approvedAt = technicalData.approvedAt
                callbackUrl = technicalData.callbackUrl
                callbackUrlNotification = technicalData.callbackUrlNotification
                disableNotification = technicalData.disableNotification
                disableNotificationDate = technicalData.disableNotificationDate
                exportType = technicalData.exportType
                finishedAt = technicalData.finishedAt
                ip = technicalData.ip
                language = technicalData.language
                locationIp = technicalData.locationIp
                needReviewAt = technicalData.needReviewAt
                notificationConfirmation = technicalData.notificationConfirmation
                qrCode = technicalData.qrCode
                rejectedAt = technicalData.rejectedAt
                startedAt = technicalData.startedAt
                transferAt = technicalData.transferAt
                transferMode = technicalData.transferMode
                additionalProperties = technicalData.additionalProperties.toMutableMap()
            }

            /** Version number of the API used. */
            fun apiVersion(apiVersion: Long) = apiVersion(JsonField.of(apiVersion))

            /**
             * Sets [Builder.apiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiVersion] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiVersion(apiVersion: JsonField<Long>) = apply { this.apiVersion = apiVersion }

            /** Timestamp when the request or process was approved. */
            fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

            /**
             * Sets [Builder.approvedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            /** URL to receive callback data from the AML system. */
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

            /** URL to receive notification updates about the processing status. */
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

            /** Flag to indicate if notifications are disabled. */
            fun disableNotification(disableNotification: Boolean) =
                disableNotification(JsonField.of(disableNotification))

            /**
             * Sets [Builder.disableNotification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableNotification] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun disableNotification(disableNotification: JsonField<Boolean>) = apply {
                this.disableNotification = disableNotification
            }

            /** Timestamp when notifications were disabled; null if never disabled. */
            fun disableNotificationDate(disableNotificationDate: OffsetDateTime?) =
                disableNotificationDate(JsonField.ofNullable(disableNotificationDate))

            /**
             * Alias for calling [Builder.disableNotificationDate] with
             * `disableNotificationDate.orElse(null)`.
             */
            fun disableNotificationDate(disableNotificationDate: Optional<OffsetDateTime>) =
                disableNotificationDate(disableNotificationDate.getOrNull())

            /**
             * Sets [Builder.disableNotificationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableNotificationDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun disableNotificationDate(disableNotificationDate: JsonField<OffsetDateTime>) =
                apply {
                    this.disableNotificationDate = disableNotificationDate
                }

            /** Export format defined by the API (e.g., "json", "xml"). */
            fun exportType(exportType: String) = exportType(JsonField.of(exportType))

            /**
             * Sets [Builder.exportType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exportType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exportType(exportType: JsonField<String>) = apply { this.exportType = exportType }

            /** Timestamp when the process finished. */
            fun finishedAt(finishedAt: OffsetDateTime) = finishedAt(JsonField.of(finishedAt))

            /**
             * Sets [Builder.finishedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finishedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finishedAt(finishedAt: JsonField<OffsetDateTime>) = apply {
                this.finishedAt = finishedAt
            }

            /** IP address of the our system handling the request. */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /**
             * Sets [Builder.ip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            /** Language preference used in the client workspace (e.g., "fra"). */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** IP address of the end client (final user) captured. */
            fun locationIp(locationIp: String) = locationIp(JsonField.of(locationIp))

            /**
             * Sets [Builder.locationIp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationIp] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationIp(locationIp: JsonField<String>) = apply { this.locationIp = locationIp }

            /** Timestamp indicating when the request or process needs review; null if none. */
            fun needReviewAt(needReviewAt: OffsetDateTime?) =
                needReviewAt(JsonField.ofNullable(needReviewAt))

            /** Alias for calling [Builder.needReviewAt] with `needReviewAt.orElse(null)`. */
            fun needReviewAt(needReviewAt: Optional<OffsetDateTime>) =
                needReviewAt(needReviewAt.getOrNull())

            /**
             * Sets [Builder.needReviewAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.needReviewAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun needReviewAt(needReviewAt: JsonField<OffsetDateTime>) = apply {
                this.needReviewAt = needReviewAt
            }

            /** Flag indicating if notification confirmation is required or received. */
            fun notificationConfirmation(notificationConfirmation: Boolean) =
                notificationConfirmation(JsonField.of(notificationConfirmation))

            /**
             * Sets [Builder.notificationConfirmation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notificationConfirmation] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun notificationConfirmation(notificationConfirmation: JsonField<Boolean>) = apply {
                this.notificationConfirmation = notificationConfirmation
            }

            /** Indicates whether QR code is enabled ("true" or "false"). */
            fun qrCode(qrCode: String) = qrCode(JsonField.of(qrCode))

            /**
             * Sets [Builder.qrCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.qrCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun qrCode(qrCode: JsonField<String>) = apply { this.qrCode = qrCode }

            /** Timestamp when the request or process was rejected; null if not rejected. */
            fun rejectedAt(rejectedAt: OffsetDateTime?) =
                rejectedAt(JsonField.ofNullable(rejectedAt))

            /** Alias for calling [Builder.rejectedAt] with `rejectedAt.orElse(null)`. */
            fun rejectedAt(rejectedAt: Optional<OffsetDateTime>) =
                rejectedAt(rejectedAt.getOrNull())

            /**
             * Sets [Builder.rejectedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
            }

            /** Timestamp when the process started. */
            fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

            /**
             * Sets [Builder.startedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply {
                this.startedAt = startedAt
            }

            /** Date/time of data transfer. */
            fun transferAt(transferAt: OffsetDateTime) = transferAt(JsonField.of(transferAt))

            /**
             * Sets [Builder.transferAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferAt(transferAt: JsonField<OffsetDateTime>) = apply {
                this.transferAt = transferAt
            }

            /** Mode of data transfer. */
            fun transferMode(transferMode: String) = transferMode(JsonField.of(transferMode))

            /**
             * Sets [Builder.transferMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferMode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferMode(transferMode: JsonField<String>) = apply {
                this.transferMode = transferMode
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
             * Returns an immutable instance of [TechnicalData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TechnicalData =
                TechnicalData(
                    apiVersion,
                    approvedAt,
                    callbackUrl,
                    callbackUrlNotification,
                    disableNotification,
                    disableNotificationDate,
                    exportType,
                    finishedAt,
                    ip,
                    language,
                    locationIp,
                    needReviewAt,
                    notificationConfirmation,
                    qrCode,
                    rejectedAt,
                    startedAt,
                    transferAt,
                    transferMode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TechnicalData = apply {
            if (validated) {
                return@apply
            }

            apiVersion()
            approvedAt()
            callbackUrl()
            callbackUrlNotification()
            disableNotification()
            disableNotificationDate()
            exportType()
            finishedAt()
            ip()
            language()
            locationIp()
            needReviewAt()
            notificationConfirmation()
            qrCode()
            rejectedAt()
            startedAt()
            transferAt()
            transferMode()
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
            (if (apiVersion.asKnown().isPresent) 1 else 0) +
                (if (approvedAt.asKnown().isPresent) 1 else 0) +
                (if (callbackUrl.asKnown().isPresent) 1 else 0) +
                (if (callbackUrlNotification.asKnown().isPresent) 1 else 0) +
                (if (disableNotification.asKnown().isPresent) 1 else 0) +
                (if (disableNotificationDate.asKnown().isPresent) 1 else 0) +
                (if (exportType.asKnown().isPresent) 1 else 0) +
                (if (finishedAt.asKnown().isPresent) 1 else 0) +
                (if (ip.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (locationIp.asKnown().isPresent) 1 else 0) +
                (if (needReviewAt.asKnown().isPresent) 1 else 0) +
                (if (notificationConfirmation.asKnown().isPresent) 1 else 0) +
                (if (qrCode.asKnown().isPresent) 1 else 0) +
                (if (rejectedAt.asKnown().isPresent) 1 else 0) +
                (if (startedAt.asKnown().isPresent) 1 else 0) +
                (if (transferAt.asKnown().isPresent) 1 else 0) +
                (if (transferMode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TechnicalData && apiVersion == other.apiVersion && approvedAt == other.approvedAt && callbackUrl == other.callbackUrl && callbackUrlNotification == other.callbackUrlNotification && disableNotification == other.disableNotification && disableNotificationDate == other.disableNotificationDate && exportType == other.exportType && finishedAt == other.finishedAt && ip == other.ip && language == other.language && locationIp == other.locationIp && needReviewAt == other.needReviewAt && notificationConfirmation == other.notificationConfirmation && qrCode == other.qrCode && rejectedAt == other.rejectedAt && startedAt == other.startedAt && transferAt == other.transferAt && transferMode == other.transferMode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(apiVersion, approvedAt, callbackUrl, callbackUrlNotification, disableNotification, disableNotificationDate, exportType, finishedAt, ip, language, locationIp, needReviewAt, notificationConfirmation, qrCode, rejectedAt, startedAt, transferAt, transferMode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TechnicalData{apiVersion=$apiVersion, approvedAt=$approvedAt, callbackUrl=$callbackUrl, callbackUrlNotification=$callbackUrlNotification, disableNotification=$disableNotification, disableNotificationDate=$disableNotificationDate, exportType=$exportType, finishedAt=$finishedAt, ip=$ip, language=$language, locationIp=$locationIp, needReviewAt=$needReviewAt, notificationConfirmation=$notificationConfirmation, qrCode=$qrCode, rejectedAt=$rejectedAt, startedAt=$startedAt, transferAt=$transferAt, transferMode=$transferMode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompanyRegistration && amlSuspicions == other.amlSuspicions && certificat == other.certificat && checks == other.checks && company == other.company && documents == other.documents && members == other.members && portalUrl == other.portalUrl && properties == other.properties && risk == other.risk && sourceId == other.sourceId && technicalData == other.technicalData && webviewUrl == other.webviewUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amlSuspicions, certificat, checks, company, documents, members, portalUrl, properties, risk, sourceId, technicalData, webviewUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyRegistration{amlSuspicions=$amlSuspicions, certificat=$certificat, checks=$checks, company=$company, documents=$documents, members=$members, portalUrl=$portalUrl, properties=$properties, risk=$risk, sourceId=$sourceId, technicalData=$technicalData, webviewUrl=$webviewUrl, additionalProperties=$additionalProperties}"
}
