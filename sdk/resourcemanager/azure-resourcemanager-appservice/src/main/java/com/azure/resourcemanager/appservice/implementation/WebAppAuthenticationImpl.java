// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.appservice.implementation;

import com.azure.resourcemanager.appservice.models.BuiltInAuthenticationProvider;
import com.azure.resourcemanager.appservice.models.UnauthenticatedClientAction;
import com.azure.resourcemanager.appservice.models.WebAppAuthentication;
import com.azure.resourcemanager.appservice.models.WebAppBase;
import com.azure.resourcemanager.appservice.fluent.models.SiteAuthSettingsInner;
import com.azure.resourcemanager.resources.fluentcore.model.implementation.IndexableWrapperImpl;
import java.util.ArrayList;

/**
 * Implementation for WebAppAuthentication and its create and update interfaces.
 *
 * @param <FluentT> the fluent interface of the parent web app
 * @param <FluentImplT> the fluent implementation of the parent web app
 */
class WebAppAuthenticationImpl<FluentT extends WebAppBase, FluentImplT extends WebAppBaseImpl<FluentT, FluentImplT>>
    extends IndexableWrapperImpl<SiteAuthSettingsInner>
    implements WebAppAuthentication, WebAppAuthentication.Definition<WebAppBase.DefinitionStages.WithCreate<FluentT>>,
    WebAppAuthentication.UpdateDefinition<WebAppBase.Update<FluentT>> {

    private final WebAppBaseImpl<FluentT, FluentImplT> parent;

    WebAppAuthenticationImpl(SiteAuthSettingsInner inner, WebAppBaseImpl<FluentT, FluentImplT> parent) {
        super(inner);
        this.parent = parent;
        inner.withTokenStoreEnabled(true);
    }

    @Override
    public FluentImplT attach() {
        parent.withAuthentication(this);
        return parent();
    }

    @Override
    @SuppressWarnings("unchecked")
    public FluentImplT parent() {
        parent.withAuthentication(this);
        return (FluentImplT) this.parent;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT> withAnonymousAuthentication() {
        innerModel().withUnauthenticatedClientAction(UnauthenticatedClientAction.ALLOW_ANONYMOUS);
        return this;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT>
        withDefaultAuthenticationProvider(BuiltInAuthenticationProvider provider) {
        innerModel().withUnauthenticatedClientAction(UnauthenticatedClientAction.REDIRECT_TO_LOGIN_PAGE)
            .withDefaultProvider(provider);
        return this;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT> withActiveDirectory(String clientId, String issuerUrl) {
        innerModel().withClientId(clientId).withIssuer(issuerUrl);
        return this;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT> withFacebook(String appId, String appSecret) {
        innerModel().withFacebookAppId(appId).withFacebookAppSecret(appSecret);
        return this;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT> withGoogle(String clientId, String clientSecret) {
        innerModel().withGoogleClientId(clientId).withGoogleClientSecret(clientSecret);
        return this;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT> withTwitter(String apiKey, String apiSecret) {
        innerModel().withTwitterConsumerKey(apiKey).withTwitterConsumerSecret(apiSecret);
        return this;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT> withMicrosoft(String clientId, String clientSecret) {
        innerModel().withMicrosoftAccountClientId(clientId).withMicrosoftAccountClientSecret(clientSecret);
        return this;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT> withTokenStore(boolean enabled) {
        innerModel().withTokenStoreEnabled(enabled);
        return this;
    }

    @Override
    public WebAppAuthenticationImpl<FluentT, FluentImplT> withAllowedExternalRedirectUrl(String url) {
        if (innerModel().allowedExternalRedirectUrls() == null) {
            innerModel().withAllowedExternalRedirectUrls(new ArrayList<String>());
        }
        innerModel().allowedExternalRedirectUrls().add(url);
        return this;
    }
}
