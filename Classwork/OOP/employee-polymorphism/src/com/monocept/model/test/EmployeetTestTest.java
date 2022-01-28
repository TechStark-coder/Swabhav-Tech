/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.monocept.model.Analyst;

@SuppressWarnings("unused")
class EmployeetTestTest {

	private int basicSalary;

	@Test
	void test() {
		System.out.println("test runned succefully");
	}

	@Test
	public void testingDetails() {
		int expectedAccno = 101;
		String expectedName = "vishak";
		double expectedBalance = 60000d;
		
		Analyst ann = new Analyst("vishak", 101, 60000d);
		int result = ann.getAccno();
		assertEquals(expectedAccno, result);
		System.out.println("successfully completed");

	}
	
	
	
//	@Test
//	public void annualCTC() {
//		int expectedpa = 
//		int Expectedpa = (this.basicSalary / 10) * 7;
//		int Expectedpi = (this.basicSalary / 10) * 6;
//		
//	}
}
