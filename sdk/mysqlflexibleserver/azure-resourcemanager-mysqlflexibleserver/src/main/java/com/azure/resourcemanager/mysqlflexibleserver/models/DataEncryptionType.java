// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

/**
 * The key type, AzureKeyVault for enable cmk, SystemManaged for disable cmk.
 */
public enum DataEncryptionType {
    /**
     * Enum value AzureKeyVault.
     */
    AZURE_KEY_VAULT("AzureKeyVault"),

    /**
     * Enum value SystemManaged.
     */
    SYSTEM_MANAGED("SystemManaged");

    /**
     * The actual serialized value for a DataEncryptionType instance.
     */
    private final String value;

    DataEncryptionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataEncryptionType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed DataEncryptionType object, or null if unable to parse.
     */
    public static DataEncryptionType fromString(String value) {
        if (value == null) {
            return null;
        }
        DataEncryptionType[] items = DataEncryptionType.values();
        for (DataEncryptionType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
