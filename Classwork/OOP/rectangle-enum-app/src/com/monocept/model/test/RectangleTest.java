package com.monocept.model.test;

import com.monocept.model.ColorOption;
import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(100);
		r1.setHeight(50);
		r1.setColor(ColorOption.BLUE);
		printDetails(r1);

	}
	private static void printDetails(Rectangle r1) {
		System.out.println("width is : " + r1.getWidth());
		System.out.println("height is : " + r1.getHeight());
		System.out.println("color is : " + r1.getColor());
		System.out.println("area is  : " + r1.calculateArea());
	}

}
