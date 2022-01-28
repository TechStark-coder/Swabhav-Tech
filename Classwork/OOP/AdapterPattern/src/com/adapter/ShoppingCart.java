/**Copyright to customer-app by asif
All rights reserved.
*/
package com.adapter;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	@SuppressWarnings("unused")
//	private List<Item> item;

	public ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item itms) {
		items.add(itms);
	}

	public void removeItem(Item i) {
		for (Item itms : items) {
			if (itms == i) {
				items.remove(i);
			}

		}
	}

	public void totalPrice(Item items) {
	}

}
