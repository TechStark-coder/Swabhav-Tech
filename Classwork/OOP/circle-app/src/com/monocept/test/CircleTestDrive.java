package com.monocept.test;

import com.monocept.model.Circle;

public class CircleTestDrive {
	public static void main(String args[]) {
		Circle solid = new Circle();
		solid.setRadius(5.5f);
		solid.setBorder("solid");
		printDetails(solid);
		
		Circle doule = new Circle();
		doule.setRadius(4.2f);
		doule.setBorder("double");
		printDetails(doule);
		
		Circle dotted = new Circle();
		dotted.setRadius(3.2f);
		dotted.setBorder("abc");
		printDetails(dotted);
		
	
}

	private static void printDetails(Circle solid) {
		System.out.println(" Area of anonymous cirle :" + new Circle().calculateArea());
		System.out.println(" Border of anonymous circle :" + new Circle().getBorder());
		System.out.println();
		
	}
}

