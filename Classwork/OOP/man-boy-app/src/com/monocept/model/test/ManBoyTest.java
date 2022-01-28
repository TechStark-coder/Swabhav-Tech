/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		caseStudy1();
		caseStudy2();
		caseStudy3();
		caseStudy4();
		caseStudy5();
	}

	public static void caseStudy1() {
		Man x = new Man();
		x.play();
		x.read();
		System.out.println();

	}

	public static void caseStudy2() {
		System.out.println("caseStudy2");
		Boy y = new Boy();
		y.play();
		y.read();
		y.Eat();
		System.out.println();
	}

	public static void caseStudy3() {
		System.out.println("caseStudy3");
		Man x;
		x = new Boy();
		x.read();
		x.play();
		System.out.println();
	}

	public static void caseStudy4() {
		System.out.println("at the park");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
		System.out.println();
	}

	public static void atThePark(Man x) {
		System.out.println("at the park");
		x.play();
	}

	public static void caseStudy5() {
		System.out.println("");
		Object x;
		x = new Integer(10);
		x = 10;
		System.out.println(x.getClass());
		x = "hello monocept";
		System.out.println(x.getClass());
		x = true;
		System.out.println(x.getClass());
		x = new Man();
//		x.play();
//		x.read();
		System.out.println(x.getClass());

	}

}
