package com.test.covidtracker.services;

import com.test.covidtracker.dtos.UserRequest;
import com.test.covidtracker.dtos.UserResponse;

public interface UserService {

	public UserResponse register(UserRequest request);
	
}
