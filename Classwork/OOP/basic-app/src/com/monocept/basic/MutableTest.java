package com.monocept.basic;

public class MutableTest {
	public static void main(String[] args) {
		String company = "Monocept";
		System.out.println(company.hashCode());
		String companyUpper = company.toUpperCase();
		System.out.println(companyUpper.hashCode());
		System.out.println(companyUpper);
		System.out.println(company);
		
		company+= "location @hyderabad";
		System.out.println(company.hashCode());
		System.out.println(company);
		company+= "domain";
		System.out.println(company.hashCode());
		System.out.println(company);
	}

}
