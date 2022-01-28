// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tiktakjframe;

public class ResultAnalyser {
	private Board board;

	public ResultAnalyser(Board board) {
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	private boolean diagonally() {
		if (board.getCell(1).getCellValue() == board.getCell(5).getCellValue()
				&& board.getCell(5).getCellValue() == board.getCell(9).getCellValue()
				&& board.getCell(9).getCellValue() != Mark.EMPTY) {
			System.out.println(board.getCell(1).getCellValue() + "won the game,1 5 9 diagonal");
			return true;
		}
		if (board.getCell(3).getCellValue() == board.getCell(5).getCellValue()
				&& board.getCell(5).getCellValue() == board.getCell(7).getCellValue()
				&& board.getCell(7).getCellValue() != Mark.EMPTY) {
			System.out.println(board.getCell(3).getCellValue() + "won the game, 2 5 7 diagonally");
			return true;
		}
		return false;
	}

	private boolean horizontally() {
		if (board.getCell(1).getCellValue() == board.getCell(2).getCellValue()
				&& board.getCell(2).getCellValue() == board.getCell(3).getCellValue()
				&& board.getCell(3).getCellValue() != Mark.EMPTY) {
			System.out.println(board.getCell(1).getCellValue() + "won the game, 1 2 3 horizontally");
			return true;
		}
		if (board.getCell(4).getCellValue() == board.getCell(5).getCellValue()
				&& board.getCell(5).getCellValue() == board.getCell(6).getCellValue()
				&& board.getCell(6).getCellValue() != Mark.EMPTY) {
			System.out.println(board.getCell(4).getCellValue() + "won the game, 4 5 6 horizontally");
			return true;
		}
		if (board.getCell(7).getCellValue() == board.getCell(8).getCellValue()
				&& board.getCell(8).getCellValue() == board.getCell(9).getCellValue()
				&& board.getCell(9).getCellValue() != Mark.EMPTY) {
			System.out.println(board.getCell(7).getCellValue() + "won the game, 7 8 9 horizontally");
			return true;
		}

		return false;
	}

	private boolean vertically() {
		if (board.getCell(1).getCellValue() == board.getCell(4).getCellValue()
				&& board.getCell(4).getCellValue() == board.getCell(7).getCellValue()
				&& board.getCell(7).getCellValue() != Mark.EMPTY) {
			System.out.println(board.getCell(1).getCellValue() + "won the game, 1 4 7 vertically ");
			return true;
		}
		if (board.getCell(2).getCellValue() == board.getCell(5).getCellValue()
				&& board.getCell(5).getCellValue() == board.getCell(8).getCellValue()
				&& board.getCell(8).getCellValue() != Mark.EMPTY) {
			System.out.println(board.getCell(2).getCellValue() + "won the game,2 5 8 vertically");
			return true;

		}

		if (board.getCell(3).getCellValue() == board.getCell(6).getCellValue()
				&& board.getCell(6).getCellValue() == board.getCell(9).getCellValue()
				&& board.getCell(9).getCellValue() != Mark.EMPTY) {
			System.out.println(board.getCell(3).getCellValue() + "won the game, 3 6 9 vertically");
			return true;
		}

		return false;
	}

	public Result checkResult() {
		while (!board.isBoardEmpty()) {
			if (vertically() || horizontally() || diagonally()) {
				return Result.WIN;
			}
			for (int i = 1; i <= 9; i++) {
				if (!board.getCell(i).getCellValue().equals(Mark.EMPTY)) {
					return Result.DRAW;
				}
			}
			return Result.RUNNING;
		}
		return Result.RUNNING;

	}
}