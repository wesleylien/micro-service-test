package com.lian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication   // 包含 @SpringBootConfiguration、@EnableAutoConfiguration、@ComponentScan
@EnableDiscoveryClient	 // eureka client
@EnableFeignClients		 // feign
@EnableCircuitBreaker	 // hystrix
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
