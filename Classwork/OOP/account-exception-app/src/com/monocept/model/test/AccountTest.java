/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "abc", 1000);
		try {
			acc1.withdraw(1200);

		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
//			System.out.println("withdraw amount is greater than minimum balance....");

		} finally {
			printDetails(acc1);
//			System.out.println("withdraw amount is greater than minimum balance....");

		}
	}

	private static void printDetails(Account acc1) {
		System.out.println();
		System.out.println("Account number is : " + acc1.getaccno());
		System.out.println("Name is :" + acc1.getname());
		System.out.println("Balance is : " + acc1.getbalance());
	}
}
