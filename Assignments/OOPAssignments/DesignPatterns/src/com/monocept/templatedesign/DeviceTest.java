// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.templatedesign;

public class DeviceTest {

	public static void main(String[] args) {
		DeviceBuild buildMyDevice = new AndroidDevice();
		buildMyDevice.addBattery();
		buildMyDevice.addCamera();
		AndroidDevice.packDevice();
		System.out.println("android phone is build!! the cost is 50,000/-");
		System.out.println();
		DeviceBuild buildMyiOsDevice = new IOSDevice();
		buildMyiOsDevice.addBattery();
		buildMyiOsDevice.addProcessor();
		IOSDevice.packDevice();
		System.out.println("IOS phone is build!! the cost is 1,29,000/-");

	}

}
