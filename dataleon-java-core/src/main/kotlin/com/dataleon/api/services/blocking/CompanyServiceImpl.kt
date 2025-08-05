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
import com.dataleon.api.models.companies.CompanyCreateParams
import com.dataleon.api.models.companies.CompanyListParams
import com.dataleon.api.models.companies.CompanyRegistration
import com.dataleon.api.services.blocking.companies.DocumentService
import com.dataleon.api.services.blocking.companies.DocumentServiceImpl
import java.util.function.Consumer

class CompanyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyService {

    private val withRawResponse: CompanyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    override fun withRawResponse(): CompanyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService =
        CompanyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentService = documents

    override fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions,
    ): CompanyRegistration =
        // post /companies
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: CompanyListParams,
        requestOptions: RequestOptions,
    ): List<CompanyRegistration> =
        // get /companies
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompanyService.WithRawResponse =
            CompanyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentService.WithRawResponse = documents

        private val createHandler: Handler<CompanyRegistration> =
            jsonHandler<CompanyRegistration>(clientOptions.jsonMapper)

        override fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyRegistration> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies")
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

        private val listHandler: Handler<List<CompanyRegistration>> =
            jsonHandler<List<CompanyRegistration>>(clientOptions.jsonMapper)

        override fun list(
            params: CompanyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CompanyRegistration>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies")
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
