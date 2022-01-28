/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class LineItem {
	public int id;
	public String product;
	public double price;
	public int quantity;

	public LineItem(int id, String product, double price, int quantity) {
		this.id = id;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	public int getid() {
		return id;
	}

	public String getProduct() {
		return product;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void totalPrice() {
		this.price *= quantity;
	}

//	public String quantity() {
//		(this.product + this.quantity);
//	}

}
