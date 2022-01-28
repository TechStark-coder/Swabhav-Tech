/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String name;
	@SuppressWarnings("rawtypes")
	private List<Order> orders = new ArrayList<Order>();

	public Customer(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
	}

	public void addOrder(Order order) {
		this.orders.add(order);

	}

	public int orderCount() {
		return (this.orders.size());
//		return 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Order> calcualtionTotalCost() {
		double TotalCost = 0;
		return this.orders;
//		return TotalCost;

	}

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
}
