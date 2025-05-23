// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.NamespaceTopicUpdateParameterProperties;
import org.junit.jupiter.api.Assertions;

public final class NamespaceTopicUpdateParameterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NamespaceTopicUpdateParameterProperties model = BinaryData.fromString("{\"eventRetentionInDays\":647279453}")
            .toObject(NamespaceTopicUpdateParameterProperties.class);
        Assertions.assertEquals(647279453, model.eventRetentionInDays());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NamespaceTopicUpdateParameterProperties model
            = new NamespaceTopicUpdateParameterProperties().withEventRetentionInDays(647279453);
        model = BinaryData.fromObject(model).toObject(NamespaceTopicUpdateParameterProperties.class);
        Assertions.assertEquals(647279453, model.eventRetentionInDays());
    }
}
