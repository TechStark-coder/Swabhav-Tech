// Copyright to user asif 2021 
//all rights reserved */
package com.factorydesignpattern;

import java.util.Scanner;

public class HeroTest {
	public static void main(String[] args) {
		EnemyGangFactory enemyFactory = new EnemyGangFactory();
		Avengers theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		System.out.print("What type of enemy ? (U / T / D)");
		if (userInput.hasNextLine()) {
			String typeGang = userInput.nextLine();
			theEnemy = enemyFactory.makeEnemyGang(typeGang);
			if (theEnemy != null) {
				doAttack(theEnemy);
			} else
				System.out.println("pls enter U/T/D in next time");
		}

	}

	private static void doAttack(Avengers AvtheEnemy) {
		AvtheEnemy.displayEnemy();
		AvtheEnemy.followSuperHero();
		AvtheEnemy.enemyShoot();

	}

}
