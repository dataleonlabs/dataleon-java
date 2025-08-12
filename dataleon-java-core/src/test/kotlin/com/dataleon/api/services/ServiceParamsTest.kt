// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services

import com.dataleon.api.client.DataleonClient
import com.dataleon.api.client.okhttp.DataleonOkHttpClient
import com.dataleon.api.core.JsonValue
import com.dataleon.api.models.individuals.IndividualCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: DataleonClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DataleonOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val individualService = client.individuals()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        individualService.create(
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
                        .callbackUrl("https://example.com/callback")
                        .callbackUrlNotification("https://example.com/notify")
                        .language("fra")
                        .rawData(true)
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
