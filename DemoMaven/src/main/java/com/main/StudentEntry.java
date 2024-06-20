package com.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Product;

public class StudentEntry {

	public static void main(String[] args) 	{
		


		Students s1=new Students(101,"aman","collection",97,"18-05-24");
		Students s2=new Students(102,"aman","collection",97,"11-05-24");
		Students s3=new Students(103,"rajshree","collection",66,"15-05-24");
		Students s4=new Students(104,"avinash","collection",44,"16-05-24");
		
		//Product p1=new Product(102,"printed jeans",1170,"Amazon");
		
		
		Configuration config = new Configuration().configure();
		SessionFactory sf= config.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
	
	    tr.commit();
		session.close();

	}

}