package com.techment.d7.collection;

import java.util.*;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList obj=new ArrayList();
	System.out.println("before adding size of arrayList"+obj.size());
	int a=1;
	obj.add(a);//automaticaly convert primitive to object type
	obj.add("Ram");
	obj.add(2.0);
	System.out.println("after adding elemnt size of arraylist"+obj.size());
	System.out.println("element in arralist"+obj);
	obj.add(1, "hello");
	System.out.println("element in 1st index"+obj);
	obj.remove("hello");
	System.out.println("element after removing hello"+obj);
	obj.remove(1);//remove element at index 1
	obj.remove(Integer.valueOf(1));//remove element 1
	System.out.println("element in the list after removing"+obj);
	System.out.println("element at 2nd index"+obj.get(2));
	
}
}
