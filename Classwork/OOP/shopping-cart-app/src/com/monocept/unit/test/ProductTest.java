/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.unit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.Result;

import com.monocept.model.LineItem;
import com.monocept.model.Product;

public class ProductTest {
	@Test
	public void testingConstructors() {
		int expectedid = 10;
		String expectedName = "milk";
		double expectedprice = 50d;
		float expecteddiscount = 25;
		Product p1 = new Product(10, "milk", 50d, 25f);
		String result = p1.getName();
//		p1.getPrice();
		assertEquals(expectedName, result);
//		assertEquals(expectedprice, result);

	}

//
	@SuppressWarnings("deprecation")
	@Test
	public void testingGetters() {
		int id = 10;
		String Name = "milk";
		double price = 50d;
		float discount = 25;
		Product p1 = new Product(10, "milk", 50d, 25);
		int result = p1.getId();
		assertEquals(id, result);
	}

//	@Test
//	public void testConstructors() {
//		int expectedid = 3;
//		int expectedquantity = 5;
//		String expectedProduct = "Honey";
//
//		LineItem l = new LineItem(3, "Honey", 5);
//		int Result = l.getQuantity();
//		assertEquals(expectedquantity, Result);
//
//		int Resultt = l.getId();
//		assertEquals(expectedid, Resultt);
//
//		String Resulttt = l.getProduct();
//		assertEquals(expectedProduct, Resulttt);
//
//	}
	
	@Test
	public void costAfterDiscount() {
		Product p1 = new Product(10, "milk", 50d, 25f);
		double expectedCost =-25.0f;
//		assertEquals(expectedCost, p1.CostAfterDiscount());
		
	}
}
