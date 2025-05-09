// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The reason or list of reasons why a packet core has not been installed or requires a reinstall.
 */
public final class InstallationReason extends ExpandableStringEnum<InstallationReason> {
    /**
     * Static value NoSlices for InstallationReason.
     */
    public static final InstallationReason NO_SLICES = fromString("NoSlices");

    /**
     * Static value NoPacketCoreDataPlane for InstallationReason.
     */
    public static final InstallationReason NO_PACKET_CORE_DATA_PLANE = fromString("NoPacketCoreDataPlane");

    /**
     * Static value NoAttachedDataNetworks for InstallationReason.
     */
    public static final InstallationReason NO_ATTACHED_DATA_NETWORKS = fromString("NoAttachedDataNetworks");

    /**
     * Static value PublicLandMobileNetworkIdentifierHasChanged for InstallationReason.
     */
    public static final InstallationReason PUBLIC_LAND_MOBILE_NETWORK_IDENTIFIER_HAS_CHANGED
        = fromString("PublicLandMobileNetworkIdentifierHasChanged");

    /**
     * Static value ControlPlaneAccessInterfaceHasChanged for InstallationReason.
     */
    public static final InstallationReason CONTROL_PLANE_ACCESS_INTERFACE_HAS_CHANGED
        = fromString("ControlPlaneAccessInterfaceHasChanged");

    /**
     * Static value UserPlaneAccessInterfaceHasChanged for InstallationReason.
     */
    public static final InstallationReason USER_PLANE_ACCESS_INTERFACE_HAS_CHANGED
        = fromString("UserPlaneAccessInterfaceHasChanged");

    /**
     * Static value UserPlaneDataInterfaceHasChanged for InstallationReason.
     */
    public static final InstallationReason USER_PLANE_DATA_INTERFACE_HAS_CHANGED
        = fromString("UserPlaneDataInterfaceHasChanged");

    /**
     * Static value ControlPlaneAccessVirtualIpv4AddressesHasChanged for InstallationReason.
     */
    public static final InstallationReason CONTROL_PLANE_ACCESS_VIRTUAL_IPV4ADDRESSES_HAS_CHANGED
        = fromString("ControlPlaneAccessVirtualIpv4AddressesHasChanged");

    /**
     * Static value UserPlaneAccessVirtualIpv4AddressesHasChanged for InstallationReason.
     */
    public static final InstallationReason USER_PLANE_ACCESS_VIRTUAL_IPV4ADDRESSES_HAS_CHANGED
        = fromString("UserPlaneAccessVirtualIpv4AddressesHasChanged");

    /**
     * Creates a new instance of InstallationReason value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InstallationReason() {
    }

    /**
     * Creates or finds a InstallationReason from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InstallationReason.
     */
    public static InstallationReason fromString(String name) {
        return fromString(name, InstallationReason.class);
    }

    /**
     * Gets known InstallationReason values.
     * 
     * @return known InstallationReason values.
     */
    public static Collection<InstallationReason> values() {
        return values(InstallationReason.class);
    }
}
