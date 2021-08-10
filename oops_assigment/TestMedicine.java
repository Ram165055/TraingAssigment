package com.assigment.oops;

import java.util.Random;

abstract class Medicine{
	int price;
	String date;
	abstract void displayLabel();
	void getDetails(){
		System.out.println("price :"+price+",date"+date);
	}
}
class Tablet extends Medicine{

	@Override
	void displayLabel() {
		getDetails();
		System.out.println("Tablet it could be store in a cool dry place");
	}
	
}
class Syrup extends Medicine{

	@Override
	void displayLabel() {
		getDetails();
		System.out.println("cold syrup");
	}
	
}
class Ointment extends Medicine{

	@Override
	void displayLabel() {
		getDetails();
		System.out.println("Ointmet for external use only");
	}
	
}

public class TestMedicine {

	public static void main(String[] args) {
		Random random=new Random();
		
Medicine[] medicine=new Medicine[5];
for(int i=0;i<medicine.length;i++) {
	int num=random.nextInt(3)+1;
	if(num==1) {
		medicine[i]=new Tablet();
		medicine[i].price=i;
		medicine[i].date="4 aug Tablet";
	}
	else if(num==2) {
		medicine[i]=new Syrup();
		medicine[i].price=i;
		medicine[i].date="5 aug Syrup";
	}
	else {
		medicine[i]=new Ointment();
		medicine[i].price=i;
		medicine[i].date="4 aug Ointment";
	}
}
for(int i=0;i<medicine.length;i++) {
	System.out.println("i="+i);
	medicine[i].displayLabel();
}




	}

}
