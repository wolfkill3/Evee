package com.ist012m.evee.System;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecSecurityConfig extends WebSecurityConfigurerAdapter {

    // @Override
    // protected void configure(final HttpSecurity http) throws Exception {
    //     // http
    //     //     .authorizeRequests()
    //     //     // ... endpoints
    //     //     .formLogin()
    //     //     .loginPage("/login.html")
    //     //     .loginProcessingUrl("/login")
    //     //     .defaultSuccessUrl("/homepage.html", true)
    //     // // ... other configuration
    // }
}
