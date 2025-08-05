// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.blocking

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.models.individuals.Individual
import com.dataleon.api.models.individuals.IndividualCreateParams
import com.dataleon.api.models.individuals.IndividualListParams
import com.dataleon.api.services.blocking.individuals.DocumentService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface IndividualService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndividualService

    fun documents(): DocumentService

    /** Create a new individual */
    fun create(params: IndividualCreateParams): Individual = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IndividualCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Individual

    /** Get all individuals */
    fun list(): List<Individual> = list(IndividualListParams.none())

    /** @see list */
    fun list(
        params: IndividualListParams = IndividualListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Individual>

    /** @see list */
    fun list(params: IndividualListParams = IndividualListParams.none()): List<Individual> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Individual> =
        list(IndividualListParams.none(), requestOptions)

    /** A view of [IndividualService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndividualService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /individuals`, but is otherwise the same as
         * [IndividualService.create].
         */
        @MustBeClosed
        fun create(params: IndividualCreateParams): HttpResponseFor<Individual> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IndividualCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Individual>

        /**
         * Returns a raw HTTP response for `get /individuals`, but is otherwise the same as
         * [IndividualService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<Individual>> = list(IndividualListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IndividualListParams = IndividualListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Individual>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: IndividualListParams = IndividualListParams.none()
        ): HttpResponseFor<List<Individual>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Individual>> =
            list(IndividualListParams.none(), requestOptions)
    }
}
