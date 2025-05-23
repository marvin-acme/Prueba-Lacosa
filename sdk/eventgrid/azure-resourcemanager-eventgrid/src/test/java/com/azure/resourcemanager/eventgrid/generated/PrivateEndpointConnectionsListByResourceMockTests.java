// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.PersistedConnectionStatus;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpointConnection;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpointConnectionsParentType;
import com.azure.resourcemanager.eventgrid.models.ResourceProvisioningState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListByResourceMockTests {
    @Test
    public void testListByResource() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"fsqebuuxjxhfxf\"},\"groupIds\":[\"dkktpmbmxbmbrwgz\",\"xljbkhxsd\",\"laumydmhweqjf\",\"xydgtokvqbvwg\"],\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"vxakglh\",\"actionsRequired\":\"esrfgamqiydvx\"},\"provisioningState\":\"Canceled\"},\"id\":\"hyhgo\",\"name\":\"gs\",\"type\":\"yqyxyjrcbqpbis\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<PrivateEndpointConnection> response = manager.privateEndpointConnections()
            .listByResource("cpfpdofuckcl", PrivateEndpointConnectionsParentType.DOMAINS, "xlu", "vsolzwil", 1533197991,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fsqebuuxjxhfxf", response.iterator().next().privateEndpoint().id());
        Assertions.assertEquals("dkktpmbmxbmbrwgz", response.iterator().next().groupIds().get(0));
        Assertions.assertEquals(PersistedConnectionStatus.APPROVED,
            response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("vxakglh",
            response.iterator().next().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("esrfgamqiydvx",
            response.iterator().next().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals(ResourceProvisioningState.CANCELED, response.iterator().next().provisioningState());
    }
}
