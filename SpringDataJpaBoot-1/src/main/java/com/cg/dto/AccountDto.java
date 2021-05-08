package com.cg.dto;

public class AccountDto {
	private String customerName;
	private Double balance;
	public AccountDto(String accountName, Double balance) {
		super();
		this.customerName = accountName;
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String accountName) {
		this.customerName = accountName;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	

}
