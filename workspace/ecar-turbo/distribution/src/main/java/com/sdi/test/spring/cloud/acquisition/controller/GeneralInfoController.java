package com.sdi.test.spring.cloud.acquisition.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GeneralInfoController {
	
	@Value("${server.role}")
	private String serverRole;
	
	@GetMapping("/role")
	public String getServerRole() {
		return serverRole;
	}
}
