package com.mapping;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Emp e1=session.get(Emp.class,101);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		Laptop l=e1.getLaptop();
		System.out.println(l.getBrand());
		System.out.println(l.getPrice());

		session.close();
	}

}