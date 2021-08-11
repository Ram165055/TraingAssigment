package com.assigment.one;

import java.util.Scanner;

class ChildThread extends Thread{
	int time;
	
	public ChildThread(int time) {
		super();
		this.time = time;
	}

	public void run() {
		for(int j=1;j<=time;j++) {
			System.out.println("$");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
}

public class Multithreading {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		int doller=scanner.nextInt();
		int star=scanner.nextInt();
		ChildThread childThread=new ChildThread(doller);
		childThread.start();
		for(int i=1;i<=star;i++) {
			System.out.println("*");
			Thread.sleep(1000);
		}
		
		
		

	}

}
