package com.techment.collectionbasic;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int a=100;///primitive
		Integer b=a;//autoboxing//assigning primitive to object
		
		int c=b.intValue();//unboxing//assigning object to primitive
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
