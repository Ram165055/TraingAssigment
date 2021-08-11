package com.techment.d7.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> o1=new ArrayList<>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		System.out.println(o1);
		Iterator<Integer>itr=o1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
