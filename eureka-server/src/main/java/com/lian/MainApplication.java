package com.lian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication		// 包含 @SpringBootConfiguration、@EnableAutoConfiguration、@ComponentScan
@EnableEurekaServer			// 启动作为 eureka server 
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
