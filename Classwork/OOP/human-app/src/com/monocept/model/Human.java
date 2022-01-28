package com.monocept.model;

public class Human {
	private String name;
	private float height;
	private float weight;
	private int age;
	private static int count=0;
	
	public Human(String name,float height,float weight, int age ){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		count+=1;
	}

	public Human(String name, float age ) {
		this(name,age, 40f,5);
		//count+=1;
		
	}
	public String getname() {
		return name;
	}

	public float getheight() {
		return height;
	}
	public float getweight() {
		return weight;
	}

	public int getCount() {
		return count;
	}
	public static int headCount() {
		return count;
		
	}
}
