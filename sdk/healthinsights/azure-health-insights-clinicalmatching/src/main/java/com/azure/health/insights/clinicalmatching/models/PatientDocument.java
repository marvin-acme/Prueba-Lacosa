// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A clinical document related to a patient. Document here is in the wide sense - not just a text document (note).
 */
@Fluent
public final class PatientDocument implements JsonSerializable<PatientDocument> {

    /*
     * The type of the patient document, such as 'note' (text document) or 'fhirBundle' (FHIR JSON document).
     */
    @Generated
    private final DocumentType type;

    /*
     * The type of the clinical document.
     */
    @Generated
    private ClinicalDocumentType clinicalType;

    /*
     * A given identifier for the document. Has to be unique across all documents for a single patient.
     */
    @Generated
    private final String id;

    /*
     * A 2 letter ISO 639-1 representation of the language of the document.
     */
    @Generated
    private String language;

    /*
     * The date and time when the document was created.
     */
    @Generated
    private OffsetDateTime createdDateTime;

    /*
     * The content of the patient document.
     */
    @Generated
    private final DocumentContent content;

    /**
     * Creates an instance of PatientDocument class.
     *
     * @param type the type value to set.
     * @param id the id value to set.
     * @param content the content value to set.
     */
    @Generated
    public PatientDocument(DocumentType type, String id, DocumentContent content) {
        this.type = type;
        this.id = id;
        this.content = content;
    }

    /**
     * Get the type property: The type of the patient document, such as 'note' (text document) or 'fhirBundle' (FHIR
     * JSON document).
     *
     * @return the type value.
     */
    @Generated
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Get the clinicalType property: The type of the clinical document.
     *
     * @return the clinicalType value.
     */
    @Generated
    public ClinicalDocumentType getClinicalType() {
        return this.clinicalType;
    }

    /**
     * Set the clinicalType property: The type of the clinical document.
     *
     * @param clinicalType the clinicalType value to set.
     * @return the PatientDocument object itself.
     */
    @Generated
    public PatientDocument setClinicalType(ClinicalDocumentType clinicalType) {
        this.clinicalType = clinicalType;
        return this;
    }

    /**
     * Get the id property: A given identifier for the document. Has to be unique across all documents for a single
     * patient.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the language property: A 2 letter ISO 639-1 representation of the language of the document.
     *
     * @return the language value.
     */
    @Generated
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: A 2 letter ISO 639-1 representation of the language of the document.
     *
     * @param language the language value to set.
     * @return the PatientDocument object itself.
     */
    @Generated
    public PatientDocument setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the createdDateTime property: The date and time when the document was created.
     *
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The date and time when the document was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the PatientDocument object itself.
     */
    @Generated
    public PatientDocument setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the content property: The content of the patient document.
     *
     * @return the content value.
     */
    @Generated
    public DocumentContent getContent() {
        return this.content;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("content", this.content);
        jsonWriter.writeStringField("clinicalType", this.clinicalType == null ? null : this.clinicalType.toString());
        jsonWriter.writeStringField("language", this.language);
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PatientDocument from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PatientDocument if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PatientDocument.
     */
    @Generated
    public static PatientDocument fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DocumentType type = null;
            String id = null;
            DocumentContent content = null;
            ClinicalDocumentType clinicalType = null;
            String language = null;
            OffsetDateTime createdDateTime = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    type = DocumentType.fromString(reader.getString());
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("content".equals(fieldName)) {
                    content = DocumentContent.fromJson(reader);
                } else if ("clinicalType".equals(fieldName)) {
                    clinicalType = ClinicalDocumentType.fromString(reader.getString());
                } else if ("language".equals(fieldName)) {
                    language = reader.getString();
                } else if ("createdDateTime".equals(fieldName)) {
                    createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            PatientDocument deserializedPatientDocument = new PatientDocument(type, id, content);
            deserializedPatientDocument.clinicalType = clinicalType;
            deserializedPatientDocument.language = language;
            deserializedPatientDocument.createdDateTime = createdDateTime;
            return deserializedPatientDocument;
        });
    }
}
