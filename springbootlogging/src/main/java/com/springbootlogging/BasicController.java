package com.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BasicController.class);
	
	@RequestMapping("/log")
	public String welcomeMessage() {
		LOGGER.info(" Log Info ...");
		LOGGER.debug(" Log Debug ...");
		LOGGER.trace(" Log Trace ...");
		LOGGER.warn(" Log Warn ...");
		LOGGER.error(" Log Error ...");
		System.out.println("Inside Log Method");
		return "Welcome to Spring Boot Logging Framework";
		 
	}
	
}
