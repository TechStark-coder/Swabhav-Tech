// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tasks;

import java.util.Comparator;

public class StudentTree implements Comparator<StudentTree> {

	private String name;
	private int rollno;
	private int cgpa;

	public StudentTree(String name, int rollno, int cgpa) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}

	public int compareTo(StudentTree t) { // implementing abstract method.
		if (name == t.name && rollno == t.rollno && cgpa == t.cgpa) {
			return 0;
		}
		return 1;
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

	@Override
	public int compare(StudentTree o1, StudentTree o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
