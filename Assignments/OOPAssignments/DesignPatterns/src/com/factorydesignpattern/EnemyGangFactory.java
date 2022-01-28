// Copyright to user asif 2021 
//all rights reserved */
package com.factorydesignpattern;

public class EnemyGangFactory {
	public Avengers makeEnemyGang(String newGangType) {
		Avengers newShip = null;
		if (newGangType.equals("U")) {
			return new Ultron();
		} else if (newGangType.equals("T")) {
			return new Thanos();
		} else if (newGangType.equals("D")) {
			return new Dormamu();
		} else
			return null;

	}

}
