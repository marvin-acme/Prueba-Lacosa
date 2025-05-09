// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.DataExportSettingProperties;
import org.junit.jupiter.api.Assertions;

public final class DataExportSettingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataExportSettingProperties model
            = BinaryData.fromString("{\"enabled\":false}").toObject(DataExportSettingProperties.class);
        Assertions.assertEquals(false, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataExportSettingProperties model = new DataExportSettingProperties().withEnabled(false);
        model = BinaryData.fromObject(model).toObject(DataExportSettingProperties.class);
        Assertions.assertEquals(false, model.enabled());
    }
}
