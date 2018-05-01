package com.lian.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider-v1", fallback = FeignConsumerTestServiceFallbackImpl.class)
public interface FeignConsumerTestService {
	
	@RequestMapping(value = "/provider1test")
    String sayHiFromClientOne(@RequestParam(value = "param") String name);
}
