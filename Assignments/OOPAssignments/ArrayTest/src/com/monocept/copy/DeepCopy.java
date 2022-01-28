// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.copy;

public class DeepCopy implements Cloneable {
	String empId;

	String grade;

	String designation;

	public DeepCopy(String empId, String grade, String designation) {
		this.empId = empId;

		this.grade = grade;

		this.designation = designation;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}