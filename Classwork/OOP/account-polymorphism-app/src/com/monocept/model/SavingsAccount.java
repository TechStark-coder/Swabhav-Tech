/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class SavingsAccount extends Account{
	
	public SavingsAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if(this.balance - amount > 5000) {
			this.balance = amount;
		}
		// TODO Auto-generated method stub
		
	}
	
}