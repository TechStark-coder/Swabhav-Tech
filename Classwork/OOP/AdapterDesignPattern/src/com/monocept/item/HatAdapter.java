/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.item;

import hat.model.Hat;

public class HatAdapter implements IItem {
	private Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String ItemName() {
		return hat.getLongName();
	}

	@Override
	public double ItemPrice() {
		return hat.getBasePrice();
	}

	void totalPrice() {
		hat.calculateGST();
	}

}
