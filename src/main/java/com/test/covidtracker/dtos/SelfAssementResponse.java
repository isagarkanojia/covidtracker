package com.test.covidtracker.dtos;

public class SelfAssementResponse {
	
	private Integer riskPercentage;
	

	public SelfAssementResponse(Integer riskPercentage) {
		super();
		this.riskPercentage = riskPercentage;
	}

	public Integer getRiskPercentage() {
		return riskPercentage;
	}

	public void setRiskPercentage(Integer riskPercentage) {
		this.riskPercentage = riskPercentage;
	}

	

}
