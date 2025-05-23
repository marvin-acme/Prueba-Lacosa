// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.compute;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.authorization.AuthorizationManager;
import com.azure.resourcemanager.compute.fluent.ComputeManagementClient;
import com.azure.resourcemanager.compute.implementation.AvailabilitySetsImpl;
import com.azure.resourcemanager.compute.implementation.ComputeManagementClientBuilder;
import com.azure.resourcemanager.compute.implementation.ComputeSkusImpl;
import com.azure.resourcemanager.compute.implementation.ComputeUsagesImpl;
import com.azure.resourcemanager.compute.implementation.DiskEncryptionSetsImpl;
import com.azure.resourcemanager.compute.implementation.DisksImpl;
import com.azure.resourcemanager.compute.implementation.GalleriesImpl;
import com.azure.resourcemanager.compute.implementation.GalleryImageVersionsImpl;
import com.azure.resourcemanager.compute.implementation.GalleryImagesImpl;
import com.azure.resourcemanager.compute.implementation.SnapshotsImpl;
import com.azure.resourcemanager.compute.implementation.VirtualMachineCustomImagesImpl;
import com.azure.resourcemanager.compute.implementation.VirtualMachineExtensionImagesImpl;
import com.azure.resourcemanager.compute.implementation.VirtualMachineImagesImpl;
import com.azure.resourcemanager.compute.implementation.VirtualMachinePublishersImpl;
import com.azure.resourcemanager.compute.implementation.VirtualMachineScaleSetsImpl;
import com.azure.resourcemanager.compute.implementation.VirtualMachinesImpl;
import com.azure.resourcemanager.compute.models.AvailabilitySets;
import com.azure.resourcemanager.compute.models.ComputeSkus;
import com.azure.resourcemanager.compute.models.ComputeUsages;
import com.azure.resourcemanager.compute.models.DiskEncryptionSets;
import com.azure.resourcemanager.compute.models.Disks;
import com.azure.resourcemanager.compute.models.Galleries;
import com.azure.resourcemanager.compute.models.GalleryImageVersions;
import com.azure.resourcemanager.compute.models.GalleryImages;
import com.azure.resourcemanager.compute.models.Snapshots;
import com.azure.resourcemanager.compute.models.VirtualMachineCustomImages;
import com.azure.resourcemanager.compute.models.VirtualMachineExtensionImages;
import com.azure.resourcemanager.compute.models.VirtualMachineImages;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSets;
import com.azure.resourcemanager.compute.models.VirtualMachines;
import com.azure.resourcemanager.network.NetworkManager;
import com.azure.resourcemanager.resources.fluentcore.arm.AzureConfigurable;
import com.azure.resourcemanager.resources.fluentcore.arm.Manager;
import com.azure.resourcemanager.resources.fluentcore.arm.implementation.AzureConfigurableImpl;
import com.azure.resourcemanager.resources.fluentcore.utils.HttpPipelineProvider;
import com.azure.resourcemanager.storage.StorageManager;

import java.util.Objects;

/** Entry point to Azure compute resource management. */
public final class ComputeManager extends Manager<ComputeManagementClient> {
    // The service managers
    private final StorageManager storageManager;
    private final NetworkManager networkManager;
    private final AuthorizationManager authorizationManager;

    // The collections
    private AvailabilitySets availabilitySets;
    private VirtualMachines virtualMachines;
    private VirtualMachineImages virtualMachineImages;
    private VirtualMachineExtensionImages virtualMachineExtensionImages;
    private VirtualMachineScaleSets virtualMachineScaleSets;
    private ComputeUsages computeUsages;
    private VirtualMachineCustomImages virtualMachineCustomImages;
    private Disks disks;
    private Snapshots snapshots;
    private ComputeSkus computeSkus;
    private Galleries galleries;
    private GalleryImages galleryImages;
    private GalleryImageVersions galleryImageVersions;
    private DiskEncryptionSets diskEncryptionSets;

    /**
     * Gets the storage manager.
     *
     * @return the storage manager
     */
    public StorageManager storageManager() {
        return storageManager;
    }

    /**
     * Gets the network manager.
     *
     * @return the network manager
     */
    public NetworkManager networkManager() {
        return networkManager;
    }

    /**
     * Gets the authorization manager.
     *
     * @return the authorization manager
     */
    public AuthorizationManager authorizationManager() {
        return authorizationManager;
    }

    /**
     * Get a Configurable instance that can be used to create ComputeManager with optional configuration.
     *
     * @return Configurable
     */
    public static Configurable configure() {
        return new ComputeManager.ConfigurableImpl();
    }

    /**
     * Creates an instance of ComputeManager that exposes Compute resource management API entry points.
     *
     * @param credential the credential to use
     * @param profile the profile to use
     * @return the ComputeManager
     */
    public static ComputeManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return authenticate(HttpPipelineProvider.buildHttpPipeline(credential, profile), profile);
    }

    /**
     * Creates an instance of ComputeManager that exposes Compute resource management API entry points.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the profile to use
     * @return the ComputeManager
     */
    public static ComputeManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new ComputeManager(httpPipeline, profile);
    }

    /** The interface allowing configurations to be set. */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
         * Creates an instance of ComputeManager that exposes Compute resource management API entry points.
         *
         * @param credential the credential to use
         * @param profile the profile to use
         * @return the ComputeManager
         */
        ComputeManager authenticate(TokenCredential credential, AzureProfile profile);
    }

    /** The implementation for Configurable interface. */
    private static final class ConfigurableImpl extends AzureConfigurableImpl<Configurable> implements Configurable {
        @Override
        public ComputeManager authenticate(TokenCredential credential, AzureProfile profile) {
            return ComputeManager.authenticate(buildHttpPipeline(credential, profile), profile);
        }
    }

    private ComputeManager(HttpPipeline httpPipeline, AzureProfile profile) {
        super(httpPipeline, profile,
            new ComputeManagementClientBuilder().pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .buildClient());
        storageManager = StorageManager.authenticate(httpPipeline, profile);
        networkManager = NetworkManager.authenticate(httpPipeline, profile);
        authorizationManager = AuthorizationManager.authenticate(httpPipeline, profile);
    }

    /**
     * Gets the availability set resource management API entry point.
     *
     * @return the availability set resource management API entry point
     */
    public AvailabilitySets availabilitySets() {
        if (availabilitySets == null) {
            availabilitySets = new AvailabilitySetsImpl(this);
        }
        return availabilitySets;
    }

    /**
     * Gets the virtual machine resource management API entry point.
     *
     * @return the virtual machine resource management API entry point
     */
    public VirtualMachines virtualMachines() {
        if (virtualMachines == null) {
            virtualMachines = new VirtualMachinesImpl(this, storageManager, networkManager, authorizationManager);
        }
        return virtualMachines;
    }

    /**
     * Gets the virtual machine image resource management API entry point.
     *
     * @return the virtual machine image resource management API entry point
     */
    public VirtualMachineImages virtualMachineImages() {
        if (virtualMachineImages == null) {
            virtualMachineImages = new VirtualMachineImagesImpl(
                new VirtualMachinePublishersImpl(this.serviceClient().getVirtualMachineImages(),
                    this.serviceClient().getVirtualMachineExtensionImages()),
                this.serviceClient().getVirtualMachineImages());
        }
        return virtualMachineImages;
    }

    /**
     * Gets the virtual machine extension image resource management API entry point.
     *
     * @return the virtual machine extension image resource management API entry point
     */
    public VirtualMachineExtensionImages virtualMachineExtensionImages() {
        if (virtualMachineExtensionImages == null) {
            virtualMachineExtensionImages = new VirtualMachineExtensionImagesImpl(
                new VirtualMachinePublishersImpl(this.serviceClient().getVirtualMachineImages(),
                    this.serviceClient().getVirtualMachineExtensionImages()));
        }
        return virtualMachineExtensionImages;
    }

    /**
     * Gets the virtual machine scale set resource management API entry point.
     *
     * @return the virtual machine scale set resource management API entry point
     */
    public VirtualMachineScaleSets virtualMachineScaleSets() {
        if (virtualMachineScaleSets == null) {
            virtualMachineScaleSets
                = new VirtualMachineScaleSetsImpl(this, storageManager, networkManager, this.authorizationManager);
        }
        return virtualMachineScaleSets;
    }

    /**
     * Gets the compute resource usage management API entry point.
     *
     * @return the compute resource usage management API entry point
     */
    public ComputeUsages usages() {
        if (computeUsages == null) {
            computeUsages = new ComputeUsagesImpl(this.serviceClient());
        }
        return computeUsages;
    }

    /**
     * Gets the virtual machine custom image management API entry point.
     *
     * @return the virtual machine custom image management API entry point
     */
    public VirtualMachineCustomImages virtualMachineCustomImages() {
        if (virtualMachineCustomImages == null) {
            virtualMachineCustomImages = new VirtualMachineCustomImagesImpl(this);
        }
        return virtualMachineCustomImages;
    }

    /**
     * Gets the managed disk management API entry point.
     *
     * @return the managed disk management API entry point
     */
    public Disks disks() {
        if (disks == null) {
            disks = new DisksImpl(this);
        }
        return disks;
    }

    /**
     * Gets the managed snapshot management API entry point.
     *
     * @return the managed snapshot management API entry point
     */
    public Snapshots snapshots() {
        if (snapshots == null) {
            snapshots = new SnapshotsImpl(this);
        }
        return snapshots;
    }

    /**
     * Gets the compute service SKU management API entry point.
     *
     * @return the compute service SKU management API entry point
     */
    public ComputeSkus computeSkus() {
        if (computeSkus == null) {
            computeSkus = new ComputeSkusImpl(this);
        }
        return computeSkus;
    }

    /**
     * Gets the compute service gallery management entry point.
     *
     * @return the compute service gallery management entry point
     */
    public Galleries galleries() {
        if (galleries == null) {
            galleries = new GalleriesImpl(this);
        }
        return galleries;
    }

    /**
     * Gets the compute service gallery image management entry point.
     *
     * @return the compute service gallery image management entry point
     */
    public GalleryImages galleryImages() {
        if (galleryImages == null) {
            galleryImages = new GalleryImagesImpl(this);
        }
        return galleryImages;
    }

    /**
     * Gets the compute service gallery image version management entry point.
     *
     * @return the compute service gallery image version management entry point
     */
    public GalleryImageVersions galleryImageVersions() {
        if (galleryImageVersions == null) {
            galleryImageVersions = new GalleryImageVersionsImpl(this);
        }
        return galleryImageVersions;
    }

    /**
     * Gets the disk encryption set management entry point.
     *
     * @return the disk encryption set management entry point
     */
    public DiskEncryptionSets diskEncryptionSets() {
        if (diskEncryptionSets == null) {
            diskEncryptionSets = new DiskEncryptionSetsImpl(this);
        }
        return diskEncryptionSets;
    }
}
