// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model.test;

import java.util.TreeSet;

import com.monocept.model.test.StudentComparator;

public class StudentComparatorTest {
	public static void main(String[] args) {
		TreeSet<StudentComparator> ts = new TreeSet<StudentComparator>();
		StudentComparator s1 = new StudentComparator(6, "Nick", 9);
		StudentComparator s2 = new StudentComparator(7, "Abc", 5);
		StudentComparator s3 = new StudentComparator(9, "Uday", 3);

//		TreeSet<StudentComparator> ts = new TreeSet<StudentComparator>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println("Student Names in Ascending order..");
//		System.out.println("Values are: " + ts.toString());

		for (StudentComparator s : ts) {
//			System.out.println(s.getId() + " " + s.getName() + " " + s.getCgpa());
//			System.out.println("Student Names in Ascending order..");
			System.out.println(s.getName());
//			System.out.println();
		}
	}
}

//		Iterator<StudentComparator> itr = ts.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	}
//	private static void printDetails(StudentComparator s1) {
//		System.out.println("name is :" + s1.getName());
//		System.out.println("id  is :" + s1.getId());
//		System.out.println("cgpa is :" + s1.getCgpa());
//		System.out.println();
//
//	}
