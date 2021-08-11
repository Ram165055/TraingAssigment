package com.techment.compositionDemo;
class Customer{
	int custid;
	String custName;
	Account account;
	public Customer(int custid, String custName, Account account) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", accountNo=" + account.accountNo +",accountType="+account.accountType +",balance="+account.balance+",branch="+account.branch+",ifsc="+account.ifsc+"]";
	}
	
}
class Account{
	int accountNo;
	String accountType;
	int balance;
	String ifsc;
	String branch;
	public Account(int accountNo, String accountType, int balance, String ifsc, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
}

public class CustomerAccount {

	public static void main(String[] args) {
		
Account account=new Account(1111111111,"saving",1000,"uco123","Manpur");
Customer customer1=new Customer(101,"ram",account);
Customer customer2=new Customer(102,"rrr",account);
Customer customer3=new Customer(103,"mm",account);
System.out.println(customer1.toString());
System.out.println(customer2);
System.out.println(customer3.toString());
	}

}
