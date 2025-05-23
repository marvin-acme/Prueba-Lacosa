// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.fluent.models.FileShareInner;
import com.azure.resourcemanager.storage.models.AccessPolicy;
import com.azure.resourcemanager.storage.models.FileSharePropertiesFileSharePaidBursting;
import com.azure.resourcemanager.storage.models.SignedIdentifier;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for FileShares Update.
 */
public final class FileSharesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/FileSharesPatch.json
     */
    /**
     * Sample code: UpdateShares.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateShares(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .updateWithResponse("res3376", "sto328", "share6185",
                new FileShareInner().withMetadata(mapOf("type", "image")), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/FileShareAclsPatch.json
     */
    /**
     * Sample code: UpdateShareAcls.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateShareAcls(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .updateWithResponse("res3376", "sto328", "share6185",
                new FileShareInner()
                    .withSignedIdentifiers(
                        Arrays
                            .asList(new SignedIdentifier().withId("MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTI")
                                .withAccessPolicy(new AccessPolicy()
                                    .withStartTime(OffsetDateTime.parse("2021-04-01T08:49:37.0000000Z"))
                                    .withExpiryTime(OffsetDateTime.parse("2021-05-01T08:49:37.0000000Z"))
                                    .withPermission("rwd")))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/FileSharesPatch_PaidBursting.
     * json
     */
    /**
     * Sample code: UpdateSharePaidBursting.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateSharePaidBursting(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .updateWithResponse("res3376", "sto328", "share6185",
                new FileShareInner().withFileSharePaidBursting(
                    new FileSharePropertiesFileSharePaidBursting().withPaidBurstingEnabled(true)
                        .withPaidBurstingMaxIops(102400)
                        .withPaidBurstingMaxBandwidthMibps(10340)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/FileSharesPatch_ProvisionedV2
     * .json
     */
    /**
     * Sample code: UpdateShareProvisionedV2.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateShareProvisionedV2(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .updateWithResponse("res3376", "sto328", "share6185",
                new FileShareInner().withShareQuota(100).withProvisionedIops(5000).withProvisionedBandwidthMibps(200),
                com.azure.core.util.Context.NONE);
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
