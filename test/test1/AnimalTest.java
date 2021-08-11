package com.test1;
class Animal{
	void shout() {
		System.out.println("Animal shout");
	}
}
class Dog extends Animal{
	@Override
	void shout() {
		System.out.println("Dog shout");
	}
}
class Horse extends Animal{
	@Override
	void shout() {
		System.out.println("Horse shout");
	}
}
class Cat extends Animal{
	@Override
	void shout() {
		System.out.println("Cat shout");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		Horse horse=new Horse();
		horse.shout();
		Cat cat=new Cat();
		cat.shout();
		
		

	}

}
