/**Copyright to customer-app by asif
All rights reserved.
*/
package com.lambda.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Pattern;

public class ArrayStream {
	public static void main(String[] args) throws IOException {
		caseStudy1();
		caseStudy2();
	}

	public static void caseStudy1() {
		String[] names = new String[] { "abc", "pqr", "xyz","def" };
		Arrays.stream(names).filter(n -> n.contains("d")).sorted().forEach(System.out::println);
		Arrays.stream(names).filter(n -> n.contains("x")).sorted().forEach(n -> System.out.println((n.toUpperCase())));
	}

	public static void caseStudy2() {
		String[] manyMarks = { "10", "20", "30", "pqr" };
		int total = Arrays.stream(manyMarks).filter(ArrayStream::isNumber).mapToInt(x -> Integer.parseInt(x))
				.filter(x -> x > 15).sum();
		System.out.println(total);
	}

	private static boolean isNumber(String s) {
		return Pattern.matches("\\d+", s);
	}

	@SuppressWarnings("unused")
	public static void caseStudy3() throws IOException {
		Files.lines(Paths.get("data//names.txt")).filter(n -> Pattern.matches("[a-zA-Z ]+", n))
				.distinct().sorted().limit(2).forEach(System.out::println);

	}

}