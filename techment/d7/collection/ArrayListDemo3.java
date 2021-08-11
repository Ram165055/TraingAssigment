package com.techment.d7.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> o1=new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		o1.add(6);
		System.out.println("elements are"+o1);
		ArrayList<Integer> o2=new ArrayList<Integer>();
		
		o2.add(100);
		o2.add(101);
		o2.add(102);
		o2.add(103);
		o2.add(104);
		o2.add(105);
		o2.add(3);
		o2.add(5);
		System.out.println("elements in o2"+o2);
//		o2.addAll(o1);//add all elements in o2 from o1
//		o2.removeAll(o1);//remove o1 elements present in o2
		System.out.println("before retaining"+o2);

		o2.retainAll(o1);//retains o1 all elements which present in o2
		System.out.println("after retaining"+o2);
		Collections.sort(o2);
		System.out.println("elements of o2 after sorting"+o2);

		
		
	}

}
