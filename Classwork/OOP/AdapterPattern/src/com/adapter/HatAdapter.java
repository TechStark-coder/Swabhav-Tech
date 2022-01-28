/**Copyright to customer-app by asif
All rights reserved.
*/
package com.adapter;

import hat.model.Hat;

public class HatAdapter implements Item {

	private Hat hat;

	public HatAdapter(Hat hat) {
//		super();
		this.hat = hat;
	}

	public void totalPrice() {
		hat.calculateGST();
	}

	@Override
	public String ItemName() {
		return hat.getLongName();
	}

	@Override
	public double ItemPrice() {
		return hat.getBasePrice();
	}

}
