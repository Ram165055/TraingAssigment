package com.techment.d7.collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();//it can store any type of object
		a1.add(1);
		a1.add("abc");
		ArrayList<Integer> a2=new ArrayList<>();//default capacity 10
		a2.add(1);
//		a2.add("sbc");//because this is a tpye of Interger cannot store string
		ArrayList<String> a3=new ArrayList<>(100);//default capacity become 100
		
		
	}

}
