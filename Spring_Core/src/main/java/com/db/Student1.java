package com.db;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student1 {

	private int id;
	private String name;
	private Address address;
//	private List<String> email;
	//private Set<String> email;
	private Map <String ,String> mobileNo;
	
	
	
//	public Set<String> getEmail() {
//		return email;
//	}
//	public void setEmail(Set<String> email) {
//		this.email = email;
//	}
//	@Override
//	public String toString() {
//		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
//	}
	
	public Map<String, String> getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Map<String, String> mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getId() {
		return id;
	}
//	@Override
//	public String toString() {
//		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
//	public List<String> getEmail() {
//		return email;
//	}
//	public void setEmail(List<String> email) {
//		this.email = email;
//	}
//	@Override
//	public String toString() {
//		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
//	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
}
