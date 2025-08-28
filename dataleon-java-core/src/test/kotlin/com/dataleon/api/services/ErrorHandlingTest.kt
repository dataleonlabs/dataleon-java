// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.services

import com.dataleon.api.client.DataleonClient
import com.dataleon.api.client.okhttp.DataleonOkHttpClient
import com.dataleon.api.core.JsonValue
import com.dataleon.api.core.http.Headers
import com.dataleon.api.core.jsonMapper
import com.dataleon.api.errors.BadRequestException
import com.dataleon.api.errors.DataleonException
import com.dataleon.api.errors.InternalServerException
import com.dataleon.api.errors.NotFoundException
import com.dataleon.api.errors.PermissionDeniedException
import com.dataleon.api.errors.RateLimitException
import com.dataleon.api.errors.UnauthorizedException
import com.dataleon.api.errors.UnexpectedStatusCodeException
import com.dataleon.api.errors.UnprocessableEntityException
import com.dataleon.api.models.individuals.IndividualCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: DataleonClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DataleonOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun individualsCreate400() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate400WithRawResponse() {
        val individualService = client.individuals().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate401() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate401WithRawResponse() {
        val individualService = client.individuals().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate403() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate403WithRawResponse() {
        val individualService = client.individuals().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate404() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate404WithRawResponse() {
        val individualService = client.individuals().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate422() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate422WithRawResponse() {
        val individualService = client.individuals().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate429() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate429WithRawResponse() {
        val individualService = client.individuals().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate500() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate500WithRawResponse() {
        val individualService = client.individuals().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate999() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreate999WithRawResponse() {
        val individualService = client.individuals().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun individualsCreateInvalidJsonBody() {
        val individualService = client.individuals()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<DataleonException> {
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
                                .activeAmlSuspicions(false)
                                .callbackUrl("https://example.com/callback")
                                .callbackUrlNotification("https://example.com/notify")
                                .language("fra")
                                .rawData(true)
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
