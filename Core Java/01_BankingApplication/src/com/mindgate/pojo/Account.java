package com.mindgate.pojo;

 
 public  abstract class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accoutNumber, String Name, double balance) {
		this.accountNumber = accoutNumber;
		this.name = Name;
		this.balance = balance;

	}
	//withdraw

	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (balance > amount) {
				balance = balance - amount;
				return true;
			}
		}
		return false;

	}
	//deposit

	public boolean deposit(double amount) {
		if (amount > 0) {

			balance = balance + amount;
			return true;

		}
		return false;

	}

	// setter
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// getter
	public int getAccountNumber() {
		return accountNumber;

	}

	public void setName(String Name) {
		this.name = Name;

	}

	public String getName() {
		return name;

	}

	public void setBalance(double balance) {
		this.balance = balance;

	}

	public double getBalance() {
		return balance;

	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
