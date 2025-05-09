// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.commerce {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.commerce;
    exports com.azure.resourcemanager.commerce.fluent;
    exports com.azure.resourcemanager.commerce.fluent.models;
    exports com.azure.resourcemanager.commerce.models;

    opens com.azure.resourcemanager.commerce.fluent.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.commerce.models to com.azure.core, com.fasterxml.jackson.databind;
}
