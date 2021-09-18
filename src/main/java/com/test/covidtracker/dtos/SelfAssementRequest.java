package com.test.covidtracker.dtos;

import java.util.Set;

import org.springframework.lang.NonNull;

public class SelfAssementRequest {
	
	@NonNull
	private Integer userId;
	
	@NonNull
	private Set<String> symptoms;
	
	private boolean travelHistory;
	
	private boolean contactWithCovidPatient;

	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Set<String> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(Set<String> symptoms) {
		this.symptoms = symptoms;
	}

	public boolean isTravelHistory() {
		return travelHistory;
	}

	public void setTravelHistory(boolean travelHistory) {
		this.travelHistory = travelHistory;
	}

	public boolean isContactWithCovidPatient() {
		return contactWithCovidPatient;
	}

	public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
		this.contactWithCovidPatient = contactWithCovidPatient;
	}
	

}
