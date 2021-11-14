package com.ist012m.evee.System;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecSecurityConfig extends WebSecurityConfigurerAdapter {
    // @Override
    // protected void configure(final HttpSecurity security) throws Exception {
    //     security.formLogin()
    //             .loginProcessingUrl("localhost:4200/login")
    //             .defaultSuccessUrl("localhost:4200/home", true);
    // }
}
