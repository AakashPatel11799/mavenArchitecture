package com.beans;

public class Student1 {
	
	private int id;
	private String name;
	//private Address1 address;
	public Student1(int id, String name) {
		super();
		System.out.println("constructor calling");
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}

