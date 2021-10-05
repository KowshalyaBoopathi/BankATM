package com.bank;

public class Account {
	
	private double MINIMUM_BALANCE = 100;
	private double balance;
	private int number;
	private int cardNumber;
	
	public Account(int number, int cardNumber, double balance) {
		super();
		this.balance = balance;
		this.number = number;
		this.cardNumber = cardNumber;
	}

	public double getMINIMUM_BALANCE() {
		return MINIMUM_BALANCE;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getNumber() {
		return number;
	}

	public int getCardNumber() {
		return cardNumber;
	}

}



/*boolean isValidTransaction(double balance,double amount) {
	double remainder=balance-amount;
	if(remainder>=MINIMUM_BALANCE)
		return true;
	else
		return false;	
}

abstract boolean isValidTransaction (double balance,double amount);

boolean isValidNumber (String str,String str1) {
	if(str1.equals(str))
		return true;
	else
		return false;
}

double deposit(double principle, int deposit) {
	double balance=principle+deposit;
return balance;
}

abstract double balance(double principle);*/