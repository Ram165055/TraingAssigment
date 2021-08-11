package com.techment.d7.collection;

import java.util.LinkedList;

public class LinkedLIstDemo {

	public static void main(String[] args) {
		LinkedList o1=new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.addFirst(100);
		o1.addLast(1000);//same as add only
		
		System.out.println(o1);
		o1.removeFirst();
		o1.removeLast();
		System.out.println(o1);
	}

}
