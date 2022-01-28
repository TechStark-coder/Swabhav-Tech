/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Student extends Person {

	public Student(int id, String address, int dob, String branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public String branch;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Student(int id, String address, int dob) {
		super(id, address, dob);
	}

}
