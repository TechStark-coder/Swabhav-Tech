// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.copy;

public class DeepCopyJava {
	public static void main(String[] args) {
		DeepCopy dept1 = new DeepCopy("1", "A", "AVP");

		EmployeeDeepCopy emp1 = new EmployeeDeepCopy(111, "John", dept1);

		EmployeeDeepCopy emp2 = null;

		try {

			emp2 = (EmployeeDeepCopy) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(emp1.dept.designation);

		emp2.dept.designation = "HODD";

		System.out.println(emp1.dept.designation);
	}
}