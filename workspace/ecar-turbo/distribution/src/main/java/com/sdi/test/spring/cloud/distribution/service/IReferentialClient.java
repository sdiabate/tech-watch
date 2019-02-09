package com.sdi.test.spring.cloud.distribution.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sdi.test.spring.cloud.api.model.Line;

@FeignClient(name = "acquisition")
public interface IReferentialClient {
	
	@GetMapping("/referential/lines")
	List<Line> getLines();
}
