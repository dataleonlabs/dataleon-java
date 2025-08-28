// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.async

import com.dataleon.api.TestServerExtension
import com.dataleon.api.client.okhttp.DataleonOkHttpClientAsync
import com.dataleon.api.models.individuals.IndividualCreateParams
import com.dataleon.api.models.individuals.IndividualListParams
import com.dataleon.api.models.individuals.IndividualRetrieveParams
import com.dataleon.api.models.individuals.IndividualUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val individualFuture =
            individualServiceAsync.create(
                IndividualCreateParams.builder()
                    .workspaceId("wk_123")
                    .person(
                        IndividualCreateParams.Person.builder()
                            .birthday("15/05/1985")
                            .email("john.doe@example.com")
                            .firstName("John")
                            .gender(IndividualCreateParams.Person.Gender.M)
                            .lastName("Doe")
                            .maidenName("John Doe")
                            .phoneNumber("+33 1 23 45 67 89")
                            .build()
                    )
                    .sourceId("ID54410069066")
                    .technicalData(
                        IndividualCreateParams.TechnicalData.builder()
                            .activeAmlSuspicions(false)
                            .callbackUrl("https://example.com/callback")
                            .callbackUrlNotification("https://example.com/notify")
                            .language("fra")
                            .rawData(true)
                            .build()
                    )
                    .build()
            )

        val individual = individualFuture.get()
        individual.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val individualFuture =
            individualServiceAsync.retrieve(
                IndividualRetrieveParams.builder()
                    .individualId("individual_id")
                    .document(true)
                    .scope("scope")
                    .build()
            )

        val individual = individualFuture.get()
        individual.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val individualFuture =
            individualServiceAsync.update(
                IndividualUpdateParams.builder()
                    .individualId("individual_id")
                    .workspaceId("wk_123")
                    .person(
                        IndividualUpdateParams.Person.builder()
                            .birthday("15/05/1985")
                            .email("john.doe@example.com")
                            .firstName("John")
                            .gender(IndividualUpdateParams.Person.Gender.M)
                            .lastName("Doe")
                            .maidenName("John Doe")
                            .phoneNumber("+33 1 23 45 67 89")
                            .build()
                    )
                    .sourceId("ID54410069066")
                    .technicalData(
                        IndividualUpdateParams.TechnicalData.builder()
                            .activeAmlSuspicions(false)
                            .callbackUrl("https://example.com/callback")
                            .callbackUrlNotification("https://example.com/notify")
                            .language("fra")
                            .rawData(true)
                            .build()
                    )
                    .build()
            )

        val individual = individualFuture.get()
        individual.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val individualsFuture =
            individualServiceAsync.list(
                IndividualListParams.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .limit(1L)
                    .offset(0L)
                    .sourceId("source_id")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .state(IndividualListParams.State.VOID)
                    .status(IndividualListParams.Status.REJECTED)
                    .workspaceId("workspace_id")
                    .build()
            )

        val individuals = individualsFuture.get()
        individuals.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            DataleonOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val individualServiceAsync = client.individuals()

        val future = individualServiceAsync.delete("individual_id")

        val response = future.get()
    }
}
