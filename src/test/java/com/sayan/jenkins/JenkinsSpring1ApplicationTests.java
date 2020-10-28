package com.sayan.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSpring1ApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(JenkinsSpring1ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Application Test started");
		assertEquals(true, true);
	}

}
