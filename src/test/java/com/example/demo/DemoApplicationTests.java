package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	static Logger logger= LoggerFactory.getLogger(DemoApplication.class);

	@Test
	void contextLoads() {
		logger.info("Jenkins Test is  Running");

	}

}
