// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.http.HttpResponse
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.models.individuals.Individual
import com.dataleon.api.models.individuals.IndividualCreateParams
import com.dataleon.api.models.individuals.IndividualDeleteParams
import com.dataleon.api.models.individuals.IndividualListParams
import com.dataleon.api.models.individuals.IndividualRetrieveParams
import com.dataleon.api.models.individuals.IndividualUpdateParams
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

    /** Get an individual by ID */
    fun retrieve(individualId: String): CompletableFuture<Individual> =
        retrieve(individualId, IndividualRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        individualId: String,
        params: IndividualRetrieveParams = IndividualRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Individual> =
        retrieve(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        individualId: String,
        params: IndividualRetrieveParams = IndividualRetrieveParams.none(),
    ): CompletableFuture<Individual> = retrieve(individualId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IndividualRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Individual>

    /** @see retrieve */
    fun retrieve(params: IndividualRetrieveParams): CompletableFuture<Individual> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        individualId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Individual> =
        retrieve(individualId, IndividualRetrieveParams.none(), requestOptions)

    /** Update an individual by ID */
    fun update(
        individualId: String,
        params: IndividualUpdateParams,
    ): CompletableFuture<Individual> = update(individualId, params, RequestOptions.none())

    /** @see update */
    fun update(
        individualId: String,
        params: IndividualUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Individual> =
        update(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see update */
    fun update(params: IndividualUpdateParams): CompletableFuture<Individual> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IndividualUpdateParams,
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

    /** Delete an individual by ID */
    fun delete(individualId: String): CompletableFuture<Void?> =
        delete(individualId, IndividualDeleteParams.none())

    /** @see delete */
    fun delete(
        individualId: String,
        params: IndividualDeleteParams = IndividualDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see delete */
    fun delete(
        individualId: String,
        params: IndividualDeleteParams = IndividualDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(individualId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IndividualDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: IndividualDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(individualId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(individualId, IndividualDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /individuals/{individual_id}`, but is otherwise the
         * same as [IndividualServiceAsync.retrieve].
         */
        fun retrieve(individualId: String): CompletableFuture<HttpResponseFor<Individual>> =
            retrieve(individualId, IndividualRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            individualId: String,
            params: IndividualRetrieveParams = IndividualRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Individual>> =
            retrieve(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            individualId: String,
            params: IndividualRetrieveParams = IndividualRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Individual>> =
            retrieve(individualId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IndividualRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Individual>>

        /** @see retrieve */
        fun retrieve(
            params: IndividualRetrieveParams
        ): CompletableFuture<HttpResponseFor<Individual>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            individualId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Individual>> =
            retrieve(individualId, IndividualRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /individuals/{individual_id}`, but is otherwise the
         * same as [IndividualServiceAsync.update].
         */
        fun update(
            individualId: String,
            params: IndividualUpdateParams,
        ): CompletableFuture<HttpResponseFor<Individual>> =
            update(individualId, params, RequestOptions.none())

        /** @see update */
        fun update(
            individualId: String,
            params: IndividualUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Individual>> =
            update(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see update */
        fun update(params: IndividualUpdateParams): CompletableFuture<HttpResponseFor<Individual>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: IndividualUpdateParams,
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

        /**
         * Returns a raw HTTP response for `delete /individuals/{individual_id}`, but is otherwise
         * the same as [IndividualServiceAsync.delete].
         */
        fun delete(individualId: String): CompletableFuture<HttpResponse> =
            delete(individualId, IndividualDeleteParams.none())

        /** @see delete */
        fun delete(
            individualId: String,
            params: IndividualDeleteParams = IndividualDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see delete */
        fun delete(
            individualId: String,
            params: IndividualDeleteParams = IndividualDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(individualId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IndividualDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: IndividualDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            individualId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(individualId, IndividualDeleteParams.none(), requestOptions)
    }
}
