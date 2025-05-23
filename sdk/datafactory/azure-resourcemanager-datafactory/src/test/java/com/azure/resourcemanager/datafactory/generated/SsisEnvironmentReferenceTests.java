// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisEnvironmentReference;
import org.junit.jupiter.api.Assertions;

public final class SsisEnvironmentReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisEnvironmentReference model = BinaryData.fromString(
            "{\"id\":9016144972386507719,\"environmentFolderName\":\"eftforylxakn\",\"environmentName\":\"jzvqp\",\"referenceType\":\"mtupyjtr\"}")
            .toObject(SsisEnvironmentReference.class);
        Assertions.assertEquals(9016144972386507719L, model.id());
        Assertions.assertEquals("eftforylxakn", model.environmentFolderName());
        Assertions.assertEquals("jzvqp", model.environmentName());
        Assertions.assertEquals("mtupyjtr", model.referenceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisEnvironmentReference model = new SsisEnvironmentReference().withId(9016144972386507719L)
            .withEnvironmentFolderName("eftforylxakn")
            .withEnvironmentName("jzvqp")
            .withReferenceType("mtupyjtr");
        model = BinaryData.fromObject(model).toObject(SsisEnvironmentReference.class);
        Assertions.assertEquals(9016144972386507719L, model.id());
        Assertions.assertEquals("eftforylxakn", model.environmentFolderName());
        Assertions.assertEquals("jzvqp", model.environmentName());
        Assertions.assertEquals("mtupyjtr", model.referenceType());
    }
}
