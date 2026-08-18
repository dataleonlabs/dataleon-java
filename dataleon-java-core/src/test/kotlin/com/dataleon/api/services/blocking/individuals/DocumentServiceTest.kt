// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.blocking.individuals

import com.dataleon.api.client.okhttp.DataleonOkHttpClient
import com.dataleon.api.models.individuals.documents.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = DataleonOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.individuals().documents()

        val documentResponse = documentService.list("individual_id")

        documentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = DataleonOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.individuals().documents()

        val genericDocument =
            documentService.upload(
                DocumentUploadParams.builder()
                    .individualId("individual_id")
                    .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                    .file("Example data".byteInputStream())
                    .url("https://example.com/sample.pdf")
                    .build()
            )

        genericDocument.validate()
    }
}
