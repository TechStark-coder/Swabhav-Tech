// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model;

public class Calculation {
	public static int findMax(int arr[]) {
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

}
