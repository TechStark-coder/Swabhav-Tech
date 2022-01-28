// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model.test;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparator> {
	@Override
	public String toString() {
		return "StudentComparator [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	public int id;
	private String name;
	public int cgpa;

	public StudentComparator(int id, String name, int cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	@Override
	public boolean equals(Object StudentComparator) {
		StudentComparator s = (StudentComparator) StudentComparator;
		return getName().equals(s.getName()) && getId() == s.getId() && getCgpa() == s.getCgpa();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public int compareTo(Object StudentComparator) {
		StudentComparator s = (StudentComparator) StudentComparator;
		return (getName().compareTo(s.getName()));
	}

//	public static class SortByInt implements Comparator<StudentComparator> {
//		@Override
//		public int compare(StudentComparator s1, StudentComparator s2) {
//			return s1.getId().compareTo(s2.getId());
//		}
//	}
//
//	public static class SortByCgpa implements Comparator<StudentComparator> {
//		@Override
//		public int compare(StudentComparator s1, StudentComparator s2) {
//			return s1.getCgpa().compareTo(s2.getCgpa());
//		}
//	}
//	public int compareTo(StudentComparator s) { // implementing abstract method.
//		{
//			return name.compareTo(s.name);
//		}
//	}

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

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
