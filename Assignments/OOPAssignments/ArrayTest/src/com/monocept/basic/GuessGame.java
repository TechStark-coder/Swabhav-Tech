package com.monocept.basic;

import java.util.Scanner;

public class GuessGame {

	@SuppressWarnings("unused")
	public static void guessingNumberGame() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int) (100 * Math.random());
		System.out.println(number);

		int trials = 10;
		String String = "yes";
		int i, guess;

		System.out.println("Guess a number between 1 - 100, you have 10 chance");
		//Object Calisthenics
		for (i = 0; i < trials; i++) {
			System.out.println("Guess the number:");
			guess = sc.nextInt();

			if (number == guess) {
				System.out.println("Congratulations! You guessed the number");
				break;
			} else if (number > guess && i != trials - 1) {
				System.out.println("The number is " + "higher than" + guess);
			} else if (number < guess && i != trials - 1) {
				System.out.println("The number is" + " lower than " + guess);
			}
		}

		if (i == trials) {
			System.out.println("You have comleted" + "  trials");

			System.out.println("The number was " + number);
//			System.out.println("To start the game again press 1 ");
		}
		trials++;
		System.out.println();
		System.out.println("you have finished  in " + i + " trials\n\n");
	System.out.println("do you want to continue the game Y/N");
//	Scanner Yes = null;
//	if (sc == Yes) {
//		Scanner sc2 = new Scanner(System.in);
//		guess = sc2.nextInt();
//		guessingNumberGame();
//	}
	}
	public static void main(String arg[]) {

		guessingNumberGame();
	}
}
