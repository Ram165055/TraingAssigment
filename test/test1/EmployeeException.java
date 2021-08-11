package com.test1;

import com.assigment.array.ArraySort;

class NameException extends Exception{
	public NameException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}
class Employee1{
	private String firstName;
	private String lastName;
	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	void validate() throws NameException {
		if(firstName==null&&lastName==null) {
			throw new NullPointerException("Entry Missing");
		}
		else if(firstName.length()<3&&lastName.length()<3) {
			throw new NameException("name should be minimum 3 character");
		}
	}
}

public class EmployeeException {

	public static void main(String[] args){
		Employee1 employee1=new Employee1(null, null);
		Employee1 employee12=new Employee1("a","b");
		
		try {
			employee12.validate();
		} catch (NameException e) {
			System.out.println(e.getMessage());
		}
		try {
			employee1.validate();
		} catch (NameException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
