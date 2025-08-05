// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.blocking

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.models.companies.CompanyCreateParams
import com.dataleon.api.models.companies.CompanyListParams
import com.dataleon.api.models.companies.CompanyRegistration
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
    }
}
