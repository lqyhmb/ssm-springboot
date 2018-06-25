package com.lqy.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lqy.ssm.dao")
public class SsmSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmSpringbootApplication.class, args);
	}
}
