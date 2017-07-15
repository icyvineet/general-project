package com.vineet.enumExample;

public class App {

	public static void main(String[] args) {

		Animal animal = Animal.CAT;
		
		
		switch(animal){
		case CAT:
			System.out.println("This cat is: " + animal.getName());
			System.out.println("This cat is: " + animal.name());
			System.out.println("This cat as toString() is: " + animal.toString());
			break;
		case DOG:
			System.out.println("This dog is: " + animal);
			break;
		case MOUSE:
			System.out.println("This mouse is: " + animal);
			break;
		default:
			System.out.println("This  is not a matching animal : " + animal);
			break;
		
		
		
		}
			
		
	}

}
