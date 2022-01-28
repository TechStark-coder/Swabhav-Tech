package com.monocept.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {

	// provide your ToDoList object
	// declare your ToDoList topic
	public static void main(String[] args) {

		// The run function will start the menu on the output screen
		run();
	}

	// create your run function with the following menu items
	private static void run() {

		boolean quit = false;
		String mainMenu = "" + "1. Display\n" + "2. Add Items\n" + "3. Remove\n" + "4. Exit\n";
		while (!quit) {

			// The Scanner will input the user's choice
			Scanner input = new Scanner(System.in);
			System.out.println(mainMenu);
			int choice = input.nextInt();
		

			// you can any conditional statement (if/else or switch)
			// each case, will run the function
			switch (choice) {
			case 1:
				addTopic();
				break;
			// create a case for each menu option

			default:
				System.out.println("Invalid entry try again");
			}
		}
		System.exit(0);

	}

	// implement the method for each case. I have provided example code
	// for the first option, addTopic.

	private static void addTopic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter topic name");
		String name = sc.nextLine();

		System.out.println(sc);
		
		
		
		
		
//		for (int i = 0; i < ToDoList.size(); i++) {
//			if (ToDoList.get(i).topic.equals(name)) {
//				System.out.println("Topic already exists. Try again");
//				return;
//			}
//		}

		ToDoList.add(new ToDoList(name));
		System.out.println("Topic added successfully");

	}

}
