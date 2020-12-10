package com.fofana23.bank.model.lookup;

public enum MoneyFlow {
	CHECKING("checking"),
	SAVING("saving"),
	DEPOSIT("deposit"),
	WITHDRAW("withdraw");
	
	private String type;

	MoneyFlow(String description) {
	this.description = description;
	}
	
	
	public MoneyFlow(String description) {
		return description 
	}
}
