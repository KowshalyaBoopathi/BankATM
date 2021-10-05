package com.bank;

import java.util.*;

public class ATMCard {
	
	int number, cardNumber, amount;
	double balance, charges;
	
	public static void main(String[] args) {

		
		ATMCard atmaccount;
		Operation acc;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("Please select an option");
		System.out.println("1 -> Deposit");
		System.out.println("2 -> Balance");
		System.out.println("3 -> Cash Withdrawal");
		System.out.println("4 -> Swipe");
		System.out.println("5 -> Cancel");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			
			System.out.println("Enter the account number");
			atmaccount = new ATMCard();
			atmaccount.number = sc.nextInt();
			
			//validate account number
			
			acc = new Operation();
			
			if(acc.isValidAccount(atmaccount)) {
				System.out.println("Enter the amount to be deposited");
				atmaccount.amount = sc.nextInt();
				atmaccount.balance = acc.deposit(atmaccount);
			}
			else
				System.out.println("Enter valid account number");
			
			break;
		case 2:
			
			System.out.println("Enter the account number");
			atmaccount = new ATMCard();
			atmaccount.number = sc.nextInt();
			
			acc = new Operation();

			if(acc.isValidAccount(atmaccount)) {
				atmaccount.balance=acc.balanceCheck(atmaccount);
				System.out.println("Balance USD "+atmaccount.balance);
			}
			else
				System.out.println("Enter valid account number");
			break;
		case 3:
			
			atmaccount = new ATMCard();

			System.out.println("Enter the ATM Card Number");
			atmaccount.cardNumber = sc.nextInt();
			
			CashDispense cash = new CashDispense();
			//validate card number
			
			acc = new Operation();
			
			if(acc.isValidCard(atmaccount)) {
				System.out.println("Enter amount to withdraw");
				atmaccount.amount = sc.nextInt();
				
				if(cash.dispenseCash(atmaccount)) {
					atmaccount.charges=cash.chargedAmount(atmaccount);
					atmaccount.balance=cash.balance(atmaccount);
					
					if(cash.isValidTransaction(atmaccount)==1) {
						System.out.println("Charges USD "+atmaccount.charges);
						System.out.println("Balance USD "+atmaccount.balance);
					}
					else
						System.out.println("Insufficient minimum balance");
				}
			}
			else
				System.out.println("Enter valid card number");
			
			//Account a5 = new Account(34, 894, 1000);

			break;
		case 4:
			
			atmaccount = new ATMCard();

			System.out.println("Enter the ATM Card Number");
			atmaccount.cardNumber = sc.nextInt();
			
			SwipeShopping shop = new SwipeShopping();
			//validate card number
			
			acc = new Operation();
			
			if(acc.isValidCard(atmaccount)) {
				System.out.println("Enter amount to swipe");
				atmaccount.amount = sc.nextInt();
				
					atmaccount.charges=shop.cashBack(atmaccount);
					atmaccount.balance=shop.balance(atmaccount);
					
					if(shop.isValidTransaction(atmaccount)==1) {
						System.out.println("Charges USD "+atmaccount.charges);
						System.out.println("Balance USD "+atmaccount.balance);
					}
					else
						System.out.println("Insufficient minimum balance");
			}
			else
				System.out.println("Enter valid card number");
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Please select a valid option");	
		}
		}
	}
}

/*double principle, balance, minimumBalance = 0;
		
		Scanner sc=new Scanner(System.in);
		
		//Create object for all cases here using down casting 
		
		Account account = new CashDispense();
		CashDispense cash=(CashDispense)account;
		
		Account account1 = new SwipeShopping();
		SwipeShopping shop=(SwipeShopping)account1;
		
		//loop to run the program continuously
		
		while(true) {
		
		System.out.println("Please select an option");
		System.out.println("1 -> Deposit");
		System.out.println("2 -> Balance");
		System.out.println("3 -> Cash Withdrawal");
		System.out.println("4 -> Swipe");
		System.out.println("5 -> Cancel");
		
		int choice=sc.nextInt();switch(choice) {
		
		case 1:
			
			principle=Account.getBalance();
			
			System.out.println("Deposit ");
			int deposit = sc.nextInt();
			
			balance=cash.deposit(principle, deposit);
			Account.setBalance(balance);
			System.out.println("Balance USD "+balance);
			
			break;
		case 2:

			balance=Account.getBalance();//any class type is fine
			System.out.println("Balance USD "+balance);
			
			break;
		case 3:
	
			System.out.println("Enter your ATM card Number");
			int number=sc.nextInt();
			
			String str=Integer.toString(number);
			String str1=Account.getNumber();
			
			if(cash.isValidNumber(str,str1)) {
			
			principle=Account.getBalance();
			minimumBalance=Account.getMINIMUM_BALANCE();
			
			System.out.println("Enter amount");
			int amount=sc.nextInt();

			if(cash.dispenseCash(amount)) {
				double charges=cash.chargedAmount(amount);
				balance=cash.balance(principle,amount,charges);
				
				if(cash.isValidTransaction(balance, minimumBalance)) {
					System.out.println("Charges USD "+charges);
					Account.setBalance(balance);
					System.out.println("Balance USD "+balance);	
				}
				else 
					System.out.println("Insufficient Minimum Balance");			
			}
			}
			else
				System.out.println("Invlaid Card NUmber");
			break;
		case 4:
			
			System.out.println("Enter your ATM card Number");
			number=sc.nextInt();
			
			str=Integer.toString(number);
			str1=Account.getNumber();
			
			if(shop.isValidNumber(str,str1)) {
			
			principle=Account.getBalance();
			
			System.out.println("Enter amount");
			int amount1=sc.nextInt();

			double cashback=shop.cashBack(amount1);
			balance=shop.balance(principle, amount1, cashback);
			
			if(shop.isValidTransaction(balance, minimumBalance)) {
				System.out.println("Cashback USD "+cashback);
				Account.setBalance(balance);
				System.out.println("Balance USD "+balance);
			}
			else
				System.out.println("Insufficient Minimum Balance");	
			}
			else
				System.out.println("Invlaid Card NUmber");
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Please select a valid option");	
		}
		}*/






