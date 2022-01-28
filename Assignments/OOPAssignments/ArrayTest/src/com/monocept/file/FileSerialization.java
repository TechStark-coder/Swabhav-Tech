package com.monocept.file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileSerialization {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.name = "stark";
		acc.accno = 100;
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\Acc.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(acc);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in account file");
		} 
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}

}
