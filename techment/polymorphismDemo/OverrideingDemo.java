package com.techment.polymorphismDemo;
class Bank{
	public void rateOfInterest() {
		System.out.println("3%");
	}
}
class SBI extends Bank{
	@Override//this annotation tell that this method is override from parent class,if we use this annotation and that method is not present in parent class then show error
	public void rateOfInterest() {
		System.out.println("5%");
	}
	
}
class AXIS extends Bank{
	public void rateOfInterest() {
		System.out.println("7%");
	}
	
}

public class OverrideingDemo {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		AXIS axis=new AXIS();
		axis.rateOfInterest();
		Bank bank=new AXIS();//upcasting
//		bank.rateOfInterest()//we not called child class method with parent class reference if child class method is not present in parent class
	}

}
