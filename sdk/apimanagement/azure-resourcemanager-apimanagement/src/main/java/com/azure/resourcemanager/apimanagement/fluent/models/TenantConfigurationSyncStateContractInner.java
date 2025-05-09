// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Result of Tenant Configuration Sync State.
 */
@Fluent
public final class TenantConfigurationSyncStateContractInner extends ProxyResource {
    /*
     * Properties returned Tenant Configuration Sync State check.
     */
    private TenantConfigurationSyncStateContractProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of TenantConfigurationSyncStateContractInner class.
     */
    public TenantConfigurationSyncStateContractInner() {
    }

    /**
     * Get the innerProperties property: Properties returned Tenant Configuration Sync State check.
     * 
     * @return the innerProperties value.
     */
    private TenantConfigurationSyncStateContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the branch property: The name of Git branch.
     * 
     * @return the branch value.
     */
    public String branch() {
        return this.innerProperties() == null ? null : this.innerProperties().branch();
    }

    /**
     * Set the branch property: The name of Git branch.
     * 
     * @param branch the branch value to set.
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withBranch(String branch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TenantConfigurationSyncStateContractProperties();
        }
        this.innerProperties().withBranch(branch);
        return this;
    }

    /**
     * Get the commitId property: The latest commit Id.
     * 
     * @return the commitId value.
     */
    public String commitId() {
        return this.innerProperties() == null ? null : this.innerProperties().commitId();
    }

    /**
     * Set the commitId property: The latest commit Id.
     * 
     * @param commitId the commitId value to set.
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withCommitId(String commitId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TenantConfigurationSyncStateContractProperties();
        }
        this.innerProperties().withCommitId(commitId);
        return this;
    }

    /**
     * Get the isExport property: value indicating if last sync was save (true) or deploy (false) operation.
     * 
     * @return the isExport value.
     */
    public Boolean isExport() {
        return this.innerProperties() == null ? null : this.innerProperties().isExport();
    }

    /**
     * Set the isExport property: value indicating if last sync was save (true) or deploy (false) operation.
     * 
     * @param isExport the isExport value to set.
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withIsExport(Boolean isExport) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TenantConfigurationSyncStateContractProperties();
        }
        this.innerProperties().withIsExport(isExport);
        return this;
    }

    /**
     * Get the isSynced property: value indicating if last synchronization was later than the configuration change.
     * 
     * @return the isSynced value.
     */
    public Boolean isSynced() {
        return this.innerProperties() == null ? null : this.innerProperties().isSynced();
    }

    /**
     * Set the isSynced property: value indicating if last synchronization was later than the configuration change.
     * 
     * @param isSynced the isSynced value to set.
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withIsSynced(Boolean isSynced) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TenantConfigurationSyncStateContractProperties();
        }
        this.innerProperties().withIsSynced(isSynced);
        return this;
    }

    /**
     * Get the isGitEnabled property: value indicating whether Git configuration access is enabled.
     * 
     * @return the isGitEnabled value.
     */
    public Boolean isGitEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isGitEnabled();
    }

    /**
     * Set the isGitEnabled property: value indicating whether Git configuration access is enabled.
     * 
     * @param isGitEnabled the isGitEnabled value to set.
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withIsGitEnabled(Boolean isGitEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TenantConfigurationSyncStateContractProperties();
        }
        this.innerProperties().withIsGitEnabled(isGitEnabled);
        return this;
    }

    /**
     * Get the syncDate property: The date of the latest synchronization. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     * @return the syncDate value.
     */
    public OffsetDateTime syncDate() {
        return this.innerProperties() == null ? null : this.innerProperties().syncDate();
    }

    /**
     * Set the syncDate property: The date of the latest synchronization. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     * @param syncDate the syncDate value to set.
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withSyncDate(OffsetDateTime syncDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TenantConfigurationSyncStateContractProperties();
        }
        this.innerProperties().withSyncDate(syncDate);
        return this;
    }

    /**
     * Get the configurationChangeDate property: The date of the latest configuration change. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     * @return the configurationChangeDate value.
     */
    public OffsetDateTime configurationChangeDate() {
        return this.innerProperties() == null ? null : this.innerProperties().configurationChangeDate();
    }

    /**
     * Set the configurationChangeDate property: The date of the latest configuration change. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     * @param configurationChangeDate the configurationChangeDate value to set.
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner
        withConfigurationChangeDate(OffsetDateTime configurationChangeDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TenantConfigurationSyncStateContractProperties();
        }
        this.innerProperties().withConfigurationChangeDate(configurationChangeDate);
        return this;
    }

    /**
     * Get the lastOperationId property: Most recent tenant configuration operation identifier.
     * 
     * @return the lastOperationId value.
     */
    public String lastOperationId() {
        return this.innerProperties() == null ? null : this.innerProperties().lastOperationId();
    }

    /**
     * Set the lastOperationId property: Most recent tenant configuration operation identifier.
     * 
     * @param lastOperationId the lastOperationId value to set.
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withLastOperationId(String lastOperationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TenantConfigurationSyncStateContractProperties();
        }
        this.innerProperties().withLastOperationId(lastOperationId);
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
     * Reads an instance of TenantConfigurationSyncStateContractInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TenantConfigurationSyncStateContractInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TenantConfigurationSyncStateContractInner.
     */
    public static TenantConfigurationSyncStateContractInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TenantConfigurationSyncStateContractInner deserializedTenantConfigurationSyncStateContractInner
                = new TenantConfigurationSyncStateContractInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTenantConfigurationSyncStateContractInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedTenantConfigurationSyncStateContractInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedTenantConfigurationSyncStateContractInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedTenantConfigurationSyncStateContractInner.innerProperties
                        = TenantConfigurationSyncStateContractProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTenantConfigurationSyncStateContractInner;
        });
    }
}
