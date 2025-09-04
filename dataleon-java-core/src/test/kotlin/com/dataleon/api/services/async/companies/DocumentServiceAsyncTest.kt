// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async.companies

import com.dataleon.api.TestServerExtension
import com.dataleon.api.client.okhttp.DataleonOkHttpClientAsync
import com.dataleon.api.models.companies.documents.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.companies().documents()

        val documentResponseFuture = documentServiceAsync.list("company_id")

        val documentResponse = documentResponseFuture.get()
        documentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.companies().documents()

        val genericDocumentFuture =
            documentServiceAsync.upload(
                DocumentUploadParams.builder()
                    .companyId("company_id")
                    .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                    .file("some content".byteInputStream())
                    .url("https://example.com/sample.pdf")
                    .build()
            )

        val genericDocument = genericDocumentFuture.get()
        genericDocument.validate()
    }
}
