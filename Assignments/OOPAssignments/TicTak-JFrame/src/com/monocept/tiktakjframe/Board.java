// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tiktakjframe;

public class Board {
	private Cell[] cells = new Cell[9];

	public Board() {
		for (int i = 0; i < 9; i++) {
			cells[i] = new Cell();
		}
	}

	public void markCell(int position, Mark mark) throws InvalidMarkedException, InvalidCellPositionException {
		if (position - 1 <= 8 && position - 1 >= 0) {
			cells[position - 1].setCellValue(mark);
			return;
		}
		throw new InvalidCellPositionException("cell position is not valid");
	}

	public Cell getCell(int position) {
		return cells[position - 1];
	}

	public Cell[] getCells() {
		return cells;
	}

	public boolean isBoardEmpty() {
		for (int i = 0; i <= 8; i++) {
			if (!cells[i].equals(Mark.EMPTY)) {
				return false;
			}
		}
		return true;
	}

}
