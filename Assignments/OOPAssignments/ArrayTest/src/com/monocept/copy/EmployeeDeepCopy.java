// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.copy;

public class EmployeeDeepCopy implements Cloneable {
	int id;

	String name;

	DeepCopy dept;

	public EmployeeDeepCopy(int id, String name, DeepCopy dept) {
		this.id = id;

		this.name = name;

		this.dept = dept;
	}

	// Overriding clone() method to create a deep copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		EmployeeDeepCopy emp = (EmployeeDeepCopy) super.clone();

		emp.dept = (DeepCopy) dept.clone();

		return emp;
	}
}