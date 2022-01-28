// Copyright to user asif 2021
//all rights reserved */
package com.monocept.model;

public class Cell {
	private Markk markk = Markk.X;

	public void Cell() {
		this.markk = markk.X;
	}

	public Boolean isEmpty() {
		if (this.markk == markk.X) {
			return true;
		}
		return null;
	}

	public void markkCell(Markk markk) throws CellMarked {
		if (this.isEmpty()) {
			throw new CellMarked("Cell marked");
		}
		this.markk = markk;
	}

//	public Boolean isEmpty() {
//		if (this.markk ==  markk.X) {
//			return true;
//		}

//		return String;
	public void setMarker(Markk marker) throws Exception {
		if (this.markk == markk.X) {
			this.markk = marker;
		} else {
			throw new Exception("invalid");
		}
//		this.markk = marker;
	}

	public Markk getMarkk() {
		return markk;
	}

}
