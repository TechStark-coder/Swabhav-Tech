// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class EmployeeDataAnalyzer {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new File("F:\\swabhavtech-training\\Classwork\\Files\\dataFile.txt"));
		sc.useDelimiter(",");
		while (sc.hasNext()) {
			System.out.print(sc.next());
		}
		sc.close();
	}
}

// Reading via URL
//		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
//		URLConnection connection = url.openConnection();
//
//		InputStreamReader input = new InputStreamReader(connection.getInputStream());
//		BufferedReader buffer = null;
//		String line = "";
//		String csvSplitBy = ",";
//
//		try {
//
//			buffer = new BufferedReader(input);
//			while ((line = buffer.readLine()) != null) {
//				String[] room = line.split(csvSplitBy);
//				System.out.println(line);
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (buffer != null) {
//				try {
//					buffer.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//	}
//
//}