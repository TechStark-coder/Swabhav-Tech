// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.monocept.tasks.Student;

public class HashTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<Integer, Student> hm = new HashMap<>();
		Student s1 = new Student(101, 7, 10, "faisal");
		hm.put(1, s1);
		Student s2 = new Student(101, 6, 10, "abc");
		hm.put(1, s2);
		System.out.println(hm.size());
//		hm.equals(s2);
//		System.out.println(hm);

		System.out.println("iterating hashmap..");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

//		Set<Integer> keys = hm.keySet();
//		for (Integer s : keys) {
//			System.out.println(s + " : " + hm.get(s));
//
//		}
	}
}