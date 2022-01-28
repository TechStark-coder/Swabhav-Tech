// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RefactorThisMethod {

//	Reflectors r = new Reflectors();
//	r.doReflection();
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("com.monocept.model.Account");
		System.out.println("we have constructor details");
		Constructor[] cons = c.getConstructors();
		System.out.println(Arrays.toString(cons));
		System.out.println();

		System.out.println("we have mthods too...");
		Method[] allMethods = c.getMethods();
		System.out.println(Arrays.toString(allMethods));
		System.out.println();
	}

}