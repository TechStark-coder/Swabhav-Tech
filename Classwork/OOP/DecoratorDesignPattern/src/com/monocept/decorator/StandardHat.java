/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.decorator;

public class StandardHat implements Hat {

	@Override
	public String getName() {
		return "Standard hat";
	}

	@Override
	public String getDesc() {
		return "simple basic hat";
	}

	@Override
	public int getCost() {
		return 50;
	}

}
