// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monocept.model.Board;

public class BoardTest {
	@Test
	public void PadTest() {
		Board p = new Board();
		int expectedValue = 3;
		p.setPad();
		assertEquals(expectedValue, p.getPad());
	}

//		Pad pad = new Pad();
//		pad.setPad();
//		String expectedSize = "3";
//		assertEquals(expectedSize, pad.getPad());
}