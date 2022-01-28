package com.monocept.test;

import com.monocept.model.Circle;

public class CircleTest {
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
			dotted.setBorder("xyz");
			printDetails(dotted);
		}

		public static void printDetails(Circle c){
			System.out.println("Radius is = " + c.getRadius());
			System.out.println("Border is = " + c.getBorder());
			System.out.println("Area is = " + c.calculateArea());
			System.out.println();
			
		}
			

}
