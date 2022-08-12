package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
static Logger logger= LoggerFactory.getLogger(DemoApplication.class);
@PostConstruct
public void test()
	{
logger.info("App Started");
	}
	public static void main(String[] args) {
		logger.info("App Started");
		SpringApplication.run(DemoApplication.class, args);
	}

}
