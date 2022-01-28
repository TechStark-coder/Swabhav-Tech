// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.copy;

public class EmployeeShallow implements Cloneable {
	int id;

	String name;

	ShallowCopy dept;

	public EmployeeShallow(int id, String name, ShallowCopy dept) {
		this.id = id;

		this.name = name;

		this.dept = dept;
	}

	// Default version of clone() method. It creates shallow copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}