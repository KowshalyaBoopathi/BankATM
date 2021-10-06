package com.bank;

import java.util.Iterator;

public class CashDispense {
	
	boolean dispenseCash(ATMCard obj) {
		if(obj.amount%5==0)
			return true;
		else
			System.out.println("Please correct the amount of value. It should be multiple of USD 5"
					+ "");
		return false;
	}
	
	double chargedAmount(ATMCard obj) {
		if(obj.amount > 100) {
			obj.charges=(0.04*obj.amount);
			return obj.charges;
		}
		else {
			obj.charges=(0.02*obj.amount);
			return obj.charges;
		}
	}
	
	double balance(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator(); 
		  while(itr.hasNext()){  
			    Account acc=(Account)itr.next();
				if(obj.cardNumber==acc.getCardNumber()) {
					obj.balance=acc.getBalance()-obj.amount-obj.charges;
					return obj.balance;
				}
		  }
		  return obj.balance;
	}
	
	double isValidTransaction(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator(); 
		  while(itr.hasNext()){  
			    Account acc=(Account)itr.next();
					if(obj.balance >= acc.getMINIMUM_BALANCE()) {
						acc.setBalance(obj.balance);
						return 1;
					}
					else
						return 0;
				}	
		return 0;
	}
}

