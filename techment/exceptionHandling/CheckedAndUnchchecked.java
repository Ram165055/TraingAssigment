package com.techment.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedAndUnchchecked {

	public static void main(String[] args) throws FileNotFoundException {
//		throw new ArithmeticException("some thing went wrong");//constructor//runtime
//		try {
//			throw new FileNotFoundException("file not found");//copiler check this is compile time
//		}
//		catch(FileNotFoundException e) {
//			System.out.println("some thing wrong");
//		}//this is not a proper ways;
		throw new FileNotFoundException("file not found");//copiler check this is compile time
   
	}

}
