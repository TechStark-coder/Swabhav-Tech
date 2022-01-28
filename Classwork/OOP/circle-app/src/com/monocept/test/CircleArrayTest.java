package com.monocept.test;

import com.monocept.model.Circle;

public class CircleArrayTest {
	public static void main(String args[]) {

		Circle c1 = new Circle();
		c1.setRadius(5.5f);
		printDetails(c1);

		Circle c2 = new Circle();
		c2.setRadius(4.5f);
		printDetails(c2);

		Circle c3 = new Circle();
		c3.setRadius(3.5f);
		printDetails(c3);
	}

	private static void printDetails(Circle c1) {
		System.out.println("Radius is = " + c1.getRadius());

	}

	Circle[] manyCircles = new Circle[3];
	{
		manyCircles[0] = new Circle();
		manyCircles[1] = new Circle();
		manyCircles[2] = new Circle();

	}
}
