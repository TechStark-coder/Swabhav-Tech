/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model.test;

import com.monocept.model.IEmotion;
import com.monocept.model.IManner;
import com.monocept.model.Man;
import com.monocept.model.Woman;

public class Test {
	public static void main(String[] args) {
		Man x = new Man();
		Woman y = new Woman();
		atThePartyHall(x);
//		atTheMovieHall(x);
//		atThePartyHall(y);
		atTheMovieHall(y);
	}

	static void atThePartyHall(IManner obj) {
		System.out.println("at the party");
		obj.wish();
		obj.depart();
		System.out.println();

	}

	static void atTheMovieHall(IEmotion obj) {
		System.out.println("at the movies");
		obj.cry();
		obj.laugh();
		System.out.println();

	}
}
