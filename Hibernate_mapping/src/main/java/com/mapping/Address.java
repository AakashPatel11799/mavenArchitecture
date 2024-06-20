package com.mapping;

public class Address {
	
	private int houseNo;
	private String stret;
	private String city;
	private String  state;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStret() {
		return stret;
	}
	public void setStret(String stret) {
		this.stret = stret;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", stret=" + stret + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}
