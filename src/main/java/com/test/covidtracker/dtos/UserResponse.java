package com.test.covidtracker.dtos;

public class UserResponse {
	
	private Integer userId;
	
	

	public UserResponse(Integer userId) {
		super();
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	

	
	
}
