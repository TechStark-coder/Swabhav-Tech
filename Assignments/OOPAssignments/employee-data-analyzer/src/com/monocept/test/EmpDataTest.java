// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDataTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		employeeByDepartmentNumber();
		employeeByDesignation();
		employeeWithMaximumSalary();
	}

	private static void employeeWithMaximumSalary() throws FileNotFoundException, IOException {
		String record;
		BufferedReader br = new BufferedReader(new FileReader("data/dataFile.txt"));
		System.out.println("Employee with highest salary");

		List<List<String>> arlist = new ArrayList<>();

		int maxSal = 0;
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
//		} 
		List<String> name = new ArrayList<String>();

		while ((record = br.readLine()) != null) {
			String[] words = record.split(",");
			arlist.add(Arrays.asList(words));

			for (int i = 0; i < words.length; i = i + 3) {
				if (maxSal < Integer.parseInt(words[5])) {
					name.add(words[1]);
					maxSal = Integer.parseInt(words[5]);
				}
			}

		}
		System.out.println("Employee name with high salary:" + name.get(name.size() - 1));
		br.close();
	}

	private static void employeeByDesignation() throws FileNotFoundException, IOException {
		String line;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("data/dataFile.txt"));

		int numberOfEmployee = 0;
		System.out.println("Details of employee by their degisnation: \n");
		while ((line = br.readLine()) != null) {
			if (line.contains("ANALYST")) {
				numberOfEmployee++;
				System.out.println(line);
			}

		}
		System.out.println("\nNumber of employee's are: " + numberOfEmployee);
	}

	private static void employeeByDepartmentNumber() throws FileNotFoundException, IOException {
		String line;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("data/dataFile.txt"));

		int numberOfEmployee = 0;
		System.out.println("employee who's department number is 20 are : \n");
		while ((line = br.readLine()) != null) {
			String[] words = line.split(",");
			if (Integer.parseInt(words[7]) == 20) {
				numberOfEmployee++;
				System.out.println(line);
			}

		}
//		System.out.println("\nNumber of employee's in department number 30 are: " + numberOfEmployee);
	}

}
