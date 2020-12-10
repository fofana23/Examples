package com.fofana23.bank.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fofana23.bank.model.AccountHolder;
import com.fofana23.bank.transaction.Profile;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class UserController {

		@PostMapping("register")
		public AccountHolder register(@RequestBody AccountHolder holder) {
			return service.register(holder);
		}
		@PostMapping("login")
		public AccountHolder login(@RequestBody Profile profile) {
			return service.login(profile);
		}
		@PostMapping("login")
		public AccountHolder login(@RequestBody Profile profile) {
			return service.login(profile);
		}
		@PutMapping("edit")
		public AccountHolder editProfile(@RequestBody Profile profile) {
			return service.editProfile(profile)
					
		}
		@PutMapping("edit")
		public AccountHolder editProfile(@RequestBody Profile profile) {
			return service.editProfile(profile)
}
