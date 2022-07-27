package com.empapp.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.empapp.api.EmployeeApi;
import com.empapp.api.HelloApi;
//---------this is used to integrate jersey with spring boot
@Configuration
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(EmployeeApi.class);
        register(HelloApi.class);
        packages("com.empapp");
      
    }
}