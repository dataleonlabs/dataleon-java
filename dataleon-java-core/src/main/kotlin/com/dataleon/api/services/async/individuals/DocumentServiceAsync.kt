// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async.individuals

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.models.individuals.documents.DocumentListParams
import com.dataleon.api.models.individuals.documents.DocumentResponse
import com.dataleon.api.models.individuals.documents.DocumentUploadParams
import com.dataleon.api.models.individuals.documents.GenericDocument
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    /** Get documents to an individuals */
    fun list(individualId: String): CompletableFuture<DocumentResponse> =
        list(individualId, DocumentListParams.none())

    /** @see list */
    fun list(
        individualId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse> =
        list(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see list */
    fun list(
        individualId: String,
        params: DocumentListParams = DocumentListParams.none(),
    ): CompletableFuture<DocumentResponse> = list(individualId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse>

    /** @see list */
    fun list(params: DocumentListParams): CompletableFuture<DocumentResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        individualId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentResponse> =
        list(individualId, DocumentListParams.none(), requestOptions)

    /** Upload documents to an individual */
    fun upload(
        individualId: String,
        params: DocumentUploadParams,
    ): CompletableFuture<GenericDocument> = upload(individualId, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        individualId: String,
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GenericDocument> =
        upload(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see upload */
    fun upload(params: DocumentUploadParams): CompletableFuture<GenericDocument> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GenericDocument>

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /individuals/{individual_id}/documents`, but is
         * otherwise the same as [DocumentServiceAsync.list].
         */
        fun list(individualId: String): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            list(individualId, DocumentListParams.none())

        /** @see list */
        fun list(
            individualId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            list(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see list */
        fun list(
            individualId: String,
            params: DocumentListParams = DocumentListParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            list(individualId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>>

        /** @see list */
        fun list(params: DocumentListParams): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            individualId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            list(individualId, DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /individuals/{individual_id}/documents`, but is
         * otherwise the same as [DocumentServiceAsync.upload].
         */
        fun upload(
            individualId: String,
            params: DocumentUploadParams,
        ): CompletableFuture<HttpResponseFor<GenericDocument>> =
            upload(individualId, params, RequestOptions.none())

        /** @see upload */
        fun upload(
            individualId: String,
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GenericDocument>> =
            upload(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see upload */
        fun upload(
            params: DocumentUploadParams
        ): CompletableFuture<HttpResponseFor<GenericDocument>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GenericDocument>>
    }
}
