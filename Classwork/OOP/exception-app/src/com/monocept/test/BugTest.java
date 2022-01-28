/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.test;

public class BugTest {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		System.out.println(c);
		System.out.println("end of main");
		String[] str = new String[] { "10", "5" };
		main(str);
	}
}