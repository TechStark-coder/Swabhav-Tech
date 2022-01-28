/**Copyright to customer-app by asif
All rights reserved.
*/
package com.proxy.test;

import com.monocept.proxy.Image;
import com.monocept.proxy.RealImage;

public class ProxyTest {
	public static void main(String[] args) {
		Image img1 = new RealImage("one.jpg");
		Image img2 = new RealImage("two.jpg");
		Image img3 = new RealImage("three.jpg");

		img1.display();

	}

}
