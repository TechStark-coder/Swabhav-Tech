// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tiktakjframe;

public class Cell {
	private Mark mark = Mark.EMPTY;

	public Mark getCellValue(){
		return mark;
	}

	public void setCellValue(Mark cellValue) throws InvalidMarkedException {
		if (this.getCellValue() != Mark.EMPTY) {
			throw new InvalidMarkedException("already has value");
		}
		this.mark = cellValue;
	}

}
