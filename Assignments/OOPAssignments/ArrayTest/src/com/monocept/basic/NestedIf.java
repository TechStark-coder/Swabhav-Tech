package com.monocept.basic;

public class NestedIf {
	public static void main(String args[]) {
		int x = 50;
//		if (x==50) {
//			System.out.println("x is 50");
//		}
		int y = 70;
		if(x == 50) {
			//System.out.println("first condition was true");
			if(y == 40) {
				System.out.println("x is 50 and y is 40");
			}
		}
		
	}

}
