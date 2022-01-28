// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.todo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Deserialise {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		TodoManager myObj1 = null;
	}
}
//		try {
//			FileInputStream fileIn = new FileInputStream("F:\\Char.txt");
//			ObjectInputStream arrayList = new ObjectInputStream(fileIn);
//			arrayList = (ArrayList<String>) arrayList.readObject();
//			arrayList.close();
//			fileIn.close();
//
//		} finally {
//			System.out.println("deserialising");
//			System.out.println("data is :" + TodoManager.myObj1);
////			System.out.println("data is :" + TodoManager.myObj2);
//
//
//		}
//	}