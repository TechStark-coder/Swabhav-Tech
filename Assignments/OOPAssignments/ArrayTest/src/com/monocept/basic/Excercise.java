package com.monocept.basic;

public class Excercise {
	public static void main (String[] args) {
		
	@SuppressWarnings("unused")
	int size;
	@SuppressWarnings("unused")
	String Breed;
	@SuppressWarnings("unused")
	String Name;
	}
	public int size;
	void bark() {
		System.out.println("ruff ruff" );
	}
	static class ExcerciseTestDrive {
		public static void main (String[] args) {
			Excercise d =  new Excercise();
			d.size = 40;
			d.bark();
			
		}
	}
	
}