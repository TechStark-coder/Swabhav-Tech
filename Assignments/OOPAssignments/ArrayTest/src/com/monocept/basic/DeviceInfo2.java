// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//3. Using Object Deserialization
public class DeviceInfo2 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Path to store the Serialized object
		String filePath = "F:\\swabhavtech-training\\Classwork\\Files\\Info.txt";
		Device d1 = new Device("Apple", "iPhone13");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(d1);
			outputStream.flush();
			outputStream.close();

			FileInputStream fileInputStream = new FileInputStream(filePath);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			Device d2 = (Device) inputStream.readObject();

			inputStream.close();

			System.out.println(d2.getName());
			System.out.println(d2.getBrand());
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}
}