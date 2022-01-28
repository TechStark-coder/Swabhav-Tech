/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.unit.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class CustomerTest {

	@Test
	public void testAddItem() {
		Product product = new Product(10, "Milk", 100, 25f);
		LineItem item = new LineItem(11, product, 3);
//		Order order = new Order<DateTime, List>(12, (25-10-2021));
		Order.addItem(item);
		List<Order> orderList = new ArrayList<Order>();
		int expectedOrdersCount = 0;

		Customer cust = new Customer(10, "nick");
		assertEquals(expectedOrdersCount, cust.orderCount());
		expectedOrdersCount = 1;

	}

	@Test
	public void testConstructor() {
		Customer cust = new Customer(10, "nick");
		int expectedId = 10;
		String expectedName = "nick";
		assertEquals(expectedId, cust.getId());
		assertEquals(expectedName, cust.getName());
	}

}
