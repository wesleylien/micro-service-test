package com.lian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

	@Autowired
    RestTemplate restTemplate;
	
	public String ribbonServiceTest(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name,String.class);
    }
}
