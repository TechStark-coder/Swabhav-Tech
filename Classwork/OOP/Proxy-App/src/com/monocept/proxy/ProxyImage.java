/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.proxy;

public class ProxyImage implements Image {
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	private String fileName;
	private RealImage realImage;

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();

	}

}
