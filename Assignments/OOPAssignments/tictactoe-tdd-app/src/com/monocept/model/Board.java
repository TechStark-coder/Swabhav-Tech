// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.model;

public class Board {
	private static String[] pad;

	public static void gameWinner() {
		for (int a = 0; a < 8; a++) {
			@SuppressWarnings("unused")
			String line = null;

			switch (a) {
			case 0:
				line = pad[0] + pad[1] + pad[2];
				break;
			case 1:
				line = pad[3] + pad[4] + pad[5];
				break;
			case 2:
				line = pad[6] + pad[7] + pad[8];
				break;
			case 3:
				line = pad[0] + pad[3] + pad[6];
				break;
			case 4:
				line = pad[1] + pad[4] + pad[7];
				break;
			case 5:
				line = pad[2] + pad[5] + pad[8];
				break;
			case 6:
				line = pad[0] + pad[4] + pad[8];
				break;
			case 7:
				line = pad[2] + pad[4] + pad[6];
				break;
			}
		}
	}

	public void setPad() {
		return;
//		gameWinner();
	}

	public String getPad() {
		return pad[3];
	}

}