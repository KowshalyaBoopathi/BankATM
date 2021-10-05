package com.bank;

import java.util.*;

public class Operation {
	
	double deposit(double principle, int deposit) {
		double balance=principle+deposit;
	return balance;
	}
	
	boolean isValidAccount(ATMCard obj) {
		Iterator<Account> itr = AccountDetails.list.iterator();  
		  while(itr.hasNext()){  
		    Account st=(Account)itr.next();
		if(obj.number==st.getNumber())
			return true;
	}
		return false;
	}
}
