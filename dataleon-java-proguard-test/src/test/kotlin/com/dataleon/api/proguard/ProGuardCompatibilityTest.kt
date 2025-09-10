// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.proguard

import com.dataleon.api.client.okhttp.DataleonOkHttpClient
import com.dataleon.api.core.JsonValue
import com.dataleon.api.core.jsonMapper
import com.dataleon.api.models.Check
import com.dataleon.api.models.individuals.Individual
import com.dataleon.api.models.individuals.documents.GenericDocument
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/dataleon-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = DataleonOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.individuals()).isNotNull()
        assertThat(client.companies()).isNotNull()
    }

    @Test
    fun individualRoundtrip() {
        val jsonMapper = jsonMapper()
        val individual =
            Individual.builder()
                .id("123e4567-e89b-12d3-a456-426614174000")
                .addAmlSuspicion(
                    Individual.AmlSuspicion.builder()
                        .caption("Suspicious activity")
                        .country("FR")
                        .gender("M")
                        .relation("linked")
                        .schema("v1")
                        .score(0.85f)
                        .source("https://aml-checker.example.com/api/v1/suspicion/12345")
                        .status(Individual.AmlSuspicion.Status.PENDING)
                        .type(Individual.AmlSuspicion.Type.PEP)
                        .build()
                )
                .authUrl("https://id.dataleon.ai/a/123")
                .certificat(
                    Individual.Certificat.builder()
                        .id("cert_123")
                        .createdAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                        .filename("certificate.pdf")
                        .build()
                )
                .addCheck(
                    Check.builder()
                        .masked(false)
                        .message("Name matched successfully")
                        .name("name_match")
                        .validate(true)
                        .weight(1L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDocument(
                    GenericDocument.builder()
                        .id("doc_123")
                        .addCheck(
                            Check.builder()
                                .masked(false)
                                .message("Name matched successfully")
                                .name("name_match")
                                .validate(true)
                                .weight(1L)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                        .documentType("generic")
                        .name("generic_doc")
                        .signedUrl("https://cdn.example.com/doc.pdf")
                        .state("SUBMITTED")
                        .status("approved")
                        .addTable(
                            GenericDocument.Table.builder()
                                .addOperation(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .addValue(
                            GenericDocument.Value.builder()
                                .confidence(0.95)
                                .name("Full Name")
                                .addValue(100L)
                                .addValue(200L)
                                .build()
                        )
                        .build()
                )
                .identityCard(
                    Individual.IdentityCard.builder()
                        .id("doc_001")
                        .backDocumentSignedUrl("https://cdn.example.com/back.jpg")
                        .birthPlace("Paris")
                        .birthday("01/01/1990")
                        .country("FR")
                        .expirationDate("2030-01-01")
                        .firstName("John")
                        .frontDocumentSignedUrl("https://cdn.example.com/front.jpg")
                        .gender("M")
                        .issueDate("2020-01-01")
                        .lastName("Doe")
                        .mrzLine1("P<FRADOE<<JOHN<<<<<<<<<<<<<<<<<<<")
                        .mrzLine2("1234567890FRA9001019M2301012<<<<<<<<<<<<<<04")
                        .mrzLine3(null)
                        .type("passport")
                        .build()
                )
                .number(42L)
                .person(
                    Individual.Person.builder()
                        .birthday("01/01/1990")
                        .email("john.doe@example.com")
                        .faceImageSignedUrl("https://cdn.example.com/face.jpg")
                        .firstName("John")
                        .fullName("John Doe")
                        .gender("M")
                        .lastName("Doe")
                        .maidenName("Smith")
                        .nationality("FRA")
                        .phoneNumber("+33612345678")
                        .build()
                )
                .portalUrl("https://portal.dataleon.ai/w/123")
                .addProperty(
                    Individual.Property.builder()
                        .name("property_name")
                        .type("string")
                        .value("property_value")
                        .build()
                )
                .risk(
                    Individual.Risk.builder()
                        .code("20030")
                        .reason("Document mismatch")
                        .score(0.92f)
                        .build()
                )
                .sourceId("ID54410069066")
                .state("WAITING")
                .status("rejected")
                .addTag(
                    Individual.Tag.builder()
                        .key("tag_name")
                        .private_(false)
                        .type("string")
                        .value("tag_value")
                        .build()
                )
                .technicalData(
                    Individual.TechnicalData.builder()
                        .activeAmlSuspicions(false)
                        .apiVersion(2L)
                        .approvedAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                        .callbackUrl("https://example.com/callback")
                        .callbackUrlNotification("https://example.com/notify")
                        .disableNotification(false)
                        .disableNotificationDate(OffsetDateTime.parse("2025-07-12T13:10:00Z"))
                        .exportType("json")
                        .filteringScoreAmlSuspicions(0.75f)
                        .finishedAt(OffsetDateTime.parse("2025-05-05T13:10:00Z"))
                        .ip("192.168.1.1")
                        .language("fra")
                        .locationIp("203.0.113.45")
                        .needReviewAt(null)
                        .notificationConfirmation(false)
                        .qrCode("false")
                        .rawData(true)
                        .rejectedAt(null)
                        .sessionDuration(45L)
                        .startedAt(OffsetDateTime.parse("2025-05-05T13:00:00Z"))
                        .transferAt(OffsetDateTime.parse("2025-07-12T14:00:00Z"))
                        .transferMode("API")
                        .build()
                )
                .webviewUrl("https://id.dataleon.ai/w/123")
                .workspaceId("wk_123")
                .build()

        val roundtrippedIndividual =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individual),
                jacksonTypeRef<Individual>(),
            )

        assertThat(roundtrippedIndividual).isEqualTo(individual)
    }
}
