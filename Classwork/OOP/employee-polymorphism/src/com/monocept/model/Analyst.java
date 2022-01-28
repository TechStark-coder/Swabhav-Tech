/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Analyst extends Employee {

//	public Analyst(int empno, String name, int salary) {
//		super(empno, name, salary);
//		// TODO Auto-generated constructor stub
//	}

	public Analyst(String name, int empno, double basicSalary) {
		super(name, empno, basicSalary);
	}

	public final double perks = (this.basicSalary / 10 * 6);

	@Override
	public void calculateAnnualCTC() {
		System.out.println("analyst");
		// TODO Auto-generated method stub
		this.basicSalary = +perks;

	}

}
