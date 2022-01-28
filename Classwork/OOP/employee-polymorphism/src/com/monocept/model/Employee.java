/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model;

public abstract class Employee {
	protected String name;
	protected int empno;
	protected double basicSalary;

	public Employee(String name, int empno, double salary) {
		this.name = name;
		this.empno = empno;
		this.basicSalary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAccno() {
		return empno;
	}
	public double getbasicSalary() {
		return basicSalary;
	}
	
	abstract void calculateAnnualCTC();

}
