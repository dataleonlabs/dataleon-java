// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models.individuals

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Represents a single individual record, including identification, status, and associated metadata.
 */
class Individual
private constructor(
    private val id: JsonField<String>,
    private val amlSuspicions: JsonField<List<AmlSuspicion>>,
    private val authUrl: JsonField<String>,
    private val certificat: JsonField<Certificat>,
    private val checks: JsonField<List<Check>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val documents: JsonField<List<GenericDocument>>,
    private val identityCard: JsonField<IdentityCard>,
    private val number: JsonField<Long>,
    private val person: JsonField<Person>,
    private val portalUrl: JsonField<String>,
    private val properties: JsonField<List<Property>>,
    private val risk: JsonField<Risk>,
    private val sourceId: JsonField<String>,
    private val state: JsonField<String>,
    private val status: JsonField<String>,
    private val tags: JsonField<List<Tag>>,
    private val technicalData: JsonField<TechnicalData>,
    private val webviewUrl: JsonField<String>,
    private val workspaceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aml_suspicions")
        @ExcludeMissing
        amlSuspicions: JsonField<List<AmlSuspicion>> = JsonMissing.of(),
        @JsonProperty("auth_url") @ExcludeMissing authUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("certificat")
        @ExcludeMissing
        certificat: JsonField<Certificat> = JsonMissing.of(),
        @JsonProperty("checks") @ExcludeMissing checks: JsonField<List<Check>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<GenericDocument>> = JsonMissing.of(),
        @JsonProperty("identity_card")
        @ExcludeMissing
        identityCard: JsonField<IdentityCard> = JsonMissing.of(),
        @JsonProperty("number") @ExcludeMissing number: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("person") @ExcludeMissing person: JsonField<Person> = JsonMissing.of(),
        @JsonProperty("portal_url") @ExcludeMissing portalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<Property>> = JsonMissing.of(),
        @JsonProperty("risk") @ExcludeMissing risk: JsonField<Risk> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
        @JsonProperty("technical_data")
        @ExcludeMissing
        technicalData: JsonField<TechnicalData> = JsonMissing.of(),
        @JsonProperty("webview_url")
        @ExcludeMissing
        webviewUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspace_id")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amlSuspicions,
        authUrl,
        certificat,
        checks,
        createdAt,
        documents,
        identityCard,
        number,
        person,
        portalUrl,
        properties,
        risk,
        sourceId,
        state,
        status,
        tags,
        technicalData,
        webviewUrl,
        workspaceId,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the individual.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * List of AML (Anti-Money Laundering) suspicion entries linked to the individual.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amlSuspicions(): Optional<List<AmlSuspicion>> = amlSuspicions.getOptional("aml_suspicions")

    /**
     * URL to authenticate the individual, usually for document signing or onboarding.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authUrl(): Optional<String> = authUrl.getOptional("auth_url")

    /**
     * Digital certificate associated with the individual, if any.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certificat(): Optional<Certificat> = certificat.getOptional("certificat")

    /**
     * List of verification or validation checks applied to the individual.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checks(): Optional<List<Check>> = checks.getOptional("checks")

    /**
     * Timestamp of the individual's creation in ISO 8601 format.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * All documents submitted or associated with the individual.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<GenericDocument>> = documents.getOptional("documents")

    /**
     * Reference to the individual's identity document.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun identityCard(): Optional<IdentityCard> = identityCard.getOptional("identity_card")

    /**
     * Internal sequential number or reference for the individual.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun number(): Optional<Long> = number.getOptional("number")

    /**
     * Personal details of the individual, such as name, date of birth, and contact info.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun person(): Optional<Person> = person.getOptional("person")

    /**
     * Admin or internal portal URL for viewing the individual's details.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portalUrl(): Optional<String> = portalUrl.getOptional("portal_url")

    /**
     * Custom key-value metadata fields associated with the individual.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<List<Property>> = properties.getOptional("properties")

    /**
     * Risk assessment associated with the individual.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun risk(): Optional<Risk> = risk.getOptional("risk")

    /**
     * Optional identifier indicating the source of the individual record.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceId(): Optional<String> = sourceId.getOptional("source_id")

    /**
     * Current operational state in the workflow (e.g., WAITING, IN_PROGRESS, COMPLETED).
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Overall processing status of the individual (e.g., rejected, need_review, approved).
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * List of tags assigned to the individual for categorization or metadata purposes.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<Tag>> = tags.getOptional("tags")

    /**
     * Technical metadata related to the request (e.g., QR code settings, language).
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technicalData(): Optional<TechnicalData> = technicalData.getOptional("technical_data")

    /**
     * Public-facing webview URL for the individual’s identification process.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webviewUrl(): Optional<String> = webviewUrl.getOptional("webview_url")

    /**
     * Identifier of the workspace to which the individual belongs.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amlSuspicions].
     *
     * Unlike [amlSuspicions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aml_suspicions")
    @ExcludeMissing
    fun _amlSuspicions(): JsonField<List<AmlSuspicion>> = amlSuspicions

    /**
     * Returns the raw JSON value of [authUrl].
     *
     * Unlike [authUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_url") @ExcludeMissing fun _authUrl(): JsonField<String> = authUrl

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<GenericDocument>> = documents

    /**
     * Returns the raw JSON value of [identityCard].
     *
     * Unlike [identityCard], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identity_card")
    @ExcludeMissing
    fun _identityCard(): JsonField<IdentityCard> = identityCard

    /**
     * Returns the raw JSON value of [number].
     *
     * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<Long> = number

    /**
     * Returns the raw JSON value of [person].
     *
     * Unlike [person], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("person") @ExcludeMissing fun _person(): JsonField<Person> = person

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
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

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

        /** Returns a mutable builder for constructing an instance of [Individual]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Individual]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var amlSuspicions: JsonField<MutableList<AmlSuspicion>>? = null
        private var authUrl: JsonField<String> = JsonMissing.of()
        private var certificat: JsonField<Certificat> = JsonMissing.of()
        private var checks: JsonField<MutableList<Check>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var documents: JsonField<MutableList<GenericDocument>>? = null
        private var identityCard: JsonField<IdentityCard> = JsonMissing.of()
        private var number: JsonField<Long> = JsonMissing.of()
        private var person: JsonField<Person> = JsonMissing.of()
        private var portalUrl: JsonField<String> = JsonMissing.of()
        private var properties: JsonField<MutableList<Property>>? = null
        private var risk: JsonField<Risk> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<Tag>>? = null
        private var technicalData: JsonField<TechnicalData> = JsonMissing.of()
        private var webviewUrl: JsonField<String> = JsonMissing.of()
        private var workspaceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individual: Individual) = apply {
            id = individual.id
            amlSuspicions = individual.amlSuspicions.map { it.toMutableList() }
            authUrl = individual.authUrl
            certificat = individual.certificat
            checks = individual.checks.map { it.toMutableList() }
            createdAt = individual.createdAt
            documents = individual.documents.map { it.toMutableList() }
            identityCard = individual.identityCard
            number = individual.number
            person = individual.person
            portalUrl = individual.portalUrl
            properties = individual.properties.map { it.toMutableList() }
            risk = individual.risk
            sourceId = individual.sourceId
            state = individual.state
            status = individual.status
            tags = individual.tags.map { it.toMutableList() }
            technicalData = individual.technicalData
            webviewUrl = individual.webviewUrl
            workspaceId = individual.workspaceId
            additionalProperties = individual.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the individual. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** List of AML (Anti-Money Laundering) suspicion entries linked to the individual. */
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

        /** URL to authenticate the individual, usually for document signing or onboarding. */
        fun authUrl(authUrl: String) = authUrl(JsonField.of(authUrl))

        /**
         * Sets [Builder.authUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun authUrl(authUrl: JsonField<String>) = apply { this.authUrl = authUrl }

        /** Digital certificate associated with the individual, if any. */
        fun certificat(certificat: Certificat) = certificat(JsonField.of(certificat))

        /**
         * Sets [Builder.certificat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certificat] with a well-typed [Certificat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certificat(certificat: JsonField<Certificat>) = apply { this.certificat = certificat }

        /** List of verification or validation checks applied to the individual. */
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

        /** Timestamp of the individual's creation in ISO 8601 format. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** All documents submitted or associated with the individual. */
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

        /** Reference to the individual's identity document. */
        fun identityCard(identityCard: IdentityCard) = identityCard(JsonField.of(identityCard))

        /**
         * Sets [Builder.identityCard] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identityCard] with a well-typed [IdentityCard] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun identityCard(identityCard: JsonField<IdentityCard>) = apply {
            this.identityCard = identityCard
        }

        /** Internal sequential number or reference for the individual. */
        fun number(number: Long) = number(JsonField.of(number))

        /**
         * Sets [Builder.number] to an arbitrary JSON value.
         *
         * You should usually call [Builder.number] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun number(number: JsonField<Long>) = apply { this.number = number }

        /** Personal details of the individual, such as name, date of birth, and contact info. */
        fun person(person: Person) = person(JsonField.of(person))

        /**
         * Sets [Builder.person] to an arbitrary JSON value.
         *
         * You should usually call [Builder.person] with a well-typed [Person] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun person(person: JsonField<Person>) = apply { this.person = person }

        /** Admin or internal portal URL for viewing the individual's details. */
        fun portalUrl(portalUrl: String) = portalUrl(JsonField.of(portalUrl))

        /**
         * Sets [Builder.portalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun portalUrl(portalUrl: JsonField<String>) = apply { this.portalUrl = portalUrl }

        /** Custom key-value metadata fields associated with the individual. */
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

        /** Risk assessment associated with the individual. */
        fun risk(risk: Risk) = risk(JsonField.of(risk))

        /**
         * Sets [Builder.risk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.risk] with a well-typed [Risk] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun risk(risk: JsonField<Risk>) = apply { this.risk = risk }

        /** Optional identifier indicating the source of the individual record. */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /** Current operational state in the workflow (e.g., WAITING, IN_PROGRESS, COMPLETED). */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Overall processing status of the individual (e.g., rejected, need_review, approved). */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** List of tags assigned to the individual for categorization or metadata purposes. */
        fun tags(tags: List<Tag>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<Tag>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<List<Tag>>) = apply { this.tags = tags.map { it.toMutableList() } }

        /**
         * Adds a single [Tag] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: Tag) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Technical metadata related to the request (e.g., QR code settings, language). */
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

        /** Public-facing webview URL for the individual’s identification process. */
        fun webviewUrl(webviewUrl: String) = webviewUrl(JsonField.of(webviewUrl))

        /**
         * Sets [Builder.webviewUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webviewUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webviewUrl(webviewUrl: JsonField<String>) = apply { this.webviewUrl = webviewUrl }

        /** Identifier of the workspace to which the individual belongs. */
        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

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
         * Returns an immutable instance of [Individual].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Individual =
            Individual(
                id,
                (amlSuspicions ?: JsonMissing.of()).map { it.toImmutable() },
                authUrl,
                certificat,
                (checks ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                identityCard,
                number,
                person,
                portalUrl,
                (properties ?: JsonMissing.of()).map { it.toImmutable() },
                risk,
                sourceId,
                state,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                technicalData,
                webviewUrl,
                workspaceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Individual = apply {
        if (validated) {
            return@apply
        }

        id()
        amlSuspicions().ifPresent { it.forEach { it.validate() } }
        authUrl()
        certificat().ifPresent { it.validate() }
        checks().ifPresent { it.forEach { it.validate() } }
        createdAt()
        documents().ifPresent { it.forEach { it.validate() } }
        identityCard().ifPresent { it.validate() }
        number()
        person().ifPresent { it.validate() }
        portalUrl()
        properties().ifPresent { it.forEach { it.validate() } }
        risk().ifPresent { it.validate() }
        sourceId()
        state()
        status()
        tags().ifPresent { it.forEach { it.validate() } }
        technicalData().ifPresent { it.validate() }
        webviewUrl()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (amlSuspicions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (authUrl.asKnown().isPresent) 1 else 0) +
            (certificat.asKnown().getOrNull()?.validity() ?: 0) +
            (checks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (identityCard.asKnown().getOrNull()?.validity() ?: 0) +
            (if (number.asKnown().isPresent) 1 else 0) +
            (person.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portalUrl.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (risk.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceId.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (technicalData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webviewUrl.asKnown().isPresent) 1 else 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0)

    /**
     * Represents a record of suspicion raised during Anti-Money Laundering (AML) screening.
     * Includes metadata such as risk score, origin, and linked watchlist types.
     */
    class AmlSuspicion
    private constructor(
        private val caption: JsonField<String>,
        private val country: JsonField<String>,
        private val gender: JsonField<String>,
        private val relation: JsonField<String>,
        private val schema: JsonField<String>,
        private val score: JsonField<Float>,
        private val source: JsonField<String>,
        private val status: JsonField<Status>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("caption") @ExcludeMissing caption: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("relation")
            @ExcludeMissing
            relation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("schema") @ExcludeMissing schema: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            caption,
            country,
            gender,
            relation,
            schema,
            score,
            source,
            status,
            type,
            mutableMapOf(),
        )

        /**
         * Human-readable description or title for the suspicious finding.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun caption(): Optional<String> = caption.getOptional("caption")

        /**
         * Country associated with the suspicion (ISO 3166-1 alpha-2 code).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * Gender associated with the suspicion, if applicable.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gender(): Optional<String> = gender.getOptional("gender")

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
         * Risk score between 0.0 and 0.85 indicating the severity of the suspicion.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Float> = score.getOptional("score")

        /**
         * Source system or service providing this suspicion.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * Status of the suspicion review process. Possible values: "true_positive",
         * "false_positive", "pending".
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Category of the suspicion. Possible values: "crime", "sanction", "pep", "adverse_news",
         * "other".
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
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

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
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
            private var country: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<String> = JsonMissing.of()
            private var relation: JsonField<String> = JsonMissing.of()
            private var schema: JsonField<String> = JsonMissing.of()
            private var score: JsonField<Float> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amlSuspicion: AmlSuspicion) = apply {
                caption = amlSuspicion.caption
                country = amlSuspicion.country
                gender = amlSuspicion.gender
                relation = amlSuspicion.relation
                schema = amlSuspicion.schema
                score = amlSuspicion.score
                source = amlSuspicion.source
                status = amlSuspicion.status
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

            /** Country associated with the suspicion (ISO 3166-1 alpha-2 code). */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Gender associated with the suspicion, if applicable. */
            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

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

            /** Risk score between 0.0 and 0.85 indicating the severity of the suspicion. */
            fun score(score: Float) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun score(score: JsonField<Float>) = apply { this.score = score }

            /** Source system or service providing this suspicion. */
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
             * Status of the suspicion review process. Possible values: "true_positive",
             * "false_positive", "pending".
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * Category of the suspicion. Possible values: "crime", "sanction", "pep",
             * "adverse_news", "other".
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
                    country,
                    gender,
                    relation,
                    schema,
                    score,
                    source,
                    status,
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
            country()
            gender()
            relation()
            schema()
            score()
            source()
            status().ifPresent { it.validate() }
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
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (gender.asKnown().isPresent) 1 else 0) +
                (if (relation.asKnown().isPresent) 1 else 0) +
                (if (schema.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Status of the suspicion review process. Possible values: "true_positive",
         * "false_positive", "pending".
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val TRUE_POSITIVE = of("true_positive")

                @JvmField val FALSE_POSITIVE = of("false_positive")

                @JvmField val PENDING = of("pending")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                TRUE_POSITIVE,
                FALSE_POSITIVE,
                PENDING,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRUE_POSITIVE,
                FALSE_POSITIVE,
                PENDING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    TRUE_POSITIVE -> Value.TRUE_POSITIVE
                    FALSE_POSITIVE -> Value.FALSE_POSITIVE
                    PENDING -> Value.PENDING
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
                    TRUE_POSITIVE -> Known.TRUE_POSITIVE
                    FALSE_POSITIVE -> Known.FALSE_POSITIVE
                    PENDING -> Known.PENDING
                    else -> throw DataleonInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Category of the suspicion. Possible values: "crime", "sanction", "pep", "adverse_news",
         * "other".
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

                @JvmField val CRIME = of("crime")

                @JvmField val SANCTION = of("sanction")

                @JvmField val PEP = of("pep")

                @JvmField val ADVERSE_NEWS = of("adverse_news")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CRIME,
                SANCTION,
                PEP,
                ADVERSE_NEWS,
                OTHER,
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
                CRIME,
                SANCTION,
                PEP,
                ADVERSE_NEWS,
                OTHER,
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
                    CRIME -> Value.CRIME
                    SANCTION -> Value.SANCTION
                    PEP -> Value.PEP
                    ADVERSE_NEWS -> Value.ADVERSE_NEWS
                    OTHER -> Value.OTHER
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
                    CRIME -> Known.CRIME
                    SANCTION -> Known.SANCTION
                    PEP -> Known.PEP
                    ADVERSE_NEWS -> Known.ADVERSE_NEWS
                    OTHER -> Known.OTHER
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AmlSuspicion &&
                caption == other.caption &&
                country == other.country &&
                gender == other.gender &&
                relation == other.relation &&
                schema == other.schema &&
                score == other.score &&
                source == other.source &&
                status == other.status &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                caption,
                country,
                gender,
                relation,
                schema,
                score,
                source,
                status,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AmlSuspicion{caption=$caption, country=$country, gender=$gender, relation=$relation, schema=$schema, score=$score, source=$source, status=$status, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Digital certificate associated with the individual, if any. */
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

            return other is Certificat &&
                id == other.id &&
                createdAt == other.createdAt &&
                filename == other.filename &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, createdAt, filename, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Certificat{id=$id, createdAt=$createdAt, filename=$filename, additionalProperties=$additionalProperties}"
    }

    /** Reference to the individual's identity document. */
    class IdentityCard
    private constructor(
        private val id: JsonField<String>,
        private val backDocumentSignedUrl: JsonField<String>,
        private val birthPlace: JsonField<String>,
        private val birthday: JsonField<String>,
        private val country: JsonField<String>,
        private val expirationDate: JsonField<String>,
        private val firstName: JsonField<String>,
        private val frontDocumentSignedUrl: JsonField<String>,
        private val gender: JsonField<String>,
        private val issueDate: JsonField<String>,
        private val lastName: JsonField<String>,
        private val mrzLine1: JsonField<String>,
        private val mrzLine2: JsonField<String>,
        private val mrzLine3: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("back_document_signed_url")
            @ExcludeMissing
            backDocumentSignedUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("birth_place")
            @ExcludeMissing
            birthPlace: JsonField<String> = JsonMissing.of(),
            @JsonProperty("birthday")
            @ExcludeMissing
            birthday: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_date")
            @ExcludeMissing
            expirationDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("front_document_signed_url")
            @ExcludeMissing
            frontDocumentSignedUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("issue_date")
            @ExcludeMissing
            issueDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mrz_line_1")
            @ExcludeMissing
            mrzLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mrz_line_2")
            @ExcludeMissing
            mrzLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mrz_line_3")
            @ExcludeMissing
            mrzLine3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            backDocumentSignedUrl,
            birthPlace,
            birthday,
            country,
            expirationDate,
            firstName,
            frontDocumentSignedUrl,
            gender,
            issueDate,
            lastName,
            mrzLine1,
            mrzLine2,
            mrzLine3,
            type,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Signed URL linking to the back image of the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun backDocumentSignedUrl(): Optional<String> =
            backDocumentSignedUrl.getOptional("back_document_signed_url")

        /**
         * Place of birth as indicated on the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun birthPlace(): Optional<String> = birthPlace.getOptional("birth_place")

        /**
         * Date of birth in DD/MM/YYYY format as shown on the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun birthday(): Optional<String> = birthday.getOptional("birthday")

        /**
         * Country code issuing the document (ISO 3166-1 alpha-2).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * Expiration date of the document, in YYYY-MM-DD format.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun expirationDate(): Optional<String> = expirationDate.getOptional("expiration_date")

        /**
         * First name as shown on the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * Signed URL linking to the front image of the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frontDocumentSignedUrl(): Optional<String> =
            frontDocumentSignedUrl.getOptional("front_document_signed_url")

        /**
         * Gender indicated on the document (e.g., "M" or "F").
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gender(): Optional<String> = gender.getOptional("gender")

        /**
         * Date when the document was issued, in YYYY-MM-DD format.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun issueDate(): Optional<String> = issueDate.getOptional("issue_date")

        /**
         * Last name as shown on the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

        /**
         * First line of the Machine Readable Zone (MRZ) on the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mrzLine1(): Optional<String> = mrzLine1.getOptional("mrz_line_1")

        /**
         * Second line of the MRZ on the document.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mrzLine2(): Optional<String> = mrzLine2.getOptional("mrz_line_2")

        /**
         * Third line of the MRZ if applicable; otherwise null.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mrzLine3(): Optional<String> = mrzLine3.getOptional("mrz_line_3")

        /**
         * Type of document (e.g., passport, identity card).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [backDocumentSignedUrl].
         *
         * Unlike [backDocumentSignedUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("back_document_signed_url")
        @ExcludeMissing
        fun _backDocumentSignedUrl(): JsonField<String> = backDocumentSignedUrl

        /**
         * Returns the raw JSON value of [birthPlace].
         *
         * Unlike [birthPlace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birth_place")
        @ExcludeMissing
        fun _birthPlace(): JsonField<String> = birthPlace

        /**
         * Returns the raw JSON value of [birthday].
         *
         * Unlike [birthday], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthday") @ExcludeMissing fun _birthday(): JsonField<String> = birthday

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration_date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<String> = expirationDate

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [frontDocumentSignedUrl].
         *
         * Unlike [frontDocumentSignedUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("front_document_signed_url")
        @ExcludeMissing
        fun _frontDocumentSignedUrl(): JsonField<String> = frontDocumentSignedUrl

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

        /**
         * Returns the raw JSON value of [issueDate].
         *
         * Unlike [issueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issue_date") @ExcludeMissing fun _issueDate(): JsonField<String> = issueDate

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [mrzLine1].
         *
         * Unlike [mrzLine1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mrz_line_1") @ExcludeMissing fun _mrzLine1(): JsonField<String> = mrzLine1

        /**
         * Returns the raw JSON value of [mrzLine2].
         *
         * Unlike [mrzLine2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mrz_line_2") @ExcludeMissing fun _mrzLine2(): JsonField<String> = mrzLine2

        /**
         * Returns the raw JSON value of [mrzLine3].
         *
         * Unlike [mrzLine3], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mrz_line_3") @ExcludeMissing fun _mrzLine3(): JsonField<String> = mrzLine3

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

            /** Returns a mutable builder for constructing an instance of [IdentityCard]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IdentityCard]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var backDocumentSignedUrl: JsonField<String> = JsonMissing.of()
            private var birthPlace: JsonField<String> = JsonMissing.of()
            private var birthday: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var expirationDate: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var frontDocumentSignedUrl: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<String> = JsonMissing.of()
            private var issueDate: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var mrzLine1: JsonField<String> = JsonMissing.of()
            private var mrzLine2: JsonField<String> = JsonMissing.of()
            private var mrzLine3: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(identityCard: IdentityCard) = apply {
                id = identityCard.id
                backDocumentSignedUrl = identityCard.backDocumentSignedUrl
                birthPlace = identityCard.birthPlace
                birthday = identityCard.birthday
                country = identityCard.country
                expirationDate = identityCard.expirationDate
                firstName = identityCard.firstName
                frontDocumentSignedUrl = identityCard.frontDocumentSignedUrl
                gender = identityCard.gender
                issueDate = identityCard.issueDate
                lastName = identityCard.lastName
                mrzLine1 = identityCard.mrzLine1
                mrzLine2 = identityCard.mrzLine2
                mrzLine3 = identityCard.mrzLine3
                type = identityCard.type
                additionalProperties = identityCard.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the document. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Signed URL linking to the back image of the document. */
            fun backDocumentSignedUrl(backDocumentSignedUrl: String) =
                backDocumentSignedUrl(JsonField.of(backDocumentSignedUrl))

            /**
             * Sets [Builder.backDocumentSignedUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backDocumentSignedUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun backDocumentSignedUrl(backDocumentSignedUrl: JsonField<String>) = apply {
                this.backDocumentSignedUrl = backDocumentSignedUrl
            }

            /** Place of birth as indicated on the document. */
            fun birthPlace(birthPlace: String) = birthPlace(JsonField.of(birthPlace))

            /**
             * Sets [Builder.birthPlace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthPlace] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthPlace(birthPlace: JsonField<String>) = apply { this.birthPlace = birthPlace }

            /** Date of birth in DD/MM/YYYY format as shown on the document. */
            fun birthday(birthday: String) = birthday(JsonField.of(birthday))

            /**
             * Sets [Builder.birthday] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthday] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthday(birthday: JsonField<String>) = apply { this.birthday = birthday }

            /** Country code issuing the document (ISO 3166-1 alpha-2). */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Expiration date of the document, in YYYY-MM-DD format. */
            fun expirationDate(expirationDate: String) =
                expirationDate(JsonField.of(expirationDate))

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationDate(expirationDate: JsonField<String>) = apply {
                this.expirationDate = expirationDate
            }

            /** First name as shown on the document. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Signed URL linking to the front image of the document. */
            fun frontDocumentSignedUrl(frontDocumentSignedUrl: String) =
                frontDocumentSignedUrl(JsonField.of(frontDocumentSignedUrl))

            /**
             * Sets [Builder.frontDocumentSignedUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontDocumentSignedUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun frontDocumentSignedUrl(frontDocumentSignedUrl: JsonField<String>) = apply {
                this.frontDocumentSignedUrl = frontDocumentSignedUrl
            }

            /** Gender indicated on the document (e.g., "M" or "F"). */
            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

            /** Date when the document was issued, in YYYY-MM-DD format. */
            fun issueDate(issueDate: String) = issueDate(JsonField.of(issueDate))

            /**
             * Sets [Builder.issueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issueDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issueDate(issueDate: JsonField<String>) = apply { this.issueDate = issueDate }

            /** Last name as shown on the document. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** First line of the Machine Readable Zone (MRZ) on the document. */
            fun mrzLine1(mrzLine1: String) = mrzLine1(JsonField.of(mrzLine1))

            /**
             * Sets [Builder.mrzLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mrzLine1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mrzLine1(mrzLine1: JsonField<String>) = apply { this.mrzLine1 = mrzLine1 }

            /** Second line of the MRZ on the document. */
            fun mrzLine2(mrzLine2: String) = mrzLine2(JsonField.of(mrzLine2))

            /**
             * Sets [Builder.mrzLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mrzLine2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mrzLine2(mrzLine2: JsonField<String>) = apply { this.mrzLine2 = mrzLine2 }

            /** Third line of the MRZ if applicable; otherwise null. */
            fun mrzLine3(mrzLine3: String?) = mrzLine3(JsonField.ofNullable(mrzLine3))

            /** Alias for calling [Builder.mrzLine3] with `mrzLine3.orElse(null)`. */
            fun mrzLine3(mrzLine3: Optional<String>) = mrzLine3(mrzLine3.getOrNull())

            /**
             * Sets [Builder.mrzLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mrzLine3] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mrzLine3(mrzLine3: JsonField<String>) = apply { this.mrzLine3 = mrzLine3 }

            /** Type of document (e.g., passport, identity card). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [IdentityCard].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IdentityCard =
                IdentityCard(
                    id,
                    backDocumentSignedUrl,
                    birthPlace,
                    birthday,
                    country,
                    expirationDate,
                    firstName,
                    frontDocumentSignedUrl,
                    gender,
                    issueDate,
                    lastName,
                    mrzLine1,
                    mrzLine2,
                    mrzLine3,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): IdentityCard = apply {
            if (validated) {
                return@apply
            }

            id()
            backDocumentSignedUrl()
            birthPlace()
            birthday()
            country()
            expirationDate()
            firstName()
            frontDocumentSignedUrl()
            gender()
            issueDate()
            lastName()
            mrzLine1()
            mrzLine2()
            mrzLine3()
            type()
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
                (if (backDocumentSignedUrl.asKnown().isPresent) 1 else 0) +
                (if (birthPlace.asKnown().isPresent) 1 else 0) +
                (if (birthday.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (expirationDate.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (frontDocumentSignedUrl.asKnown().isPresent) 1 else 0) +
                (if (gender.asKnown().isPresent) 1 else 0) +
                (if (issueDate.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (if (mrzLine1.asKnown().isPresent) 1 else 0) +
                (if (mrzLine2.asKnown().isPresent) 1 else 0) +
                (if (mrzLine3.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IdentityCard &&
                id == other.id &&
                backDocumentSignedUrl == other.backDocumentSignedUrl &&
                birthPlace == other.birthPlace &&
                birthday == other.birthday &&
                country == other.country &&
                expirationDate == other.expirationDate &&
                firstName == other.firstName &&
                frontDocumentSignedUrl == other.frontDocumentSignedUrl &&
                gender == other.gender &&
                issueDate == other.issueDate &&
                lastName == other.lastName &&
                mrzLine1 == other.mrzLine1 &&
                mrzLine2 == other.mrzLine2 &&
                mrzLine3 == other.mrzLine3 &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                backDocumentSignedUrl,
                birthPlace,
                birthday,
                country,
                expirationDate,
                firstName,
                frontDocumentSignedUrl,
                gender,
                issueDate,
                lastName,
                mrzLine1,
                mrzLine2,
                mrzLine3,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IdentityCard{id=$id, backDocumentSignedUrl=$backDocumentSignedUrl, birthPlace=$birthPlace, birthday=$birthday, country=$country, expirationDate=$expirationDate, firstName=$firstName, frontDocumentSignedUrl=$frontDocumentSignedUrl, gender=$gender, issueDate=$issueDate, lastName=$lastName, mrzLine1=$mrzLine1, mrzLine2=$mrzLine2, mrzLine3=$mrzLine3, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Personal details of the individual, such as name, date of birth, and contact info. */
    class Person
    private constructor(
        private val birthday: JsonField<String>,
        private val email: JsonField<String>,
        private val faceImageSignedUrl: JsonField<String>,
        private val firstName: JsonField<String>,
        private val fullName: JsonField<String>,
        private val gender: JsonField<String>,
        private val lastName: JsonField<String>,
        private val maidenName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("birthday")
            @ExcludeMissing
            birthday: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("face_image_signed_url")
            @ExcludeMissing
            faceImageSignedUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("full_name")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maiden_name")
            @ExcludeMissing
            maidenName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            birthday,
            email,
            faceImageSignedUrl,
            firstName,
            fullName,
            gender,
            lastName,
            maidenName,
            phoneNumber,
            mutableMapOf(),
        )

        /**
         * Date of birth, formatted as DD/MM/YYYY.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun birthday(): Optional<String> = birthday.getOptional("birthday")

        /**
         * Email address of the individual.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Signed URL linking to the person’s face image.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun faceImageSignedUrl(): Optional<String> =
            faceImageSignedUrl.getOptional("face_image_signed_url")

        /**
         * First (given) name of the person.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * Full name of the person, typically concatenation of first and last names.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fullName(): Optional<String> = fullName.getOptional("full_name")

        /**
         * Gender of the individual (e.g., "M" for male, "F" for female).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gender(): Optional<String> = gender.getOptional("gender")

        /**
         * Last (family) name of the person.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

        /**
         * Maiden name of the person, if applicable.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maidenName(): Optional<String> = maidenName.getOptional("maiden_name")

        /**
         * Contact phone number including country code.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Returns the raw JSON value of [birthday].
         *
         * Unlike [birthday], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthday") @ExcludeMissing fun _birthday(): JsonField<String> = birthday

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [faceImageSignedUrl].
         *
         * Unlike [faceImageSignedUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("face_image_signed_url")
        @ExcludeMissing
        fun _faceImageSignedUrl(): JsonField<String> = faceImageSignedUrl

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [maidenName].
         *
         * Unlike [maidenName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maiden_name")
        @ExcludeMissing
        fun _maidenName(): JsonField<String> = maidenName

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [Person]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Person]. */
        class Builder internal constructor() {

            private var birthday: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var faceImageSignedUrl: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var maidenName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(person: Person) = apply {
                birthday = person.birthday
                email = person.email
                faceImageSignedUrl = person.faceImageSignedUrl
                firstName = person.firstName
                fullName = person.fullName
                gender = person.gender
                lastName = person.lastName
                maidenName = person.maidenName
                phoneNumber = person.phoneNumber
                additionalProperties = person.additionalProperties.toMutableMap()
            }

            /** Date of birth, formatted as DD/MM/YYYY. */
            fun birthday(birthday: String) = birthday(JsonField.of(birthday))

            /**
             * Sets [Builder.birthday] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthday] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthday(birthday: JsonField<String>) = apply { this.birthday = birthday }

            /** Email address of the individual. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Signed URL linking to the person’s face image. */
            fun faceImageSignedUrl(faceImageSignedUrl: String) =
                faceImageSignedUrl(JsonField.of(faceImageSignedUrl))

            /**
             * Sets [Builder.faceImageSignedUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.faceImageSignedUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun faceImageSignedUrl(faceImageSignedUrl: JsonField<String>) = apply {
                this.faceImageSignedUrl = faceImageSignedUrl
            }

            /** First (given) name of the person. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Full name of the person, typically concatenation of first and last names. */
            fun fullName(fullName: String) = fullName(JsonField.of(fullName))

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            /** Gender of the individual (e.g., "M" for male, "F" for female). */
            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

            /** Last (family) name of the person. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Maiden name of the person, if applicable. */
            fun maidenName(maidenName: String) = maidenName(JsonField.of(maidenName))

            /**
             * Sets [Builder.maidenName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maidenName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maidenName(maidenName: JsonField<String>) = apply { this.maidenName = maidenName }

            /** Contact phone number including country code. */
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
             * Returns an immutable instance of [Person].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Person =
                Person(
                    birthday,
                    email,
                    faceImageSignedUrl,
                    firstName,
                    fullName,
                    gender,
                    lastName,
                    maidenName,
                    phoneNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Person = apply {
            if (validated) {
                return@apply
            }

            birthday()
            email()
            faceImageSignedUrl()
            firstName()
            fullName()
            gender()
            lastName()
            maidenName()
            phoneNumber()
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
            (if (birthday.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (faceImageSignedUrl.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (fullName.asKnown().isPresent) 1 else 0) +
                (if (gender.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (if (maidenName.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Person &&
                birthday == other.birthday &&
                email == other.email &&
                faceImageSignedUrl == other.faceImageSignedUrl &&
                firstName == other.firstName &&
                fullName == other.fullName &&
                gender == other.gender &&
                lastName == other.lastName &&
                maidenName == other.maidenName &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                birthday,
                email,
                faceImageSignedUrl,
                firstName,
                fullName,
                gender,
                lastName,
                maidenName,
                phoneNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Person{birthday=$birthday, email=$email, faceImageSignedUrl=$faceImageSignedUrl, firstName=$firstName, fullName=$fullName, gender=$gender, lastName=$lastName, maidenName=$maidenName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
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

            return other is Property &&
                name == other.name &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, type, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Property{name=$name, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Risk assessment associated with the individual. */
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

            return other is Risk &&
                code == other.code &&
                reason == other.reason &&
                score == other.score &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(code, reason, score, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Risk{code=$code, reason=$reason, score=$score, additionalProperties=$additionalProperties}"
    }

    /**
     * Represents a key-value metadata tag that can be associated with entities such as individuals
     * or companies.
     */
    class Tag
    private constructor(
        private val key: JsonField<String>,
        private val private_: JsonField<Boolean>,
        private val type: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("private")
            @ExcludeMissing
            private_: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(key, private_, type, value, mutableMapOf())

        /**
         * Name of the tag used to identify the metadata field.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun key(): Optional<String> = key.getOptional("key")

        /**
         * Indicates whether the tag is private (not visible to external users).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun private_(): Optional<Boolean> = private_.getOptional("private")

        /**
         * Data type of the tag value (e.g., "string", "number", "boolean").
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Value assigned to the tag.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [private_].
         *
         * Unlike [private_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("private") @ExcludeMissing fun _private_(): JsonField<Boolean> = private_

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

            /** Returns a mutable builder for constructing an instance of [Tag]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tag]. */
        class Builder internal constructor() {

            private var key: JsonField<String> = JsonMissing.of()
            private var private_: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tag: Tag) = apply {
                key = tag.key
                private_ = tag.private_
                type = tag.type
                value = tag.value
                additionalProperties = tag.additionalProperties.toMutableMap()
            }

            /** Name of the tag used to identify the metadata field. */
            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /** Indicates whether the tag is private (not visible to external users). */
            fun private_(private_: Boolean) = private_(JsonField.of(private_))

            /**
             * Sets [Builder.private_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.private_] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun private_(private_: JsonField<Boolean>) = apply { this.private_ = private_ }

            /** Data type of the tag value (e.g., "string", "number", "boolean"). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Value assigned to the tag. */
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
             * Returns an immutable instance of [Tag].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tag = Tag(key, private_, type, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Tag = apply {
            if (validated) {
                return@apply
            }

            key()
            private_()
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
            (if (key.asKnown().isPresent) 1 else 0) +
                (if (private_.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tag &&
                key == other.key &&
                private_ == other.private_ &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(key, private_, type, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tag{key=$key, private_=$private_, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Technical metadata related to the request (e.g., QR code settings, language). */
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
        private val rawData: JsonField<Boolean>,
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val sessionDuration: JsonField<Long>,
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
            @JsonProperty("raw_data")
            @ExcludeMissing
            rawData: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("rejected_at")
            @ExcludeMissing
            rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("session_duration")
            @ExcludeMissing
            sessionDuration: JsonField<Long> = JsonMissing.of(),
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
            rawData,
            rejectedAt,
            sessionDuration,
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
         * Flag indicating whether to include raw data in the response.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rawData(): Optional<Boolean> = rawData.getOptional("raw_data")

        /**
         * Timestamp when the request or process was rejected; null if not rejected.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rejectedAt(): Optional<OffsetDateTime> = rejectedAt.getOptional("rejected_at")

        /**
         * Duration of the user session in seconds.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sessionDuration(): Optional<Long> = sessionDuration.getOptional("session_duration")

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
         * Returns the raw JSON value of [rawData].
         *
         * Unlike [rawData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw_data") @ExcludeMissing fun _rawData(): JsonField<Boolean> = rawData

        /**
         * Returns the raw JSON value of [rejectedAt].
         *
         * Unlike [rejectedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

        /**
         * Returns the raw JSON value of [sessionDuration].
         *
         * Unlike [sessionDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("session_duration")
        @ExcludeMissing
        fun _sessionDuration(): JsonField<Long> = sessionDuration

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
            private var rawData: JsonField<Boolean> = JsonMissing.of()
            private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var sessionDuration: JsonField<Long> = JsonMissing.of()
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
                rawData = technicalData.rawData
                rejectedAt = technicalData.rejectedAt
                sessionDuration = technicalData.sessionDuration
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

            /** Duration of the user session in seconds. */
            fun sessionDuration(sessionDuration: Long) =
                sessionDuration(JsonField.of(sessionDuration))

            /**
             * Sets [Builder.sessionDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionDuration] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionDuration(sessionDuration: JsonField<Long>) = apply {
                this.sessionDuration = sessionDuration
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
                    rawData,
                    rejectedAt,
                    sessionDuration,
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
            rawData()
            rejectedAt()
            sessionDuration()
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
                (if (rawData.asKnown().isPresent) 1 else 0) +
                (if (rejectedAt.asKnown().isPresent) 1 else 0) +
                (if (sessionDuration.asKnown().isPresent) 1 else 0) +
                (if (startedAt.asKnown().isPresent) 1 else 0) +
                (if (transferAt.asKnown().isPresent) 1 else 0) +
                (if (transferMode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TechnicalData &&
                apiVersion == other.apiVersion &&
                approvedAt == other.approvedAt &&
                callbackUrl == other.callbackUrl &&
                callbackUrlNotification == other.callbackUrlNotification &&
                disableNotification == other.disableNotification &&
                disableNotificationDate == other.disableNotificationDate &&
                exportType == other.exportType &&
                finishedAt == other.finishedAt &&
                ip == other.ip &&
                language == other.language &&
                locationIp == other.locationIp &&
                needReviewAt == other.needReviewAt &&
                notificationConfirmation == other.notificationConfirmation &&
                qrCode == other.qrCode &&
                rawData == other.rawData &&
                rejectedAt == other.rejectedAt &&
                sessionDuration == other.sessionDuration &&
                startedAt == other.startedAt &&
                transferAt == other.transferAt &&
                transferMode == other.transferMode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
                rawData,
                rejectedAt,
                sessionDuration,
                startedAt,
                transferAt,
                transferMode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TechnicalData{apiVersion=$apiVersion, approvedAt=$approvedAt, callbackUrl=$callbackUrl, callbackUrlNotification=$callbackUrlNotification, disableNotification=$disableNotification, disableNotificationDate=$disableNotificationDate, exportType=$exportType, finishedAt=$finishedAt, ip=$ip, language=$language, locationIp=$locationIp, needReviewAt=$needReviewAt, notificationConfirmation=$notificationConfirmation, qrCode=$qrCode, rawData=$rawData, rejectedAt=$rejectedAt, sessionDuration=$sessionDuration, startedAt=$startedAt, transferAt=$transferAt, transferMode=$transferMode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Individual &&
            id == other.id &&
            amlSuspicions == other.amlSuspicions &&
            authUrl == other.authUrl &&
            certificat == other.certificat &&
            checks == other.checks &&
            createdAt == other.createdAt &&
            documents == other.documents &&
            identityCard == other.identityCard &&
            number == other.number &&
            person == other.person &&
            portalUrl == other.portalUrl &&
            properties == other.properties &&
            risk == other.risk &&
            sourceId == other.sourceId &&
            state == other.state &&
            status == other.status &&
            tags == other.tags &&
            technicalData == other.technicalData &&
            webviewUrl == other.webviewUrl &&
            workspaceId == other.workspaceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amlSuspicions,
            authUrl,
            certificat,
            checks,
            createdAt,
            documents,
            identityCard,
            number,
            person,
            portalUrl,
            properties,
            risk,
            sourceId,
            state,
            status,
            tags,
            technicalData,
            webviewUrl,
            workspaceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Individual{id=$id, amlSuspicions=$amlSuspicions, authUrl=$authUrl, certificat=$certificat, checks=$checks, createdAt=$createdAt, documents=$documents, identityCard=$identityCard, number=$number, person=$person, portalUrl=$portalUrl, properties=$properties, risk=$risk, sourceId=$sourceId, state=$state, status=$status, tags=$tags, technicalData=$technicalData, webviewUrl=$webviewUrl, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
}
