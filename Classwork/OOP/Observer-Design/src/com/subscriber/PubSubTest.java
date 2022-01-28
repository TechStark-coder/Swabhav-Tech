/**Copyright to customer-app by asif
All rights reserved.
*/
package com.subscriber;

import com.publisher.Account;

public class PubSubTest {
	public static void main(String[] args) {
		Account acc1 = new Account(100, "bablu", 10000);
		acc1.registerNotifier(new SmsNotifier());
		acc1.registerNotifier(new WhatsappNotifier());
		acc1.deposit(5000);
	}

}
