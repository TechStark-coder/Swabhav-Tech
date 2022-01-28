// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.templatedesign;

public abstract class DeviceBuild {
	public final void buildDevice() {
		addCamera();
		addProcessor();
		addBattery();
	}

	public static void packDevice() {
		try {
			System.out.println("packing ... processing to ship!");
		} catch (Exception e) {
			System.out.println("packing unsuccessful");
		}
	}

	public abstract void addBattery();

	public abstract void addCamera();

	public abstract void addProcessor();

}
