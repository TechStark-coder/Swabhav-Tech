// Copyright to user asif 2021 
//all rights reserved */
package com.annotation.basic;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class FooTest {
	public static void main(String[] args) throws Exception {
		Foo f = new Foo();
		Class<?> c = f.getClass();
		for (Method met : c.getDeclaredMethods()) {
			if (met.isAnnotationPresent(RefactorThisMethod.class)) {
				met.setAccessible(true);
				met.invoke(met);
				System.out.println(met);
			}
		}
	}
}