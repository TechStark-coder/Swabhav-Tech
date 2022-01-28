/**Copyright to customer-app by asif
All rights reserved.
*/
package com.odp.test;

import com.publisher.Account;

public class PubSubTest {
	public static void main(String[] args) {
		Account acc1 = new Account(100, "bablu", 10000);
		acc1.registerNotifier(new EmailNotifier());
		acc1.registerNotifier(new TelegramNotifier());
		acc1.deposit(5000);
//		printDetails(acc1);
	}

//	private static void printDetails(Account acc1) {
//		System.out.println("name is : " + acc1.getName());
//		System.out.println("accno is : " + acc1.getAccno());
//		System.out.println("balance is : " + acc1.getBalance());
//		
//	}

}
