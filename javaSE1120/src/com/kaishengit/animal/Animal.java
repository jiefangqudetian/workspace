package com.kaishengit.animal;

public abstract class Animal {

	
	
	public abstract void eat();
	
	public void sleep(Animal animal) {
		System.out.println("i want sleep..");
	}
	
	public Animal getAnimal() {
		return new Dog();
	}
}
