/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model.test;

import java.util.ArrayList;

import com.monocept.model.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		ArrayList<LineItem> basket = new ArrayList<LineItem>();
		basket.add(new LineItem(101, "mobile", 2, 20000));
		basket.add(new LineItem(100, "headphone", 1, 5000));
//		basket.add("hello world");

//		ArrayList basket = new ArrayList();
//		basket.add(new LineItem(101, "mobile", 2, 20000));
//		basket.add(new LineItem(100, "headphone", 1, 5000));

		for (Object element : basket) {
			LineItem item = (LineItem) element;
			item.totalPrice();
			System.out.println("product name is  " + item.getProduct());
			System.out.println(item.getQuantity());
			System.out.println(item.getPrice());
		}
	}

}
