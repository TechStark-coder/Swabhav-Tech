/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public class Manager extends Employee {

	public Manager(String name ,int empno , double basicSalary) {
		super(name, empno, basicSalary);
	}

	public final double hra = (this.basicSalary / 10) * 8;
	public final double ta = (this.basicSalary / 10) * 6;
	public final double da = (this.basicSalary / 10) * 7;

	@Override
	public void calculateAnnualCTC() {
		System.out.println("manager");
		this.basicSalary += (hra + ta + da);
	}
//		return 0;
}
