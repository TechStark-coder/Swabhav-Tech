/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public abstract class Account {
	private int accno;
	private String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
//		if (this.balance - amount > OVER_DRAFT_LIMIT) {
//			this.balance = amount;
	}
}