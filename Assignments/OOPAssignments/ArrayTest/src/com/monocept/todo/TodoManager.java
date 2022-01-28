// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.todo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import com.monocept.file.Account;

@SuppressWarnings({ "serial", "unused" })
public class TodoManager implements Serializable {
	static Scanner myObj = new Scanner(System.in);
	static Scanner myObj1 = new Scanner(System.in);
	static Scanner myObj2 = new Scanner(System.in);
//	private static Object addItem;

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String args[]) throws IOException, ClassNotFoundException {

		Todo myObj1 = null;
		@SuppressWarnings("unused")
		ArrayList<String> arraylist = new ArrayList<String>(10);
//		try {
//			FileOutputStream fileOut = new FileOutputStream("D:\\check.txt");
//			ObjectOutputStream out = new ObjectOutputStream(fileOut);
//			out.writeObject(arraylist);
//			out.close();
//			fileOut.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		int i = 1;
		@SuppressWarnings("unused")
		Todo todo = new Todo();
		try {
			@SuppressWarnings("unused")
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to ToDoList");
			while (i == 1) {
				i++;
				System.out.println("TodoAppV3 \n");
				System.out.println("1.display \n 2.add items \n 3.remove \n 4.exit\n");
				System.out.println("Enter Choice : \n");
				String addMore = "yes";
				if (addMore.equals("yes")) {
					i = 0;
					int choice = myObj.nextInt();
					switch (choice) {
					case 1:
//						Todo.displayItem();
//						i = 1;
						try {
							FileInputStream filein = new FileInputStream(
									"F:\\swabhavtech-training\\Classwork\\Files\\Hello.txt");
							ObjectInputStream in = new ObjectInputStream(filein);
							myObj1 = (Todo) in.readObject();
							in.close();
							filein.close();
						} finally {
							System.out.println("Deserializaing are...");
							System.out.println(myObj1.arraylist);

						}
						break;
					case 2:
						Todo.addItem();
						i = 1;
						try {
							FileOutputStream fileOut = new FileOutputStream(
									"F:\\swabhavtech-training\\Classwork\\Files\\Hello.txt");
							ObjectOutputStream out = new ObjectOutputStream(fileOut);
							out.writeObject(myObj1.arraylist);
							out.close();
							fileOut.close();
						} catch (Exception e) {
							System.out.println("Serializaing are...");
							e.printStackTrace();
						}
						break;
					case 3:
						Todo.removeList();
						i = 1;
						break;
					case 4:
						System.exit(0);
						i = 1;
						break;

					default:
						System.out.println("not valid");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("EXCEPTION THROWN");
			System.out.println(e.getStackTrace());
		}
//		try {
//			FileInputStream filein = new FileInputStream("F:\\swabhavtech-training\\Classwork\\Files\\Hello.txt");
//			ObjectInputStream in = new ObjectInputStream(filein);
//			myObj1 = (Todo) in.readObject();
//			in.close();
//			filein.close();
//		} finally {
//			System.out.println("Deserializaing are...");
//			System.out.println(myObj1.arraylist);
//
//		}

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

}
//		try{    
//			  Todo addItem =new Todo();    
//			  FileOutputStream fout=new FileOutputStream("F:\\f.txt");    
//			  ObjectOutputStream out=new ObjectOutputStream(fout);    
//			  out.writeObject(addItem);    
//			  out.flush();    
//			  out.close();    
//			  System.out.println(addItem);    
//			  }catch(Exception e){System.out.println(e);}    
//			 }
//
//	public static Object getAddItem() {
//		return addItem;
//	}
//
//	public static void setAddItem(Object addItem) {
//		TodoManager.addItem = addItem;
//	}    

//		 try{    
//			  //Creating the object    
//			  Todo l1 =new Todo();    
//			  FileOutputStream fout=new FileOutputStream("f.txt");    
//			  ObjectOutputStream out=new ObjectOutputStream(fout);    
//			  out.writeObject(l1);    
//			  out.flush();    
//			  out.close();    
//			  System.out.println("success");    
//			  }catch(Exception e){System.out.println(e);}    
//			 }    

//		try {
//			ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\\\f.txt"));
//			Todo l1 = (Todo) in.readObject();
//			System.out.println(l1.myObj2);
//			in.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}

//	public TodoManager(String id, String description, String created, String completed) {
//		// TODO Auto-generated constructor stub
//	}
