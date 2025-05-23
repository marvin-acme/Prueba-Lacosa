// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.fluent.models.GenerateDetailedCostReportOperationResultInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class GenerateDetailedCostReportOperationResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GenerateDetailedCostReportOperationResultInner model = BinaryData.fromString(
            "{\"id\":\"hu\",\"name\":\"erctatoyin\",\"type\":\"pbrlcyrduczkgofx\",\"properties\":{\"expiryTime\":\"2021-09-24T20:07:26Z\",\"validTill\":\"2020-12-21T07:33:22Z\",\"downloadUrl\":\"crrpcjttbstvje\"}}")
            .toObject(GenerateDetailedCostReportOperationResultInner.class);
        Assertions.assertEquals("hu", model.id());
        Assertions.assertEquals("erctatoyin", model.name());
        Assertions.assertEquals("pbrlcyrduczkgofx", model.type());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-21T07:33:22Z"), model.validTill());
        Assertions.assertEquals("crrpcjttbstvje", model.downloadUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GenerateDetailedCostReportOperationResultInner model
            = new GenerateDetailedCostReportOperationResultInner().withId("hu")
                .withName("erctatoyin")
                .withType("pbrlcyrduczkgofx")
                .withValidTill(OffsetDateTime.parse("2020-12-21T07:33:22Z"))
                .withDownloadUrl("crrpcjttbstvje");
        model = BinaryData.fromObject(model).toObject(GenerateDetailedCostReportOperationResultInner.class);
        Assertions.assertEquals("hu", model.id());
        Assertions.assertEquals("erctatoyin", model.name());
        Assertions.assertEquals("pbrlcyrduczkgofx", model.type());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-21T07:33:22Z"), model.validTill());
        Assertions.assertEquals("crrpcjttbstvje", model.downloadUrl());
    }
}
