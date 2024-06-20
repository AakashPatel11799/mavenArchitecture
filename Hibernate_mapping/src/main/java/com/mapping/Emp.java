package com.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.criteria.Fetch;

@Entity
public class Emp {
 @Id
 private int eno;
 private String name;
 private int salary;
 
// @OneToOne(cascade = {CascadeType.ALL})
//@OneToOne(fetch=FetchType.EAGER)
 @OneToOne(fetch=FetchType.LAZY)
Laptop laptop;
 
 
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int eno, String name, int salary, Laptop laptop) {
	super();
	this.eno = eno;
	this.name = name;
	this.salary = salary;
	this.laptop = laptop;
}
@Override
public String toString() {
	return "Emp [eno=" + eno + ", name=" + name + ", salary=" + salary + ", laptop=" + laptop + "]";
}
public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
 

 
}
