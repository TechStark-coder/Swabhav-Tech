package com.monocept.basic;

public class BoxingUnboxing {
	public static void main(String args[]) {
		int i = 50;
		@SuppressWarnings("unused")
		Integer iobj = Integer.valueOf(i);
		Integer iobj1 = i; //AutoBoxing
		//i value is assigned to iobj1
		System.out.println(iobj1);
		
		Integer jobj = new Integer(100);
		int j = jobj.intValue();
		int k = j; // Unboxing 
		System.out.println(j+k);
	}
}
