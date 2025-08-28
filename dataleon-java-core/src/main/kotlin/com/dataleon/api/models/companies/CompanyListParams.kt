// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models.companies

import com.dataleon.api.core.Enum
import com.dataleon.api.core.JsonField
import com.dataleon.api.core.Params
import com.dataleon.api.core.http.Headers
import com.dataleon.api.core.http.QueryParams
import com.dataleon.api.errors.DataleonInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all companies */
class CompanyListParams
private constructor(
    private val endDate: LocalDate?,
    private val limit: Long?,
    private val offset: Long?,
    private val sourceId: String?,
    private val startDate: LocalDate?,
    private val state: State?,
    private val status: Status?,
    private val workspaceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter companies created before this date (format YYYY-MM-DD) */
    fun endDate(): Optional<LocalDate> = Optional.ofNullable(endDate)

    /** Number of results to return (between 1 and 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Number of results to skip (must be ≥ 0) */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Filter by source ID */
    fun sourceId(): Optional<String> = Optional.ofNullable(sourceId)

    /** Filter companies created after this date (format YYYY-MM-DD) */
    fun startDate(): Optional<LocalDate> = Optional.ofNullable(startDate)

    /** Filter by company state (must be one of the allowed values) */
    fun state(): Optional<State> = Optional.ofNullable(state)

    /** Filter by individual status (must be one of the allowed values) */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Filter by workspace ID */
    fun workspaceId(): Optional<String> = Optional.ofNullable(workspaceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CompanyListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CompanyListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyListParams]. */
    class Builder internal constructor() {

        private var endDate: LocalDate? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var sourceId: String? = null
        private var startDate: LocalDate? = null
        private var state: State? = null
        private var status: Status? = null
        private var workspaceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(companyListParams: CompanyListParams) = apply {
            endDate = companyListParams.endDate
            limit = companyListParams.limit
            offset = companyListParams.offset
            sourceId = companyListParams.sourceId
            startDate = companyListParams.startDate
            state = companyListParams.state
            status = companyListParams.status
            workspaceId = companyListParams.workspaceId
            additionalHeaders = companyListParams.additionalHeaders.toBuilder()
            additionalQueryParams = companyListParams.additionalQueryParams.toBuilder()
        }

        /** Filter companies created before this date (format YYYY-MM-DD) */
        fun endDate(endDate: LocalDate?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<LocalDate>) = endDate(endDate.getOrNull())

        /** Number of results to return (between 1 and 100) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Number of results to skip (must be ≥ 0) */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Filter by source ID */
        fun sourceId(sourceId: String?) = apply { this.sourceId = sourceId }

        /** Alias for calling [Builder.sourceId] with `sourceId.orElse(null)`. */
        fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.getOrNull())

        /** Filter companies created after this date (format YYYY-MM-DD) */
        fun startDate(startDate: LocalDate?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<LocalDate>) = startDate(startDate.getOrNull())

        /** Filter by company state (must be one of the allowed values) */
        fun state(state: State?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<State>) = state(state.getOrNull())

        /** Filter by individual status (must be one of the allowed values) */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /** Filter by workspace ID */
        fun workspaceId(workspaceId: String?) = apply { this.workspaceId = workspaceId }

        /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
        fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.getOrNull())

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
         * Returns an immutable instance of [CompanyListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CompanyListParams =
            CompanyListParams(
                endDate,
                limit,
                offset,
                sourceId,
                startDate,
                state,
                status,
                workspaceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endDate?.let { put("end_date", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                sourceId?.let { put("source_id", it) }
                startDate?.let { put("start_date", it.toString()) }
                state?.let { put("state", it.toString()) }
                status?.let { put("status", it.toString()) }
                workspaceId?.let { put("workspace_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by company state (must be one of the allowed values) */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VOID = of("VOID")

            @JvmField val WAITING = of("WAITING")

            @JvmField val STARTED = of("STARTED")

            @JvmField val RUNNING = of("RUNNING")

            @JvmField val PROCESSED = of("PROCESSED")

            @JvmField val FAILED = of("FAILED")

            @JvmField val ABORTED = of("ABORTED")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val DELETED = of("DELETED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            VOID,
            WAITING,
            STARTED,
            RUNNING,
            PROCESSED,
            FAILED,
            ABORTED,
            EXPIRED,
            DELETED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VOID,
            WAITING,
            STARTED,
            RUNNING,
            PROCESSED,
            FAILED,
            ABORTED,
            EXPIRED,
            DELETED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                VOID -> Value.VOID
                WAITING -> Value.WAITING
                STARTED -> Value.STARTED
                RUNNING -> Value.RUNNING
                PROCESSED -> Value.PROCESSED
                FAILED -> Value.FAILED
                ABORTED -> Value.ABORTED
                EXPIRED -> Value.EXPIRED
                DELETED -> Value.DELETED
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
                VOID -> Known.VOID
                WAITING -> Known.WAITING
                STARTED -> Known.STARTED
                RUNNING -> Known.RUNNING
                PROCESSED -> Known.PROCESSED
                FAILED -> Known.FAILED
                ABORTED -> Known.ABORTED
                EXPIRED -> Known.EXPIRED
                DELETED -> Known.DELETED
                else -> throw DataleonInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by individual status (must be one of the allowed values) */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val REJECTED = of("rejected")

            @JvmField val NEED_REVIEW = of("need_review")

            @JvmField val APPROVED = of("approved")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            REJECTED,
            NEED_REVIEW,
            APPROVED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REJECTED,
            NEED_REVIEW,
            APPROVED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                REJECTED -> Value.REJECTED
                NEED_REVIEW -> Value.NEED_REVIEW
                APPROVED -> Value.APPROVED
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
                REJECTED -> Known.REJECTED
                NEED_REVIEW -> Known.NEED_REVIEW
                APPROVED -> Known.APPROVED
                else -> throw DataleonInvalidDataException("Unknown Status: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyListParams &&
            endDate == other.endDate &&
            limit == other.limit &&
            offset == other.offset &&
            sourceId == other.sourceId &&
            startDate == other.startDate &&
            state == other.state &&
            status == other.status &&
            workspaceId == other.workspaceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endDate,
            limit,
            offset,
            sourceId,
            startDate,
            state,
            status,
            workspaceId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CompanyListParams{endDate=$endDate, limit=$limit, offset=$offset, sourceId=$sourceId, startDate=$startDate, state=$state, status=$status, workspaceId=$workspaceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
