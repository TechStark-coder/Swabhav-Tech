/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Product {

	public int id;
	public String name;
	public double price;
	public float discount;

	public Product(int id, String name, double price, float discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public float getDiscount() {
		return discount;
	}

	public double CostAfterDiscount() {
		this.price -= this.discount;
		return this.price;
	}
//		if (price < total)
//			discount = (float) (total - price);

}