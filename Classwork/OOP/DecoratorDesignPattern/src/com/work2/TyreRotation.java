/**Copyright to customer-app by asif
All rights reserved.
*/
package com.work2;

public class TyreRotation extends CarDecorator {
	private CarService service;

	public TyreRotation(CarService car) {
		super(car);
	}

//	public String TyreRotation(String Service) {
//		return "Complete roatation";
//	}

	@Override
	public double getCost() {
		return 350 + service.getCost();
	}
}
