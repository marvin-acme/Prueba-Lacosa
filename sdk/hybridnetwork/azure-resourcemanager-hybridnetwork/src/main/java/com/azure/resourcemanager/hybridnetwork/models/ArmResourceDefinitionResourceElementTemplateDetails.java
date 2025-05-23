// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The arm resource definition resource element template details.
 */
@Fluent
public final class ArmResourceDefinitionResourceElementTemplateDetails extends ResourceElementTemplate {
    /*
     * The resource element template type.
     */
    private Type resourceElementType = Type.ARM_RESOURCE_DEFINITION;

    /*
     * The resource element template type.
     */
    private ArmResourceDefinitionResourceElementTemplate configuration;

    /**
     * Creates an instance of ArmResourceDefinitionResourceElementTemplateDetails class.
     */
    public ArmResourceDefinitionResourceElementTemplateDetails() {
    }

    /**
     * Get the resourceElementType property: The resource element template type.
     * 
     * @return the resourceElementType value.
     */
    @Override
    public Type resourceElementType() {
        return this.resourceElementType;
    }

    /**
     * Get the configuration property: The resource element template type.
     * 
     * @return the configuration value.
     */
    public ArmResourceDefinitionResourceElementTemplate configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: The resource element template type.
     * 
     * @param configuration the configuration value to set.
     * @return the ArmResourceDefinitionResourceElementTemplateDetails object itself.
     */
    public ArmResourceDefinitionResourceElementTemplateDetails
        withConfiguration(ArmResourceDefinitionResourceElementTemplate configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArmResourceDefinitionResourceElementTemplateDetails withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArmResourceDefinitionResourceElementTemplateDetails withDependsOnProfile(DependsOnProfile dependsOnProfile) {
        super.withDependsOnProfile(dependsOnProfile);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
        if (dependsOnProfile() != null) {
            dependsOnProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeJsonField("dependsOnProfile", dependsOnProfile());
        jsonWriter.writeStringField("type",
            this.resourceElementType == null ? null : this.resourceElementType.toString());
        jsonWriter.writeJsonField("configuration", this.configuration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArmResourceDefinitionResourceElementTemplateDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArmResourceDefinitionResourceElementTemplateDetails if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArmResourceDefinitionResourceElementTemplateDetails.
     */
    public static ArmResourceDefinitionResourceElementTemplateDetails fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ArmResourceDefinitionResourceElementTemplateDetails deserializedArmResourceDefinitionResourceElementTemplateDetails
                = new ArmResourceDefinitionResourceElementTemplateDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedArmResourceDefinitionResourceElementTemplateDetails.withName(reader.getString());
                } else if ("dependsOnProfile".equals(fieldName)) {
                    deserializedArmResourceDefinitionResourceElementTemplateDetails
                        .withDependsOnProfile(DependsOnProfile.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedArmResourceDefinitionResourceElementTemplateDetails.resourceElementType
                        = Type.fromString(reader.getString());
                } else if ("configuration".equals(fieldName)) {
                    deserializedArmResourceDefinitionResourceElementTemplateDetails.configuration
                        = ArmResourceDefinitionResourceElementTemplate.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArmResourceDefinitionResourceElementTemplateDetails;
        });
    }
}
