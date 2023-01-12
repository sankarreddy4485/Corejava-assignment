package com.assignment1;

public class Account {
	
	private int accountNumber;
	private String personName;
	private double balance;
	
	
	public Account(int accountNumber, String personName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.personName = personName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", personName=" + personName + ", balance=" + balance + "]";
	}
	

	
}
