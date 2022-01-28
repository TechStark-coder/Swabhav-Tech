package com.monocept.model;

import java.util.Scanner;

import javax.swing.JFrame;

public class demo2 extends JFrame {
	Scanner input = new Scanner(System.in);
	private String a;
	private String b;

	public String getA() {
		return a;

	}

	public String getB() {
		return b;

	}

	public void setValue(String whatIsA, String whatIsB) {
		a = whatIsA;
		b = whatIsB;

	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public void demo2() {
		System.out.println("Please enter value for A >>");
		input.nextLine();
		a = input.nextLine();
		System.out.println("Please enter value for B >>");
		input.nextLine();
		b = input.nextLine();
	}

}