package com.techment.aug5.inheritance;

class SingleParent {
	private int salary = 50;

	public SingleParent(int salary) {

		this.salary = salary;
		salary = 200;
		System.out.println("parent salary:" + salary);
		System.out.println("perent salary this.salary:" + this.salary);

	}

	@Override
	public String toString() {
		return "SingleParent [salary=" + salary + "]";
	}

}

class SingleChild extends SingleParent {
	public SingleChild(int expenditure) {
		super(expenditure);
		System.out.println("expenditure:" + expenditure);

	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		SingleChild singleChild = new SingleChild(100);
		System.out.println(singleChild);
		System.out.println(singleChild.toString());

	}

}
