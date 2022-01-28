/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Person {
	private int id;
	private String address;
	private int dob;

	public Person(int id, String address, int dob) {
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public int getDob() {
		return dob;
	}

}
