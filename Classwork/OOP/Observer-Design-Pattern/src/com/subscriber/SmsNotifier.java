/**Copyright to customer-app by asif
All rights reserved.
*/
package com.subscriber;

import com.publisher.Account;
import com.publisher.INotifier;

public class SmsNotifier implements INotifier {

	@Override
	public void sendNotification(String msg) {
		System.out.println("notification from whatsapp");
		System.out.println(msg);
	}
}