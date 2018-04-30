package com.kaishengit.animal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		Fish fish = new Fish();
		cat.eat();
		cat.sleep(dog);
		Animal animal = dog.getAnimal();
		dog = (Dog)dog.getAnimal();
		dog = (Dog)cat.getAnimal();
		
	 animal = dog;
	 dog = (Dog)animal;
	 Child jack = new Child();
	 jack.feedanimal(pig);
	 dog=(Dog)jack.getanimal();
		
	}

}
