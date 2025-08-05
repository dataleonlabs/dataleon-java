// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.models.companies.CompanyCreateParams
import com.dataleon.api.models.companies.CompanyListParams
import com.dataleon.api.models.companies.CompanyRegistration
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
    }
}
