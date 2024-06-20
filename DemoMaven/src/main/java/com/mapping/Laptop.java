package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
@Id
private String lcode;
private String brand;
private int price;


public Laptop(String lcode, String brand, int price) {
	super();
	this.lcode = lcode;
	this.brand = brand;
	this.price = price;
}


public Laptop() {
	
}








	
}
