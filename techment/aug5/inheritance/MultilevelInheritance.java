package com.techment.aug5.inheritance;
class GrandParent{
	public GrandParent() {
		System.out.println("GrandParent");
	}
}
class Parent extends GrandParent{
	public Parent() {
		System.out.println("Parent");
		
	}
	
}

public class MultilevelInheritance extends Parent {
	public static void main(String[] args) {
		MultilevelInheritance multilevelInheritance=new MultilevelInheritance();
	}

}
