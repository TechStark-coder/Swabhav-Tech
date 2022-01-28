// Copyright to user asif 2021 
//all rights reserved */
package com.factorydesignpattern;

public abstract class Avengers {
	private String name;
	private double amtKill;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public double getKill() {
		return amtKill;
	}

	public void setKill(double newKill) {
		amtKill = newKill;
	}

	public void followSuperHero() {
		System.out.println(getName() + " is following the avenger!");
	}

	public void displayEnemy() {
		System.out.println(getName() + " is on target!");
	}

	public void enemyShoot() {
		System.out.println(getName() + " attacks and does " + getKill() + " damage to Iron Man");
	}

}
