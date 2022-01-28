/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.ispp.sol.test;

import com.monocept.ispp.solution.IEatable;
import com.monocept.ispp.solution.IWorkable;
import com.monocept.ispp.solution.Manager;
import com.monocept.ispp.solution.Robot;

public class IsppSolution {
	public static void main(String[] args) {
		Manager m = new Manager();
		Robot b = new Robot();

		atTheWorkStation(m);
		atTheWorkStation(b);
		atTheCafeterial(m);
//		atTheCafeterial(b);
	}

	private static void atTheCafeterial(IEatable m) {
		System.out.println("at cafe");
		m.startEat();
		m.stopEat();
		System.out.println();

	}

	static void atTheWorkStation(IWorkable b) {
		System.out.println("at the workstation");
		b.startWork();
		b.stopWork();
		System.out.println();

	}
}
