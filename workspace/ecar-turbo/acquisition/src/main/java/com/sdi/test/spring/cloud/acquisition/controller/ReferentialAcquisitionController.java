package com.sdi.test.spring.cloud.acquisition.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.sdi.test.spring.cloud.api.model.Line;

@RestController
@RequestMapping("/referential")
public class ReferentialAcquisitionController {
	
	@GetMapping("/lines")
	public List<Line> getLines() {
		return createLines();
	}
	
	private List<Line> createLines() {
		return Lists.newArrayList(new Line("1", "Aix-Marseille-Autoroute"),  new Line("2", "Aix-Gare-TGV"));
	}
}
