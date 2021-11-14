package com.ist012m.evee.System;

import javax.servlet.ServletContext;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;

// public class AppInitializer implements WebApplicationInitializer {
//     @Override
//     public void onStartup(ServletContext context) {
//
//         // AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
//         // root.register(SecSecurityConfig.class);
//
//         //context.addListener(new ContextLoaderListener(root));
//
//         // context.addFilter("securityFilter", new DelegatingFilterProxy("springSecurityFilterChain"))
//         //        .addMappingForUrlPatterns(null, false, "/*");
//     }
// }
