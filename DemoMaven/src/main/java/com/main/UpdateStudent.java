package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateStudent {

	   //how to update existing data update on database table
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Session session=Utility.getSessionFactory().openSession();
		Students stud=session.get(Students.class,110);
		Transaction tr=session.beginTransaction();
		System.out.println(stud);
		stud.setMarks(100);
		
		session.update(stud);
		tr.commit();
		System.out.println(stud);
		System.out.println("data update");
		session.close();
		
		}

}
