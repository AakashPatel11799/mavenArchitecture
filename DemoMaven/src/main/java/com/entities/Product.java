package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class Product {
	
	@Id
	private int pid;
	private String pname;
	private float price;
	private String comapny;
	
	
	public Product() {
		
	}
	public Product(int pid, String pname, float price, String comapny) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.comapny = comapny;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getComapny() {
		return comapny;
	}
	public void setComapny(String comapny) {
		this.comapny = comapny;
	}
	
	

}
