package com.monocept.model;

public class Customer {
	private String name;
	private String cID;
	private static int customerID1;

	@SuppressWarnings("static-access")
	public Customer(String name) {
		this.setName(name);
		this.customerID1 += 1;
		this.cID = "C100" + customerID1;
	}
//	public Customer (String name, int cID) {
//		cID = ++customerID1;
//	}

	public String getId() {
		return cID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

//	public int getId() {
//		// TODO Auto-generated method stub
//		cID++;
//		return cID;
//	}

//	public String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
