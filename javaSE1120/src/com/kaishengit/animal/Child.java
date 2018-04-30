package com.kaishengit.animal;

public class Child {
	
	public void feedanimal(Animal animal) {
		animal.eat();
		
	}
	
	public Animal getanimal()  {
		return new Dog();
		
	}

}
