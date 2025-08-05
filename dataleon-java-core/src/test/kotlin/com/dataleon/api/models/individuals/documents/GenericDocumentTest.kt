// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.models.individuals.documents

import com.dataleon.api.core.JsonValue
import com.dataleon.api.core.jsonMapper
import com.dataleon.api.models.Check
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GenericDocumentTest {

    @Test
    fun create() {
        val genericDocument =
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

        assertThat(genericDocument.id()).contains("doc_123")
        assertThat(genericDocument.checks().getOrNull())
            .containsExactly(
                Check.builder()
                    .masked(false)
                    .message("Name matched successfully")
                    .name("name_match")
                    .validate(true)
                    .weight(1L)
                    .build()
            )
        assertThat(genericDocument.createdAt())
            .contains(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
        assertThat(genericDocument.documentType()).contains("generic")
        assertThat(genericDocument.name()).contains("generic_doc")
        assertThat(genericDocument.signedUrl()).contains("https://cdn.example.com/doc.pdf")
        assertThat(genericDocument.state()).contains("SUBMITTED")
        assertThat(genericDocument.status()).contains("approved")
        assertThat(genericDocument.tables().getOrNull())
            .containsExactly(
                GenericDocument.Table.builder()
                    .addOperation(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(genericDocument.values().getOrNull())
            .containsExactly(
                GenericDocument.Value.builder()
                    .confidence(0.95)
                    .name("Full Name")
                    .addValue(100L)
                    .addValue(200L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val genericDocument =
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

        val roundtrippedGenericDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(genericDocument),
                jacksonTypeRef<GenericDocument>(),
            )

        assertThat(roundtrippedGenericDocument).isEqualTo(genericDocument)
    }
}
