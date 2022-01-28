package com.monocept.basic;

import java.util.*;
import java.util.Scanner;

class TodoAppV1 {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>(10);
		int i = 1;
		Scanner myObj = new Scanner(System.in);
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		while (i == 1) {
			i++;
			System.out.println("TodoAppV1 \n");
			System.out.println("1.display \n 2.add items \n 3.remove \n 4.exit\n");
			System.out.println("Enter Choice : \n");
			String addMore = "yes";
			if (addMore.equals("yes")) {
				i = 0;
				int choice = myObj.nextInt();
				switch (choice) {
				case 1:
					if (arraylist.size() == 0) {
						System.out.println("No items to display \n");
						i = 1;
					} else {
						for (int j = 0; j < arraylist.size(); j++) {
							System.out.print("#" + (j + 1) + " " + arraylist.get(j) + " \n ");
						}
						i = 1;
					}
					break;
				case 2:
					System.out.println("Add item : \n");
					String item = myObj1.nextLine();
					arraylist.add(item);
					System.out.println("Item Added: " + item + " \n");
					i = 1;
//					System.out.println("do you want to add more Y/N");
//					Scanner sc = new Scanner(System.in);
//					addMore = sc.nextLine();
//					arraylist.add(addMore);
//					System.out.println("Item Added: " + addMore + " \n");
//					i = 1;
					break;
				case 3:
					System.out.println("enter id : \n");
					int id = myObj2.nextInt();
					id--;
					String item1 = arraylist.get(id);
					arraylist.remove(id);
					System.out.println(item1 + " Removed \n");
					i = 1;
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice Please Enter one of the Number 1,2,3 or 4");
					i = 1;
				}
//			while (i == 2) {
//				System.out.print("#" + (i + 1) + " " + arraylist.get(i) + " \n ");
//
//			}

//			System.out.println("do you want to add more");
//			Scanner sc = new Scanner(System.in);
//			addMore = sc.nextLine();
//			arraylist.add(addMore);
//			System.out.println("Item Added: " + addMore + " \n");
//			i = 1;
//			
			}
		}
	}
}
