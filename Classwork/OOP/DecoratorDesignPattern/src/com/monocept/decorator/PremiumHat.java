/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.decorator;

public class PremiumHat implements Hat {

	@Override
	public String getName() {
		return "Premium hat";
	}

	@Override
	public String getDesc() {
		return "Premium  stylish hat";
	}

	@Override
	public int getCost() {
		return 100;
	}

}
