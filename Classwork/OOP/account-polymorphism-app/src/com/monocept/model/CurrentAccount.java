/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class CurrentAccount extends Account {

	private final double OVER_DRAFT_LIMIT = 10000;

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (this.balance - amount > OVER_DRAFT_LIMIT) {
			this.balance = amount;
			return;
		}
		System.out.println("withdraw  limit exceeded");
	}
}
//		} else {
//			this.balance -= amount;
//			System.out.println("withdraw was completed");
//		}
