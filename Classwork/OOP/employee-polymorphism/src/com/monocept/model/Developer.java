/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Developer extends Employee {

	public Developer(String name, int empno, double basicSalary) {
		super(name, empno, basicSalary);
		// TODO Auto-generated constructor stub
	}

	public final double pa = (this.basicSalary / 10) * 7;
	public final double projectincentives = (this.basicSalary / 10) * 6;

	@Override
	public void calculateAnnualCTC() {
		System.out.println("developer");
		this.basicSalary += (pa + projectincentives);

	}

}
