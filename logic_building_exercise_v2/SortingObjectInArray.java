package com.assigment.one;

import java.util.*;

class Products{
	int pid;
	String name;
	int price;
	public Products(int pid, String name, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class SortingObjectInArray {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Products> list=new ArrayList<>();
		for(int i=0;i<5;i++) {
			int pid=scanner.nextInt();
			String name=scanner.next();
			int price=scanner.nextInt();
			list.add(new Products(pid, name, price));
		}
		Collections.sort(list, new Comparator<Products>() {

			
//compare to object with name
			@Override
			public int compare(Products o1, Products o2) {
				//compare to object with name
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(list);
		

	}

}
