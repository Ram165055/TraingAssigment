package com.techment.aug5.inheritance;
class HierarchicalParent{
	public HierarchicalParent() {
		System.out.println("HierarchicalParent");
	}
}
class HierarchicalChild1 extends HierarchicalParent{
	public HierarchicalChild1() {
		System.out.println("HierarchicalChild1");
	}
}

public class HierarchicalInheritance extends HierarchicalParent{
public HierarchicalInheritance() {
	System.out.println("HierarchicalInheritance");
}
public static void main(String[] args) {
	HierarchicalInheritance hierarchicalInheritance=new HierarchicalInheritance();
	HierarchicalChild1 hierarchicalChild1=new HierarchicalChild1();
}
}
