package com.sdi.test.spring.cloud.distribution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdi.test.spring.cloud.api.model.Line;
import com.sdi.test.spring.cloud.distribution.service.IReferentialClient;

@RestController
@RequestMapping("/referential")
public class ReferentialDistributionController {
	
	@Autowired
	private IReferentialClient referentialClient;
	
	@GetMapping("/lines")
	public List<Line> getLines() {
		return referentialClient.getLines();
	}
}
