package com.wellington.challengejava.model;

public class Person {
	
	private String name;
	private String nationality;
	private String biggestDream;
	
	public Person(String name, String nationality, String biggest_dream) {
		this.name = name;
		this.nationality = nationality;
		this.biggestDream = biggest_dream;
	}
	
	public String getName() {
	return name;
	}
	
	public String getNationality() {
	return nationality;
	}
	
	public String getBiggestDream() {
	return biggestDream;
	}

}