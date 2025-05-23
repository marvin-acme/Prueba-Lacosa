// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.fluent.models.OpenidConnectProviderUpdateContractProperties;
import java.io.IOException;

/**
 * Parameters supplied to the Update OpenID Connect Provider operation.
 */
@Fluent
public final class OpenidConnectProviderUpdateContract
    implements JsonSerializable<OpenidConnectProviderUpdateContract> {
    /*
     * OpenId Connect Provider Update contract properties.
     */
    private OpenidConnectProviderUpdateContractProperties innerProperties;

    /**
     * Creates an instance of OpenidConnectProviderUpdateContract class.
     */
    public OpenidConnectProviderUpdateContract() {
    }

    /**
     * Get the innerProperties property: OpenId Connect Provider Update contract properties.
     * 
     * @return the innerProperties value.
     */
    private OpenidConnectProviderUpdateContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: User-friendly OpenID Connect Provider name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: User-friendly OpenID Connect Provider name.
     * 
     * @param displayName the displayName value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderUpdateContractProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: User-friendly description of OpenID Connect Provider.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: User-friendly description of OpenID Connect Provider.
     * 
     * @param description the description value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderUpdateContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the metadataEndpoint property: Metadata endpoint URI.
     * 
     * @return the metadataEndpoint value.
     */
    public String metadataEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().metadataEndpoint();
    }

    /**
     * Set the metadataEndpoint property: Metadata endpoint URI.
     * 
     * @param metadataEndpoint the metadataEndpoint value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withMetadataEndpoint(String metadataEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderUpdateContractProperties();
        }
        this.innerProperties().withMetadataEndpoint(metadataEndpoint);
        return this;
    }

    /**
     * Get the clientId property: Client ID of developer console which is the client application.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.innerProperties() == null ? null : this.innerProperties().clientId();
    }

    /**
     * Set the clientId property: Client ID of developer console which is the client application.
     * 
     * @param clientId the clientId value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withClientId(String clientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderUpdateContractProperties();
        }
        this.innerProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: Client Secret of developer console which is the client application.
     * 
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.innerProperties() == null ? null : this.innerProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: Client Secret of developer console which is the client application.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withClientSecret(String clientSecret) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderUpdateContractProperties();
        }
        this.innerProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the useInTestConsole property: If true, the Open ID Connect provider may be used in the developer portal test
     * console. True by default if no value is provided.
     * 
     * @return the useInTestConsole value.
     */
    public Boolean useInTestConsole() {
        return this.innerProperties() == null ? null : this.innerProperties().useInTestConsole();
    }

    /**
     * Set the useInTestConsole property: If true, the Open ID Connect provider may be used in the developer portal test
     * console. True by default if no value is provided.
     * 
     * @param useInTestConsole the useInTestConsole value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withUseInTestConsole(Boolean useInTestConsole) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderUpdateContractProperties();
        }
        this.innerProperties().withUseInTestConsole(useInTestConsole);
        return this;
    }

    /**
     * Get the useInApiDocumentation property: If true, the Open ID Connect provider will be used in the API
     * documentation in the developer portal. False by default if no value is provided.
     * 
     * @return the useInApiDocumentation value.
     */
    public Boolean useInApiDocumentation() {
        return this.innerProperties() == null ? null : this.innerProperties().useInApiDocumentation();
    }

    /**
     * Set the useInApiDocumentation property: If true, the Open ID Connect provider will be used in the API
     * documentation in the developer portal. False by default if no value is provided.
     * 
     * @param useInApiDocumentation the useInApiDocumentation value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withUseInApiDocumentation(Boolean useInApiDocumentation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderUpdateContractProperties();
        }
        this.innerProperties().withUseInApiDocumentation(useInApiDocumentation);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenidConnectProviderUpdateContract from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenidConnectProviderUpdateContract if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OpenidConnectProviderUpdateContract.
     */
    public static OpenidConnectProviderUpdateContract fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenidConnectProviderUpdateContract deserializedOpenidConnectProviderUpdateContract
                = new OpenidConnectProviderUpdateContract();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedOpenidConnectProviderUpdateContract.innerProperties
                        = OpenidConnectProviderUpdateContractProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenidConnectProviderUpdateContract;
        });
    }
}
