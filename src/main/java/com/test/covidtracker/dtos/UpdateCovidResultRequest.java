package com.test.covidtracker.dtos;

import org.springframework.lang.NonNull;

public class UpdateCovidResultRequest {
	
	@NonNull
	private Integer userId;
	
	@NonNull
	private Integer adminId;
	
	@NonNull
	private String result;
	
	

	public UpdateCovidResultRequest(Integer userId) {
		super();
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	

	
}
