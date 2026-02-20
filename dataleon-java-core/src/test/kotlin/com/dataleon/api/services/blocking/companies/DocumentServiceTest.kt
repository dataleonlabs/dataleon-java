// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.blocking.companies

import com.dataleon.api.client.okhttp.DataleonOkHttpClient
import com.dataleon.api.models.companies.documents.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = DataleonOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.companies().documents()

        val documentResponse = documentService.list("company_id")

        documentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client = DataleonOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.companies().documents()

        val genericDocument =
            documentService.upload(
                DocumentUploadParams.builder()
                    .companyId("company_id")
                    .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                    .file("some content".byteInputStream())
                    .url("https://example.com/sample.pdf")
                    .build()
            )

        genericDocument.validate()
    }
}
