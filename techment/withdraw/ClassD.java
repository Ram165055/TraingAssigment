package com.techment.withdraw;
import com.techment.deposit.classA;

public class ClassD  extends classA{
public static void main(String[] args) {
	ClassD classD=new ClassD();//
	System.out.println(classD.c);//protected can be access in inherited class
	System.out.println(classD.d);//public access any where
}
}
