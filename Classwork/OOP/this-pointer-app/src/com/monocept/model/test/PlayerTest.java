package com.monocept.model.test;

import com.monocept.model.GenderOption;
import com.monocept.model.Player;

public class PlayerTest {
	//static means no this method
	public static void main (String[] args) {
		Player p1 = new Player(101, "sachin",GenderOption.MALE,55);
		printDetails(p1);
		System.out.println();
		
		Player p2= new Player(102 , "virat");
		printDetails(p2);
			
		
	}
	private static void printDetails(Player p1) {
		System.out.println("id is " + p1.getid());
		System.out.println("name is " + p1.getname());
		System.out.println("gender " + p1.getgender());
		System.out.println("ages  : " + p1.getage());

}
}
