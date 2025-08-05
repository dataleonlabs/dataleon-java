// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.blocking

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.http.HttpResponse
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.models.companies.CompanyCreateParams
import com.dataleon.api.models.companies.CompanyDeleteParams
import com.dataleon.api.models.companies.CompanyListParams
import com.dataleon.api.models.companies.CompanyRegistration
import com.dataleon.api.models.companies.CompanyRetrieveParams
import com.dataleon.api.models.companies.CompanyUpdateParams
import com.dataleon.api.services.blocking.companies.DocumentService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface CompanyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService

    fun documents(): DocumentService

    /** Create a new company */
    fun create(params: CompanyCreateParams): CompanyRegistration =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRegistration

    /** Get a company by ID */
    fun retrieve(companyId: String): CompanyRegistration =
        retrieve(companyId, CompanyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        companyId: String,
        params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRegistration =
        retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        companyId: String,
        params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
    ): CompanyRegistration = retrieve(companyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRegistration

    /** @see retrieve */
    fun retrieve(params: CompanyRetrieveParams): CompanyRegistration =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(companyId: String, requestOptions: RequestOptions): CompanyRegistration =
        retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

    /** Update a company by ID */
    fun update(companyId: String, params: CompanyUpdateParams): CompanyRegistration =
        update(companyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        companyId: String,
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRegistration = update(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see update */
    fun update(params: CompanyUpdateParams): CompanyRegistration =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRegistration

    /** Get all companies */
    fun list(): List<CompanyRegistration> = list(CompanyListParams.none())

    /** @see list */
    fun list(
        params: CompanyListParams = CompanyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CompanyRegistration>

    /** @see list */
    fun list(params: CompanyListParams = CompanyListParams.none()): List<CompanyRegistration> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<CompanyRegistration> =
        list(CompanyListParams.none(), requestOptions)

    /** Delete a company by ID */
    fun delete(companyId: String) = delete(companyId, CompanyDeleteParams.none())

    /** @see delete */
    fun delete(
        companyId: String,
        params: CompanyDeleteParams = CompanyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see delete */
    fun delete(companyId: String, params: CompanyDeleteParams = CompanyDeleteParams.none()) =
        delete(companyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CompanyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CompanyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(companyId: String, requestOptions: RequestOptions) =
        delete(companyId, CompanyDeleteParams.none(), requestOptions)

    /** A view of [CompanyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /companies`, but is otherwise the same as
         * [CompanyService.create].
         */
        @MustBeClosed
        fun create(params: CompanyCreateParams): HttpResponseFor<CompanyRegistration> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRegistration>

        /**
         * Returns a raw HTTP response for `get /companies/{company_id}`, but is otherwise the same
         * as [CompanyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(companyId: String): HttpResponseFor<CompanyRegistration> =
            retrieve(companyId, CompanyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            companyId: String,
            params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRegistration> =
            retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            companyId: String,
            params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
        ): HttpResponseFor<CompanyRegistration> = retrieve(companyId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRegistration>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CompanyRetrieveParams): HttpResponseFor<CompanyRegistration> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyRegistration> =
            retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /companies/{company_id}`, but is otherwise the same
         * as [CompanyService.update].
         */
        @MustBeClosed
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
        ): HttpResponseFor<CompanyRegistration> = update(companyId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRegistration> =
            update(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CompanyUpdateParams): HttpResponseFor<CompanyRegistration> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRegistration>

        /**
         * Returns a raw HTTP response for `get /companies`, but is otherwise the same as
         * [CompanyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<CompanyRegistration>> = list(CompanyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CompanyListParams = CompanyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CompanyRegistration>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CompanyListParams = CompanyListParams.none()
        ): HttpResponseFor<List<CompanyRegistration>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<CompanyRegistration>> =
            list(CompanyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /companies/{company_id}`, but is otherwise the
         * same as [CompanyService.delete].
         */
        @MustBeClosed
        fun delete(companyId: String): HttpResponse = delete(companyId, CompanyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
        ): HttpResponse = delete(companyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CompanyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CompanyDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(companyId: String, requestOptions: RequestOptions): HttpResponse =
            delete(companyId, CompanyDeleteParams.none(), requestOptions)
    }
}
