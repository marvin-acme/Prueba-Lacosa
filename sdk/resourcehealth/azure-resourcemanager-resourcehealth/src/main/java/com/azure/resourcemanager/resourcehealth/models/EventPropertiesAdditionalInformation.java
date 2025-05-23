// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Additional information.
 */
@Fluent
public final class EventPropertiesAdditionalInformation
    implements JsonSerializable<EventPropertiesAdditionalInformation> {
    /*
     * Additional information Message
     */
    private String message;

    /**
     * Creates an instance of EventPropertiesAdditionalInformation class.
     */
    public EventPropertiesAdditionalInformation() {
    }

    /**
     * Get the message property: Additional information Message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Additional information Message.
     * 
     * @param message the message value to set.
     * @return the EventPropertiesAdditionalInformation object itself.
     */
    public EventPropertiesAdditionalInformation withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventPropertiesAdditionalInformation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventPropertiesAdditionalInformation if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventPropertiesAdditionalInformation.
     */
    public static EventPropertiesAdditionalInformation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventPropertiesAdditionalInformation deserializedEventPropertiesAdditionalInformation
                = new EventPropertiesAdditionalInformation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("message".equals(fieldName)) {
                    deserializedEventPropertiesAdditionalInformation.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventPropertiesAdditionalInformation;
        });
    }
}
