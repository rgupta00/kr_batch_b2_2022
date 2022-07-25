package com.bookapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // <context:annotation-config/>
@ComponentScan(basePackages = {"com.bookapp"}) //<context:component-scan base-package="com.bookapp"/>
public class AppConfig {

}
