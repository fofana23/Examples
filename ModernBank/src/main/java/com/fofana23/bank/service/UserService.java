package com.fofana23.bank.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fofana23.bank.exception.BusinessException;
import com.fofana23.bank.model.Account;
import com.fofana23.bank.model.AccountHolder;
import com.fofana23.bank.repository.AccountHolderRepository;
import com.fofana23.bank.repository.AccountRepository;
import com.fofana23.bank.transaction.Profile;
import com.fofana23.bank.transaction.Transaction;

@Service
public class UserService {
	public static final String Checking = "checking";
	public static final String Saving = "saving";

	@Autowired
	AccountHolderRepository holderRepo;
	@Autowired
	AccountRepository accountRepo;

	public AccountHolder register(AccountHolder holder) {
		if (holder.getEmail() == null || holder.getSsn() < 100000000) {
			throw new BusinessException("Invalid request");
		}
		
		holder.setActiveDate(new Date().toString());
		holder.setCreditScore(creditCheck());
		AccountHolder newHolder = holderRepo.save(holder);
		Account checking = new Account(null, "checking", false, 0.0, newHolder);
		Account saving = new Account(null, "saving", false, 0.0, newHolder);
		List<Account> defaultAccounts = List.of(checking, saving);
		accountRepo.saveAll(defaultAccounts);

		return holderRepo.findByEmail(holder.getEmail());
	}

	public AccountHolder addAccount(Transaction transaction, boolean isCreditCard) {
		AccountHolder holder = holderRepo.getOne(transaction.getHolderId());
		Account newAccount = new Account(null, transaction.getAccountName(), false, 0.0, holder);
		if (isCreditCard) {
			if (creditCheck() < 600) {
				throw new BusinessException("Rejected: credit score is too low");
			}
			newAccount.setCredit(isCreditCard);
		}
		accountRepo.save(newAccount);
		return holderRepo.getOne(transaction.getHolderId());
	}

	public AccountHolder login(Profile profile) {
		AccountHolder holder = holderRepo.findByEmail(profile.getEmail());
		if (holder == null) {
			throw new BusinessException("No accounts found with email");
		} else if (!holder.getPassword().equals(profile.getPassword())) {
			throw new BusinessException("Invalid credentials");
		}
		return holder;

	}

	public AccountHolder editProfile(Profile profile) {
		AccountHolder holder = holderRepo.findByEmail(profile.getEmail());
		holder.setAddress(profile.getAddress());
		holder.setDob(profile.getDob());
		holder.setFirstname(profile.getFirstname());
		holder.setLastname(profile.getLastname());
		holder.setEmail(profile.getEmail());
		holder.setPassword(profile.getPassword());
		return holderRepo.save(holder);
	}

	public AccountHolder processTransaction(Transaction transaction, String type) {
		AccountHolder holder = holderRepo.getOne(transaction.getHolderId());
		List<Account> accounts = new ArrayList<>();
		
		switch (type) {
		case "Deposit":
			holder.getAccounts().stream().forEach(account -> {
				if(account.getName().equals(transaction.getAccountName())) {
					double amount = account.getBalance() + transaction.getAmount();
					account.setBalance(amount);
				}
				accounts.add(account);
			});
			break;
			case "Withdraw":
				holder.getAccounts().stream().forEach(account -> {
					if(account.getName().equals(transaction.getAccountName())) {
						double amount = account.getBalance() - transaction.getAmount();
						account.setBalance(amount);
					}
					accounts.add(account);
				});
			break;
		}
			
		accountRepo.saveAll(accounts);
		return holderRepo.getOne(transaction.getHolderId());
	}
	
	private int creditCheck() {
		Random random = new Random();
		int upperbound = 800;
		int lowerbound = 500;
		int range = upperbound - lowerbound;
		return random.nextInt(upperbound);
	}
	public AccountHolder processTransfer(Transaction transaction) {
		
	}
}