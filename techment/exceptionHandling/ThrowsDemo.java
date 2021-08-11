package com.techment.exceptionHandling;

import java.io.FileNotFoundException;

class Employee{
	void checkEligibility(int age) throws FileNotFoundException {
		if(age==18)
			System.out.println();
		
		else
			throw new FileNotFoundException("you can cannot");
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
	
Employee employee=new Employee();
employee.checkEligibility(0);
	}

}
