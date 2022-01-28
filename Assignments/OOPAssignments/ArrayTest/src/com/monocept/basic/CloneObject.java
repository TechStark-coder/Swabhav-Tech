// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

public class CloneObject implements Cloneable {
	int rollno;
	String name;

	CloneObject(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			CloneObject s1 = new CloneObject(24, "asif");

			CloneObject s2 = (CloneObject) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);
			System.out.println();
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());

		} catch (CloneNotSupportedException c) {
		}

	}
}