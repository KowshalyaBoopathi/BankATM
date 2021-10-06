package com.bank;

import java.util.*;

public class Operation {
	
	double deposit(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator(); 
		  while(itr.hasNext()){  
			    Account acc=(Account)itr.next();
				if(obj.number==acc.getNumber()) {
					obj.balance=obj.amount+acc.getBalance();
					acc.setBalance(obj.balance);
				}
		  }
		System.out.println("Balance USD "+obj.balance);
		  return obj.balance;
	}
	
	double balanceCheck(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator(); 
		  while(itr.hasNext()){  
			    Account acc=(Account)itr.next();
				  return acc.getBalance();
		  }
		System.out.println("Balance USD "+obj.balance);
		  return obj.balance;
	}
	
	boolean isValidAccount(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator();  
		  while(itr.hasNext()){  
		    Account acc=(Account)itr.next();
		    if(obj.number==acc.getNumber())
		    	return true;
	}
		return false;
	}
	
	boolean isValidCard(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator();  
		  while(itr.hasNext()){  
		    Account acc=(Account)itr.next();
		    if(obj.cardNumber==acc.getCardNumber())
		    	return true;
	}
		return false;
	}
}
