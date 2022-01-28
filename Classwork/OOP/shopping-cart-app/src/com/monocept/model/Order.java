/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Order<DateTime, List> {

	public int id;
	public DateTime date;
	public double orderItems;

	public Order(int id, DateTime date) {
//		super();
		this.id = id;
		this.date = date;
//		this.orderItems = orderItems;
	}

	public static void addItem(LineItem item) {
		return;
	}

	public void itemCount() {

	}

	public double checkOutCost(double total) {
		if ((total = orderItems) >= 50) {
			total = (float) (total - id);
			return total;
		}
		return total;
	}

	public int getId() {
		return id;
	}

	public DateTime getDate() {
		return date;
	}

	public double getOrderitems() {
		return orderItems;
	}

//	public void setOrderitems(List orderitems) {
//		this.orderitems = orderitems;
//	}
//
//	public void setDate(DateTime date) {
//		this.date = date;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

}
