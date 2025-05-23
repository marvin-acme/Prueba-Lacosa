// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.identity.util;

import com.azure.v2.identity.implementation.models.MsalToken;
import com.microsoft.aad.msal4j.AuthenticationResultMetadata;
import com.microsoft.aad.msal4j.IAccount;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.ITenantProfile;
import io.clientcore.core.credentials.oauth.AccessToken;
import io.clientcore.core.utils.configuration.Configuration;
import io.clientcore.core.utils.configuration.ConfigurationSource;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Utilities for identity tests.
 */
public final class TestUtils {
    private static final ConfigurationSource EMPTY_SOURCE = new ConfigurationSource() {
        @Override
        public String getProperty(String name) {
            return null;
        }

        @Override
        public boolean isMutable() {
            return true;
        }
    };

    /**
     * Creates a mock {@link IAuthenticationResult} instance.
     * @param accessToken the access token to return
     * @param expiresOn the expiration time
     * @return a completable future of the result
     */
    public static CompletableFuture<IAuthenticationResult> getMockAuthenticationResult(String accessToken,
        OffsetDateTime expiresOn) {
        return CompletableFuture.completedFuture(getMockIAuthenticationResult(accessToken, expiresOn));
    }

    private static IAuthenticationResult getMockIAuthenticationResult(String accessToken, OffsetDateTime expiresOn) {
        return new IAuthenticationResult() {
            @Override
            public String accessToken() {
                return accessToken;
            }

            @Override
            public String idToken() {
                return null;
            }

            @Override
            public IAccount account() {
                return new Account();
            }

            @Override
            public ITenantProfile tenantProfile() {
                return null;
            }

            @Override
            public String environment() {
                return "http://login.microsoftonline.com";
            }

            @Override
            public String scopes() {
                return null;
            }

            @Override
            public Date expiresOnDate() {
                // Access token dials back 2 minutes
                return Date.from(expiresOn.plusMinutes(2).toInstant());
            }

            @Override
            public AuthenticationResultMetadata metadata() {
                return null;
            }
        };
    }

    /**
     * Creates a mock {@link MsalToken} instance.
     * @param accessToken the access token to return
     * @param expiresOn the expiration time
     * @return a Mono publisher of the result
     */
    public static MsalToken getMockMsalToken(String accessToken, OffsetDateTime expiresOn) {
        return new MsalToken(getMockIAuthenticationResult(accessToken, expiresOn));

    }

    /**
     * Creates a mock {@link IAccount} instance.
     * @param accessToken the access token to return
     * @param expiresOn the expiration time
     * @return a Mono publisher of the result
     */
    public static IAccount getMockMsalAccount(String accessToken, OffsetDateTime expiresOn) {
        try {
            return getMockAuthenticationResult(accessToken, expiresOn).get().account();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a mock {@link AccessToken} instance.
     * @param accessToken the access token to return
     * @param expiresOn the expiration time
     * @return a Mono publisher of the result
     */
    public static AccessToken getMockAccessToken(String accessToken, OffsetDateTime expiresOn) {
        return new AccessToken(accessToken, expiresOn.plusMinutes(2));
    }

    /**
     * Creates a mock {@link AccessToken} instance.
     * @param accessToken the access token to return
     * @param expiresOn the expiration time
     * @param tokenRefreshOffset how long before the actual expiry to refresh the token
     * @return a Mono publisher of the result
     */
    public static AccessToken getMockAccessToken(String accessToken, OffsetDateTime expiresOn,
        Duration tokenRefreshOffset) {
        return new AccessToken(accessToken, expiresOn.plusMinutes(2).minus(tokenRefreshOffset));
    }

    /**
     * Creates a {@link Configuration} with the specified {@link ConfigurationSource} as the only source of
     * configurations.
     *
     * @param configurationSource The configuration source.
     * @return A configuration used for testing.
     */
    public static Configuration createTestConfiguration(ConfigurationSource configurationSource) {
        return Configuration.from(EMPTY_SOURCE, EMPTY_SOURCE, configurationSource);
    }

    private TestUtils() {
    }

    static class Account implements IAccount {
        static final long serialVersionUID = 1L;

        @Override
        public String homeAccountId() {
            return UUID.randomUUID().toString();
        }

        @Override
        public String environment() {
            return "http://login.microsoftonline.com";
        }

        @Override
        public String username() {
            return "testuser";
        }

        @Override
        public Map<String, ITenantProfile> getTenantProfiles() {
            return null;
        }
    }
}
