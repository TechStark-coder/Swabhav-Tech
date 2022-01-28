package com.monocept.basic;
import java.io.*;
public class AppendText {
//	public static void write(String s, char[] f1)throws IOException {
////		FileWriter fwrite = new FileWriter(fwrite, true);
//		fwrite.write(f1);
//		fwrite.close();
//		
//	}
	public static void main(String args[]) throws IOException {
		FileWriter file = new FileWriter("D:Names.txt", true);
		BufferedWriter b = new BufferedWriter(file);
		//b.newLine();
		b.write("Stark");
		System.out.println("appended");
		b.newLine();
		b.close();
		file.close();
	}
	
//Class created to test		
		
		
		
	}
//		try {
//			File fWrite = new File("D:Names.txt");
//			write("This text is appended text", fWrite);
//		} catch (IOException e) {
//			System.out.println("Unexpected error occurred");
//			e.printStackTrace();
//		}
