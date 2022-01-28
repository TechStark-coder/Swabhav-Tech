// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Main.login("hddjjd" , "pass");
	}

	public static void login(String username, String password) {
		if (username.equals("user100") && password.equals("pass")) {
			System.out.println("logged in");
		} else {
			throw new AsifUncheckExcpetion();

		}

	}
}