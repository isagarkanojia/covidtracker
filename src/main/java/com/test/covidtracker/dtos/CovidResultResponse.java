package com.test.covidtracker.dtos;

public class CovidResultResponse {
	
	private boolean update;
	
	public CovidResultResponse(boolean update) {
		super();
		this.update = update;
	}

	public boolean isUpdate() {
		return update;
	}

	public void setUpdate(boolean update) {
		this.update = update;
	}
	
	
	

	
	
}
