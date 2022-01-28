/**Copyright to customer-app by asif
All rights reserved.
*/
package com.monocept.proxy;

public class RealImage implements Image {

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		System.out.println("loading" + fileName);
	}

	private String fileName;

	@Override
	public void display() {
		System.out.println("display img" + fileName);

	}

}
