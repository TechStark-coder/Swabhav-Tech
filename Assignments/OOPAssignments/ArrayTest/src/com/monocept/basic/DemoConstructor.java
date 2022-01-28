package com.monocept.basic;

class Calc {
	int num1;
	int num2;
	
	public Calc()
	{
		num1 = 100;
		num2 = 50;
	}
//we can make two constructor in same class but wait!
	public Calc(int n) {
		num1 = n;
		num2 = n;
	}
}
public class DemoConstructor {
	public static void main(String[] args) {
		Calc obj = new Calc(); //Constructor
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}
	
}
