package com.monocept.model;

public class demo {
	public static void main (String args[]) {
		int i = 5; //primitive data type
		Integer ii = new Integer(i); //Boxing
		
		int J = ii.intValue(); // unboxing
		
		Integer value = i; //Autoboxing
		
	}

}
