package com.fofana23.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "number")
SequenceGenerator(name = "sequence", initialValue = 10010000)
public class Account {

	public Account(Integer number, String name, boolean credit, Double balance, AccountHolder holder) {
		super();
		this.number = number;
		this.name = name;
		this.credit = credit;
		this.balance = balance;
		this.holder = holder;
	}

	public Account() {
		super();
	}

	@Id
	private Integer number;
	private String name;
	private boolean credit;
	private Double balance;
	@ManyToOne
	private AccountHolder holder;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCredit() {
		return credit;
	}

	public void setCredit(boolean credit) {
		this.credit = credit;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public AccountHolder getHolder() {
		return holder;
	}

	public void setHolder(AccountHolder holder) {
		this.holder = holder;
	}

}
