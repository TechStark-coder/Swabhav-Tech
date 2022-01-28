package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleColorTest {
	public static void main(String args[]) {
	Rectangle r = new Rectangle();
	r.setColor("blue");
	r.setWidth(100);
	r.setHeight(30);
	printDetails(r);
	}

	private static void printDetails(Rectangle r) {
		System.out.println("width is : " + r.getWidth());
		System.out.println("height is : " + r.getHeight());
		System.out.println("color is : " + r.getColor());
	}
}
