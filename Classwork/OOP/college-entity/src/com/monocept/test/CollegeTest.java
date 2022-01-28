/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.test;

import com.monocept.model.Person;
import com.monocept.model.Student;

public class CollegeTest extends Person {
	public CollegeTest(int id, String address, int dob) {
		super(id, address, dob);
	}

	public static void main(String[] args) {
		Person P1 = new Person(01, "karnataka", 24 - 07 - 1998);
		printDetails(P1);
		Person P2 = new Person(02, "Maharastra", 25 - 07 - 1998);
		printDetails(P2);
		Person P3 = new Person(03, "Kashmir", 26 - 07 - 1998);
		printDetails(P3);
		Student S = new Student(04, "Bengal", 27 - 07 - 1998, "Computer Science");
		printDetails(S);
	}

	private static void printDetails(Person p) {
		System.out.println("Id is " + p.getId());
		System.out.println("Address is " + p.getAddress());
//		System.out.println();
		System.out.println("DOB is " + p.getDob());
		System.out.println();
	}

	private static void printDetails(Student s) {
		System.out.println("Branch is " + s.getBranch());
		System.out.println();
	}

}
