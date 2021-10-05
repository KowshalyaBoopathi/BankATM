package com.bank;

import java.util.Iterator;

public class SwipeShopping {
	
	double cashBack(ATMCard obj) {
			obj.charges=(0.01*obj.amount);
			return obj.charges;
	}
	
	double balance(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator(); 
		  while(itr.hasNext()){  
			    Account acc=(Account)itr.next();
				if(obj.cardNumber==acc.getCardNumber())
					obj.balance=acc.getBalance()-obj.amount+obj.charges;
		  }
		  return obj.balance;
	}
	
	double isValidTransaction(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator(); 
		  while(itr.hasNext()){  
			    Account acc=(Account)itr.next();
				if(obj.cardNumber==acc.getCardNumber()) {
					if(obj.balance >= acc.getMINIMUM_BALANCE()) {
						acc.setBalance(obj.balance);
						return 1;
					}
					else
						return 0;
				}	
		  }
		return 0;
	}
	
}

