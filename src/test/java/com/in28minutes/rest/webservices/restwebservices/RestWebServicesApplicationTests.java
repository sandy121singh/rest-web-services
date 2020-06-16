package com.in28minutes.rest.webservices.restwebservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestWebServicesApplicationTests {
	
	private static final Logger logger=LoggerFactory.getLogger(RestWebServicesApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test Executing....");
		assertEquals(true, true);
	}

}
