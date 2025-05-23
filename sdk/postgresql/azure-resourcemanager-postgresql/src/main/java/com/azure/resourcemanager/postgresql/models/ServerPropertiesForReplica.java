// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties to create a new replica.
 */
@Fluent
public final class ServerPropertiesForReplica extends ServerPropertiesForCreate {
    /*
     * The mode to create a new server.
     */
    private CreateMode createMode = CreateMode.REPLICA;

    /*
     * The master server id to create replica from.
     */
    private String sourceServerId;

    /**
     * Creates an instance of ServerPropertiesForReplica class.
     */
    public ServerPropertiesForReplica() {
    }

    /**
     * Get the createMode property: The mode to create a new server.
     * 
     * @return the createMode value.
     */
    @Override
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Get the sourceServerId property: The master server id to create replica from.
     * 
     * @return the sourceServerId value.
     */
    public String sourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Set the sourceServerId property: The master server id to create replica from.
     * 
     * @param sourceServerId the sourceServerId value to set.
     * @return the ServerPropertiesForReplica object itself.
     */
    public ServerPropertiesForReplica withSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForReplica withVersion(ServerVersion version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForReplica withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        super.withSslEnforcement(sslEnforcement);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForReplica withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        super.withMinimalTlsVersion(minimalTlsVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForReplica withInfrastructureEncryption(InfrastructureEncryption infrastructureEncryption) {
        super.withInfrastructureEncryption(infrastructureEncryption);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForReplica withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForReplica withStorageProfile(StorageProfile storageProfile) {
        super.withStorageProfile(storageProfile);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (sourceServerId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceServerId in model ServerPropertiesForReplica"));
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerPropertiesForReplica.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", version() == null ? null : version().toString());
        jsonWriter.writeStringField("sslEnforcement", sslEnforcement() == null ? null : sslEnforcement().toString());
        jsonWriter.writeStringField("minimalTlsVersion",
            minimalTlsVersion() == null ? null : minimalTlsVersion().toString());
        jsonWriter.writeStringField("infrastructureEncryption",
            infrastructureEncryption() == null ? null : infrastructureEncryption().toString());
        jsonWriter.writeStringField("publicNetworkAccess",
            publicNetworkAccess() == null ? null : publicNetworkAccess().toString());
        jsonWriter.writeJsonField("storageProfile", storageProfile());
        jsonWriter.writeStringField("sourceServerId", this.sourceServerId);
        jsonWriter.writeStringField("createMode", this.createMode == null ? null : this.createMode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerPropertiesForReplica from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerPropertiesForReplica if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerPropertiesForReplica.
     */
    public static ServerPropertiesForReplica fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerPropertiesForReplica deserializedServerPropertiesForReplica = new ServerPropertiesForReplica();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedServerPropertiesForReplica.withVersion(ServerVersion.fromString(reader.getString()));
                } else if ("sslEnforcement".equals(fieldName)) {
                    deserializedServerPropertiesForReplica
                        .withSslEnforcement(SslEnforcementEnum.fromString(reader.getString()));
                } else if ("minimalTlsVersion".equals(fieldName)) {
                    deserializedServerPropertiesForReplica
                        .withMinimalTlsVersion(MinimalTlsVersionEnum.fromString(reader.getString()));
                } else if ("infrastructureEncryption".equals(fieldName)) {
                    deserializedServerPropertiesForReplica
                        .withInfrastructureEncryption(InfrastructureEncryption.fromString(reader.getString()));
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedServerPropertiesForReplica
                        .withPublicNetworkAccess(PublicNetworkAccessEnum.fromString(reader.getString()));
                } else if ("storageProfile".equals(fieldName)) {
                    deserializedServerPropertiesForReplica.withStorageProfile(StorageProfile.fromJson(reader));
                } else if ("sourceServerId".equals(fieldName)) {
                    deserializedServerPropertiesForReplica.sourceServerId = reader.getString();
                } else if ("createMode".equals(fieldName)) {
                    deserializedServerPropertiesForReplica.createMode = CreateMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerPropertiesForReplica;
        });
    }
}
