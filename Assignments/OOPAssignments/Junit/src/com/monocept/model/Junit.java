// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Junit {
	@Test
	public void testFindMax() {
		assertEquals(4, Calculation.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Calculation.findMax(new int[] { -12, -3, -4, -2 }));

	}

}
