/**Copyright to customer-app by asif
All rights reserved.
*/
package com.odp.test;

import com.publisher.INotifier;

public class EmailNotifier implements INotifier {

	@Override
	public void sendNotification(String msg) {
		System.out.println("notification from email");
		System.out.println(msg);
		
	}

}
