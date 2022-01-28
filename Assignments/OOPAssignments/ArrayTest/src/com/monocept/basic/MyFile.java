package com.monocept.basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class MyFile {
	public static void main(String args[]) throws IOException {
//		try {
//			File f0 = new File("D:Names.txt");
//			if (f0.createNewFile()) {
//				System.out.println("File " + f0.getName() + " is created successfully.");
//			} else {
//				System.out.println("File is already exist in the directory.");
//			}
//		} catch (IOException exception) {
//			System.out.println("An unexpected error is occurred.");
//			exception.printStackTrace();
//		}
		try {
			File fwrite = new File("D:Names.txt");
			Scanner dataReader = new Scanner(fwrite);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexcpected error occurred!");
			exception.printStackTrace();
		}
		try {
			FileWriter fwrite = new FileWriter("D:Names.txt");
			fwrite.write("Asif");
			fwrite.close();
			System.out.println("Content is successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
		}
//		FileWriter fWrite = new FileWriter("D:Names.txt", true);
//		BufferedWriter b = new BufferedWriter(fWrite);
//		b.write("nick");
//		System.out.println("appended");
//		b.newLine();
//		b.close();
//		fWrite.close();
	}
}