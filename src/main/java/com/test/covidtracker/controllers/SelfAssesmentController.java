package com.test.covidtracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.covidtracker.dtos.SelfAssementRequest;
import com.test.covidtracker.dtos.SelfAssementResponse;
import com.test.covidtracker.services.SelfAssesmentService;

@RestController
public class SelfAssesmentController {
	
	@Autowired
	private SelfAssesmentService selfAssesmentService;
	
	@PostMapping("self-assesment")
	public SelfAssementResponse riskAssesment(@RequestBody SelfAssementRequest request) {
		
		Integer percentage =selfAssesmentService.riskAssesment(request);
		
		return new SelfAssementResponse(percentage);
	}	


}
