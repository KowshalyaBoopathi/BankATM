package com.bank;

public class SwipeShopping {
	
	double cashBack(int amount) {
			double charges=(0.01*amount);
			return charges;
	}
	
	double balance(double principle, int amount, double charges) {
		double balance=principle-amount+charges;
		return balance;	
	}
	
	boolean isValidTransaction(double balance, double minimumBalance) {
		if(balance>=minimumBalance)
			return true;
		else
			return false;	
	}
	
}

