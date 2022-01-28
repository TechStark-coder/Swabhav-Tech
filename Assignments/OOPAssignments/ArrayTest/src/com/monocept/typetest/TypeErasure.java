// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.typetest;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("abc");
		names.add("pqr");
		names.add("xyz");
		// passing int values via indirectly using string list

		@SuppressWarnings("rawtypes")
		List Numbers = names;
		Numbers.add(10);
		Numbers.add(20);
		Numbers.add(30);

		System.out.println(names);
		System.out.println(Numbers);
	}

}
