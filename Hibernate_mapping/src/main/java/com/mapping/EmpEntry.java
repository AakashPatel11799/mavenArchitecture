package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class EmpEntry {

	public static void main(String[] args) {
		
		Emp e1= new Emp(107,"rahul",15000,new Laptop("L7","Lenevo",65000));
		Emp e2= new Emp(108,"geeta",12000,new Laptop("L8","HP",70000));
		Emp e3= new Emp(109,"milan",20000,new Laptop("L9","Asus",35000));
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();
		session.close();

		System.out.println("data saved");

	}

}
