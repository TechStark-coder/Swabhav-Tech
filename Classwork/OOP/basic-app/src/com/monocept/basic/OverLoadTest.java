package com.monocept.basic;

public class OverLoadTest {
	public static void main (String args[]) {
		printInfo("Hello mr ankit");
		printInfo(100);
		printInfo(100.55d);
		printInfo(100.55f);
		printInfo("#");
		printInfo('#');
		
	}
	static void printInfo(String value) {
		System.out.println("overload #1 with string");
		System.out.println(value);
	}

	static void printInfo(int value) {
		System.out.println("overload #2 with int");
		System.out.println(value);
	}
	static void printInfo(char value) {
		System.out.println("overload #3 with char");
		System.out.println(value);
	}
	static void printInfo(float value) {
		System.out.println("overload #4 with float");
		System.out.println(value);
	}
	static void printInfo(double value) {
		System.out.println("overload #5 with double");
		System.out.println(value);
	}
}
