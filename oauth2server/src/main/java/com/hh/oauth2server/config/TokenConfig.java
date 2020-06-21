package com.hh.oauth2server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class TokenConfig {

    private final String SIGN_KEY = "huanghong";

//    @Bean
//    public TokenStore tokenStore(){
//        return new InMemoryTokenStore();
//    }

    @Bean
    public TokenStore tokenStore(){
        return new JwtTokenStore(jwtTokenEnhancer());
    }


    @Bean
    public JwtAccessTokenConverter jwtTokenEnhancer(){
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(SIGN_KEY);
        return converter;
    }
}
