package com.vineet.enumExample;

public enum Animal {
	CAT("myCat"), DOG("myDog"), MOUSE("myMouse");

	private String name;

	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	

}
