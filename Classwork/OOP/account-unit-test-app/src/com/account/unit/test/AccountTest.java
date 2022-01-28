/**Copyright to customer-app by asif
All rights reserved.
*/
package com.account.unit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monocept.model.Account;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AccountTest {
	@SuppressWarnings("deprecation")
	@Test
	public void testingConstructorsWith3Arguments_AccnoNameBalance() {
		int expectedAccno = 101;
		String expectedName = "abc";
		double expectedBalance = 10000d;

		Account acc1 = new Account(101, "abc", 10000d);
		
		int result = acc1.getAccno();
		assertEquals(expectedAccno, result);

//		assertEquals(expectedAccno, acc1.getAccno());
//		assertEquals(expectedName, acc1.getAccname());
//		assertEquals(expectedBalance, acc1.getBalance());
	}

//	@Test
//	public void testWithdrawWithinMinimumBlanceAmount(){
//		
//		Account acc1 = new Account(101, "abc",10000);
//		double expectedBalance = 6000;
//		
//		acc1.withdraw(4000);
//		
//		assertEquals(expectedBalance,acc1.getBalance());
//	}
//	
//	@Test
//	void testWithdrawalBeyondMinimumBalanceMustThrowInsufficentFundsException() {
//		//arrange
//		Account acc1 = new Account(101, "abc", 10000);
//		bool exceptionHappened=false;
//		
//		//act and assert
//		try {
//			
//		}
//	}

}
