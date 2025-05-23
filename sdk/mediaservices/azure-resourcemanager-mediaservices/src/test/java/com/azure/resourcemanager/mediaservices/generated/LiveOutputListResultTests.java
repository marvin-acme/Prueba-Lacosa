// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveOutputInner;
import com.azure.resourcemanager.mediaservices.models.Hls;
import com.azure.resourcemanager.mediaservices.models.LiveOutputListResult;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiveOutputListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveOutputListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"description\":\"owbb\",\"assetName\":\"gyavu\",\"archiveWindowLength\":\"PT237H22M19S\",\"rewindWindowLength\":\"PT82H26M37S\",\"manifestName\":\"oxoismsksbpim\",\"hls\":{\"fragmentsPerTsSegment\":313242233},\"outputSnapTime\":7043498317535180454,\"created\":\"2021-11-12T05:30:54Z\",\"lastModified\":\"2021-09-22T22:00:27Z\",\"provisioningState\":\"xsffgcviz\",\"resourceState\":\"Running\"},\"id\":\"l\",\"name\":\"w\",\"type\":\"youpfgfbkj\"},{\"properties\":{\"description\":\"yhgk\",\"assetName\":\"minsgowzf\",\"archiveWindowLength\":\"PT177H9M21S\",\"rewindWindowLength\":\"PT133H16M58S\",\"manifestName\":\"ktlahbqa\",\"hls\":{\"fragmentsPerTsSegment\":867480662},\"outputSnapTime\":5269080860796174079,\"created\":\"2021-01-10T21:03:06Z\",\"lastModified\":\"2021-07-25T22:00:12Z\",\"provisioningState\":\"m\",\"resourceState\":\"Running\"},\"id\":\"qqxhrnxrxcpj\",\"name\":\"isavok\",\"type\":\"dzf\"},{\"properties\":{\"description\":\"ivjlfrqttbajlka\",\"assetName\":\"nwxyiop\",\"archiveWindowLength\":\"PT160H40M26S\",\"rewindWindowLength\":\"PT186H8M40S\",\"manifestName\":\"fku\",\"hls\":{\"fragmentsPerTsSegment\":2024292145},\"outputSnapTime\":4282582003268468975,\"created\":\"2021-12-07T17:25:55Z\",\"lastModified\":\"2021-02-13T14:30:32Z\",\"provisioningState\":\"ibrxkp\",\"resourceState\":\"Running\"},\"id\":\"zuruocbgo\",\"name\":\"rb\",\"type\":\"eoybfhjxakvvjgs\"},{\"properties\":{\"description\":\"dilmyww\",\"assetName\":\"kgkxn\",\"archiveWindowLength\":\"PT130H36M20S\",\"rewindWindowLength\":\"PT26H44M43S\",\"manifestName\":\"gyvudtjuewbc\",\"hls\":{\"fragmentsPerTsSegment\":535543031},\"outputSnapTime\":8529210988663924924,\"created\":\"2021-02-12T16:32:50Z\",\"lastModified\":\"2021-05-27T08:03:38Z\",\"provisioningState\":\"cybvpayakkudzpxg\",\"resourceState\":\"Deleting\"},\"id\":\"mag\",\"name\":\"tcyohpfkyrk\",\"type\":\"bdgiogsjk\"}],\"@odata.count\":1552096962,\"@odata.nextLink\":\"jnobaiyh\"}")
            .toObject(LiveOutputListResult.class);
        Assertions.assertEquals("owbb", model.value().get(0).description());
        Assertions.assertEquals("gyavu", model.value().get(0).assetName());
        Assertions.assertEquals(Duration.parse("PT237H22M19S"), model.value().get(0).archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT82H26M37S"), model.value().get(0).rewindWindowLength());
        Assertions.assertEquals("oxoismsksbpim", model.value().get(0).manifestName());
        Assertions.assertEquals(313242233, model.value().get(0).hls().fragmentsPerTsSegment());
        Assertions.assertEquals(7043498317535180454L, model.value().get(0).outputSnapTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveOutputListResult model = new LiveOutputListResult().withValue(Arrays.asList(
            new LiveOutputInner().withDescription("owbb")
                .withAssetName("gyavu")
                .withArchiveWindowLength(Duration.parse("PT237H22M19S"))
                .withRewindWindowLength(Duration.parse("PT82H26M37S"))
                .withManifestName("oxoismsksbpim")
                .withHls(new Hls().withFragmentsPerTsSegment(313242233))
                .withOutputSnapTime(7043498317535180454L),
            new LiveOutputInner().withDescription("yhgk")
                .withAssetName("minsgowzf")
                .withArchiveWindowLength(Duration.parse("PT177H9M21S"))
                .withRewindWindowLength(Duration.parse("PT133H16M58S"))
                .withManifestName("ktlahbqa")
                .withHls(new Hls().withFragmentsPerTsSegment(867480662))
                .withOutputSnapTime(5269080860796174079L),
            new LiveOutputInner().withDescription("ivjlfrqttbajlka")
                .withAssetName("nwxyiop")
                .withArchiveWindowLength(Duration.parse("PT160H40M26S"))
                .withRewindWindowLength(Duration.parse("PT186H8M40S"))
                .withManifestName("fku")
                .withHls(new Hls().withFragmentsPerTsSegment(2024292145))
                .withOutputSnapTime(4282582003268468975L),
            new LiveOutputInner().withDescription("dilmyww")
                .withAssetName("kgkxn")
                .withArchiveWindowLength(Duration.parse("PT130H36M20S"))
                .withRewindWindowLength(Duration.parse("PT26H44M43S"))
                .withManifestName("gyvudtjuewbc")
                .withHls(new Hls().withFragmentsPerTsSegment(535543031))
                .withOutputSnapTime(8529210988663924924L)));
        model = BinaryData.fromObject(model).toObject(LiveOutputListResult.class);
        Assertions.assertEquals("owbb", model.value().get(0).description());
        Assertions.assertEquals("gyavu", model.value().get(0).assetName());
        Assertions.assertEquals(Duration.parse("PT237H22M19S"), model.value().get(0).archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT82H26M37S"), model.value().get(0).rewindWindowLength());
        Assertions.assertEquals("oxoismsksbpim", model.value().get(0).manifestName());
        Assertions.assertEquals(313242233, model.value().get(0).hls().fragmentsPerTsSegment());
        Assertions.assertEquals(7043498317535180454L, model.value().get(0).outputSnapTime());
    }
}
