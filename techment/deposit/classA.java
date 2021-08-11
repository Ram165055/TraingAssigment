package com.techment.deposit;

public class classA {
	private int a=1;
	int b=2;//this is default access modifier
	protected int c=3;
	public int d=4;
public static void main(String[] args) {
	classA classA=new classA();
	System.out.println(classA.a);//private is access in same class
	System.out.println(classA.b);//default is access in same class
	System.out.println(classA.c);//protected is access in same class
	System.out.println(classA.d);//public is access in any where in any package
	
}
}
