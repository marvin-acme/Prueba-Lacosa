// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.generated;

import com.azure.resourcemanager.fluidrelay.models.KeyName;
import com.azure.resourcemanager.fluidrelay.models.RegenerateKeyRequest;

/**
 * Samples for FluidRelayServers RegenerateKey.
 */
public final class FluidRelayServersRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/fluidrelay/resource-manager/Microsoft.FluidRelay/stable/2022-06-01/examples/
     * FluidRelayServers_RegenerateKeys.json
     */
    /**
     * Sample code: Regenerate keys for a Fluid Relay server.
     * 
     * @param manager Entry point to FluidRelayManager.
     */
    public static void
        regenerateKeysForAFluidRelayServer(com.azure.resourcemanager.fluidrelay.FluidRelayManager manager) {
        manager.fluidRelayServers()
            .regenerateKeyWithResponse("myResourceGroup", "myFluidRelayServer",
                new RegenerateKeyRequest().withKeyName(KeyName.KEY1), com.azure.core.util.Context.NONE);
    }
}
