package com.monocept.model.test;

import com.monocept.model.Human;

public class HumanCountTest {
	public static void main(String[] args) {
		Human h1 = new Human("faisal", 21);
		System.out.println(h1.getCount());
		System.out.println(Human.headCount());
		Human h2 = new Human("asif", 21);
		System.out.println(h2.getCount());
		System.out.println(Human.headCount());
		Human h3 = new Human("ankit", 21);
		System.out.println(h3.getCount());
		System.out.println(Human.headCount());
;

	}

}
