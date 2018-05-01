package com.lian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication   // 包含 @SpringBootConfiguration、@EnableAutoConfiguration、@ComponentScan
@EnableDiscoveryClient	 // eureka client
//@EnableTurbine			 // turbine
@EnableTurbineStream		 // turbine stream
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
