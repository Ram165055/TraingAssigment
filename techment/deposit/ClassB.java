package com.techment.deposit;

public class ClassB {
public static void main(String[] args) {
	classA classA=new classA();
//	System.out.println(classA.a);//a is private we cannot access
	System.out.println(classA.b);
	System.out.println(classA.c);
	System.out.println(classA.d);
}
}
