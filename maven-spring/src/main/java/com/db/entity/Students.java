package com.db.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	
	@Id
	private int id;
	private String name;
	private String batch;
	private int marks;
	private String DOJ;
	
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", batch=" + batch + ", marks=" + marks + ", DOJ=" + DOJ + "]";
	}
	public Students() {
		
	}
	public Students(int id, String name, String batch, int marks, String dOJ) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
		this.marks = marks;
		DOJ = dOJ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	
	

}
