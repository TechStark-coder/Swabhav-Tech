/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a1 = new Account(100,"abc",1000);
		printDetails(a1);
		
		a1.withdraw(600);
	}

	private static void printDetails(Account a1) {
		System.out.println("Account number : " + a1.getaccno());
		System.out.println("name is : " + a1.getname());
		System.out.println("balaa=nce is  : " +  a1.getbalance());
		
	}

}
