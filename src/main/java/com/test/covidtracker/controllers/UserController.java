package com.test.covidtracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.covidtracker.dtos.AdminResponse;
import com.test.covidtracker.dtos.CovidResultResponse;
import com.test.covidtracker.dtos.UpdateCovidResultRequest;
import com.test.covidtracker.dtos.UserRequest;
import com.test.covidtracker.dtos.UserResponse;
import com.test.covidtracker.services.UserServiceImpl;

@RestController("users")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;

	@PostMapping("register-user")
	public UserResponse registerUser(@RequestBody UserRequest request) {
		
		return userService.register(request);
		
	}
	
	@PostMapping("register-admin")
	public AdminResponse registerAdmin(@RequestBody UserRequest request) {
		
		return userService.registerAdmin(request);
		
	}
	
	@PutMapping("update-covid-result")
	public CovidResultResponse updateCovidResult(@RequestBody UpdateCovidResultRequest request) {
		
		return userService.updateCovidResult(request);
	}

	

}
