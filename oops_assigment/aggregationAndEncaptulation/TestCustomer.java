package com.assigment.oops.aggregationAndEncaptulation;

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
	private Address officialAddress;
	public Customer() {
		
	}
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	public Customer(String customerName, Address residentialAddress, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
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
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	public String getCustomerDetails() {
		Address a=getResidentialAddress();
		Address o=getOfficialAddress();
String customerdetails="CustomerName :"+getCustomerName()+"\n"+"Residential Address :"+a.getAddressDetails()+"\n"+"officialaddress :"+o.getAddressDetails();
	
		return customerdetails;
		
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		Address address=new Address("Ist Main HSR Layout","Banglore");
		Address address2=new Address("Ist Main Electronics city", "Banglore");
		Customer customer2=new Customer("John", address,address2);
		System.out.println(customer2.getCustomerDetails());

	}

}

