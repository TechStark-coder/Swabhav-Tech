/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.item;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<IItem> items = new ArrayList<IItem>();

	public void addItem(IItem item) {
		items.add(item);
	}

	public void removeItem(IItem ri) {
		for (IItem i : items) {
			if (i == ri) {
				items.remove(i);
			}
		}
	}

	public void totalPrice(double amt) {

	}

}
