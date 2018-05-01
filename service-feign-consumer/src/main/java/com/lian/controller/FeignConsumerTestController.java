package com.lian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lian.service.FeignConsumerTestService;

@RestController
public class FeignConsumerTestController {

	@Autowired
	private FeignConsumerTestService feignConsumerTestService;
	
	@RequestMapping("/feigntest")
	public String feignConsumerTest(String param) {
		return "feign: " + feignConsumerTestService.sayHiFromClientOne(param);
	}
}
