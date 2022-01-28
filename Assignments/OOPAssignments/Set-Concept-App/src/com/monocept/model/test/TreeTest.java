// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model.test;

import java.util.TreeSet;

import com.monocept.tasks.StudentTree;

public class TreeTest {
	public static void main(String[] args) {
//		TreeSet<StudentTree> t = new TreeSet<StudentTree>();
		StudentTree s1 = new StudentTree("Nick", 10, 7);
//		StudentTree s2 = new StudentTree("Abc", 11, 6);
		StudentTree s2 = new StudentTree("Nick", 10, 7);
		System.out.println();

		TreeSet<StudentTree> t = new TreeSet<StudentTree>();
		t.add(s1);
		t.add(s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(t);
//		System.out.println(t.size());

	}

}