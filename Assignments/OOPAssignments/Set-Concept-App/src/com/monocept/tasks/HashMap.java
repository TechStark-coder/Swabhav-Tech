// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tasks;

public class HashMap {
	private String name;
	private int rollno;
	private int cgpa;
	private int standard;

	public HashMap(String name, int rollno, int cgpa, int standard) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
		this.standard = standard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getCgpa() {
		return cgpa;
	}

	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}
}
