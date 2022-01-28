package src.com.monocept.model;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.*;

public class Account {
	private int accno;
	private String name;
	double balance;

	public Account(int paccno, String pname, int balance) {
		this.accno = paccno;
		this.name = pname;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return accno + " " + name + " " + balance + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		Account acc1 = (Account) obj;
		if (this == acc1) {
			return true;
		}
		return this.accno == acc1.accno && this.name == acc1.name && this.balance == acc1.balance;

	}

	public int getaccno() {
		return accno;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public String getname() {
		return name;
	}

	public double getbalance() {
		return balance;
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}

	public ArrayList<String> getTransactionDetails() {
		LocalDateTime d = LocalDateTime.now();
		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("dd - MM - yyyy");
		@SuppressWarnings("unused")
		String dateTime = d.format(d1);
//		System.out.println("withdraw is -----" + getTransactionDetails());
		return getTransactionDetails();
	}
}