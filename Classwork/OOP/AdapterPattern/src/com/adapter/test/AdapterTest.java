/**Copyright to customer-app by asif
All rights reserved.
*/
package com.adapter.test;

import com.adapter.test.*;
import com.adapter.HatAdapter;
import com.adapter.ShoppingCart;

import hat.model.Hat;

public class AdapterTest {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new HatAdapter(new Hat("milk", "diarymilk", 10)));
//		cart.addItem(new HatAdapter(new Hat("milk", "diarymilk", 10)));

		HatAdapter HA = new HatAdapter(new Hat("puff", "vegpuff", 15));
		System.out.println(HA.ItemName());
		System.out.println(HA.ItemPrice());
//		System.out.println(cart.

	}
}
