package com.beans;

public class Address1 {

	String houseNo;
	String street;
	String city;
	String state;
	
	public Address1(String houseNo, String street, String city, String state) {
		super();
		System.out.println("address constrctor");

		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address1 [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
}

