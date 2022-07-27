package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/*
 * @SpringBootApplication=@SpringBootConfiguration+@EnableAutoConfiguration+@ComponentScan
 */
@ComponentScan(basePackages = {"com.empapp"})
//@EntityScan("com.empapp.dao")

@SpringBootApplication
public class EmpappV1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmpappV1Application.class, args);
	}
}
