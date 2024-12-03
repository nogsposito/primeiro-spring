package com.vini_first_spring.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // combina Configuration, EnableAutoConfigurarion e ComponentScan
public class FirstSpringAppApplication {

	public static void main(String[] args) { // classe pprincipal
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
