/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.decorator;

public class RibbonedHat extends HatDecorator {

	public RibbonedHat(Hat hat) {
		super(hat);
	}

	@Override
	public String getDesc() {
//		super.getDesc();
		System.out.println("special ribbon hat");
		return super.getDesc();
	}

	@Override
	public int getPrice() {
		System.out.println("price");
		return super.getCost();
	}

}
