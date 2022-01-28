/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class LineItem {
	private int id;
	private Product product;
	private int Quantity;

	public LineItem(int id, Product product, int Quantity) {
//		super();
		this.id = id;
		this.product = product;
		this.Quantity = Quantity;
	}

	public double CalculateLineItemCost() {
		return (this.product.CostAfterDiscount() * Quantity);
//		if ((id *= Quantity) >= Quantity) {
//			return (id - Quantity);
//		}
//		return total;
	}
//		if (id *= Quantity)
//			total = (product * id);
//		return total;
//	}

	public int getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return Quantity;
	}

}
