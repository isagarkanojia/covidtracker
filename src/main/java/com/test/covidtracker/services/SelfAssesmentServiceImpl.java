package com.test.covidtracker.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.test.covidtracker.dtos.SelfAssementRequest;

@Service
public class SelfAssesmentServiceImpl implements SelfAssesmentService {


	@Override
	public Integer riskAssesment(SelfAssementRequest request) {
		
		Set<String> sysptoms=request.getSymptoms();
		
		boolean travelHistory=request.isTravelHistory();
		
		boolean covidContact=request.isContactWithCovidPatient();
		
		if(sysptoms.size()>2) {
			return 95;
		}else if(sysptoms.size()==2 && travelHistory && covidContact) {
			return 75;
		}else if(sysptoms.size()==1 && travelHistory && covidContact ) {
			return 50;
		}else  {
			return 5;
		}

	}


}
