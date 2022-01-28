/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.srp.sol.test;

import com.monocept.srp.sol.FixedDepositt;
import com.monocept.srp.sol.NormalRatePolicy;

public class SolutionTestOCP {
	public static void main(String[] args) {
		NormalRatePolicy nml = new NormalRatePolicy() {
		};
		FixedDepositt fd = new FixedDepositt(101, "nick", 10000, 2, nml);
		System.out.println(fd.calculateSimpleInterest());

	}
}