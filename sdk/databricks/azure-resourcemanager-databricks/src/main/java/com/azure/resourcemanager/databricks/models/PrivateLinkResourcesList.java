// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databricks.fluent.models.GroupIdInformationInner;
import java.io.IOException;
import java.util.List;

/**
 * The available private link resources for a workspace.
 */
@Fluent
public final class PrivateLinkResourcesList implements JsonSerializable<PrivateLinkResourcesList> {
    /*
     * The list of available private link resources for a workspace
     */
    private List<GroupIdInformationInner> value;

    /*
     * The URL to get the next set of private link resources.
     */
    private String nextLink;

    /**
     * Creates an instance of PrivateLinkResourcesList class.
     */
    public PrivateLinkResourcesList() {
    }

    /**
     * Get the value property: The list of available private link resources for a workspace.
     * 
     * @return the value value.
     */
    public List<GroupIdInformationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of available private link resources for a workspace.
     * 
     * @param value the value value to set.
     * @return the PrivateLinkResourcesList object itself.
     */
    public PrivateLinkResourcesList withValue(List<GroupIdInformationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of private link resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of private link resources.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PrivateLinkResourcesList object itself.
     */
    public PrivateLinkResourcesList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkResourcesList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourcesList if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkResourcesList.
     */
    public static PrivateLinkResourcesList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourcesList deserializedPrivateLinkResourcesList = new PrivateLinkResourcesList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<GroupIdInformationInner> value
                        = reader.readArray(reader1 -> GroupIdInformationInner.fromJson(reader1));
                    deserializedPrivateLinkResourcesList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPrivateLinkResourcesList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourcesList;
        });
    }
}
