// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.handlers.errorBodyHandler
import com.dataleon.api.core.handlers.errorHandler
import com.dataleon.api.core.handlers.jsonHandler
import com.dataleon.api.core.http.HttpMethod
import com.dataleon.api.core.http.HttpRequest
import com.dataleon.api.core.http.HttpResponse
import com.dataleon.api.core.http.HttpResponse.Handler
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.core.http.json
import com.dataleon.api.core.http.parseable
import com.dataleon.api.core.prepareAsync
import com.dataleon.api.models.individuals.Individual
import com.dataleon.api.models.individuals.IndividualCreateParams
import com.dataleon.api.models.individuals.IndividualListParams
import com.dataleon.api.services.async.individuals.DocumentServiceAsync
import com.dataleon.api.services.async.individuals.DocumentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class IndividualServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualServiceAsync {

    private val withRawResponse: IndividualServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): IndividualServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndividualServiceAsync =
        IndividualServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentServiceAsync = documents

    override fun create(
        params: IndividualCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Individual> =
        // post /individuals
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IndividualListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Individual>> =
        // get /individuals
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndividualServiceAsync.WithRawResponse =
            IndividualServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        private val createHandler: Handler<Individual> =
            jsonHandler<Individual>(clientOptions.jsonMapper)

        override fun create(
            params: IndividualCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Individual>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<Individual>> =
            jsonHandler<List<Individual>>(clientOptions.jsonMapper)

        override fun list(
            params: IndividualListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Individual>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
