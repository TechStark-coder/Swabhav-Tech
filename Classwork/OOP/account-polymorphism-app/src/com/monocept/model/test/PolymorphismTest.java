/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;

public class PolymorphismTest {
	public static void main(String args[]) {
		Account sa = new SavingsAccount(101, "abc", 5000);
		printDetails(sa, sa);
		System.out.println();
		Account ca = new CurrentAccount(200, "pqr", 3000);
		printDetails(ca, sa);
		System.out.println();
		ca.withdraw(17000);
		System.out.println(ca);
	}

//	Account sa = new Account(101,"kop",5000);
//	System.out.println(sa);
//	System.out.println(sa.toString());

	public static void printDetails(Account sa, Account ca) {
		System.out.println("Account number is : " + sa.getAccno());
		System.out.println("Name is : " + sa.getName());
		System.out.println("Balance is : " + sa.getBalance());
	}
}