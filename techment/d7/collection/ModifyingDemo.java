package com.techment.d7.collection;

import java.util.ArrayList;

public class ModifyingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> o1=new ArrayList<>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		
		for(int i:o1) {
			if(i>3) {
//				o1.add(100);
				
				
			}
			System.out.println(i);
		}

	}

}
