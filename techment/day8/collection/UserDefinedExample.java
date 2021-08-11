package com.techment.day8.collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.age==o.age) {
			return 0;
		}
		else if(this.age>o.age) {
			return -1;//to sort in ascending return 1
			// to sort in decending return -1
		}
		else {
			return 1;
		}
		
//		return 0;
	}
	
}

public class UserDefinedExample {

	public static void main(String[] args) {
		
	ArrayList<Employee> employee=new ArrayList<Employee>();	
	employee.add(new Employee(1,"ramesh","hr", 34));
	employee.add(new Employee(2,"sachin","manager", 45));
	employee.add(new Employee(3,"sunil","hr", 26));
	employee.add(new Employee(4,"manoj","developer", 30));
	System.out.println("before sorting");
	for(Employee emp:employee) {
		System.out.println(emp.id+""+emp.name+""+emp.dept+""+emp.age);
	}
Collections.sort(employee);
System.out.println("after sorting");
for(Employee emp:employee) {
	System.out.println(emp.id+""+emp.name+""+emp.dept+""+emp.age);
}
//System.out.println(employee);
	}
	

}
