package com.test1;

public class Employee {
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public static void main(String[] args) {
		Employee employee=new Employee("Ram","Kumar");
		System.out.println("printing instance of employee direct");
		System.out.println(employee);
		Employee employee2=new Employee("Rahul","Kumar");
		Employee employee3=new Employee("Ramesh","Kumar");
		System.out.println("printing object using to string method");
		System.out.println(employee.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());

	}

}
