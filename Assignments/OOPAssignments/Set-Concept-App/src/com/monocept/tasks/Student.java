// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tasks;

public class Student {

	public int rollno;
	public float cgpa;
	public int standard;
	public String name;

	public Student(int rollno, float cgpa, int standard, String name) {
		super();
		this.rollno = rollno;
		this.cgpa = cgpa;
		this.standard = standard;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
