// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models

import com.dataleon.api.core.ExcludeMissing
import com.dataleon.api.core.JsonField
import com.dataleon.api.core.JsonMissing
import com.dataleon.api.core.JsonValue
import com.dataleon.api.errors.DataleonInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Represents a verification check result. */
class Check
private constructor(
    private val masked: JsonField<Boolean>,
    private val message: JsonField<String>,
    private val name: JsonField<String>,
    private val validate: JsonField<Boolean>,
    private val weight: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("masked") @ExcludeMissing masked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("validate") @ExcludeMissing validate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("weight") @ExcludeMissing weight: JsonField<Long> = JsonMissing.of(),
    ) : this(masked, message, name, validate, weight, mutableMapOf())

    /**
     * Indicates whether the result or data is masked/hidden.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun masked(): Optional<Boolean> = masked.getOptional("masked")

    /**
     * Additional message or explanation about the check result.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Name or type of the check performed.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Result of the check, true if passed.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validate(): Optional<Boolean> = validate.getOptional("validate")

    /**
     * Importance or weight of the check, often used in scoring.
     *
     * @throws DataleonInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weight(): Optional<Long> = weight.getOptional("weight")

    /**
     * Returns the raw JSON value of [masked].
     *
     * Unlike [masked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("masked") @ExcludeMissing fun _masked(): JsonField<Boolean> = masked

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [validate].
     *
     * Unlike [validate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("validate") @ExcludeMissing fun _validate(): JsonField<Boolean> = validate

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

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

        /** Returns a mutable builder for constructing an instance of [Check]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Check]. */
    class Builder internal constructor() {

        private var masked: JsonField<Boolean> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var validate: JsonField<Boolean> = JsonMissing.of()
        private var weight: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(check: Check) = apply {
            masked = check.masked
            message = check.message
            name = check.name
            validate = check.validate
            weight = check.weight
            additionalProperties = check.additionalProperties.toMutableMap()
        }

        /** Indicates whether the result or data is masked/hidden. */
        fun masked(masked: Boolean) = masked(JsonField.of(masked))

        /**
         * Sets [Builder.masked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.masked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun masked(masked: JsonField<Boolean>) = apply { this.masked = masked }

        /** Additional message or explanation about the check result. */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Name or type of the check performed. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Result of the check, true if passed. */
        fun validate(validate: Boolean) = validate(JsonField.of(validate))

        /**
         * Sets [Builder.validate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validate] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun validate(validate: JsonField<Boolean>) = apply { this.validate = validate }

        /** Importance or weight of the check, often used in scoring. */
        fun weight(weight: Long) = weight(JsonField.of(weight))

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Long>) = apply { this.weight = weight }

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
         * Returns an immutable instance of [Check].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Check =
            Check(masked, message, name, validate, weight, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Check = apply {
        if (validated) {
            return@apply
        }

        masked()
        message()
        name()
        validate()
        weight()
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
        (if (masked.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (validate.asKnown().isPresent) 1 else 0) +
            (if (weight.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Check && masked == other.masked && message == other.message && name == other.name && validate == other.validate && weight == other.weight && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(masked, message, name, validate, weight, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Check{masked=$masked, message=$message, name=$name, validate=$validate, weight=$weight, additionalProperties=$additionalProperties}"
}
