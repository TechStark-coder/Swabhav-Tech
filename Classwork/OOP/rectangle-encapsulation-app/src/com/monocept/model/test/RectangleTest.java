package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle small = new Rectangle();
		small.setWidth(0);
		small.setHeight(-10);
		printDetails(small);

		Rectangle big = new Rectangle();
		big.setWidth(101);
		big.setHeight(500);
		printDetails(big);

		Rectangle medium = new Rectangle();
		medium.setWidth(50);
		medium.setHeight(20);
		printDetails(medium);

	}

	public static void printDetails(Rectangle r) {
		System.out.println("width is : " + r.getWidth());
		System.out.println("height is : " + r.getHeight());
		System.out.println("area is  : " + r.calculateArea());
	}
}
