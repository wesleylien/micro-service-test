package com.lian.service;

import org.springframework.stereotype.Service;

@Service
public class FeignConsumerTestServiceFallbackImpl implements FeignConsumerTestService {

	@Override
	public String sayHiFromClientOne(String name) {
		return " Error: Provider1 Fallback: " + name;
	}

}
