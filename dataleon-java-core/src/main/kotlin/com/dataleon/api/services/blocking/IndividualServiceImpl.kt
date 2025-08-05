// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.blocking

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
import com.dataleon.api.core.prepare
import com.dataleon.api.models.individuals.Individual
import com.dataleon.api.models.individuals.IndividualCreateParams
import com.dataleon.api.models.individuals.IndividualListParams
import com.dataleon.api.services.blocking.individuals.DocumentService
import com.dataleon.api.services.blocking.individuals.DocumentServiceImpl
import java.util.function.Consumer

class IndividualServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualService {

    private val withRawResponse: IndividualService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    override fun withRawResponse(): IndividualService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndividualService =
        IndividualServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentService = documents

    override fun create(
        params: IndividualCreateParams,
        requestOptions: RequestOptions,
    ): Individual =
        // post /individuals
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: IndividualListParams,
        requestOptions: RequestOptions,
    ): List<Individual> =
        // get /individuals
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndividualService.WithRawResponse =
            IndividualServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentService.WithRawResponse = documents

        private val createHandler: Handler<Individual> =
            jsonHandler<Individual>(clientOptions.jsonMapper)

        override fun create(
            params: IndividualCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Individual> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<Individual>> =
            jsonHandler<List<Individual>>(clientOptions.jsonMapper)

        override fun list(
            params: IndividualListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Individual>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
