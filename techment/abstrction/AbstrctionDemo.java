package com.techment.abstrction;
abstract class Bank{
	void Eligibility() {
		System.out.println("above 18 can open an account");
	}
	abstract int rateOfInterest(int interestRate);
}
//when any class extends abstrct class  means ,it need to provide implementation of abstcrt method(override)
class Axis extends Bank{

	@Override
	int rateOfInterest(int interestRate) {
		interestRate=2*interestRate;
		System.out.println("Axis Bank"+interestRate);
		return interestRate;
	}
	
}
class Kotak extends Bank{

	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("Kotak Bank" +interestRate);
		return interestRate;
	}
	
}

public class AbstrctionDemo {
public static void main(String[] args) {
	Bank bank=new Kotak();
	System.out.println(bank.rateOfInterest(5));
}
}
