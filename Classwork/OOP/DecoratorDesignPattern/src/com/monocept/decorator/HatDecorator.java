/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.decorator;

public class HatDecorator implements Hat {
	public HatDecorator(Hat hat) {
		super();
		this.hat = hat;
	}

	protected Hat hat;

	@Override
	public String getName() {
		return this.hat.getName();
	}

	@Override
	public String getDesc() {
		return hat.getDesc();
	}

	@Override
	public int getCost() {
		return hat.getCost();
	}

	public int getPrice() {
		return 200;
	}

}
