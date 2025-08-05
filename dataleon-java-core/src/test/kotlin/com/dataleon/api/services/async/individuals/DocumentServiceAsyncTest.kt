// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async.individuals

import com.dataleon.api.TestServerExtension
import com.dataleon.api.client.okhttp.DataleonOkHttpClientAsync
import com.dataleon.api.models.individuals.documents.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.individuals().documents()

        val documentResponseFuture = documentServiceAsync.list("individual_id")

        val documentResponse = documentResponseFuture.get()
        documentResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun upload() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.individuals().documents()

        val genericDocumentFuture =
            documentServiceAsync.upload(
                DocumentUploadParams.builder()
                    .individualId("individual_id")
                    .documentType(DocumentUploadParams.DocumentType.BANK_STATEMENTS)
                    .file("some content".byteInputStream())
                    .url("https://example.com/sample.pdf")
                    .build()
            )

        val genericDocument = genericDocumentFuture.get()
        genericDocument.validate()
    }
}
