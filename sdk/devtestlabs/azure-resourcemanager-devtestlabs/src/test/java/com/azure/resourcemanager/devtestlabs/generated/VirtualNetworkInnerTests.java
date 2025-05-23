// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.devtestlabs.models.Port;
import com.azure.resourcemanager.devtestlabs.models.Subnet;
import com.azure.resourcemanager.devtestlabs.models.SubnetOverride;
import com.azure.resourcemanager.devtestlabs.models.SubnetSharedPublicIpAddressConfiguration;
import com.azure.resourcemanager.devtestlabs.models.UsagePermissionType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkInner model = BinaryData.fromString(
            "{\"properties\":{\"allowedSubnets\":[{\"resourceId\":\"cdoewbidyv\",\"labSubnetName\":\"owx\",\"allowPublicIp\":\"Default\"}],\"description\":\"udeugfsxz\",\"externalProviderResourceId\":\"paxwkufyk\",\"externalSubnets\":[{\"id\":\"xepmrut\",\"name\":\"abaobnslujdjltym\"},{\"id\":\"vguihywar\",\"name\":\"pphkixkykxds\"}],\"subnetOverrides\":[{\"resourceId\":\"mmuc\",\"labSubnetName\":\"hikkflrmy\",\"useInVmCreationPermission\":\"Allow\",\"usePublicIpAddressPermission\":\"Default\",\"sharedPublicIpAddressConfiguration\":{\"allowedPorts\":[{}]},\"virtualNetworkPoolName\":\"isws\"},{\"resourceId\":\"iiiovgqcgxuugq\",\"labSubnetName\":\"totiowlxteqdptjg\",\"useInVmCreationPermission\":\"Default\",\"usePublicIpAddressPermission\":\"Allow\",\"sharedPublicIpAddressConfiguration\":{\"allowedPorts\":[{},{},{},{}]},\"virtualNetworkPoolName\":\"b\"},{\"resourceId\":\"phqlkccuz\",\"labSubnetName\":\"gqwa\",\"useInVmCreationPermission\":\"Allow\",\"usePublicIpAddressPermission\":\"Default\",\"sharedPublicIpAddressConfiguration\":{\"allowedPorts\":[{},{},{}]},\"virtualNetworkPoolName\":\"iprglvawu\"}],\"createdDate\":\"2021-10-09T04:15:21Z\",\"provisioningState\":\"fypiv\",\"uniqueIdentifier\":\"bbjpmcubkmif\"},\"location\":\"xxkubvphavp\",\"tags\":{\"bbttefjo\":\"rbqgvgov\",\"kdfrdbiqmrjgeihf\":\"nssqyzqed\",\"wfiwzcxmj\":\"lg\"},\"id\":\"byephmgt\",\"name\":\"ljvrcmyfqipgxhnp\",\"type\":\"myqwcab\"}")
            .toObject(VirtualNetworkInner.class);
        Assertions.assertEquals("xxkubvphavp", model.location());
        Assertions.assertEquals("rbqgvgov", model.tags().get("bbttefjo"));
        Assertions.assertEquals("cdoewbidyv", model.allowedSubnets().get(0).resourceId());
        Assertions.assertEquals("owx", model.allowedSubnets().get(0).labSubnetName());
        Assertions.assertEquals(UsagePermissionType.DEFAULT, model.allowedSubnets().get(0).allowPublicIp());
        Assertions.assertEquals("udeugfsxz", model.description());
        Assertions.assertEquals("paxwkufyk", model.externalProviderResourceId());
        Assertions.assertEquals("mmuc", model.subnetOverrides().get(0).resourceId());
        Assertions.assertEquals("hikkflrmy", model.subnetOverrides().get(0).labSubnetName());
        Assertions.assertEquals(UsagePermissionType.ALLOW, model.subnetOverrides().get(0).useInVmCreationPermission());
        Assertions.assertEquals(UsagePermissionType.DEFAULT,
            model.subnetOverrides().get(0).usePublicIpAddressPermission());
        Assertions.assertEquals("isws", model.subnetOverrides().get(0).virtualNetworkPoolName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkInner model
            = new VirtualNetworkInner().withLocation("xxkubvphavp")
                .withTags(mapOf("bbttefjo", "rbqgvgov", "kdfrdbiqmrjgeihf", "nssqyzqed", "wfiwzcxmj", "lg"))
                .withAllowedSubnets(Arrays.asList(new Subnet().withResourceId("cdoewbidyv")
                    .withLabSubnetName("owx")
                    .withAllowPublicIp(UsagePermissionType.DEFAULT)))
                .withDescription("udeugfsxz")
                .withExternalProviderResourceId("paxwkufyk")
                .withSubnetOverrides(
                    Arrays.asList(
                        new SubnetOverride().withResourceId("mmuc")
                            .withLabSubnetName("hikkflrmy")
                            .withUseInVmCreationPermission(UsagePermissionType.ALLOW)
                            .withUsePublicIpAddressPermission(UsagePermissionType.DEFAULT)
                            .withSharedPublicIpAddressConfiguration(new SubnetSharedPublicIpAddressConfiguration()
                                .withAllowedPorts(Arrays.asList(new Port())))
                            .withVirtualNetworkPoolName("isws"),
                        new SubnetOverride().withResourceId("iiiovgqcgxuugq")
                            .withLabSubnetName("totiowlxteqdptjg")
                            .withUseInVmCreationPermission(UsagePermissionType.DEFAULT)
                            .withUsePublicIpAddressPermission(UsagePermissionType.ALLOW)
                            .withSharedPublicIpAddressConfiguration(new SubnetSharedPublicIpAddressConfiguration()
                                .withAllowedPorts(Arrays.asList(new Port(), new Port(), new Port(), new Port())))
                            .withVirtualNetworkPoolName("b"),
                        new SubnetOverride().withResourceId("phqlkccuz")
                            .withLabSubnetName("gqwa")
                            .withUseInVmCreationPermission(UsagePermissionType.ALLOW)
                            .withUsePublicIpAddressPermission(UsagePermissionType.DEFAULT)
                            .withSharedPublicIpAddressConfiguration(new SubnetSharedPublicIpAddressConfiguration()
                                .withAllowedPorts(Arrays.asList(new Port(), new Port(), new Port())))
                            .withVirtualNetworkPoolName("iprglvawu")));
        model = BinaryData.fromObject(model).toObject(VirtualNetworkInner.class);
        Assertions.assertEquals("xxkubvphavp", model.location());
        Assertions.assertEquals("rbqgvgov", model.tags().get("bbttefjo"));
        Assertions.assertEquals("cdoewbidyv", model.allowedSubnets().get(0).resourceId());
        Assertions.assertEquals("owx", model.allowedSubnets().get(0).labSubnetName());
        Assertions.assertEquals(UsagePermissionType.DEFAULT, model.allowedSubnets().get(0).allowPublicIp());
        Assertions.assertEquals("udeugfsxz", model.description());
        Assertions.assertEquals("paxwkufyk", model.externalProviderResourceId());
        Assertions.assertEquals("mmuc", model.subnetOverrides().get(0).resourceId());
        Assertions.assertEquals("hikkflrmy", model.subnetOverrides().get(0).labSubnetName());
        Assertions.assertEquals(UsagePermissionType.ALLOW, model.subnetOverrides().get(0).useInVmCreationPermission());
        Assertions.assertEquals(UsagePermissionType.DEFAULT,
            model.subnetOverrides().get(0).usePublicIpAddressPermission());
        Assertions.assertEquals("isws", model.subnetOverrides().get(0).virtualNetworkPoolName());
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
