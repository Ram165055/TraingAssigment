package com.techment.exceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println("hello");
		int arr[]=new int[5];
		try 
		{
			System.out.println(1/0);
			arr[7]=24;
			//when exception occur remaing statment not excute
			System.out.println(8/2);
		}
		//if exception not occur then catch not excute
		catch(ArithmeticException e)
		{
			System.out.println("dont give zero");
			
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("array size is 5 from 0 to 4");
		}
		catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("welcome");

	}

}
