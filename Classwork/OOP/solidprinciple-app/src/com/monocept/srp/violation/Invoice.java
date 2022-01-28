/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.srp.violation;

public class Invoice {
	private int id;
	private String description;
	private double amount;
	private double discountPercentage;
	private int taxPercentage;

	public Invoice(int id, String description, double amount, float discountPercentage, int taxPercentage) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
		this.taxPercentage = taxPercentage;
	}

	public double calculateDicsountValue() {
		this.amount -= (amount / 20);
		return this.amount;
//		discountPercentage = (amount /= 100);
//		return amount;
	}

	public double calculateTax() {
		this.amount += (amount / 20);
		return this.amount;
	}

	public double calculateTotal() {
		return amount -= discountPercentage + taxPercentage;
	}

//	public void displayInvoice() {
//		System.out.println("discount prixe is ----" + calculateDicsountValue());
//		System.out.println("tax is----" + calculateTax());
//		System.out.println("total is ----" + calculateTotal());
//	}

}
