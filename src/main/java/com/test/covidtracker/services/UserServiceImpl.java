package com.test.covidtracker.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.covidtracker.dtos.AdminResponse;
import com.test.covidtracker.dtos.CovidResultResponse;
import com.test.covidtracker.dtos.UpdateCovidResultRequest;
import com.test.covidtracker.dtos.UserRequest;
import com.test.covidtracker.dtos.UserResponse;
import com.test.covidtracker.modal.User;
import com.test.covidtracker.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public UserResponse register(UserRequest request) {

		User user = new User();

		BeanUtils.copyProperties(request, user, "isPositive", "isAdmin");

		user = userRepository.save(user);

		return new UserResponse(user.getId());

	}

	public AdminResponse registerAdmin(UserRequest request) {

		User user = new User();

		BeanUtils.copyProperties(request, user, "isPositive");

		user.setAdmin(true);
		user = userRepository.save(user);

		return new AdminResponse(user.getId());
	}

	public CovidResultResponse updateCovidResult(UpdateCovidResultRequest request) {

		String input = request.getResult();

		Optional<User> user = userRepository.findById(request.getUserId());

		if (user.isPresent()) {

			User u = user.get();

			if (input.equals("positive")) {
				u.setPositive(true);
			} else if (input.equals("negetive")) {
				u.setPositive(false);
			}

			userRepository.save(u);

		} else {
			// throw custom exception user not present
		}

		return new CovidResultResponse(true);
	}

}
