package com.in28minutes.rest.webservices.restwebservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWebServicesApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(RestWebServicesApplication.class);

	public void init() {
		
		logger.info("Starting the applicaiton...");
	}
	
	public static void main(String[] args) {
		
		logger.info("Spring Boot Application Executing...");
		
		SpringApplication.run(RestWebServicesApplication.class, args);
	}

}
