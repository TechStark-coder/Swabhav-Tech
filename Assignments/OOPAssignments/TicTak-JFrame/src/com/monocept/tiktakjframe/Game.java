// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tiktakjframe;

public class Game {
	private ResultAnalyser resultAnalyzer;
	private Player[] players;
	private Result status;
	private Board board;
	int playerChanger = 0;

	public Game(Board board, ResultAnalyser resultAnalyser, Player[] players) {
		this.board = board;
		this.resultAnalyzer = resultAnalyser;
		this.players = players;
	}

	public void play(int cellPosition) throws InvalidCellPositionException, InvalidMarkedException {
		if (playerChanger % 2 != 0) {
			board.markCell(cellPosition, players[0].getMarkType());
			playerChanger++;
			return;
		}
		board.markCell(cellPosition, players[1].getMarkType());
		playerChanger++;
	}

	public Player currentPlayer() {
		if (playerChanger % 2 != 0) {
			playerChanger++;
			return players[0];
		}
		playerChanger++;
		return players[1];
	}

	public ResultAnalyser getResultAnalyzer() {
		return resultAnalyzer;
	}

	public Player[] getPlayers() {
		return players;
	}

	public Result getStatus() {
		return resultAnalyzer.checkResult();
	}

	public Board getBoard() {
		return board;
	}

}
