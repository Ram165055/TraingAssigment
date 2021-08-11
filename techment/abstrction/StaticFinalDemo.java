package com.techment.abstrction;
class Employee{
	static String dept;//it can be changed ,static variale sare same memory among all the object
	final int a=100; //it cannot be changed/reinitialised
	
	int b=3;
}

public class StaticFinalDemo {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		employee1.dept="hr";
		employee2.dept="developer";
		System.out.println(employee1.dept);//developer because static variable share value among all the object
		System.out.println(employee2.dept);//developer because of static variable
//		employee1.a=100;//show error because final variale cannot be reassigned
		employee1.b=4;
		employee2.b=5;
		System.out.println(employee1.b);//4 because of non static every object has different value
		System.out.println(employee2.b);//5 //because of non static every object has different value
	}

}
