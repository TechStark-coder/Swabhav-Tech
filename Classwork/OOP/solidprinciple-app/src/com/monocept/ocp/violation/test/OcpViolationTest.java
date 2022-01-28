/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.ocp.violation.test;

import com.monocept.ocp.violation.FestivalType;
import com.monocept.ocp.violation.FixedDeposit;
import com.monocept.srp.solution.Invoice;

public class OcpViolationTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(100, "abc", 50000, 2, FestivalType.NORMAL);
		
//		public void calcuateRate(FixedDeposit FixedDeposit) {
//			System.out.println("discount prixe is ----" + FixedDeposit.calcuateRate());
//		}

	}

}
