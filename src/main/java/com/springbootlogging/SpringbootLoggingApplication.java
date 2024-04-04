package com.springbootlogging;

import
		org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootLoggingApplication {

	public static final Logger logger= LoggerFactory.getLogger(SpringbootLoggingApplication.class);


	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name){
		logger.debug("Request {}" , name);
		String response= "Hi "+ name+ " Welcome to java. ";
		logger.debug("Response {}" + response);
		return  response;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoggingApplication.class, args);
	}

}
