package com.techment.polymorphismDemo;
class Hello{
	public void write(int num) {
		System.out.println("you have wirtten numer anm name is"+num);
	}
	public void write(String msg) {
		System.out.println("you have written character anme number is"+msg);
	}//overloading
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello hello=new Hello();
hello.write(0);
hello.write(null);
hello.add(0, 0);
hello.add(0, 0, 0);
	}

}
