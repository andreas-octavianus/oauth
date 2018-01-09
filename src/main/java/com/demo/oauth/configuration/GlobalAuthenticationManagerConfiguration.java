package com.demo.oauth.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class GlobalAuthenticationManagerConfiguration extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("john").password("123").roles("USER").and()
                .withUser("doe").password("456").roles("ADMIN").and()
                .withUser("superman").password("789").roles("USER", "ADMIN");
    }
}
