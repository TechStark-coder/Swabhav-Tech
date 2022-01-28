/**Copyright to customer-app by asif
All rights reserved.
*/
package com.proxy.test;

import com.monocept.proxy.Image;
import com.monocept.proxy.ProxyImage;

public class ProxyTest2 {
	public static void main(String[] args) {
		Image img4 = new ProxyImage("four.jpg");
		Image img5 = new ProxyImage("five.jpg");
		Image img6 = new ProxyImage("six.jpg");

		img6.display();

	}

}
