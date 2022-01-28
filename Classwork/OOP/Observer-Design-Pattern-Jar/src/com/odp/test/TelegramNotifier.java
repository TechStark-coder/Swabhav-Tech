/**Copyright to customer-app by asif
All rights reserved.
*/
package com.odp.test;

import com.publisher.INotifier;

public class TelegramNotifier implements INotifier {

	@Override
	public void sendNotification(String msg) {
		System.out.println("notification from telegram");
		System.out.println(msg);

	}

}
