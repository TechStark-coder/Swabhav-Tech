/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Account {
	private int accno;
	private String name;
	private double balance;

	public Account(int accno, String name, double balance) {
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}

	public int getAccno() {
		return this.accno;
	}

	public String getAccname() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}
	public void withdraw(double amt) {
		if (balance-amt > 500) {
			balance=balance-amt;
			return;
		}
	}

}
