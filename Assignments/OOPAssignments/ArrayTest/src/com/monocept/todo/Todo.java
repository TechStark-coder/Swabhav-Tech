// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.todo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings({ "unused", "serial" })
public class Todo implements Serializable{

//	private int displayItem;
//	private String addItem;
//	private String removeList;

//	public Todo() {
//		super();
//		this.setDisplayItem(displayItem);
//		this.setAddItem(addItem);
//		this.setRemoveList(removeList);
//	}

	static ArrayList<String> arraylist = new ArrayList<String>(10);
	static int i = 1;
	Scanner myObj = new Scanner(System.in);
	Scanner myObj1 = new Scanner(System.in);
	Scanner myObj2 = new Scanner(System.in);
	@SuppressWarnings("unused")
	private boolean complete;

	public void TodoManager() {
		arraylist = new ArrayList<>();
	}

	@SuppressWarnings("resource")
	public static void displayItem() throws IOException, ClassNotFoundException {
		@SuppressWarnings("unused")
		Scanner scan = new Scanner(System.in);
		try {
			if (arraylist.size() == 0) {
				System.out.println("No items to display \n");
				i = 1;
			} else {
				for (int j = 0; j < arraylist.size(); j++) {
					System.out.print("#" + (j + 1) + " " + arraylist.get(j) + " \n ");
				}
				i = 1;
			}
		} catch (Exception e) {
			System.out.println("invalid");
		}
//		try {
//			FileInputStream fileIn = new FileInputStream("F:\\hello.txt");
//			ObjectInputStream arrayList = new ObjectInputStream(fileIn);
//			arraylist = (ArrayList<String>) arrayList.readObject();
//			arrayList.close();
//			fileIn.close();
//
//		} finally {
//			System.out.println("deserialising");
//			System.out.println("data is :" + TodoManager.myObj1);
////			System.out.println("data is :" + TodoManager.myObj2);
//
//		}
	}

	public static void addItem() throws IOException, ClassNotFoundException {
		@SuppressWarnings("resource")
		Scanner myObj1 = new Scanner(System.in);
		try {
			System.out.println("Add item : \n");
			String item = myObj1.nextLine();
			arraylist.add(item);
			System.out.println("Item Added: " + item + " \n");
			i = 1;
		} catch (Exception e) {
			System.out.println("invalid");
		}
//		try {
//			FileOutputStream fileOut = new FileOutputStream("D:\\hello.txt");
//			ObjectOutputStream out = new ObjectOutputStream(fileOut);
//			out.writeObject(arraylist);
//			out.close();
//			fileOut.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			FileInputStream fileIn = new FileInputStream("D:\\hello.txt");
//			ObjectInputStream arrayList = new ObjectInputStream(fileIn);
//			arraylist = (ArrayList<String>) arrayList.readObject();
//			arrayList.close();
//			fileIn.close();
//
//		} finally {
//			System.out.println("deserialising");
//			System.out.println("data is :" + TodoManager.myObj1);
////			System.out.println("data is :" + TodoManager.myObj2);

		}

	public static void removeList() {
		@SuppressWarnings("resource")
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("enter id : \n");
		int id = myObj2.nextInt();
		id--;
		String item1 = arraylist.get(id);
		arraylist.remove(id);
		System.out.println(item1 + " Removed \n");
		i = 1;
	}

	public void exit() {
		System.exit(0);
		System.out.println("Invalid Choice Please Enter one of the Number 1,2,3 or 4");
		i = 1;
	}
}

//	public boolean isComplete() {
//		return this.complete;
//	}
//
//	public int getDisplayItem() {
//		return displayItem;
//	}
//
//	public void setDisplayItem(int displayItem) {
//		this.displayItem = displayItem;
//	}
//
//	public String getRemoveList() {
//		return removeList;
//	}
//
//	public void setRemoveList(String removeList) {
//		this.removeList = removeList;
//	}
//
//	public String getAddItem() {
//		return addItem;
//	}
//
//	public void setAddItem(String addItem) {
//		this.addItem = addItem;
//	}