/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.test;

import com.work2.CarInspection;
import com.work2.CarService;
import com.work2.OilChange;
import com.work2.TyreRotation;

public class CarTest {
	public static void main(String[] args) {
		CarService car = new CarInspection();

		@SuppressWarnings("unused")
		CarService cars = new OilChange(new TyreRotation(new CarInspection()));

		System.out.println(car.getCost());

//		System.out.println(car.getDetails());
	}

}
