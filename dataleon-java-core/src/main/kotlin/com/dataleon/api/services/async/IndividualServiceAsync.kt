// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.models.individuals.Individual
import com.dataleon.api.models.individuals.IndividualCreateParams
import com.dataleon.api.models.individuals.IndividualListParams
import com.dataleon.api.services.async.individuals.DocumentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndividualServiceAsync

    fun documents(): DocumentServiceAsync

    /** Create a new individual */
    fun create(params: IndividualCreateParams): CompletableFuture<Individual> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IndividualCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Individual>

    /** Get all individuals */
    fun list(): CompletableFuture<List<Individual>> = list(IndividualListParams.none())

    /** @see list */
    fun list(
        params: IndividualListParams = IndividualListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Individual>>

    /** @see list */
    fun list(
        params: IndividualListParams = IndividualListParams.none()
    ): CompletableFuture<List<Individual>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Individual>> =
        list(IndividualListParams.none(), requestOptions)

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndividualServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /individuals`, but is otherwise the same as
         * [IndividualServiceAsync.create].
         */
        fun create(params: IndividualCreateParams): CompletableFuture<HttpResponseFor<Individual>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IndividualCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Individual>>

        /**
         * Returns a raw HTTP response for `get /individuals`, but is otherwise the same as
         * [IndividualServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<Individual>>> =
            list(IndividualListParams.none())

        /** @see list */
        fun list(
            params: IndividualListParams = IndividualListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Individual>>>

        /** @see list */
        fun list(
            params: IndividualListParams = IndividualListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Individual>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Individual>>> =
            list(IndividualListParams.none(), requestOptions)
    }
}
