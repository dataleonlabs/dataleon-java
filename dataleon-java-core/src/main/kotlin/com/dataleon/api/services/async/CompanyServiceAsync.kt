// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async

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
import com.dataleon.api.services.async.companies.DocumentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CompanyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyServiceAsync

    fun documents(): DocumentServiceAsync

    /** Create a new company */
    fun create(params: CompanyCreateParams): CompletableFuture<CompanyRegistration> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyRegistration>

    /** Get a company by ID */
    fun retrieve(companyId: String): CompletableFuture<CompanyRegistration> =
        retrieve(companyId, CompanyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        companyId: String,
        params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyRegistration> =
        retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        companyId: String,
        params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
    ): CompletableFuture<CompanyRegistration> = retrieve(companyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyRegistration>

    /** @see retrieve */
    fun retrieve(params: CompanyRetrieveParams): CompletableFuture<CompanyRegistration> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        companyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompanyRegistration> =
        retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

    /** Update a company by ID */
    fun update(
        companyId: String,
        params: CompanyUpdateParams,
    ): CompletableFuture<CompanyRegistration> = update(companyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        companyId: String,
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyRegistration> =
        update(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see update */
    fun update(params: CompanyUpdateParams): CompletableFuture<CompanyRegistration> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyRegistration>

    /** Get all companies */
    fun list(): CompletableFuture<List<CompanyRegistration>> = list(CompanyListParams.none())

    /** @see list */
    fun list(
        params: CompanyListParams = CompanyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CompanyRegistration>>

    /** @see list */
    fun list(
        params: CompanyListParams = CompanyListParams.none()
    ): CompletableFuture<List<CompanyRegistration>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<CompanyRegistration>> =
        list(CompanyListParams.none(), requestOptions)

    /** Delete a company by ID */
    fun delete(companyId: String): CompletableFuture<Void?> =
        delete(companyId, CompanyDeleteParams.none())

    /** @see delete */
    fun delete(
        companyId: String,
        params: CompanyDeleteParams = CompanyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        companyId: String,
        params: CompanyDeleteParams = CompanyDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(companyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CompanyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CompanyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(companyId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(companyId, CompanyDeleteParams.none(), requestOptions)

    /**
     * A view of [CompanyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompanyServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /companies`, but is otherwise the same as
         * [CompanyServiceAsync.create].
         */
        fun create(
            params: CompanyCreateParams
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>>

        /**
         * Returns a raw HTTP response for `get /companies/{company_id}`, but is otherwise the same
         * as [CompanyServiceAsync.retrieve].
         */
        fun retrieve(companyId: String): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            retrieve(companyId, CompanyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            companyId: String,
            params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            companyId: String,
            params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            retrieve(companyId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>>

        /** @see retrieve */
        fun retrieve(
            params: CompanyRetrieveParams
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            companyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /companies/{company_id}`, but is otherwise the same
         * as [CompanyServiceAsync.update].
         */
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            update(companyId, params, RequestOptions.none())

        /** @see update */
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            update(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CompanyUpdateParams
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>>

        /**
         * Returns a raw HTTP response for `get /companies`, but is otherwise the same as
         * [CompanyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<CompanyRegistration>>> =
            list(CompanyListParams.none())

        /** @see list */
        fun list(
            params: CompanyListParams = CompanyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CompanyRegistration>>>

        /** @see list */
        fun list(
            params: CompanyListParams = CompanyListParams.none()
        ): CompletableFuture<HttpResponseFor<List<CompanyRegistration>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<CompanyRegistration>>> =
            list(CompanyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /companies/{company_id}`, but is otherwise the
         * same as [CompanyServiceAsync.delete].
         */
        fun delete(companyId: String): CompletableFuture<HttpResponse> =
            delete(companyId, CompanyDeleteParams.none())

        /** @see delete */
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(companyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CompanyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CompanyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            companyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(companyId, CompanyDeleteParams.none(), requestOptions)
    }
}
