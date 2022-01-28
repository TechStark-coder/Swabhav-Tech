// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

@SuppressWarnings("serial")
public class AsifUncheckExcpetion extends RuntimeException {
	public static void main(String[] args) {
		System.out.println("inside main");
		throw new AsifUncheckExcpetion();
	}
}