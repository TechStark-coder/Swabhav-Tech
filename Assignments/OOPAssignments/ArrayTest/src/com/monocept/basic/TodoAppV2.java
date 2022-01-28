package com.monocept.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class TodoAppV2 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> myList = new ArrayList<String>(10);
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
					File file = new File("F:\\swabhavtech-training\\Classwork\\Files\\reading.txt");
					BufferedReader br = new BufferedReader(new FileReader(file));
					String output;
					while ((output = br.readLine()) != null) {
						System.out.println(output);

					}
					if (myList.size() == 0) {
						System.out.println("No items to display \n");
						i = 1;
					} else {
						for (int j = 0; j < myList.size(); j++) {
							System.out.print("#" + (j + 1) + " " + myList.get(j) + " \n ");
						}
						i = 1;

					}
					break;
				case 2:
					System.out.println("Add item : \n");
					String item = myObj1.nextLine();
					File f1 = new File("F:\\swabhavtech-training\\Classwork\\Files\\reading.txt");
					FileWriter fWriter = new FileWriter(f1, true);
					fWriter.write(item);
					fWriter.close();
					myList.add(item);
					System.out.println("Item Added: " + item + " \n");
					i = 1;
//					FileInputStream input = new FileInputStream(myList);
//					FileOutputStream fos = new FileOutputStream(myList);
//					ObjectOutputStream oos = new ObjectOutputStream(myList);
//					oos.writeObject(myList);
//					oos.close();

//					System.out.println("do you want to add more");
//					Scanner sc = new Scanner(System.in);
//					String item11 = myObj1.nextLine();
//					addMore = sc.nextLine();
//					arraylist.add(item11);
//					System.out.println("Item Added: " + item11 + " \n");
//					i = 1;
					break;
				case 3:
					System.out.println("enter id : \n");
					int id = myObj2.nextInt();
					id--;
					String item1 = myList.get(id);
					myList.remove(id);
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

//				try {
//					FileInputStream input = new FileInputStream("F:\\input.txt");
//					System.out.println("Data in the file: ");
//
//					int i1 = input.read();
//
//					while (i1 != -1) {
//						System.out.print((myList) i1);
//
//						i1 = input.read();
//					}
//					input.close();
//				}
//
//				catch (Exception e) {
//					e.getStackTrace();
//				}
			}
		}
	}
}

//					try {
//						FileInputStream items = new FileInputStream(
//								"F:\\swabhavtech-training\\Assignments\\OOPAssignments\\ArrayTest\\resources\\files\\items.txt");
//						FileOutputStream writeData = new FileOutputStream("F:mylist.txt");
//						ObjectOutputStream writeStream = new ObjectOutputStream(myList);
//
//						writeStream.writeObject(myList);
//						writeStream.flush();
//						writeStream.close();
//
//					} catch (IOException e) {
//						e.printStackTrace();
//					}

//					BufferedWriter writer = new BufferedWriter(new FileWriter(new File("F:\\list.txt")));
//
//					String myList = myObj1;
//
//					writer.write(myList);
//
//					writer.close();

//					FileWriter writer = new FileWriter("F:\\output.txt");
//					for (String str : item) {
//						writer.write(str + System.lineSeparator());
//					}
//					writer.close();

//				case 5:
//					FileInputStream fis = new FileInputStream("F:\\swabhavtech-training\\Assignments\\OOPAssignments\\ArrayTest\\resources\\files\\items.txt");

//				while (i == 2) {
//					System.out.print("#" + (i + 1) + " " + arraylist.get(i) + " \n ");
//
//				}

//				System.out.println("do you want to add more");
//				Scanner sc = new Scanner(System.in);
//				addMore = sc.nextLine();
//				arraylist.add(addMore);
//				System.out.println("Item Added: " + addMore + " \n");
//				i = 1;
//				
