package com.main;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteMethod {

	public static void main(String[] args) {
		
		 Session session=Utility.getSessionFactory().openSession();
		 Students stud=session.get(Students.class,101);
		 
		 //Students stud=new Students(0;
		 //stud,setid(103);
		 Transaction tr=session.beginTransaction();
		 session.delete(stud);
		 tr.commit();
		
		 System.out.println("data deleted");
		 session.close();
		 
	}

}
