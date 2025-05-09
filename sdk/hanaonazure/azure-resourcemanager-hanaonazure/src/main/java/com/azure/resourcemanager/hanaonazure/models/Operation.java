// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.models;

import com.azure.resourcemanager.hanaonazure.fluent.models.OperationInner;

/**
 * An immutable client-side representation of Operation.
 */
public interface Operation {
    /**
     * Gets the name property: The name of the operation being performed on this particular object. This name should
     * match the action name that appears in RBAC / the event service.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: Displayed HANA operation information.
     * 
     * @return the display value.
     */
    Display display();

    /**
     * Gets the isDataAction property: Indicates whether the operation applies to data-plane.
     * 
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the inner com.azure.resourcemanager.hanaonazure.fluent.models.OperationInner object.
     * 
     * @return the inner object.
     */
    OperationInner innerModel();
}
