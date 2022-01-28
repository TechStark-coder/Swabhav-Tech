// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.designpatterns;

public class OperationSubstract implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
