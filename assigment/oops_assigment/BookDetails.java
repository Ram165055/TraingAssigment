package com.assigment.oops;

import java.util.Scanner;

class Book{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
class EngineeringBook extends Book{
	private String catagory;

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
}

public class BookDetails {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter bookNo");
		int bookNo=scanner.nextInt();
		System.out.println("enter book title");
		String title=scanner.next();
		System.out.println("enter book author");
		String author=scanner.next();
		System.out.println("enter book price");
		float price=scanner.nextFloat();
		System.out.println("enter book catagory");
		String catagory=scanner.next();
		
		Book book=new Book();
		book.setBookNo(bookNo);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
		System.out.println("book details");
		System.out.println("bookNo :"+book.getBookNo());
		System.out.println("book title :"+book.getTitle());
		System.out.println("book author :"+book.getAuthor());
		System.out.println("book price :"+book.getPrice());
		EngineeringBook engineeringBook=new EngineeringBook();
engineeringBook.setBookNo(bookNo);
engineeringBook.setTitle(title);
engineeringBook.setAuthor(author);
engineeringBook.setPrice(price);
engineeringBook.setCatagory(catagory);
System.out.println("engineering book details");
System.out.println("bookNo :"+engineeringBook.getBookNo());
System.out.println("book title :"+engineeringBook.getTitle());
System.out.println("book author :"+engineeringBook.getAuthor());
System.out.println("boo price :"+engineeringBook.getPrice());
System.out.println("book catagory :"+engineeringBook.getCatagory());
	}

}
