package com.example.ConstructorInjectionWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConstructorInjectionWithSpringApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ConstructorInjectionWithSpringApplication.class, args);
		// Calling IOC container class for calling Spring managed class/beans

		Dev dev = context.getBean(Dev.class);   // getting Dev class object from IOC container

		dev.code();

	}

}
