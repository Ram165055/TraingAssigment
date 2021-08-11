package com.techment.day8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}
class AgeSorting implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
if(o1.age==o2.age) {
	return 0;
}
else if(o1.age>o2.age) {
	return 1;
}
else return -1;

//		return 0;
	}
	
}
class NameSorting implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComapatorDemo {

	public static void main(String[] args) {
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(new Student(1,"mahesh", 34));
		slist.add(new Student(3,"rohit", 19));
		slist.add(new Student(1,"NKIT", 20));
		slist.add(new Student(1,"rahul", 17));
		System.out.println("without sort");
		for(Student s:slist){
			System.out.println(s);
		}
		System.out.println("sort for age");
		Collections.sort(slist,new AgeSorting() );
		for(Student s:slist) {
			System.out.println(s);
		}
		System.out.println("sort by anme");
		Collections.sort(slist,new NameSorting() );
		for(Student s:slist) {
			System.out.println(s);
		}
		
	}

}
