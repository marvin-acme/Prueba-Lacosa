// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.CustomDomainConfiguration;
import com.azure.resourcemanager.eventgrid.models.CustomDomainIdentity;
import com.azure.resourcemanager.eventgrid.models.CustomDomainIdentityType;
import com.azure.resourcemanager.eventgrid.models.CustomDomainValidationState;
import com.azure.resourcemanager.eventgrid.models.UpdateTopicsConfigurationInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateTopicsConfigurationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateTopicsConfigurationInfo model = BinaryData.fromString(
            "{\"customDomains\":[{\"fullyQualifiedDomainName\":\"opgxedkowepb\",\"validationState\":\"Pending\",\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentity\":\"wccsnjvcdwxlpqek\"},\"certificateUrl\":\"nkhtjsyingw\",\"expectedTxtRecordName\":\"atmtdhtmdvy\",\"expectedTxtRecordValue\":\"ikdgszywkbir\"},{\"fullyQualifiedDomainName\":\"yuzhlhkjoqrvq\",\"validationState\":\"Approved\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentity\":\"rv\"},\"certificateUrl\":\"upmfiibfg\",\"expectedTxtRecordName\":\"ioolvrwxkvtkkgll\",\"expectedTxtRecordValue\":\"jygvjayvbl\"},{\"fullyQualifiedDomainName\":\"hvkzuh\",\"validationState\":\"Approved\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentity\":\"s\"},\"certificateUrl\":\"byrqufeg\",\"expectedTxtRecordName\":\"vwz\",\"expectedTxtRecordValue\":\"nhlmctlpdng\"},{\"fullyQualifiedDomainName\":\"tvgbmhrixkwmy\",\"validationState\":\"Pending\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentity\":\"rh\"},\"certificateUrl\":\"nai\",\"expectedTxtRecordName\":\"xccbdreaxhcex\",\"expectedTxtRecordValue\":\"rvqahqkghtpwi\"}]}")
            .toObject(UpdateTopicsConfigurationInfo.class);
        Assertions.assertEquals("opgxedkowepb", model.customDomains().get(0).fullyQualifiedDomainName());
        Assertions.assertEquals(CustomDomainValidationState.PENDING, model.customDomains().get(0).validationState());
        Assertions.assertEquals(CustomDomainIdentityType.SYSTEM_ASSIGNED,
            model.customDomains().get(0).identity().type());
        Assertions.assertEquals("wccsnjvcdwxlpqek", model.customDomains().get(0).identity().userAssignedIdentity());
        Assertions.assertEquals("nkhtjsyingw", model.customDomains().get(0).certificateUrl());
        Assertions.assertEquals("atmtdhtmdvy", model.customDomains().get(0).expectedTxtRecordName());
        Assertions.assertEquals("ikdgszywkbir", model.customDomains().get(0).expectedTxtRecordValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateTopicsConfigurationInfo model = new UpdateTopicsConfigurationInfo().withCustomDomains(Arrays.asList(
            new CustomDomainConfiguration().withFullyQualifiedDomainName("opgxedkowepb")
                .withValidationState(CustomDomainValidationState.PENDING)
                .withIdentity(new CustomDomainIdentity().withType(CustomDomainIdentityType.SYSTEM_ASSIGNED)
                    .withUserAssignedIdentity("wccsnjvcdwxlpqek"))
                .withCertificateUrl("nkhtjsyingw")
                .withExpectedTxtRecordName("atmtdhtmdvy")
                .withExpectedTxtRecordValue("ikdgszywkbir"),
            new CustomDomainConfiguration().withFullyQualifiedDomainName("yuzhlhkjoqrvq")
                .withValidationState(CustomDomainValidationState.APPROVED)
                .withIdentity(new CustomDomainIdentity().withType(CustomDomainIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentity("rv"))
                .withCertificateUrl("upmfiibfg")
                .withExpectedTxtRecordName("ioolvrwxkvtkkgll")
                .withExpectedTxtRecordValue("jygvjayvbl"),
            new CustomDomainConfiguration().withFullyQualifiedDomainName("hvkzuh")
                .withValidationState(CustomDomainValidationState.APPROVED)
                .withIdentity(new CustomDomainIdentity().withType(CustomDomainIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentity("s"))
                .withCertificateUrl("byrqufeg")
                .withExpectedTxtRecordName("vwz")
                .withExpectedTxtRecordValue("nhlmctlpdng"),
            new CustomDomainConfiguration().withFullyQualifiedDomainName("tvgbmhrixkwmy")
                .withValidationState(CustomDomainValidationState.PENDING)
                .withIdentity(new CustomDomainIdentity().withType(CustomDomainIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentity("rh"))
                .withCertificateUrl("nai")
                .withExpectedTxtRecordName("xccbdreaxhcex")
                .withExpectedTxtRecordValue("rvqahqkghtpwi")));
        model = BinaryData.fromObject(model).toObject(UpdateTopicsConfigurationInfo.class);
        Assertions.assertEquals("opgxedkowepb", model.customDomains().get(0).fullyQualifiedDomainName());
        Assertions.assertEquals(CustomDomainValidationState.PENDING, model.customDomains().get(0).validationState());
        Assertions.assertEquals(CustomDomainIdentityType.SYSTEM_ASSIGNED,
            model.customDomains().get(0).identity().type());
        Assertions.assertEquals("wccsnjvcdwxlpqek", model.customDomains().get(0).identity().userAssignedIdentity());
        Assertions.assertEquals("nkhtjsyingw", model.customDomains().get(0).certificateUrl());
        Assertions.assertEquals("atmtdhtmdvy", model.customDomains().get(0).expectedTxtRecordName());
        Assertions.assertEquals("ikdgszywkbir", model.customDomains().get(0).expectedTxtRecordValue());
    }
}
