package com.techment.d7.collection;

import java.util.ArrayList;

public class EnhansedForLoop {

	public static void main(String[] args) {
		ArrayList<Integer> o1=new ArrayList<>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		//autoboxing
		for(int o:o1) {
			System.out.println(o);
		}

	}

}
