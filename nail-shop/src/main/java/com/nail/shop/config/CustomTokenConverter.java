package com.nail.shop.config;

import com.nail.shop.models.security.ApplicationUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.HashMap;
import java.util.Map;

public class CustomTokenConverter extends JwtAccessTokenConverter {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken,
                                     OAuth2Authentication authentication) {
        if(authentication.getOAuth2Request().getGrantType().equalsIgnoreCase("password")) {
            ApplicationUser user = (ApplicationUser) authentication.getPrincipal();
            final Map<String, Object> additionalInfo = new HashMap<>();

            additionalInfo.put("id", user.getAppUser().getId());
            additionalInfo.put("userProfileId", user.getAppUser().getUserProfile().getId());
            additionalInfo.put("email", user.getAppUser().getUsername());
            additionalInfo.put("firstName", user.getAppUser().getUserProfile().getFirstName());
            additionalInfo.put("lastName", user.getAppUser().getUserProfile().getLastName());

            ((DefaultOAuth2AccessToken) accessToken)
                    .setAdditionalInformation(additionalInfo);
        }
        accessToken = super.enhance(accessToken, authentication);
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(new HashMap<>());
        return accessToken;
    }
}