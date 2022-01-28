/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

@SuppressWarnings("serial")
public class InsufficientFundException extends RuntimeException {
	public InsufficientFundException(Account a1, double amount) {
		super("acc no " + a1.getaccno() + "name" + a1.getname() + "baslance" + a1.getbalance() + "withdraw amount is ");
	}

}
