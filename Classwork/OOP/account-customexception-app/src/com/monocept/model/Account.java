/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Account {
	private int accno;
	private String name;
	double balance;

	public Account(int paccno, String pname, int balance) {
		this.accno = paccno;
		this.name = pname;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		this.balance = check(amount, this.balance);
	}

	private double check(double amount, double balance) {
		if (this.balance > balance) {
			return (balance - amount);
		}
		return balance;
	}

//		} else {
//			throw new RuntimeException(this.accno + " " + this.name + " " + this.balance + "\n"
//					+ "Withdrawal amount is : " + amount + "\n" + "Minimum balance is exceeded");
//		}
//	}

	public int getaccno() {
		return accno;
	}

	public String getname() {
		return name;
	}

	public double getbalance() {
		return balance;
	}

}