package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class StudentEntry {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"aman","interview",90);
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(s1);
		tr.commit();
		session.close();
		
		System.out.println("datav insert");
		
		

	}

}
