package com.techment.interfacedemo;
interface Bank1{
	void rateOfInterface();
}
class Axis1 implements Bank1{

	@Override
	public void rateOfInterface() {
		// TODO Auto-generated method stub
		
	}
	
}
class Kotak1 implements Bank1{

	@Override
	public void rateOfInterface() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		Bank1 bank1=new Axis1();
		bank1.rateOfInterface();
	}

}
