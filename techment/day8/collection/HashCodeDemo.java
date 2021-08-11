package com.techment.day8.collection;

public class HashCodeDemo {

	public static void main(String[] args) {
		
String a="hello";
String b="hello";
Integer x=123;
int p=5;
System.out.println(a.hashCode());
System.out.println(b.hashCode());//every object has hashcode in java
System.out.println(x.hashCode());//for Integer hashcode  of integer is as value
//System.out.println(p.hashCode());//hashcode is not for primitive data type
	}

}
