// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileProductType;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileSubscriptionStatusUpdate;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileUpdate;
import com.azure.resourcemanager.hybridcompute.models.ProductFeatureUpdate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LicenseProfileUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LicenseProfileUpdate model = BinaryData.fromString(
            "{\"properties\":{\"softwareAssurance\":{\"softwareAssuranceCustomer\":false},\"esuProfile\":{\"assignedLicense\":\"lmwlxkvugfhzo\"},\"productProfile\":{\"subscriptionStatus\":\"Disable\",\"productType\":\"WindowsServer\",\"productFeatures\":[{\"name\":\"uthnnprnxipeilpj\",\"subscriptionStatus\":\"Enable\"},{\"name\":\"jxdultskzbbtdzu\",\"subscriptionStatus\":\"Enable\"}]}},\"tags\":{\"zuhkfpbsjyof\":\"gpw\",\"us\":\"xl\"}}")
            .toObject(LicenseProfileUpdate.class);
        Assertions.assertEquals("gpw", model.tags().get("zuhkfpbsjyof"));
        Assertions.assertEquals(false, model.softwareAssuranceCustomer());
        Assertions.assertEquals("lmwlxkvugfhzo", model.assignedLicense());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.DISABLE, model.subscriptionStatus());
        Assertions.assertEquals(LicenseProfileProductType.WINDOWS_SERVER, model.productType());
        Assertions.assertEquals("uthnnprnxipeilpj", model.productFeatures().get(0).name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE,
            model.productFeatures().get(0).subscriptionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LicenseProfileUpdate model = new LicenseProfileUpdate().withTags(mapOf("zuhkfpbsjyof", "gpw", "us", "xl"))
            .withSoftwareAssuranceCustomer(false)
            .withAssignedLicense("lmwlxkvugfhzo")
            .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.DISABLE)
            .withProductType(LicenseProfileProductType.WINDOWS_SERVER)
            .withProductFeatures(Arrays.asList(
                new ProductFeatureUpdate().withName("uthnnprnxipeilpj")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE),
                new ProductFeatureUpdate().withName("jxdultskzbbtdzu")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE)));
        model = BinaryData.fromObject(model).toObject(LicenseProfileUpdate.class);
        Assertions.assertEquals("gpw", model.tags().get("zuhkfpbsjyof"));
        Assertions.assertEquals(false, model.softwareAssuranceCustomer());
        Assertions.assertEquals("lmwlxkvugfhzo", model.assignedLicense());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.DISABLE, model.subscriptionStatus());
        Assertions.assertEquals(LicenseProfileProductType.WINDOWS_SERVER, model.productType());
        Assertions.assertEquals("uthnnprnxipeilpj", model.productFeatures().get(0).name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE,
            model.productFeatures().get(0).subscriptionStatus());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
