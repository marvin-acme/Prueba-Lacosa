// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.service.implementation.servicebus.properties;

import java.time.Duration;

/**
 *
 */
public interface ServiceBusProcessorClientProperties extends ServiceBusReceiverClientProperties {

    Integer getMaxConcurrentCalls();

    Integer getMaxConcurrentSessions();

    Duration getSessionIdleTimeout();

}
