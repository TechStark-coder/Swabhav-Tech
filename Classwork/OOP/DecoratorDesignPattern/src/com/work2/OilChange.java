/**Copyright to customer-app by asif
All rights reserved.
*/
package com.work2;

public class OilChange extends CarDecorator {

	public OilChange(CarService car) {
		super(car);
	}

	private CarService service;

//	public void OilChange() {
//	}

	@Override
	public double getCost() {
		return 1200 + service.getCost();
	}
}
