package com.test.covidtracker.services;

import com.test.covidtracker.dtos.SelfAssementRequest;

public interface SelfAssesmentService {

	Integer riskAssesment(SelfAssementRequest request);


}
