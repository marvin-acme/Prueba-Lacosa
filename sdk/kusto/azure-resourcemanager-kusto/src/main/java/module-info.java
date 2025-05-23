// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.kusto {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.kusto;
    exports com.azure.resourcemanager.kusto.fluent;
    exports com.azure.resourcemanager.kusto.fluent.models;
    exports com.azure.resourcemanager.kusto.models;

    opens com.azure.resourcemanager.kusto.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.kusto.models to com.azure.core;
}
