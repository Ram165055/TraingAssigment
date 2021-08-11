package com.techment.interfacedemo;
interface One{
	void greet1();
}
interface Two{
	void greet2();
}
class Manager{
	void operationRegion() {
		
	}
}//first extend then implements
class Employee2 extends Manager implements One,Two{

	@Override
	public void greet2() {
		
		
	}

	@Override
	public void greet1() {
		
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		

	}

}
