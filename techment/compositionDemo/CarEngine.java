package com.techment.compositionDemo;
class Car{
	String Name;
	String Model;
	Engine engine;
	public Car(String name, String model, Engine engine) {
		super();
		Name = name;
		Model = model;
		this.engine = engine;
	}
	void carDisplay() {
		System.out.println("Name "+Name);
		System.out.println("Model "+Model);
		System.out.println("engineId"+engine.engineId);
		System.out.println("engineType "+engine.engineType);
	}
}
class Engine{
	int engineId;
	int engineType;
	public Engine(int engineId, int engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
}

public class CarEngine {
	public static void main(String[] args) {
		Engine engine=new Engine(101,2);
		Car car1=new Car("abc","cde",engine);
		Car car2=new Car("123","456",engine);
		Car car3=new Car("$$$","%%%",engine);
		car1.carDisplay();
		car2.carDisplay();
		car3.carDisplay();
	}

}
