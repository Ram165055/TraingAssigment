package com.assigment.one;

import java.util.Scanner;

public class StackImplementation {
	int[] stack=new int[5];
	int top=-1;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StackImplementation stackImplementation=new StackImplementation();
		System.out.println("Element Pushed into stack");
		for(int i=0;i<5;i++) {
			int value=scanner.nextInt();
			stackImplementation.push(value);
		}
		System.out.println("Element Popped from stack");
for(int j=0;j<5;j++) {
	System.out.println("Item Popped is:"+stackImplementation.pop());
}
	}
	public  void push(int x) {
		stack[++top]=x;
	}
	public int pop() {
		
		return stack[top--];
	}

}
