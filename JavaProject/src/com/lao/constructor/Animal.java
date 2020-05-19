package com.lao.constructor;

public class Animal {

	//Parameterized Constructor
	
	String animal_name;
	String animal_type;

	Animal(String name, String type) {
		animal_name = name;
		animal_type = type;
	}

	public void sayAboutAnimal() {
		System.out.println("Animal name is " + animal_name + "and type is " + animal_type);
	}

	public static void main(String[] args) {

		Animal animal1 = new Animal("Duck", "Omnivores");
		animal1.sayAboutAnimal();

		Animal animal2 = new Animal("Karadi", "Omnivores");
		animal2.sayAboutAnimal();
	}

}
