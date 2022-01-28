package com.monocept.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account acc = null;
		try {
			FileInputStream filein = new FileInputStream("D:\\Acc.txt");
			ObjectInputStream in = new ObjectInputStream(filein);
			acc = (Account) in.readObject();
			in.close();
			filein.close();
		} finally {
			System.out.println("Deserializaing object...");
			System.out.println("Account holder name is: " + acc.name);
			System.out.println("Account number is : " + acc.accno);

		}

	}

}
