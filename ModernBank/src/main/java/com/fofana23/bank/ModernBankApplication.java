package com.fofana23.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fofana23.bank.service.UserService;

@SpringBootApplication
public class BankApplicationimplements CommandLineRunner {
	
	@Autowired
	UserService service;
	public static void main(String[] args) { SpringApplication.run(BankApplication.class, args); }
		SpringApplication.run(ModernBankApplication.class, args);
	
		@Override
		public void run(String...strings args) throws Exception {
			AccountHolder masster = new AccountHolder();
			master.setAddress("1234 Street Rd");
			master.setDob("12/158/1999");
			master.setEmail("master@gmail.com");
			admin.setFirstname("Admin");
			admin.setPassword("Account");
			admin.setPassword("admin");
			admin.setSsn(987654321);
	}

}
