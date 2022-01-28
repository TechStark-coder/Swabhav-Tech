// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.util.ArrayList;

public class CRUDFile {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
//CREATING 
		System.out.println("Brands");
		list.add("toyota");
		list.add("tata");
		list.add("mahindra");
		list.add("tesla");

		System.out.println(list);

//REMOVE
		list.remove("tesla");
		System.out.println(list);

//UPDATE
//		list.set(0, "VOLKSWAGEN");
//		System.out.println(list);
//		
//DELETE
//		list.clear();
//		System.out.println(list);
		
//		int i = 1;
//		@SuppressWarnings("unused")
//		Scanner myObj = new Scanner(System.in);
//		while (i == 1) {
//			i++;
//			System.out.println("CRUD \n");
//			System.out.println("\n 1.Create \n 2.Read \n 3.Update \n 4.Delete\n");
//			System.out.println("Enter Choice : \n");
//			String addMore = "yes";
//			if (addMore.equals("yes")) {
//				i = 0;
//				int choice = myObj.nextInt();
//				switch (choice) {
//				case 1:
//
//				}
//
//			}
//		}
	}
}