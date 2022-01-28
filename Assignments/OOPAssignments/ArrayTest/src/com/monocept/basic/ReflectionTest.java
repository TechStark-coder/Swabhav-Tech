// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		Reflectors r = new Reflectors();
		r.doReflection();

		Class c = AppendText.class;

//		Reflection obj = new Reflection();
//		Class cls = obj.getClass();
//		System.out.println("The name of class is " + cls.getName());
//
//		Constructor constructor = cls.getConstructor();
//		System.out.println("The name of constructor is " + constructor.getName());
//		System.out.println();
//		System.out.println("The public methods of class are : ");
//		Method[] methods = cls.getMethods();

		// Reflector r = new Reflector();

//		for (Method method : methods)
//			System.out.println(method.getName());
//		Field field = cls.getDeclaredField("asif");
		// field.set(obj, "JAVA");
//		Method methodcall1 = cls.getDeclaredMethod("method2", int.class);
//		methodcall1.invoke(obj, 19);

	}

}
