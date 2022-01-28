package com.monocept.model.test;

import com.monocept.model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("nongamba");
		Customer c2 = new Customer("asif");
		Customer c3 = new Customer("ankit");

		System.out.println(c1.getId() + " " + c1.getName());
		System.out.println(c2.getId() + " " + c2.getName());
		System.out.println(c3.getId() + " " + c3.getName());
//		System.out.println(c1.getId());

		System.out.println(c1.getId() + " " + c1.getName());

//		public static Collection getDetails() {
//			String name = "nongamba";
//			 return new Collection (name);
//		}

		printDetails(c1, c2, c3);

	}

	public static void printDetails(Customer c1, Customer c2, Customer c3) {
//		System.out.println("Name is :" + c1.getName());
//		System.out.println("Account number is : " + c1.getId());
	}
}