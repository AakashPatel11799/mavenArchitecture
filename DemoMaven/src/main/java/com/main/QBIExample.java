package com.main;


import org.hibernate.Session;

public class QBIExample {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		
		Students stud=session.get(Students.class,108);
		
		//System.out.println(stud);
		
		session.close();
		
		String name=stud.getName();
		System.out.println(name);
	}

}
