// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.ThreatIntelligenceInformationInner;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceInformationList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ThreatIntelligenceInformationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ThreatIntelligenceInformationList model = BinaryData.fromString(
            "{\"nextLink\":\"xnavvwxq\",\"value\":[{\"kind\":\"ThreatIntelligenceInformation\",\"etag\":\"qunyowxwlmdjr\",\"id\":\"fgbvfvpdbo\",\"name\":\"acizsjqlhkrr\",\"type\":\"bdeibqipqk\"},{\"kind\":\"ThreatIntelligenceInformation\",\"etag\":\"vxndz\",\"id\":\"krefajpjo\",\"name\":\"wkqnyhg\",\"type\":\"ij\"}]}")
            .toObject(ThreatIntelligenceInformationList.class);
        Assertions.assertEquals("qunyowxwlmdjr", model.value().get(0).etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ThreatIntelligenceInformationList model = new ThreatIntelligenceInformationList()
            .withValue(Arrays.asList(new ThreatIntelligenceInformationInner().withEtag("qunyowxwlmdjr"),
                new ThreatIntelligenceInformationInner().withEtag("vxndz")));
        model = BinaryData.fromObject(model).toObject(ThreatIntelligenceInformationList.class);
        Assertions.assertEquals("qunyowxwlmdjr", model.value().get(0).etag());
    }
}
