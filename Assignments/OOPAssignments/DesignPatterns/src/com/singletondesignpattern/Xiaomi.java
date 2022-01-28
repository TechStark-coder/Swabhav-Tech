// Copyright to user asif 2021 
//all rights reserved */
package com.singletondesignpattern;

public class Xiaomi {
	public static Xiaomi getObj() {
//		System.out.println("Mi 12 update coming");
		return obj;
	}

	public static void setObj(Xiaomi obj) {
		Xiaomi.obj = obj;
	}

	private static Xiaomi obj;

	private Xiaomi() {
	}

	public static Xiaomi getXiaomi() {
		if (obj == null) {
			synchronized (Xiaomi.class) {
				if (obj == null) {
					obj = new Xiaomi();
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		Xiaomi.getXiaomi();
		System.out.println("coming soon..");
	}

	public void launchSomething() {
	}
}
