package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int rno;
	private String name ;
	private String batch;
	private int marks;
	
	
	
	public Student() {
		
	}
	public Student(int rno, String name, String batch, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.batch = batch;
		this.marks = marks;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
