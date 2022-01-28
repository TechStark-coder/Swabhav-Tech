/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Teacher implements SalaryCalc {
	public void salary() {
		System.out.println(Salary);
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		System.out.println("Salary is ");
		t.salary();
		
	}

//	public Teacher(int id, String address, int dob) {
//		super(id, address, dob);
//	}

}
