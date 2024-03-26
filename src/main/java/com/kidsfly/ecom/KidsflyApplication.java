package com.kidsfly.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kidsfly"}) 
@EntityScan("com.kidsfly")
@EnableJpaRepositories(basePackages = "com.kidsfly")
public class KidsflyApplication {

	public static void main(String[] args) {
		SpringApplication.run(KidsflyApplication.class, args);
	}

}
