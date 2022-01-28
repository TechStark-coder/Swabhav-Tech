// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.copy;

public class ShallowCopyInJava {
	public static void main(String[] args) {

		ShallowCopy dept1 = new ShallowCopy("1", "A", "AVP");

		EmployeeShallow emp1 = new EmployeeShallow(111, "John", dept1);

		EmployeeShallow emp2 = null;

		try {

			emp2 = (EmployeeShallow) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(emp1.dept.designation);

		emp2.dept.designation = "HOD";

		System.out.println(emp1.dept.designation); // Output : Director
	}
}