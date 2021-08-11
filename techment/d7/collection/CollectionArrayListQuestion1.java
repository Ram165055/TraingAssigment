package com.techment.d7.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayListQuestion1 {

	public static void main(String[] args) {
		ArrayList batch1=new ArrayList();
		batch1.add("Sachin");
		batch1.add("Ravi");
		batch1.add("Kumar");
		batch1.add("Sowmya");
		ArrayList batch2=new ArrayList();
		batch2.add("Sourab");
		batch2.add("Manish");
		batch2.add("Sachin");
		batch2.add("Ankit");
		batch2.add("Kumar");
		
System.out.println(batch1);	
System.out.println(batch2);
		for (Object object : batch1) {
			if(batch2.contains(object)) {
				batch2.remove(object);
			}
		}
		batch2.addAll(batch1);
		System.out.println(batch2);
		
		Collections.sort(batch2);
		System.out.println(batch2);
		
	}

}
