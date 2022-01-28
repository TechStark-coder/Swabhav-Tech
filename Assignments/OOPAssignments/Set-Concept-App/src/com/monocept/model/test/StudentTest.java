// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model.test;

import java.util.HashSet;

import com.monocept.tasks.StudentModel;

public class StudentTest {
	public static void main(String[] args) {
//		HashSet<StudentModel> set = new HashSet<StudentModel>();
		StudentModel s1 = new StudentModel("faisal", 10, 7);
		StudentModel s2 = new StudentModel("faisal", 10, 7);

		System.out.println(s1.equals(s2));

		HashSet<StudentModel> set = new HashSet<StudentModel>();
		set.add(s1);
		set.add(s2);
//		System.out.println(set);
		System.out.println(set.size());
		set.size();
		set.size();

	}

}
