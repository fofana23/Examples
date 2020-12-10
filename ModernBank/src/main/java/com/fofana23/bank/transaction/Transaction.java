package com.fofana23.bank.transaction;

public class Transaction {
	
	private Integer holderId;
	private Integer accountNumber;
	private String accountName;
	private Double amount;
	private Boolean credit;
	private String receiverEmail;
	public Integer getHolderId() {
		return holderId;
	}
	public void setHolderId(Integer holderId) {
		this.holderId = holderId;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

}
