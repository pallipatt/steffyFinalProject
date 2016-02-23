package com.steffyfinalproject.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The runner for our Spring Boot application.
 */
@SpringBootApplication
public class Application {
 
	/**
	 * The default runner for a Spring Boot application 
	 * @param args these are run parameters
	 */
	public static void main(String[] args) {  
		SpringApplication.run(Application.class);
	}

}
