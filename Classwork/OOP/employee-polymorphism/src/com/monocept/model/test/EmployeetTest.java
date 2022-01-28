/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.monocept.model.Analyst;
import com.monocept.model.Developer;
import com.monocept.model.Employee;
import com.monocept.model.Manager;

public class EmployeetTest {
	public static void main(String[] args) throws IOException {
		Analyst ann = new Analyst("vishak", 101, 60000d);
		ann.calculateAnnualCTC();
		printDetails(ann);

		Developer dev = new Developer("nongamba", 111, 40000d);
		dev.calculateAnnualCTC();
		printDetails(dev);

		Manager man = new Manager("vipul", 200, 50000d);
		man.calculateAnnualCTC();
		printDetails(man);

	}

	private static void printDetails(Employee emp) throws IOException {
		File sal = new File("F:\\swabhavtech-training\\Classwork\\Files\\SalarySlip.txt");
		File sal1 = new File("F:\\swabhavtech-training\\Classwork\\Files\\WebSalary.html");

		FileWriter fw = new FileWriter(sal, true);
		FileWriter fw1 = new FileWriter(sal1, true);
		

		System.out.println(emp.getName());
		fw1.write("Name = " + emp.getName() + "\n");
		fw.write("Name = " + emp.getName() + "\n");

		System.out.println(emp.getbasicSalary());
		fw1.write("Salary = " + emp.getbasicSalary() + "\n");
		fw.write("Salary = " + emp.getbasicSalary() + "\n");

		System.out.println();
		
		fw.close();
		fw1.close();
	}

}
