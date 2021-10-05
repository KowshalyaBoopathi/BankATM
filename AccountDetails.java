package com.bank;

import java.util.ArrayList;

public class AccountDetails {
	
	static ArrayList<Account> list;
	
	static {
		
		list = new ArrayList<Account>();
		Account a1 = new Account(612850360, 1234567890, 250);
		Account a2 = new Account(612850361, 1234567891, 350);
		Account a3 = new Account(612850362, 1234567892, 450);
		Account a4 = new Account(612850363, 1234567893, 250);
		Account a5 = new Account(612850364, 1234567894, 1000);
		Account a6 = new Account(612850365, 1234567895, 1250);
	
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		
	}
	
}
