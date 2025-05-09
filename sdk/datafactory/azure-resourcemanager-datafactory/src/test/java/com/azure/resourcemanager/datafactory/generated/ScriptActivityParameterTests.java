// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameter;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameterDirection;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameterType;
import org.junit.jupiter.api.Assertions;

public final class ScriptActivityParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptActivityParameter model = BinaryData.fromString(
            "{\"name\":\"datapjz\",\"type\":\"Int64\",\"value\":\"datazjwugrjio\",\"direction\":\"Output\",\"size\":1553305797}")
            .toObject(ScriptActivityParameter.class);
        Assertions.assertEquals(ScriptActivityParameterType.INT64, model.type());
        Assertions.assertEquals(ScriptActivityParameterDirection.OUTPUT, model.direction());
        Assertions.assertEquals(1553305797, model.size());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptActivityParameter model = new ScriptActivityParameter().withName("datapjz")
            .withType(ScriptActivityParameterType.INT64)
            .withValue("datazjwugrjio")
            .withDirection(ScriptActivityParameterDirection.OUTPUT)
            .withSize(1553305797);
        model = BinaryData.fromObject(model).toObject(ScriptActivityParameter.class);
        Assertions.assertEquals(ScriptActivityParameterType.INT64, model.type());
        Assertions.assertEquals(ScriptActivityParameterDirection.OUTPUT, model.direction());
        Assertions.assertEquals(1553305797, model.size());
    }
}
