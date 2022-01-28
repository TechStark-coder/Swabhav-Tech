// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.io.Serializable;

//public class Device implements Serializable{
@SuppressWarnings("unused")
public class Device implements Cloneable {
	private static String name = "F200";
	private static String brand = "Oppo";

	public Device() {
		super();
	}

	public Device(String name, String brand) {
		super();
		this.name = name;
		this.brand = brand;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//4. through cloning
//	@SuppressWarnings("static-access")
//	public static void main(String args[]) {
//		Device d1 = new Device("Note5", "Samsung");
//		try {
//			Device d2 = (Device) d1.clone();
//			System.out.println(d2.getName());
//			System.out.println(d2.getBrand());
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
}
