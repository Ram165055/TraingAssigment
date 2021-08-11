package com.techment.day8.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(12);
		hs.add(6);
		hs.add(5);
		System.out.println(hs);
		LinkedHashSet lhs=new LinkedHashSet();//mentain insertion order
		lhs.add(5);
		lhs.add(3);
		lhs.add("sachin");//allow different type of data
		System.out.println(lhs);
		
		TreeSet ts=new TreeSet();//default natural sorting
		ts.add(1);
		ts.add(100);
		ts.add(3);
//		ts.add("sachin");//same type of data allow in treeSet
		System.out.println(ts);
	}

}
