// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.blocking.companies

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.RequestOptions
import com.dataleon.api.core.http.HttpResponseFor
import com.dataleon.api.models.companies.documents.DocumentListParams
import com.dataleon.api.models.companies.documents.DocumentUploadParams
import com.dataleon.api.models.individuals.documents.DocumentResponse
import com.dataleon.api.models.individuals.documents.GenericDocument
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService

    /** Get documents to an company */
    fun list(companyId: String): DocumentResponse = list(companyId, DocumentListParams.none())

    /** @see list */
    fun list(
        companyId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse = list(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see list */
    fun list(
        companyId: String,
        params: DocumentListParams = DocumentListParams.none(),
    ): DocumentResponse = list(companyId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse

    /** @see list */
    fun list(params: DocumentListParams): DocumentResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(companyId: String, requestOptions: RequestOptions): DocumentResponse =
        list(companyId, DocumentListParams.none(), requestOptions)

    /** Upload documents to an company */
    fun upload(companyId: String, params: DocumentUploadParams): GenericDocument =
        upload(companyId, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        companyId: String,
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenericDocument = upload(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see upload */
    fun upload(params: DocumentUploadParams): GenericDocument =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenericDocument

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /companies/{company_id}/documents`, but is otherwise
         * the same as [DocumentService.list].
         */
        @MustBeClosed
        fun list(companyId: String): HttpResponseFor<DocumentResponse> =
            list(companyId, DocumentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            companyId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse> =
            list(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            companyId: String,
            params: DocumentListParams = DocumentListParams.none(),
        ): HttpResponseFor<DocumentResponse> = list(companyId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: DocumentListParams): HttpResponseFor<DocumentResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> =
            list(companyId, DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /companies/{company_id}/documents`, but is
         * otherwise the same as [DocumentService.upload].
         */
        @MustBeClosed
        fun upload(
            companyId: String,
            params: DocumentUploadParams,
        ): HttpResponseFor<GenericDocument> = upload(companyId, params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            companyId: String,
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenericDocument> =
            upload(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(params: DocumentUploadParams): HttpResponseFor<GenericDocument> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenericDocument>
    }
}
