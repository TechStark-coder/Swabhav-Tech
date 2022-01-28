// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.tiktakjframe;

public class Player {
	private String playerName;
	private Mark markType;

	public Player(String playerName, Mark markType) {
		this.playerName = playerName;
		this.markType = markType;
	}

	public String getPlayerName() {
		return playerName;
	}

	public Mark getMarkType() {
		return markType;
	}

}
