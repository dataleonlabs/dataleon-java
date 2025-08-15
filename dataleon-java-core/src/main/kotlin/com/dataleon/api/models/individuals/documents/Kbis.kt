// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models.individuals.documents

import com.dataleon.api.core.Enum
import com.dataleon.api.core.ExcludeMissing
import com.dataleon.api.core.JsonField
import com.dataleon.api.core.JsonMissing
import com.dataleon.api.core.JsonValue
import com.dataleon.api.core.checkKnown
import com.dataleon.api.core.toImmutable
import com.dataleon.api.errors.DataleonInvalidDataException
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

/** A document representing official registration data from the KBIS (France). */
class Kbis
private constructor(
    private val activities: JsonField<String>,
    private val address: JsonField<String>,
    private val capitalSocial: JsonField<String>,
    private val closureDate: JsonField<LocalDate>,
    private val companyName: JsonField<String>,
    private val documentDate: JsonField<LocalDate>,
    private val documentType: JsonField<String>,
    private val firstClosureDate: JsonField<LocalDate>,
    private val fromGreffe: JsonField<String>,
    private val legalForm: JsonField<String>,
    private val members: JsonField<List<Member>>,
    private val ngestion: JsonField<String>,
    private val rcsNumber: JsonField<String>,
    private val registrationDate: JsonField<LocalDate>,
    private val sirenInfo: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activities")
        @ExcludeMissing
        activities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capital_social")
        @ExcludeMissing
        capitalSocial: JsonField<String> = JsonMissing.of(),
        @JsonProperty("closure_date")
        @ExcludeMissing
        closureDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("company_name")
        @ExcludeMissing
        companyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_date")
        @ExcludeMissing
        documentDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_closure_date")
        @ExcludeMissing
        firstClosureDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("from_greffe")
        @ExcludeMissing
        fromGreffe: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_form") @ExcludeMissing legalForm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("members")
        @ExcludeMissing
        members: JsonField<List<Member>> = JsonMissing.of(),
        @JsonProperty("ngestion") @ExcludeMissing ngestion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rcs_number") @ExcludeMissing rcsNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("registration_date")
        @ExcludeMissing
        registrationDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("siren_info") @ExcludeMissing sirenInfo: JsonField<String> = JsonMissing.of(),
    ) : this(
        activities,
        address,
        capitalSocial,
        closureDate,
        companyName,
        documentDate,
        documentType,
        firstClosureDate,
        fromGreffe,
        legalForm,
        members,
        ngestion,
        rcsNumber,
        registrationDate,
        sirenInfo,
        mutableMapOf(),
    )

    /**
     * Declared business activities.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activities(): Optional<String> = activities.getOptional("activities")

    /**
     * Official address of the company.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<String> = address.getOptional("address")

    /**
     * Registered social capital of the company.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capitalSocial(): Optional<String> = capitalSocial.getOptional("capital_social")

    /**
     * Date of closure, if applicable.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closureDate(): Optional<LocalDate> = closureDate.getOptional("closure_date")

    /**
     * Official name of the company.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = companyName.getOptional("company_name")

    /**
     * Date when the document was issued.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentDate(): Optional<LocalDate> = documentDate.getOptional("document_date")

    /**
     * Fixed identifier for the document type.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentType(): Optional<String> = documentType.getOptional("document_type")

    /**
     * Date of the first fiscal closure.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstClosureDate(): Optional<LocalDate> = firstClosureDate.getOptional("first_closure_date")

    /**
     * Registry office that issued the document.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromGreffe(): Optional<String> = fromGreffe.getOptional("from_greffe")

    /**
     * Legal form of the company (e.g., SAS, SARL).
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalForm(): Optional<String> = legalForm.getOptional("legal_form")

    /**
     * List of people or entities associated with the company.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun members(): Optional<List<Member>> = members.getOptional("members")

    /**
     * Business registry number or NGestion.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ngestion(): Optional<String> = ngestion.getOptional("ngestion")

    /**
     * RCS (Company Registration Number).
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rcsNumber(): Optional<String> = rcsNumber.getOptional("rcs_number")

    /**
     * Date of registration with the registry.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registrationDate(): Optional<LocalDate> = registrationDate.getOptional("registration_date")

    /**
     * SIREN number of the company.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sirenInfo(): Optional<String> = sirenInfo.getOptional("siren_info")

    /**
     * Returns the raw JSON value of [activities].
     *
     * Unlike [activities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activities") @ExcludeMissing fun _activities(): JsonField<String> = activities

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

    /**
     * Returns the raw JSON value of [capitalSocial].
     *
     * Unlike [capitalSocial], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capital_social")
    @ExcludeMissing
    fun _capitalSocial(): JsonField<String> = capitalSocial

    /**
     * Returns the raw JSON value of [closureDate].
     *
     * Unlike [closureDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closure_date")
    @ExcludeMissing
    fun _closureDate(): JsonField<LocalDate> = closureDate

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_name")
    @ExcludeMissing
    fun _companyName(): JsonField<String> = companyName

    /**
     * Returns the raw JSON value of [documentDate].
     *
     * Unlike [documentDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_date")
    @ExcludeMissing
    fun _documentDate(): JsonField<LocalDate> = documentDate

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<String> = documentType

    /**
     * Returns the raw JSON value of [firstClosureDate].
     *
     * Unlike [firstClosureDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("first_closure_date")
    @ExcludeMissing
    fun _firstClosureDate(): JsonField<LocalDate> = firstClosureDate

    /**
     * Returns the raw JSON value of [fromGreffe].
     *
     * Unlike [fromGreffe], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from_greffe") @ExcludeMissing fun _fromGreffe(): JsonField<String> = fromGreffe

    /**
     * Returns the raw JSON value of [legalForm].
     *
     * Unlike [legalForm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_form") @ExcludeMissing fun _legalForm(): JsonField<String> = legalForm

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("members") @ExcludeMissing fun _members(): JsonField<List<Member>> = members

    /**
     * Returns the raw JSON value of [ngestion].
     *
     * Unlike [ngestion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ngestion") @ExcludeMissing fun _ngestion(): JsonField<String> = ngestion

    /**
     * Returns the raw JSON value of [rcsNumber].
     *
     * Unlike [rcsNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rcs_number") @ExcludeMissing fun _rcsNumber(): JsonField<String> = rcsNumber

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
     * Returns the raw JSON value of [sirenInfo].
     *
     * Unlike [sirenInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("siren_info") @ExcludeMissing fun _sirenInfo(): JsonField<String> = sirenInfo

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

        /** Returns a mutable builder for constructing an instance of [Kbis]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Kbis]. */
    class Builder internal constructor() {

        private var activities: JsonField<String> = JsonMissing.of()
        private var address: JsonField<String> = JsonMissing.of()
        private var capitalSocial: JsonField<String> = JsonMissing.of()
        private var closureDate: JsonField<LocalDate> = JsonMissing.of()
        private var companyName: JsonField<String> = JsonMissing.of()
        private var documentDate: JsonField<LocalDate> = JsonMissing.of()
        private var documentType: JsonField<String> = JsonMissing.of()
        private var firstClosureDate: JsonField<LocalDate> = JsonMissing.of()
        private var fromGreffe: JsonField<String> = JsonMissing.of()
        private var legalForm: JsonField<String> = JsonMissing.of()
        private var members: JsonField<MutableList<Member>>? = null
        private var ngestion: JsonField<String> = JsonMissing.of()
        private var rcsNumber: JsonField<String> = JsonMissing.of()
        private var registrationDate: JsonField<LocalDate> = JsonMissing.of()
        private var sirenInfo: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(kbis: Kbis) = apply {
            activities = kbis.activities
            address = kbis.address
            capitalSocial = kbis.capitalSocial
            closureDate = kbis.closureDate
            companyName = kbis.companyName
            documentDate = kbis.documentDate
            documentType = kbis.documentType
            firstClosureDate = kbis.firstClosureDate
            fromGreffe = kbis.fromGreffe
            legalForm = kbis.legalForm
            members = kbis.members.map { it.toMutableList() }
            ngestion = kbis.ngestion
            rcsNumber = kbis.rcsNumber
            registrationDate = kbis.registrationDate
            sirenInfo = kbis.sirenInfo
            additionalProperties = kbis.additionalProperties.toMutableMap()
        }

        /** Declared business activities. */
        fun activities(activities: String) = activities(JsonField.of(activities))

        /**
         * Sets [Builder.activities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activities] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activities(activities: JsonField<String>) = apply { this.activities = activities }

        /** Official address of the company. */
        fun address(address: String) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { this.address = address }

        /** Registered social capital of the company. */
        fun capitalSocial(capitalSocial: String) = capitalSocial(JsonField.of(capitalSocial))

        /**
         * Sets [Builder.capitalSocial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capitalSocial] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun capitalSocial(capitalSocial: JsonField<String>) = apply {
            this.capitalSocial = capitalSocial
        }

        /** Date of closure, if applicable. */
        fun closureDate(closureDate: LocalDate) = closureDate(JsonField.of(closureDate))

        /**
         * Sets [Builder.closureDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closureDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closureDate(closureDate: JsonField<LocalDate>) = apply {
            this.closureDate = closureDate
        }

        /** Official name of the company. */
        fun companyName(companyName: String) = companyName(JsonField.of(companyName))

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        /** Date when the document was issued. */
        fun documentDate(documentDate: LocalDate) = documentDate(JsonField.of(documentDate))

        /**
         * Sets [Builder.documentDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentDate(documentDate: JsonField<LocalDate>) = apply {
            this.documentDate = documentDate
        }

        /** Fixed identifier for the document type. */
        fun documentType(documentType: String) = documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentType(documentType: JsonField<String>) = apply {
            this.documentType = documentType
        }

        /** Date of the first fiscal closure. */
        fun firstClosureDate(firstClosureDate: LocalDate) =
            firstClosureDate(JsonField.of(firstClosureDate))

        /**
         * Sets [Builder.firstClosureDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstClosureDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstClosureDate(firstClosureDate: JsonField<LocalDate>) = apply {
            this.firstClosureDate = firstClosureDate
        }

        /** Registry office that issued the document. */
        fun fromGreffe(fromGreffe: String) = fromGreffe(JsonField.of(fromGreffe))

        /**
         * Sets [Builder.fromGreffe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromGreffe] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fromGreffe(fromGreffe: JsonField<String>) = apply { this.fromGreffe = fromGreffe }

        /** Legal form of the company (e.g., SAS, SARL). */
        fun legalForm(legalForm: String) = legalForm(JsonField.of(legalForm))

        /**
         * Sets [Builder.legalForm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalForm] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalForm(legalForm: JsonField<String>) = apply { this.legalForm = legalForm }

        /** List of people or entities associated with the company. */
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

        /** Business registry number or NGestion. */
        fun ngestion(ngestion: String) = ngestion(JsonField.of(ngestion))

        /**
         * Sets [Builder.ngestion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ngestion] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ngestion(ngestion: JsonField<String>) = apply { this.ngestion = ngestion }

        /** RCS (Company Registration Number). */
        fun rcsNumber(rcsNumber: String) = rcsNumber(JsonField.of(rcsNumber))

        /**
         * Sets [Builder.rcsNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rcsNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rcsNumber(rcsNumber: JsonField<String>) = apply { this.rcsNumber = rcsNumber }

        /** Date of registration with the registry. */
        fun registrationDate(registrationDate: LocalDate) =
            registrationDate(JsonField.of(registrationDate))

        /**
         * Sets [Builder.registrationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationDate(registrationDate: JsonField<LocalDate>) = apply {
            this.registrationDate = registrationDate
        }

        /** SIREN number of the company. */
        fun sirenInfo(sirenInfo: String) = sirenInfo(JsonField.of(sirenInfo))

        /**
         * Sets [Builder.sirenInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sirenInfo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sirenInfo(sirenInfo: JsonField<String>) = apply { this.sirenInfo = sirenInfo }

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
         * Returns an immutable instance of [Kbis].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Kbis =
            Kbis(
                activities,
                address,
                capitalSocial,
                closureDate,
                companyName,
                documentDate,
                documentType,
                firstClosureDate,
                fromGreffe,
                legalForm,
                (members ?: JsonMissing.of()).map { it.toImmutable() },
                ngestion,
                rcsNumber,
                registrationDate,
                sirenInfo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Kbis = apply {
        if (validated) {
            return@apply
        }

        activities()
        address()
        capitalSocial()
        closureDate()
        companyName()
        documentDate()
        documentType()
        firstClosureDate()
        fromGreffe()
        legalForm()
        members().ifPresent { it.forEach { it.validate() } }
        ngestion()
        rcsNumber()
        registrationDate()
        sirenInfo()
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
        (if (activities.asKnown().isPresent) 1 else 0) +
            (if (address.asKnown().isPresent) 1 else 0) +
            (if (capitalSocial.asKnown().isPresent) 1 else 0) +
            (if (closureDate.asKnown().isPresent) 1 else 0) +
            (if (companyName.asKnown().isPresent) 1 else 0) +
            (if (documentDate.asKnown().isPresent) 1 else 0) +
            (if (documentType.asKnown().isPresent) 1 else 0) +
            (if (firstClosureDate.asKnown().isPresent) 1 else 0) +
            (if (fromGreffe.asKnown().isPresent) 1 else 0) +
            (if (legalForm.asKnown().isPresent) 1 else 0) +
            (members.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (ngestion.asKnown().isPresent) 1 else 0) +
            (if (rcsNumber.asKnown().isPresent) 1 else 0) +
            (if (registrationDate.asKnown().isPresent) 1 else 0) +
            (if (sirenInfo.asKnown().isPresent) 1 else 0)

    /** A member (person or entity) associated with the company from a KBIS document. */
    class Member
    private constructor(
        private val id: JsonField<String>,
        private val address: JsonField<String>,
        private val birthday: JsonField<OffsetDateTime>,
        private val birthplace: JsonField<String>,
        private val country: JsonField<String>,
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
        private val source: JsonField<String>,
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
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
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
            status,
            type,
            workspaceId,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the member.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Address of the member.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * Birth date of the person (only if type = person).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun birthday(): Optional<OffsetDateTime> = birthday.getOptional("birthday")

        /**
         * Place of birth (only if type = person).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun birthplace(): Optional<String> = birthplace.getOptional("birthplace")

        /**
         * Country of residence or registration.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * Email address of the member.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * First name of the person (only if type = person).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * Indicates if this member is a beneficial owner.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isBeneficialOwner(): Optional<Boolean> =
            isBeneficialOwner.getOptional("is_beneficial_owner")

        /**
         * Indicates if this member is a delegator.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isDelegator(): Optional<Boolean> = isDelegator.getOptional("is_delegator")

        /**
         * Last name of the person (only if type = person).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

        /**
         * Indicates if the member passed liveness verification.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun livenessVerification(): Optional<Boolean> =
            livenessVerification.getOptional("liveness_verification")

        /**
         * Name of the company (only if type = company).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Ownership percentage held by the member.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ownershipPercentage(): Optional<Long> =
            ownershipPercentage.getOptional("ownership_percentage")

        /**
         * Phone number of the member.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Postal code of the member's address.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

        /**
         * Company registration number (if type = company).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registrationId(): Optional<String> = registrationId.getOptional("registration_id")

        /**
         * Type of relation (e.g., shareholder, director).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun relation(): Optional<String> = relation.getOptional("relation")

        /**
         * Roles held by the member (e.g., legal_representative or shareholder).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun roles(): Optional<String> = roles.getOptional("roles")

        /**
         * Source of the data (e.g., gouv, user, company).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * Current status of the member.
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Type of entity (company or person).
         *
         * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Workspace identifier for internal tracking.
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
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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
            private var source: JsonField<String> = JsonMissing.of()
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
                status = member.status
                type = member.type
                workspaceId = member.workspaceId
                additionalProperties = member.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the member. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Address of the member. */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Birth date of the person (only if type = person). */
            fun birthday(birthday: OffsetDateTime) = birthday(JsonField.of(birthday))

            /**
             * Sets [Builder.birthday] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthday] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthday(birthday: JsonField<OffsetDateTime>) = apply { this.birthday = birthday }

            /** Place of birth (only if type = person). */
            fun birthplace(birthplace: String) = birthplace(JsonField.of(birthplace))

            /**
             * Sets [Builder.birthplace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthplace] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthplace(birthplace: JsonField<String>) = apply { this.birthplace = birthplace }

            /** Country of residence or registration. */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Email address of the member. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** First name of the person (only if type = person). */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Indicates if this member is a beneficial owner. */
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

            /** Indicates if this member is a delegator. */
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

            /** Last name of the person (only if type = person). */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Indicates if the member passed liveness verification. */
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

            /** Name of the company (only if type = company). */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Ownership percentage held by the member. */
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

            /** Phone number of the member. */
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

            /** Postal code of the member's address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Company registration number (if type = company). */
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

            /** Type of relation (e.g., shareholder, director). */
            fun relation(relation: String) = relation(JsonField.of(relation))

            /**
             * Sets [Builder.relation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relation] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relation(relation: JsonField<String>) = apply { this.relation = relation }

            /** Roles held by the member (e.g., legal_representative or shareholder). */
            fun roles(roles: String) = roles(JsonField.of(roles))

            /**
             * Sets [Builder.roles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roles] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roles(roles: JsonField<String>) = apply { this.roles = roles }

            /** Source of the data (e.g., gouv, user, company). */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Current status of the member. */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Type of entity (company or person). */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Workspace identifier for internal tracking. */
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
            source()
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
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0)

        /** Type of entity (company or person). */
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

                @JvmField val COMPANY = of("company")

                @JvmField val PERSON = of("person")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                COMPANY,
                PERSON,
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
                COMPANY,
                PERSON,
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
                    COMPANY -> Value.COMPANY
                    PERSON -> Value.PERSON
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
                    COMPANY -> Known.COMPANY
                    PERSON -> Known.PERSON
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

            return other is Member &&
                id == other.id &&
                address == other.address &&
                birthday == other.birthday &&
                birthplace == other.birthplace &&
                country == other.country &&
                email == other.email &&
                firstName == other.firstName &&
                isBeneficialOwner == other.isBeneficialOwner &&
                isDelegator == other.isDelegator &&
                lastName == other.lastName &&
                livenessVerification == other.livenessVerification &&
                name == other.name &&
                ownershipPercentage == other.ownershipPercentage &&
                phoneNumber == other.phoneNumber &&
                postalCode == other.postalCode &&
                registrationId == other.registrationId &&
                relation == other.relation &&
                roles == other.roles &&
                source == other.source &&
                status == other.status &&
                type == other.type &&
                workspaceId == other.workspaceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                address,
                birthday,
                birthplace,
                country,
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
                status,
                type,
                workspaceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Member{id=$id, address=$address, birthday=$birthday, birthplace=$birthplace, country=$country, email=$email, firstName=$firstName, isBeneficialOwner=$isBeneficialOwner, isDelegator=$isDelegator, lastName=$lastName, livenessVerification=$livenessVerification, name=$name, ownershipPercentage=$ownershipPercentage, phoneNumber=$phoneNumber, postalCode=$postalCode, registrationId=$registrationId, relation=$relation, roles=$roles, source=$source, status=$status, type=$type, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Kbis &&
            activities == other.activities &&
            address == other.address &&
            capitalSocial == other.capitalSocial &&
            closureDate == other.closureDate &&
            companyName == other.companyName &&
            documentDate == other.documentDate &&
            documentType == other.documentType &&
            firstClosureDate == other.firstClosureDate &&
            fromGreffe == other.fromGreffe &&
            legalForm == other.legalForm &&
            members == other.members &&
            ngestion == other.ngestion &&
            rcsNumber == other.rcsNumber &&
            registrationDate == other.registrationDate &&
            sirenInfo == other.sirenInfo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            activities,
            address,
            capitalSocial,
            closureDate,
            companyName,
            documentDate,
            documentType,
            firstClosureDate,
            fromGreffe,
            legalForm,
            members,
            ngestion,
            rcsNumber,
            registrationDate,
            sirenInfo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Kbis{activities=$activities, address=$address, capitalSocial=$capitalSocial, closureDate=$closureDate, companyName=$companyName, documentDate=$documentDate, documentType=$documentType, firstClosureDate=$firstClosureDate, fromGreffe=$fromGreffe, legalForm=$legalForm, members=$members, ngestion=$ngestion, rcsNumber=$rcsNumber, registrationDate=$registrationDate, sirenInfo=$sirenInfo, additionalProperties=$additionalProperties}"
}
