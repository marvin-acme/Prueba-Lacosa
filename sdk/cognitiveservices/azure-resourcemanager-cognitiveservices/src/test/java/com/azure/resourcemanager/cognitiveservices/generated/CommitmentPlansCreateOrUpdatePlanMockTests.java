// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPeriod;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanProperties;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import com.azure.resourcemanager.cognitiveservices.models.Sku;
import com.azure.resourcemanager.cognitiveservices.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CommitmentPlansCreateOrUpdatePlanMockTests {
    @Test
    public void testCreateOrUpdatePlan() throws Exception {
        String responseStr
            = "{\"etag\":\"zyqu\",\"kind\":\"sqxutr\",\"sku\":{\"name\":\"rruyuu\",\"tier\":\"Basic\",\"size\":\"mbjwcolbmxlb\",\"family\":\"tpc\",\"capacity\":1170743993},\"tags\":{\"vxhmtfhocnxzcmj\":\"z\"},\"location\":\"gxnoqrxtdis\",\"properties\":{\"provisioningState\":\"Succeeded\",\"commitmentPlanGuid\":\"d\",\"hostingModel\":\"ProvisionedWeb\",\"planType\":\"idwhepfw\",\"current\":{\"tier\":\"f\",\"count\":1851489333,\"quota\":{\"quantity\":4067085103583687450,\"unit\":\"wcdbckyoik\"},\"startDate\":\"xhn\",\"endDate\":\"knjz\"},\"autoRenew\":false,\"next\":{\"tier\":\"e\",\"count\":1365496443,\"quota\":{\"quantity\":7662967851751345556,\"unit\":\"rlbpgsnbagnc\"},\"startDate\":\"hg\",\"endDate\":\"uowakyw\"},\"last\":{\"tier\":\"jymxcgqt\",\"count\":886667485,\"quota\":{\"quantity\":2572709377842820950,\"unit\":\"ol\"},\"startDate\":\"mevtfycnlbvgjc\",\"endDate\":\"kk\"},\"provisioningIssues\":[\"iytssikizbc\"]},\"id\":\"fqb\",\"name\":\"ntnrgmqsorh\",\"type\":\"ekxgn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CommitmentPlan response = manager.commitmentPlans()
            .definePlan("jodqhykincn")
            .withExistingResourceGroup("ijpodtblxpkkwj")
            .withRegion("jbfqzdk")
            .withTags(mapOf("ouvblgmo", "lowuowhlxlnwyr", "ih", "zkltrfowtdvrfmv", "hdxlw", "vjdrqcrjidhftuk"))
            .withKind("odkadppyibngq")
            .withSku(new Sku().withName("d")
                .withTier(SkuTier.ENTERPRISE)
                .withSize("whydt")
                .withFamily("vvadswzs")
                .withCapacity(1437535025))
            .withProperties(new CommitmentPlanProperties().withCommitmentPlanGuid("xhafratqx")
                .withHostingModel(HostingModel.CONNECTED_CONTAINER)
                .withPlanType("oum")
                .withCurrent(new CommitmentPeriod().withTier("valqjrhuzgfxo").withCount(256650103))
                .withAutoRenew(true)
                .withNext(new CommitmentPeriod().withTier("socnequygdjboq").withCount(1174525778)))
            .create();

        Assertions.assertEquals("sqxutr", response.kind());
        Assertions.assertEquals("rruyuu", response.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, response.sku().tier());
        Assertions.assertEquals("mbjwcolbmxlb", response.sku().size());
        Assertions.assertEquals("tpc", response.sku().family());
        Assertions.assertEquals(1170743993, response.sku().capacity());
        Assertions.assertEquals("z", response.tags().get("vxhmtfhocnxzcmj"));
        Assertions.assertEquals("gxnoqrxtdis", response.location());
        Assertions.assertEquals("d", response.properties().commitmentPlanGuid());
        Assertions.assertEquals(HostingModel.PROVISIONED_WEB, response.properties().hostingModel());
        Assertions.assertEquals("idwhepfw", response.properties().planType());
        Assertions.assertEquals("f", response.properties().current().tier());
        Assertions.assertEquals(1851489333, response.properties().current().count());
        Assertions.assertEquals(false, response.properties().autoRenew());
        Assertions.assertEquals("e", response.properties().next().tier());
        Assertions.assertEquals(1365496443, response.properties().next().count());
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
