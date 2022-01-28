/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.test;

import com.monocept.decorator.GoldenHat;
import com.monocept.decorator.Hat;
import com.monocept.decorator.PremiumHat;
import com.monocept.decorator.RibbonedHat;
import com.monocept.decorator.StandardHat;

public class HatTest {
	public static void main(String[] args) {

		Hat hat = new RibbonedHat(new GoldenHat(new StandardHat()));
		System.out.println(hat.getCost());
		System.out.println(hat.getName());
		System.out.println(hat.getDesc());
		System.out.println();

		Hat fancyHat = new GoldenHat(new PremiumHat());
		System.out.println(fancyHat.getName());
		System.out.println(fancyHat.getCost());
		System.out.println(fancyHat.getDesc());

	}

}
