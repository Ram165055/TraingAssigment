package com.assigment.oops;
class Address{
	private String addressLine;
	private String city;
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressDetails() {
		String s1=getAddressLine();
		String s2=getCity();
		String s3=s1+", "+s2;
		return s3;
		
	}
}
class Customer{
	private String customerName;
	private Address residentialAddress;
	public Customer() {
		
	}
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerDetails() {
		Address a=getResidentialAddress();
String customerdetails="CustomerName :"+getCustomerName()+"\n"+"Residential Address :"+a.getAddressDetails();
	
		return customerdetails;
		
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		Address address=new Address("Ist Main HSR Layout","Banglore");
		Customer customer=new Customer();
		customer.setCustomerName("John");
		customer.setResidentialAddress(address);
		System.out.println("Customer :"+customer.getCustomerName());
		System.out.println("Residential Address :"+customer.getResidentialAddress().getAddressDetails());
		Customer customer2=new Customer("John", address);
		System.out.println(customer2.getCustomerDetails());

	}

}
