/**Copyright to customer-app by asif
All rights reserved.
*/
package com.lambda.test;

import com.lambda.IOperation;

public class Test {
	public static void main(String[] args) {
		IOperation op1 = new IOperation() {

			@Override
			public double doMathOperation(int a, int b) {
				return a + b;
			}
		};
		System.out.println(op1.doMathOperation(10, 20));
		// using interface calling doMathOperation

		IOperation op2 = (a, b) -> a * b;
		System.out.println(op2.doMathOperation(10, 20));
		// using lambda method to multiply it reduces the line of code

		IOperation op3 = Test::getModulus;
		System.out.println(op3.doMathOperation(5, 2));
		// modulus is used using method reference

		IOperation op4 = new Test()::getSubstraction;
		System.out.println(op4.doMathOperation(10, 3));

	}

	static double getModulus(int a, int b) {
		return a % b;
	}

	public double getSubstraction(int a, int b) {
		return a - b;
	}

}
