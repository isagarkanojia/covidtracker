package com.test.covidtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.covidtracker.modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
