/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.srp.solution;

public class InvoiceConsolePrinter {
//	public static void main(String[] args) {
//
//	}

	public void displayInvoice(Invoice invoice) {
		System.out.println("discount prixe is ----" + invoice.calculateDicsountValue());
		System.out.println("tax is----" + invoice.calculateTax());
		System.out.println("total is ----" + invoice.calculateTotal());
	}

}
