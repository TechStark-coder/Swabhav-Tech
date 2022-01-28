/**Copyright to customer-app by asif
All rights reserved.
*/
package com.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	@SuppressWarnings("unused")
	private List<INotifier> subscribers;
	private int accno;
	private String name;
	private double balance;
	ArrayList<INotifier> notify = new ArrayList<INotifier>();

	public Account(int accno, String name, double balance) {
//		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
		notify("deposit succesfull");
//		System.out.println("deposit succesfull");
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		notify("withdraw successfull");
//		System.out.println("withdraw successfull");
	}

	public void registerNotifier(INotifier notifier) {
		notify.add(notifier);
	}

	public void notify(String msg) {
		for (INotifier notifier : notify) {
			notifier.sendNotification(msg);
		}
	}
}
