/**Copyright to customer-app by asif
All rights reserved.
*/
package com.work2;

public class CarDecorator implements CarService {

	public CarDecorator(CarService car) {
		super();
		this.car = car;
	}

	protected CarService car;

	@Override
	public double getCost() {
		return this.car.getCost();
	}

}
