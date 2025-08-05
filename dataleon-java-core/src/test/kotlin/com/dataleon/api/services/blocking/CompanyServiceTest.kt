// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services.blocking

import com.dataleon.api.TestServerExtension
import com.dataleon.api.client.okhttp.DataleonOkHttpClient
import com.dataleon.api.models.companies.CompanyCreateParams
import com.dataleon.api.models.companies.CompanyListParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompanyServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            DataleonOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val companyRegistration =
            companyService.create(
                CompanyCreateParams.builder()
                    .company(
                        CompanyCreateParams.Company.builder()
                            .name("ACME Corp")
                            .address("123 rue Exemple, Paris")
                            .commercialName("ACME")
                            .country("FR")
                            .email("info@acme.fr")
                            .employerIdentificationNumber("EIN123456")
                            .legalForm("SARL")
                            .phoneNumber("+33 1 23 45 67 89")
                            .registrationDate("2010-05-15")
                            .registrationId("RCS123456")
                            .shareCapital("100000")
                            .status("active")
                            .taxIdentificationNumber("FR123456789")
                            .type("main")
                            .websiteUrl("https://acme.fr")
                            .build()
                    )
                    .workspaceId("wk_123")
                    .sourceId("ID54410069066")
                    .technicalData(
                        CompanyCreateParams.TechnicalData.builder()
                            .callbackUrl("https://example.com/callback")
                            .callbackUrlNotification("https://example.com/notify")
                            .language("fra")
                            .build()
                    )
                    .build()
            )

        companyRegistration.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            DataleonOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val companyRegistrations =
            companyService.list(
                CompanyListParams.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .limit(1L)
                    .offset(0L)
                    .sourceId("source_id")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .state(CompanyListParams.State.VOID)
                    .status(CompanyListParams.Status.REJECTED)
                    .workspaceId("workspace_id")
                    .build()
            )

        companyRegistrations.forEach { it.validate() }
    }
}
