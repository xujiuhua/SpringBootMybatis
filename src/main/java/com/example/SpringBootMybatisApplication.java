package com.example;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao")
public class SpringBootMybatisApplication {

	private static Logger logger = Logger.getLogger(SpringBootMybatisApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
		logger.info("===SpringBoot Start Success===");
	}
}
