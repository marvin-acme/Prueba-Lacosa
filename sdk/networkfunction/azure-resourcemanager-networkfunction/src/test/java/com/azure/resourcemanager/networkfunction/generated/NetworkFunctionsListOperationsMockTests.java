// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager;
import com.azure.resourcemanager.networkfunction.models.Operation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NetworkFunctionsListOperationsMockTests {
    @Test
    public void testListOperations() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"hrhcffcyddglmjth\",\"isDataAction\":false,\"display\":{\"provider\":\"yeicxmqciwqvhk\",\"resource\":\"xuigdtopbobj\",\"operation\":\"hm\",\"description\":\"u\"},\"origin\":\"a\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureTrafficCollectorManager manager = AzureTrafficCollectorManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Operation> response = manager.networkFunctions().listOperations(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hrhcffcyddglmjth", response.iterator().next().name());
        Assertions.assertEquals(false, response.iterator().next().isDataAction());
        Assertions.assertEquals("yeicxmqciwqvhk", response.iterator().next().display().provider());
        Assertions.assertEquals("xuigdtopbobj", response.iterator().next().display().resource());
        Assertions.assertEquals("hm", response.iterator().next().display().operation());
        Assertions.assertEquals("u", response.iterator().next().display().description());
        Assertions.assertEquals("a", response.iterator().next().origin());
    }
}
