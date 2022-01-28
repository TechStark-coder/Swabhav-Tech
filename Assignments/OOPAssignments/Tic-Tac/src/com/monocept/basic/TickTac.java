// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.util.*;

public class TickTac {
	static String[] pad;
	static String turn;
//	static String name;

	static String gameWinner() {
		for (int a = 0; a < 8; a++) {
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
			if (line.equals("XXX")) {
				return "X";
			}

			else if (line.equals("OOO")) {
				return "O";
			}
		}
//		if (winner.equalsIgnoreCase("draw")) 

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(pad).contains(String.valueOf(a + 1))) {
				break;
			} else if (a == 8) {
				return "draw";
			}
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}
//	System.out.println("Welcome to Tic Tac.");

	static void printPad() {
		System.out.println("---------");
		System.out.println(pad[0] + pad[1] + pad[2]);
		System.out.println(pad[3] + pad[4] + pad[5]);
		System.out.println(pad[6] + pad[7] + pad[8]);
		System.out.println("---------");
	}

//	if (line.equals("XXX")) {
//		return "X";
//	}
//
//	else if (line.equals("OOO")) {
//	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		pad = new String[9];
		turn = "X";
		String winner = null;

		for (int a = 0; a < 9; a++) {
			pad[a] = String.valueOf(a + 1);
		}

		System.out.println("Welcome to Tic Tac.");
		printPad();

		System.out.println("X will play first:");

		while (winner == null) {
			int numInput;
			try {
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("Invalid input re-enter  number:");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input re-enter  number:");
				continue;
			}

			if (pad[numInput - 1].equals(String.valueOf(numInput))) {
				pad[numInput - 1] = turn;

				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}

				printPad();
				winner = gameWinner();
			} else {
				System.out.println("already taken; re-enter  number:");
			}
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing");
		}

		else {
			System.out.println("Congratulations" + winner + "'s have won! Thanks for playing.");
		}
	}
}
