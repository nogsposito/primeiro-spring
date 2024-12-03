package com.vini_first_spring.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication // combina Configuration, EnableAutoConfigurarion e ComponentScan
@Profile("dev")
public class FirstSpringAppApplication {

	public static void main(String[] args) { // classe pprincipal
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
