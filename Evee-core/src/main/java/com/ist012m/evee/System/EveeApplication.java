package com.ist012m.evee.System;

import java.util.*;

import com.ist012m.evee.Core.Job.TrainJobFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EveeApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EveeApplication.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", "8084"));
        TrainJobFactory.getInstance();
        application.run(args);
    }
}
