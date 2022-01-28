// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.typetest;

import java.util.Arrays;
import java.util.List;

public class WildCard {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Hello", "World", "Java");
		printDetails(names);

		List<Integer> Numbers = Arrays.asList(10, 20, 30, 40, 50);
		printDetails(Numbers);

		List<?> someSpecificRandomType = names;
		System.out.println(someSpecificRandomType);

		someSpecificRandomType = Numbers;
		System.out.println(someSpecificRandomType);
	}

	private static void printDetails(List<?> names) {
		names.forEach(System.out::println);
		System.out.println();
	}

}
