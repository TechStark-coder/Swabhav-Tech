package com.monocept.model.test;

import com.monocept.model.Human;

public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human("stark", 7, 45, 0);
		printDetails(h1);
		System.out.println();

		Human h2 = new Human("james", 40);
		printDetails(h2);

	}

	private static void printDetails(Human h1) {
		System.out.println("name  is " + h1.getname());
		System.out.println("height is " + h1.getheight());
		System.out.println("gender " + h1.getweight());
	}
}
