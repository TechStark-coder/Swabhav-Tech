/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.item.test;

import com.monocept.item.HatAdapter;
import com.monocept.item.ShoppingCart;

import hat.model.Hat;

public class AdapterTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new HatAdapter(new Hat("remote", "tv and ac remote", 250)));

//		ShoppingCart basket = new ShoppingCart();
//		basket.addItem(new HatAdapter(new Hat("bread", "diary fresh bread", 50)));

		HatAdapter ha = new HatAdapter(new Hat("food items", "pet and human food items", 700));
		System.out.println(ha.ItemName());
		System.out.println(ha.ItemPrice());
	}

}
