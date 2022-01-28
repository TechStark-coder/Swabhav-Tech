/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.TestAccount;

import com.monocept.model.Account;

public class AccountEqualityTest {
	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Faisal", 1000);
		Account acc2 = new Account(1001, "Faisal", 1000);
		Account acc3 = new Account(1001, "nongamba", 5000);

		System.out.println(acc1 == acc1);
		System.out.println(acc1 == acc2);
		System.out.println(acc1 == acc3);

		// System.out.println(acc1);
		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2));
		System.out.println(acc1.equals(acc3));
	}

}
