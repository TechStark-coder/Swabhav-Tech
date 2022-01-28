// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.test;

import org.junit.Test;

import com.monocept.model.Cell;
import com.monocept.model.Markk;

public class CellTest {

	@Test
	public void checkIfCellIsInitiallyEmpty() {
//		String X = "X";
		Cell c1 = new Cell();
		@SuppressWarnings("unused")
		Markk expectedMarkk = Markk.X;
		assertequals(Markk.X, c1.getMarkk());

		Cell c2 = new Cell();
		@SuppressWarnings("unused")
		Markk expectedMarkk1 = Markk.O;
		assertequals(Markk.O, c2.getMarkk());

		Cell c3 = new Cell();
		@SuppressWarnings("unused")
		Markk expectedMarkk11 = Markk.Empty;
		assertequals(Markk.Empty, c3.getMarkk());

	}

	@Test
	public void ShouldBeAbleToMarkCellWithX() throws Exception {
		Cell c1 = new Cell();
		Markk expectedMark = Markk.X;
		c1.setMarker(Markk.X);
		assertequals(expectedMark, c1.getMarkk());
	}

	private void assertequals(Markk x, Markk markk) {
		// TODO Auto-generated method stub

	}

}
