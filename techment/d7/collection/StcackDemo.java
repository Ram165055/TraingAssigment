package com.techment.d7.collection;

import java.util.Stack;

public class StcackDemo {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(1);
		s1.add(2);
		s1.push(3);
		System.out.println(s1);
		s1.pop();
//		s1.remove(1);
		System.out.println(s1.peek());
		

	}

}
