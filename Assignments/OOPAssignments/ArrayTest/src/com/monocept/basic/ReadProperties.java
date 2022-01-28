// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(
				"F:\\swabhavtech-training\\Assignments\\OOPAssignments\\ArrayTest\\resources\\configs.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String fname = prop.getProperty("firstname");

		System.out.println(username);
		System.out.println(password);
		System.out.println(fname);

	}
}
