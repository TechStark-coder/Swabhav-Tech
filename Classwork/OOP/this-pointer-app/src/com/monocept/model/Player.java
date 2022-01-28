package com.monocept.model;

public class Player {
	private int id;
	private String name;
	private GenderOption gender;
	private int age;

	public Player(int id, String name, GenderOption gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Player(int id, String name) {
		this(id, name, GenderOption.MALE, 30);
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public GenderOption getgender() {
		return gender;
	}

	public int getage() {
		return age;
	}
}
