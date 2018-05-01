package com.lian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Provider1TestController {
	
	@Value("${server.port}")
	private String port;

	@RequestMapping("/provider1test")
	public String provider1test(String param) {
		return " Provider 1 from " + port + ": " + param;
	}
}
