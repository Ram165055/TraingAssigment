package com.techment.d7.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> o1=new ArrayList<>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		ListIterator<Integer>itr=o1.listIterator();
		System.out.println("forword direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("backword direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
