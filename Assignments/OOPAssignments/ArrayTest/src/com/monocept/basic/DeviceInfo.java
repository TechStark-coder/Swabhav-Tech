// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DeviceInfo {
	public static void main(String[] args)
			throws IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		try {
//1.using newInstance() method to create the object.
//			String className = "com.monocept.basic.Device";
//			@SuppressWarnings("rawtypes")
//			Class clasz = Class.forName(className);
//			@SuppressWarnings("unused")
//			Device device = (Device) clasz.newInstance();
//			System.out.println(Device.getName());
//			System.out.println(Device.getBrand());
//			catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//	            e.printStackTrace();
//	        }
//		}
//			
			
			
//2.Using newInstance() method of Constructor class			
			Constructor<Device> constructor;
			constructor = Device.class.getConstructor();
			@SuppressWarnings("unused")
			Device device = constructor.newInstance();
			System.out.println(Device.getName());
			System.out.println(Device.getBrand());

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
		
		
//3.Using Object Deserialization
		
