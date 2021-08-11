package com.techment.day8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
	int id;
	String name;
	int price=500;
	int quantity;
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
class SortProductQuantity implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.quantity>o2.quantity) {
			return -1;
		}
		else if(o1.quantity==o2.quantity) {
			return 0;
		}
		else return 1;
//		return 0;
	}
	
}
class SortPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price==o2.price) {
			return 0;
		}
		else if(o1.price>o2.price) {
			return 1;
		}
		else return -1;
//		return 0;
	}
	
}

public class SortingPractice {

	public static void main(String[] args) {
		ArrayList<Product> plist=new ArrayList<Product>();
		plist.add(new Product(1,"ram",10, 1));
		plist.add(new Product(2,"rom",100, 2));
		plist.add(new Product(3,"cpu",1000, 3));
		plist.add(new Product(4,"ssd",10000, 4));
		System.out.println("all product");
		for(Product p:plist) {
			System.out.println(p);
		}
System.out.println("sorting in quantity");
Collections.sort(plist,new SortProductQuantity());
for(Product p:plist) {
	System.out.println(p);
}
System.out.println("sorting in price");
Collections.sort(plist,new SortPrice());
for(Product p:plist) {
	System.out.println(p);
}
System.out.println("roduct which has price greter than 500");
for(Product p:plist) {
	if(p.price>500) {
		System.out.println(p);	
	}
	
}

	}
	

}
