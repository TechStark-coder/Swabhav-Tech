package com.monocept.TestAccount;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String args[]) {
		Account acc1 = new Account(1001, "Faisal", 1000);
		Account acc2 = new Account(2001, "ankit", 2000);
		printDetails(acc1, acc2);

		acc1.withdraw(500);
		System.out.println("withdraw amount is --------> " + acc1.getbalance());
//		System.out.println();
		acc1.deposit(2000);
		System.out.println("deposited amount is ------> " + acc1.getbalance());
		LocalDateTime d1 = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\nE\ndd - MM - yyyy\nhh:mm:ss");
		String dateTime = dtf.format(d1);
		System.out.println("transaction details are..... " + dateTime);
		
		
		System.out.println();
		
//		acc2.withdraw(1000);
//		System.out.println("withdraw amount is --------> " + acc1.getbalance());
//		acc2.deposit(5000);
//		System.out.println("deposited amount is ------> " + acc1.getbalance());
//		LocalDateTime d11 = LocalDateTime.now();
//		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("\nE\ndd - MM - yyyy\nhh:mm:ss");
//		String dateTime1 = dtf1.format(d11);
//		System.out.println("transaction details are..... " + dateTime1);
	}

	public static void printDetails(Account acc1, Account acc2) {
		System.out.println("Account number is : " + acc1.getaccno());
		System.out.println("Name is :" + acc1.getname());
		System.out.println("Initial Balance is : " + acc1.getbalance());
	}

}
