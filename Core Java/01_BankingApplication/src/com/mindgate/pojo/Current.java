package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {

	}

	public Current(int accoutNumber, String Name, double balance, double overdraftBalance) {
		super(accoutNumber, Name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount <= getBalance() && getBalance() > 0) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && amount > getBalance() && amount < getBalance() + overdraftBalance) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftBalance = overdraftBalance - amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {

		if (amount > 0) {
			if (overdraftBalance < initialOverdraftBalance) {
				double differnce = initialOverdraftBalance - overdraftBalance;
				if (differnce < amount) {
					amount = amount - differnce;
					overdraftBalance = initialOverdraftBalance;
					setBalance(getBalance() + amount);
					return true;
				} else {
					overdraftBalance = overdraftBalance + amount;
					return true;
				}
			}

			else {
				setBalance(getBalance() + amount);
				return true;

			}
		}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

}
