// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tasks;

public class StudentComparator implements Comparable<StudentComparator> {
	@Override
	public String toString() {
		return "StudentComparator [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	private int id;
	private String name;
	public int cgpa;

	public StudentComparator(int id, String name, int cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int compareTo(StudentComparator s) { // implementing abstract method.
		{
			return name.compareTo(s.name);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCgpa() {
		return cgpa;
	}

	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
}
