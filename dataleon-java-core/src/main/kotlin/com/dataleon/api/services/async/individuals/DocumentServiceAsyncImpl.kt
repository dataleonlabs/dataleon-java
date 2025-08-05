// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async.individuals

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.checkRequired
import com.dataleon.api.core.handlers.errorBodyHandler
import com.dataleon.api.core.handlers.errorHandler
import com.dataleon.api.core.handlers.jsonHandler
import com.dataleon.api.core.http.HttpMethod
import com.dataleon.api.core.http.HttpRequest
import com.dataleon.api.core.http.HttpResponse
import com.dataleon.api.core.http.HttpResponse.Handler
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.core.http.multipartFormData
import com.dataleon.api.core.http.parseable
import com.dataleon.api.core.prepareAsync
import com.dataleon.api.models.individuals.documents.DocumentListParams
import com.dataleon.api.models.individuals.documents.DocumentResponse
import com.dataleon.api.models.individuals.documents.DocumentUploadParams
import com.dataleon.api.models.individuals.documents.GenericDocument
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DocumentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentServiceAsync {

    private val withRawResponse: DocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync =
        DocumentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentResponse> =
        // get /individuals/{individual_id}/documents
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GenericDocument> =
        // post /individuals/{individual_id}/documents
        withRawResponse().upload(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse =
            DocumentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<DocumentResponse> =
            jsonHandler<DocumentResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("individualId", params.individualId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals", params._pathParam(0), "documents")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val uploadHandler: Handler<GenericDocument> =
            jsonHandler<GenericDocument>(clientOptions.jsonMapper)

        override fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GenericDocument>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("individualId", params.individualId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("individuals", params._pathParam(0), "documents")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
