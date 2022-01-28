// Copyright to user asif 2021 
//all rights reserved */
package com.annotation.basic;

public class Foo {

	public void message() {
		System.out.print("THello their");
		System.out.println();
	}

	@RefactorThisMethod
	public void joinText() {
		System.out.println("okay called method\n");

	}

	public void addNumbers() {
		System.out.println("addNumbers");

	}

	@RefactorThisMethod
	public void evenOdd() {
		System.out.println(" this is even");
	}

}
