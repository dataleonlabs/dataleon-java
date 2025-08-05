// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models.individuals.documents

import com.dataleon.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KbisTest {

    @Test
    fun create() {
        val kbis =
            Kbis.builder()
                .activities("Software development and consulting")
                .address("14 Avenue de l'Opéra, 75001 Paris")
                .capitalSocial("10000 EUR")
                .closureDate(LocalDate.parse("2019-12-27"))
                .companyName("Tech Innov SAS")
                .documentDate(LocalDate.parse("2024-01-15"))
                .documentType("kbis")
                .firstClosureDate(LocalDate.parse("2021-12-31"))
                .fromGreffe("Greffe de Paris")
                .legalForm("SAS")
                .addMember(
                    Kbis.Member.builder()
                        .id("3e0a6a52-3e5c-4db2-a1ec-f6f9a7e019a6")
                        .address("123 Rue de Paris, 75001 Paris")
                        .birthday(OffsetDateTime.parse("1985-03-25T00:00:00+00:00"))
                        .birthplace("Paris")
                        .country("FR")
                        .email("john.doe@example.com")
                        .firstName("John")
                        .isBeneficialOwner(true)
                        .isDelegator(false)
                        .lastName("Doe")
                        .livenessVerification(true)
                        .name("ExampleCorp")
                        .ownershipPercentage(25L)
                        .phoneNumber("+33 1 23 45 67 89")
                        .postalCode("75001")
                        .registrationId("812345678")
                        .relation("shareholder")
                        .roles("legal_representative")
                        .source("gouv")
                        .status("active")
                        .type(Kbis.Member.Type.PERSON)
                        .workspaceId("workspace-001")
                        .build()
                )
                .ngestion("B123456789")
                .rcsNumber("RCS Paris B 812 345 678")
                .registrationDate(LocalDate.parse("2020-06-01"))
                .sirenInfo("812345678")
                .build()

        assertThat(kbis.activities()).contains("Software development and consulting")
        assertThat(kbis.address()).contains("14 Avenue de l'Opéra, 75001 Paris")
        assertThat(kbis.capitalSocial()).contains("10000 EUR")
        assertThat(kbis.closureDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(kbis.companyName()).contains("Tech Innov SAS")
        assertThat(kbis.documentDate()).contains(LocalDate.parse("2024-01-15"))
        assertThat(kbis.documentType()).contains("kbis")
        assertThat(kbis.firstClosureDate()).contains(LocalDate.parse("2021-12-31"))
        assertThat(kbis.fromGreffe()).contains("Greffe de Paris")
        assertThat(kbis.legalForm()).contains("SAS")
        assertThat(kbis.members().getOrNull())
            .containsExactly(
                Kbis.Member.builder()
                    .id("3e0a6a52-3e5c-4db2-a1ec-f6f9a7e019a6")
                    .address("123 Rue de Paris, 75001 Paris")
                    .birthday(OffsetDateTime.parse("1985-03-25T00:00:00+00:00"))
                    .birthplace("Paris")
                    .country("FR")
                    .email("john.doe@example.com")
                    .firstName("John")
                    .isBeneficialOwner(true)
                    .isDelegator(false)
                    .lastName("Doe")
                    .livenessVerification(true)
                    .name("ExampleCorp")
                    .ownershipPercentage(25L)
                    .phoneNumber("+33 1 23 45 67 89")
                    .postalCode("75001")
                    .registrationId("812345678")
                    .relation("shareholder")
                    .roles("legal_representative")
                    .source("gouv")
                    .status("active")
                    .type(Kbis.Member.Type.PERSON)
                    .workspaceId("workspace-001")
                    .build()
            )
        assertThat(kbis.ngestion()).contains("B123456789")
        assertThat(kbis.rcsNumber()).contains("RCS Paris B 812 345 678")
        assertThat(kbis.registrationDate()).contains(LocalDate.parse("2020-06-01"))
        assertThat(kbis.sirenInfo()).contains("812345678")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kbis =
            Kbis.builder()
                .activities("Software development and consulting")
                .address("14 Avenue de l'Opéra, 75001 Paris")
                .capitalSocial("10000 EUR")
                .closureDate(LocalDate.parse("2019-12-27"))
                .companyName("Tech Innov SAS")
                .documentDate(LocalDate.parse("2024-01-15"))
                .documentType("kbis")
                .firstClosureDate(LocalDate.parse("2021-12-31"))
                .fromGreffe("Greffe de Paris")
                .legalForm("SAS")
                .addMember(
                    Kbis.Member.builder()
                        .id("3e0a6a52-3e5c-4db2-a1ec-f6f9a7e019a6")
                        .address("123 Rue de Paris, 75001 Paris")
                        .birthday(OffsetDateTime.parse("1985-03-25T00:00:00+00:00"))
                        .birthplace("Paris")
                        .country("FR")
                        .email("john.doe@example.com")
                        .firstName("John")
                        .isBeneficialOwner(true)
                        .isDelegator(false)
                        .lastName("Doe")
                        .livenessVerification(true)
                        .name("ExampleCorp")
                        .ownershipPercentage(25L)
                        .phoneNumber("+33 1 23 45 67 89")
                        .postalCode("75001")
                        .registrationId("812345678")
                        .relation("shareholder")
                        .roles("legal_representative")
                        .source("gouv")
                        .status("active")
                        .type(Kbis.Member.Type.PERSON)
                        .workspaceId("workspace-001")
                        .build()
                )
                .ngestion("B123456789")
                .rcsNumber("RCS Paris B 812 345 678")
                .registrationDate(LocalDate.parse("2020-06-01"))
                .sirenInfo("812345678")
                .build()

        val roundtrippedKbis =
            jsonMapper.readValue(jsonMapper.writeValueAsString(kbis), jacksonTypeRef<Kbis>())

        assertThat(roundtrippedKbis).isEqualTo(kbis)
    }
}
