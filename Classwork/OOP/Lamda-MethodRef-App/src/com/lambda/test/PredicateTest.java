/**Copyright to customer-app by asif
All rights reserved.
*/
package com.lambda.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.lambda.IPredicate;

public class PredicateTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		isEvenNo(numbers);
	}

	private static void isEvenNo(List<Integer> numbers) {
		Predicate<Integer> isEvenNo = (number) -> number % 2 == 0;
		System.out.println("is even");
		numbers.stream().filter(isEvenNo).forEach(System.out::println);
	}

	private boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	IPredicate p1 = new IPredicate() {

		@Override
		public int isEvenNo(int a) {
			return a;
		}
	};

//		System.out.println(p1.isEvenNo(7)a % 2 == 0);
//		IPredicate p2 = (a) -> a;
//		System.out.println(p2.isEvenNo(3));
//		
//		public int isEvenNo(isEvenNo a) {
//			return a % 2 == 0;
//		}
}