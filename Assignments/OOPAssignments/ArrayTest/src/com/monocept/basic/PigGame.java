package com.monocept.basic;

import java.util.Scanner;

public class PigGame {
	public static <totalScore> void main(String[] args) {
		int winPoints = 20;
		@SuppressWarnings("unused")
		int playerPoints = 0;
		int playerNumber = 0;
		int totalScore = 0;
		@SuppressWarnings("unused")
		int turn = 1;
		String roll = "r";
		System.out.println("Let's Play PIG!");
		System.out.println("See how many turns it takes you to get to 20.");
		System.out.println("Turn ends when you hold or roll a 1");
		System.out.println("If you roll a 1, you lose all points for the turn");
		System.out.println("If you hold, you save all points for the turn.");
		String resumeGame = "yes";
		if (resumeGame.equals("yes")) {
			totalScore = 0;
			@SuppressWarnings("unused")
			int turns = 1;
			if (totalScore < winPoints) {
				System.out.println("TURN" + turns);
				System.out.println("roll or hold ? (r/h)");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				roll = sc.next();
				playerPoints = 0;
				while (roll.equals(roll)) {
					playerNumber = (int) (Math.random() * 6+1);
					
					if (playerNumber ==1) {
						playerPoints = 0;
						System.out.println("die:" + playerNumber);
						System.out.println("Turn over. No score.");
						break;
					}
					if (playerPoints  < winPoints) {
						System.out.println("die: " + playerNumber);
						playerPoints = playerPoints + playerNumber;
						System.out.println("roll or hold ? (r/h)");
						roll = sc.next();
					}
					if (roll.contentEquals("h")) {
						System.out.println("score for turn : " + playerPoints);
						totalScore = totalScore+playerPoints;
						System.out.println("roll or hold ? (r/h)");
						break;
					}
				}
				System.out.println("you havr finished in " + turns );
//				System.out.println("do you want to continue playing ?");
//				@SuppressWarnings("resource")
//				Scanner sc1 = new Scanner(System.in);
//				resumeGame = sc1.nextLine();
//				roll = sc1.next();
				
			}		
		}
	}
}
