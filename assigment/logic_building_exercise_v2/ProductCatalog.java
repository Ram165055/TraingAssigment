package com.assigment.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductCatalog {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Product product1=new Product();
		Product product2=new Product();
		Product product3=new Product();
		product1.setProductId(0);
		product2.setProductId(1);
		product3.setProductId(2);
		product1.setProductName("abc");
		product2.setProductName("def");
		product3.setProductName("ghi");
		product1.setProductPrice(10);
		product2.setProductPrice(100);
		product3.setProductPrice(1000);
		ArrayList<Product> list=new ArrayList<>();
		
		list.add(product1);
		list.add(product2);
		list.add(product3);

		try {
		int productId=scanner.nextInt();
		Iterator<Product>iter=list.iterator();
		while(iter.hasNext()) {
			if(list.get(productId)==iter.next()) {
				System.out.println(list.get(productId));
				
			}
			
		}
		}
		catch (Exception e) {
			
			System.out.println("not found");
		}

	 
	}

}
 class Product{
	private int productId;
	private String productName;
	private int productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductCatalog [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
 }

