package com.techment.objectclassPractice;

public class Customer {
	int id;
	String name;
	int contact;
	int minBalance;
	public Customer(int id,String name,int contact,int minBalance) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.minBalance=minBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer(1, "Ram Kumar", 763095650, 0);
		Customer customer2=new Customer(2, "Shyam Kumar", 1234567890, 1000);
		Customer customer3=new Customer(3, "Rahul Kumar",1123465432, 10000);
		customer1.showDetail();
		customer1.checkAccount();
		customer2.showDetail();
		customer2.checkAccount();
		customer3.showDetail();
		customer3.checkAccount();

	}
	public void showDetail() {
		System.out.println("Customer id:"+id+", Name:"+name+", contact no."+contact+", minBalance:"+minBalance);
	}
	public void checkAccount() {
		if(minBalance==0) {
			System.out.println("Zero balance account");
		}
		if(minBalance==1000) {
			System.out.println("saving account");
		}
		if(minBalance==10000) {
			System.out.println("Current Account");
		}
	}
}
