package com.sayan.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpring1Application {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsSpring1Application.class); 

	@PostConstruct
	public void init() {
		logger.info("Application started");
	}
	
	public static void main(String[] args) {
		logger.info("Application started.....");
		SpringApplication.run(JenkinsSpring1Application.class, args);
	}

}
