package com.monocept.basic;

import java.util.*;

public class UserInputTest {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your full name");
		String str = sc.nextLine();
		System.out.println("thank you for entering your " +str);
		String[] Name = str.split(" ",2);
		System.out.println("your first name is "+Name[0].toUpperCase());
		System.out.println("your last name is "+Name[1].toUpperCase());
	}

}
