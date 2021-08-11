package com.techment.customexception;

public class Account {
	int balance=5000;
String withdraw(int amount) {
	if(amount>balance) {
		throw new InsufficianFundException("insufficiante funds");
	}
	else {
//		System.out.println("withdraw successfully");
		return "you have withdraw"+amount+"amount";
	}
}
}
