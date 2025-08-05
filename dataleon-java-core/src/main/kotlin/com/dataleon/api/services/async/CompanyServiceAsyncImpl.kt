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
import com.dataleon.api.models.companies.CompanyCreateParams
import com.dataleon.api.models.companies.CompanyListParams
import com.dataleon.api.models.companies.CompanyRegistration
import com.dataleon.api.services.async.companies.DocumentServiceAsync
import com.dataleon.api.services.async.companies.DocumentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CompanyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyServiceAsync {

    private val withRawResponse: CompanyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CompanyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyServiceAsync =
        CompanyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentServiceAsync = documents

    override fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompanyRegistration> =
        // post /companies
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CompanyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CompanyRegistration>> =
        // get /companies
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompanyServiceAsync.WithRawResponse =
            CompanyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        private val createHandler: Handler<CompanyRegistration> =
            jsonHandler<CompanyRegistration>(clientOptions.jsonMapper)

        override fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompanyRegistration>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies")
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

        private val listHandler: Handler<List<CompanyRegistration>> =
            jsonHandler<List<CompanyRegistration>>(clientOptions.jsonMapper)

        override fun list(
            params: CompanyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CompanyRegistration>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies")
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
