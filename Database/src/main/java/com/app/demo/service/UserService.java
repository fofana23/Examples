package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.model.User;
import com.app.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	public User getUserWithId(int id) {
		return userRepo.findById(id).get();
	}
	
	public User getUserWithEmail(String email) {
		return userRepo.findByEmail(email);
	}
	public User getUserWithFirstname(String firstname) {
		return userRepo.findByFirstname(firstname);
	}
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
}
